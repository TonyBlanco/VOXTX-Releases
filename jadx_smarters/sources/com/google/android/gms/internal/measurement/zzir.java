package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzir {
    public static zzim zza(zzim zzimVar) {
        return ((zzimVar instanceof zzip) || (zzimVar instanceof zzin)) ? zzimVar : zzimVar instanceof Serializable ? new zzin(zzimVar) : new zzip(zzimVar);
    }

    public static zzim zzb(Object obj) {
        return new zziq(obj);
    }
}
