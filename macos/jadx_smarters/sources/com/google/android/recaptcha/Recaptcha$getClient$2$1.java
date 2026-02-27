package com.google.android.recaptcha;

import G8.L;
import android.app.Application;
import com.google.android.recaptcha.internal.zzaa;
import com.google.android.recaptcha.internal.zzr;
import com.google.android.recaptcha.internal.zzw;
import k8.k;
import k8.q;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;
import q8.l;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
public final class Recaptcha$getClient$2$1 extends l implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$2$1(Application application, String str, InterfaceC2372d interfaceC2372d) {
        super(2, interfaceC2372d);
        this.zzb = application;
        this.zzc = str;
    }

    @Override // q8.AbstractC2642a
    @NotNull
    public final InterfaceC2372d create(@Nullable Object obj, @NotNull InterfaceC2372d interfaceC2372d) {
        return new Recaptcha$getClient$2$1(this.zzb, this.zzc, interfaceC2372d);
    }

    @Override // w8.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Recaptcha$getClient$2$1) create((L) obj, (InterfaceC2372d) obj2)).invokeSuspend(q.f43674a);
    }

    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objD = AbstractC2512c.d();
        int i9 = this.zza;
        k.b(obj);
        if (i9 == 0) {
            zzw zzwVar = zzaa.zza;
            Application application = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzwVar.zza(application, str, new zzr(null, 0L, 0L, 7, null), null, this);
            if (obj == objD) {
                return objD;
            }
        }
        return obj;
    }
}
