package B3;

/* JADX INFO: renamed from: B3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0500h implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z[] f586a;

    public C0500h(Z[] zArr) {
        this.f586a = zArr;
    }

    @Override // B3.Z
    public boolean b() {
        for (Z z9 : this.f586a) {
            if (z9.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // B3.Z
    public final long c() {
        long jMin = Long.MAX_VALUE;
        for (Z z9 : this.f586a) {
            long jC = z9.c();
            if (jC != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // B3.Z
    public boolean f(long j9) {
        boolean zF;
        boolean z9 = false;
        do {
            long jC = c();
            if (jC == Long.MIN_VALUE) {
                break;
            }
            zF = false;
            for (Z z10 : this.f586a) {
                long jC2 = z10.c();
                boolean z11 = jC2 != Long.MIN_VALUE && jC2 <= j9;
                if (jC2 == jC || z11) {
                    zF |= z10.f(j9);
                }
            }
            z9 |= zF;
        } while (zF);
        return z9;
    }

    @Override // B3.Z
    public final long g() {
        long jMin = Long.MAX_VALUE;
        for (Z z9 : this.f586a) {
            long jG = z9.g();
            if (jG != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jG);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // B3.Z
    public final void h(long j9) {
        for (Z z9 : this.f586a) {
            z9.h(j9);
        }
    }
}
