package com.google.android.gms.internal.cast;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfe extends zzfb {
    public zzfe() {
        super(4);
    }

    public final zzfe zzb(Object obj) {
        obj.getClass();
        int i9 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i9) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.zza;
            int i10 = this.zzb;
            this.zzb = i10 + 1;
            objArr2[i10] = obj;
            return this;
        }
        this.zza = Arrays.copyOf(objArr, zzfc.zza(length, i9));
        this.zzc = false;
        Object[] objArr22 = this.zza;
        int i102 = this.zzb;
        this.zzb = i102 + 1;
        objArr22[i102] = obj;
        return this;
    }

    public final zzfh zzc() {
        this.zzc = true;
        return zzfh.zzi(this.zza, this.zzb);
    }
}
