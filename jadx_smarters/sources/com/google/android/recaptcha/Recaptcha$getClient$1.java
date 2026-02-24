package com.google.android.recaptcha;

import k8.j;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;
import q8.AbstractC2645d;

/* JADX INFO: loaded from: classes3.dex */
public final class Recaptcha$getClient$1 extends AbstractC2645d {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, InterfaceC2372d interfaceC2372d) {
        super(interfaceC2372d);
        this.zzb = recaptcha;
    }

    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM10getClient0E7RQCE = this.zzb.m10getClient0E7RQCE(null, null, this);
        return objM10getClient0E7RQCE == AbstractC2512c.d() ? objM10getClient0E7RQCE : j.a(objM10getClient0E7RQCE);
    }
}
