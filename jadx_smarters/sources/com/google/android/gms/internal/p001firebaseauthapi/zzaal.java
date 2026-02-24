package com.google.android.gms.internal.p001firebaseauthapi;

import H5.InterfaceC0625p;
import com.google.android.gms.tasks.TaskCompletionSource;
import d.AbstractC1617D;

/* JADX INFO: loaded from: classes3.dex */
final class zzaal extends zzacx<Void, InterfaceC0625p> {
    public zzaal() {
        super(5);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "delete";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzd.zze(), this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
        AbstractC1617D.a(this.zze);
        throw null;
    }
}
