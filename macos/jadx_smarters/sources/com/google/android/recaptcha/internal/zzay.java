package com.google.android.recaptcha.internal;

import G8.L;
import G8.M;
import k8.k;
import k8.q;
import kotlin.jvm.internal.C;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;
import q8.l;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
final class zzay extends l implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzn zzc;
    final /* synthetic */ zzn zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzba zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(Exception exc, int i9, zzn zznVar, zzn zznVar2, String str, zzba zzbaVar, InterfaceC2372d interfaceC2372d) {
        super(2, interfaceC2372d);
        this.zza = exc;
        this.zzb = i9;
        this.zzc = zznVar;
        this.zzd = zznVar2;
        this.zze = str;
        this.zzf = zzbaVar;
    }

    @Override // q8.AbstractC2642a
    @NotNull
    public final InterfaceC2372d create(@Nullable Object obj, @NotNull InterfaceC2372d interfaceC2372d) {
        zzay zzayVar = new zzay(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, interfaceC2372d);
        zzayVar.zzg = obj;
        return zzayVar;
    }

    @Override // w8.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzay) create((L) obj, (InterfaceC2372d) obj2)).invokeSuspend(q.f43674a);
    }

    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        zzmi zzmiVarZzf;
        AbstractC2512c.d();
        k.b(obj);
        L l9 = (L) this.zzg;
        Exception exc = this.zza;
        if (exc instanceof zzt) {
            zzmiVarZzf = ((zzt) exc).zza();
            zzmiVarZzf.zzd(this.zzb);
        } else {
            zzmiVarZzf = zzmj.zzf();
            zzmiVarZzf.zzd(this.zzb);
            zzmiVarZzf.zzp(2);
            zzmiVarZzf.zze(2);
        }
        zzmj zzmjVar = (zzmj) zzmiVarZzf.zzj();
        zzmjVar.zzk();
        zzmjVar.zzj();
        C.b(this.zza.getClass()).b();
        this.zza.getMessage();
        zzlg zzlgVarZza = zzar.zza(this.zzc, this.zzd);
        String str = this.zze;
        if (str.length() == 0) {
            str = "recaptcha.m.Main.rge";
        }
        if (M.e(l9)) {
            zzba zzbaVar = this.zzf;
            zzeb zzebVarZzh = zzeb.zzh();
            byte[] bArrZzd = zzmjVar.zzd();
            String strZzi = zzebVarZzh.zzi(bArrZzd, 0, bArrZzd.length);
            zzeb zzebVarZzh2 = zzeb.zzh();
            byte[] bArrZzd2 = zzlgVarZza.zzd();
            zzbaVar.zzv(str, strZzi, zzebVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length));
        }
        return q.f43674a;
    }
}
