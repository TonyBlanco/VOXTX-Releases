package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum MacAlgorithmSpec {
    HMAC_SHA_224("HMAC_SHA_224"),
    HMAC_SHA_256("HMAC_SHA_256"),
    HMAC_SHA_384("HMAC_SHA_384"),
    HMAC_SHA_512("HMAC_SHA_512");

    private static final Map<String, MacAlgorithmSpec> enumMap;
    private String value;

    static {
        MacAlgorithmSpec macAlgorithmSpec = HMAC_SHA_224;
        MacAlgorithmSpec macAlgorithmSpec2 = HMAC_SHA_256;
        MacAlgorithmSpec macAlgorithmSpec3 = HMAC_SHA_384;
        MacAlgorithmSpec macAlgorithmSpec4 = HMAC_SHA_512;
        HashMap map = new HashMap();
        enumMap = map;
        map.put("HMAC_SHA_224", macAlgorithmSpec);
        map.put("HMAC_SHA_256", macAlgorithmSpec2);
        map.put("HMAC_SHA_384", macAlgorithmSpec3);
        map.put("HMAC_SHA_512", macAlgorithmSpec4);
    }

    MacAlgorithmSpec(String str) {
        this.value = str;
    }

    public static MacAlgorithmSpec fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, MacAlgorithmSpec> map = enumMap;
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
