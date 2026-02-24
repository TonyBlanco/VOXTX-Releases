package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfk extends zzep {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzfk.class.getName());
    private static final boolean zzd = zzjp.zzx();
    zzfl zza;

    private zzfk() {
    }

    public /* synthetic */ zzfk(zzfj zzfjVar) {
    }

    public static zzfk zzA(byte[] bArr, int i9, int i10) {
        return new zzfh(bArr, 0, i10);
    }

    @Deprecated
    public static int zzt(int i9, zzhy zzhyVar, zzil zzilVar) {
        int iZza = ((zzei) zzhyVar).zza(zzilVar);
        int iZzy = zzy(i9 << 3);
        return iZzy + iZzy + iZza;
    }

    public static int zzu(int i9) {
        if (i9 >= 0) {
            return zzy(i9);
        }
        return 10;
    }

    public static int zzv(zzhy zzhyVar) {
        int iZzn = zzhyVar.zzn();
        return zzy(iZzn) + iZzn;
    }

    public static int zzw(zzhy zzhyVar, zzil zzilVar) {
        int iZza = ((zzei) zzhyVar).zza(zzilVar);
        return zzy(iZza) + iZza;
    }

    public static int zzx(String str) {
        int length;
        try {
            length = zzju.zzc(str);
        } catch (zzjt unused) {
            length = str.getBytes(zzgw.zzb).length;
        }
        return zzy(length) + length;
    }

    public static int zzy(int i9) {
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

    public static int zzz(long j9) {
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
            j9 >>>= 14;
            i9 += 2;
        }
        return (j9 & (-16384)) != 0 ? i9 + 1 : i9;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzC(String str, zzjt zzjtVar) throws IOException {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzjtVar);
        byte[] bytes = str.getBytes(zzgw.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e9) {
            throw new zzfi(e9);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b9) throws IOException;

    public abstract void zzd(int i9, boolean z9) throws IOException;

    public abstract void zze(int i9, zzez zzezVar) throws IOException;

    public abstract void zzf(int i9, int i10) throws IOException;

    public abstract void zzg(int i9) throws IOException;

    public abstract void zzh(int i9, long j9) throws IOException;

    public abstract void zzi(long j9) throws IOException;

    public abstract void zzj(int i9, int i10) throws IOException;

    public abstract void zzk(int i9) throws IOException;

    public abstract void zzl(byte[] bArr, int i9, int i10) throws IOException;

    public abstract void zzm(int i9, String str) throws IOException;

    public abstract void zzo(int i9, int i10) throws IOException;

    public abstract void zzp(int i9, int i10) throws IOException;

    public abstract void zzq(int i9) throws IOException;

    public abstract void zzr(int i9, long j9) throws IOException;

    public abstract void zzs(long j9) throws IOException;
}
