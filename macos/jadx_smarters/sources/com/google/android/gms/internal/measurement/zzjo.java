package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzjo {
    public static int zza(byte[] bArr, int i9, zzjn zzjnVar) throws zzll {
        int iZzj = zzj(bArr, i9, zzjnVar);
        int i10 = zzjnVar.zza;
        if (i10 < 0) {
            throw zzll.zzd();
        }
        if (i10 > bArr.length - iZzj) {
            throw zzll.zzf();
        }
        if (i10 == 0) {
            zzjnVar.zzc = zzka.zzb;
            return iZzj;
        }
        zzjnVar.zzc = zzka.zzl(bArr, iZzj, i10);
        return iZzj + i10;
    }

    public static int zzb(byte[] bArr, int i9) {
        int i10 = bArr[i9] & 255;
        int i11 = bArr[i9 + 1] & 255;
        int i12 = bArr[i9 + 2] & 255;
        return ((bArr[i9 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzmt zzmtVar, byte[] bArr, int i9, int i10, int i11, zzjn zzjnVar) throws IOException {
        Object objZze = zzmtVar.zze();
        int iZzn = zzn(objZze, zzmtVar, bArr, i9, i10, i11, zzjnVar);
        zzmtVar.zzf(objZze);
        zzjnVar.zzc = objZze;
        return iZzn;
    }

    public static int zzd(zzmt zzmtVar, byte[] bArr, int i9, int i10, zzjn zzjnVar) throws IOException {
        Object objZze = zzmtVar.zze();
        int iZzo = zzo(objZze, zzmtVar, bArr, i9, i10, zzjnVar);
        zzmtVar.zzf(objZze);
        zzjnVar.zzc = objZze;
        return iZzo;
    }

    public static int zze(zzmt zzmtVar, int i9, byte[] bArr, int i10, int i11, zzli zzliVar, zzjn zzjnVar) throws IOException {
        int iZzd = zzd(zzmtVar, bArr, i10, i11, zzjnVar);
        while (true) {
            zzliVar.add(zzjnVar.zzc);
            if (iZzd >= i11) {
                break;
            }
            int iZzj = zzj(bArr, iZzd, zzjnVar);
            if (i9 != zzjnVar.zza) {
                break;
            }
            iZzd = zzd(zzmtVar, bArr, iZzj, i11, zzjnVar);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i9, zzli zzliVar, zzjn zzjnVar) throws IOException {
        zzlc zzlcVar = (zzlc) zzliVar;
        int iZzj = zzj(bArr, i9, zzjnVar);
        int i10 = zzjnVar.zza + iZzj;
        while (iZzj < i10) {
            iZzj = zzj(bArr, iZzj, zzjnVar);
            zzlcVar.zzh(zzjnVar.zza);
        }
        if (iZzj == i10) {
            return iZzj;
        }
        throw zzll.zzf();
    }

    public static int zzg(byte[] bArr, int i9, zzjn zzjnVar) throws zzll {
        int iZzj = zzj(bArr, i9, zzjnVar);
        int i10 = zzjnVar.zza;
        if (i10 < 0) {
            throw zzll.zzd();
        }
        if (i10 == 0) {
            zzjnVar.zzc = "";
            return iZzj;
        }
        zzjnVar.zzc = new String(bArr, iZzj, i10, zzlj.zzb);
        return iZzj + i10;
    }

    public static int zzh(byte[] bArr, int i9, zzjn zzjnVar) throws zzll {
        int iZzj = zzj(bArr, i9, zzjnVar);
        int i10 = zzjnVar.zza;
        if (i10 < 0) {
            throw zzll.zzd();
        }
        if (i10 == 0) {
            zzjnVar.zzc = "";
            return iZzj;
        }
        int i11 = zznz.zza;
        int length = bArr.length;
        if ((((length - iZzj) - i10) | iZzj | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzj), Integer.valueOf(i10)));
        }
        int i12 = iZzj + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (iZzj < i12) {
            byte b9 = bArr[iZzj];
            if (!zznv.zzd(b9)) {
                break;
            }
            iZzj++;
            cArr[i13] = (char) b9;
            i13++;
        }
        int i14 = i13;
        while (iZzj < i12) {
            int i15 = iZzj + 1;
            byte b10 = bArr[iZzj];
            if (zznv.zzd(b10)) {
                cArr[i14] = (char) b10;
                i14++;
                iZzj = i15;
                while (iZzj < i12) {
                    byte b11 = bArr[iZzj];
                    if (zznv.zzd(b11)) {
                        iZzj++;
                        cArr[i14] = (char) b11;
                        i14++;
                    }
                }
            } else if (b10 < -32) {
                if (i15 >= i12) {
                    throw zzll.zzc();
                }
                iZzj += 2;
                zznv.zzc(b10, bArr[i15], cArr, i14);
                i14++;
            } else if (b10 < -16) {
                if (i15 >= i12 - 1) {
                    throw zzll.zzc();
                }
                int i16 = iZzj + 2;
                iZzj += 3;
                zznv.zzb(b10, bArr[i15], bArr[i16], cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw zzll.zzc();
                }
                byte b12 = bArr[i15];
                int i17 = iZzj + 3;
                byte b13 = bArr[iZzj + 2];
                iZzj += 4;
                zznv.zza(b10, b12, b13, bArr[i17], cArr, i14);
                i14 += 2;
            }
        }
        zzjnVar.zzc = new String(cArr, 0, i14);
        return i12;
    }

    public static int zzi(int i9, byte[] bArr, int i10, int i11, zznl zznlVar, zzjn zzjnVar) throws zzll {
        if ((i9 >>> 3) == 0) {
            throw zzll.zzb();
        }
        int i12 = i9 & 7;
        if (i12 == 0) {
            int iZzm = zzm(bArr, i10, zzjnVar);
            zznlVar.zzj(i9, Long.valueOf(zzjnVar.zzb));
            return iZzm;
        }
        if (i12 == 1) {
            zznlVar.zzj(i9, Long.valueOf(zzp(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzj = zzj(bArr, i10, zzjnVar);
            int i13 = zzjnVar.zza;
            if (i13 < 0) {
                throw zzll.zzd();
            }
            if (i13 > bArr.length - iZzj) {
                throw zzll.zzf();
            }
            zznlVar.zzj(i9, i13 == 0 ? zzka.zzb : zzka.zzl(bArr, iZzj, i13));
            return iZzj + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzll.zzb();
            }
            zznlVar.zzj(i9, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i9 & (-8)) | 4;
        zznl zznlVarZzf = zznl.zzf();
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZzj2 = zzj(bArr, i10, zzjnVar);
            int i16 = zzjnVar.zza;
            i15 = i16;
            if (i16 == i14) {
                i10 = iZzj2;
                break;
            }
            int iZzi = zzi(i15, bArr, iZzj2, i11, zznlVarZzf, zzjnVar);
            i15 = i16;
            i10 = iZzi;
        }
        if (i10 > i11 || i15 != i14) {
            throw zzll.zze();
        }
        zznlVar.zzj(i9, zznlVarZzf);
        return i10;
    }

    public static int zzj(byte[] bArr, int i9, zzjn zzjnVar) {
        int i10 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 < 0) {
            return zzk(b9, bArr, i10, zzjnVar);
        }
        zzjnVar.zza = b9;
        return i10;
    }

    public static int zzk(int i9, byte[] bArr, int i10, zzjn zzjnVar) {
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
                zzjnVar.zza = i14 | (b10 << 14);
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
                    zzjnVar.zza = i16 | (b12 << 28);
                    return i17;
                }
                int i18 = i16 | ((b12 & 127) << 28);
                while (true) {
                    int i19 = i17 + 1;
                    if (bArr[i17] >= 0) {
                        zzjnVar.zza = i18;
                        return i19;
                    }
                    i17 = i19;
                }
            }
        }
        zzjnVar.zza = i13 | i11;
        return i12;
    }

    public static int zzl(int i9, byte[] bArr, int i10, int i11, zzli zzliVar, zzjn zzjnVar) {
        zzlc zzlcVar = (zzlc) zzliVar;
        int iZzj = zzj(bArr, i10, zzjnVar);
        while (true) {
            zzlcVar.zzh(zzjnVar.zza);
            if (iZzj >= i11) {
                break;
            }
            int iZzj2 = zzj(bArr, iZzj, zzjnVar);
            if (i9 != zzjnVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzjnVar);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i9, zzjn zzjnVar) {
        long j9 = bArr[i9];
        int i10 = i9 + 1;
        if (j9 >= 0) {
            zzjnVar.zzb = j9;
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
        zzjnVar.zzb = j10;
        return i11;
    }

    public static int zzn(Object obj, zzmt zzmtVar, byte[] bArr, int i9, int i10, int i11, zzjn zzjnVar) throws IOException {
        int iZzc = ((zzml) zzmtVar).zzc(obj, bArr, i9, i10, i11, zzjnVar);
        zzjnVar.zzc = obj;
        return iZzc;
    }

    public static int zzo(Object obj, zzmt zzmtVar, byte[] bArr, int i9, int i10, zzjn zzjnVar) throws IOException {
        int iZzk = i9 + 1;
        int i11 = bArr[i9];
        if (i11 < 0) {
            iZzk = zzk(i11, bArr, iZzk, zzjnVar);
            i11 = zzjnVar.zza;
        }
        int i12 = iZzk;
        if (i11 < 0 || i11 > i10 - i12) {
            throw zzll.zzf();
        }
        int i13 = i11 + i12;
        zzmtVar.zzh(obj, bArr, i12, i13, zzjnVar);
        zzjnVar.zzc = obj;
        return i13;
    }

    public static long zzp(byte[] bArr, int i9) {
        return (((long) bArr[i9]) & 255) | ((((long) bArr[i9 + 1]) & 255) << 8) | ((((long) bArr[i9 + 2]) & 255) << 16) | ((((long) bArr[i9 + 3]) & 255) << 24) | ((((long) bArr[i9 + 4]) & 255) << 32) | ((((long) bArr[i9 + 5]) & 255) << 40) | ((((long) bArr[i9 + 6]) & 255) << 48) | ((((long) bArr[i9 + 7]) & 255) << 56);
    }
}
