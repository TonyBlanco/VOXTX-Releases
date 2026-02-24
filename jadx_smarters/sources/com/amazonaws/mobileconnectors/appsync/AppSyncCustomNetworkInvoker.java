package com.amazonaws.mobileconnectors.appsync;

import B1.e;
import K1.d;
import android.os.Message;
import android.util.Log;
import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.appsync.AppSyncOfflineMutationInterceptor;
import com.amazonaws.mobileconnectors.appsync.utils.StringUtils;
import com.amazonaws.util.VersionInfoUtils;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v1.p;
import v1.r;
import x1.g;

/* JADX INFO: loaded from: classes.dex */
public class AppSyncCustomNetworkInvoker {
    private static final String ACCEPT_TYPE = "application/json";
    private static final String CONTENT_TYPE = "application/json";
    private static final String HEADER_ACCEPT_TYPE = "Accept";
    private static final String HEADER_CONTENT_TYPE = "CONTENT_TYPE";
    private static final String HEADER_USER_AGENT = "User-Agent";
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=utf-8");
    private static final String TAG = AppSyncCustomNetworkInvoker.class.getSimpleName();
    Executor dispatcher = defaultDispatcher();
    volatile boolean disposed;
    volatile Call httpCall;
    final Call.Factory httpCallFactory;
    final PersistentMutationsCallback persistentMutationsCallback;
    PersistentOfflineMutationManager persistentOfflineMutationManager;
    AppSyncOfflineMutationInterceptor.QueueUpdateHandler queueHandler;
    final r s3ObjectManager;
    final d scalarTypeAdapters;
    final HttpUrl serverUrl;

    public AppSyncCustomNetworkInvoker(HttpUrl httpUrl, Call.Factory factory, d dVar, PersistentMutationsCallback persistentMutationsCallback, r rVar) {
        this.serverUrl = (HttpUrl) g.c(httpUrl, "serverUrl == null");
        this.httpCallFactory = (Call.Factory) g.c(factory, "httpCallFactory == null");
        this.scalarTypeAdapters = (d) g.c(dVar, "scalarTypeAdapters == null");
        this.persistentMutationsCallback = persistentMutationsCallback;
        this.s3ObjectManager = rVar;
    }

