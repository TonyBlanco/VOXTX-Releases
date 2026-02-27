package com.google.android.gms.internal.cast;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
final class zzu implements View.OnClickListener {
    final /* synthetic */ zzy zza;

    public zzu(zzy zzyVar) {
        this.zza = zzyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.dismiss();
    }
}
