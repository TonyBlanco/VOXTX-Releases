package O2;

import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class H1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H1 f5667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H1 f5668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H1 f5669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final H1 f5670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final H1 f5671g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5673b;

    static {
        H1 h12 = new H1(0L, 0L);
        f5667c = h12;
        f5668d = new H1(Long.MAX_VALUE, Long.MAX_VALUE);
        f5669e = new H1(Long.MAX_VALUE, 0L);
        f5670f = new H1(0L, Long.MAX_VALUE);
        f5671g = h12;
    }

    public H1(long j9, long j10) {
        AbstractC1684a.a(j9 >= 0);
        AbstractC1684a.a(j10 >= 0);
        this.f5672a = j9;
        this.f5673b = j10;
    }

    public long a(long j9, long j10, long j11) {
        long j12 = this.f5672a;
        if (j12 == 0 && this.f5673b == 0) {
            return j9;
        }
        long jM1 = d4.k0.m1(j9, j12, Long.MIN_VALUE);
        long jB = d4.k0.b(j9, this.f5673b, Long.MAX_VALUE);
        boolean z9 = false;
        boolean z10 = jM1 <= j10 && j10 <= jB;
        if (jM1 <= j11 && j11 <= jB) {
            z9 = true;
        }
        return (z10 && z9) ? Math.abs(j10 - j9) <= Math.abs(j11 - j9) ? j10 : j11 : z10 ? j10 : z9 ? j11 : jM1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H1.class != obj.getClass()) {
            return false;
        }
        H1 h12 = (H1) obj;
        return this.f5672a == h12.f5672a && this.f5673b == h12.f5673b;
    }

    public int hashCode() {
        return (((int) this.f5672a) * 31) + ((int) this.f5673b);
    }
}
