package com.google.android.recaptcha.internal;

import G8.L;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k8.k;
import k8.q;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;
import q8.l;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
final class zzaz extends l implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzba zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzn zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaz(zzba zzbaVar, String str, zzn zznVar, InterfaceC2372d interfaceC2372d) {
        super(2, interfaceC2372d);
        this.zzc = zzbaVar;
        this.zzd = str;
        this.zze = zznVar;
    }

    @Override // q8.AbstractC2642a
    @NotNull
    public final InterfaceC2372d create(@Nullable Object obj, @NotNull InterfaceC2372d interfaceC2372d) {
        return new zzaz(this.zzc, this.zzd, this.zze, interfaceC2372d);
    }

    @Override // w8.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaz) create((L) obj, (InterfaceC2372d) obj2)).invokeSuspend(q.f43674a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objD = AbstractC2512c.d();
        ?? r12 = this.zzb;
        try {
        } catch (Exception e9) {
            zzba zzbaVar = this.zzc;
            zzn zznVar = this.zze;
            this.zza = null;
            this.zzb = 2;
            if (zzbaVar.zzu(e9, "recaptcha.m.Main.rge", zznVar, (zzn) r12, 0, this) == objD) {
                return objD;
            }
        }
        if (r12 == 0) {
            k.b(obj);
            zzn zznVar2 = new zzn();
            zzmp zzmpVarZzg = zzmp.zzg(zzeb.zzh().zzj(this.zzd));
            zzdk zzdkVarZzb = zzdk.zzb();
            zzba zzbaVar2 = this.zzc;
            zzmh zzmhVarZzy = zzba.zzy(zzmpVarZzg.zzi(), zzmpVarZzg.zzj());
            zzdkVarZzb.zzf();
            long jZza = zzdkVarZzb.zza(TimeUnit.MICROSECONDS);
            zzj zzjVar = zzj.zza;
            zzj.zza(zzl.zzm.zza(), jZza);
            zzba zzbaVar3 = this.zzc;
            List listZzi = zzmhVarZzy.zzi();
            zzn zznVar3 = this.zze;
            this.zza = zznVar2;
            this.zzb = 1;
            Object objZzt = zzbaVar3.zzt(listZzi, zznVar3, zznVar2, this);
            r12 = zznVar2;
            if (objZzt == objD) {
                return objD;
            }
        } else {
            if (r12 != 1) {
                k.b(obj);
                return q.f43674a;
            }
            Object obj2 = this.zza;
            k.b(obj);
            r12 = obj2;
        }
        return q.f43674a;
    }
}
