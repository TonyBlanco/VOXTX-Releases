package com.google.android.gms.internal.p001firebaseauthapi;

import G5.C0541h;
import H5.C0611b;
import H5.T;
import H5.d0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzaau extends zzacx<Object, T> {
    private final C0541h zzy;
    private final String zzz;

    public zzaau(C0541h c0541h, String str) {
        super(2);
        this.zzy = (C0541h) r.n(c0541h, "credential cannot be null");
        r.h(c0541h.zzc(), "email cannot be null");
        r.h(c0541h.zzd(), "password cannot be null");
        this.zzz = str;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy.zzc(), r.g(this.zzy.zzd()), this.zzd.zze(), this.zzd.K(), this.zzz, this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
        C0611b c0611bZza = zzaai.zza(this.zzc, this.zzk);
        ((T) this.zze).a(this.zzj, c0611bZza);
        zzb(new d0(c0611bZza));
    }
}
