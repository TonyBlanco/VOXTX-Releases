package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzaa(int i9) {
    }

    public final zzaa zza(Object obj) {
        obj.getClass();
        int i9 = this.zzb;
        int i10 = i9 + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i10) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.zza;
            int i11 = this.zzb;
            this.zzb = i11 + 1;
            objArr2[i11] = obj;
            return this;
        }
        int i12 = length + (length >> 1) + 1;
        if (i12 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i9);
            i12 = iHighestOneBit + iHighestOneBit;
        }
        if (i12 < 0) {
            i12 = a.e.API_PRIORITY_OTHER;
        }
        this.zza = Arrays.copyOf(objArr, i12);
        this.zzc = false;
        Object[] objArr22 = this.zza;
        int i112 = this.zzb;
        this.zzb = i112 + 1;
        objArr22[i112] = obj;
        return this;
    }
}
