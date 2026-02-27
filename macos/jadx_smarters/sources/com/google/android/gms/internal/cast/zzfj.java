package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfj {
    Object[] zza;
    int zzb;
    zzfi zzc;

    public zzfj() {
        this(4);
    }

    public zzfj(int i9) {
        this.zza = new Object[i9 + i9];
        this.zzb = 0;
    }

    private final void zzb(int i9) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i10 = i9 + i9;
        if (i10 > length) {
            this.zza = Arrays.copyOf(objArr, zzfc.zza(length, i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfj zza(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzb(this.zzb + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzb(this.zzb + 1);
            zzey.zza(key, value);
            Object[] objArr = this.zza;
            int i9 = this.zzb;
            int i10 = i9 + i9;
            objArr[i10] = key;
            objArr[i10 + 1] = value;
            this.zzb = i9 + 1;
        }
        return this;
    }
}
