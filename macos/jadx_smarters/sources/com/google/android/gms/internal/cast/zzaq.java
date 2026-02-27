package com.google.android.gms.internal.cast;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.gms.cast.framework.internal.featurehighlight.g;
import com.google.android.gms.cast.framework.internal.featurehighlight.h;
import o4.W;

/* JADX INFO: loaded from: classes3.dex */
final class zzaq implements g {
    final /* synthetic */ Activity zza;
    final /* synthetic */ h zzb;
    final /* synthetic */ zzar zzc;

    public zzaq(zzar zzarVar, Activity activity, h hVar) {
        this.zzc = zzarVar;
        this.zza = activity;
        this.zzb = hVar;
    }

    @Override // com.google.android.gms.cast.framework.internal.featurehighlight.g
    public final void zza() {
        if (this.zzc.zzf) {
            W.a(this.zza);
            h hVar = this.zzb;
            final Activity activity = this.zza;
            hVar.h(new Runnable() { // from class: com.google.android.gms.internal.cast.zzao
                @Override // java.lang.Runnable
                public final void run() {
                    zzaq zzaqVar = this.zza;
                    Activity activity2 = activity;
                    if (zzaqVar.zzc.zzf) {
                        ((ViewGroup) activity2.getWindow().getDecorView()).removeView(zzaqVar.zzc);
                        zzar.zza(zzaqVar.zzc);
                        zzaqVar.zzc.zzd();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.cast.framework.internal.featurehighlight.g
    public final void zzb() {
        if (this.zzc.zzf) {
            W.a(this.zza);
            h hVar = this.zzb;
            final Activity activity = this.zza;
            hVar.g(new Runnable() { // from class: com.google.android.gms.internal.cast.zzap
                @Override // java.lang.Runnable
                public final void run() {
                    zzaq zzaqVar = this.zza;
                    Activity activity2 = activity;
                    if (zzaqVar.zzc.zzf) {
                        ((ViewGroup) activity2.getWindow().getDecorView()).removeView(zzaqVar.zzc);
                        zzar.zza(zzaqVar.zzc);
                        zzaqVar.zzc.zzd();
                    }
                }
            });
        }
    }
}
