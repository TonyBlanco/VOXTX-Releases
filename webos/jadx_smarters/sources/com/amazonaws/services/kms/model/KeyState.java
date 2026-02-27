package com.amazonaws.services.kms.model;

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum KeyState {
    Creating("Creating"),
    Enabled("Enabled"),
    Disabled(BucketLifecycleConfiguration.DISABLED),
    PendingDeletion("PendingDeletion"),
    PendingImport("PendingImport"),
    PendingReplicaDeletion("PendingReplicaDeletion"),
    Unavailable("Unavailable"),
    Updating("Updating");

    private static final Map<String, KeyState> enumMap;
    private String value;

    static {
        KeyState keyState = Creating;
        KeyState keyState2 = Enabled;
        KeyState keyState3 = Disabled;
        KeyState keyState4 = PendingDeletion;
        KeyState keyState5 = PendingImport;
        KeyState keyState6 = PendingReplicaDeletion;
        KeyState keyState7 = Unavailable;
        KeyState keyState8 = Updating;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("Creating", keyState);
        map.put("Enabled", keyState2);
        map.put(BucketLifecycleConfiguration.DISABLED, keyState3);
        map.put("PendingDeletion", keyState4);
        map.put("PendingImport", keyState5);
        map.put("PendingReplicaDeletion", keyState6);
        map.put("Unavailable", keyState7);
        map.put("Updating", keyState8);
    }

    KeyState(String str) {
        this.value = str;
    }

    public static KeyState fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, KeyState> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
