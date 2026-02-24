package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamd {
    private static final zzamd zza = new zzamd(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzamd() {
        this(0, new int[8], new Object[8], true);
    }

    private zzamd(int i9, int[] iArr, Object[] objArr, boolean z9) {
        this.zze = -1;
        this.zzb = i9;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z9;
    }

    public static zzamd zza(zzamd zzamdVar, zzamd zzamdVar2) {
        int i9 = zzamdVar.zzb + zzamdVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzamdVar.zzc, i9);
        System.arraycopy(zzamdVar2.zzc, 0, iArrCopyOf, zzamdVar.zzb, zzamdVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzamdVar.zzd, i9);
        System.arraycopy(zzamdVar2.zzd, 0, objArrCopyOf, zzamdVar.zzb, zzamdVar2.zzb);
        return new zzamd(i9, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zza(int i9) {
        int[] iArr = this.zzc;
        if (i9 > iArr.length) {
            int i10 = this.zzb;
            int i11 = i10 + (i10 / 2);
            if (i11 >= i9) {
                i9 = i11;
            }
            if (i9 < 8) {
                i9 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i9);
            this.zzd = Arrays.copyOf(this.zzd, i9);
        }
    }

    private static void zza(int i9, Object obj, zzana zzanaVar) throws IOException {
        int i10 = i9 >>> 3;
        int i11 = i9 & 7;
        if (i11 == 0) {
            zzanaVar.zzb(i10, ((Long) obj).longValue());
            return;
        }
        if (i11 == 1) {
            zzanaVar.zza(i10, ((Long) obj).longValue());
            return;
        }
        if (i11 == 2) {
            zzanaVar.zza(i10, (zzahp) obj);
            return;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw new RuntimeException(zzaji.zza());
            }
            zzanaVar.zzb(i10, ((Integer) obj).intValue());
        } else if (zzanaVar.zza() == zzand.zza) {
            zzanaVar.zzb(i10);
            ((zzamd) obj).zzb(zzanaVar);
            zzanaVar.zza(i10);
        } else {
            zzanaVar.zza(i10);
            ((zzamd) obj).zzb(zzanaVar);
            zzanaVar.zzb(i10);
        }
    }

    public static zzamd zzc() {
        return zza;
    }

    public static zzamd zzd() {
        return new zzamd();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzamd)) {
            return false;
        }
        zzamd zzamdVar = (zzamd) obj;
        int i9 = this.zzb;
        if (i9 == zzamdVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzamdVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzamdVar.zzd;
                    int i11 = this.zzb;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.zzb;
        int i10 = (i9 + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i9; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }

    public final int zza() {
        int iZze;
        int i9 = this.zze;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iZze = zzaik.zze(i13, ((Long) this.zzd[i11]).longValue());
            } else if (i14 == 1) {
                iZze = zzaik.zza(i13, ((Long) this.zzd[i11]).longValue());
            } else if (i14 == 2) {
                iZze = zzaik.zza(i13, (zzahp) this.zzd[i11]);
            } else if (i14 == 3) {
                iZze = (zzaik.zzi(i13) << 1) + ((zzamd) this.zzd[i11]).zza();
            } else {
                if (i14 != 5) {
                    throw new IllegalStateException(zzaji.zza());
                }
                iZze = zzaik.zzc(i13, ((Integer) this.zzd[i11]).intValue());
            }
            i10 += iZze;
        }
        this.zze = i10;
        return i10;
    }

    public final zzamd zza(zzamd zzamdVar) {
        if (zzamdVar.equals(zza)) {
            return this;
        }
        zzf();
        int i9 = this.zzb + zzamdVar.zzb;
        zza(i9);
        System.arraycopy(zzamdVar.zzc, 0, this.zzc, this.zzb, zzamdVar.zzb);
        System.arraycopy(zzamdVar.zzd, 0, this.zzd, this.zzb, zzamdVar.zzb);
        this.zzb = i9;
        return this;
    }

    public final void zza(int i9, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i9;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zza(zzana zzanaVar) throws IOException {
        if (zzanaVar.zza() == zzand.zzb) {
            for (int i9 = this.zzb - 1; i9 >= 0; i9--) {
                zzanaVar.zza(this.zzc[i9] >>> 3, this.zzd[i9]);
            }
            return;
        }
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzanaVar.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zza(StringBuilder sb, int i9) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzako.zza(sb, i9, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final int zzb() {
        int i9 = this.zze;
        if (i9 != -1) {
            return i9;
        }
        int iZzb = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            iZzb += zzaik.zzb(this.zzc[i10] >>> 3, (zzahp) this.zzd[i10]);
        }
        this.zze = iZzb;
        return iZzb;
    }

    public final void zzb(zzana zzanaVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zzanaVar.zza() == zzand.zza) {
            for (int i9 = 0; i9 < this.zzb; i9++) {
                zza(this.zzc[i9], this.zzd[i9], zzanaVar);
            }
            return;
        }
        for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
            zza(this.zzc[i10], this.zzd[i10], zzanaVar);
        }
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }
}
