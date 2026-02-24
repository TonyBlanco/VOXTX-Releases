package com.google.android.gms.internal.cast;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzud extends zzun {
    public zzud(int i9) {
        super(i9, null);
    }

    @Override // com.google.android.gms.internal.cast.zzun
    public final void zza() {
        if (!zzj()) {
            for (int i9 = 0; i9 < zzb(); i9++) {
                Map.Entry entryZzg = zzg(i9);
                if (((zzsa) entryZzg.getKey()).zzc()) {
                    entryZzg.setValue(Collections.unmodifiableList((List) entryZzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzsa) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
