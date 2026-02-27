package com.google.android.gms.internal.p001firebaseauthapi;

import G5.C0555w;
import H5.AbstractC0630v;
import H5.T;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzaap extends zzacx<C0555w, T> {
    private final String zzy;

    public zzaap(String str) {
        super(1);
        r.h(str, "refresh token cannot be null");
        this.zzy = str;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "getAccessToken";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zzb(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzy);
        }
        ((T) this.zze).a(this.zzj, this.zzd);
        zzb(AbstractC0630v.a(this.zzj.zzc()));
    }
}
