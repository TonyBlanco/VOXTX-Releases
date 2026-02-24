package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AdminSetUserMFAPreferenceResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* JADX INFO: loaded from: classes.dex */
public class AdminSetUserMFAPreferenceResultJsonUnmarshaller implements Unmarshaller<AdminSetUserMFAPreferenceResult, JsonUnmarshallerContext> {
    private static AdminSetUserMFAPreferenceResultJsonUnmarshaller instance;

    public static AdminSetUserMFAPreferenceResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AdminSetUserMFAPreferenceResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AdminSetUserMFAPreferenceResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new AdminSetUserMFAPreferenceResult();
    }
}
