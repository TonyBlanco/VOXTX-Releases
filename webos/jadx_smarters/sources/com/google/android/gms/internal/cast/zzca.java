package com.google.android.gms.internal.cast;

import android.view.View;
import o4.C2328e;
import r4.AbstractC2660a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzca extends AbstractC2660a {
    private final View zza;

    public zzca(View view) {
        this.zza = view;
        view.setEnabled(false);
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        this.zza.setEnabled(true);
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        this.zza.setEnabled(false);
        super.onSessionEnded();
    }
}
