package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzby extends zzbf {
    private static final Logger zzb = Logger.getLogger(zzby.class.getName());
    private static final boolean zzc = zzfp.zzx();
    zzbz zza;

    private zzby() {
        throw null;
    }

    public /* synthetic */ zzby(zzbx zzbxVar) {
    }

    @Deprecated
    public static int zzt(int i9, zzec zzecVar, zzeo zzeoVar) {
        int iZzw = zzw(i9 << 3);
        return iZzw + iZzw + ((zzay) zzecVar).zza(zzeoVar);
    }

    public static int zzu(zzec zzecVar, zzeo zzeoVar) {
        int iZza = ((zzay) zzecVar).zza(zzeoVar);
        return zzw(iZza) + iZza;
    }

    public static int zzv(String str) {
        int length;
        try {
            length = zzfu.zzc(str);
        } catch (zzft unused) {
            length = str.getBytes(zzda.zzb).length;
        }
        return zzw(length) + length;
    }

    public static int zzw(int i9) {
        return (352 - (Integer.numberOfLeadingZeros(i9) * 9)) >>> 6;
    }

    public static int zzx(long j9) {
        return (640 - (Long.numberOfLeadingZeros(j9) * 9)) >>> 6;
    }

    public static zzby zzy(byte[] bArr, int i9, int i10) {
        return new zzbv(bArr, 0, i10);
    }

    public final void zzA(String str, zzft zzftVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzftVar);
        byte[] bytes = str.getBytes(zzda.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e9) {
            throw new zzbw(e9);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b9) throws IOException;

    public abstract void zzd(int i9, boolean z9) throws IOException;

    public abstract void zze(int i9, zzbq zzbqVar) throws IOException;

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

    public final void zzz() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
