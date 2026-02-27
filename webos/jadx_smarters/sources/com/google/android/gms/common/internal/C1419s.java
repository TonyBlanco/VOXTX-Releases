package com.google.android.gms.common.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1419s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C1419s f26875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1420t f26876c = new C1420t(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1420t f26877a;

    public static synchronized C1419s b() {
        try {
            if (f26875b == null) {
                f26875b = new C1419s();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f26875b;
    }

    public C1420t a() {
        return this.f26877a;
    }

    public final synchronized void c(C1420t c1420t) {
        if (c1420t == null) {
            this.f26877a = f26876c;
            return;
        }
        C1420t c1420t2 = this.f26877a;
        if (c1420t2 == null || c1420t2.L() < c1420t.L()) {
            this.f26877a = c1420t;
        }
    }
}
