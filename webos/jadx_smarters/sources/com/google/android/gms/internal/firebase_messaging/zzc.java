package com.google.android.gms.internal.firebase_messaging;

import c6.d;
import c6.e;
import c6.f;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzc implements e {
    static final zzc zza = new zzc();
    private static final d zzb = d.d("messagingClientEventExtension");

    private zzc() {
    }

    @Override // c6.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((f) obj2).add(zzb, ((zze) obj).zza());
    }
}
