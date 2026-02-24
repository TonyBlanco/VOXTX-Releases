package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzbd {
    public static int zza(byte[] bArr, int i9, zzbc zzbcVar) throws zzdc {
        int iZzh = zzh(bArr, i9, zzbcVar);
        int i10 = zzbcVar.zza;
        if (i10 < 0) {
            throw zzdc.zzd();
        }
        if (i10 > bArr.length - iZzh) {
            throw zzdc.zzg();
        }
        if (i10 == 0) {
            zzbcVar.zzc = zzbq.zzb;
            return iZzh;
        }
        zzbcVar.zzc = zzbq.zzl(bArr, iZzh, i10);
        return iZzh + i10;
    }

    public static int zzb(byte[] bArr, int i9) {
        int i10 = bArr[i9] & 255;
        int i11 = bArr[i9 + 1] & 255;
        int i12 = bArr[i9 + 2] & 255;
        return ((bArr[i9 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzeo zzeoVar, byte[] bArr, int i9, int i10, int i11, zzbc zzbcVar) throws IOException {
        Object objZze = zzeoVar.zze();
        int iZzl = zzl(objZze, zzeoVar, bArr, i9, i10, i11, zzbcVar);
        zzeoVar.zzf(objZze);
        zzbcVar.zzc = objZze;
        return iZzl;
    }

    public static int zzd(zzeo zzeoVar, byte[] bArr, int i9, int i10, zzbc zzbcVar) throws IOException {
        Object objZze = zzeoVar.zze();
        int iZzm = zzm(objZze, zzeoVar, bArr, i9, i10, zzbcVar);
        zzeoVar.zzf(objZze);
        zzbcVar.zzc = objZze;
        return iZzm;
    }

    public static int zze(zzeo zzeoVar, int i9, byte[] bArr, int i10, int i11, zzcz zzczVar, zzbc zzbcVar) throws IOException {
        int iZzd = zzd(zzeoVar, bArr, i10, i11, zzbcVar);
        while (true) {
            zzczVar.add(zzbcVar.zzc);
            if (iZzd >= i11) {
                break;
            }
            int iZzh = zzh(bArr, iZzd, zzbcVar);
            if (i9 != zzbcVar.zza) {
                break;
            }
            iZzd = zzd(zzeoVar, bArr, iZzh, i11, zzbcVar);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i9, zzcz zzczVar, zzbc zzbcVar) throws IOException {
        zzct zzctVar = (zzct) zzczVar;
        int iZzh = zzh(bArr, i9, zzbcVar);
        int i10 = zzbcVar.zza + iZzh;
        while (iZzh < i10) {
            iZzh = zzh(bArr, iZzh, zzbcVar);
            zzctVar.zzg(zzbcVar.zza);
        }
        if (iZzh == i10) {
            return iZzh;
        }
        throw zzdc.zzg();
    }

    public static int zzg(int i9, byte[] bArr, int i10, int i11, zzfg zzfgVar, zzbc zzbcVar) throws zzdc {
        if ((i9 >>> 3) == 0) {
            throw zzdc.zzb();
        }
        int i12 = i9 & 7;
        if (i12 == 0) {
            int iZzk = zzk(bArr, i10, zzbcVar);
            zzfgVar.zzj(i9, Long.valueOf(zzbcVar.zzb));
            return iZzk;
        }
        if (i12 == 1) {
            zzfgVar.zzj(i9, Long.valueOf(zzn(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzh = zzh(bArr, i10, zzbcVar);
            int i13 = zzbcVar.zza;
            if (i13 < 0) {
                throw zzdc.zzd();
            }
            if (i13 > bArr.length - iZzh) {
                throw zzdc.zzg();
            }
            zzfgVar.zzj(i9, i13 == 0 ? zzbq.zzb : zzbq.zzl(bArr, iZzh, i13));
            return iZzh + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzdc.zzb();
            }
            zzfgVar.zzj(i9, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i9 & (-8)) | 4;
        zzfg zzfgVarZzf = zzfg.zzf();
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZzh2 = zzh(bArr, i10, zzbcVar);
            int i16 = zzbcVar.zza;
            i15 = i16;
            if (i16 == i14) {
                i10 = iZzh2;
                break;
            }
            int iZzg = zzg(i15, bArr, iZzh2, i11, zzfgVarZzf, zzbcVar);
            i15 = i16;
            i10 = iZzg;
        }
        if (i10 > i11 || i15 != i14) {
            throw zzdc.zze();
        }
        zzfgVar.zzj(i9, zzfgVarZzf);
        return i10;
    }

    public static int zzh(byte[] bArr, int i9, zzbc zzbcVar) {
        int i10 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 < 0) {
            return zzi(b9, bArr, i10, zzbcVar);
        }
        zzbcVar.zza = b9;
        return i10;
    }

    public static int zzi(int i9, byte[] bArr, int i10, zzbc zzbcVar) {
        int i11;
        byte b9 = bArr[i10];
        int i12 = i10 + 1;
        int i13 = i9 & 127;
        if (b9 >= 0) {
            i11 = b9 << 7;
        } else {
            int i14 = i13 | ((b9 & 127) << 7);
            int i15 = i10 + 2;
            byte b10 = bArr[i12];
            if (b10 >= 0) {
                zzbcVar.zza = i14 | (b10 << 14);
                return i15;
            }
            i13 = i14 | ((b10 & 127) << 14);
            i12 = i10 + 3;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i11 = b11 << 21;
            } else {
                int i16 = i13 | ((b11 & 127) << 21);
                int i17 = i10 + 4;
                byte b12 = bArr[i12];
                if (b12 >= 0) {
                    zzbcVar.zza = i16 | (b12 << 28);
                    return i17;
                }
                int i18 = i16 | ((b12 & 127) << 28);
                while (true) {
                    int i19 = i17 + 1;
                    if (bArr[i17] >= 0) {
                        zzbcVar.zza = i18;
                        return i19;
                    }
                    i17 = i19;
                }
            }
        }
        zzbcVar.zza = i13 | i11;
        return i12;
    }

    public static int zzj(int i9, byte[] bArr, int i10, int i11, zzcz zzczVar, zzbc zzbcVar) {
        zzct zzctVar = (zzct) zzczVar;
        int iZzh = zzh(bArr, i10, zzbcVar);
        while (true) {
            zzctVar.zzg(zzbcVar.zza);
            if (iZzh >= i11) {
                break;
            }
            int iZzh2 = zzh(bArr, iZzh, zzbcVar);
            if (i9 != zzbcVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzbcVar);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i9, zzbc zzbcVar) {
        long j9 = bArr[i9];
        int i10 = i9 + 1;
        if (j9 >= 0) {
            zzbcVar.zzb = j9;
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
        zzbcVar.zzb = j10;
        return i11;
    }

    public static int zzl(Object obj, zzeo zzeoVar, byte[] bArr, int i9, int i10, int i11, zzbc zzbcVar) throws IOException {
        int iZzc = ((zzef) zzeoVar).zzc(obj, bArr, i9, i10, i11, zzbcVar);
        zzbcVar.zzc = obj;
        return iZzc;
    }

    public static int zzm(Object obj, zzeo zzeoVar, byte[] bArr, int i9, int i10, zzbc zzbcVar) throws IOException {
        int iZzi = i9 + 1;
        int i11 = bArr[i9];
        if (i11 < 0) {
            iZzi = zzi(i11, bArr, iZzi, zzbcVar);
            i11 = zzbcVar.zza;
        }
        int i12 = iZzi;
        if (i11 < 0 || i11 > i10 - i12) {
            throw zzdc.zzg();
        }
        int i13 = i11 + i12;
        zzeoVar.zzh(obj, bArr, i12, i13, zzbcVar);
        zzbcVar.zzc = obj;
        return i13;
    }

    public static long zzn(byte[] bArr, int i9) {
        return (((long) bArr[i9]) & 255) | ((((long) bArr[i9 + 1]) & 255) << 8) | ((((long) bArr[i9 + 2]) & 255) << 16) | ((((long) bArr[i9 + 3]) & 255) << 24) | ((((long) bArr[i9 + 4]) & 255) << 32) | ((((long) bArr[i9 + 5]) & 255) << 40) | ((((long) bArr[i9 + 6]) & 255) << 48) | ((((long) bArr[i9 + 7]) & 255) << 56);
    }
}
