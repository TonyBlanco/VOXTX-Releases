package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzalj extends zzalg {
    public zzalj(int i9) {
        super(i9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzalg
    public final void zzd() {
        if (!zze()) {
            for (int i9 = 0; i9 < zza(); i9++) {
                Map.Entry entryZzb = zzb(i9);
                if (((zzaix) entryZzb.getKey()).zze()) {
                    entryZzb.setValue(Collections.unmodifiableList((List) entryZzb.getValue()));
                }
            }
            for (Map.Entry entry : zzb()) {
                if (((zzaix) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
