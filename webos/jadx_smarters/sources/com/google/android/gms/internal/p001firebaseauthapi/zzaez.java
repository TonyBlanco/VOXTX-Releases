package com.google.android.gms.internal.p001firebaseauthapi;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;

/* JADX INFO: loaded from: classes3.dex */
public enum zzaez {
    REFRESH_TOKEN("refresh_token"),
    AUTHORIZATION_CODE(ClientConstants.TOKEN_GRANT_TYPE_AUTH_CODE);

    private final String zzd;

    zzaez(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
