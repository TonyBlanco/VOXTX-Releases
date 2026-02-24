package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzru extends zzrc {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzru.class.getName());
    private static final boolean zzd = zzvb.zzx();
    zzrv zza;

    private zzru() {
    }

    public /* synthetic */ zzru(zzrt zzrtVar) {
    }

    @Deprecated
    public static int zzt(int i9, zztp zztpVar, zzua zzuaVar) {
        int iZzp = ((zzqz) zztpVar).zzp(zzuaVar);
        int iZzx = zzx(i9 << 3);
        return iZzx + iZzx + iZzp;
    }

    public static int zzu(int i9) {
        if (i9 >= 0) {
            return zzx(i9);
        }
        return 10;
    }

    public static int zzv(zztp zztpVar, zzua zzuaVar) {
        int iZzp = ((zzqz) zztpVar).zzp(zzuaVar);
        return zzx(iZzp) + iZzp;
    }

    public static int zzw(String str) {
        int length;
        try {
            length = zzvf.zzc(str);
        } catch (zzve unused) {
            length = str.getBytes(zzsq.zzb).length;
        }
        return zzx(length) + length;
    }

    public static int zzx(int i9) {
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

    public static int zzy(long j9) {
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

    public static zzru zzz(byte[] bArr, int i9, int i10) {
        return new zzrr(bArr, 0, i10);
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzB(String str, zzve zzveVar) throws IOException {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzveVar);
        byte[] bytes = str.getBytes(zzsq.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e9) {
            throw new zzrs(e9);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b9) throws IOException;

    public abstract void zzd(int i9, boolean z9) throws IOException;

    public abstract void zze(int i9, zzrm zzrmVar) throws IOException;

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
