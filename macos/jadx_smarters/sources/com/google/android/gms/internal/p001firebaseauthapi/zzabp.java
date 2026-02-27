package com.google.android.gms.internal.p001firebaseauthapi;

import H5.C0620k;
import H5.T;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzabp extends zzacx<Void, T> {
    private final String zzaa;
    private final long zzab;
    private final boolean zzac;
    private final boolean zzad;
    private final String zzae;
    private final String zzaf;
    private final boolean zzag;
    private final String zzy;
    private final String zzz;

    public zzabp(C0620k c0620k, String str, String str2, long j9, boolean z9, boolean z10, String str3, String str4, boolean z11) {
        super(8);
        r.m(c0620k);
        r.g(str);
        this.zzy = r.g(c0620k.H());
        this.zzz = str;
        this.zzaa = str2;
        this.zzab = j9;
        this.zzac = z9;
        this.zzad = z10;
        this.zzae = str3;
        this.zzaf = str4;
        this.zzag = z11;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzae, this.zzaf, this.zzag, this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
    }
}
