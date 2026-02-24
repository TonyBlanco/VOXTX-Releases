package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzff {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzfg zzc;

    public /* synthetic */ zzff(zzfe zzfeVar) {
    }

    public static int zzF(int i9) {
        return (i9 >>> 1) ^ (-(i9 & 1));
    }

    public static long zzG(long j9) {
        return (j9 >>> 1) ^ (-(1 & j9));
    }

    public static zzff zzH(byte[] bArr, int i9, int i10, boolean z9) {
        zzfb zzfbVar = new zzfb(bArr, 0, 0, false, null);
        try {
            zzfbVar.zze(0);
            return zzfbVar;
        } catch (zzgy e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public abstract void zzA(int i9);

    public abstract boolean zzC() throws IOException;

    public abstract boolean zzD() throws IOException;

    public abstract boolean zzE(int i9) throws IOException;

    public abstract double zzb() throws IOException;

    public abstract float zzc() throws IOException;

    public abstract int zzd();

    public abstract int zze(int i9) throws zzgy;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract long zzv() throws IOException;

    public abstract zzez zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract String zzy() throws IOException;

    public abstract void zzz(int i9) throws zzgy;
}
