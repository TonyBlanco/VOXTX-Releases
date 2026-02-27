package com.google.android.recaptcha.internal;

import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes3.dex */
public final class zzjy {
    public static final zzfw zza;
    public static final zzfw zzb;
    public static final zzfw zzc;

    static {
        zzfv zzfvVarZzi = zzfw.zzi();
        zzfvVarZzi.zze(-315576000000L);
        zzfvVarZzi.zzd(-999999999);
        zza = (zzfw) zzfvVarZzi.zzj();
        zzfv zzfvVarZzi2 = zzfw.zzi();
        zzfvVarZzi2.zze(315576000000L);
        zzfvVarZzi2.zzd(999999999);
        zzb = (zzfw) zzfvVarZzi2.zzj();
        zzfv zzfvVarZzi3 = zzfw.zzi();
        zzfvVarZzi3.zze(0L);
        zzfvVarZzi3.zzd(0);
        zzc = (zzfw) zzfvVarZzi3.zzj();
    }

    public static zzfw zza(long j9) {
        return zzc(j9 / 1000, (int) ((j9 % 1000) * 1000000));
    }

    public static zzfw zzb(long j9) {
        return zzc(j9 / 1000000000, (int) (j9 % 1000000000));
    }

    public static zzfw zzc(long j9, int i9) {
        if (i9 <= -1000000000 || i9 >= 1000000000) {
            j9 = zzee.zza(j9, i9 / Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            i9 %= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        }
        if (j9 > 0 && i9 < 0) {
            i9 += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            j9--;
        }
        if (j9 < 0 && i9 > 0) {
            i9 -= 1000000000;
            j9++;
        }
        zzfv zzfvVarZzi = zzfw.zzi();
        zzfvVarZzi.zze(j9);
        zzfvVarZzi.zzd(i9);
        zzfw zzfwVar = (zzfw) zzfvVarZzi.zzj();
        long jZzg = zzfwVar.zzg();
        int iZzf = zzfwVar.zzf();
        if (jZzg < -315576000000L || jZzg > 315576000000L || iZzf < -999999999 || iZzf >= 1000000000 || ((jZzg < 0 || iZzf < 0) && (jZzg > 0 || iZzf > 0))) {
            throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(jZzg), Integer.valueOf(iZzf)));
        }
        return zzfwVar;
    }
}
