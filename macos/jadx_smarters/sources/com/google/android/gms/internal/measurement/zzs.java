package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z9, boolean z10) {
        super("log");
        this.zzc = zztVar;
        this.zza = z9;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        List arrayList;
        zzr zzrVar;
        zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            this.zzc.zza.zza(3, zzgVar.zzb((zzap) list.get(0)).zzi(), Collections.emptyList(), this.zza, this.zzb);
        } else {
            int iZzb = zzh.zzb(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
            int i9 = iZzb != 2 ? iZzb != 3 ? iZzb != 5 ? iZzb != 6 ? 3 : 2 : 5 : 1 : 4;
            String strZzi = zzgVar.zzb((zzap) list.get(1)).zzi();
            if (list.size() == 2) {
                zzrVar = this.zzc.zza;
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList();
                for (int i10 = 2; i10 < Math.min(list.size(), 5); i10++) {
                    arrayList.add(zzgVar.zzb((zzap) list.get(i10)).zzi());
                }
                zzrVar = this.zzc.zza;
            }
            zzrVar.zza(i9, strZzi, arrayList, this.zza, this.zzb);
        }
        return zzap.zzf;
    }
}
