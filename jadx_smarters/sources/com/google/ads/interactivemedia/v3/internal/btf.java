package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class btf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f22253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final boolean f22254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f22255c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Unsafe f22256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Class f22257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f22258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f22259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final bte f22260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f22261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f22262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f22263k;

    static {
        Unsafe unsafeJ = j();
        f22256d = unsafeJ;
        f22257e = Memory.class;
        boolean z9 = z(Long.TYPE);
        f22258f = z9;
        boolean z10 = z(Integer.TYPE);
        f22259g = z10;
        bte btcVar = null;
        if (unsafeJ != null) {
            if (z9) {
                btcVar = new btd(unsafeJ);
            } else if (z10) {
                btcVar = new btc(unsafeJ);
            }
        }
        f22260h = btcVar;
        f22261i = btcVar == null ? false : btcVar.t();
        f22262j = btcVar == null ? false : btcVar.s();
        f22253a = E(byte[].class);
        E(boolean[].class);
        J(boolean[].class);
        E(int[].class);
        J(int[].class);
        E(long[].class);
        J(long[].class);
        E(float[].class);
        J(float[].class);
        E(double[].class);
        J(double[].class);
        E(Object[].class);
        J(Object[].class);
        Field fieldF = F();
        long jN = -1;
        if (fieldF != null && btcVar != null) {
            jN = btcVar.n(fieldF);
        }
        f22263k = jN;
        f22254b = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private btf() {
    }

    public static boolean A(Object obj, long j9) {
        return f22260h.i(obj, j9);
    }

    public static boolean B() {
        return f22262j;
    }

    private static byte C(Object obj, long j9) {
        return (byte) ((d(obj, (-4) & j9) >>> ((int) (((~j9) & 3) << 3))) & 255);
    }

    private static byte D(Object obj, long j9) {
        return (byte) ((d(obj, (-4) & j9) >>> ((int) ((j9 & 3) << 3))) & 255);
    }

    private static int E(Class cls) {
        if (f22262j) {
            return f22260h.j(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field F() {
        Field fieldG = G(Buffer.class, "effectiveDirectAddress");
        if (fieldG != null) {
            return fieldG;
        }
        Field fieldG2 = G(Buffer.class, "address");
        if (fieldG2 == null || fieldG2.getType() != Long.TYPE) {
            return null;
        }
        return fieldG2;
    }

    private static Field G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void H(Object obj, long j9, byte b9) {
        long j10 = (-4) & j9;
        int i9 = ((~((int) j9)) & 3) << 3;
        u(obj, j10, ((b9 & 255) << i9) | (d(obj, j10) & (~(255 << i9))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j9, byte b9) {
        long j10 = (-4) & j9;
        int i9 = (((int) j9) & 3) << 3;
        u(obj, j10, ((b9 & 255) << i9) | (d(obj, j10) & (~(255 << i9))));
    }

    private static void J(Class cls) {
        if (f22262j) {
            f22260h.k(cls);
        }
    }

    public static byte a(long j9) {
        return f22260h.a(j9);
    }

    public static double b(Object obj, long j9) {
        return f22260h.b(obj, j9);
    }

    public static float c(Object obj, long j9) {
        return f22260h.c(obj, j9);
    }

    public static int d(Object obj, long j9) {
        return f22260h.l(obj, j9);
    }

    public static long e(ByteBuffer byteBuffer) {
        return f22260h.m(byteBuffer, f22263k);
    }

    public static long f(Object obj, long j9) {
        return f22260h.m(obj, j9);
    }

    public static Object g(Class cls) {
        try {
            return f22256d.allocateInstance(cls);
        } catch (InstantiationException e9) {
            throw new IllegalStateException(e9);
        }
    }

    public static Object h(Object obj, long j9) {
        return f22260h.o(obj, j9);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new btb());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void p(long j9, byte[] bArr, long j10, long j11) {
        f22260h.d(j9, bArr, j10, j11);
    }

    public static void q(Object obj, long j9, boolean z9) {
        f22260h.e(obj, j9, z9);
    }

    public static void r(byte[] bArr, long j9, byte b9) {
        f22260h.f(bArr, f22253a + j9, b9);
    }

    public static void s(Object obj, long j9, double d9) {
        f22260h.g(obj, j9, d9);
    }

    public static void t(Object obj, long j9, float f9) {
        f22260h.h(obj, j9, f9);
    }

    public static void u(Object obj, long j9, int i9) {
        f22260h.p(obj, j9, i9);
    }

    public static void v(Object obj, long j9, long j10) {
        f22260h.q(obj, j9, j10);
    }

    public static void w(Object obj, long j9, Object obj2) {
        f22260h.r(obj, j9, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj, long j9) {
        return C(obj, j9) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj, long j9) {
        return D(obj, j9) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean z(Class cls) {
        try {
            Class cls2 = f22257e;
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
}
