package com.amazonaws.mobileconnectors.appsync.subscription.mqtt;

import android.content.Context;
import android.util.Log;
import com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionCallback;
import com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionClient;
import com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionClientCallback;
import com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionDisconnectedException;
import com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

/* JADX INFO: loaded from: classes.dex */
public class MqttSubscriptionClient implements SubscriptionClient {
    private static final int PING_INTERVAL = 30;
    private static final String TAG = "MqttSubscriptionClient";
    ClientConnectionListener clientConnectionListener;
    MqttAndroidClient mMqttAndroidClient;
    SubscriptionMessageListener subscriptionMessageListener;
    private final HashSet<String> topics = new HashSet<>();
    public final Map<String, Set<SubscriptionObject>> subscriptionsMap = new HashMap();

    public class ClientConnectionListener implements MqttCallback {
        SubscriptionClientCallback callback;
        private String clientID;
        private boolean isTransmitting = true;

        public ClientConnectionListener() {
        }

        public void connectionLost(Throwable th) {
            Log.v(MqttSubscriptionClient.TAG, "Subscription Infrastructure: client connection lost for client [" + this.clientID + "]");
            if (!this.isTransmitting || this.callback == null) {
                return;
            }
            Log.v(MqttSubscriptionClient.TAG, "Subscription Infrastructure: Transmitting client connection lost for client [" + this.clientID + "]");
            this.callback.onError(new SubscriptionDisconnectedException("Client disconnected", th));
        }

        public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
            Log.d(MqttSubscriptionClient.TAG, "delivery complete");
        }

        public void messageArrived(String str, MqttMessage mqttMessage) throws Exception {
            Log.v(MqttSubscriptionClient.TAG, "message arrived");
        }

        public void setCallback(SubscriptionClientCallback subscriptionClientCallback) {
            this.callback = subscriptionClientCallback;
        }

        public void setClientID(String str) {
            this.clientID = str;
        }

