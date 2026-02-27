package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzfd extends zzff {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzfd(InputStream inputStream, int i9, zzfc zzfcVar) {
        super(null);
        this.zzl = a.e.API_PRIORITY_OTHER;
        byte[] bArr = zzgw.zzd;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzI(int i9) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.zze.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw zzgy.zzj();
                }
                this.zzk += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i9 = this.zzg + this.zzh;
        this.zzg = i9;
        int i10 = this.zzk + i9;
        int i11 = this.zzl;
        if (i10 <= i11) {
            this.zzh = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzh = i12;
        this.zzg = i9 - i12;
    }

    private final void zzK(int i9) throws IOException {
        if (zzL(i9)) {
            return;
        }
        if (i9 <= (a.e.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
            throw zzgy.zzj();
        }
        throw zzgy.zzi();
    }

    private final boolean zzL(int i9) throws IOException {
        int i10 = this.zzi;
        int i11 = i10 + i9;
        int i12 = this.zzg;
        if (i11 <= i12) {
            throw new IllegalStateException("refillBuffer() called when " + i9 + " bytes were already available in buffer");
        }
        int i13 = this.zzk;
        if (i9 > (a.e.API_PRIORITY_OTHER - i13) - i10 || i13 + i10 + i9 > this.zzl) {
            return false;
        }
        if (i10 > 0) {
            if (i12 > i10) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
            }
            i13 = this.zzk + i10;
            this.zzk = i13;
            i12 = this.zzg - i10;
            this.zzg = i12;
            this.zzi = 0;
        }
        try {
            int i14 = this.zze.read(this.zzf, i12, Math.min(4096 - i12, (a.e.API_PRIORITY_OTHER - i13) - i12));
            if (i14 == 0 || i14 < -1 || i14 > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + i14 + "\nThe InputStream implementation is buggy.");
            }
            if (i14 <= 0) {
                return false;
            }
            this.zzg += i14;
            zzJ();
            if (this.zzg >= i9) {
                return true;
            }
            return zzL(i9);
        } catch (zzgy e9) {
            e9.zzk();
            throw e9;
        }
    }

    private final byte[] zzM(int i9, boolean z9) throws IOException {
        byte[] bArrZzN = zzN(i9);
        if (bArrZzN != null) {
            return bArrZzN;
        }
        int i10 = this.zzi;
        int i11 = this.zzg;
        int i12 = i11 - i10;
        this.zzk += i11;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(i9 - i12);
        byte[] bArr = new byte[i9];
        System.arraycopy(this.zzf, i10, bArr, 0, i12);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i9) throws IOException {
        if (i9 == 0) {
            return zzgw.zzd;
        }
        if (i9 < 0) {
            throw zzgy.zzf();
        }
        int i10 = this.zzk;
        int i11 = this.zzi;
        int i12 = i10 + i11 + i9;
        if ((-2147483647) + i12 > 0) {
            throw zzgy.zzi();
        }
        int i13 = this.zzl;
        if (i12 > i13) {
            zzB((i13 - i10) - i11);
            throw zzgy.zzj();
        }
        int i14 = this.zzg - i11;
        int i15 = i9 - i14;
        if (i15 >= 4096) {
            try {
                if (i15 > this.zze.available()) {
                    return null;
                }
            } catch (zzgy e9) {
                e9.zzk();
                throw e9;
            }
        }
        byte[] bArr = new byte[i9];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i14);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i14 < i9) {
            try {
                int i16 = this.zze.read(bArr, i14, i9 - i14);
                if (i16 == -1) {
                    throw zzgy.zzj();
                }
                this.zzk += i16;
                i14 += i16;
            } catch (zzgy e10) {
                e10.zzk();
                throw e10;
            }
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final void zzA(int i9) {
        this.zzl = i9;
        zzJ();
    }

    public final void zzB(int i9) throws IOException {
        int i10 = this.zzg;
        int i11 = this.zzi;
        int i12 = i10 - i11;
        if (i9 <= i12 && i9 >= 0) {
            this.zzi = i11 + i9;
            return;
        }
        if (i9 < 0) {
            throw zzgy.zzf();
        }
        int i13 = this.zzk;
        int i14 = i13 + i11;
        int i15 = this.zzl;
        if (i14 + i9 > i15) {
            zzB((i15 - i13) - i11);
            throw zzgy.zzj();
        }
        this.zzk = i14;
        this.zzg = 0;
        this.zzi = 0;
        while (i12 < i9) {
            try {
                long j9 = i9 - i12;
                try {
                    long jSkip = this.zze.skip(j9);
                    if (jSkip < 0 || jSkip > j9) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } catch (zzgy e9) {
                    e9.zzk();
                    throw e9;
                }
            } catch (Throwable th) {
                this.zzk += i12;
                zzJ();
                throw th;
            }
        }
        this.zzk += i12;
        zzJ();
        if (i12 >= i9) {
            return;
        }
        int i16 = this.zzg;
        int i17 = i16 - this.zzi;
        this.zzi = i16;
        while (true) {
            zzK(1);
            int i18 = i9 - i17;
            int i19 = this.zzg;
            if (i18 <= i19) {
                this.zzi = i18;
                return;
            } else {
                i17 += i19;
                this.zzi = i19;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final boolean zzC() throws IOException {
        return this.zzi == this.zzg && !zzL(1);
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final boolean zzE(int i9) throws IOException {
        int iZzm;
        int i10 = i9 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i11 < 10) {
                    if (zza() < 0) {
                        i11++;
                    }
                }
                throw zzgy.zze();
            }
            while (i11 < 10) {
                byte[] bArr = this.zzf;
                int i12 = this.zzi;
                this.zzi = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw zzgy.zze();
            return true;
        }
        if (i10 == 1) {
            zzB(8);
            return true;
        }
        if (i10 == 2) {
            zzB(zzj());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzgy.zza();
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i9 >>> 3) << 3) | 4);
        return true;
    }

    public final byte zza() throws IOException {
        if (this.zzi == this.zzg) {
            zzK(1);
        }
        byte[] bArr = this.zzf;
        int i9 = this.zzi;
        this.zzi = i9 + 1;
        return bArr[i9];
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zze(int i9) throws zzgy {
        if (i9 < 0) {
            throw zzgy.zzf();
        }
        int i10 = this.zzk + this.zzi;
        int i11 = this.zzl;
        int i12 = i9 + i10;
        if (i12 > i11) {
            throw zzgy.zzj();
        }
        this.zzl = i12;
        zzJ();
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        int i9 = this.zzi;
        if (this.zzg - i9 < 4) {
            zzK(4);
            i9 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i9 + 4;
        int i10 = bArr[i9] & 255;
        int i11 = bArr[i9 + 1] & 255;
        int i12 = bArr[i9 + 2] & 255;
        return ((bArr[i9 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int zzj() throws IOException {
        int i9;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b9 = bArr[i10];
            if (b9 >= 0) {
                this.zzi = i12;
                return b9;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b9;
                if (i14 < 0) {
                    i9 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i9 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i9 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i9 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i9 = i19;
                            }
                            i9 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.zzi = i13;
                return i9;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzl() throws IOException {
        return zzff.zzF(zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzj = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw zzgy.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        int i9 = this.zzi;
        if (this.zzg - i9 < 8) {
            zzK(8);
            i9 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i9 + 8;
        long j9 = bArr[i9];
        long j10 = (((long) bArr[i9 + 1]) & 255) << 8;
        long j11 = bArr[i9 + 2];
        long j12 = bArr[i9 + 3];
        return ((((long) bArr[i9 + 7]) & 255) << 56) | (j9 & 255) | j10 | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
    }

    public final long zzr() throws IOException {
        long j9;
        long j10;
        int i9 = this.zzi;
        int i10 = this.zzg;
        if (i10 != i9) {
            byte[] bArr = this.zzf;
            int i11 = i9 + 1;
            byte b9 = bArr[i9];
            if (b9 >= 0) {
                this.zzi = i11;
                return b9;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b9;
                if (i13 < 0) {
                    j9 = i13 ^ (-128);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j9 = i15 ^ 16256;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            long j11 = (-2080896) ^ i17;
                            i12 = i16;
                            j9 = j11;
                        } else {
                            i14 = i9 + 5;
                            long j12 = (((long) bArr[i16]) << 28) ^ ((long) i17);
                            if (j12 >= 0) {
                                j9 = j12 ^ 266354560;
                            } else {
                                i12 = i9 + 6;
                                long j13 = (((long) bArr[i14]) << 35) ^ j12;
                                if (j13 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    int i18 = i9 + 7;
                                    long j14 = j13 ^ (((long) bArr[i12]) << 42);
                                    if (j14 >= 0) {
                                        j9 = j14 ^ 4363953127296L;
                                    } else {
                                        i12 = i9 + 8;
                                        j13 = j14 ^ (((long) bArr[i18]) << 49);
                                        if (j13 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i18 = i9 + 9;
                                            long j15 = (j13 ^ (((long) bArr[i12]) << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                i12 = i9 + 10;
                                                if (bArr[i18] >= 0) {
                                                    j9 = j15;
                                                }
                                            } else {
                                                j9 = j15;
                                            }
                                        }
                                    }
                                    i12 = i18;
                                }
                                j9 = j13 ^ j10;
                            }
                        }
                    }
                    i12 = i14;
                }
                this.zzi = i12;
                return j9;
            }
        }
        return zzs();
    }

    public final long zzs() throws IOException {
        long j9 = 0;
        for (int i9 = 0; i9 < 64; i9 += 7) {
            byte bZza = zza();
            j9 |= ((long) (bZza & 127)) << i9;
            if ((bZza & 128) == 0) {
                return j9;
            }
        }
        throw zzgy.zze();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzu() throws IOException {
        return zzff.zzG(zzr());
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final zzez zzw() throws IOException {
        int iZzj = zzj();
        int i9 = this.zzg;
        int i10 = this.zzi;
        if (iZzj <= i9 - i10 && iZzj > 0) {
            zzez zzezVarZzm = zzez.zzm(this.zzf, i10, iZzj);
            this.zzi += iZzj;
            return zzezVarZzm;
        }
        if (iZzj == 0) {
            return zzez.zzb;
        }
        byte[] bArrZzN = zzN(iZzj);
        if (bArrZzN != null) {
            return zzez.zzm(bArrZzN, 0, bArrZzN.length);
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(iZzj - i13);
        byte[] bArr = new byte[iZzj];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return new zzew(bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i9 = this.zzg;
            int i10 = this.zzi;
            if (iZzj <= i9 - i10) {
                String str = new String(this.zzf, i10, iZzj, zzgw.zzb);
                this.zzi += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj > this.zzg) {
            return new String(zzM(iZzj, false), zzgw.zzb);
        }
        zzK(iZzj);
        String str2 = new String(this.zzf, this.zzi, iZzj, zzgw.zzb);
        this.zzi += iZzj;
        return str2;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final String zzy() throws IOException {
        byte[] bArrZzM;
        int iZzj = zzj();
        int i9 = this.zzi;
        int i10 = this.zzg;
        if (iZzj <= i10 - i9 && iZzj > 0) {
            bArrZzM = this.zzf;
            this.zzi = i9 + iZzj;
        } else {
            if (iZzj == 0) {
                return "";
            }
            i9 = 0;
            if (iZzj <= i10) {
                zzK(iZzj);
                bArrZzM = this.zzf;
                this.zzi = iZzj;
            } else {
                bArrZzM = zzM(iZzj, false);
            }
        }
        return zzju.zzd(bArrZzM, i9, iZzj);
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final void zzz(int i9) throws zzgy {
        if (this.zzj != i9) {
            throw zzgy.zzb();
        }
    }
}
