package com.google.android.recaptcha.internal;

import G8.L;
import com.google.android.recaptcha.RecaptchaAction;
import k8.j;
import k8.k;
import k8.q;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;
import q8.l;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
final class zzy extends l implements p {
    int zza;
    final /* synthetic */ zzaa zzb;
    final /* synthetic */ RecaptchaAction zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzaa zzaaVar, RecaptchaAction recaptchaAction, InterfaceC2372d interfaceC2372d) {
        super(2, interfaceC2372d);
        this.zzb = zzaaVar;
        this.zzc = recaptchaAction;
    }

    @Override // q8.AbstractC2642a
    @NotNull
    public final InterfaceC2372d create(@Nullable Object obj, @NotNull InterfaceC2372d interfaceC2372d) {
        return new zzy(this.zzb, this.zzc, interfaceC2372d);
    }

    @Override // w8.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzy) create((L) obj, (InterfaceC2372d) obj2)).invokeSuspend(q.f43674a);
    }

    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objZzf;
        Object objD = AbstractC2512c.d();
        int i9 = this.zza;
        k.b(obj);
        if (i9 != 0) {
            objZzf = ((j) obj).i();
        } else {
            zzda zzdaVarZzb = this.zzb.zzb();
            RecaptchaAction recaptchaAction = this.zzc;
            this.zza = 1;
            objZzf = zzdaVarZzb.zzf(recaptchaAction, this);
            if (objZzf == objD) {
                return objD;
            }
        }
        return j.a(objZzf);
    }
}
