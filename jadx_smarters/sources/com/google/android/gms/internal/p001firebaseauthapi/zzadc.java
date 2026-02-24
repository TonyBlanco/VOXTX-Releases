package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzadc implements Runnable {
    private final /* synthetic */ zzadf zza;
    private final /* synthetic */ zzacz zzb;

    public zzadc(zzacz zzaczVar, zzadf zzadfVar) {
        this.zzb = zzaczVar;
        this.zza = zzadfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zza.zzh) {
            try {
                if (!this.zzb.zza.zzh.isEmpty()) {
                    this.zza.zza(this.zzb.zza.zzh.get(0), new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
