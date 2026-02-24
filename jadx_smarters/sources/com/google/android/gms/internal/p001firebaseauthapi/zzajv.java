package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzajv extends zzajs {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzajv() {
        super();
    }

    private static <L> List<L> zza(Object obj, long j9, int i9) {
        List<L> listZza;
        Object obj2;
        List<L> listZzc = zzc(obj, j9);
        if (!listZzc.isEmpty()) {
            if (zza.isAssignableFrom(listZzc.getClass())) {
                ArrayList arrayList = new ArrayList(listZzc.size() + i9);
                arrayList.addAll(listZzc);
                obj2 = arrayList;
            } else if (listZzc instanceof zzamf) {
                zzajq zzajqVar = new zzajq(listZzc.size() + i9);
                zzajqVar.addAll((zzamf) listZzc);
                obj2 = zzajqVar;
            } else {
                if (!(listZzc instanceof zzakz) || !(listZzc instanceof zzajj)) {
                    return listZzc;
                }
                zzajj zzajjVar = (zzajj) listZzc;
                if (zzajjVar.zzc()) {
                    return listZzc;
                }
                listZza = zzajjVar.zza(listZzc.size() + i9);
            }
            zzamk.zza(obj, j9, obj2);
            return (List<L>) obj2;
        }
        listZza = listZzc instanceof zzajt ? new zzajq(i9) : ((listZzc instanceof zzakz) && (listZzc instanceof zzajj)) ? ((zzajj) listZzc).zza(i9) : new ArrayList<>(i9);
        zzamk.zza(obj, j9, listZza);
        return listZza;
    }

    private static <E> List<E> zzc(Object obj, long j9) {
        return (List) zzamk.zze(obj, j9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajs
    public final <L> List<L> zza(Object obj, long j9) {
        return zza(obj, j9, 10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajs
    public final <E> void zza(Object obj, Object obj2, long j9) {
        List listZzc = zzc(obj2, j9);
        List listZza = zza(obj, j9, listZzc.size());
        int size = listZza.size();
        int size2 = listZzc.size();
        if (size > 0 && size2 > 0) {
            listZza.addAll(listZzc);
        }
        if (size > 0) {
            listZzc = listZza;
        }
        zzamk.zza(obj, j9, listZzc);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajs
    public final void zzb(Object obj, long j9) {
        Object objUnmodifiableList;
        List list = (List) zzamk.zze(obj, j9);
        if (list instanceof zzajt) {
            objUnmodifiableList = ((zzajt) list).zzd();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzakz) && (list instanceof zzajj)) {
                zzajj zzajjVar = (zzajj) list;
                if (zzajjVar.zzc()) {
                    zzajjVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzamk.zza(obj, j9, objUnmodifiableList);
    }
}
