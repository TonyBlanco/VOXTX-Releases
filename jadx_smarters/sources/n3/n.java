package n3;

import d3.InterfaceC1674k;
import d4.M;
import java.util.Arrays;
import n3.I;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f45068q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d3.w f45070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K f45071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f45072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f45073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f45074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f45075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f45079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f45080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f45081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f45082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45084p;

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte[] f45085e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f45086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f45089d;

        public a(int i9) {
            this.f45089d = new byte[i9];
        }

        public void a(byte[] bArr, int i9, int i10) {
            if (this.f45086a) {
                int i11 = i10 - i9;
                byte[] bArr2 = this.f45089d;
                int length = bArr2.length;
                int i12 = this.f45087b;
                if (length < i12 + i11) {
                    this.f45089d = Arrays.copyOf(bArr2, (i12 + i11) * 2);
                }
                System.arraycopy(bArr, i9, this.f45089d, this.f45087b, i11);
                this.f45087b += i11;
            }
        }

        public boolean b(int i9, int i10) {
            if (this.f45086a) {
                int i11 = this.f45087b - i10;
                this.f45087b = i11;
                if (this.f45088c != 0 || i9 != 181) {
                    this.f45086a = false;
                    return true;
                }
                this.f45088c = i11;
            } else if (i9 == 179) {
                this.f45086a = true;
            }
            byte[] bArr = f45085e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f45086a = false;
            this.f45087b = 0;
            this.f45088c = 0;
        }
    }

    public n() {
        this(null);
    }

    public n(K k9) {
        M m9;
        this.f45071c = k9;
        this.f45074f = new boolean[4];
        this.f45075g = new a(128);
        if (k9 != null) {
            this.f45073e = new u(178, 128);
            m9 = new M();
        } else {
            m9 = null;
            this.f45073e = null;
        }
        this.f45072d = m9;
        this.f45080l = -9223372036854775807L;
        this.f45082n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(n3.n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f45089d
            int r1 = r8.f45087b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            O2.z0$b r6 = new O2.z0$b
            r6.<init>()
            O2.z0$b r9 = r6.U(r9)
            java.lang.String r6 = "video/mpeg2"
            O2.z0$b r9 = r9.g0(r6)
            O2.z0$b r9 = r9.n0(r2)
            O2.z0$b r9 = r9.S(r4)
            O2.z0$b r9 = r9.c0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            O2.z0$b r9 = r9.V(r1)
            O2.z0 r9 = r9.G()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L99
            double[] r2 = n3.n.f45068q
            int r4 = r2.length
            if (r1 >= r4) goto L99
            r1 = r2[r1]
            int r8 = r8.f45088c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L91
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L91:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9b
        L99:
            r0 = 0
        L9b:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.n.a(n3.n$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    @Override // n3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(d4.M r21) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.n.b(d4.M):void");
    }

    @Override // n3.m
    public void c() {
        d4.G.a(this.f45074f);
        this.f45075g.c();
        u uVar = this.f45073e;
        if (uVar != null) {
            uVar.d();
        }
        this.f45076h = 0L;
        this.f45077i = false;
        this.f45080l = -9223372036854775807L;
        this.f45082n = -9223372036854775807L;
    }

    @Override // n3.m
    public void d() {
    }

    @Override // n3.m
    public void e(long j9, int i9) {
        this.f45080l = j9;
    }

    @Override // n3.m
    public void f(InterfaceC1674k interfaceC1674k, I.d dVar) {
        dVar.a();
        this.f45069a = dVar.b();
        this.f45070b = interfaceC1674k.e(dVar.c(), 2);
        K k9 = this.f45071c;
        if (k9 != null) {
            k9.b(interfaceC1674k, dVar);
        }
    }
}
