package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum UsernameAttributeType {
    Phone_number(CognitoUserPoolsSignInProvider.AttributeKeys.PHONE_NUMBER),
    Email("email");

    private static final Map<String, UsernameAttributeType> enumMap;
    private String value;

    static {
        UsernameAttributeType usernameAttributeType = Phone_number;
        UsernameAttributeType usernameAttributeType2 = Email;
        HashMap map = new HashMap();
        enumMap = map;
        map.put(CognitoUserPoolsSignInProvider.AttributeKeys.PHONE_NUMBER, usernameAttributeType);
        map.put("email", usernameAttributeType2);
    }

    UsernameAttributeType(String str) {
        this.value = str;
    }

    public static UsernameAttributeType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, UsernameAttributeType> map = enumMap;
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
