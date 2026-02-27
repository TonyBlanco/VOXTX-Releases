package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzen {
    public static int zza(byte[] bArr, int i9, zzem zzemVar) throws zzgy {
        int iZzj = zzj(bArr, i9, zzemVar);
        int i10 = zzemVar.zza;
        if (i10 < 0) {
            throw zzgy.zzf();
        }
        if (i10 > bArr.length - iZzj) {
            throw zzgy.zzj();
        }
        if (i10 == 0) {
            zzemVar.zzc = zzez.zzb;
            return iZzj;
        }
        zzemVar.zzc = zzez.zzm(bArr, iZzj, i10);
        return iZzj + i10;
    }

    public static int zzb(byte[] bArr, int i9) {
        int i10 = bArr[i9] & 255;
        int i11 = bArr[i9 + 1] & 255;
        int i12 = bArr[i9 + 2] & 255;
        return ((bArr[i9 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzil zzilVar, byte[] bArr, int i9, int i10, int i11, zzem zzemVar) throws IOException {
        Object objZze = zzilVar.zze();
        int iZzn = zzn(objZze, zzilVar, bArr, i9, i10, i11, zzemVar);
        zzilVar.zzf(objZze);
        zzemVar.zzc = objZze;
        return iZzn;
    }

    public static int zzd(zzil zzilVar, byte[] bArr, int i9, int i10, zzem zzemVar) throws IOException {
        Object objZze = zzilVar.zze();
        int iZzo = zzo(objZze, zzilVar, bArr, i9, i10, zzemVar);
        zzilVar.zzf(objZze);
        zzemVar.zzc = objZze;
        return iZzo;
    }

    public static int zze(zzil zzilVar, int i9, byte[] bArr, int i10, int i11, zzgv zzgvVar, zzem zzemVar) throws IOException {
        int iZzd = zzd(zzilVar, bArr, i10, i11, zzemVar);
        while (true) {
            zzgvVar.add(zzemVar.zzc);
            if (iZzd >= i11) {
                break;
            }
            int iZzj = zzj(bArr, iZzd, zzemVar);
            if (i9 != zzemVar.zza) {
                break;
            }
            iZzd = zzd(zzilVar, bArr, iZzj, i11, zzemVar);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i9, zzgv zzgvVar, zzem zzemVar) throws IOException {
        zzgp zzgpVar = (zzgp) zzgvVar;
        int iZzj = zzj(bArr, i9, zzemVar);
        int i10 = zzemVar.zza + iZzj;
        while (iZzj < i10) {
            iZzj = zzj(bArr, iZzj, zzemVar);
            zzgpVar.zzg(zzemVar.zza);
        }
        if (iZzj == i10) {
            return iZzj;
        }
        throw zzgy.zzj();
    }

    public static int zzg(byte[] bArr, int i9, zzem zzemVar) throws zzgy {
        int iZzj = zzj(bArr, i9, zzemVar);
        int i10 = zzemVar.zza;
        if (i10 < 0) {
            throw zzgy.zzf();
        }
        if (i10 == 0) {
            zzemVar.zzc = "";
            return iZzj;
        }
        zzemVar.zzc = new String(bArr, iZzj, i10, zzgw.zzb);
        return iZzj + i10;
    }

    public static int zzh(byte[] bArr, int i9, zzem zzemVar) throws zzgy {
        int iZzj = zzj(bArr, i9, zzemVar);
        int i10 = zzemVar.zza;
        if (i10 < 0) {
            throw zzgy.zzf();
        }
        if (i10 == 0) {
            zzemVar.zzc = "";
            return iZzj;
        }
        zzemVar.zzc = zzju.zzd(bArr, iZzj, i10);
        return iZzj + i10;
    }

    public static int zzi(int i9, byte[] bArr, int i10, int i11, zzjg zzjgVar, zzem zzemVar) throws zzgy {
        if ((i9 >>> 3) == 0) {
            throw zzgy.zzc();
        }
        int i12 = i9 & 7;
        if (i12 == 0) {
            int iZzm = zzm(bArr, i10, zzemVar);
            zzjgVar.zzj(i9, Long.valueOf(zzemVar.zzb));
            return iZzm;
        }
        if (i12 == 1) {
            zzjgVar.zzj(i9, Long.valueOf(zzq(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzj = zzj(bArr, i10, zzemVar);
            int i13 = zzemVar.zza;
            if (i13 < 0) {
                throw zzgy.zzf();
            }
            if (i13 > bArr.length - iZzj) {
                throw zzgy.zzj();
            }
            zzjgVar.zzj(i9, i13 == 0 ? zzez.zzb : zzez.zzm(bArr, iZzj, i13));
            return iZzj + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzgy.zzc();
            }
            zzjgVar.zzj(i9, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i9 & (-8)) | 4;
        zzjg zzjgVarZzf = zzjg.zzf();
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZzj2 = zzj(bArr, i10, zzemVar);
            int i16 = zzemVar.zza;
            i15 = i16;
            if (i16 == i14) {
                i10 = iZzj2;
                break;
            }
            int iZzi = zzi(i15, bArr, iZzj2, i11, zzjgVarZzf, zzemVar);
            i15 = i16;
            i10 = iZzi;
        }
        if (i10 > i11 || i15 != i14) {
            throw zzgy.zzg();
        }
        zzjgVar.zzj(i9, zzjgVarZzf);
        return i10;
    }

    public static int zzj(byte[] bArr, int i9, zzem zzemVar) {
        int i10 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 < 0) {
            return zzk(b9, bArr, i10, zzemVar);
        }
        zzemVar.zza = b9;
        return i10;
    }

    public static int zzk(int i9, byte[] bArr, int i10, zzem zzemVar) {
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
                zzemVar.zza = i14 | (b10 << 14);
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
                    zzemVar.zza = i16 | (b12 << 28);
                    return i17;
                }
                int i18 = i16 | ((b12 & 127) << 28);
                while (true) {
                    int i19 = i17 + 1;
                    if (bArr[i17] >= 0) {
                        zzemVar.zza = i18;
                        return i19;
                    }
                    i17 = i19;
                }
            }
        }
        zzemVar.zza = i13 | i11;
        return i12;
    }

    public static int zzl(int i9, byte[] bArr, int i10, int i11, zzgv zzgvVar, zzem zzemVar) {
        zzgp zzgpVar = (zzgp) zzgvVar;
        int iZzj = zzj(bArr, i10, zzemVar);
        while (true) {
            zzgpVar.zzg(zzemVar.zza);
            if (iZzj >= i11) {
                break;
            }
            int iZzj2 = zzj(bArr, iZzj, zzemVar);
            if (i9 != zzemVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzemVar);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i9, zzem zzemVar) {
        long j9 = bArr[i9];
        int i10 = i9 + 1;
        if (j9 >= 0) {
            zzemVar.zzb = j9;
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
        zzemVar.zzb = j10;
        return i11;
    }

    public static int zzn(Object obj, zzil zzilVar, byte[] bArr, int i9, int i10, int i11, zzem zzemVar) throws IOException {
        int iZzc = ((zzib) zzilVar).zzc(obj, bArr, i9, i10, i11, zzemVar);
        zzemVar.zzc = obj;
        return iZzc;
    }

    public static int zzo(Object obj, zzil zzilVar, byte[] bArr, int i9, int i10, zzem zzemVar) throws IOException {
        int iZzk = i9 + 1;
        int i11 = bArr[i9];
        if (i11 < 0) {
            iZzk = zzk(i11, bArr, iZzk, zzemVar);
            i11 = zzemVar.zza;
        }
        int i12 = iZzk;
        if (i11 < 0 || i11 > i10 - i12) {
            throw zzgy.zzj();
        }
        int i13 = i11 + i12;
        zzilVar.zzi(obj, bArr, i12, i13, zzemVar);
        zzemVar.zzc = obj;
        return i13;
    }

    public static int zzp(int i9, byte[] bArr, int i10, int i11, zzem zzemVar) throws zzgy {
        if ((i9 >>> 3) == 0) {
            throw zzgy.zzc();
        }
        int i12 = i9 & 7;
        if (i12 == 0) {
            return zzm(bArr, i10, zzemVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zzj(bArr, i10, zzemVar) + zzemVar.zza;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw zzgy.zzc();
        }
        int i13 = (i9 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = zzj(bArr, i10, zzemVar);
            i14 = zzemVar.zza;
            if (i14 == i13) {
                break;
            }
            i10 = zzp(i14, bArr, i10, i11, zzemVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw zzgy.zzg();
        }
        return i10;
    }

    public static long zzq(byte[] bArr, int i9) {
        return (((long) bArr[i9]) & 255) | ((((long) bArr[i9 + 1]) & 255) << 8) | ((((long) bArr[i9 + 2]) & 255) << 16) | ((((long) bArr[i9 + 3]) & 255) << 24) | ((((long) bArr[i9 + 4]) & 255) << 32) | ((((long) bArr[i9 + 5]) & 255) << 40) | ((((long) bArr[i9 + 6]) & 255) << 48) | ((((long) bArr[i9 + 7]) & 255) << 56);
    }
}
