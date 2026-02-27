package com.google.android.gms.internal.p001firebaseauthapi;

import H5.C0621l;
import H5.T;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzaao extends zzacx<Object, T> {
    private final String zzy;
    private final String zzz;

    public zzaao(String str, String str2) {
        super(3);
        r.h(str, "email cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zze(this.zzy, this.zzz, this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
        zzb(new C0621l(this.zzl.zza() == null ? zzap.zzh() : (List) r.m(this.zzl.zza())));
    }
}
