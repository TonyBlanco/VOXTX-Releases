package com.google.android.gms.internal.p001firebaseauthapi;

import H5.T;
import H5.c0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzaak extends zzacx<Object, T> {
    private final String zzy;
    private final String zzz;

    public zzaak(String str, String str2) {
        super(4);
        r.h(str, "code cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "checkActionCode";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zzd(this.zzy, this.zzz, this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
        zzb(new c0(this.zzm));
    }
}
