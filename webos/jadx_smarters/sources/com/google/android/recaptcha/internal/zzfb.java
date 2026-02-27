package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzfb extends zzff {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    public /* synthetic */ zzfb(byte[] bArr, int i9, int i10, boolean z9, zzfa zzfaVar) {
        super(null);
        this.zzj = a.e.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzI() {
        int i9 = this.zzf + this.zzg;
        this.zzf = i9;
        int i10 = this.zzj;
        if (i9 <= i10) {
            this.zzg = 0;
            return;
        }
        int i11 = i9 - i10;
        this.zzg = i11;
        this.zzf = i9 - i11;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final void zzA(int i9) {
        this.zzj = i9;
        zzI();
    }

    public final void zzB(int i9) throws IOException {
        if (i9 >= 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (i9 <= i10 - i11) {
                this.zzh = i11 + i9;
                return;
            }
        }
        if (i9 >= 0) {
            throw zzgy.zzj();
        }
        throw zzgy.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final boolean zzC() throws IOException {
        return this.zzh == this.zzf;
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
            if (this.zzf - this.zzh < 10) {
                while (i11 < 10) {
                    if (zza() < 0) {
                        i11++;
                    }
                }
                throw zzgy.zze();
            }
            while (i11 < 10) {
                byte[] bArr = this.zze;
                int i12 = this.zzh;
                this.zzh = i12 + 1;
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
        int i9 = this.zzh;
        if (i9 == this.zzf) {
            throw zzgy.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i9 + 1;
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
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zze(int i9) throws zzgy {
        if (i9 < 0) {
            throw zzgy.zzf();
        }
        int i10 = i9 + this.zzh;
        if (i10 < 0) {
            throw zzgy.zzg();
        }
        int i11 = this.zzj;
        if (i10 > i11) {
            throw zzgy.zzj();
        }
        this.zzj = i10;
        zzI();
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
        int i9 = this.zzh;
        if (this.zzf - i9 < 4) {
            throw zzgy.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i9 + 4;
        int i10 = bArr[i9] & 255;
        int i11 = bArr[i9 + 1] & 255;
        int i12 = bArr[i9 + 2] & 255;
        return ((bArr[i9 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int zzj() throws IOException {
        int i9;
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b9 = bArr[i10];
            if (b9 >= 0) {
                this.zzh = i12;
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
                this.zzh = i13;
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
            this.zzi = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzi = iZzj;
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
        int i9 = this.zzh;
        if (this.zzf - i9 < 8) {
            throw zzgy.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i9 + 8;
        long j9 = bArr[i9];
        long j10 = (((long) bArr[i9 + 1]) & 255) << 8;
        long j11 = bArr[i9 + 2];
        long j12 = bArr[i9 + 3];
        return ((((long) bArr[i9 + 7]) & 255) << 56) | (j9 & 255) | j10 | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
    }

    public final long zzr() throws IOException {
        long j9;
        long j10;
        int i9 = this.zzh;
        int i10 = this.zzf;
        if (i10 != i9) {
            byte[] bArr = this.zze;
            int i11 = i9 + 1;
            byte b9 = bArr[i9];
            if (b9 >= 0) {
                this.zzh = i11;
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
                this.zzh = i12;
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
        if (iZzj > 0) {
            int i9 = this.zzf;
            int i10 = this.zzh;
            if (iZzj <= i9 - i10) {
                zzez zzezVarZzm = zzez.zzm(this.zze, i10, iZzj);
                this.zzh += iZzj;
                return zzezVarZzm;
            }
        }
        if (iZzj == 0) {
            return zzez.zzb;
        }
        if (iZzj > 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (iZzj <= i11 - i12) {
                int i13 = iZzj + i12;
                this.zzh = i13;
                return new zzew(Arrays.copyOfRange(this.zze, i12, i13));
            }
        }
        if (iZzj <= 0) {
            throw zzgy.zzf();
        }
        throw zzgy.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i9 = this.zzf;
            int i10 = this.zzh;
            if (iZzj <= i9 - i10) {
                String str = new String(this.zze, i10, iZzj, zzgw.zzb);
                this.zzh += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zzgy.zzf();
        }
        throw zzgy.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final String zzy() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i9 = this.zzf;
            int i10 = this.zzh;
            if (iZzj <= i9 - i10) {
                String strZzd = zzju.zzd(this.zze, i10, iZzj);
                this.zzh += iZzj;
                return strZzd;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw zzgy.zzf();
        }
        throw zzgy.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final void zzz(int i9) throws zzgy {
        if (this.zzi != i9) {
            throw zzgy.zzb();
        }
    }
}
