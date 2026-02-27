package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f14723a = Logger.getLogger(p0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f14724b = B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f14725c = AbstractC1119d.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f14726d = m(Long.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f14727e = m(Integer.TYPE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f14728f = z();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f14729g = Q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f14730h = P();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f14731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f14732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f14733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f14734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f14735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f14736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f14737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f14738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f14739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f14740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f14741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f14742t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f14743u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f14744v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f14745w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final boolean f14746x;

    public static class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j9) {
            return p0.f14746x ? p0.q(obj, j9) : p0.r(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j9) {
            return p0.f14746x ? p0.t(obj, j9) : p0.u(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j9) {
            return Double.longBitsToDouble(h(obj, j9));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j9) {
            return Float.intBitsToFloat(g(obj, j9));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j9, boolean z9) {
            if (p0.f14746x) {
                p0.F(obj, j9, z9);
            } else {
                p0.G(obj, j9, z9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j9, byte b9) {
            if (p0.f14746x) {
                p0.I(obj, j9, b9);
            } else {
                p0.J(obj, j9, b9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j9, double d9) {
            p(obj, j9, Double.doubleToLongBits(d9));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j9, float f9) {
            o(obj, j9, Float.floatToIntBits(f9));
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j9) {
            return p0.f14746x ? p0.q(obj, j9) : p0.r(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j9) {
            return p0.f14746x ? p0.t(obj, j9) : p0.u(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j9) {
            return Double.longBitsToDouble(h(obj, j9));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j9) {
            return Float.intBitsToFloat(g(obj, j9));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j9, boolean z9) {
            if (p0.f14746x) {
                p0.F(obj, j9, z9);
            } else {
                p0.G(obj, j9, z9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j9, byte b9) {
            if (p0.f14746x) {
                p0.I(obj, j9, b9);
            } else {
                p0.J(obj, j9, b9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j9, double d9) {
            p(obj, j9, Double.doubleToLongBits(d9));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j9, float f9) {
            o(obj, j9, Float.floatToIntBits(f9));
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j9) {
            return this.f14747a.getBoolean(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j9) {
            return this.f14747a.getByte(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j9) {
            return this.f14747a.getDouble(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j9) {
            return this.f14747a.getFloat(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j9, boolean z9) {
            this.f14747a.putBoolean(obj, j9, z9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j9, byte b9) {
            this.f14747a.putByte(obj, j9, b9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j9, double d9) {
            this.f14747a.putDouble(obj, j9, d9);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j9, float f9) {
            this.f14747a.putFloat(obj, j9, f9);
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Unsafe f14747a;

        public e(Unsafe unsafe) {
            this.f14747a = unsafe;
        }

        public final int a(Class cls) {
            return this.f14747a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f14747a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j9);

        public abstract byte d(Object obj, long j9);

        public abstract double e(Object obj, long j9);

        public abstract float f(Object obj, long j9);

        public final int g(Object obj, long j9) {
            return this.f14747a.getInt(obj, j9);
        }

        public final long h(Object obj, long j9) {
            return this.f14747a.getLong(obj, j9);
        }

        public final Object i(Object obj, long j9) {
            return this.f14747a.getObject(obj, j9);
        }

        public final long j(Field field) {
            return this.f14747a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j9, boolean z9);

        public abstract void l(Object obj, long j9, byte b9);

        public abstract void m(Object obj, long j9, double d9);

        public abstract void n(Object obj, long j9, float f9);

        public final void o(Object obj, long j9, int i9) {
            this.f14747a.putInt(obj, j9, i9);
        }

        public final void p(Object obj, long j9, long j10) {
            this.f14747a.putLong(obj, j9, j10);
        }

        public final void q(Object obj, long j9, Object obj2) {
            this.f14747a.putObject(obj, j9, obj2);
        }
    }

    static {
        long j9 = j(byte[].class);
        f14731i = j9;
        f14732j = j(boolean[].class);
        f14733k = k(boolean[].class);
        f14734l = j(int[].class);
        f14735m = k(int[].class);
        f14736n = j(long[].class);
        f14737o = k(long[].class);
        f14738p = j(float[].class);
        f14739q = k(float[].class);
        f14740r = j(double[].class);
        f14741s = k(double[].class);
        f14742t = j(Object[].class);
        f14743u = k(Object[].class);
        f14744v = o(l());
        f14745w = (int) (j9 & 7);
        f14746x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object A(Object obj, long j9) {
        return f14728f.i(obj, j9);
    }

    public static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean C() {
        return f14730h;
    }

    public static boolean D() {
        return f14729g;
    }

    public static void E(Object obj, long j9, boolean z9) {
        f14728f.k(obj, j9, z9);
    }

    public static void F(Object obj, long j9, boolean z9) {
        I(obj, j9, z9 ? (byte) 1 : (byte) 0);
    }

    public static void G(Object obj, long j9, boolean z9) {
        J(obj, j9, z9 ? (byte) 1 : (byte) 0);
    }

    public static void H(byte[] bArr, long j9, byte b9) {
        f14728f.l(bArr, f14731i + j9, b9);
    }

    public static void I(Object obj, long j9, byte b9) {
        long j10 = (-4) & j9;
        int iX = x(obj, j10);
        int i9 = ((~((int) j9)) & 3) << 3;
        M(obj, j10, ((255 & b9) << i9) | (iX & (~(255 << i9))));
    }

    public static void J(Object obj, long j9, byte b9) {
        long j10 = (-4) & j9;
        int i9 = (((int) j9) & 3) << 3;
        M(obj, j10, ((255 & b9) << i9) | (x(obj, j10) & (~(255 << i9))));
    }

    public static void K(Object obj, long j9, double d9) {
        f14728f.m(obj, j9, d9);
    }

    public static void L(Object obj, long j9, float f9) {
        f14728f.n(obj, j9, f9);
    }

    public static void M(Object obj, long j9, int i9) {
        f14728f.o(obj, j9, i9);
    }

    public static void N(Object obj, long j9, long j10) {
        f14728f.p(obj, j9, j10);
    }

    public static void O(Object obj, long j9, Object obj2) {
        f14728f.q(obj, j9, obj2);
    }

    public static boolean P() {
        Unsafe unsafe = f14724b;
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
            if (AbstractC1119d.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            f14723a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    public static boolean Q() {
        Unsafe unsafe = f14724b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (AbstractC1119d.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            f14723a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    public static Object i(Class cls) {
        try {
            return f14724b.allocateInstance(cls);
        } catch (InstantiationException e9) {
            throw new IllegalStateException(e9);
        }
    }

    public static int j(Class cls) {
        if (f14730h) {
            return f14728f.a(cls);
        }
        return -1;
    }

    public static int k(Class cls) {
        if (f14730h) {
            return f14728f.b(cls);
        }
        return -1;
    }

    public static Field l() {
        Field fieldN;
        if (AbstractC1119d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean m(Class cls) {
        if (!AbstractC1119d.c()) {
            return false;
        }
        try {
            Class cls2 = f14725c;
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

    public static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f14728f) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    public static boolean p(Object obj, long j9) {
        return f14728f.c(obj, j9);
    }

    public static boolean q(Object obj, long j9) {
        return t(obj, j9) != 0;
    }

    public static boolean r(Object obj, long j9) {
        return u(obj, j9) != 0;
    }

    public static byte s(byte[] bArr, long j9) {
        return f14728f.d(bArr, f14731i + j9);
    }

    public static byte t(Object obj, long j9) {
        return (byte) ((x(obj, (-4) & j9) >>> ((int) (((~j9) & 3) << 3))) & 255);
    }

    public static byte u(Object obj, long j9) {
        return (byte) ((x(obj, (-4) & j9) >>> ((int) ((j9 & 3) << 3))) & 255);
    }

    public static double v(Object obj, long j9) {
        return f14728f.e(obj, j9);
    }

    public static float w(Object obj, long j9) {
        return f14728f.f(obj, j9);
    }

    public static int x(Object obj, long j9) {
        return f14728f.g(obj, j9);
    }

    public static long y(Object obj, long j9) {
        return f14728f.h(obj, j9);
    }

    public static e z() {
        Unsafe unsafe = f14724b;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC1119d.c()) {
            return new d(unsafe);
        }
        if (f14726d) {
            return new c(unsafe);
        }
        if (f14727e) {
            return new b(unsafe);
        }
        return null;
    }
}
