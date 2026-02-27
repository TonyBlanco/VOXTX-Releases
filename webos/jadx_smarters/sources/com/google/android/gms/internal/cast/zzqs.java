package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.zzpy;

/* JADX INFO: loaded from: classes3.dex */
final class zzqs extends zzpy.zzi implements Runnable {
    private final Runnable zzb;

    public zzqs(Runnable runnable) {
        runnable.getClass();
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.run();
        } catch (Error | RuntimeException e9) {
            zzl(e9);
            throw e9;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzpy
    public final String zze() {
        return "task=[" + this.zzb.toString() + "]";
    }
}
