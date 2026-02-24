package com.amazonaws.mobileconnectors.appsync;

import D1.a;
import J1.h;
import K1.d;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.amazonaws.mobileconnectors.appsync.AppSyncOfflineMutationInterceptor;
import com.amazonaws.mobileconnectors.appsync.ConnectivityWatcher;
import java.io.IOException;
import java.util.Map;
import okio.Buffer;
import org.json.JSONException;
import org.json.JSONObject;
import u1.InterfaceC2843b;
import v1.InterfaceC2867e;
import v1.InterfaceC2868f;
import v1.p;
import v1.s;

/* JADX INFO: loaded from: classes.dex */
class AppSyncOfflineMutationManager {
    static final int MSG_CHECK = 200;
    static final int MSG_DISCONNECT = 300;
    static final int MSG_EXEC = 100;
    private static final String TAG = "AppSyncOfflineMutationManager";
    private ConnectivityWatcher connectivityWatcher;
    private Context context;
    private HandlerThread handlerThread;
    InMemoryOfflineMutationManager inMemoryOfflineMutationManager;
    private AppSyncMutationSqlCacheOperations mutationSqlCacheOperations;
    private NetworkUpdateHandler networkUpdateHandler;
    PersistentOfflineMutationManager persistentOfflineMutationManager;
    private AppSyncOfflineMutationInterceptor.QueueUpdateHandler queueHandler;
    private d scalarTypeAdapters;
    private boolean shouldProcessMutations;
    private final Object shouldProcessMutationsLock = new Object();
    private InMemoryOfflineMutationObject currentMutation = null;

    public static class NetworkInfoReceiver implements ConnectivityWatcher.Callback {
        private final Handler handler;

        public NetworkInfoReceiver(Handler handler) {
            this.handler = handler;
        }

        @Override // com.amazonaws.mobileconnectors.appsync.ConnectivityWatcher.Callback
        public void onConnectivityChanged(boolean z9) {
            this.handler.sendEmptyMessage(z9 ? 200 : 300);
        }
    }

