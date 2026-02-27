package com.amazonaws.mobileconnectors.appsync;

import B1.b;
import C1.a;
import android.content.Context;
import android.util.Log;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSyncDBOperations;
import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import com.amazonaws.mobileconnectors.appsync.fetcher.AppSyncResponseFetchers;
import com.amazonaws.mobileconnectors.appsync.retry.RetryInterceptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u1.InterfaceC2844c;
import v1.InterfaceC2868f;
import v1.h;
import v1.i;
import v1.t;

/* JADX INFO: loaded from: classes.dex */
class AWSAppSyncDeltaSync {
    private static final String PROCESSING_MODE = "PROCESSING_MODE";
    private static final String QUEUING_MODE = "QUEUING_MODE";
    private static final String TAG = "AWSAppSyncDeltaSync";
    private static Boolean appInForeground;
    private static AWSAppSyncDeltaSyncSqlHelper awsAppSyncDeltaSyncSqlHelper;
    private static Map<Long, AWSAppSyncDeltaSync> deltaSyncObjects = new HashMap();
    private static Object foregroundLock;
    private static Object networkLock;
    private static Boolean networkUp;
    private AWSAppSyncClient awsAppSyncClient;
    private h baseQuery;
    private Long id;
    private Context mContext;
    private t subscription;
    private AppSyncSubscriptionCall.Callback subscriptionCallback;
    private String mode = null;
    private Object processingLock = new Object();
    private InterfaceC2844c.a baseQueryCallback = null;
    private h deltaQuery = null;
    private long lastRunTimeInMilliSeconds = 0;
    private long baseRefreshIntervalInSeconds = 86400;
    private InterfaceC2844c.a deltaQueryCallback = null;
    AppSyncSubscriptionCall deltaSyncSubscriptionWatcher = null;
    private ArrayDeque<i> messageQueue = new ArrayDeque<>();
    private boolean deltaSyncOperationFailed = false;
    private boolean cancelled = false;
    private AWSAppSyncDeltaSyncDBOperations dbHelper = null;
    private Object initializationLock = new Object();
    private boolean recordCreatedOrFound = false;
    private ScheduledFuture nextScheduledRun = null;
    int retryAttempt = 0;
    private ScheduledFuture nextRetryAttempt = null;
    private AppSyncSubscriptionCall.Callback scb = null;
    private ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    static {
        Boolean bool = Boolean.TRUE;
        networkUp = bool;
        networkLock = new Object();
        appInForeground = bool;
        foregroundLock = new Object();
        awsAppSyncDeltaSyncSqlHelper = null;
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AWSAppSyncDeltaSync(h hVar, AWSAppSyncClient aWSAppSyncClient, Context context) {
        this.mContext = context;
        this.baseQuery = hVar;
        this.awsAppSyncClient = aWSAppSyncClient;
    }

    public static /* synthetic */ String access$000() {
        return TAG;
    }

    public static /* synthetic */ boolean access$100(AWSAppSyncDeltaSync aWSAppSyncDeltaSync) {
        return aWSAppSyncDeltaSync.deltaSyncOperationFailed;
    }

    public static /* synthetic */ AppSyncSubscriptionCall.Callback access$1000(AWSAppSyncDeltaSync aWSAppSyncDeltaSync) {
        return aWSAppSyncDeltaSync.subscriptionCallback;
    }

    public static /* synthetic */ void access$200(AWSAppSyncDeltaSync aWSAppSyncDeltaSync) {
        aWSAppSyncDeltaSync.scheduleRetry();
    }

    public static /* synthetic */ t access$300(AWSAppSyncDeltaSync aWSAppSyncDeltaSync) {
        return aWSAppSyncDeltaSync.subscription;
    }

    public static /* synthetic */ String access$402(AWSAppSyncDeltaSync aWSAppSyncDeltaSync, String str) {
        aWSAppSyncDeltaSync.mode = str;
        return str;
    }

    public static /* synthetic */ h access$500(AWSAppSyncDeltaSync aWSAppSyncDeltaSync) {
        return aWSAppSyncDeltaSync.deltaQuery;
    }

    public static /* synthetic */ long access$600(AWSAppSyncDeltaSync aWSAppSyncDeltaSync) {
        return aWSAppSyncDeltaSync.lastRunTimeInMilliSeconds;
    }

    public static /* synthetic */ long access$700(AWSAppSyncDeltaSync aWSAppSyncDeltaSync) {
        return aWSAppSyncDeltaSync.baseRefreshIntervalInSeconds;
    }

    public static /* synthetic */ Object access$800(AWSAppSyncDeltaSync aWSAppSyncDeltaSync) {
        return aWSAppSyncDeltaSync.processingLock;
    }

    public static /* synthetic */ ArrayDeque access$900(AWSAppSyncDeltaSync aWSAppSyncDeltaSync) {
        return aWSAppSyncDeltaSync.messageQueue;
    }

    public static void cancel(Long l9) {
        AWSAppSyncDeltaSync aWSAppSyncDeltaSync = deltaSyncObjects.get(l9);
        if (aWSAppSyncDeltaSync != null) {
            aWSAppSyncDeltaSync.cancel();
        }
    }

    private String getKey() {
        return "" + this.baseQuery + this.subscription + this.deltaQuery;
    }

    public static void handleAppBackground() {
        synchronized (foregroundLock) {
            try {
                if (appInForeground.booleanValue()) {
                    Log.d(TAG, "Delta Sync: Background transition detected.");
                    appInForeground = Boolean.FALSE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void handleAppForeground() {
        /*
            java.lang.Object r0 = com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.foregroundLock
            monitor-enter(r0)
            java.lang.Boolean r1 = com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.appInForeground     // Catch: java.lang.Throwable -> L69
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L6b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L69
            com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.appInForeground = r1     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.networkLock     // Catch: java.lang.Throwable -> L69
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.Boolean r2 = com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.networkUp     // Catch: java.lang.Throwable -> L63
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L65
            java.util.Map<java.lang.Long, com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync> r2 = com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.deltaSyncObjects     // Catch: java.lang.Throwable -> L63
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L63
        L24:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L65
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L63
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.TAG     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r5.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r6 = "Delta Sync: Foreground transition detected. Running DeltaSync for ds object ["
            r5.append(r6)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = r3.getKey()     // Catch: java.lang.Throwable -> L63
            r5.append(r6)     // Catch: java.lang.Throwable -> L63
            java.lang.String r6 = "]"
            r5.append(r6)     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L63
            android.util.Log.d(r4, r5)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r4 = r3.getValue()     // Catch: java.lang.Throwable -> L63
            com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync r4 = (com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync) r4     // Catch: java.lang.Throwable -> L63
            r4.cancelRetry()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L63
            com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync r3 = (com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync) r3     // Catch: java.lang.Throwable -> L63
            r4 = 0
            r3.execute(r4)     // Catch: java.lang.Throwable -> L63
            goto L24
        L63:
            r2 = move-exception
            goto L67
        L65:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L63
            goto L6b
        L67:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L63
            throw r2     // Catch: java.lang.Throwable -> L69
        L69:
            r1 = move-exception
            goto L6d
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            return
        L6d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.handleAppForeground():void");
    }

    public static void handleNetworkDownEvent() {
        synchronized (networkLock) {
            try {
                if (networkUp.booleanValue()) {
                    Log.d(TAG, "Delta Sync: Network Down detected.");
                    networkUp = Boolean.FALSE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void handleNetworkUpEvent() {
        synchronized (networkLock) {
            try {
                if (!networkUp.booleanValue()) {
                    networkUp = Boolean.TRUE;
                    for (Map.Entry<Long, AWSAppSyncDeltaSync> entry : deltaSyncObjects.entrySet()) {
                        Log.d(TAG, "Delta Sync: Network Up detected. Running DeltaSync for ds object [" + entry.getKey() + "]");
                        entry.getValue().cancelRetry();
                        entry.getValue().execute(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void initializeIfRequired() {
        synchronized (this.initializationLock) {
            try {
                String str = TAG;
                Log.d(str, "In initialize method");
                if (awsAppSyncDeltaSyncSqlHelper == null) {
                    Log.d(str, "Initializing the database");
                    awsAppSyncDeltaSyncSqlHelper = new AWSAppSyncDeltaSyncSqlHelper(this.mContext, this.awsAppSyncClient.deltaSyncSqlStoreName);
                }
                if (this.dbHelper == null) {
                    this.dbHelper = new AWSAppSyncDeltaSyncDBOperations(awsAppSyncDeltaSyncSqlHelper);
                }
                if (!this.recordCreatedOrFound) {
                    AWSAppSyncDeltaSyncDBOperations.DeltaSyncRecord recordByKey = this.dbHelper.getRecordByKey(getKey());
                    if (recordByKey == null) {
                        this.id = Long.valueOf(this.dbHelper.createRecord(getKey(), this.lastRunTimeInMilliSeconds));
                    } else {
                        this.id = Long.valueOf(recordByKey.id);
                        this.lastRunTimeInMilliSeconds = recordByKey.lastRunTimeInMilliSeconds;
                    }
                    deltaSyncObjects.put(this.id, this);
                    this.recordCreatedOrFound = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleFutureSync(long j9) {
        if (this.baseRefreshIntervalInSeconds <= 0) {
            Log.i(TAG, "Delta Sync: baseRefreshIntervalInSeconds value is [" + this.baseRefreshIntervalInSeconds + "]. Will not schedule future Deltasync");
            return;
        }
        ScheduledFuture scheduledFuture = this.nextScheduledRun;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        long jCurrentTimeMillis = ((j9 - System.currentTimeMillis()) / 1000) + this.baseRefreshIntervalInSeconds;
        Log.v(TAG, "Delta Sync: Scheduling next run of the DeltaSync [" + jCurrentTimeMillis + "] seconds from now");
        final WeakReference weakReference = new WeakReference(this);
        this.nextScheduledRun = this.scheduledExecutorService.schedule(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.2
            @Override // java.lang.Runnable
            public void run() {
                if (weakReference.get() != null) {
                    ((AWSAppSyncDeltaSync) weakReference.get()).execute(true);
                }
            }
        }, jCurrentTimeMillis, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleRetry() {
        long jCalculateBackoff = RetryInterceptor.calculateBackoff(this.retryAttempt);
        Log.v(TAG, "Delta Sync: Scheduling retry of the DeltaSync [" + jCalculateBackoff + "] milliseconds from now");
        final WeakReference weakReference = new WeakReference(this);
        this.nextRetryAttempt = this.scheduledExecutorService.schedule(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.3
            @Override // java.lang.Runnable
            public void run() {
                if (weakReference.get() != null) {
                    ((AWSAppSyncDeltaSync) weakReference.get()).execute(false);
                }
            }
        }, jCalculateBackoff, TimeUnit.MILLISECONDS);
        this.retryAttempt = this.retryAttempt + 1;
    }

    public h adjust(h hVar) {
        String str;
        String str2;
        long j9 = this.lastRunTimeInMilliSeconds / 1000;
        String str3 = TAG;
        Log.v(str3, "Delta Sync: Attempting to set lastSync in DeltaQuery to [" + j9 + "]");
        try {
            InterfaceC2868f.b bVarVariables = hVar.variables();
            Field declaredField = bVarVariables.getClass().getDeclaredField("lastSync");
            declaredField.setAccessible(true);
            declaredField.set(bVarVariables, Long.valueOf(j9));
            Log.v(str3, "Delta Sync: set lastSync in DeltaQuery to [" + j9 + "]");
        } catch (IllegalAccessException unused) {
            str = TAG;
            str2 = "Delta Sync: Unable to override value in for 'lastSync'. Skipping adjustment";
            Log.v(str, str2);
        } catch (NoSuchFieldException unused2) {
            str = TAG;
            str2 = "Delta Sync: field 'lastSync' not present in query. Skipping adjustment";
            Log.v(str, str2);
        }
        return hVar;
    }

    public void cancel() {
        Log.i(TAG, "Delta Sync: Cancelling Delta Sync operation [" + this.id + "]");
        this.cancelled = true;
        AppSyncSubscriptionCall appSyncSubscriptionCall = this.deltaSyncSubscriptionWatcher;
        if (appSyncSubscriptionCall != null) {
            appSyncSubscriptionCall.cancel();
        }
        ScheduledFuture scheduledFuture = this.nextRetryAttempt;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.nextRetryAttempt = null;
        }
        ScheduledFuture scheduledFuture2 = this.nextScheduledRun;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.nextScheduledRun = null;
        }
        deltaSyncObjects.remove(this.id);
    }

    public void cancelRetry() {
        ScheduledFuture scheduledFuture = this.nextRetryAttempt;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.nextRetryAttempt = null;
        }
        this.retryAttempt = 0;
    }

    public Long execute(final boolean z9) {
        initializeIfRequired();
        if (this.cancelled) {
            Log.v(TAG, "Delta Sync: Cancelled. Quitting Delta Sync process for id [" + this.id + "]");
        } else {
            this.deltaSyncOperationFailed = false;
            new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.1
                /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
                    java.util.ConcurrentModificationException
                    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
                    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
                    	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
                    	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
                    	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
                    	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                    */
                @Override // java.lang.Runnable
                public void run() {
                    /*
                        Method dump skipped, instruction units count: 321
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.AnonymousClass1.run():void");
                }
            }).start();
        }
        return this.id;
    }

    public void runBaseQuery(final a aVar) {
        String str;
        String str2;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC2844c.a aVar2 = new InterfaceC2844c.a() { // from class: com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.4
            @Override // u1.InterfaceC2844c.a
            public void onFailure(b bVar) {
                Log.e(AWSAppSyncDeltaSync.TAG, "Delta Query: BaseQuery failed with [" + bVar.getLocalizedMessage() + "]");
                bVar.printStackTrace();
                AWSAppSyncDeltaSync.this.deltaSyncOperationFailed = true;
                if (AWSAppSyncDeltaSync.this.baseQueryCallback != null) {
                    AWSAppSyncDeltaSync.this.baseQueryCallback.onFailure(bVar);
                }
                countDownLatch.countDown();
            }

            @Override // u1.InterfaceC2844c.a
            public void onResponse(i iVar) {
                Log.v(AWSAppSyncDeltaSync.TAG, "Delta Sync: Base query response received");
                if (AppSyncResponseFetchers.NETWORK_ONLY.equals(aVar)) {
                    AWSAppSyncDeltaSync.this.scheduleFutureSync(jCurrentTimeMillis);
                    AWSAppSyncDeltaSync.this.lastRunTimeInMilliSeconds = jCurrentTimeMillis;
                    AWSAppSyncDeltaSync.this.dbHelper.updateLastRunTime(AWSAppSyncDeltaSync.this.id.longValue(), AWSAppSyncDeltaSync.this.lastRunTimeInMilliSeconds);
                    Log.v(AWSAppSyncDeltaSync.TAG, "Delta Sync: Updating lastRunTime to [" + AWSAppSyncDeltaSync.this.lastRunTimeInMilliSeconds + "]");
                }
                AWSAppSyncDeltaSync.this.dbHelper.updateLastRunTime(AWSAppSyncDeltaSync.this.id.longValue(), AWSAppSyncDeltaSync.this.lastRunTimeInMilliSeconds);
                if (AWSAppSyncDeltaSync.this.baseQueryCallback != null) {
                    AWSAppSyncDeltaSync.this.baseQueryCallback.onResponse(iVar);
                }
                Log.v(AWSAppSyncDeltaSync.TAG, "Delta Sync: Base query response propagated");
                countDownLatch.countDown();
            }
        };
        if (AppSyncResponseFetchers.CACHE_ONLY.equals(aVar)) {
            str = TAG;
            str2 = "Delta Sync: executing base query from cache";
        } else {
            str = TAG;
            str2 = "Delta Sync: executing base query from network";
        }
        Log.v(str, str2);
        this.awsAppSyncClient.query(this.baseQuery).responseFetcher(aVar).enqueue(aVar2);
        try {
            countDownLatch.await();
        } catch (InterruptedException e9) {
            Log.e(TAG, "Delta Sync: Base Query wait failed with [" + e9 + "]");
            this.deltaSyncOperationFailed = true;
        }
    }

    public void runDeltaQuery() {
        Log.v(TAG, "Delta Sync: executing Delta query");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.awsAppSyncClient.query(adjust(this.deltaQuery)).responseFetcher(AppSyncResponseFetchers.NETWORK_ONLY).enqueue(new InterfaceC2844c.a() { // from class: com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.6
            @Override // u1.InterfaceC2844c.a
            public void onFailure(b bVar) {
                Log.e(AWSAppSyncDeltaSync.TAG, "Delta Sync: onFailure executed for Delta Query with [" + bVar.getLocalizedMessage() + "]");
                AWSAppSyncDeltaSync.this.deltaSyncOperationFailed = true;
                if (AWSAppSyncDeltaSync.this.deltaQueryCallback != null) {
                    Log.v(AWSAppSyncDeltaSync.TAG, "Delta Sync: Propagating onFailure");
                    AWSAppSyncDeltaSync.this.deltaQueryCallback.onFailure(bVar);
                }
                countDownLatch.countDown();
            }

            @Override // u1.InterfaceC2844c.a
            public void onResponse(i iVar) {
                Log.v(AWSAppSyncDeltaSync.TAG, "Delta Sync: Received response for Delta Query.");
                AWSAppSyncDeltaSync.this.lastRunTimeInMilliSeconds = jCurrentTimeMillis;
                AWSAppSyncDeltaSync.this.dbHelper.updateLastRunTime(AWSAppSyncDeltaSync.this.id.longValue(), AWSAppSyncDeltaSync.this.lastRunTimeInMilliSeconds);
                Log.v(AWSAppSyncDeltaSync.TAG, "Delta Sync: Updated lastRunTime to  [" + AWSAppSyncDeltaSync.this.lastRunTimeInMilliSeconds + "]");
                if (AWSAppSyncDeltaSync.this.deltaQueryCallback != null) {
                    Log.v(AWSAppSyncDeltaSync.TAG, "Delta Sync: Propagating Delta query response.");
                    AWSAppSyncDeltaSync.this.deltaQueryCallback.onResponse(iVar);
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e9) {
            Log.e(TAG, "Delta Sync: Delta Query wait failed with [" + e9 + "]");
            this.deltaSyncOperationFailed = true;
        }
    }

    public void setBaseQuery(h hVar) {
        this.baseQuery = hVar;
    }

    public void setBaseQueryCallback(InterfaceC2844c.a aVar) {
        this.baseQueryCallback = aVar;
    }

    public void setBaseRefreshIntervalInSeconds(long j9) {
        this.baseRefreshIntervalInSeconds = j9;
    }

    public void setDeltaQuery(h hVar) {
        this.deltaQuery = hVar;
    }

    public void setDeltaQueryCallback(InterfaceC2844c.a aVar) {
        this.deltaQueryCallback = aVar;
    }

    public void setSubscription(t tVar) {
        this.subscription = tVar;
    }

    public void setSubscriptionCallback(AppSyncSubscriptionCall.Callback callback) {
        this.subscriptionCallback = callback;
    }

    public void subscribe() {
        String str = TAG;
        Log.v(str, "Delta Sync: Subscription was passed in. Setting it up");
        Log.v(str, "Delta Sync: Setting mode to QUEUING");
        if (this.scb == null) {
            this.scb = new AppSyncSubscriptionCall.Callback() { // from class: com.amazonaws.mobileconnectors.appsync.AWSAppSyncDeltaSync.5
                @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall.Callback
                public void onCompleted() {
                    Log.e(AWSAppSyncDeltaSync.TAG, "Delta Sync: onCompleted executed for subscription");
                }

                @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall.Callback
                public void onFailure(b bVar) {
                    Log.e(AWSAppSyncDeltaSync.TAG, "Delta Sync: onFailure executed with exception: [" + bVar.getLocalizedMessage() + "]");
                    if (AWSAppSyncDeltaSync.this.subscriptionCallback != null) {
                        Log.v(AWSAppSyncDeltaSync.TAG, "Delta Sync: Propagating onFailure");
                        AWSAppSyncDeltaSync.this.subscriptionCallback.onFailure(bVar);
                    }
                }

                @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall.Callback
                public void onResponse(i iVar) {
                    Log.d(AWSAppSyncDeltaSync.TAG, "Got a Message. Current mode is " + AWSAppSyncDeltaSync.this.mode);
                    synchronized (AWSAppSyncDeltaSync.this.processingLock) {
                        try {
                            if (AWSAppSyncDeltaSync.this.mode == AWSAppSyncDeltaSync.QUEUING_MODE) {
                                Log.v(AWSAppSyncDeltaSync.TAG, "Delta Sync: Message received while in QUEUING mode. Adding to queue");
                                AWSAppSyncDeltaSync.this.messageQueue.add(iVar);
                            } else {
                                Log.v(AWSAppSyncDeltaSync.TAG, "Delta Sync: Message received while in PROCESSING mode.");
                                AWSAppSyncDeltaSync.this.lastRunTimeInMilliSeconds = System.currentTimeMillis();
                                AWSAppSyncDeltaSync.this.dbHelper.updateLastRunTime(AWSAppSyncDeltaSync.this.id.longValue(), AWSAppSyncDeltaSync.this.lastRunTimeInMilliSeconds);
                                Log.v(AWSAppSyncDeltaSync.TAG, "Delta Sync: Updating lastRunTime to [" + AWSAppSyncDeltaSync.this.lastRunTimeInMilliSeconds + "]");
                                if (AWSAppSyncDeltaSync.this.subscriptionCallback != null) {
                                    Log.v(AWSAppSyncDeltaSync.TAG, "Delta Sync: Propagating received message");
                                    AWSAppSyncDeltaSync.this.subscriptionCallback.onResponse(iVar);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
        }
        Log.d(str, "Delta Sync: Setting up Delta Sync Subscription Watcher");
        AppSyncSubscriptionCall appSyncSubscriptionCallSubscribe = this.awsAppSyncClient.subscribe(this.subscription);
        this.deltaSyncSubscriptionWatcher = appSyncSubscriptionCallSubscribe;
        appSyncSubscriptionCallSubscribe.execute(this.scb);
    }
}
