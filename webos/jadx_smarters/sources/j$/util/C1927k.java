package j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1927k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1927k f42373c = new C1927k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f42374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f42375b;

    private C1927k() {
        this.f42374a = false;
        this.f42375b = Double.NaN;
    }

    private C1927k(double d9) {
        this.f42374a = true;
        this.f42375b = d9;
    }

    public static C1927k a() {
        return f42373c;
    }

    public static C1927k d(double d9) {
        return new C1927k(d9);
    }

    public final double b() {
        if (this.f42374a) {
            return this.f42375b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f42374a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1927k)) {
            return false;
        }
        C1927k c1927k = (C1927k) obj;
        boolean z9 = this.f42374a;
        if (z9 && c1927k.f42374a) {
            if (Double.compare(this.f42375b, c1927k.f42375b) == 0) {
                return true;
            }
        } else if (z9 == c1927k.f42374a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f42374a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f42375b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.f42374a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.f42375b + "]";
    }
}
