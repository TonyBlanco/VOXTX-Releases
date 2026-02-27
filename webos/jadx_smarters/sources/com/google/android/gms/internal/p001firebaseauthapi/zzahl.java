package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzahl {
    public static double zza(byte[] bArr, int i9) {
        return Double.longBitsToDouble(zzd(bArr, i9));
    }

    public static int zza(int i9, byte[] bArr, int i10, int i11, zzahk zzahkVar) throws zzaji {
        if ((i9 >>> 3) == 0) {
            throw zzaji.zzc();
        }
        int i12 = i9 & 7;
        if (i12 == 0) {
            return zzd(bArr, i10, zzahkVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zzc(bArr, i10, zzahkVar) + zzahkVar.zza;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw zzaji.zzc();
        }
        int i13 = (i9 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = zzc(bArr, i10, zzahkVar);
            i14 = zzahkVar.zza;
            if (i14 == i13) {
                break;
            }
            i10 = zza(i14, bArr, i10, i11, zzahkVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw zzaji.zzg();
        }
        return i10;
    }

    public static int zza(int i9, byte[] bArr, int i10, int i11, zzajj<?> zzajjVar, zzahk zzahkVar) {
        zzajd zzajdVar = (zzajd) zzajjVar;
        int iZzc = zzc(bArr, i10, zzahkVar);
        while (true) {
            zzajdVar.zzc(zzahkVar.zza);
            if (iZzc >= i11) {
                break;
            }
            int iZzc2 = zzc(bArr, iZzc, zzahkVar);
            if (i9 != zzahkVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzahkVar);
        }
        return iZzc;
    }

    public static int zza(int i9, byte[] bArr, int i10, int i11, zzamd zzamdVar, zzahk zzahkVar) throws zzaji {
        if ((i9 >>> 3) == 0) {
            throw zzaji.zzc();
        }
        int i12 = i9 & 7;
        if (i12 == 0) {
            int iZzd = zzd(bArr, i10, zzahkVar);
            zzamdVar.zza(i9, Long.valueOf(zzahkVar.zzb));
            return iZzd;
        }
        if (i12 == 1) {
            zzamdVar.zza(i9, Long.valueOf(zzd(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzc = zzc(bArr, i10, zzahkVar);
            int i13 = zzahkVar.zza;
            if (i13 < 0) {
                throw zzaji.zzf();
            }
            if (i13 > bArr.length - iZzc) {
                throw zzaji.zzi();
            }
            zzamdVar.zza(i9, i13 == 0 ? zzahp.zza : zzahp.zza(bArr, iZzc, i13));
            return iZzc + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzaji.zzc();
            }
            zzamdVar.zza(i9, Integer.valueOf(zzc(bArr, i10)));
            return i10 + 4;
        }
        zzamd zzamdVarZzd = zzamd.zzd();
        int i14 = (i9 & (-8)) | 4;
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZzc2 = zzc(bArr, i10, zzahkVar);
            int i16 = zzahkVar.zza;
            i15 = i16;
            if (i16 == i14) {
                i10 = iZzc2;
                break;
            }
            int iZza = zza(i15, bArr, iZzc2, i11, zzamdVarZzd, zzahkVar);
            i15 = i16;
            i10 = iZza;
        }
        if (i10 > i11 || i15 != i14) {
            throw zzaji.zzg();
        }
        zzamdVar.zza(i9, zzamdVarZzd);
        return i10;
    }

    public static int zza(int i9, byte[] bArr, int i10, zzahk zzahkVar) {
        int i11;
        int i12 = i9 & 127;
        int i13 = i10 + 1;
        byte b9 = bArr[i10];
        if (b9 >= 0) {
            i11 = b9 << 7;
        } else {
            int i14 = i12 | ((b9 & 127) << 7);
            int i15 = i10 + 2;
            byte b10 = bArr[i13];
            if (b10 >= 0) {
                zzahkVar.zza = i14 | (b10 << 14);
                return i15;
            }
            i12 = i14 | ((b10 & 127) << 14);
            i13 = i10 + 3;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i11 = b11 << 21;
            } else {
                int i16 = i12 | ((b11 & 127) << 21);
                int i17 = i10 + 4;
                byte b12 = bArr[i13];
                if (b12 >= 0) {
                    zzahkVar.zza = i16 | (b12 << 28);
                    return i17;
                }
                int i18 = i16 | ((b12 & 127) << 28);
                while (true) {
                    int i19 = i17 + 1;
                    if (bArr[i17] >= 0) {
                        zzahkVar.zza = i18;
                        return i19;
                    }
                    i17 = i19;
                }
            }
        }
        zzahkVar.zza = i12 | i11;
        return i13;
    }

    public static int zza(zzalf<?> zzalfVar, int i9, byte[] bArr, int i10, int i11, zzajj<?> zzajjVar, zzahk zzahkVar) throws IOException {
        int iZza = zza(zzalfVar, bArr, i10, i11, zzahkVar);
        while (true) {
            zzajjVar.add(zzahkVar.zzc);
            if (iZza >= i11) {
                break;
            }
            int iZzc = zzc(bArr, iZza, zzahkVar);
            if (i9 != zzahkVar.zza) {
                break;
            }
            iZza = zza(zzalfVar, bArr, iZzc, i11, zzahkVar);
        }
        return iZza;
    }

    public static int zza(zzalf zzalfVar, byte[] bArr, int i9, int i10, int i11, zzahk zzahkVar) throws IOException {
        Object objZza = zzalfVar.zza();
        int iZza = zza(objZza, zzalfVar, bArr, i9, i10, i11, zzahkVar);
        zzalfVar.zzc(objZza);
        zzahkVar.zzc = objZza;
        return iZza;
    }

    public static int zza(zzalf zzalfVar, byte[] bArr, int i9, int i10, zzahk zzahkVar) throws IOException {
        Object objZza = zzalfVar.zza();
        int iZza = zza(objZza, zzalfVar, bArr, i9, i10, zzahkVar);
        zzalfVar.zzc(objZza);
        zzahkVar.zzc = objZza;
        return iZza;
    }

    public static int zza(Object obj, zzalf zzalfVar, byte[] bArr, int i9, int i10, int i11, zzahk zzahkVar) throws IOException {
        int iZza = ((zzakr) zzalfVar).zza(obj, bArr, i9, i10, i11, zzahkVar);
        zzahkVar.zzc = obj;
        return iZza;
    }

    public static int zza(Object obj, zzalf zzalfVar, byte[] bArr, int i9, int i10, zzahk zzahkVar) throws IOException {
        int iZza = i9 + 1;
        int i11 = bArr[i9];
        if (i11 < 0) {
            iZza = zza(i11, bArr, iZza, zzahkVar);
            i11 = zzahkVar.zza;
        }
        int i12 = iZza;
        if (i11 < 0 || i11 > i10 - i12) {
            throw zzaji.zzi();
        }
        int i13 = i11 + i12;
        zzalfVar.zza(obj, bArr, i12, i13, zzahkVar);
        zzahkVar.zzc = obj;
        return i13;
    }

    public static int zza(byte[] bArr, int i9, zzahk zzahkVar) throws zzaji {
        int iZzc = zzc(bArr, i9, zzahkVar);
        int i10 = zzahkVar.zza;
        if (i10 < 0) {
            throw zzaji.zzf();
        }
        if (i10 > bArr.length - iZzc) {
            throw zzaji.zzi();
        }
        if (i10 == 0) {
            zzahkVar.zzc = zzahp.zza;
            return iZzc;
        }
        zzahkVar.zzc = zzahp.zza(bArr, iZzc, i10);
        return iZzc + i10;
    }

    public static int zza(byte[] bArr, int i9, zzajj<?> zzajjVar, zzahk zzahkVar) throws IOException {
        zzajd zzajdVar = (zzajd) zzajjVar;
        int iZzc = zzc(bArr, i9, zzahkVar);
        int i10 = zzahkVar.zza + iZzc;
        while (iZzc < i10) {
            iZzc = zzc(bArr, iZzc, zzahkVar);
            zzajdVar.zzc(zzahkVar.zza);
        }
        if (iZzc == i10) {
            return iZzc;
        }
        throw zzaji.zzi();
    }

    public static float zzb(byte[] bArr, int i9) {
        return Float.intBitsToFloat(zzc(bArr, i9));
    }

    public static int zzb(byte[] bArr, int i9, zzahk zzahkVar) throws zzaji {
        int iZzc = zzc(bArr, i9, zzahkVar);
        int i10 = zzahkVar.zza;
        if (i10 < 0) {
            throw zzaji.zzf();
        }
        if (i10 == 0) {
            zzahkVar.zzc = "";
            return iZzc;
        }
        zzahkVar.zzc = zzaml.zzb(bArr, iZzc, i10);
        return iZzc + i10;
    }

    public static int zzc(byte[] bArr, int i9) {
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    public static int zzc(byte[] bArr, int i9, zzahk zzahkVar) {
        int i10 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 < 0) {
            return zza(b9, bArr, i10, zzahkVar);
        }
        zzahkVar.zza = b9;
        return i10;
    }

    public static int zzd(byte[] bArr, int i9, zzahk zzahkVar) {
        int i10 = i9 + 1;
        long j9 = bArr[i9];
        if (j9 >= 0) {
            zzahkVar.zzb = j9;
            return i10;
        }
        int i11 = i9 + 2;
        byte b9 = bArr[i10];
        long j10 = (j9 & 127) | (((long) (b9 & 127)) << 7);
        int i12 = 7;
        while (b9 < 0) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            i12 += 7;
            j10 |= ((long) (b10 & 127)) << i12;
            b9 = b10;
            i11 = i13;
        }
        zzahkVar.zzb = j10;
        return i11;
    }

    public static long zzd(byte[] bArr, int i9) {
        return ((((long) bArr[i9 + 7]) & 255) << 56) | (((long) bArr[i9]) & 255) | ((((long) bArr[i9 + 1]) & 255) << 8) | ((((long) bArr[i9 + 2]) & 255) << 16) | ((((long) bArr[i9 + 3]) & 255) << 24) | ((((long) bArr[i9 + 4]) & 255) << 32) | ((((long) bArr[i9 + 5]) & 255) << 40) | ((((long) bArr[i9 + 6]) & 255) << 48);
    }
}
