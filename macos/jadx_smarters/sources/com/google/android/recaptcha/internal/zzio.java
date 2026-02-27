package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzio extends zziy {
    public zzio(int i9) {
        super(i9, null);
    }

    @Override // com.google.android.recaptcha.internal.zziy
    public final void zza() {
        if (!zzj()) {
            for (int i9 = 0; i9 < zzb(); i9++) {
                ((zzgd) zzg(i9).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzgd) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
