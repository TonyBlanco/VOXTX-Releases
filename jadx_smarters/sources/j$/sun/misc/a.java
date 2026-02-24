package j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f41954b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Unsafe f41955a;

    static {
        Field fieldI = i();
        fieldI.setAccessible(true);
        try {
            f41954b = new a((Unsafe) fieldI.get(null));
        } catch (IllegalAccessException e9) {
            throw new AssertionError("Couldn't get the Unsafe", e9);
        }
    }

    a(Unsafe unsafe) {
        this.f41955a = unsafe;
    }

    public static a h() {
        return f41954b;
    }

    private static Field i() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e9) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e9);
        }
    }

    public final int a(Class cls) {
        return this.f41955a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f41955a.arrayIndexScale(cls);
    }

    public final boolean c(Object obj, long j9, int i9, int i10) {
        return this.f41955a.compareAndSwapInt(obj, j9, i9, i10);
    }

    public final boolean d(Object obj, long j9, long j10, long j11) {
        return this.f41955a.compareAndSwapLong(obj, j9, j10, j11);
    }

    public final boolean e(Object obj, long j9, Object obj2) {
        return j$.com.android.tools.r8.a.l(this.f41955a, obj, j9, obj2);
    }

    public final int f(Object obj, long j9) {
        int intVolatile;
        do {
            intVolatile = this.f41955a.getIntVolatile(obj, j9);
        } while (!this.f41955a.compareAndSwapInt(obj, j9, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    public final Object g(Object obj, long j9) {
        return this.f41955a.getObjectVolatile(obj, j9);
    }

    public final long j(Class cls, String str) {
        try {
            return k(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e9) {
            throw new AssertionError("Cannot find field:", e9);
        }
    }

    public final long k(Field field) {
        return this.f41955a.objectFieldOffset(field);
    }

    public final void l(Object obj, long j9, Object obj2) {
        this.f41955a.putObjectVolatile(obj, j9, obj2);
    }
}
