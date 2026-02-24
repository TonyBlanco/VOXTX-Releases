package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzhi extends zzhm {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzhi() {
        super(null);
    }

    public /* synthetic */ zzhi(zzhh zzhhVar) {
        super(null);
    }

    private static List zzf(Object obj, long j9, int i9) {
        List list;
        List list2 = (List) zzjp.zzf(obj, j9);
        if (list2.isEmpty()) {
            List zzhfVar = list2 instanceof zzhg ? new zzhf(i9) : ((list2 instanceof zzig) && (list2 instanceof zzgv)) ? ((zzgv) list2).zzd(i9) : new ArrayList(i9);
            zzjp.zzs(obj, j9, zzhfVar);
            return zzhfVar;
        }
        if (zza.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i9);
            arrayList.addAll(list2);
            list = arrayList;
        } else {
            if (!(list2 instanceof zzjk)) {
                if (!(list2 instanceof zzig) || !(list2 instanceof zzgv)) {
                    return list2;
                }
                zzgv zzgvVar = (zzgv) list2;
                if (zzgvVar.zzc()) {
                    return list2;
                }
                zzgv zzgvVarZzd = zzgvVar.zzd(list2.size() + i9);
                zzjp.zzs(obj, j9, zzgvVarZzd);
                return zzgvVarZzd;
            }
            zzhf zzhfVar2 = new zzhf(list2.size() + i9);
            zzhfVar2.addAll(zzhfVar2.size(), (zzjk) list2);
            list = zzhfVar2;
        }
        zzjp.zzs(obj, j9, list);
        return list;
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    public final List zza(Object obj, long j9) {
        return zzf(obj, j9, 10);
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    public final void zzb(Object obj, long j9) {
        Object objUnmodifiableList;
        List list = (List) zzjp.zzf(obj, j9);
        if (list instanceof zzhg) {
            objUnmodifiableList = ((zzhg) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzig) && (list instanceof zzgv)) {
                zzgv zzgvVar = (zzgv) list;
                if (zzgvVar.zzc()) {
                    zzgvVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzjp.zzs(obj, j9, objUnmodifiableList);
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    public final void zzc(Object obj, Object obj2, long j9) {
        List list = (List) zzjp.zzf(obj2, j9);
        List listZzf = zzf(obj, j9, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzjp.zzs(obj, j9, list);
    }
}
