package com.google.android.gms.internal.cast;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class zzre implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzrm zzrmVar = (zzrm) obj;
        zzrm zzrmVar2 = (zzrm) obj2;
        zzrd zzrdVar = new zzrd(zzrmVar);
        zzrd zzrdVar2 = new zzrd(zzrmVar2);
        while (zzrdVar.hasNext() && zzrdVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzrdVar.zza() & 255).compareTo(Integer.valueOf(zzrdVar2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzrmVar.zzd()).compareTo(Integer.valueOf(zzrmVar2.zzd()));
    }
}
