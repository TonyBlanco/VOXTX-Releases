package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzahn extends zzahj<Boolean> implements zzajj<Boolean>, zzakz, RandomAccess {
    private static final zzahn zza = new zzahn(new boolean[0], 0, false);
    private boolean[] zzb;
    private int zzc;

    public zzahn() {
        this(new boolean[10], 0, true);
    }

    private zzahn(boolean[] zArr, int i9, boolean z9) {
        super(z9);
        this.zzb = zArr;
        this.zzc = i9;
    }

    private final String zzb(int i9) {
        return "Index:" + i9 + ", Size:" + this.zzc;
    }

    private final void zzc(int i9) {
        if (i9 < 0 || i9 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzb(i9));
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i9 < 0 || i9 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzb(i9));
        }
        boolean[] zArr = this.zzb;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i9, zArr, i9 + 1, i10 - i9);
        } else {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i9);
            System.arraycopy(this.zzb, i9, zArr2, i9 + 1, this.zzc - i9);
            this.zzb = zArr2;
        }
        this.zzb[i9] = zBooleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zza();
        zzajf.zza(collection);
        if (!(collection instanceof zzahn)) {
            return super.addAll(collection);
        }
        zzahn zzahnVar = (zzahn) collection;
        int i9 = zzahnVar.zzc;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (a.e.API_PRIORITY_OTHER - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        boolean[] zArr = this.zzb;
        if (i11 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(zzahnVar.zzb, 0, this.zzb, this.zzc, zzahnVar.zzc);
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
        if (!(obj instanceof zzahn)) {
            return super.equals(obj);
        }
        zzahn zzahnVar = (zzahn) obj;
        if (this.zzc != zzahnVar.zzc) {
            return false;
        }
        boolean[] zArr = zzahnVar.zzb;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (this.zzb[i9] != zArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        zzc(i9);
        return Boolean.valueOf(this.zzb[i9]);
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
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.zzb[i9] == zBooleanValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i9) {
        zza();
        zzc(i9);
        boolean[] zArr = this.zzb;
        boolean z9 = zArr[i9];
        if (i9 < this.zzc - 1) {
            System.arraycopy(zArr, i9 + 1, zArr, i9, (r2 - i9) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        zza();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i10, zArr, i9, this.zzc - i10);
        this.zzc -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i9, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzc(i9);
        boolean[] zArr = this.zzb;
        boolean z9 = zArr[i9];
        zArr[i9] = zBooleanValue;
        return Boolean.valueOf(z9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajj
    public final /* synthetic */ zzajj<Boolean> zza(int i9) {
        if (i9 >= this.zzc) {
            return new zzahn(Arrays.copyOf(this.zzb, i9), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zza(boolean z9) {
        zza();
        int i9 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i9 == zArr.length) {
            boolean[] zArr2 = new boolean[((i9 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i9);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zArr3[i10] = z9;
    }
}
