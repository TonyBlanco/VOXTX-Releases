package com.amplifyframework.auth.cognito.util;

import com.amplifyframework.auth.AuthProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AuthProviderConverter {
    private static final Map<AuthProvider, String> CONVERT_AUTH_PROVIDER;

    static {
        HashMap map = new HashMap();
        map.put(AuthProvider.amazon(), "LoginWithAmazon");
        map.put(AuthProvider.facebook(), "Facebook");
        map.put(AuthProvider.google(), "Google");
        map.put(AuthProvider.apple(), "SignInWithApple");
        CONVERT_AUTH_PROVIDER = Collections.unmodifiableMap(map);
    }

    private AuthProviderConverter() {
    }

    public static String getIdentityProvider(AuthProvider authProvider) {
        String str = CONVERT_AUTH_PROVIDER.get(authProvider);
        return str != null ? str : authProvider.getProviderKey();
    }
}
