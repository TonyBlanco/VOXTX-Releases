package com.google.android.gms.internal.cast;

import android.animation.Animator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeb extends zzdz {
    protected final Animator zza;
    private int zzc;
    private final zzef zzd = new zzea(this);
    private final int zzb = -1;

    private zzeb(Animator animator, int i9, Runnable runnable) {
        this.zza = animator;
    }

    public static void zzd(Animator animator, int i9, Runnable runnable) {
        animator.addListener(new zzeb(animator, -1, null));
    }

    public static /* bridge */ /* synthetic */ boolean zze(zzeb zzebVar) {
        return zzebVar.zzb != -1 && zzebVar.zzc >= 0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (zza(animator)) {
            return;
        }
        zzei.zzb().zza(this.zzd);
    }
}
