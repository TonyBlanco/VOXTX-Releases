package com.google.android.recaptcha.internal;

import G8.C0587o;
import G8.L;
import com.google.android.recaptcha.RecaptchaAction;
import k8.k;
import k8.q;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2511b;
import p8.AbstractC2512c;
import q8.AbstractC2649h;
import q8.l;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
final class zzcw extends l implements p {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ RecaptchaAction zze;
    final /* synthetic */ zzda zzf;
    final /* synthetic */ String zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(RecaptchaAction recaptchaAction, zzda zzdaVar, String str, InterfaceC2372d interfaceC2372d) {
        super(2, interfaceC2372d);
        this.zze = recaptchaAction;
        this.zzf = zzdaVar;
        this.zzg = str;
    }

    @Override // q8.AbstractC2642a
    @NotNull
    public final InterfaceC2372d create(@Nullable Object obj, @NotNull InterfaceC2372d interfaceC2372d) {
        return new zzcw(this.zze, this.zzf, this.zzg, interfaceC2372d);
    }

    @Override // w8.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcw) create((L) obj, (InterfaceC2372d) obj2)).invokeSuspend(q.f43674a);
    }

    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objD = AbstractC2512c.d();
        int i9 = this.zzd;
        k.b(obj);
        if (i9 == 0) {
            zzda zzdaVar = this.zzf;
            String str = this.zzg;
            RecaptchaAction recaptchaAction = this.zze;
            this.zza = zzdaVar;
            this.zzb = str;
            this.zzc = recaptchaAction;
            this.zzd = 1;
            C0587o c0587o = new C0587o(AbstractC2511b.c(this), 1);
            c0587o.v();
            zzdaVar.zzk.put(str, c0587o);
            zzma zzmaVarZzf = zzmb.zzf();
            zzmaVarZzf.zze(str);
            zzmaVarZzf.zzd(recaptchaAction.getAction());
            byte[] bArrZzd = ((zzmb) zzmaVarZzf.zzj()).zzd();
            String strZzi = zzeb.zzh().zzi(bArrZzd, 0, bArrZzd.length);
            zzai zzaiVar = zzai.zza;
            zzai.zzc(new zzaf(zzkw.EXECUTE_NATIVE, zzdaVar.zzg, zzdaVar.zzh, str, null), zzdaVar.zze, zzdaVar.zzf);
            zzdaVar.zzb().evaluateJavascript("recaptcha.m.Main.execute(\"" + strZzi + "\")", null);
            obj = c0587o.r();
            if (obj == AbstractC2512c.d()) {
                AbstractC2649h.c(this);
            }
            if (obj == objD) {
                return objD;
            }
        }
        return obj;
    }
}
