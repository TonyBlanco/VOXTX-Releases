package com.google.android.gms.internal.p001firebaseauthapi;

import G5.C0537d;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzabz extends zzacx<Void, Void> {
    private final zzyi zzy;

    public zzabz(String str, String str2, C0537d c0537d) {
        super(6);
        r.g(str);
        r.g(str2);
        r.m(c0537d);
        this.zzy = new zzyi(str, str2, c0537d);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "verifyBeforeUpdateEmail";
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
