package com.amazonaws.mobileconnectors.appsync.subscription;

import F1.h;
import K1.d;
import L1.b;
import android.content.Context;
import android.util.Log;
import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import com.amazonaws.mobileconnectors.appsync.retry.RetryInterceptor;
import com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionResponse;
import com.amazonaws.mobileconnectors.appsync.subscription.mqtt.MqttSubscriptionClient;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import u1.C2842a;
import v1.t;
import z1.InterfaceC3002a;

/* JADX INFO: loaded from: classes.dex */
public class RealSubscriptionManager implements b {
    private static final String TAG = "RealSubscriptionManager";
    private InterfaceC3002a apolloStore;
    private Context applicationContext;
    final List<SubscriptionClient> clients;
    private C2842a mApolloClient;
    private final SubscriptionCallback mainMessageCallback;
    private CountDownLatch reconnectCountdownLatch;
    Thread reconnectThread;
    boolean reconnectionInProgress;
    final Object reconnectionLock;
    private d scalarTypeAdapters;
    private boolean subscriptionsAutoReconnect;
    final Map<t, SubscriptionObject> subscriptionsById;
    private final Object subscriptionsByIdLock;
    final Map<String, HashSet<SubscriptionObject>> subscriptionsByTopic;
    private final Object subscriptionsByTopicLock;
    final Map<String, MqttSubscriptionClient> topicConnectionMap;

    public RealSubscriptionManager(Context context) {
        this(context, true);
    }

    public RealSubscriptionManager(Context context, boolean z9) {
        this.mApolloClient = null;
        this.subscriptionsAutoReconnect = true;
        this.subscriptionsByIdLock = new Object();
        this.subscriptionsByTopicLock = new Object();
        this.mainMessageCallback = new SubscriptionCallback() { // from class: com.amazonaws.mobileconnectors.appsync.subscription.RealSubscriptionManager.2
            @Override // com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionCallback
            public void onError(String str, Exception exc) {
                Set<SubscriptionObject> subscriptionObjectSetFromTopicMap = RealSubscriptionManager.this.getSubscriptionObjectSetFromTopicMap(str);
                if (subscriptionObjectSetFromTopicMap == null || subscriptionObjectSetFromTopicMap.size() == 0) {
                    Log.w(RealSubscriptionManager.TAG, "Subscription Infrastructure: No subscription objects found for topic [" + str + "]");
                    return;
                }
                for (SubscriptionObject subscriptionObject : subscriptionObjectSetFromTopicMap) {
                    subscriptionObject.onFailure(new B1.b("Subscription Infrastructure: onError called for Subscription [" + subscriptionObject + "]", exc));
                }
            }

            @Override // com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionCallback
            public void onMessage(String str, String str2) throws Throwable {
                Log.v(RealSubscriptionManager.TAG, "Subscription Infrastructure: Received message on topic [" + str + "]. Message is \n" + str2);
                Set<SubscriptionObject> subscriptionObjectSetFromTopicMap = RealSubscriptionManager.this.getSubscriptionObjectSetFromTopicMap(str);
                if (subscriptionObjectSetFromTopicMap == null) {
                    Log.w(RealSubscriptionManager.TAG, "Subscription Infrastructure: No subscription objects found for topic [" + str + "]");
                    return;
                }
                for (SubscriptionObject subscriptionObject : subscriptionObjectSetFromTopicMap) {
                    Log.v(RealSubscriptionManager.TAG, "Subscription Infrastructure: Propagating message received on topic " + str + " to " + subscriptionObject.subscription);
                    subscriptionObject.onMessage(str2);
                }
            }
        };
        this.reconnectThread = null;
        this.reconnectionLock = new Object();
        this.reconnectionInProgress = false;
        this.reconnectCountdownLatch = null;
        this.applicationContext = context.getApplicationContext();
        this.subscriptionsById = new ConcurrentHashMap();
        this.subscriptionsByTopic = new ConcurrentHashMap();
        this.topicConnectionMap = new ConcurrentHashMap();
        this.clients = new ArrayList();
        this.subscriptionsAutoReconnect = z9;
    }

