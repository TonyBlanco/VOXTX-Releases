package com.google.android.gms.internal.cast;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzt implements View.OnClickListener {
    final /* synthetic */ zzy zza;

    public zzt(zzy zzyVar) {
        this.zza = zzyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Iterator it = this.zza.zzj.iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).zze();
        }
    }
}
