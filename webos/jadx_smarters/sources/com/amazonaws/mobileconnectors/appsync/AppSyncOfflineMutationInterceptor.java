package com.amazonaws.mobileconnectors.appsync;

import B1.e;
import D1.a;
import D1.b;
import K1.d;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import v1.InterfaceC2867e;
import v1.InterfaceC2868f;

/* JADX INFO: loaded from: classes.dex */
class AppSyncOfflineMutationInterceptor implements a {
    private static final long QUEUE_POLL_INTERVAL = 10000;
    private static final String TAG = "AppSyncOfflineMutationInterceptor";
    AWSAppSyncClient appSyncClient;
    final AppSyncOfflineMutationManager appSyncOfflineMutationManager;
    Map<String, a.InterfaceC0015a> callbackMapForInMemoryMutations;
    ConflictResolutionHandler conflictResolutionHandler;
    private final ConflictResolverInterface conflictResolver;
    private Map<InterfaceC2867e, MutationInformation> mutationsToRetryAfterConflictResolution;
    Map<String, PersistentOfflineMutationObject> persistentOfflineMutationObjectMap;
    private QueueUpdateHandler queueHandler;
    private HandlerThread queueHandlerThread;
    final d scalarTypeAdapters = new d(new LinkedHashMap());
    final boolean sendOperationIdentifiers;

    public class QueueUpdateHandler extends Handler {
        private final long CANCEL_WINDOW;
        private final String TAG;
        private InMemoryOfflineMutationObject inMemoryOfflineMutationObjectBeingExecuted;
        private long maxMutationExecutionTime;
        private boolean mutationInProgress;
        private PersistentOfflineMutationObject persistentOfflineMutationObjectBeingExecuted;
        private long startTime;

        public QueueUpdateHandler(Looper looper) {
            super(looper);
            this.TAG = QueueUpdateHandler.class.getSimpleName();
            this.mutationInProgress = false;
            this.CANCEL_WINDOW = 15000L;
            this.inMemoryOfflineMutationObjectBeingExecuted = null;
            this.persistentOfflineMutationObjectBeingExecuted = null;
            this.startTime = 0L;
        }

