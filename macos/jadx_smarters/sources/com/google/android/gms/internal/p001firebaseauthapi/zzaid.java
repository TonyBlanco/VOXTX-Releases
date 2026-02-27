package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzaid extends zzaia {
    private final byte[] zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    private zzaid(byte[] bArr, int i9, int i10, boolean z9) {
        super();
        this.zzl = a.e.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzg = i10 + i9;
        this.zzi = i9;
        this.zzj = i9;
        this.zzf = z9;
    }

    private final void zzaa() {
        int i9 = this.zzg + this.zzh;
        this.zzg = i9;
        int i10 = i9 - this.zzj;
        int i11 = this.zzl;
        if (i10 <= i11) {
            this.zzh = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzh = i12;
        this.zzg = i9 - i12;
    }

    private final void zzf(int i9) throws IOException {
        if (i9 >= 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (i9 <= i10 - i11) {
                this.zzi = i11 + i9;
                return;
            }
        }
        if (i9 >= 0) {
            throw zzaji.zzi();
        }
        throw zzaji.zzf();
    }

    private final byte zzv() throws IOException {
        int i9 = this.zzi;
        if (i9 == this.zzg) {
            throw zzaji.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i9 + 1;
        return bArr[i9];
    }

    private final int zzw() throws IOException {
        int i9 = this.zzi;
        if (this.zzg - i9 < 4) {
            throw zzaji.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i9 + 4;
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    private final int zzx() throws IOException {
        int i9;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zze;
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
            throw zzaji.zzi();
        }
        byte[] bArr = this.zze;
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
            byte[] bArr = this.zze;
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
        int iZzc = i9 + zzc();
        if (iZzc < 0) {
            throw zzaji.zzg();
        }
        int i10 = this.zzl;
        if (iZzc > i10) {
            throw zzaji.zzi();
        }
        this.zzl = iZzc;
        zzaa();
        return i10;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final int zzc() {
        return this.zzi - this.zzj;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final void zzc(int i9) throws zzaji {
        if (this.zzk != i9) {
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
                byte[] bArr = this.zze;
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
            zzf(8);
            return true;
        }
        if (i10 == 2) {
            zzf(zzx());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzaji.zza();
            }
            zzf(4);
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
            this.zzk = 0;
            return 0;
        }
        int iZzx = zzx();
        this.zzk = iZzx;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.p001firebaseauthapi.zzahp zzq() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.zzx()
            if (r0 <= 0) goto L19
            int r1 = r3.zzg
            int r2 = r3.zzi
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.zze
            com.google.android.gms.internal.firebase-auth-api.zzahp r1 = com.google.android.gms.internal.p001firebaseauthapi.zzahp.zza(r1, r2, r0)
            int r2 = r3.zzi
            int r2 = r2 + r0
            r3.zzi = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.firebase-auth-api.zzahp r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahp.zza
            return r0
        L1e:
            if (r0 <= 0) goto L31
            int r1 = r3.zzg
            int r2 = r3.zzi
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            int r0 = r0 + r2
            r3.zzi = r0
            byte[] r1 = r3.zze
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            goto L37
        L31:
            if (r0 > 0) goto L41
            if (r0 != 0) goto L3c
            byte[] r0 = com.google.android.gms.internal.p001firebaseauthapi.zzajf.zzb
        L37:
            com.google.android.gms.internal.firebase-auth-api.zzahp r0 = com.google.android.gms.internal.p001firebaseauthapi.zzahp.zzb(r0)
            return r0
        L3c:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzf()
            throw r0
        L41:
            com.google.android.gms.internal.firebase-auth-api.zzaji r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzi()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaid.zzq():com.google.android.gms.internal.firebase-auth-api.zzahp");
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final String zzr() throws IOException {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i9 = this.zzg;
            int i10 = this.zzi;
            if (iZzx <= i9 - i10) {
                String str = new String(this.zze, i10, iZzx, zzajf.zza);
                this.zzi += iZzx;
                return str;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx < 0) {
            throw zzaji.zzf();
        }
        throw zzaji.zzi();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final String zzs() throws IOException {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i9 = this.zzg;
            int i10 = this.zzi;
            if (iZzx <= i9 - i10) {
                String strZzb = zzaml.zzb(this.zze, i10, iZzx);
                this.zzi += iZzx;
                return strZzb;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx <= 0) {
            throw zzaji.zzf();
        }
        throw zzaji.zzi();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final boolean zzt() throws IOException {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaia
    public final boolean zzu() throws IOException {
        return zzz() != 0;
    }
}
