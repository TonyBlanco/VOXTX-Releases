package n3;

import d3.InterfaceC1674k;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import java.util.Arrays;
import n3.I;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f45090l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f45091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f45092b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f45095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f45096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f45097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f45098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d3.w f45099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45100j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f45093c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f45094d = new a(128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f45101k = -9223372036854775807L;

    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f45102f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f45103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f45107e;

        public a(int i9) {
            this.f45107e = new byte[i9];
        }

        public void a(byte[] bArr, int i9, int i10) {
            if (this.f45103a) {
                int i11 = i10 - i9;
                byte[] bArr2 = this.f45107e;
                int length = bArr2.length;
                int i12 = this.f45105c;
                if (length < i12 + i11) {
                    this.f45107e = Arrays.copyOf(bArr2, (i12 + i11) * 2);
                }
                System.arraycopy(bArr, i9, this.f45107e, this.f45105c, i11);
                this.f45105c += i11;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(int r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.f45104b
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L4a
                r3 = 181(0xb5, float:2.54E-43)
                r4 = 2
                java.lang.String r5 = "Unexpected start code value"
                java.lang.String r6 = "H263Reader"
                if (r0 == r2) goto L47
                r7 = 3
                if (r0 == r4) goto L3f
                r4 = 4
                if (r0 == r7) goto L2b
                if (r0 != r4) goto L25
                r0 = 179(0xb3, float:2.51E-43)
                if (r9 == r0) goto L1d
                if (r9 != r3) goto L52
            L1d:
                int r9 = r8.f45105c
                int r9 = r9 - r10
                r8.f45105c = r9
                r8.f45103a = r1
                return r2
            L25:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>()
                throw r9
            L2b:
                r9 = r9 & 240(0xf0, float:3.36E-43)
                r10 = 32
                if (r9 == r10) goto L38
            L31:
                d4.AbstractC1681B.j(r6, r5)
                r8.c()
                goto L52
            L38:
                int r9 = r8.f45105c
                r8.f45106d = r9
            L3c:
                r8.f45104b = r4
                goto L52
            L3f:
                r10 = 31
                if (r9 <= r10) goto L44
                goto L31
            L44:
                r8.f45104b = r7
                goto L52
            L47:
                if (r9 == r3) goto L3c
                goto L31
            L4a:
                r10 = 176(0xb0, float:2.47E-43)
                if (r9 != r10) goto L52
                r8.f45104b = r2
                r8.f45103a = r2
            L52:
                byte[] r9 = n3.o.a.f45102f
                int r10 = r9.length
                r8.a(r9, r1, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: n3.o.a.b(int, int):boolean");
        }

        public void c() {
            this.f45103a = false;
            this.f45105c = 0;
            this.f45104b = 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d3.w f45108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f45109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f45111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f45113f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f45114g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f45115h;

        public b(d3.w wVar) {
            this.f45108a = wVar;
        }

        public void a(byte[] bArr, int i9, int i10) {
            if (this.f45110c) {
                int i11 = this.f45113f;
                int i12 = (i9 + 1) - i11;
                if (i12 >= i10) {
                    this.f45113f = i11 + (i10 - i9);
                } else {
                    this.f45111d = ((bArr[i12] & 192) >> 6) == 0;
                    this.f45110c = false;
                }
            }
        }

        public void b(long j9, int i9, boolean z9) {
            if (this.f45112e == 182 && z9 && this.f45109b) {
                long j10 = this.f45115h;
                if (j10 != -9223372036854775807L) {
                    this.f45108a.f(j10, this.f45111d ? 1 : 0, (int) (j9 - this.f45114g), i9, null);
                }
            }
            if (this.f45112e != 179) {
                this.f45114g = j9;
            }
        }

        public void c(int i9, long j9) {
            this.f45112e = i9;
            this.f45111d = false;
            this.f45109b = i9 == 182 || i9 == 179;
            this.f45110c = i9 == 182;
            this.f45113f = 0;
            this.f45115h = j9;
        }

        public void d() {
            this.f45109b = false;
            this.f45110c = false;
            this.f45111d = false;
            this.f45112e = -1;
        }
    }

    public o(K k9) {
        M m9;
        this.f45091a = k9;
        if (k9 != null) {
            this.f45095e = new u(178, 128);
            m9 = new M();
        } else {
            m9 = null;
            this.f45095e = null;
        }
        this.f45092b = m9;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static O2.C0936z0 a(n3.o.a r8, int r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.o.a(n3.o$a, int, java.lang.String):O2.z0");
    }

    @Override // n3.m
    public void b(M m9) {
        AbstractC1684a.i(this.f45096f);
        AbstractC1684a.i(this.f45099i);
        int iF = m9.f();
        int iG = m9.g();
        byte[] bArrE = m9.e();
        this.f45097g += (long) m9.a();
        this.f45099i.b(m9, m9.a());
        while (true) {
            int iC = d4.G.c(bArrE, iF, iG, this.f45093c);
            if (iC == iG) {
                break;
            }
            int i9 = iC + 3;
            int i10 = m9.e()[i9] & 255;
            int i11 = iC - iF;
            int i12 = 0;
            if (!this.f45100j) {
                if (i11 > 0) {
                    this.f45094d.a(bArrE, iF, iC);
                }
                if (this.f45094d.b(i10, i11 < 0 ? -i11 : 0)) {
                    d3.w wVar = this.f45099i;
                    a aVar = this.f45094d;
                    wVar.d(a(aVar, aVar.f45106d, (String) AbstractC1684a.e(this.f45098h)));
                    this.f45100j = true;
                }
            }
            this.f45096f.a(bArrE, iF, iC);
            u uVar = this.f45095e;
            if (uVar != null) {
                if (i11 > 0) {
                    uVar.a(bArrE, iF, iC);
                } else {
                    i12 = -i11;
                }
                if (this.f45095e.b(i12)) {
                    u uVar2 = this.f45095e;
                    ((M) k0.j(this.f45092b)).S(this.f45095e.f45234d, d4.G.q(uVar2.f45234d, uVar2.f45235e));
                    ((K) k0.j(this.f45091a)).a(this.f45101k, this.f45092b);
                }
                if (i10 == 178 && m9.e()[iC + 2] == 1) {
                    this.f45095e.e(i10);
                }
            }
            int i13 = iG - iC;
            this.f45096f.b(this.f45097g - ((long) i13), i13, this.f45100j);
            this.f45096f.c(i10, this.f45101k);
            iF = i9;
        }
        if (!this.f45100j) {
            this.f45094d.a(bArrE, iF, iG);
        }
        this.f45096f.a(bArrE, iF, iG);
        u uVar3 = this.f45095e;
        if (uVar3 != null) {
            uVar3.a(bArrE, iF, iG);
        }
    }

    @Override // n3.m
    public void c() {
        d4.G.a(this.f45093c);
        this.f45094d.c();
        b bVar = this.f45096f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f45095e;
        if (uVar != null) {
            uVar.d();
        }
        this.f45097g = 0L;
        this.f45101k = -9223372036854775807L;
    }

    @Override // n3.m
    public void d() {
    }

    @Override // n3.m
    public void e(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f45101k = j9;
        }
    }

    @Override // n3.m
    public void f(InterfaceC1674k interfaceC1674k, I.d dVar) {
        dVar.a();
        this.f45098h = dVar.b();
        d3.w wVarE = interfaceC1674k.e(dVar.c(), 2);
        this.f45099i = wVarE;
        this.f45096f = new b(wVarE);
        K k9 = this.f45091a;
        if (k9 != null) {
            k9.b(interfaceC1674k, dVar);
        }
    }
}
