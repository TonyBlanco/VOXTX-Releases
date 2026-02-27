package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
final class zze extends zzb {
    private zze() {
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzb
    public final URLConnection zza(URL url, String str) throws IOException {
        return url.openConnection();
    }
}