    private void addSubscriptionObjectToTopic(String str, SubscriptionObject subscriptionObject) {
        synchronized (this.subscriptionsByTopicLock) {
            try {
                Set<SubscriptionObject> subscriptionObjectSetFromTopicMap = getSubscriptionObjectSetFromTopicMap(str);
                if (subscriptionObjectSetFromTopicMap == null) {
                    subscriptionObjectSetFromTopicMap = createSubscriptionsObjectSetinTopicMap(str);
                }
                subscriptionObjectSetFromTopicMap.add(subscriptionObject);
                Log.d(TAG, "Subscription Infrastructure: Adding subscription object " + subscriptionObject + " to topic " + str + ". Total subscription objects: " + subscriptionObjectSetFromTopicMap.size());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private SubscriptionObject createAndAddSubscriptionObjectToIdMap(t tVar) {
        SubscriptionObject subscriptionObject;
        synchronized (this.subscriptionsByIdLock) {
            try {
                subscriptionObject = this.subscriptionsById.get(tVar);
                if (subscriptionObject == null) {
                    subscriptionObject = new SubscriptionObject();
                    subscriptionObject.subscription = tVar;
                    this.subscriptionsById.put(tVar, subscriptionObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return subscriptionObject;
    }

    private Set<SubscriptionObject> createSubscriptionsObjectSetinTopicMap(String str) {
        HashSet<SubscriptionObject> hashSet;
        synchronized (this.subscriptionsByTopicLock) {
            try {
                hashSet = this.subscriptionsByTopic.get(str);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    this.subscriptionsByTopic.put(str, hashSet);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet;
    }

    private SubscriptionObject getSubscriptionObjectFromIdMap(t tVar) {
        SubscriptionObject subscriptionObject;
        synchronized (this.subscriptionsByIdLock) {
            subscriptionObject = this.subscriptionsById.get(tVar);
        }
        return subscriptionObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<SubscriptionObject> getSubscriptionObjectSetFromTopicMap(String str) {
        HashSet<SubscriptionObject> hashSet;
        synchronized (this.subscriptionsByTopicLock) {
            hashSet = this.subscriptionsByTopic.get(str);
        }
        return hashSet;
    }

    private void removeSubscriptionObjectFromIdMap(SubscriptionObject subscriptionObject) {
        if (subscriptionObject == null || subscriptionObject.subscription == null) {
            return;
        }
        synchronized (this.subscriptionsByIdLock) {
            subscriptionObject.getTopics().clear();
            this.subscriptionsById.remove(subscriptionObject.subscription);
        }
    }

    private void removeUnusedTopics(Set<String> set) {
        this.subscriptionsByTopic.keySet().retainAll(set);
    }

    @Override // L1.b
    public void addListener(t tVar, AppSyncSubscriptionCall.Callback callback) {
        synchronized (this.subscriptionsByIdLock) {
            try {
                SubscriptionObject subscriptionObjectFromIdMap = getSubscriptionObjectFromIdMap(tVar);
                if (subscriptionObjectFromIdMap == null) {
                    subscriptionObjectFromIdMap = createAndAddSubscriptionObjectToIdMap(tVar);
                }
                Log.v(TAG, "Subscription Infrastructure: Adding listener [" + callback.toString() + "] to SubscriptionObject: " + tVar + " got: " + subscriptionObjectFromIdMap.subscription);
                subscriptionObjectFromIdMap.addListener(callback);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void initiateReconnectSequence() {
        synchronized (this.reconnectionLock) {
            try {
                if (this.reconnectionInProgress) {
                    return;
                }
                this.reconnectionInProgress = true;
                Thread thread = new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.subscription.RealSubscriptionManager.3
                    @Override // java.lang.Runnable
                    public void run() {
                        SubscriptionObject next;
                        AppSyncSubscriptionCall.Callback next2;
                        int i9 = 1;
                        while (RealSubscriptionManager.this.reconnectionInProgress) {
                            long jCalculateBackoff = RetryInterceptor.calculateBackoff(i9);
                            try {
                                Log.v(RealSubscriptionManager.TAG, "Subscription Infrastructure: Sleeping for [" + jCalculateBackoff + "] ms");
                                Thread.sleep(jCalculateBackoff);
                            } catch (InterruptedException unused) {
                                Log.v(RealSubscriptionManager.TAG, "SubscriptionInfrastructure: Thread.sleep was interrupted in the exponential backoff for reconnects");
                            }
                            synchronized (RealSubscriptionManager.this.subscriptionsByIdLock) {
                                try {
                                    Iterator<SubscriptionObject> it = RealSubscriptionManager.this.subscriptionsById.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            next2 = null;
                                            break;
                                        } else {
                                            next = it.next();
                                            if (!next.isCancelled() && !next.getListeners().isEmpty()) {
                                                next2 = next.getListeners().iterator().next();
                                                break;
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (next == null || next2 == null) {
                                RealSubscriptionManager.this.reconnectionInProgress = false;
                            } else {
                                Log.v(RealSubscriptionManager.TAG, "Subscription Infrastructure: Attempting to reconnect");
                                RealSubscriptionManager.this.reconnectCountdownLatch = new CountDownLatch(1);
                                RealSubscriptionManager.this.mApolloClient.subscribe(next.subscription).execute(next2);
                                try {
                                    RealSubscriptionManager.this.reconnectCountdownLatch.await(1L, TimeUnit.MINUTES);
                                } catch (InterruptedException unused2) {
                                    Log.v(RealSubscriptionManager.TAG, "Subscription Infrastructure: Wait interrupted.");
                                }
                            }
                            i9++;
                        }
                    }
                });
                this.reconnectThread = thread;
                thread.start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L1.b
    public void removeListener(t tVar, AppSyncSubscriptionCall.Callback callback) {
        synchronized (this.subscriptionsByIdLock) {
            try {
                SubscriptionObject subscriptionObjectFromIdMap = getSubscriptionObjectFromIdMap(tVar);
                if (subscriptionObjectFromIdMap == null) {
                    return;
                }
                subscriptionObjectFromIdMap.listeners.remove(callback);
                if (subscriptionObjectFromIdMap.listeners.size() == 0) {
                    Iterator<String> it = subscriptionObjectFromIdMap.topics.iterator();
                    while (it.hasNext()) {
                        Set<SubscriptionObject> subscriptionObjectSetFromTopicMap = getSubscriptionObjectSetFromTopicMap(it.next().toString());
                        if (subscriptionObjectSetFromTopicMap != null) {
                            subscriptionObjectSetFromTopicMap.remove(subscriptionObjectFromIdMap);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void reportConnectionError() {
        synchronized (this.reconnectionLock) {
            try {
                if (this.reconnectionInProgress) {
                    String str = TAG;
                    Log.v(str, "Subscription Infrastructure: Connection Error reported!");
                    if (this.reconnectCountdownLatch != null) {
                        Log.v(str, "Subscription Infrastructure: Counting down the latch");
                        this.reconnectCountdownLatch.countDown();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void reportNetworkUp() {
        synchronized (this.reconnectionLock) {
            try {
                if (this.reconnectionInProgress) {
                    Thread thread = this.reconnectThread;
                    if (thread != null && Thread.State.TERMINATED != thread.getState()) {
                        Log.v(TAG, "Subscription Infrastructure: Network is up. Interrupting the thread for immediate reconnect.");
                        this.reconnectThread.interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void reportSuccessfulConnection() {
        synchronized (this.reconnectionLock) {
            try {
                if (this.reconnectionInProgress) {
                    String str = TAG;
                    Log.v(str, "Subscription Infrastructure: Successful connection reported!");
                    this.reconnectionInProgress = false;
                    if (this.reconnectCountdownLatch != null) {
                        Log.v(str, "Subscription Infrastructure: Counting down the latch");
                        this.reconnectCountdownLatch.countDown();
                    }
                    Thread thread = this.reconnectThread;
                    if (thread != null && Thread.State.TERMINATED != thread.getState()) {
                        Log.v(str, "Subscription Infrastructure: Interrupting the thread.");
                        this.reconnectThread.interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setApolloClient(C2842a c2842a) {
        this.mApolloClient = c2842a;
    }

    public void setScalarTypeAdapters(d dVar) {
        this.scalarTypeAdapters = dVar;
    }

    public void setStore(InterfaceC3002a interfaceC3002a) {
        this.apolloStore = interfaceC3002a;
    }

    @Override // L1.b
    public synchronized <T> void subscribe(t tVar, List<String> list, SubscriptionResponse subscriptionResponse, h hVar) {
        try {
            Log.v(TAG, "Subscription Infrastructure: subscribe called for " + tVar);
            SubscriptionObject subscriptionObjectFromIdMap = getSubscriptionObjectFromIdMap(tVar);
            if (subscriptionObjectFromIdMap == null) {
                subscriptionObjectFromIdMap = createAndAddSubscriptionObjectToIdMap(tVar);
            }
            subscriptionObjectFromIdMap.subscription = tVar;
            subscriptionObjectFromIdMap.normalizer = hVar;
            subscriptionObjectFromIdMap.scalarTypeAdapters = this.scalarTypeAdapters;
            for (String str : list) {
                subscriptionObjectFromIdMap.topics.add(str);
                addSubscriptionObjectToTopic(str, subscriptionObjectFromIdMap);
            }
            final CountDownLatch countDownLatch = new CountDownLatch(subscriptionResponse.mqttInfos.size());
            final ArrayList arrayList = new ArrayList();
            Log.v(TAG, "Subscription Infrastructure: Attempting to make [" + subscriptionResponse.mqttInfos.size() + "] MQTT clients]");
            final Set<String> setKeySet = this.subscriptionsByTopic.keySet();
            this.topicConnectionMap.clear();
            try {
                Thread.sleep(1000L);
            } catch (Exception unused) {
                Log.v(TAG, "Subscription Infrastructure: Thread.sleep for server propagation delay was interrupted");
            }
            Iterator<SubscriptionResponse.MqttInfo> it = subscriptionResponse.mqttInfos.iterator();
            while (true) {
                boolean z9 = true;
                if (!it.hasNext()) {
                    try {
                        break;
                    } catch (InterruptedException e9) {
                        throw new RuntimeException("Subscription Infrastructure: Failed to wait for all clients to finish connecting.", e9);
                    }
                }
                final SubscriptionResponse.MqttInfo next = it.next();
                for (String str2 : next.topics) {
                    if (setKeySet.contains(str2)) {
                        z9 = false;
                    }
                }
                if (z9) {
                    countDownLatch.countDown();
                } else {
                    final MqttSubscriptionClient mqttSubscriptionClient = new MqttSubscriptionClient(this.applicationContext, next.wssURL, next.clientId);
                    mqttSubscriptionClient.setTransmitting(false);
                    Log.v(TAG, "Subscription Infrastructure: Connecting with Client ID[" + next.clientId + "]");
                    mqttSubscriptionClient.connect(new SubscriptionClientCallback() { // from class: com.amazonaws.mobileconnectors.appsync.subscription.RealSubscriptionManager.1
                        @Override // com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionClientCallback
                        public void onConnect() {
                            if (RealSubscriptionManager.this.subscriptionsAutoReconnect) {
                                RealSubscriptionManager.this.reportSuccessfulConnection();
                            }
                            Log.v(RealSubscriptionManager.TAG, String.format("Subscription Infrastructure: Connection successful for clientID [" + next.clientId + "]. Will subscribe up to %d topics", Integer.valueOf(next.topics.length)));
                            for (String str3 : next.topics) {
                                if (setKeySet.contains(str3)) {
                                    Log.v(RealSubscriptionManager.TAG, String.format("Subscription Infrastructure: Subscribing to MQTT topic:[%s]", str3));
                                    mqttSubscriptionClient.subscribe(str3, 1, RealSubscriptionManager.this.mainMessageCallback);
                                    RealSubscriptionManager.this.topicConnectionMap.put(str3, mqttSubscriptionClient);
                                }
                            }
                            arrayList.add(mqttSubscriptionClient);
                            countDownLatch.countDown();
                        }

                        @Override // com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionClientCallback
                        public void onError(Exception exc) {
                            Log.v(RealSubscriptionManager.TAG, "Subscription Infrastructure: onError called " + exc);
                            if (RealSubscriptionManager.this.subscriptionsAutoReconnect && (exc instanceof SubscriptionDisconnectedException)) {
                                Log.v(RealSubscriptionManager.TAG, "Subscription Infrastructure: Disconnect received. Unexpected - Initiating reconnect sequence.");
                                RealSubscriptionManager.this.reportConnectionError();
                                RealSubscriptionManager.this.initiateReconnectSequence();
                                return;
                            }
                            for (String str3 : next.topics) {
                                if (RealSubscriptionManager.this.getSubscriptionObjectSetFromTopicMap(str3) != null) {
                                    Iterator it2 = RealSubscriptionManager.this.getSubscriptionObjectSetFromTopicMap(str3).iterator();
                                    while (it2.hasNext()) {
                                        ((SubscriptionObject) it2.next()).onFailure(new B1.b("Connection Error Reported", exc));
                                    }
                                }
                            }
                            countDownLatch.countDown();
                        }
                    });
                }
            }
            countDownLatch.await();
            String str3 = TAG;
            Log.v(str3, "Subscription Infrastructure: Made [" + arrayList.size() + "] MQTT clients");
            Log.v(str3, "Subscription Infrastructure: Unmuting the new clients [" + arrayList.size() + "] in total");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((SubscriptionClient) it2.next()).setTransmitting(true);
            }
            Log.v(TAG, "Subscription Infrastructure: Muting the old clients [ " + this.clients.size() + "] in total");
            Iterator<SubscriptionClient> it3 = this.clients.iterator();
            while (it3.hasNext()) {
                it3.next().setTransmitting(false);
            }
            Log.v(TAG, "Subscription Infrastructure: Closing the old clients [" + this.clients.size() + "] in total");
            for (SubscriptionClient subscriptionClient : this.clients) {
                Log.v(TAG, "Subscription Infrastructure: Closing client: " + subscriptionClient);
                subscriptionClient.close();
            }
            this.clients.clear();
            this.clients.addAll(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // L1.b
    public synchronized void unsubscribe(t tVar) {
        try {
            SubscriptionObject subscriptionObjectFromIdMap = getSubscriptionObjectFromIdMap(tVar);
            if (subscriptionObjectFromIdMap == null) {
                return;
            }
            if (subscriptionObjectFromIdMap.isCancelled()) {
                return;
            }
            subscriptionObjectFromIdMap.setCancelled();
            for (String str : subscriptionObjectFromIdMap.getTopics()) {
                synchronized (this.subscriptionsByTopicLock) {
                    try {
                        Set<SubscriptionObject> subscriptionObjectSetFromTopicMap = getSubscriptionObjectSetFromTopicMap(str.toString());
                        if (subscriptionObjectSetFromTopicMap != null) {
                            subscriptionObjectSetFromTopicMap.remove(subscriptionObjectFromIdMap);
                        }
                    } finally {
                    }
                }
            }
            removeSubscriptionObjectFromIdMap(subscriptionObjectFromIdMap);
            synchronized (this.subscriptionsByTopicLock) {
                try {
                    for (String str2 : this.subscriptionsByTopic.keySet()) {
                        Set<SubscriptionObject> subscriptionObjectSetFromTopicMap2 = getSubscriptionObjectSetFromTopicMap(str2);
                        if (subscriptionObjectSetFromTopicMap2 == null || subscriptionObjectSetFromTopicMap2.size() <= 0) {
                            String str3 = TAG;
                            Log.v(str3, "Subscription Infrastructure: Number of SubscriptionObjects for topic [" + str2 + "] is 0. Unsubscribing at the MQTT Level...");
                            MqttSubscriptionClient mqttSubscriptionClient = this.topicConnectionMap.get(str2);
                            if (mqttSubscriptionClient != null) {
                                mqttSubscriptionClient.unsubscribe(str2);
                                this.subscriptionsByTopic.remove(str2);
                                if (mqttSubscriptionClient.getTopics() == null || mqttSubscriptionClient.getTopics().size() == 0) {
                                    Log.v(str3, "Subscription Infrastructure: MQTT Client has no active topics. Disconnecting...");
                                    mqttSubscriptionClient.close();
                                }
                            }
                        } else {
                            Log.v(TAG, "Subscription Infrastructure: SubscriptionObjects still exist for topic [" + str2 + "]. Will not unsubscribe at the MQTT level");
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
