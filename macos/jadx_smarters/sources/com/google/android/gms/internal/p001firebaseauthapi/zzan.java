package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class zzan<E> extends zzam<E> {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzan(int i9) {
        zzai.zza(4, "initialCapacity");
        this.zza = new Object[4];
        this.zzb = 0;
    }

    public zzan<E> zza(E e9) {
        zzy.zza(e9);
        int i9 = this.zzb + 1;
        Object[] objArr = this.zza;
        if (objArr.length >= i9) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.zza;
            int i10 = this.zzb;
            this.zzb = i10 + 1;
            objArr2[i10] = e9;
            return this;
        }
        this.zza = Arrays.copyOf(objArr, zzam.zza(objArr.length, i9));
        this.zzc = false;
        Object[] objArr22 = this.zza;
        int i102 = this.zzb;
        this.zzb = i102 + 1;
        objArr22[i102] = e9;
        return this;
    }
}