    public class NetworkUpdateHandler extends Handler {
        public NetworkUpdateHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 != 200) {
                if (i9 == 300) {
                    Log.d(AppSyncOfflineMutationManager.TAG, "Thread:[" + Thread.currentThread().getId() + "]: Internet DISCONNECTED.");
                    synchronized (AppSyncOfflineMutationManager.this.shouldProcessMutationsLock) {
                        AppSyncOfflineMutationManager.this.shouldProcessMutations = false;
                    }
                    AWSAppSyncDeltaSync.handleNetworkDownEvent();
                    return;
                }
                return;
            }
            Log.d(AppSyncOfflineMutationManager.TAG, "Thread:[" + Thread.currentThread().getId() + "]: Internet CONNECTED.");
            synchronized (AppSyncOfflineMutationManager.this.shouldProcessMutationsLock) {
                AppSyncOfflineMutationManager.this.shouldProcessMutations = true;
            }
            if (AppSyncOfflineMutationManager.this.queueHandler != null) {
                Message message2 = new Message();
                message2.obj = new MutationInterceptorMessage();
                message2.what = 400;
                AppSyncOfflineMutationManager.this.queueHandler.sendMessage(message2);
            }
            AWSAppSyncDeltaSync.handleNetworkUpEvent();
        }
    }

    public AppSyncOfflineMutationManager(Context context, Map<s, InterfaceC2843b> map, AppSyncMutationSqlCacheOperations appSyncMutationSqlCacheOperations, AppSyncCustomNetworkInvoker appSyncCustomNetworkInvoker) {
        this.context = context;
        HandlerThread handlerThread = new HandlerThread(TAG + "-AWSAppSyncOfflineMutationsHandlerThread");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.inMemoryOfflineMutationManager = new InMemoryOfflineMutationManager();
        this.persistentOfflineMutationManager = new PersistentOfflineMutationManager(appSyncMutationSqlCacheOperations, appSyncCustomNetworkInvoker);
        NetworkUpdateHandler networkUpdateHandler = new NetworkUpdateHandler(this.handlerThread.getLooper());
        this.networkUpdateHandler = networkUpdateHandler;
        ConnectivityWatcher connectivityWatcher = this.connectivityWatcher;
        if (connectivityWatcher == null) {
            this.connectivityWatcher = new ConnectivityWatcher(context, new NetworkInfoReceiver(networkUpdateHandler));
        } else {
            connectivityWatcher.unregister();
        }
        this.connectivityWatcher.register();
        this.scalarTypeAdapters = new d(map);
        this.mutationSqlCacheOperations = appSyncMutationSqlCacheOperations;
    }

    private String httpRequestBody(InterfaceC2868f interfaceC2868f) throws IOException {
        Buffer buffer = new Buffer();
        h hVarI = h.i(buffer);
        hVarI.c();
        hVarI.g("query").p(interfaceC2868f.queryDocument().replaceAll("\\n", ""));
        hVarI.g("variables").c();
        interfaceC2868f.variables().marshaller().marshal(new J1.d(hVarI, this.scalarTypeAdapters));
        hVarI.e();
        hVarI.e();
        hVarI.close();
        return buffer.readUtf8();
    }

    public void addMutationObjectInQueue(InMemoryOfflineMutationObject inMemoryOfflineMutationObject) throws IOException {
        this.inMemoryOfflineMutationManager.addMutationObjectInQueue(inMemoryOfflineMutationObject);
        String str = TAG;
        Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]:  Added mutation[" + inMemoryOfflineMutationObject.recordIdentifier + "] to inMemory Queue");
        p s3ComplexObject = S3ObjectManagerImplementation.getS3ComplexObject(inMemoryOfflineMutationObject.request.f1314b.variables().valueMap());
        if (s3ComplexObject == null) {
            this.persistentOfflineMutationManager.addPersistentMutationObject(new PersistentOfflineMutationObject(inMemoryOfflineMutationObject.recordIdentifier, httpRequestBody(inMemoryOfflineMutationObject.request.f1314b), inMemoryOfflineMutationObject.request.f1314b.getClass().getSimpleName(), getClientStateFromMutation((InterfaceC2867e) inMemoryOfflineMutationObject.request.f1314b)));
            Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]: Added mutation[" + inMemoryOfflineMutationObject.recordIdentifier + "] to Persistent Queue. No S3 Objects found");
        } else {
            this.persistentOfflineMutationManager.addPersistentMutationObject(new PersistentOfflineMutationObject(inMemoryOfflineMutationObject.recordIdentifier, httpRequestBody(inMemoryOfflineMutationObject.request.f1314b), inMemoryOfflineMutationObject.request.f1314b.getClass().getSimpleName(), getClientStateFromMutation((InterfaceC2867e) inMemoryOfflineMutationObject.request.f1314b), s3ComplexObject.bucket(), s3ComplexObject.key(), s3ComplexObject.region(), s3ComplexObject.localUri(), s3ComplexObject.mimeType()));
            Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]: Added mutation[" + inMemoryOfflineMutationObject.recordIdentifier + "] to Persistent Queue. S3 Object found");
        }
        Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]: Created both in-memory and persistent records. Now going to signal queue handler.");
        Message message = new Message();
        message.obj = new MutationInterceptorMessage();
        message.what = 400;
        this.queueHandler.sendMessage(message);
    }

    public void clearMutationQueue() {
        this.inMemoryOfflineMutationManager.clearMutationQueue();
        this.persistentOfflineMutationManager.clearMutationQueue();
    }

    public String getClientStateFromMutation(InterfaceC2867e interfaceC2867e) {
        String str;
        StringBuilder sb;
        try {
            return new JSONObject(httpRequestBody(interfaceC2867e)).getJSONObject("variables").toString();
        } catch (IOException e9) {
            e = e9;
            str = TAG;
            sb = new StringBuilder();
            sb.append("IOException while getting clientState from Mutation: [");
            sb.append(e);
            sb.append("]");
            Log.v(str, sb.toString());
            return "";
        } catch (JSONException e10) {
            e = e10;
            str = TAG;
            sb = new StringBuilder();
            sb.append("IOException while getting clientState from Mutation: [");
            sb.append(e);
            sb.append("]");
            Log.v(str, sb.toString());
            return "";
        }
    }

    public void handleMutationCancellation(InterfaceC2867e interfaceC2867e) {
        a.c cVar;
        String str = TAG;
        Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]: Handling cancellation for mutation [" + interfaceC2867e + "]");
        InMemoryOfflineMutationObject inMemoryOfflineMutationObject = this.currentMutation;
        if (inMemoryOfflineMutationObject != null && (cVar = inMemoryOfflineMutationObject.request) != null && interfaceC2867e.equals(cVar.f1314b)) {
            Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]: Mutation being canceled is the one currently in progress. Handling it ");
            setInProgressMutationAsCompleted(this.currentMutation.recordIdentifier);
            this.queueHandler.sendEmptyMessage(500);
            return;
        }
        Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]: Lodging mutation in cancelled mutations list ");
        this.inMemoryOfflineMutationManager.addCancelledMutation(interfaceC2867e);
        InMemoryOfflineMutationObject mutationObject = this.inMemoryOfflineMutationManager.getMutationObject(interfaceC2867e);
        if (mutationObject != null) {
            this.persistentOfflineMutationManager.removePersistentMutationObject(mutationObject.recordIdentifier);
        }
    }

    public boolean mutationQueueEmpty() {
        return this.persistentOfflineMutationManager.isQueueEmpty() && this.inMemoryOfflineMutationManager.isQueueEmpty();
    }

    public void processNextInQueueMutation() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            Log.v(TAG, "Thread:[" + Thread.currentThread().getId() + "]: Internet wasn't available. Exiting");
            return;
        }
        if (!this.persistentOfflineMutationManager.isQueueEmpty()) {
            if (this.queueHandler.setMutationInProgress()) {
                Log.d(TAG, "Thread:[" + Thread.currentThread().getId() + "]: Processing next from persistent queue");
                PersistentOfflineMutationObject persistentOfflineMutationObjectProcessNextMutationObject = this.persistentOfflineMutationManager.processNextMutationObject();
                if (persistentOfflineMutationObjectProcessNextMutationObject != null) {
                    this.queueHandler.setPersistentOfflineMutationObjectBeingExecuted(persistentOfflineMutationObjectProcessNextMutationObject);
                    return;
                }
                return;
            }
            return;
        }
        String str = TAG;
        Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]:Persistent mutations queue is EMPTY!. Will check inMemory Queue next");
        if (this.inMemoryOfflineMutationManager.isQueueEmpty()) {
            Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]: In Memory mutations queue was EMPTY!. Nothing to process, exiting");
            return;
        }
        if (this.queueHandler.setMutationInProgress()) {
            Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]: Processing next from in Memory queue");
            InMemoryOfflineMutationObject inMemoryOfflineMutationObjectProcessNextMutation = this.inMemoryOfflineMutationManager.processNextMutation();
            this.currentMutation = inMemoryOfflineMutationObjectProcessNextMutation;
            if (inMemoryOfflineMutationObjectProcessNextMutation == null) {
                return;
            }
            this.queueHandler.setInMemoryOfflineMutationObjectBeingExecuted(inMemoryOfflineMutationObjectProcessNextMutation);
            if (this.inMemoryOfflineMutationManager.getCancelledMutations().contains((InterfaceC2867e) this.currentMutation.request.f1314b)) {
                Log.v(str, "Thread:[" + Thread.currentThread().getId() + "]: Handling cancellation for mutation [" + this.currentMutation.recordIdentifier + "] ");
                setInProgressMutationAsCompleted(this.currentMutation.recordIdentifier);
                this.inMemoryOfflineMutationManager.removeCancelledMutation((InterfaceC2867e) this.currentMutation.request.f1314b);
                this.queueHandler.sendEmptyMessage(500);
            }
        }
    }

    public void setInProgressMutationAsCompleted(String str) {
        this.persistentOfflineMutationManager.removePersistentMutationObject(str);
        this.inMemoryOfflineMutationManager.removeFromQueue(str);
        this.queueHandler.setMutationInProgressStatusToFalse();
        this.queueHandler.clearInMemoryOfflineMutationObjectBeingExecuted();
        this.queueHandler.clearPersistentOfflineMutationObjectBeingExecuted();
    }

    public void setInProgressPersistentMutationAsCompleted(String str) {
        this.persistentOfflineMutationManager.removePersistentMutationObject(str);
        this.queueHandler.setMutationInProgressStatusToFalse();
        this.queueHandler.clearInMemoryOfflineMutationObjectBeingExecuted();
        this.queueHandler.clearPersistentOfflineMutationObjectBeingExecuted();
    }

    public void updateQueueHandler(AppSyncOfflineMutationInterceptor.QueueUpdateHandler queueUpdateHandler) {
        this.queueHandler = queueUpdateHandler;
        this.persistentOfflineMutationManager.updateQueueHandler(queueUpdateHandler);
    }
}