        private void checkAndHandleStuckMutation() {
            if (this.inMemoryOfflineMutationObjectBeingExecuted == null && this.persistentOfflineMutationObjectBeingExecuted == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.startTime;
            PersistentOfflineMutationObject persistentOfflineMutationObject = this.persistentOfflineMutationObjectBeingExecuted;
            if (persistentOfflineMutationObject != null) {
                long j9 = this.maxMutationExecutionTime;
                if (jCurrentTimeMillis > 15000 + j9) {
                    AppSyncOfflineMutationInterceptor.this.appSyncOfflineMutationManager.setInProgressMutationAsCompleted(persistentOfflineMutationObject.recordIdentifier);
                    sendEmptyMessage(500);
                    return;
                } else {
                    if (jCurrentTimeMillis > j9) {
                        AppSyncOfflineMutationInterceptor.this.appSyncOfflineMutationManager.persistentOfflineMutationManager.addTimedoutMutation(persistentOfflineMutationObject);
                        AppSyncOfflineMutationInterceptor.this.appSyncOfflineMutationManager.persistentOfflineMutationManager.removePersistentMutationObject(this.persistentOfflineMutationObjectBeingExecuted.recordIdentifier);
                        return;
                    }
                    return;
                }
            }
            InMemoryOfflineMutationObject inMemoryOfflineMutationObject = this.inMemoryOfflineMutationObjectBeingExecuted;
            if (inMemoryOfflineMutationObject != null) {
                long j10 = this.maxMutationExecutionTime;
                if (jCurrentTimeMillis > 15000 + j10) {
                    AppSyncOfflineMutationInterceptor.this.appSyncOfflineMutationManager.setInProgressMutationAsCompleted(inMemoryOfflineMutationObject.recordIdentifier);
                    sendEmptyMessage(500);
                } else if (jCurrentTimeMillis > j10) {
                    inMemoryOfflineMutationObject.chain.dispose();
                    AppSyncOfflineMutationInterceptor.this.dispose((InterfaceC2867e) this.inMemoryOfflineMutationObjectBeingExecuted.request.f1314b);
                }
            }
        }

        public void clearInMemoryOfflineMutationObjectBeingExecuted() {
            this.inMemoryOfflineMutationObjectBeingExecuted = null;
            this.startTime = 0L;
        }

        public void clearPersistentOfflineMutationObjectBeingExecuted() {
            this.persistentOfflineMutationObjectBeingExecuted = null;
            this.startTime = 0L;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Log.v(this.TAG, "Thread:[" + Thread.currentThread().getId() + "]: Got message to take action on the mutation queue.");
            int i9 = message.what;
            if (i9 == 400 || i9 == 500) {
                if (!isMutationInProgress()) {
                    Log.v(this.TAG, "Thread:[" + Thread.currentThread().getId() + "]: Got message to process next mutation if one exists.");
                    AppSyncOfflineMutationInterceptor.this.appSyncOfflineMutationManager.processNextInQueueMutation();
                }
            } else if (i9 == 600) {
                Log.d(this.TAG, "Thread:[" + Thread.currentThread().getId() + "]: Got message that a originalMutation process needs to be retried.");
                MutationInterceptorMessage mutationInterceptorMessage = (MutationInterceptorMessage) message.obj;
                try {
                    if (AppSyncOfflineMutationInterceptor.this.conflictResolver != null) {
                        AppSyncOfflineMutationInterceptor.this.conflictResolver.resolveConflict(AppSyncOfflineMutationInterceptor.this.conflictResolutionHandler, new JSONObject(mutationInterceptorMessage.serverState), new JSONObject(mutationInterceptorMessage.clientState), mutationInterceptorMessage.requestIdentifier, mutationInterceptorMessage.requestClassName);
                    } else {
                        AppSyncOfflineMutationInterceptor.this.failConflictMutation(mutationInterceptorMessage.requestIdentifier);
                    }
                } catch (Exception e9) {
                    Log.v(this.TAG, "Thread:[" + Thread.currentThread().getId() + "]: " + e9.toString());
                    e9.printStackTrace();
                }
            } else {
                Log.d(this.TAG, "Unknown message received in QueueUpdateHandler. Ignoring");
            }
            checkAndHandleStuckMutation();
        }

        public synchronized boolean isMutationInProgress() {
            return this.mutationInProgress;
        }

        public void setInMemoryOfflineMutationObjectBeingExecuted(InMemoryOfflineMutationObject inMemoryOfflineMutationObject) {
            this.inMemoryOfflineMutationObjectBeingExecuted = inMemoryOfflineMutationObject;
            this.startTime = System.currentTimeMillis();
        }

        public void setMaximumMutationExecutionTime(long j9) {
            this.maxMutationExecutionTime = j9;
        }

        public synchronized boolean setMutationInProgress() {
            if (this.mutationInProgress) {
                return false;
            }
            Log.v(this.TAG, "Thread:[" + Thread.currentThread().getId() + "]: Setting mutationInProgress as true.");
            this.mutationInProgress = true;
            return true;
        }

        public synchronized void setMutationInProgressStatusToFalse() {
            Log.v(this.TAG, "Thread:[" + Thread.currentThread().getId() + "]: Setting mutationInProgress as false.");
            this.mutationInProgress = false;
        }

        public void setPersistentOfflineMutationObjectBeingExecuted(PersistentOfflineMutationObject persistentOfflineMutationObject) {
            this.persistentOfflineMutationObjectBeingExecuted = persistentOfflineMutationObject;
            this.startTime = System.currentTimeMillis();
        }
    }

    public AppSyncOfflineMutationInterceptor(AppSyncOfflineMutationManager appSyncOfflineMutationManager, boolean z9, Context context, Map<InterfaceC2867e, MutationInformation> map, AWSAppSyncClient aWSAppSyncClient, ConflictResolverInterface conflictResolverInterface, long j9) {
        this.sendOperationIdentifiers = z9;
        this.appSyncOfflineMutationManager = appSyncOfflineMutationManager;
        this.appSyncClient = aWSAppSyncClient;
        this.mutationsToRetryAfterConflictResolution = map;
        HandlerThread handlerThread = new HandlerThread("AWSAppSyncMutationQueueThread");
        this.queueHandlerThread = handlerThread;
        handlerThread.start();
        QueueUpdateHandler queueUpdateHandler = new QueueUpdateHandler(this.queueHandlerThread.getLooper());
        this.queueHandler = queueUpdateHandler;
        queueUpdateHandler.setMaximumMutationExecutionTime(j9);
        this.queueHandler.postDelayed(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncOfflineMutationInterceptor.1
            @Override // java.lang.Runnable
            public void run() {
                Log.v(AppSyncOfflineMutationInterceptor.TAG, "Thread:[" + Thread.currentThread().getId() + "]: processing Mutations");
                Message message = new Message();
                message.obj = new MutationInterceptorMessage();
                message.what = 400;
                AppSyncOfflineMutationInterceptor.this.queueHandler.sendMessage(message);
                AppSyncOfflineMutationInterceptor.this.queueHandler.postDelayed(this, AppSyncOfflineMutationInterceptor.QUEUE_POLL_INTERVAL);
            }
        }, QUEUE_POLL_INTERVAL);
        appSyncOfflineMutationManager.updateQueueHandler(this.queueHandler);
        this.callbackMapForInMemoryMutations = new HashMap();
        this.persistentOfflineMutationObjectMap = appSyncOfflineMutationManager.persistentOfflineMutationManager.persistentOfflineMutationObjectMap;
        this.conflictResolutionHandler = new ConflictResolutionHandler(this);
        this.conflictResolver = conflictResolverInterface;
    }

