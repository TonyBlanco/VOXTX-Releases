package com.amazonaws.mobileconnectors.appsync;

import B1.b;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Base64;
import android.util.Log;
import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import com.amazonaws.mobileconnectors.appsync.ConnectivityWatcher;
import com.amazonaws.mobileconnectors.appsync.retry.RetryInterceptor;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import v1.InterfaceC2868f;
import v1.t;

/* JADX INFO: loaded from: classes.dex */
final class WebSocketConnectionManager {
    private static final int MSG_RECONNECT = 0;
    private static final int NORMAL_CLOSURE_STATUS = 1000;
    private static final String TAG = "com.amazonaws.mobileconnectors.appsync.WebSocketConnectionManager";
    private final ApolloResponseBuilder apolloResponseBuilder;
    private final Context applicationContext;
    private final String serverUrl;
    private final SubscriptionAuthorizer subscriptionAuthorizer;
    private final boolean subscriptionsAutoReconnect;
    private WebSocket websocket;
    private HandlerThread reconnectThread = null;
    private Handler reconnectHandler = null;
    private ConnectivityWatcher connectivityWatcher = null;
    private final Object reconnectionLock = new Object();
    private int reconnectionCount = 0;
    private final Map<String, SubscriptionResponseDispatcher<?, ?, ?>> subscriptions = new ConcurrentHashMap();
    private final TimeoutWatchdog watchdog = new TimeoutWatchdog();

