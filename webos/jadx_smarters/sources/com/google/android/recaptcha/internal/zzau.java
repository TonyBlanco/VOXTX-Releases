package com.google.android.recaptcha.internal;

import k8.q;
import kotlin.jvm.internal.m;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
final class zzau extends m implements p {
    final /* synthetic */ zzba zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzau(zzba zzbaVar, String str, int i9) {
        super(2);
        this.zza = zzbaVar;
        this.zzb = str;
        this.zzc = i9;
    }

    @Override // w8.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzv(this.zzb, (String) obj2);
        int i9 = this.zzc;
        if (i9 != -1) {
            this.zza.zzb().zzb().zzf(i9, objArr);
        }
        return q.f43674a;
    }
}
