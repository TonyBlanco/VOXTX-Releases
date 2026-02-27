package j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1929m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1929m f42379c = new C1929m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f42380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f42381b;

    private C1929m() {
        this.f42380a = false;
        this.f42381b = 0L;
    }

    private C1929m(long j9) {
        this.f42380a = true;
        this.f42381b = j9;
    }

    public static C1929m a() {
        return f42379c;
    }

    public static C1929m d(long j9) {
        return new C1929m(j9);
    }

    public final long b() {
        if (this.f42380a) {
            return this.f42381b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f42380a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1929m)) {
            return false;
        }
        C1929m c1929m = (C1929m) obj;
        boolean z9 = this.f42380a;
        if (z9 && c1929m.f42380a) {
            if (this.f42381b == c1929m.f42381b) {
                return true;
            }
        } else if (z9 == c1929m.f42380a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f42380a) {
            return 0;
        }
        long j9 = this.f42381b;
        return (int) (j9 ^ (j9 >>> 32));
    }

    public final String toString() {
        if (!this.f42380a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.f42381b + "]";
    }
}
