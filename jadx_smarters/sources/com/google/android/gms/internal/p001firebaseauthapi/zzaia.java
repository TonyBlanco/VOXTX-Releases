package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaia {
    private static volatile int zze = 100;
    int zza;
    int zzb;
    int zzc;
    zzaij zzd;
    private boolean zzf;

    private zzaia() {
        this.zzb = zze;
        this.zzc = a.e.API_PRIORITY_OTHER;
        this.zzf = false;
    }

    public static int zza(int i9) {
        return (-(i9 & 1)) ^ (i9 >>> 1);
    }

    public static long zza(long j9) {
        return (-(j9 & 1)) ^ (j9 >>> 1);
    }

    public static zzaia zza(byte[] bArr, int i9, int i10, boolean z9) {
        zzaid zzaidVar = new zzaid(bArr, i9, i10, z9);
        try {
            zzaidVar.zzb(i10);
            return zzaidVar;
        } catch (zzaji e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public abstract double zza() throws IOException;

    public abstract float zzb() throws IOException;

    public abstract int zzb(int i9) throws zzaji;

    public abstract int zzc();

    public abstract void zzc(int i9) throws zzaji;

    public abstract int zzd() throws IOException;

    public abstract void zzd(int i9);

    public abstract int zze() throws IOException;

    public abstract boolean zze(int i9) throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract long zzk() throws IOException;

    public abstract long zzl() throws IOException;

    public abstract long zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract zzahp zzq() throws IOException;

    public abstract String zzr() throws IOException;

    public abstract String zzs() throws IOException;

    public abstract boolean zzt() throws IOException;

    public abstract boolean zzu() throws IOException;
}
