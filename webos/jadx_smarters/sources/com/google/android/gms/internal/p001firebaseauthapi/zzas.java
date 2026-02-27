package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzas<K, V> {
    zzav zza;
    private Object[] zzb;
    private int zzc;
    private boolean zzd;

    public zzas() {
        this(4);
    }

    public zzas(int i9) {
        this.zzb = new Object[i9 * 2];
        this.zzc = 0;
        this.zzd = false;
    }

    private final void zza(int i9) {
        int i10 = i9 << 1;
        Object[] objArr = this.zzb;
        if (i10 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzam.zza(objArr.length, i10));
            this.zzd = false;
        }
    }

    public final zzas<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(this.zzc + ((Collection) iterable).size());
        }
        for (Map.Entry<? extends K, ? extends V> entry : iterable) {
            K key = entry.getKey();
            V value = entry.getValue();
            zza(this.zzc + 1);
            zzai.zza(key, value);
            Object[] objArr = this.zzb;
            int i9 = this.zzc;
            objArr[i9 * 2] = key;
            objArr[(i9 * 2) + 1] = value;
            this.zzc = i9 + 1;
        }
        return this;
    }

    public final zzat<K, V> zza() {
        zzav zzavVar = this.zza;
        if (zzavVar != null) {
            throw zzavVar.zza();
        }
        int i9 = this.zzc;
        Object[] objArr = this.zzb;
        this.zzd = true;
        zzaw zzawVarZza = zzaw.zza(i9, objArr, this);
        zzav zzavVar2 = this.zza;
        if (zzavVar2 == null) {
            return zzawVarZza;
        }
        throw zzavVar2.zza();
    }
}
