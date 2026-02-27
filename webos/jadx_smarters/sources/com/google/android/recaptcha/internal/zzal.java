package com.google.android.recaptcha.internal;

import G8.AbstractC0579k;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class zzal extends TimerTask {
    final /* synthetic */ zzao zza;

    public zzal(zzao zzaoVar) {
        this.zza = zzaoVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        AbstractC0579k.d(this.zza.zzd, null, null, new zzam(this.zza, null), 3, null);
    }
}
