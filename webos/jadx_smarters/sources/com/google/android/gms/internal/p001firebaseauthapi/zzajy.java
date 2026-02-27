package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzajy extends zzahj<Long> implements zzajj<Long>, zzakz, RandomAccess {
    private static final zzajy zza = new zzajy(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    public zzajy() {
        this(new long[10], 0, true);
    }

    private zzajy(long[] jArr, int i9, boolean z9) {
        super(z9);
        this.zzb = jArr;
        this.zzc = i9;
    }

    private final String zzc(int i9) {
        return "Index:" + i9 + ", Size:" + this.zzc;
    }

    private final void zzd(int i9) {
        if (i9 < 0 || i9 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzc(i9));
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i9 < 0 || i9 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzc(i9));
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

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zza();
        zzajf.zza(collection);
        if (!(collection instanceof zzajy)) {
            return super.addAll(collection);
        }
        zzajy zzajyVar = (zzajy) collection;
        int i9 = zzajyVar.zzc;
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
        System.arraycopy(zzajyVar.zzb, 0, this.zzb, this.zzc, zzajyVar.zzc);
        this.zzc = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzajy)) {
            return super.equals(obj);
        }
        zzajy zzajyVar = (zzajy) obj;
        if (this.zzc != zzajyVar.zzc) {
            return false;
        }
        long[] jArr = zzajyVar.zzb;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (this.zzb[i9] != jArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        return Long.valueOf(zzb(i9));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            iZza = (iZza * 31) + zzajf.zza(this.zzb[i9]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.zzb[i9] == jLongValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i9) {
        zza();
        zzd(i9);
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

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i9, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzd(i9);
        long[] jArr = this.zzb;
        long j9 = jArr[i9];
        jArr[i9] = jLongValue;
        return Long.valueOf(j9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajj
    public final /* synthetic */ zzajj<Long> zza(int i9) {
        if (i9 >= this.zzc) {
            return new zzajy(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zza(long j9) {
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
        jArr3[i10] = j9;
    }

    public final long zzb(int i9) {
        zzd(i9);
        return this.zzb[i9];
    }
}
