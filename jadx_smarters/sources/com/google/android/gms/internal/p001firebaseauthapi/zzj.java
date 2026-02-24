package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzj {
    public int zza(CharSequence charSequence, int i9) {
        int length = charSequence.length();
        zzy.zza(i9, length, "index");
        while (i9 < length) {
            if (zza(charSequence.charAt(i9))) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public abstract boolean zza(char c9);
}