    /* JADX INFO: renamed from: com.amazonaws.mobileconnectors.appsync.WebSocketConnectionManager$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$amazonaws$mobileconnectors$appsync$WebSocketConnectionManager$MessageType;

        static {
            int[] iArr = new int[MessageType.values().length];
            $SwitchMap$com$amazonaws$mobileconnectors$appsync$WebSocketConnectionManager$MessageType = iArr;
            try {
                iArr[MessageType.CONNECTION_ACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazonaws$mobileconnectors$appsync$WebSocketConnectionManager$MessageType[MessageType.SUBSCRIPTION_ACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazonaws$mobileconnectors$appsync$WebSocketConnectionManager$MessageType[MessageType.SUBSCRIPTION_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazonaws$mobileconnectors$appsync$WebSocketConnectionManager$MessageType[MessageType.KEEP_ALIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazonaws$mobileconnectors$appsync$WebSocketConnectionManager$MessageType[MessageType.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazonaws$mobileconnectors$appsync$WebSocketConnectionManager$MessageType[MessageType.DATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum MessageType {
        KEEP_ALIVE("ka"),
        CONNECTION_ACK("connection_ack"),
        SUBSCRIPTION_COMPLETED("complete"),
        SUBSCRIPTION_ACK("start_ack"),
        ERROR("error"),
        DATA("data");

        private final String messageType;

        MessageType(String str) {
            this.messageType = str;
        }

        public static MessageType fromString(String str) {
            for (MessageType messageType : values()) {
                if (messageType.toString().equals(str)) {
                    return messageType;
                }
            }
            throw new IllegalArgumentException("Invalid message type string");
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.messageType;
        }
    }

    public static final class SubscriptionResponseDispatcher<D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> {
        private final ApolloResponseBuilder apolloResponseBuilder;
        private final AppSyncSubscriptionCall.Callback<T> callback;
        private final t subscription;

        public SubscriptionResponseDispatcher(t tVar, AppSyncSubscriptionCall.Callback<T> callback, ApolloResponseBuilder apolloResponseBuilder) {
            this.subscription = tVar;
            this.callback = callback;
            this.apolloResponseBuilder = apolloResponseBuilder;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SubscriptionResponseDispatcher.class != obj.getClass()) {
                return false;
            }
            SubscriptionResponseDispatcher subscriptionResponseDispatcher = (SubscriptionResponseDispatcher) obj;
            if (getSubscription() == null ? subscriptionResponseDispatcher.getSubscription() == null : getSubscription().equals(subscriptionResponseDispatcher.getSubscription())) {
                return getCallback() != null ? getCallback().equals(subscriptionResponseDispatcher.getCallback()) : subscriptionResponseDispatcher.getCallback() == null;
            }
            return false;
        }

        public AppSyncSubscriptionCall.Callback<T> getCallback() {
            return this.callback;
        }

        public t getSubscription() {
            return this.subscription;
        }

        public int hashCode() {
            return ((getSubscription() != null ? getSubscription().hashCode() : 0) * 31) + (getCallback() != null ? getCallback().hashCode() : 0);
        }

        public void invokeResponseCallback(String str) {
            this.callback.onResponse(this.apolloResponseBuilder.buildResponse(str, this.subscription));
        }
    }

    public WebSocketConnectionManager(Context context, String str, SubscriptionAuthorizer subscriptionAuthorizer, ApolloResponseBuilder apolloResponseBuilder, boolean z9) {
        this.applicationContext = context.getApplicationContext();
        this.serverUrl = str;
        this.subscriptionAuthorizer = subscriptionAuthorizer;
        this.apolloResponseBuilder = apolloResponseBuilder;
        this.subscriptionsAutoReconnect = z9;
    }

    private WebSocket createWebSocket() {
        try {
            WebSocket webSocketNewWebSocket = new OkHttpClient.Builder().retryOnConnectionFailure(true).build().newWebSocket(new Request.Builder().url(getConnectionRequestUrl()).addHeader("Sec-WebSocket-Protocol", "graphql-ws").build(), new WebSocketListener() { // from class: com.amazonaws.mobileconnectors.appsync.WebSocketConnectionManager.1
                @Override // okhttp3.WebSocketListener
                public void onClosing(WebSocket webSocket, int i9, String str) {
                    webSocket.close(1000, null);
                    WebSocketConnectionManager.this.notifyAllSubscriptionsCompleted();
                }

                @Override // okhttp3.WebSocketListener
                public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                    if (WebSocketConnectionManager.this.subscriptionsAutoReconnect) {
                        WebSocketConnectionManager.this.scheduleReconnect();
                    }
                    WebSocketConnectionManager.this.notifyFailure(th);
                }

                @Override // okhttp3.WebSocketListener
                public void onMessage(WebSocket webSocket, String str) {
                    WebSocketConnectionManager webSocketConnectionManager = WebSocketConnectionManager.this;
                    webSocketConnectionManager.processMessage(webSocketConnectionManager.websocket, str);
                }

                @Override // okhttp3.WebSocketListener
                public void onOpen(WebSocket webSocket, Response response) {
                    if (WebSocketConnectionManager.this.subscriptionsAutoReconnect) {
                        WebSocketConnectionManager.this.reportSuccessfulConnection();
                    }
                    WebSocketConnectionManager webSocketConnectionManager = WebSocketConnectionManager.this;
                    webSocketConnectionManager.sendConnectionInit(webSocketConnectionManager.websocket);
                }
            });
            this.websocket = webSocketNewWebSocket;
            return webSocketNewWebSocket;
        } catch (JSONException e9) {
            throw new RuntimeException("Failed to get connection url : ", e9);
        }
    }

    private String getConnectionRequestUrl() throws JSONException {
        URL url;
        byte[] bytes = this.subscriptionAuthorizer.getConnectionAuthorizationDetails().toString().getBytes();
        try {
            url = new URL(this.serverUrl);
        } catch (MalformedURLException unused) {
            url = null;
        }
        if (url == null) {
            throw new RuntimeException("Malformed Api Url: " + this.serverUrl);
        }
        DomainType domainTypeFrom = DomainType.from(this.serverUrl);
        String host = url.getHost();
        if (domainTypeFrom == DomainType.STANDARD) {
            host = host.replace("appsync-api", "appsync-realtime-api");
        }
        String path = url.getPath();
        if (domainTypeFrom == DomainType.CUSTOM) {
            path = path + "/realtime";
        }
        return new Uri.Builder().scheme("wss").authority(host).appendPath(path).appendQueryParameter("header", Base64.encodeToString(bytes, 0)).appendQueryParameter("payload", "e30=").build().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAllSubscriptionsCompleted() {
        Iterator it = new HashSet(this.subscriptions.values()).iterator();
        while (it.hasNext()) {
            ((SubscriptionResponseDispatcher) it.next()).getCallback().onCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFailure(Throwable th) {
        Iterator it = new HashSet(this.subscriptions.values()).iterator();
        while (it.hasNext()) {
            ((SubscriptionResponseDispatcher) it.next()).getCallback().onFailure(new b("Subscription failed.", th));
        }
    }

    private void notifySubscriptionCompleted(String str) {
        SubscriptionResponseDispatcher<?, ?, ?> subscriptionResponseDispatcher = this.subscriptions.get(str);
        if (subscriptionResponseDispatcher != null) {
            subscriptionResponseDispatcher.getCallback().onCompleted();
        }
    }

    private void notifySubscriptionData(String str, String str2) {
        SubscriptionResponseDispatcher<?, ?, ?> subscriptionResponseDispatcher = this.subscriptions.get(str);
        if (subscriptionResponseDispatcher != null) {
            subscriptionResponseDispatcher.invokeResponseCallback(str2);
        }
    }

    private void notifySubscriptionStarted(String str) {
        SubscriptionResponseDispatcher<?, ?, ?> subscriptionResponseDispatcher = this.subscriptions.get(str);
        if (subscriptionResponseDispatcher != null) {
            AppSyncSubscriptionCall.Callback<?> callback = subscriptionResponseDispatcher.getCallback();
            if (callback instanceof AppSyncSubscriptionCall.StartedCallback) {
                ((AppSyncSubscriptionCall.StartedCallback) callback).onStarted();
            }
        }
    }

    private void processJsonMessage(WebSocket webSocket, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        MessageType messageTypeFromString = MessageType.fromString(jSONObject.getString("type"));
        switch (AnonymousClass4.$SwitchMap$com$amazonaws$mobileconnectors$appsync$WebSocketConnectionManager$MessageType[messageTypeFromString.ordinal()]) {
            case 1:
                this.watchdog.start(webSocket, Integer.parseInt(jSONObject.getJSONObject("payload").getString("connectionTimeoutMs")));
                break;
            case 2:
                notifySubscriptionStarted(jSONObject.getString(Name.MARK));
                Log.d(TAG, "Subscription created with id = " + jSONObject.getString(Name.MARK));
                break;
            case 3:
                notifySubscriptionCompleted(jSONObject.getString(Name.MARK));
                break;
            case 4:
                this.watchdog.reset();
                break;
            case 5:
            case 6:
                notifySubscriptionData(jSONObject.getString(Name.MARK), jSONObject.getString("payload"));
                break;
            default:
                notifyFailure(new b("Got unknown message type: " + messageTypeFromString));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMessage(WebSocket webSocket, String str) {
        try {
            processJsonMessage(webSocket, str);
        } catch (JSONException e9) {
            notifyFailure(e9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportNetworkUp() {
        synchronized (this.reconnectionLock) {
            try {
                if (this.reconnectionCount == 0) {
                    return;
                }
                Log.v(TAG, "Network is up. Trying to reconnect immediately.");
                this.reconnectHandler.removeMessages(0);
                this.reconnectHandler.sendEmptyMessage(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportSuccessfulConnection() {
        synchronized (this.reconnectionLock) {
            try {
                if (this.reconnectionCount == 0) {
                    return;
                }
                Log.v(TAG, "Successful connection reported!");
                this.connectivityWatcher.unregister();
                this.connectivityWatcher = null;
                this.reconnectThread.quit();
                this.reconnectThread = null;
                this.reconnectHandler = null;
                this.reconnectionCount = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void retryAllSubscriptions() {
        WebSocket webSocket = this.websocket;
        if (webSocket != null) {
            webSocket.cancel();
        }
        try {
            createWebSocket();
            for (Map.Entry<String, SubscriptionResponseDispatcher<?, ?, ?>> entry : this.subscriptions.entrySet()) {
                SubscriptionResponseDispatcher<?, ?, ?> value = entry.getValue();
                startSubscription(value.getSubscription(), value.getCallback(), entry.getKey());
            }
        } catch (AmazonClientException e9) {
            Log.v(TAG, "Failed to create WebSocket: " + e9);
            scheduleReconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleReconnect() {
        synchronized (this.reconnectionLock) {
            try {
                Handler handler = this.reconnectHandler;
                if (handler == null || !handler.hasMessages(0)) {
                    if (this.reconnectionCount == 0) {
                        HandlerThread handlerThread = new HandlerThread("AWSAppSyncWebSocketReconnectionThread");
                        this.reconnectThread = handlerThread;
                        handlerThread.start();
                        this.reconnectHandler = new Handler(this.reconnectThread.getLooper(), new Handler.Callback() { // from class: com.amazonaws.mobileconnectors.appsync.WebSocketConnectionManager.2
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                if (message.what != 0) {
                                    return false;
                                }
                                WebSocketConnectionManager.this.retryAllSubscriptions();
                                return true;
                            }
                        });
                        ConnectivityWatcher.Callback callback = new ConnectivityWatcher.Callback() { // from class: com.amazonaws.mobileconnectors.appsync.WebSocketConnectionManager.3
                            @Override // com.amazonaws.mobileconnectors.appsync.ConnectivityWatcher.Callback
                            public void onConnectivityChanged(boolean z9) {
                                if (z9) {
                                    WebSocketConnectionManager.this.reportNetworkUp();
                                }
                            }
                        };
                        ConnectivityWatcher connectivityWatcher = this.connectivityWatcher;
                        if (connectivityWatcher == null) {
                            this.connectivityWatcher = new ConnectivityWatcher(this.applicationContext, callback);
                        } else {
                            connectivityWatcher.unregister();
                        }
                        this.connectivityWatcher.register();
                    }
                    int i9 = this.reconnectionCount + 1;
                    this.reconnectionCount = i9;
                    int iCalculateBackoff = RetryInterceptor.calculateBackoff(i9);
                    Log.v(TAG, "Scheduling reconnection after [" + iCalculateBackoff + "] ms.");
                    this.reconnectHandler.sendEmptyMessageDelayed(0, (long) iCalculateBackoff);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendConnectionInit(WebSocket webSocket) {
        try {
            webSocket.send(new JSONObject().put("type", "connection_init").toString());
        } catch (JSONException e9) {
            notifyFailure(e9);
        }
    }

    private synchronized void startSubscription(t tVar, AppSyncSubscriptionCall.Callback<?> callback, String str) {
        try {
            if (!this.websocket.send(new JSONObject().put(Name.MARK, str).put("type", "start").put("payload", new JSONObject().put("data", new JSONObject().put("query", tVar.queryDocument()).put("variables", new JSONObject(tVar.variables().valueMap())).toString()).put("extensions", new JSONObject().put("authorization", this.subscriptionAuthorizer.getAuthorizationDetails(false, tVar)))).toString())) {
                callback.onFailure(new b("WebSocket communication failed."));
            }
        } catch (JSONException e9) {
            throw new RuntimeException("Failed to construct subscription registration message.", e9);
        }
    }

    public synchronized void releaseSubscription(String str) {
        if (!this.subscriptions.containsKey(str)) {
            throw new IllegalArgumentException("No existing subscription with the given id.");
        }
        try {
            this.websocket.send(new JSONObject().put("type", "stop").put(Name.MARK, str).toString());
            this.subscriptions.remove(str);
            if (this.subscriptions.size() == 0) {
                this.watchdog.stop();
                this.websocket.close(1000, "No active subscriptions");
                this.websocket = null;
            }
        } catch (JSONException e9) {
            throw new RuntimeException("Failed to construct subscription release message.", e9);
        }
    }

    public synchronized <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> String requestSubscription(t tVar, AppSyncSubscriptionCall.Callback<T> callback) {
        String string;
        try {
            if (this.websocket == null) {
                this.websocket = createWebSocket();
            }
            string = UUID.randomUUID().toString();
            startSubscription(tVar, callback, string);
            this.subscriptions.put(string, new SubscriptionResponseDispatcher<>(tVar, callback, this.apolloResponseBuilder));
        } catch (Throwable th) {
            throw th;
        }
        return string;
    }
}
