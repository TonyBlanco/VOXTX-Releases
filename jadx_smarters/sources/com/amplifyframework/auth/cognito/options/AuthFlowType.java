package com.amplifyframework.auth.cognito.options;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoServiceConstants;

/* JADX INFO: loaded from: classes.dex */
public enum AuthFlowType {
    USER_SRP_AUTH(CognitoServiceConstants.AUTH_TYPE_INIT_USER_SRP),
    CUSTOM_AUTH(CognitoServiceConstants.AUTH_TYPE_INIT_CUSTOM_AUTH),
    USER_PASSWORD_AUTH(CognitoServiceConstants.AUTH_TYPE_INIT_USER_PASSWORD);

    private String value;

    AuthFlowType(String str) {
        this.value = str;
    }
}
