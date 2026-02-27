package j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1928l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1928l f42376c = new C1928l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f42377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42378b;

    private C1928l() {
        this.f42377a = false;
        this.f42378b = 0;
    }

    private C1928l(int i9) {
        this.f42377a = true;
        this.f42378b = i9;
    }

    public static C1928l a() {
        return f42376c;
    }

    public static C1928l d(int i9) {
        return new C1928l(i9);
    }

    public final int b() {
        if (this.f42377a) {
            return this.f42378b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f42377a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1928l)) {
            return false;
        }
        C1928l c1928l = (C1928l) obj;
        boolean z9 = this.f42377a;
        if (z9 && c1928l.f42377a) {
            if (this.f42378b == c1928l.f42378b) {
                return true;
            }
        } else if (z9 == c1928l.f42377a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f42377a) {
            return this.f42378b;
        }
        return 0;
    }

    public final String toString() {
        if (!this.f42377a) {
            return "OptionalInt.empty";
        }
        return "OptionalInt[" + this.f42378b + "]";
    }
}
