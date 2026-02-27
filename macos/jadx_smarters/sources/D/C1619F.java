package d;

/* JADX INFO: renamed from: d.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1619F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C1619F f39258d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39261c;

    public static C1619F b() {
        if (f39258d == null) {
            f39258d = new C1619F();
        }
        return f39258d;
    }

    public void a(long j9, double d9, double d10) {
        double d11 = (0.01720197f * ((j9 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d11) * 0.03341960161924362d) + d11 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r3 - 9.0E-4f)) - r7) + 9.0E-4f)) + ((-d10) / 360.0d) + (Math.sin(d11) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d12 = 0.01745329238474369d * d9;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d12) * Math.sin(dAsin))) / (Math.cos(d12) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f39261c = 1;
        } else {
            if (dSin2 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
                this.f39259a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
                long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
                this.f39260b = jRound;
                if (jRound >= j9 || this.f39259a <= j9) {
                    this.f39261c = 1;
                    return;
                } else {
                    this.f39261c = 0;
                    return;
                }
            }
            this.f39261c = 0;
        }
        this.f39259a = -1L;
        this.f39260b = -1L;
    }
}