    private Executor defaultDispatcher() {
        return new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncCustomNetworkInvoker.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "AppSync Persistent Mutations Dispatcher");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Call httpCall(PersistentOfflineMutationObject persistentOfflineMutationObject) {
        RequestBody requestBodyCreate = RequestBody.create(MEDIA_TYPE, persistentOfflineMutationObject.requestString);
        String humanReadableAscii = StringUtils.toHumanReadableAscii(VersionInfoUtils.getUserAgent());
        return this.httpCallFactory.newCall(new Request.Builder().url(this.serverUrl).post(requestBodyCreate).addHeader("User-Agent", humanReadableAscii + " OfflineMutation").header("Accept", "application/json").header(HEADER_CONTENT_TYPE, "application/json").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMutationExecutionAsCompletedAndRemoveFromQueue(PersistentOfflineMutationObject persistentOfflineMutationObject) {
        this.persistentOfflineMutationManager.removePersistentMutationObject(persistentOfflineMutationObject.recordIdentifier);
        if (this.persistentOfflineMutationManager.getTimedoutMutations().contains(persistentOfflineMutationObject)) {
            this.persistentOfflineMutationManager.removeTimedoutMutation(persistentOfflineMutationObject);
        } else {
            this.queueHandler.setMutationInProgressStatusToFalse();
        }
    }

    public void executeRequest(final PersistentOfflineMutationObject persistentOfflineMutationObject) {
        this.dispatcher.execute(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncCustomNetworkInvoker.2
            @Override // java.lang.Runnable
            public void run() {
                if (!persistentOfflineMutationObject.bucket.equals("")) {
                    AppSyncCustomNetworkInvoker appSyncCustomNetworkInvoker = AppSyncCustomNetworkInvoker.this;
                    r rVar = appSyncCustomNetworkInvoker.s3ObjectManager;
                    if (rVar == null) {
                        PersistentMutationsCallback persistentMutationsCallback = appSyncCustomNetworkInvoker.persistentMutationsCallback;
                        if (persistentMutationsCallback != null) {
                            PersistentOfflineMutationObject persistentOfflineMutationObject2 = persistentOfflineMutationObject;
                            persistentMutationsCallback.onFailure(new PersistentMutationsError(persistentOfflineMutationObject2.responseClassName, persistentOfflineMutationObject2.recordIdentifier, new B1.d("S3 upload failed.", new IllegalArgumentException("S3ObjectManager not provided."))));
                        }
                        AppSyncCustomNetworkInvoker.this.setMutationExecutionAsCompletedAndRemoveFromQueue(persistentOfflineMutationObject);
                        AppSyncCustomNetworkInvoker.this.queueHandler.sendEmptyMessage(500);
                        return;
                    }
                    try {
                        rVar.upload(new p() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncCustomNetworkInvoker.2.1
                            @Override // v1.q
                            public String bucket() {
                                return persistentOfflineMutationObject.bucket;
                            }

                            @Override // v1.q
                            public String key() {
                                return persistentOfflineMutationObject.key;
                            }

                            @Override // v1.p
                            public String localUri() {
                                return persistentOfflineMutationObject.localURI;
                            }

                            @Override // v1.p
                            public String mimeType() {
                                return persistentOfflineMutationObject.mimeType;
                            }

                            @Override // v1.q
                            public String region() {
                                return persistentOfflineMutationObject.region;
                            }
                        });
                    } catch (AmazonClientException e9) {
                        if (e9.getCause() instanceof IOException) {
                            AppSyncCustomNetworkInvoker.this.queueHandler.setMutationInProgressStatusToFalse();
                            return;
                        }
                        PersistentMutationsCallback persistentMutationsCallback2 = AppSyncCustomNetworkInvoker.this.persistentMutationsCallback;
                        if (persistentMutationsCallback2 != null) {
                            PersistentOfflineMutationObject persistentOfflineMutationObject3 = persistentOfflineMutationObject;
                            persistentMutationsCallback2.onFailure(new PersistentMutationsError(persistentOfflineMutationObject3.responseClassName, persistentOfflineMutationObject3.recordIdentifier, new B1.d("S3 upload failed.", e9)));
                        }
                        AppSyncCustomNetworkInvoker.this.setMutationExecutionAsCompletedAndRemoveFromQueue(persistentOfflineMutationObject);
                        AppSyncCustomNetworkInvoker.this.queueHandler.sendEmptyMessage(500);
                        return;
                    } catch (Exception e10) {
                        PersistentMutationsCallback persistentMutationsCallback3 = AppSyncCustomNetworkInvoker.this.persistentMutationsCallback;
                        if (persistentMutationsCallback3 != null) {
                            PersistentOfflineMutationObject persistentOfflineMutationObject4 = persistentOfflineMutationObject;
                            persistentMutationsCallback3.onFailure(new PersistentMutationsError(persistentOfflineMutationObject4.responseClassName, persistentOfflineMutationObject4.recordIdentifier, new B1.d("S3 upload failed.", e10)));
                        }
                        AppSyncCustomNetworkInvoker.this.setMutationExecutionAsCompletedAndRemoveFromQueue(persistentOfflineMutationObject);
                        AppSyncCustomNetworkInvoker.this.queueHandler.sendEmptyMessage(500);
                        return;
                    }
                }
                AppSyncCustomNetworkInvoker appSyncCustomNetworkInvoker2 = AppSyncCustomNetworkInvoker.this;
                appSyncCustomNetworkInvoker2.httpCall = appSyncCustomNetworkInvoker2.httpCall(persistentOfflineMutationObject);
                AppSyncCustomNetworkInvoker.this.httpCall.enqueue(new Callback() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncCustomNetworkInvoker.2.2
                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException iOException) {
                        Log.e(AppSyncCustomNetworkInvoker.TAG, "Thread:[" + Thread.currentThread().getId() + "]: Failed to execute http call for [" + persistentOfflineMutationObject.recordIdentifier + "]. Exception is [" + iOException + "]");
                        if (!AppSyncCustomNetworkInvoker.this.disposed) {
                            AppSyncCustomNetworkInvoker.this.queueHandler.setMutationInProgressStatusToFalse();
                            return;
                        }
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        AppSyncCustomNetworkInvoker.this.setMutationExecutionAsCompletedAndRemoveFromQueue(persistentOfflineMutationObject);
                        AppSyncCustomNetworkInvoker.this.queueHandler.sendEmptyMessage(500);
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, Response response) throws IllegalAccessException, IOException, InvocationTargetException {
                        PersistentMutationsCallback persistentMutationsCallback4;
                        PersistentMutationsError persistentMutationsError;
                        if (AppSyncCustomNetworkInvoker.this.disposed) {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            AppSyncCustomNetworkInvoker.this.setMutationExecutionAsCompletedAndRemoveFromQueue(persistentOfflineMutationObject);
                            AppSyncCustomNetworkInvoker.this.queueHandler.sendEmptyMessage(500);
                            return;
                        }
                        if (response.isSuccessful()) {
                            String strString = response.body().string();
                            try {
                                JSONObject jSONObject = new JSONObject(strString);
                                if (!ConflictResolutionHandler.conflictPresent(strString)) {
                                    PersistentMutationsCallback persistentMutationsCallback5 = AppSyncCustomNetworkInvoker.this.persistentMutationsCallback;
                                    if (persistentMutationsCallback5 != null) {
                                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("errors");
                                        PersistentOfflineMutationObject persistentOfflineMutationObject5 = persistentOfflineMutationObject;
                                        persistentMutationsCallback5.onResponse(new PersistentMutationsResponse(jSONObjectOptJSONObject, jSONArrayOptJSONArray, persistentOfflineMutationObject5.responseClassName, persistentOfflineMutationObject5.recordIdentifier));
                                    }
                                    AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                    AppSyncCustomNetworkInvoker.this.setMutationExecutionAsCompletedAndRemoveFromQueue(persistentOfflineMutationObject);
                                    AppSyncCustomNetworkInvoker.this.queueHandler.sendEmptyMessage(400);
                                    return;
                                }
                                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("errors");
                                MutationInterceptorMessage mutationInterceptorMessage = new MutationInterceptorMessage();
                                PersistentOfflineMutationObject persistentOfflineMutationObject6 = persistentOfflineMutationObject;
                                mutationInterceptorMessage.requestIdentifier = persistentOfflineMutationObject6.recordIdentifier;
                                mutationInterceptorMessage.clientState = persistentOfflineMutationObject6.clientState;
                                mutationInterceptorMessage.requestClassName = persistentOfflineMutationObject6.responseClassName;
                                mutationInterceptorMessage.serverState = new JSONObject(jSONArrayOptJSONArray2.getJSONObject(0).getString("data")).toString();
                                Message message = new Message();
                                message.obj = mutationInterceptorMessage;
                                message.what = 600;
                                AppSyncCustomNetworkInvoker.this.queueHandler.sendMessage(message);
                                return;
                            } catch (JSONException e11) {
                                e11.printStackTrace();
                                Log.d(AppSyncCustomNetworkInvoker.TAG, "Thread:[" + Thread.currentThread().getId() + "]: JSON Parse error" + e11.toString());
                                AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                                persistentMutationsCallback4 = AppSyncCustomNetworkInvoker.this.persistentMutationsCallback;
                                if (persistentMutationsCallback4 != null) {
                                    PersistentOfflineMutationObject persistentOfflineMutationObject7 = persistentOfflineMutationObject;
                                    persistentMutationsError = new PersistentMutationsError(persistentOfflineMutationObject7.responseClassName, persistentOfflineMutationObject7.recordIdentifier, new e("Failed to parse http response", e11));
                                }
                            }
                        } else {
                            AnonymousClass2 anonymousClass24 = AnonymousClass2.this;
                            persistentMutationsCallback4 = AppSyncCustomNetworkInvoker.this.persistentMutationsCallback;
                            if (persistentMutationsCallback4 != null) {
                                PersistentOfflineMutationObject persistentOfflineMutationObject8 = persistentOfflineMutationObject;
                                persistentMutationsError = new PersistentMutationsError(persistentOfflineMutationObject8.responseClassName, persistentOfflineMutationObject8.recordIdentifier, new B1.d("Failed to execute http call with error code and message: " + response.code() + response.message()));
                                persistentMutationsCallback4.onFailure(persistentMutationsError);
                            }
                        }
                        AnonymousClass2 anonymousClass25 = AnonymousClass2.this;
                        AppSyncCustomNetworkInvoker.this.setMutationExecutionAsCompletedAndRemoveFromQueue(persistentOfflineMutationObject);
                        AppSyncCustomNetworkInvoker.this.queueHandler.sendEmptyMessage(500);
                    }
                });
            }
        });
    }

    public void setPersistentOfflineMutationManager(PersistentOfflineMutationManager persistentOfflineMutationManager) {
        this.persistentOfflineMutationManager = persistentOfflineMutationManager;
    }

    public void updateQueueHandler(AppSyncOfflineMutationInterceptor.QueueUpdateHandler queueUpdateHandler) {
        this.queueHandler = queueUpdateHandler;
    }
}
