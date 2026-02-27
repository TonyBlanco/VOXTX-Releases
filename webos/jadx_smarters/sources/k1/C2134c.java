package k1;

/* JADX INFO: renamed from: k1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2134c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C2134c f43530e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC2135d f43531a = EnumC2135d.UNKNOWN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43532b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43533c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43534d = 0;

    public static C2134c a() {
        if (f43530e == null) {
            synchronized (C2134c.class) {
                try {
                    if (f43530e == null) {
                        f43530e = new C2134c();
                    }
                } finally {
                }
            }
        }
        return f43530e;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0066 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #0 {all -> 0x003f, blocks: (B:10:0x001f, B:12:0x0035, B:19:0x0041, B:21:0x0045, B:22:0x0047, B:35:0x0066, B:25:0x004e, B:28:0x0055, B:31:0x005c, B:33:0x0061), top: B:42:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void b(long r4, long r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L6f
            r0 = 20000(0x4e20, double:9.8813E-320)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L6f
            double r4 = (double) r4
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 * r0
            double r6 = (double) r6
            double r4 = r4 / r6
            r6 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r4 = r4 * r6
            r6 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L1f
            goto L6f
        L1f:
            int r6 = r3.f43532b     // Catch: java.lang.Throwable -> L3f
            int r7 = r3.f43533c     // Catch: java.lang.Throwable -> L3f
            int r6 = r6 * r7
            double r0 = (double) r6     // Catch: java.lang.Throwable -> L3f
            double r0 = r0 + r4
            int r4 = r7 + 1
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L3f
            double r0 = r0 / r4
            int r4 = (int) r0     // Catch: java.lang.Throwable -> L3f
            r3.f43532b = r4     // Catch: java.lang.Throwable -> L3f
            int r7 = r7 + 1
            r3.f43533c = r7     // Catch: java.lang.Throwable -> L3f
            r5 = 5
            if (r7 == r5) goto L41
            k1.d r6 = r3.f43531a     // Catch: java.lang.Throwable -> L3f
            k1.d r0 = k1.EnumC2135d.UNKNOWN     // Catch: java.lang.Throwable -> L3f
            if (r6 != r0) goto L6b
            r6 = 2
            if (r7 != r6) goto L6b
            goto L41
        L3f:
            r4 = move-exception
            goto L6d
        L41:
            r3.f43534d = r4     // Catch: java.lang.Throwable -> L3f
            if (r4 > 0) goto L4a
            k1.d r4 = k1.EnumC2135d.UNKNOWN     // Catch: java.lang.Throwable -> L3f
        L47:
            r3.f43531a = r4     // Catch: java.lang.Throwable -> L3f
            goto L64
        L4a:
            r6 = 150(0x96, float:2.1E-43)
            if (r4 >= r6) goto L51
            k1.d r4 = k1.EnumC2135d.POOR     // Catch: java.lang.Throwable -> L3f
            goto L47
        L51:
            r6 = 550(0x226, float:7.71E-43)
            if (r4 >= r6) goto L58
            k1.d r4 = k1.EnumC2135d.MODERATE     // Catch: java.lang.Throwable -> L3f
            goto L47
        L58:
            r6 = 2000(0x7d0, float:2.803E-42)
            if (r4 >= r6) goto L5f
            k1.d r4 = k1.EnumC2135d.GOOD     // Catch: java.lang.Throwable -> L3f
            goto L47
        L5f:
            if (r4 <= r6) goto L64
            k1.d r4 = k1.EnumC2135d.EXCELLENT     // Catch: java.lang.Throwable -> L3f
            goto L47
        L64:
            if (r7 != r5) goto L6b
            r4 = 0
            r3.f43532b = r4     // Catch: java.lang.Throwable -> L3f
            r3.f43533c = r4     // Catch: java.lang.Throwable -> L3f
        L6b:
            monitor-exit(r3)
            return
        L6d:
            monitor-exit(r3)
            throw r4
        L6f:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C2134c.b(long, long):void");
    }
}
