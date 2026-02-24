package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.AuthProvider;

/* JADX INFO: loaded from: classes.dex */
public final class AWSCognitoAuthProvider extends AuthProvider {
    private static final String DEVELOPER = "TryRoom";

    private AWSCognitoAuthProvider(String str) {
        super(str);
    }

    public static AuthProvider developer() {
        return new AWSCognitoAuthProvider("TryRoom");
    }
}