    @Override // D1.a
    public void dispose() {
        Log.v(TAG, "Dispose called");
    }

    public void dispose(InterfaceC2867e interfaceC2867e) {
        Log.v(TAG, "Thread:[" + Thread.currentThread().getId() + "]: Dispose called for mutation [" + interfaceC2867e + "].");
        this.appSyncOfflineMutationManager.handleMutationCancellation(interfaceC2867e);
    }

    public void failConflictMutation(String str) {
        ConflictResolutionFailedException conflictResolutionFailedException = new ConflictResolutionFailedException("Mutation [" + str + "] failed due to conflict");
        a.InterfaceC0015a interfaceC0015a = this.callbackMapForInMemoryMutations.get(str);
        if (interfaceC0015a != null) {
            interfaceC0015a.onFailure(conflictResolutionFailedException);
            this.callbackMapForInMemoryMutations.remove(str);
        } else {
            PersistentMutationsCallback persistentMutationsCallback = this.appSyncOfflineMutationManager.persistentOfflineMutationManager.networkInvoker.persistentMutationsCallback;
            if (persistentMutationsCallback != null) {
                persistentMutationsCallback.onFailure(new PersistentMutationsError(this.queueHandler.persistentOfflineMutationObjectBeingExecuted.getClass().getSimpleName(), str, conflictResolutionFailedException));
            }
        }
        this.mutationsToRetryAfterConflictResolution.remove(str);
        if (this.queueHandler.persistentOfflineMutationObjectBeingExecuted != null) {
            this.appSyncOfflineMutationManager.setInProgressPersistentMutationAsCompleted(str);
        } else {
            this.appSyncOfflineMutationManager.setInProgressMutationAsCompleted(str);
        }
        this.queueHandler.clearPersistentOfflineMutationObjectBeingExecuted();
        this.queueHandler.clearInMemoryOfflineMutationObjectBeingExecuted();
        this.queueHandler.sendEmptyMessage(500);
    }

