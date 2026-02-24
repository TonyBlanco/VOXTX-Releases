package com.amazonaws.mobileconnectors.cognitoauth.exceptions;

/* JADX INFO: loaded from: classes.dex */
public class AuthClientException extends RuntimeException {
    private static final long serialVersionUID = -2748057344647987093L;

    public AuthClientException(String str) {
        super(str);
    }

    public AuthClientException(String str, Throwable th) {
        super(str, th);
    }

    public boolean isRetryable() {
        return true;
    }
}
