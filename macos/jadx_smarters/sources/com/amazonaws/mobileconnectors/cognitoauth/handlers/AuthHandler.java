package com.amazonaws.mobileconnectors.cognitoauth.handlers;

import com.amazonaws.mobileconnectors.cognitoauth.AuthUserSession;

/* JADX INFO: loaded from: classes.dex */
public interface AuthHandler {
    void onFailure(Exception exc);

    void onSignout();

    void onSuccess(AuthUserSession authUserSession);
}
