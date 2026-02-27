package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzaif extends zzaia {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzaie zzm;

    private zzaif(InputStream inputStream, int i9) {
        super();
        this.zzl = a.e.API_PRIORITY_OTHER;
        this.zzm = null;
        zzajf.zza(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private static int zza(InputStream inputStream) throws IOException {
        try {
            return inputStream.available();
        } catch (zzaji e9) {
            e9.zzj();
            throw e9;
        }
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i9, int i10) throws IOException {
        try {
            return inputStream.read(bArr, i9, i10);
        } catch (zzaji e9) {
            e9.zzj();
            throw e9;
        }
    }

    private static long zza(InputStream inputStream, long j9) throws IOException {
        try {
            return inputStream.skip(j9);
        } catch (zzaji e9) {
            e9.zzj();
            throw e9;
        }
    }

    private final byte[] zza(int i9, boolean z9) throws IOException {
        byte[] bArrZzj = zzj(i9);
        if (bArrZzj != null) {
            return bArrZzj;
        }
        int i10 = this.zzi;
        int i11 = this.zzg;
        int length = i11 - i10;
        this.zzk += i11;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzf = zzf(i9 - length);
        byte[] bArr = new byte[i9];
        System.arraycopy(this.zzf, i10, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    private final void zzaa() {
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

    private final List<byte[]> zzf(int i9) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.zze.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw zzaji.zzi();
                }
                this.zzk += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i9) throws IOException {
        if (zzi(i9)) {
            return;
        }
        if (i9 <= (this.zzc - this.zzk) - this.zzi) {
            throw zzaji.zzi();
        }
        throw zzaji.zzh();
    }

    private final void zzh(int i9) throws IOException {
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (i9 <= i10 - i11 && i9 >= 0) {
            this.zzi = i11 + i9;
            return;
        }
        if (i9 < 0) {
            throw zzaji.zzf();
        }
        int i12 = this.zzk;
        int i13 = i12 + i11 + i9;
        int i14 = this.zzl;
        if (i13 > i14) {
            zzh((i14 - i12) - i11);
            throw zzaji.zzi();
        }
        this.zzk = i12 + i11;
        int i15 = i10 - i11;
        this.zzg = 0;
        this.zzi = 0;
        while (i15 < i9) {
            try {
                long j9 = i9 - i15;
                long jZza = zza(this.zze, j9);
                if (jZza >= 0 && jZza <= j9) {
                    if (jZza == 0) {
                        break;
                    } else {
                        i15 += (int) jZza;
                    }
                } else {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jZza + "\nThe InputStream implementation is buggy.");
                }
            } finally {
                this.zzk += i15;
                zzaa();
            }
        }
        if (i15 >= i9) {
            return;
        }
        int i16 = this.zzg;
        int i17 = i16 - this.zzi;
        this.zzi = i16;
        while (true) {
            zzg(1);
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

    private final boolean zzi(int i9) throws IOException {
        do {
            int i10 = this.zzi;
            int i11 = i10 + i9;
            int i12 = this.zzg;
            if (i11 <= i12) {
                throw new IllegalStateException("refillBuffer() called when " + i9 + " bytes were already available in buffer");
            }
            int i13 = this.zzc;
            int i14 = this.zzk;
            if (i9 > (i13 - i14) - i10 || i14 + i10 + i9 > this.zzl) {
                return false;
            }
            if (i10 > 0) {
                if (i12 > i10) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.zzk += i10;
                this.zzg -= i10;
                this.zzi = 0;
            }
            InputStream inputStream = this.zze;
            byte[] bArr2 = this.zzf;
            int i15 = this.zzg;
            int iZza = zza(inputStream, bArr2, i15, Math.min(bArr2.length - i15, (this.zzc - this.zzk) - i15));
            if (iZza == 0 || iZza < -1 || iZza > this.zzf.length) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + iZza + "\nThe InputStream implementation is buggy.");
            }
            if (iZza <= 0) {
                return false;
            }
            this.zzg += iZza;
            zzaa();
        } while (this.zzg < i9);
        return true;
    }

    private final byte[] zzj(int i9) throws IOException {
        if (i9 == 0) {
            return zzajf.zzb;
        }
        if (i9 < 0) {
            throw zzaji.zzf();
        }
        int i10 = this.zzk;
        int i11 = this.zzi;
        int i12 = i10 + i11 + i9;
        if (i12 - this.zzc > 0) {
            throw zzaji.zzh();
        }
        int i13 = this.zzl;
        if (i12 > i13) {
            zzh((i13 - i10) - i11);
            throw zzaji.zzi();
        }
        int i14 = this.zzg - i11;
        int i15 = i9 - i14;
        if (i15 >= 4096 && i15 > zza(this.zze)) {
            return null;
        }
        byte[] bArr = new byte[i9];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i14);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i14 < i9) {
            int iZza = zza(this.zze, bArr, i14, i9 - i14);
            if (iZza == -1) {
                throw zzaji.zzi();
            }
            this.zzk += iZza;
            i14 += iZza;
        }
        return bArr;
    }

    private final byte zzv() throws IOException {
        if (this.zzi == this.zzg) {
            zzg(1);
        }
        byte[] bArr = this.zzf;
        int i9 = this.zzi;
        this.zzi = i9 + 1;
        return bArr[i9];
    }

    private final int zzw() throws IOException {
        int i9 = this.zzi;
        if (this.zzg - i9 < 4) {
            zzg(4);
            i9 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i9 + 4;
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    private final int zzx() throws IOException {
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
        return (int) zzm();
    }

    private final long zzy() throws IOException {
        int i9 = this.zzi;
        if (this.zzg - i9 < 8) {
            zzg(8);
            i9 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i9 + 8;
        return ((((long) bArr[i9 + 7]) & 255) << 56) | (((long) bArr[i9]) & 255) | ((((long) bArr[i9 + 1]) & 255) << 8) | ((((long) bArr[i9 + 2]) & 255) << 16) | ((((long) bArr[i9 + 3]) & 255) << 24) | ((((long) bArr[i9 + 4]) & 255) << 32) | ((((long) bArr[i9 + 5]) & 255) << 40) | ((((long) bArr[i9 + 6]) & 255) << 48);
    }

    private final long zzz() throws IOException {
        long j9;
        long j10;
        long j11;
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
                        i12 = i14;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            long j12 = (-2080896) ^ i17;
                            i12 = i16;
                            j9 = j12;
                        } else {
                            long j13 = i17;
                            i12 = i9 + 5;
                            long j14 = j13 ^ (((long) bArr[i16]) << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                int i18 = i9 + 6;
                                long j15 = j14 ^ (((long) bArr[i12]) << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i12 = i9 + 7;
                                    j14 = j15 ^ (((long) bArr[i18]) << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i18 = i9 + 8;
                                        j15 = j14 ^ (((long) bArr[i12]) << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i12 = i9 + 9;
                                            long j16 = (j15 ^ (((long) bArr[i18]) << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i19 = i9 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i19;
                                                }
                                            }
                                            j9 = j16;
                                        }
                                    }
                                }
                                j9 = j15 ^ j10;
                                i12 = i18;
                            }
                            j9 = j14 ^ j11;
                        }
                    }
                }
                this.zzi = i12;
                return j9;
            }
        }
        return zzm();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final int zzb(int i9) throws zzaji {
        if (i9 < 0) {
            throw zzaji.zzf();
        }
        int i10 = i9 + this.zzk + this.zzi;
        int i11 = this.zzl;
        if (i10 > i11) {
            throw zzaji.zzi();
        }
        this.zzl = i10;
        zzaa();
        return i11;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final int zzc() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final void zzc(int i9) throws zzaji {
        if (this.zzj != i9) {
            throw zzaji.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final int zzd() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final void zzd(int i9) {
        this.zzl = i9;
        zzaa();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final int zze() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final boolean zze(int i9) throws IOException {
        int iZzi;
        int i10 = i9 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i11 < 10) {
                    if (zzv() < 0) {
                        i11++;
                    }
                }
                throw zzaji.zze();
            }
            while (i11 < 10) {
                byte[] bArr = this.zzf;
                int i12 = this.zzi;
                this.zzi = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw zzaji.zze();
            return true;
        }
        if (i10 == 1) {
            zzh(8);
            return true;
        }
        if (i10 == 2) {
            zzh(zzx());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzaji.zza();
            }
            zzh(4);
            return true;
        }
        do {
            iZzi = zzi();
            if (iZzi == 0) {
                break;
            }
        } while (zze(iZzi));
        zzc(((i9 >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final int zzf() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final int zzg() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final int zzh() throws IOException {
        return zzaia.zza(zzx());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final int zzi() throws IOException {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int iZzx = zzx();
        this.zzj = iZzx;
        if ((iZzx >>> 3) != 0) {
            return iZzx;
        }
        throw zzaji.zzc();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final long zzk() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final long zzl() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final long zzm() throws IOException {
        long j9 = 0;
        for (int i9 = 0; i9 < 64; i9 += 7) {
            byte bZzv = zzv();
            j9 |= ((long) (bZzv & 127)) << i9;
            if ((bZzv & 128) == 0) {
                return j9;
            }
        }
        throw zzaji.zze();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final long zzn() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final long zzo() throws IOException {
        return zzaia.zza(zzz());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final long zzp() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final zzahp zzq() throws IOException {
        int iZzx = zzx();
        int i9 = this.zzg;
        int i10 = this.zzi;
        if (iZzx <= i9 - i10 && iZzx > 0) {
            zzahp zzahpVarZza = zzahp.zza(this.zzf, i10, iZzx);
            this.zzi += iZzx;
            return zzahpVarZza;
        }
        if (iZzx == 0) {
            return zzahp.zza;
        }
        byte[] bArrZzj = zzj(iZzx);
        if (bArrZzj != null) {
            return zzahp.zza(bArrZzj);
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int length = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzf = zzf(iZzx - length);
        byte[] bArr = new byte[iZzx];
        System.arraycopy(this.zzf, i11, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return zzahp.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final String zzr() throws IOException {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i9 = this.zzg;
            int i10 = this.zzi;
            if (iZzx <= i9 - i10) {
                String str = new String(this.zzf, i10, iZzx, zzajf.zza);
                this.zzi += iZzx;
                return str;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx > this.zzg) {
            return new String(zza(iZzx, false), zzajf.zza);
        }
        zzg(iZzx);
        String str2 = new String(this.zzf, this.zzi, iZzx, zzajf.zza);
        this.zzi += iZzx;
        return str2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final String zzs() throws IOException {
        byte[] bArrZza;
        int iZzx = zzx();
        int i9 = this.zzi;
        int i10 = this.zzg;
        if (iZzx <= i10 - i9 && iZzx > 0) {
            bArrZza = this.zzf;
            this.zzi = i9 + iZzx;
        } else {
            if (iZzx == 0) {
                return "";
            }
            i9 = 0;
            if (iZzx <= i10) {
                zzg(iZzx);
                bArrZza = this.zzf;
                this.zzi = iZzx;
            } else {
                bArrZza = zza(iZzx, false);
            }
        }
        return zzaml.zzb(bArrZza, i9, iZzx);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final boolean zzt() throws IOException {
        return this.zzi == this.zzg && !zzi(1);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final boolean zzu() throws IOException {
        return zzz() != 0;
    }
}
