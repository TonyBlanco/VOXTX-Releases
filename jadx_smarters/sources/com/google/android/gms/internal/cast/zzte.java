package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzte extends zzra implements RandomAccess, zzso, zztw {
    private static final zzte zza = new zzte(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    public zzte() {
        this(new long[10], 0, true);
    }

    private zzte(long[] jArr, int i9, boolean z9) {
        super(z9);
        this.zzb = jArr;
        this.zzc = i9;
    }

    public static zzte zze() {
        return zza;
    }

    private final String zzf(int i9) {
        return "Index:" + i9 + ", Size:" + this.zzc;
    }

    private final void zzh(int i9) {
        if (i9 < 0 || i9 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i9));
        }
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i9 < 0 || i9 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i9));
        }
        long[] jArr = this.zzb;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i9, jArr, i9 + 1, i10 - i9);
        } else {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i9);
            System.arraycopy(this.zzb, i9, jArr2, i9 + 1, this.zzc - i9);
            this.zzb = jArr2;
        }
        this.zzb[i9] = jLongValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        int i9 = this.zzc;
        long[] jArr = this.zzb;
        if (i9 == jArr.length) {
            long[] jArr2 = new long[((i9 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i9);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        jArr3[i10] = jLongValue;
        return true;
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzsq.zzd;
        collection.getClass();
        if (!(collection instanceof zzte)) {
            return super.addAll(collection);
        }
        zzte zzteVar = (zzte) collection;
        int i9 = zzteVar.zzc;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (a.e.API_PRIORITY_OTHER - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        long[] jArr = this.zzb;
        if (i11 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(zzteVar.zzb, 0, this.zzb, this.zzc, zzteVar.zzc);
        this.zzc = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzte)) {
            return super.equals(obj);
        }
        zzte zzteVar = (zzte) obj;
        if (this.zzc != zzteVar.zzc) {
            return false;
        }
        long[] jArr = zzteVar.zzb;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (this.zzb[i9] != jArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        zzh(i9);
        return Long.valueOf(this.zzb[i9]);
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            long j9 = this.zzb[i10];
            byte[] bArr = zzsq.zzd;
            i9 = (i9 * 31) + ((int) (j9 ^ (j9 >>> 32)));
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i9 = this.zzc;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.zzb[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zza();
        zzh(i9);
        long[] jArr = this.zzb;
        long j9 = jArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(jArr, i9 + 1, jArr, i9, (r3 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zza();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i10, jArr, i9, this.zzc - i10);
        this.zzc -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzh(i9);
        long[] jArr = this.zzb;
        long j9 = jArr[i9];
        jArr[i9] = jLongValue;
        return Long.valueOf(j9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final long zzd(int i9) {
        zzh(i9);
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.cast.zzsp
    public final /* bridge */ /* synthetic */ zzsp zzg(int i9) {
        if (i9 >= this.zzc) {
            return new zzte(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }
}
