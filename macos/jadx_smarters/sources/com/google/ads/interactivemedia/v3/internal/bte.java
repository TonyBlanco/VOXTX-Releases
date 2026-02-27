package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
abstract class bte {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Unsafe f22252a;

    public bte(Unsafe unsafe) {
        this.f22252a = unsafe;
    }

    public abstract byte a(long j9);

    public abstract double b(Object obj, long j9);

    public abstract float c(Object obj, long j9);

    public abstract void d(long j9, byte[] bArr, long j10, long j11);

    public abstract void e(Object obj, long j9, boolean z9);

    public abstract void f(Object obj, long j9, byte b9);

    public abstract void g(Object obj, long j9, double d9);

    public abstract void h(Object obj, long j9, float f9);

    public abstract boolean i(Object obj, long j9);

    public final int j(Class cls) {
        return this.f22252a.arrayBaseOffset(cls);
    }

    public final int k(Class cls) {
        return this.f22252a.arrayIndexScale(cls);
    }

    public final int l(Object obj, long j9) {
        return this.f22252a.getInt(obj, j9);
    }

    public final long m(Object obj, long j9) {
        return this.f22252a.getLong(obj, j9);
    }

    public final long n(Field field) {
        return this.f22252a.objectFieldOffset(field);
    }

    public final Object o(Object obj, long j9) {
        return this.f22252a.getObject(obj, j9);
    }

    public final void p(Object obj, long j9, int i9) {
        this.f22252a.putInt(obj, j9, i9);
    }

    public final void q(Object obj, long j9, long j10) {
        this.f22252a.putLong(obj, j9, j10);
    }

    public final void r(Object obj, long j9, Object obj2) {
        this.f22252a.putObject(obj, j9, obj2);
    }

    public final boolean s() {
        try {
            Class<?> cls = this.f22252a.getClass();
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
            Logger.getLogger(btf.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            return false;
        }
    }

    public final boolean t() {
        try {
            Class<?> cls = this.f22252a.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            return btf.F() != null;
        } catch (Throwable th) {
            Logger.getLogger(btf.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            return false;
        }
    }
}
