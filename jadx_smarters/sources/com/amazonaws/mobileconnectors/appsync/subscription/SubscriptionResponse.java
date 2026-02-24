package com.amazonaws.mobileconnectors.appsync.subscription;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SubscriptionResponse {
    public List<MqttInfo> mqttInfos = new ArrayList();

    public static class MqttInfo {
        public String clientId;
        public String[] topics;
        public String wssURL;

        public MqttInfo(String str, String str2, String[] strArr) {
            this.clientId = str;
            this.wssURL = str2;
            this.topics = strArr;
        }
    }

    public void add(MqttInfo mqttInfo) {
        this.mqttInfos.add(mqttInfo);
    }
}
