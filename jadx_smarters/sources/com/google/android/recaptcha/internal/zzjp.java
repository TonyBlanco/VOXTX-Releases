package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzjp {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzjo zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    static {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzjp.<clinit>():void");
    }

    private zzjp() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i9 = zzel.zza;
        Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (fieldZzC != null) {
            return fieldZzC;
        }
        Field fieldZzC2 = zzC(Buffer.class, "address");
        if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j9, byte b9) {
        zzjo zzjoVar = zzf;
        long j10 = (-4) & j9;
        int i9 = zzjoVar.zza.getInt(obj, j10);
        int i10 = ((~((int) j9)) & 3) << 3;
        zzjoVar.zza.putInt(obj, j10, ((255 & b9) << i10) | (i9 & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j9, byte b9) {
        zzjo zzjoVar = zzf;
        long j10 = (-4) & j9;
        int i9 = (((int) j9) & 3) << 3;
        zzjoVar.zza.putInt(obj, j10, ((255 & b9) << i9) | (zzjoVar.zza.getInt(obj, j10) & (~(255 << i9))));
    }

    public static double zza(Object obj, long j9) {
        return zzf.zza(obj, j9);
    }

    public static float zzb(Object obj, long j9) {
        return zzf.zzb(obj, j9);
    }

    public static int zzc(Object obj, long j9) {
        return zzf.zza.getInt(obj, j9);
    }

    public static long zzd(Object obj, long j9) {
        return zzf.zza.getLong(obj, j9);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e9) {
            throw new IllegalStateException(e9);
        }
    }

    public static Object zzf(Object obj, long j9) {
        return zzf.zza.getObject(obj, j9);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzjl());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzjp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzm(Object obj, long j9, boolean z9) {
        zzf.zzc(obj, j9, z9);
    }

    public static void zzn(byte[] bArr, long j9, byte b9) {
        zzf.zzd(bArr, zza + j9, b9);
    }

    public static void zzo(Object obj, long j9, double d9) {
        zzf.zze(obj, j9, d9);
    }

    public static void zzp(Object obj, long j9, float f9) {
        zzf.zzf(obj, j9, f9);
    }

    public static void zzq(Object obj, long j9, int i9) {
        zzf.zza.putInt(obj, j9, i9);
    }

    public static void zzr(Object obj, long j9, long j10) {
        zzf.zza.putLong(obj, j9, j10);
    }

    public static void zzs(Object obj, long j9, Object obj2) {
        zzf.zza.putObject(obj, j9, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j9) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j9) >>> ((int) (((~j9) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j9) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j9) >>> ((int) ((j9 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzv(Class cls) {
        int i9 = zzel.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzw(Object obj, long j9) {
        return zzf.zzg(obj, j9);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
