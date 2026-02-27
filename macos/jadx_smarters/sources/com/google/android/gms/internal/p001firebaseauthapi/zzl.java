package com.google.android.gms.internal.p001firebaseauthapi;

import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes3.dex */
final class zzl extends zzm {
    private final char zza;

    public zzl(char c9) {
        this.zza = c9;
    }

    public final String toString() {
        char c9 = this.zza;
        char[] cArr = new char[6];
        cArr[0] = TokenParser.ESCAPE;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            cArr[5 - i9] = "0123456789ABCDEF".charAt(c9 & 15);
            c9 = (char) (c9 >> 4);
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzj
    public final boolean zza(char c9) {
        return c9 == this.zza;
    }
}
