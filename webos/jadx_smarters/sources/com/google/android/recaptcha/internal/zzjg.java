package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzjg {
    private static final zzjg zza = new zzjg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzjg() {
        this(0, new int[8], new Object[8], true);
    }

    private zzjg(int i9, int[] iArr, Object[] objArr, boolean z9) {
        this.zze = -1;
        this.zzb = i9;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z9;
    }

    public static zzjg zzc() {
        return zza;
    }

    public static zzjg zze(zzjg zzjgVar, zzjg zzjgVar2) {
        int i9 = zzjgVar.zzb + zzjgVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzjgVar.zzc, i9);
        System.arraycopy(zzjgVar2.zzc, 0, iArrCopyOf, zzjgVar.zzb, zzjgVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzjgVar.zzd, i9);
        System.arraycopy(zzjgVar2.zzd, 0, objArrCopyOf, zzjgVar.zzb, zzjgVar2.zzb);
        return new zzjg(i9, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzjg zzf() {
        return new zzjg(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i9) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzjg)) {
            return false;
        }
        zzjg zzjgVar = (zzjg) obj;
        int i9 = this.zzb;
        if (i9 == zzjgVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzjgVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzjgVar.zzd;
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
        int i10 = i9 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i9; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 * 31) + i11;
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return (i13 * 31) + iHashCode;
    }

    public final int zza() {
        int iZzz;
        int iZzy;
        int iZzy2;
        int i9 = this.zze;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.zzd[i11]).longValue();
                    iZzy2 = zzfk.zzy(i13 << 3) + 8;
                } else if (i14 == 2) {
                    zzez zzezVar = (zzez) this.zzd[i11];
                    int i15 = zzfk.zzb;
                    int iZzd = zzezVar.zzd();
                    iZzy2 = zzfk.zzy(i13 << 3) + zzfk.zzy(iZzd) + iZzd;
                } else if (i14 == 3) {
                    int i16 = i13 << 3;
                    int i17 = zzfk.zzb;
                    iZzz = ((zzjg) this.zzd[i11]).zza();
                    int iZzy3 = zzfk.zzy(i16);
                    iZzy = iZzy3 + iZzy3;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(zzgy.zza());
                    }
                    ((Integer) this.zzd[i11]).intValue();
                    iZzy2 = zzfk.zzy(i13 << 3) + 4;
                }
                i10 += iZzy2;
            } else {
                int i18 = i13 << 3;
                iZzz = zzfk.zzz(((Long) this.zzd[i11]).longValue());
                iZzy = zzfk.zzy(i18);
            }
            iZzy2 = iZzy + iZzz;
            i10 += iZzy2;
        }
        this.zze = i10;
        return i10;
    }

    public final int zzb() {
        int i9 = this.zze;
        if (i9 != -1) {
            return i9;
        }
        int iZzy = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10] >>> 3;
            zzez zzezVar = (zzez) this.zzd[i10];
            int i12 = zzfk.zzb;
            int iZzd = zzezVar.zzd();
            int iZzy2 = zzfk.zzy(iZzd) + iZzd;
            int iZzy3 = zzfk.zzy(16);
            int iZzy4 = zzfk.zzy(i11);
            int iZzy5 = zzfk.zzy(8);
            iZzy += iZzy5 + iZzy5 + iZzy3 + iZzy4 + zzfk.zzy(24) + iZzy2;
        }
        this.zze = iZzy;
        return iZzy;
    }

    public final zzjg zzd(zzjg zzjgVar) {
        if (zzjgVar.equals(zza)) {
            return this;
        }
        zzg();
        int i9 = this.zzb + zzjgVar.zzb;
        zzm(i9);
        System.arraycopy(zzjgVar.zzc, 0, this.zzc, this.zzb, zzjgVar.zzb);
        System.arraycopy(zzjgVar.zzd, 0, this.zzd, this.zzb, zzjgVar.zzb);
        this.zzb = i9;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i9) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzia.zzb(sb, i9, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzj(int i9, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i9;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zzk(zzjx zzjxVar) throws IOException {
        for (int i9 = 0; i9 < this.zzb; i9++) {
            zzjxVar.zzw(this.zzc[i9] >>> 3, this.zzd[i9]);
        }
    }

    public final void zzl(zzjx zzjxVar) throws IOException {
        if (this.zzb != 0) {
            for (int i9 = 0; i9 < this.zzb; i9++) {
                int i10 = this.zzc[i9];
                Object obj = this.zzd[i9];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zzjxVar.zzt(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzjxVar.zzm(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzjxVar.zzd(i12, (zzez) obj);
                } else if (i11 == 3) {
                    zzjxVar.zzF(i12);
                    ((zzjg) obj).zzl(zzjxVar);
                    zzjxVar.zzh(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(zzgy.zza());
                    }
                    zzjxVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }
}
