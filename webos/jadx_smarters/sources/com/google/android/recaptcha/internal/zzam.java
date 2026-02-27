package com.google.android.recaptcha.internal;

import G8.L;
import java.util.Timer;
import k8.k;
import k8.q;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;
import q8.l;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
final class zzam extends l implements p {
    final /* synthetic */ zzao zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzao zzaoVar, InterfaceC2372d interfaceC2372d) {
        super(2, interfaceC2372d);
        this.zza = zzaoVar;
    }

    @Override // q8.AbstractC2642a
    @NotNull
    public final InterfaceC2372d create(@Nullable Object obj, @NotNull InterfaceC2372d interfaceC2372d) {
        return new zzam(this.zza, interfaceC2372d);
    }

    @Override // w8.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((L) obj, (InterfaceC2372d) obj2)).invokeSuspend(q.f43674a);
    }

    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        AbstractC2512c.d();
        k.b(obj);
        zzao zzaoVar = this.zza;
        synchronized (zzaj.class) {
            try {
                if (zzaoVar.zze.zzb() == 0) {
                    Timer timer = zzao.zzb;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzao.zzb = null;
                }
                zzaoVar.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
        return q.f43674a;
    }
}
