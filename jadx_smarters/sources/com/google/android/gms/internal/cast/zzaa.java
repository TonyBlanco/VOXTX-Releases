package com.google.android.gms.internal.cast;

import androidx.mediarouter.app.b;
import androidx.mediarouter.app.e;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaa extends e {
    private static zzaa zza;

    public zzaa() {
        zzr.zzd(zzln.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED);
    }

    public static zzaa zza() {
        if (zza == null) {
            zza = new zzaa();
        }
        return zza;
    }

    @Override // androidx.mediarouter.app.e
    public final b onCreateChooserDialogFragment() {
        return new zzz();
    }
}
