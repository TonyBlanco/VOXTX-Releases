package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpd extends RuntimeException {
    public zzpd(String str) {
        super(str);
    }

    public zzpd(String str, Throwable th) {
        super(str, th);
    }

    private zzpd(Throwable th) {
        super(th);
    }

    public static <T> T zza(zzpg<T> zzpgVar) {
        try {
            return zzpgVar.zza();
        } catch (Exception e9) {
            throw new zzpd(e9);
        }
    }
}
