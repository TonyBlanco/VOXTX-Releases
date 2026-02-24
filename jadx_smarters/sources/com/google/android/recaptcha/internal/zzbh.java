package com.google.android.recaptcha.internal;

import k8.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzbh {
    @NotNull
    public static String zza(zzbi zzbiVar, @NotNull String str, byte b9) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i9 = 0; i9 < str.length(); i9++) {
            sb.append((char) n.a(n.a(str.charAt(i9)) ^ n.a(b9)));
        }
        return sb.toString();
    }
}
