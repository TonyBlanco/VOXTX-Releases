package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzix extends zziu {
    public zzix() {
        super(4);
    }

    public final zzix zza(Object... objArr) {
        zzjd.zzb(objArr, 15);
        int i9 = this.zzb;
        int i10 = i9 + 15;
        Object[] objArr2 = this.zza;
        int length = objArr2.length;
        if (length >= i10) {
            if (this.zzc) {
                this.zza = (Object[]) objArr2.clone();
            }
            System.arraycopy(objArr, 0, this.zza, this.zzb, 15);
            this.zzb += 15;
            return this;
        }
        int i11 = length + (length >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i9 + 14);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            i11 = a.e.API_PRIORITY_OTHER;
        }
        this.zza = Arrays.copyOf(objArr2, i11);
        this.zzc = false;
        System.arraycopy(objArr, 0, this.zza, this.zzb, 15);
        this.zzb += 15;
        return this;
    }

    public final zzja zzb() {
        this.zzc = true;
        return zzja.zzg(this.zza, this.zzb);
    }
}
