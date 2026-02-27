package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l8.h;
import l8.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbz implements zzby {

    @NotNull
    public static final zzbz zza = new zzbz();

    private zzbz() {
    }

    @Nullable
    public static final List zzc(@NotNull Object obj) {
        if (obj instanceof byte[]) {
            return h.O((byte[]) obj);
        }
        if (obj instanceof short[]) {
            return h.U((short[]) obj);
        }
        if (obj instanceof int[]) {
            return h.R((int[]) obj);
        }
        if (obj instanceof long[]) {
            return h.S((long[]) obj);
        }
        if (obj instanceof float[]) {
            return h.Q((float[]) obj);
        }
        if (obj instanceof double[]) {
            return h.P((double[]) obj);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i9, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        if (objArr.length != 2) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Object)) {
            obj = null;
        }
        if (obj == null) {
            throw new zzt(4, 5, null);
        }
        Object obj2 = objArr[1];
        if (true != (obj2 instanceof Object)) {
            obj2 = null;
        }
        if (obj2 == null) {
            throw new zzt(4, 5, null);
        }
        zzblVar.zzc().zzf(i9, zzb(obj, obj2));
    }

    @NotNull
    public final Object zzb(@NotNull Object obj, @NotNull Object obj2) throws zzt {
        List listZzc = zzc(obj);
        List listZzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (listZzc2 != null) {
                ArrayList arrayList = new ArrayList(l.o(listZzc2, 10));
                Iterator it = listZzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (listZzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(l.o(listZzc, 10));
            Iterator it2 = listZzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (listZzc == null || listZzc2 == null) {
            throw new zzt(4, 5, null);
        }
        zzbx.zzb(this, listZzc.size(), listZzc2.size());
        int size = listZzc.size();
        Double[] dArr = new Double[size];
        for (int i9 = 0; i9 < size; i9++) {
            dArr[i9] = Double.valueOf(Math.pow(((Number) listZzc.get(i9)).doubleValue(), ((Number) listZzc2.get(i9)).doubleValue()));
        }
        return dArr;
    }
}
