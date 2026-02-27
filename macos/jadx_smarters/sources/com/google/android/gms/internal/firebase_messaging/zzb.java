package com.google.android.gms.internal.firebase_messaging;

import c6.d;
import c6.e;
import c6.f;
import java.io.IOException;
import r6.C2681b;

/* JADX INFO: loaded from: classes3.dex */
final class zzb implements e {
    static final zzb zza = new zzb();
    private static final d zzb;

    static {
        d.b bVarA = d.a("messagingClientEvent");
        zzo zzoVar = new zzo();
        zzoVar.zza(1);
        zzb = bVarA.b(zzoVar.zzb()).a();
    }

    private zzb() {
    }

    @Override // c6.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((f) obj2).add(zzb, ((C2681b) obj).a());
    }
}
