package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaik extends zzahm {
    private static final Logger zza = Logger.getLogger(zzaik.class.getName());
    private static final boolean zzb = zzamk.zzc();
    zzain zze;

    public static abstract class zza extends zzaik {
        final byte[] zza;
        final int zzb;
        int zzc;
        int zzd;

        public zza(int i9) {
            super();
            if (i9 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i9, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void zza(byte b9) {
            byte[] bArr = this.zza;
            int i9 = this.zzc;
            this.zzc = i9 + 1;
            bArr[i9] = b9;
            this.zzd++;
        }

        public final void zza(int i9) {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            bArr[i10] = (byte) i9;
            bArr[i10 + 1] = (byte) (i9 >> 8);
            bArr[i10 + 2] = (byte) (i9 >> 16);
            this.zzc = i10 + 4;
            bArr[i10 + 3] = (byte) (i9 >>> 24);
            this.zzd += 4;
        }

        public final void zza(int i9, int i10) {
            zzb((i9 << 3) | i10);
        }

        public final void zza(long j9) {
            byte[] bArr = this.zza;
            int i9 = this.zzc;
            bArr[i9] = (byte) (j9 & 255);
            bArr[i9 + 1] = (byte) ((j9 >> 8) & 255);
            bArr[i9 + 2] = (byte) ((j9 >> 16) & 255);
            bArr[i9 + 3] = (byte) (255 & (j9 >> 24));
            bArr[i9 + 4] = (byte) (j9 >> 32);
            bArr[i9 + 5] = (byte) (j9 >> 40);
            bArr[i9 + 6] = (byte) (j9 >> 48);
            this.zzc = i9 + 8;
            bArr[i9 + 7] = (byte) (j9 >> 56);
            this.zzd += 8;
        }

        public final void zzb(int i9) {
            if (!zzaik.zzb) {
                while ((i9 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    bArr[i10] = (byte) ((i9 & 127) | 128);
                    this.zzd++;
                    i9 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                bArr2[i11] = (byte) i9;
                this.zzd++;
                return;
            }
            long j9 = this.zzc;
            while ((i9 & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                zzamk.zza(bArr3, i12, (byte) ((i9 & 127) | 128));
                i9 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            zzamk.zza(bArr4, i13, (byte) i9);
            this.zzd += (int) (((long) this.zzc) - j9);
        }

        public final void zzb(long j9) {
            int i9;
            if (zzaik.zzb) {
                long j10 = this.zzc;
                while ((j9 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    zzamk.zza(bArr, i10, (byte) ((((int) j9) & 127) | 128));
                    j9 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                zzamk.zza(bArr2, i11, (byte) j9);
                i9 = this.zzd + ((int) (((long) this.zzc) - j10));
            } else {
                while ((j9 & (-128)) != 0) {
                    byte[] bArr3 = this.zza;
                    int i12 = this.zzc;
                    this.zzc = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j9) & 127) | 128);
                    this.zzd++;
                    j9 >>>= 7;
                }
                byte[] bArr4 = this.zza;
                int i13 = this.zzc;
                this.zzc = i13 + 1;
                bArr4[i13] = (byte) j9;
                i9 = this.zzd + 1;
            }
            this.zzd = i9;
        }
    }

    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public static class zzc extends zzaik {
        private final byte[] zza;
        private final int zzb;
        private final int zzc;
        private int zzd;

        public zzc(byte[] bArr, int i9, int i10) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i10) | i10) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
            }
            this.zza = bArr;
            this.zzb = 0;
            this.zzd = 0;
            this.zzc = i10;
        }

        private final void zzc(byte[] bArr, int i9, int i10) throws IOException {
            try {
                System.arraycopy(bArr, i9, this.zza, this.zzd, i10);
                this.zzd += i10;
            } catch (IndexOutOfBoundsException e9) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i10)), e9);
            }
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahm
        public final void zza(byte[] bArr, int i9, int i10) throws IOException {
            zzc(bArr, i9, i10);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(byte b9) throws IOException {
            try {
                byte[] bArr = this.zza;
                int i9 = this.zzd;
                this.zzd = i9 + 1;
                bArr[i9] = b9;
            } catch (IndexOutOfBoundsException e9) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e9);
            }
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(int i9, zzakn zzaknVar) throws IOException {
            zzk(1, 3);
            zzl(2, i9);
            zzk(3, 2);
            zzc(zzaknVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(int i9, String str) throws IOException {
            zzk(i9, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(int i9, boolean z9) throws IOException {
            zzk(i9, 0);
            zzb(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(zzahp zzahpVar) throws IOException {
            zzn(zzahpVar.zzb());
            zzahpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(zzakn zzaknVar, zzalf zzalfVar) throws IOException {
            zzn(((zzahf) zzaknVar).zza(zzalfVar));
            zzalfVar.zza(zzaknVar, this.zze);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(String str) throws IOException {
            int i9 = this.zzd;
            try {
                int iZzj = zzaik.zzj(str.length() * 3);
                int iZzj2 = zzaik.zzj(str.length());
                if (iZzj2 != iZzj) {
                    zzn(zzaml.zza(str));
                    this.zzd = zzaml.zza(str, this.zza, this.zzd, zza());
                    return;
                }
                int i10 = i9 + iZzj2;
                this.zzd = i10;
                int iZza = zzaml.zza(str, this.zza, i10, zza());
                this.zzd = i9;
                zzn((iZza - i9) - iZzj2);
                this.zzd = iZza;
            } catch (zzamo e9) {
                this.zzd = i9;
                zza(str, e9);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(e10);
            }
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(byte[] bArr, int i9, int i10) throws IOException {
            zzn(i10);
            zzc(bArr, 0, i10);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzc(int i9, zzahp zzahpVar) throws IOException {
            zzk(i9, 2);
            zzb(zzahpVar);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzc(int i9, zzakn zzaknVar, zzalf zzalfVar) throws IOException {
            zzk(i9, 2);
            zzn(((zzahf) zzaknVar).zza(zzalfVar));
            zzalfVar.zza(zzaknVar, this.zze);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzc(zzakn zzaknVar) throws IOException {
            zzn(zzaknVar.zzl());
            zzaknVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzd(int i9, zzahp zzahpVar) throws IOException {
            zzk(1, 3);
            zzl(2, i9);
            zzc(3, zzahpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzf(int i9, long j9) throws IOException {
            zzk(i9, 1);
            zzh(j9);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzh(int i9, int i10) throws IOException {
            zzk(i9, 5);
            zzk(i10);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzh(int i9, long j9) throws IOException {
            zzk(i9, 0);
            zzj(j9);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzh(long j9) throws IOException {
            try {
                byte[] bArr = this.zza;
                int i9 = this.zzd;
                bArr[i9] = (byte) j9;
                bArr[i9 + 1] = (byte) (j9 >> 8);
                bArr[i9 + 2] = (byte) (j9 >> 16);
                bArr[i9 + 3] = (byte) (j9 >> 24);
                bArr[i9 + 4] = (byte) (j9 >> 32);
                bArr[i9 + 5] = (byte) (j9 >> 40);
                bArr[i9 + 6] = (byte) (j9 >> 48);
                this.zzd = i9 + 8;
                bArr[i9 + 7] = (byte) (j9 >> 56);
            } catch (IndexOutOfBoundsException e9) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e9);
            }
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzi(int i9, int i10) throws IOException {
            zzk(i9, 0);
            zzl(i10);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzj(long j9) throws IOException {
            if (zzaik.zzb && zza() >= 10) {
                while ((j9 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i9 = this.zzd;
                    this.zzd = i9 + 1;
                    zzamk.zza(bArr, i9, (byte) ((((int) j9) & 127) | 128));
                    j9 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i10 = this.zzd;
                this.zzd = 1 + i10;
                zzamk.zza(bArr2, i10, (byte) j9);
                return;
            }
            while ((j9 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zza;
                    int i11 = this.zzd;
                    this.zzd = i11 + 1;
                    bArr3[i11] = (byte) ((((int) j9) & 127) | 128);
                    j9 >>>= 7;
                } catch (IndexOutOfBoundsException e9) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e9);
                }
            }
            byte[] bArr4 = this.zza;
            int i12 = this.zzd;
            this.zzd = i12 + 1;
            bArr4[i12] = (byte) j9;
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzk(int i9) throws IOException {
            try {
                byte[] bArr = this.zza;
                int i10 = this.zzd;
                bArr[i10] = (byte) i9;
                bArr[i10 + 1] = (byte) (i9 >> 8);
                bArr[i10 + 2] = (byte) (i9 >> 16);
                this.zzd = i10 + 4;
                bArr[i10 + 3] = (byte) (i9 >>> 24);
            } catch (IndexOutOfBoundsException e9) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e9);
            }
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzk(int i9, int i10) throws IOException {
            zzn((i9 << 3) | i10);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzl(int i9) throws IOException {
            if (i9 >= 0) {
                zzn(i9);
            } else {
                zzj(i9);
            }
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzl(int i9, int i10) throws IOException {
            zzk(i9, 0);
            zzn(i10);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzn(int i9) throws IOException {
            while ((i9 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i10 = this.zzd;
                    this.zzd = i10 + 1;
                    bArr[i10] = (byte) ((i9 & 127) | 128);
                    i9 >>>= 7;
                } catch (IndexOutOfBoundsException e9) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e9);
                }
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr2[i11] = (byte) i9;
        }
    }

    public static final class zzd extends zza {
        private final OutputStream zzf;

        public zzd(OutputStream outputStream, int i9) {
            super(i9);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.zzf = outputStream;
        }

        private final void zzc(byte[] bArr, int i9, int i10) throws IOException {
            int i11 = this.zzb;
            int i12 = this.zzc;
            if (i11 - i12 >= i10) {
                System.arraycopy(bArr, i9, this.zza, i12, i10);
                this.zzc += i10;
            } else {
                int i13 = i11 - i12;
                System.arraycopy(bArr, i9, this.zza, i12, i13);
                int i14 = i9 + i13;
                i10 -= i13;
                this.zzc = this.zzb;
                this.zzd += i13;
                zze();
                if (i10 <= this.zzb) {
                    System.arraycopy(bArr, i14, this.zza, 0, i10);
                    this.zzc = i10;
                } else {
                    this.zzf.write(bArr, i14, i10);
                }
            }
            this.zzd += i10;
        }

        private final void zze() throws IOException {
            this.zzf.write(this.zza, 0, this.zzc);
            this.zzc = 0;
        }

        private final void zzo(int i9) throws IOException {
            if (this.zzb - this.zzc < i9) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahm
        public final void zza(byte[] bArr, int i9, int i10) throws IOException {
            zzc(bArr, i9, i10);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(byte b9) throws IOException {
            if (this.zzc == this.zzb) {
                zze();
            }
            zza(b9);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(int i9, zzakn zzaknVar) throws IOException {
            zzk(1, 3);
            zzl(2, i9);
            zzk(3, 2);
            zzc(zzaknVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(int i9, String str) throws IOException {
            zzk(i9, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(int i9, boolean z9) throws IOException {
            zzo(11);
            zza(i9, 0);
            zza(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(zzahp zzahpVar) throws IOException {
            zzn(zzahpVar.zzb());
            zzahpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(zzakn zzaknVar, zzalf zzalfVar) throws IOException {
            zzn(((zzahf) zzaknVar).zza(zzalfVar));
            zzalfVar.zza(zzaknVar, this.zze);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(String str) throws IOException {
            int iZza;
            try {
                int length = str.length() * 3;
                int iZzj = zzaik.zzj(length);
                int i9 = iZzj + length;
                int i10 = this.zzb;
                if (i9 > i10) {
                    byte[] bArr = new byte[length];
                    int iZza2 = zzaml.zza(str, bArr, 0, length);
                    zzn(iZza2);
                    zza(bArr, 0, iZza2);
                    return;
                }
                if (i9 > i10 - this.zzc) {
                    zze();
                }
                int iZzj2 = zzaik.zzj(str.length());
                int i11 = this.zzc;
                try {
                    if (iZzj2 == iZzj) {
                        int i12 = i11 + iZzj2;
                        this.zzc = i12;
                        int iZza3 = zzaml.zza(str, this.zza, i12, this.zzb - i12);
                        this.zzc = i11;
                        iZza = (iZza3 - i11) - iZzj2;
                        zzb(iZza);
                        this.zzc = iZza3;
                    } else {
                        iZza = zzaml.zza(str);
                        zzb(iZza);
                        this.zzc = zzaml.zza(str, this.zza, this.zzc, iZza);
                    }
                    this.zzd += iZza;
                } catch (zzamo e9) {
                    this.zzd -= this.zzc - i11;
                    this.zzc = i11;
                    throw e9;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new zzb(e10);
                }
            } catch (zzamo e11) {
                zza(str, e11);
            }
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzb(byte[] bArr, int i9, int i10) throws IOException {
            zzn(i10);
            zzc(bArr, 0, i10);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzc() throws IOException {
            if (this.zzc > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzc(int i9, zzahp zzahpVar) throws IOException {
            zzk(i9, 2);
            zzb(zzahpVar);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzc(int i9, zzakn zzaknVar, zzalf zzalfVar) throws IOException {
            zzk(i9, 2);
            zzb(zzaknVar, zzalfVar);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzc(zzakn zzaknVar) throws IOException {
            zzn(zzaknVar.zzl());
            zzaknVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzd(int i9, zzahp zzahpVar) throws IOException {
            zzk(1, 3);
            zzl(2, i9);
            zzc(3, zzahpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzf(int i9, long j9) throws IOException {
            zzo(18);
            zza(i9, 1);
            zza(j9);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzh(int i9, int i10) throws IOException {
            zzo(14);
            zza(i9, 5);
            zza(i10);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzh(int i9, long j9) throws IOException {
            zzo(20);
            zza(i9, 0);
            zzb(j9);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzh(long j9) throws IOException {
            zzo(8);
            zza(j9);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzi(int i9, int i10) throws IOException {
            zzo(20);
            zza(i9, 0);
            if (i10 >= 0) {
                zzb(i10);
            } else {
                zzb(i10);
            }
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzj(long j9) throws IOException {
            zzo(10);
            zzb(j9);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzk(int i9) throws IOException {
            zzo(4);
            zza(i9);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzk(int i9, int i10) throws IOException {
            zzn((i9 << 3) | i10);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzl(int i9) throws IOException {
            if (i9 >= 0) {
                zzn(i9);
            } else {
                zzj(i9);
            }
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzl(int i9, int i10) throws IOException {
            zzo(20);
            zza(i9, 0);
            zzb(i10);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaik
        public final void zzn(int i9) throws IOException {
            zzo(5);
            zzb(i9);
        }
    }

    private zzaik() {
    }

    public static int zza(double d9) {
        return 8;
    }

    public static int zza(float f9) {
        return 4;
    }

    private static int zza(int i9) {
        return (i9 >> 31) ^ (i9 << 1);
    }

    public static int zza(int i9, double d9) {
        return zzj(i9 << 3) + 8;
    }

    public static int zza(int i9, float f9) {
        return zzj(i9 << 3) + 4;
    }

    public static int zza(int i9, long j9) {
        return zzj(i9 << 3) + 8;
    }

    public static int zza(int i9, zzahp zzahpVar) {
        int iZzj = zzj(i9 << 3);
        int iZzb = zzahpVar.zzb();
        return iZzj + zzj(iZzb) + iZzb;
    }

    public static int zza(int i9, zzajr zzajrVar) {
        return (zzj(8) << 1) + zzg(2, i9) + zzb(3, zzajrVar);
    }

    public static int zza(int i9, zzakn zzaknVar) {
        return (zzj(8) << 1) + zzg(2, i9) + zzj(24) + zzb(zzaknVar);
    }

    @Deprecated
    public static int zza(int i9, zzakn zzaknVar, zzalf zzalfVar) {
        return (zzj(i9 << 3) << 1) + ((zzahf) zzaknVar).zza(zzalfVar);
    }

    public static int zza(int i9, String str) {
        return zzj(i9 << 3) + zza(str);
    }

    public static int zza(int i9, boolean z9) {
        return zzj(i9 << 3) + 1;
    }

    public static int zza(zzahp zzahpVar) {
        int iZzb = zzahpVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    public static int zza(zzajr zzajrVar) {
        int iZzb = zzajrVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    @Deprecated
    public static int zza(zzakn zzaknVar) {
        return zzaknVar.zzl();
    }

    public static int zza(zzakn zzaknVar, zzalf zzalfVar) {
        int iZza = ((zzahf) zzaknVar).zza(zzalfVar);
        return zzj(iZza) + iZza;
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzaml.zza(str);
        } catch (zzamo unused) {
            length = str.getBytes(zzajf.zza).length;
        }
        return zzj(length) + length;
    }

    public static int zza(boolean z9) {
        return 1;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    private static long zza(long j9) {
        return (j9 >> 63) ^ (j9 << 1);
    }

    public static zzaik zza(OutputStream outputStream, int i9) {
        return new zzd(outputStream, i9);
    }

    public static int zzb(int i9, int i10) {
        return zzj(i9 << 3) + zze(i10);
    }

    public static int zzb(int i9, long j9) {
        return zzj(i9 << 3) + zzg(j9);
    }

    public static int zzb(int i9, zzahp zzahpVar) {
        return (zzj(8) << 1) + zzg(2, i9) + zza(3, zzahpVar);
    }

    public static int zzb(int i9, zzajr zzajrVar) {
        int iZzj = zzj(i9 << 3);
        int iZzb = zzajrVar.zzb();
        return iZzj + zzj(iZzb) + iZzb;
    }

    public static int zzb(int i9, zzakn zzaknVar, zzalf zzalfVar) {
        return zzj(i9 << 3) + zza(zzaknVar, zzalfVar);
    }

    public static int zzb(zzakn zzaknVar) {
        int iZzl = zzaknVar.zzl();
        return zzj(iZzl) + iZzl;
    }

    public static zzaik zzb(byte[] bArr) {
        return new zzc(bArr, 0, bArr.length);
    }

    public static int zzc(int i9) {
        return zze(i9);
    }

    public static int zzc(int i9, int i10) {
        return zzj(i9 << 3) + 4;
    }

    public static int zzc(int i9, long j9) {
        return zzj(i9 << 3) + 8;
    }

    public static int zzc(long j9) {
        return 8;
    }

    public static int zzd(int i9) {
        return 4;
    }

    public static int zzd(int i9, int i10) {
        return zzj(i9 << 3) + zze(i10);
    }

    public static int zzd(int i9, long j9) {
        return zzj(i9 << 3) + zzg(zza(j9));
    }

    public static int zzd(long j9) {
        return zzg(j9);
    }

    public static int zze(int i9) {
        if (i9 >= 0) {
            return zzj(i9);
        }
        return 10;
    }

    public static int zze(int i9, int i10) {
        return zzj(i9 << 3) + 4;
    }

    public static int zze(int i9, long j9) {
        return zzj(i9 << 3) + zzg(j9);
    }

    public static int zze(long j9) {
        return 8;
    }

    public static int zzf(int i9) {
        if (i9 > 4096) {
            return 4096;
        }
        return i9;
    }

    public static int zzf(int i9, int i10) {
        return zzj(i9 << 3) + zzj(zza(i10));
    }

    public static int zzf(long j9) {
        return zzg(zza(j9));
    }

    public static int zzg(int i9) {
        return 4;
    }

    public static int zzg(int i9, int i10) {
        return zzj(i9 << 3) + zzj(i10);
    }

    public static int zzg(long j9) {
        int i9;
        if (((-128) & j9) == 0) {
            return 1;
        }
        if (j9 < 0) {
            return 10;
        }
        if (((-34359738368L) & j9) != 0) {
            j9 >>>= 28;
            i9 = 6;
        } else {
            i9 = 2;
        }
        if (((-2097152) & j9) != 0) {
            i9 += 2;
            j9 >>>= 14;
        }
        return (j9 & (-16384)) != 0 ? i9 + 1 : i9;
    }

    public static int zzh(int i9) {
        return zzj(zza(i9));
    }

    public static int zzi(int i9) {
        return zzj(i9 << 3);
    }

    public static int zzj(int i9) {
        if ((i9 & (-128)) == 0) {
            return 1;
        }
        if ((i9 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i9) == 0) {
            return 3;
        }
        return (i9 & (-268435456)) == 0 ? 4 : 5;
    }

    public abstract int zza();

    public final void zza(String str, zzamo zzamoVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzamoVar);
        byte[] bytes = str.getBytes(zzajf.zza);
        try {
            zzn(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e9) {
            throw new zzb(e9);
        }
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzb(byte b9) throws IOException;

    public final void zzb(double d9) throws IOException {
        zzh(Double.doubleToRawLongBits(d9));
    }

    public final void zzb(float f9) throws IOException {
        zzk(Float.floatToRawIntBits(f9));
    }

    public final void zzb(int i9, double d9) throws IOException {
        zzf(i9, Double.doubleToRawLongBits(d9));
    }

    public final void zzb(int i9, float f9) throws IOException {
        zzh(i9, Float.floatToRawIntBits(f9));
    }

    public abstract void zzb(int i9, zzakn zzaknVar) throws IOException;

    public abstract void zzb(int i9, String str) throws IOException;

    public abstract void zzb(int i9, boolean z9) throws IOException;

    public abstract void zzb(zzahp zzahpVar) throws IOException;

    public abstract void zzb(zzakn zzaknVar, zzalf zzalfVar) throws IOException;

    public abstract void zzb(String str) throws IOException;

    public final void zzb(boolean z9) throws IOException {
        zzb(z9 ? (byte) 1 : (byte) 0);
    }

    public abstract void zzb(byte[] bArr, int i9, int i10) throws IOException;

    public abstract void zzc() throws IOException;

    public abstract void zzc(int i9, zzahp zzahpVar) throws IOException;

    public abstract void zzc(int i9, zzakn zzaknVar, zzalf zzalfVar) throws IOException;

    public abstract void zzc(zzakn zzaknVar) throws IOException;

    public abstract void zzd(int i9, zzahp zzahpVar) throws IOException;

    public abstract void zzf(int i9, long j9) throws IOException;

    public final void zzg(int i9, long j9) throws IOException {
        zzh(i9, zza(j9));
    }

    public abstract void zzh(int i9, int i10) throws IOException;

    public abstract void zzh(int i9, long j9) throws IOException;

    public abstract void zzh(long j9) throws IOException;

    public abstract void zzi(int i9, int i10) throws IOException;

    public final void zzi(long j9) throws IOException {
        zzj(zza(j9));
    }

    public final void zzj(int i9, int i10) throws IOException {
        zzl(i9, zza(i10));
    }

    public abstract void zzj(long j9) throws IOException;

    public abstract void zzk(int i9) throws IOException;

    public abstract void zzk(int i9, int i10) throws IOException;

    public abstract void zzl(int i9) throws IOException;

    public abstract void zzl(int i9, int i10) throws IOException;

    public final void zzm(int i9) throws IOException {
        zzn(zza(i9));
    }

    public abstract void zzn(int i9) throws IOException;
}