        public void setTransmitting(boolean z9) {
            Log.v(MqttSubscriptionClient.TAG, "Subscription Infrastructure: Set Connection transmitting to " + z9 + " for client [" + this.clientID + "]");
            this.isTransmitting = z9;
        }
    }

    public class SubscriptionMessageListener implements IMqttMessageListener {
        SubscriptionCallback callback;
        public MqttSubscriptionClient client;
        private String clientID;
        private boolean isTransmitting;

        public SubscriptionMessageListener() {
        }

        public void messageArrived(String str, MqttMessage mqttMessage) throws Exception {
            Log.v(MqttSubscriptionClient.TAG, "Subscription Infrastructure: Received subscription message on client [" + this.clientID + "]");
            if (this.isTransmitting) {
                Log.v(MqttSubscriptionClient.TAG, "Subscription Infrastructure: Transmitting subscription message from client [" + this.clientID + "] mqttL: " + this + "subL: " + this.callback + " Topic: " + str + " Msg: " + mqttMessage.toString());
                this.callback.onMessage(str, mqttMessage.toString());
            }
        }

        public void setCallback(SubscriptionCallback subscriptionCallback) {
            this.callback = subscriptionCallback;
        }

        public void setClientID(String str) {
            this.clientID = str;
        }

        public void setTransmitting(boolean z9) {
            Log.v(MqttSubscriptionClient.TAG, "Subscription Infrastructure: Set subscription message transmitting to " + z9 + " for client [" + this.clientID + "]");
            this.isTransmitting = z9;
        }
    }

    public MqttSubscriptionClient(Context context, String str, String str2) {
        this.mMqttAndroidClient = new MqttAndroidClient(context, str, str2, new MemoryPersistence());
        SubscriptionMessageListener subscriptionMessageListener = new SubscriptionMessageListener();
        this.subscriptionMessageListener = subscriptionMessageListener;
        subscriptionMessageListener.client = this;
        subscriptionMessageListener.setClientID(str2);
        ClientConnectionListener clientConnectionListener = new ClientConnectionListener();
        this.clientConnectionListener = clientConnectionListener;
        clientConnectionListener.setClientID(str2);
        setTransmitting(false);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionClient
    public void close() {
        Log.v(TAG, "Closing MQTT client [" + this.mMqttAndroidClient.getClientId() + "");
        try {
            this.mMqttAndroidClient.disconnect(0L, (Object) null, new IMqttActionListener() { // from class: com.amazonaws.mobileconnectors.appsync.subscription.mqtt.MqttSubscriptionClient.3
                public void onFailure(IMqttToken iMqttToken, Throwable th) {
                    Log.w(MqttSubscriptionClient.TAG, "Subscription Infrastructure: Got exception [" + th + "] when attempting to disconnect clientID " + MqttSubscriptionClient.this.mMqttAndroidClient.getClientId() + "]");
                }

                public void onSuccess(IMqttToken iMqttToken) {
                    try {
                        MqttSubscriptionClient.this.mMqttAndroidClient.close();
                        Log.d(MqttSubscriptionClient.TAG, "Subscription Infrastructure: Successfully closed the connection. Client ID [" + MqttSubscriptionClient.this.mMqttAndroidClient.getClientId() + "]");
                    } catch (Exception e9) {
                        Log.w(MqttSubscriptionClient.TAG, "Subscription Infrastructure: Error closing connection [" + e9 + "]");
                    }
                }
            });
        } catch (Exception e9) {
            Log.w(TAG, "Got exception when closing MQTT client [" + this.mMqttAndroidClient.getClientId() + "]", e9);
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionClient
    public void connect(final SubscriptionClientCallback subscriptionClientCallback) {
        try {
            MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
            mqttConnectOptions.setMqttVersion(4);
            mqttConnectOptions.setCleanSession(true);
            mqttConnectOptions.setAutomaticReconnect(false);
            mqttConnectOptions.setKeepAliveInterval(PING_INTERVAL);
            ClientConnectionListener clientConnectionListener = this.clientConnectionListener;
            if (clientConnectionListener != null) {
                clientConnectionListener.setCallback(subscriptionClientCallback);
            }
            this.mMqttAndroidClient.setCallback(this.clientConnectionListener);
            Log.v(TAG, "Subscription Infrastructure: Calling MQTT Connect with actual endpoint for client ID[" + this.mMqttAndroidClient.getClientId() + "]");
            this.mMqttAndroidClient.connect(mqttConnectOptions, (Object) null, new IMqttActionListener() { // from class: com.amazonaws.mobileconnectors.appsync.subscription.mqtt.MqttSubscriptionClient.1
                public void onFailure(IMqttToken iMqttToken, Throwable th) {
                    SubscriptionClientCallback subscriptionClientCallback2 = subscriptionClientCallback;
                    if (subscriptionClientCallback2 != null) {
                        subscriptionClientCallback2.onError(new Exception(th));
                    }
                }

                public void onSuccess(IMqttToken iMqttToken) {
                    SubscriptionClientCallback subscriptionClientCallback2 = subscriptionClientCallback;
                    if (subscriptionClientCallback2 != null) {
                        subscriptionClientCallback2.onConnect();
                    }
                }
            });
        } catch (Exception e9) {
            Log.e("TAG", "Subscription Infrastructure: Failed to connect mqtt client for clientID [" + this.mMqttAndroidClient.getClientId() + "]", e9);
            subscriptionClientCallback.onError(e9);
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionClient
    public Set<String> getTopics() {
        return this.topics;
    }

    @Override // com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionClient
    public void setTransmitting(boolean z9) {
        SubscriptionMessageListener subscriptionMessageListener = this.subscriptionMessageListener;
        if (subscriptionMessageListener != null) {
            subscriptionMessageListener.setTransmitting(z9);
        }
        ClientConnectionListener clientConnectionListener = this.clientConnectionListener;
        if (clientConnectionListener != null) {
            clientConnectionListener.setTransmitting(z9);
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionClient
    public void subscribe(String str, int i9, SubscriptionCallback subscriptionCallback) {
        try {
            Log.v(TAG, this + "Subscription Infrastructure: Attempting to subscribe to topic " + str + " on clientID [" + this.mMqttAndroidClient.getClientId() + "]");
            SubscriptionMessageListener subscriptionMessageListener = this.subscriptionMessageListener;
            if (subscriptionMessageListener != null) {
                subscriptionMessageListener.setCallback(subscriptionCallback);
            }
            this.mMqttAndroidClient.subscribe(str, i9, this.subscriptionMessageListener);
            this.topics.add(str);
        } catch (Exception e9) {
            subscriptionCallback.onError(str, e9);
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionClient
    public void unsubscribe(final String str) {
        try {
            this.topics.remove(str);
            this.mMqttAndroidClient.unsubscribe(str, (Object) null, new IMqttActionListener() { // from class: com.amazonaws.mobileconnectors.appsync.subscription.mqtt.MqttSubscriptionClient.2
                public void onFailure(IMqttToken iMqttToken, Throwable th) {
                    Log.v(MqttSubscriptionClient.TAG, "Subscription Infrastructure: Errror [" + th + "] when disconnecting from topic [" + str + "]");
                }

                public void onSuccess(IMqttToken iMqttToken) {
                    Log.v(MqttSubscriptionClient.TAG, "Subscription Infrastructure: Disconnected from topic [" + str + "]");
                }
            });
        } catch (Exception e9) {
            Log.v(TAG, "Unsubscribe failed at the MQTT level [" + e9 + "]");
        }
    }
}
