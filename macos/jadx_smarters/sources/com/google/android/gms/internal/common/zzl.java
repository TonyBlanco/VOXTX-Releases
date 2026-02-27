package com.google.android.gms.internal.common;

import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes3.dex */
final class zzl extends zzk {
    private final char zza;

    public zzl(char c9) {
        this.zza = c9;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = TokenParser.ESCAPE;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i9 = this.zza;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(i9 & 15);
            i9 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c9) {
        return c9 == this.zza;
    }
}
