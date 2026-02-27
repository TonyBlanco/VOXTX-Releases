package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfl extends zzfd implements Set {
    private transient zzfh zza;

    public static int zzh(int i9) {
        int iMax = Math.max(i9, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzfl zzj(Collection collection) {
        Object[] array = collection.toArray();
        return zzm(array.length, array);
    }

    public static zzfl zzk() {
        return zzfu.zza;
    }

    private static zzfl zzm(int i9, Object... objArr) {
        if (i9 == 0) {
            return zzfu.zza;
        }
        if (i9 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzfw(obj);
        }
        int iZzh = zzh(i9);
        Object[] objArr2 = new Object[iZzh];
        int i10 = iZzh - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            Object obj2 = objArr[i13];
            zzfn.zza(obj2, i13);
            int iHashCode = obj2.hashCode();
            int iZza = zzfa.zza(iHashCode);
            while (true) {
                int i14 = iZza & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i12, i9, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzfw(obj4);
        }
        if (zzh(i12) < iZzh / 2) {
            return zzm(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new zzfu(objArr, i11, objArr2, i10, i12);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfl) && zzl() && ((zzfl) obj).zzl() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfv.zza(this);
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public zzfh zzd() {
        zzfh zzfhVar = this.zza;
        if (zzfhVar != null) {
            return zzfhVar;
        }
        zzfh zzfhVarZzi = zzi();
        this.zza = zzfhVarZzi;
        return zzfhVarZzi;
    }

    @Override // com.google.android.gms.internal.cast.zzfd, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze */
    public abstract zzfx iterator();

    public zzfh zzi() {
        Object[] array = toArray();
        int i9 = zzfh.zzd;
        return zzfh.zzi(array, array.length);
    }

    public boolean zzl() {
        return false;
    }
}
