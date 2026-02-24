package B3;

import O2.H0;
import O2.Q1;
import android.net.Uri;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends Q1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f484t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final H0 f485u = new H0.c().g("SinglePeriodTimeline").m(Uri.EMPTY).a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f493n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f494o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f495p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f496q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final H0 f497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final H0.g f498s;

    public b0(long j9, long j10, long j11, long j12, long j13, long j14, long j15, boolean z9, boolean z10, boolean z11, Object obj, H0 h02, H0.g gVar) {
        this.f486g = j9;
        this.f487h = j10;
        this.f488i = j11;
        this.f489j = j12;
        this.f490k = j13;
        this.f491l = j14;
        this.f492m = j15;
        this.f493n = z9;
        this.f494o = z10;
        this.f495p = z11;
        this.f496q = obj;
        this.f497r = (H0) AbstractC1684a.e(h02);
        this.f498s = gVar;
    }

    public b0(long j9, long j10, long j11, long j12, boolean z9, boolean z10, boolean z11, Object obj, H0 h02) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j9, j10, j11, j12, z9, z10, false, obj, h02, z11 ? h02.f5530e : null);
    }

    public b0(long j9, boolean z9, boolean z10, boolean z11, Object obj, H0 h02) {
        this(j9, j9, 0L, 0L, z9, z10, z11, obj, h02);
    }

    @Override // O2.Q1
    public int f(Object obj) {
        return f484t.equals(obj) ? 0 : -1;
    }

    @Override // O2.Q1
    public Q1.b l(int i9, Q1.b bVar, boolean z9) {
        AbstractC1684a.c(i9, 0, 1);
        return bVar.y(null, z9 ? f484t : null, 0, this.f489j, -this.f491l);
    }

    @Override // O2.Q1
    public int n() {
        return 1;
    }

    @Override // O2.Q1
    public Object r(int i9) {
        AbstractC1684a.c(i9, 0, 1);
        return f484t;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // O2.Q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public O2.Q1.d t(int r25, O2.Q1.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            d4.AbstractC1684a.c(r3, r1, r2)
            long r1 = r0.f492m
            boolean r14 = r0.f494o
            if (r14 == 0) goto L2e
            boolean r3 = r0.f495p
            if (r3 != 0) goto L2e
            r3 = 0
            int r5 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r5 == 0) goto L2e
            long r3 = r0.f490k
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = O2.Q1.d.f5736s
            O2.H0 r5 = r0.f497r
            java.lang.Object r6 = r0.f496q
            long r7 = r0.f486g
            long r9 = r0.f487h
            long r11 = r0.f488i
            boolean r13 = r0.f493n
            O2.H0$g r15 = r0.f498s
            long r1 = r0.f490k
            r18 = r1
            r21 = 0
            long r1 = r0.f491l
            r22 = r1
            r20 = 0
            r3 = r26
            O2.Q1$d r1 = r3.j(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.b0.t(int, O2.Q1$d, long):O2.Q1$d");
    }

    @Override // O2.Q1
    public int u() {
        return 1;
    }
}
