package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.r;
import t.AbstractC2756c;
import t4.C2775b;
import u0.C2812L;
import y5.InterfaceFutureC2987b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbb implements C2812L.e {
    private static final C2775b zza = new C2775b("MediaRouterOPTListener");
    private final zzbm zzb;
    private final Handler zzc = new zzdy(Looper.getMainLooper());

    public zzbb(zzbm zzbmVar) {
        this.zzb = (zzbm) r.m(zzbmVar);
    }

    @Override // u0.C2812L.e
    public final InterfaceFutureC2987b onPrepareTransfer(final C2812L.h hVar, final C2812L.h hVar2) {
        zza.a("Prepare transfer from Route(%s) to Route(%s)", hVar, hVar2);
        return AbstractC2756c.a(new AbstractC2756c.InterfaceC0454c() { // from class: com.google.android.gms.internal.cast.zzba
            @Override // t.AbstractC2756c.InterfaceC0454c
            public final Object attachCompleter(AbstractC2756c.a aVar) {
                return this.zza.zza(hVar, hVar2, aVar);
            }
        });
    }

    public final /* synthetic */ Object zza(final C2812L.h hVar, final C2812L.h hVar2, final AbstractC2756c.a aVar) throws Exception {
        return Boolean.valueOf(this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzaz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(hVar, hVar2, aVar);
            }
        }));
    }

    public final /* synthetic */ void zzb(C2812L.h hVar, C2812L.h hVar2, AbstractC2756c.a aVar) {
        this.zzb.zzl(hVar, hVar2, aVar);
    }
}
