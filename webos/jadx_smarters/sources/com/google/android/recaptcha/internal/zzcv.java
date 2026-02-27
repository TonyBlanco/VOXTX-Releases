package com.google.android.recaptcha.internal;

import k8.j;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;
import q8.AbstractC2645d;

/* JADX INFO: loaded from: classes3.dex */
final class zzcv extends AbstractC2645d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzda zzb;
    int zzc;
    zzda zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(zzda zzdaVar, InterfaceC2372d interfaceC2372d) {
        super(interfaceC2372d);
        this.zzb = zzdaVar;
    }

    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzf = this.zzb.zzf(null, this);
        return objZzf == AbstractC2512c.d() ? objZzf : j.a(objZzf);
    }
}
