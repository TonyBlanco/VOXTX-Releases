package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzb {
    private static zzb zza = new zze();

    public static synchronized zzb zza() {
        return zza;
    }

    public abstract URLConnection zza(URL url, String str) throws IOException;
}
