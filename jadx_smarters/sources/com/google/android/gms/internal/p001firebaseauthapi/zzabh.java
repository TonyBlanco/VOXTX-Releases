package com.google.android.gms.internal.p001firebaseauthapi;

import G5.C0537d;
import H5.T;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzabh extends zzacx<Void, T> {
    private final zzyc zzy;
    private final String zzz;

    public zzabh(String str, C0537d c0537d, String str2, String str3, String str4) {
        super(4);
        r.h(str, "email cannot be null or empty");
        this.zzy = new zzyc(str, c0537d, str2, str3);
        this.zzz = str4;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
        zzb(null);
    }
}
