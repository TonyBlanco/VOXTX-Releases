package com.google.android.recaptcha.internal;

import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q8.AbstractC2645d;

/* JADX INFO: loaded from: classes3.dex */
final class zzv extends AbstractC2645d {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    /* synthetic */ Object zze;
    final /* synthetic */ zzw zzf;
    int zzg;
    zzw zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzv(zzw zzwVar, InterfaceC2372d interfaceC2372d) {
        super(interfaceC2372d);
        this.zzf = zzwVar;
    }

    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zze = obj;
        this.zzg |= Integer.MIN_VALUE;
        return this.zzf.zza(null, null, null, null, this);
    }
}
