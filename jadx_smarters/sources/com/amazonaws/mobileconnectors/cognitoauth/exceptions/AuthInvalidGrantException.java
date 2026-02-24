package com.amazonaws.mobileconnectors.cognitoauth.exceptions;

/* JADX INFO: loaded from: classes.dex */
public class AuthInvalidGrantException extends AuthClientException {
    private static final long serialVersionUID = -666047864690460870L;

    public AuthInvalidGrantException(String str) {
        super(str);
    }

    public AuthInvalidGrantException(String str, Throwable th) {
        super(str, th);
    }
}
