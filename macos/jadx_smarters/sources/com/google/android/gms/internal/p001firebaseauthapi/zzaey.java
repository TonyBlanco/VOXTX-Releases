package com.google.android.gms.internal.p001firebaseauthapi;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;

/* JADX INFO: loaded from: classes3.dex */
public enum zzaey {
    ACCESS_TOKEN("ACCESS_TOKEN"),
    ID_TOKEN(ClientConstants.TOKEN_TYPE_ID);

    private final String zzd;

    zzaey(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