    @Override // D1.a
    public void interceptAsync(final a.c cVar, b bVar, Executor executor, final a.InterfaceC0015a interfaceC0015a) {
        if (!(cVar.f1314b instanceof InterfaceC2867e)) {
            bVar.a(cVar, executor, interfaceC0015a);
            return;
        }
        String str = TAG;
        Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]: Processing mutation.");
        Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]: First, checking if it is a retry of mutation that encountered a conflict.");
        if (!this.mutationsToRetryAfterConflictResolution.containsKey(cVar.f1314b)) {
            Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]:Nope, hasn't encountered  conflict");
            QueueUpdateHandler queueUpdateHandler = this.queueHandler;
            InterfaceC2868f interfaceC2868f = cVar.f1314b;
            InterceptorCallback interceptorCallback = new InterceptorCallback(interfaceC0015a, queueUpdateHandler, (InterfaceC2867e) interfaceC2868f, (InterfaceC2867e) interfaceC2868f, this.appSyncOfflineMutationManager.getClientStateFromMutation((InterfaceC2867e) interfaceC2868f), cVar.f1313a.toString(), this.appSyncOfflineMutationManager);
            try {
                this.callbackMapForInMemoryMutations.put(cVar.f1313a.toString(), interceptorCallback);
                this.appSyncOfflineMutationManager.addMutationObjectInQueue(new InMemoryOfflineMutationObject(cVar.f1313a.toString(), cVar, bVar, executor, interceptorCallback));
                return;
            } catch (Exception e9) {
                Log.e(TAG, "ERROR: " + e9);
                e9.printStackTrace();
                return;
            }
        }
        Log.d(str, "Thread:[" + Thread.currentThread().getId() + "]: Yes, this is a mutation that gone through conflict resolution. Executing it.");
        this.mutationsToRetryAfterConflictResolution.remove(cVar.f1314b);
        Log.v(str, "Looking up originalCallback using key[" + cVar.f1314b.toString() + "]");
        InterceptorCallback interceptorCallback2 = (InterceptorCallback) this.callbackMapForInMemoryMutations.get(cVar.f1314b.toString());
        if (interceptorCallback2 != null) {
            Log.v(str, "callback found. Proceeding to execute inMemory offline mutation");
            bVar.a(cVar, executor, interceptorCallback2);
            return;
        }
        final PersistentMutationsCallback persistentMutationsCallback = this.appSyncOfflineMutationManager.persistentOfflineMutationManager.networkInvoker.persistentMutationsCallback;
        final PersistentOfflineMutationObject persistentOfflineMutationObject = this.persistentOfflineMutationObjectMap.get(cVar.f1314b.toString());
        Log.d(str, "Thread:[" + Thread.currentThread().getId() + "]: Fetched object: " + persistentOfflineMutationObject);
        bVar.a(cVar, executor, new a.InterfaceC0015a() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncOfflineMutationInterceptor.2
            @Override // D1.a.InterfaceC0015a
            public void onCompleted() {
            }

            @Override // D1.a.InterfaceC0015a
            public void onFailure(B1.b bVar2) {
                interfaceC0015a.onFailure(bVar2);
                PersistentMutationsCallback persistentMutationsCallback2 = persistentMutationsCallback;
                if (persistentMutationsCallback2 != null) {
                    persistentMutationsCallback2.onFailure(new PersistentMutationsError(cVar.f1314b.getClass().getSimpleName(), persistentOfflineMutationObject.recordIdentifier, bVar2));
                }
                AppSyncOfflineMutationInterceptor.this.appSyncOfflineMutationManager.setInProgressPersistentMutationAsCompleted(persistentOfflineMutationObject.recordIdentifier);
                AppSyncOfflineMutationInterceptor.this.queueHandler.clearPersistentOfflineMutationObjectBeingExecuted();
                AppSyncOfflineMutationInterceptor.this.queueHandler.clearInMemoryOfflineMutationObjectBeingExecuted();
                AppSyncOfflineMutationInterceptor.this.queueHandler.sendEmptyMessage(500);
            }

            @Override // D1.a.InterfaceC0015a
            public void onFetch(a.b bVar2) {
                interfaceC0015a.onFetch(bVar2);
            }

            @Override // D1.a.InterfaceC0015a
            public void onResponse(a.d dVar) {
                interfaceC0015a.onResponse(dVar);
                if (persistentMutationsCallback != null) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) dVar.f1325d.e());
                        persistentMutationsCallback.onResponse(new PersistentMutationsResponse(jSONObject.getJSONObject("data"), jSONObject.getJSONArray("errors"), cVar.f1314b.getClass().getSimpleName(), persistentOfflineMutationObject.recordIdentifier));
                    } catch (Exception e10) {
                        persistentMutationsCallback.onFailure(new PersistentMutationsError(cVar.f1314b.getClass().getSimpleName(), persistentOfflineMutationObject.recordIdentifier, new e(e10.getLocalizedMessage())));
                    }
                }
                AppSyncOfflineMutationInterceptor.this.appSyncOfflineMutationManager.setInProgressPersistentMutationAsCompleted(persistentOfflineMutationObject.recordIdentifier);
                AppSyncOfflineMutationInterceptor.this.queueHandler.clearInMemoryOfflineMutationObjectBeingExecuted();
                AppSyncOfflineMutationInterceptor.this.queueHandler.clearPersistentOfflineMutationObjectBeingExecuted();
                AppSyncOfflineMutationInterceptor.this.queueHandler.sendEmptyMessage(400);
            }
        });
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> void retryConflictMutation(InterfaceC2867e interfaceC2867e, String str) {
        InterceptorCallback interceptorCallback = (InterceptorCallback) this.callbackMapForInMemoryMutations.remove(str);
        if (interceptorCallback != null) {
            Log.d(TAG, "Proceeding with retry for inMemory offline mutation [" + str + "]");
            this.callbackMapForInMemoryMutations.put(interfaceC2867e.toString(), interceptorCallback);
        } else {
            String str2 = TAG;
            Log.d(str2, "Proceeding with retry for persistent offline mutation [" + str + "]");
            if (this.persistentOfflineMutationObjectMap.isEmpty()) {
                Log.d(str2, "Populating mutations map.");
                this.persistentOfflineMutationObjectMap.putAll(this.appSyncOfflineMutationManager.persistentOfflineMutationManager.persistentOfflineMutationObjectMap);
            }
            this.persistentOfflineMutationObjectMap.put(interfaceC2867e.toString(), this.persistentOfflineMutationObjectMap.remove(str));
        }
        this.appSyncClient.mutate(interfaceC2867e, true).enqueue(null);
    }
}
