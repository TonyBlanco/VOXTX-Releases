package com.google.android.gms.internal.cast;

import okhttp3.internal.http2.Http2;
import okio.Segment;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmi extends zzsh implements zztq {
    private static final zzmi zzb;
    private int zzd;
    private zznc zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzov zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        zzmi zzmiVar = new zzmi();
        zzb = zzmiVar;
        zzsh.zzG(zzmi.class, zzmiVar);
    }

    private zzmi() {
    }

    public static zzmh zza() {
        return (zzmh) zzb.zzu();
    }

    public static zzmh zzc(zzmi zzmiVar) {
        zzse zzseVarZzu = zzb.zzu();
        zzseVarZzu.zzo(zzmiVar);
        return (zzmh) zzseVarZzu;
    }

    public static zzmi zze() {
        return zzb;
    }

    public static /* synthetic */ void zzf(zzmi zzmiVar, zznc zzncVar) {
        zzncVar.getClass();
        zzmiVar.zze = zzncVar;
        zzmiVar.zzd |= 1;
    }

    public static /* synthetic */ void zzg(zzmi zzmiVar, boolean z9) {
        zzmiVar.zzd |= 2;
        zzmiVar.zzf = z9;
    }

    public static /* synthetic */ void zzh(zzmi zzmiVar, long j9) {
        zzmiVar.zzd |= 4;
        zzmiVar.zzg = j9;
    }

    public static /* synthetic */ void zzi(zzmi zzmiVar, int i9) {
        zzmiVar.zzd |= 64;
        zzmiVar.zzk = i9;
    }

    public static /* synthetic */ void zzj(zzmi zzmiVar, int i9) {
        zzmiVar.zzd |= 128;
        zzmiVar.zzl = i9;
    }

    public static /* synthetic */ void zzk(zzmi zzmiVar, int i9) {
        zzmiVar.zzd |= 1024;
        zzmiVar.zzo = i9;
    }

    public static /* synthetic */ void zzl(zzmi zzmiVar, boolean z9) {
        zzmiVar.zzd |= 2048;
        zzmiVar.zzp = z9;
    }

    public static /* synthetic */ void zzm(zzmi zzmiVar, int i9) {
        zzmiVar.zzd |= 4096;
        zzmiVar.zzq = i9;
    }

    public static /* synthetic */ void zzn(zzmi zzmiVar, int i9) {
        zzmiVar.zzd |= Segment.SIZE;
        zzmiVar.zzr = i9;
    }

    public static /* synthetic */ void zzo(zzmi zzmiVar, boolean z9) {
        zzmiVar.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzmiVar.zzs = z9;
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i9, Object obj, Object obj2) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsh.zzD(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဌ\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzgu.zza(), "zzj", zzgr.zza(), "zzk", "zzl", "zzm", "zzn", zzih.zza(), "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i10 == 3) {
            return new zzmi();
        }
        zzlu zzluVar = null;
        if (i10 == 4) {
            return new zzmh(zzluVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
