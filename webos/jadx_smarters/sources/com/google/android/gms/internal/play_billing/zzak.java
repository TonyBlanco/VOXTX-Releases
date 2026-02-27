package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzak {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzaj zzc;

    public final zzak zza(Object obj, Object obj2) {
        int i9 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i10 = i9 + i9;
        if (i10 > length) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int iHighestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = iHighestOneBit + iHighestOneBit;
            }
            if (i11 < 0) {
                i11 = a.e.API_PRIORITY_OTHER;
            }
            this.zza = Arrays.copyOf(objArr, i11);
        }
        zzad.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i12 = this.zzb;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.zzb = i12 + 1;
        return this;
    }

    public final zzal zzb() {
        zzaj zzajVar = this.zzc;
        if (zzajVar != null) {
            throw zzajVar.zza();
        }
        zzat zzatVarZzg = zzat.zzg(this.zzb, this.zza, this);
        zzaj zzajVar2 = this.zzc;
        if (zzajVar2 == null) {
            return zzatVarZzg;
        }
        throw zzajVar2.zza();
    }
}
