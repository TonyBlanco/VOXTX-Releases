package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzamk {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzc zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final int zzw;

    public static final class zza extends zzc {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final double zza(Object obj, long j9) {
            return Double.longBitsToDouble(zze(obj, j9));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final void zza(Object obj, long j9, byte b9) {
            if (zzamk.zza) {
                zzamk.zzc(obj, j9, b9);
            } else {
                zzamk.zzd(obj, j9, b9);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final void zza(Object obj, long j9, double d9) {
            zza(obj, j9, Double.doubleToLongBits(d9));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final void zza(Object obj, long j9, float f9) {
            zza(obj, j9, Float.floatToIntBits(f9));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final void zza(Object obj, long j9, boolean z9) {
            if (zzamk.zza) {
                zzamk.zza(obj, j9, z9);
            } else {
                zzamk.zzb(obj, j9, z9);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final float zzb(Object obj, long j9) {
            return Float.intBitsToFloat(zzd(obj, j9));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final boolean zzc(Object obj, long j9) {
            return zzamk.zza ? zzamk.zzf(obj, j9) : zzamk.zzg(obj, j9);
        }
    }

    public static final class zzb extends zzc {
        public zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final double zza(Object obj, long j9) {
            return Double.longBitsToDouble(zze(obj, j9));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final void zza(Object obj, long j9, byte b9) {
            if (zzamk.zza) {
                zzamk.zzc(obj, j9, b9);
            } else {
                zzamk.zzd(obj, j9, b9);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final void zza(Object obj, long j9, double d9) {
            zza(obj, j9, Double.doubleToLongBits(d9));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final void zza(Object obj, long j9, float f9) {
            zza(obj, j9, Float.floatToIntBits(f9));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final void zza(Object obj, long j9, boolean z9) {
            if (zzamk.zza) {
                zzamk.zza(obj, j9, z9);
            } else {
                zzamk.zzb(obj, j9, z9);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final float zzb(Object obj, long j9) {
            return Float.intBitsToFloat(zzd(obj, j9));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamk.zzc
        public final boolean zzc(Object obj, long j9) {
            return zzamk.zza ? zzamk.zzf(obj, j9) : zzamk.zzg(obj, j9);
        }
    }

    public static abstract class zzc {
        Unsafe zza;

        public zzc(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j9);

        public abstract void zza(Object obj, long j9, byte b9);

        public abstract void zza(Object obj, long j9, double d9);

        public abstract void zza(Object obj, long j9, float f9);

        public final void zza(Object obj, long j9, int i9) {
            this.zza.putInt(obj, j9, i9);
        }

        public final void zza(Object obj, long j9, long j10) {
            this.zza.putLong(obj, j9, j10);
        }

        public abstract void zza(Object obj, long j9, boolean z9);

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                zzamk.zza(th);
                return false;
            }
        }

        public abstract float zzb(Object obj, long j9);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzamk.zze() != null;
            } catch (Throwable th) {
                zzamk.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j9);

        public final int zzd(Object obj, long j9) {
            return this.zza.getInt(obj, j9);
        }

        public final long zze(Object obj, long j9) {
            return this.zza.getLong(obj, j9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    static {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzamk.<clinit>():void");
    }

    private zzamk() {
    }

    public static double zza(Object obj, long j9) {
        return zzf.zza(obj, j9);
    }

    public static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e9) {
            throw new IllegalStateException(e9);
        }
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zza(Object obj, long j9, double d9) {
        zzf.zza(obj, j9, d9);
    }

    public static void zza(Object obj, long j9, float f9) {
        zzf.zza(obj, j9, f9);
    }

    public static void zza(Object obj, long j9, int i9) {
        zzf.zza(obj, j9, i9);
    }

    public static void zza(Object obj, long j9, long j10) {
        zzf.zza(obj, j9, j10);
    }

    public static void zza(Object obj, long j9, Object obj2) {
        zzf.zza.putObject(obj, j9, obj2);
    }

    public static /* synthetic */ void zza(Object obj, long j9, boolean z9) {
        zzc(obj, j9, z9 ? (byte) 1 : (byte) 0);
    }

    public static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzamk.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    public static void zza(byte[] bArr, long j9, byte b9) {
        zzf.zza((Object) bArr, zzi + j9, b9);
    }

    public static float zzb(Object obj, long j9) {
        return zzf.zzb(obj, j9);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzamj());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zzb(Object obj, long j9, boolean z9) {
        zzd(obj, j9, z9 ? (byte) 1 : (byte) 0);
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    public static int zzc(Object obj, long j9) {
        return zzf.zzd(obj, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j9, byte b9) {
        long j10 = (-4) & j9;
        int iZzc = zzc(obj, j10);
        int i9 = ((~((int) j9)) & 3) << 3;
        zza(obj, j10, ((255 & b9) << i9) | (iZzc & (~(255 << i9))));
    }

    public static void zzc(Object obj, long j9, boolean z9) {
        zzf.zza(obj, j9, z9);
    }

    public static boolean zzc() {
        return zzh;
    }

    public static long zzd(Object obj, long j9) {
        return zzf.zze(obj, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j9, byte b9) {
        long j10 = (-4) & j9;
        int i9 = (((int) j9) & 3) << 3;
        zza(obj, j10, ((255 & b9) << i9) | (zzc(obj, j10) & (~(255 << i9))));
    }

    public static boolean zzd() {
        return zzg;
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    public static Object zze(Object obj, long j9) {
        return zzf.zza.getObject(obj, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field zze() {
        Field fieldZza = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (fieldZza != null) {
            return fieldZza;
        }
        Field fieldZza2 = zza((Class<?>) Buffer.class, "address");
        if (fieldZza2 == null || fieldZza2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZza2;
    }

    public static /* synthetic */ boolean zzf(Object obj, long j9) {
        return ((byte) (zzc(obj, (-4) & j9) >>> ((int) (((~j9) & 3) << 3)))) != 0;
    }

    public static /* synthetic */ boolean zzg(Object obj, long j9) {
        return ((byte) (zzc(obj, (-4) & j9) >>> ((int) ((j9 & 3) << 3)))) != 0;
    }

    public static boolean zzh(Object obj, long j9) {
        return zzf.zzc(obj, j9);
    }
}
