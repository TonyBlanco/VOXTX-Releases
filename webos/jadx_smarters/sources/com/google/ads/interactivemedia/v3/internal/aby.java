package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class aby implements zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cj f18864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zr f18865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zp f18866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final aae f18867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private zk f18868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private aae f18869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private aae f18870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f18871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ao f18872k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f18873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f18874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f18875n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f18876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private abz f18877p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18878q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f18879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final wo f18880s;

    static {
        abx abxVar = new zn() { // from class: com.google.ads.interactivemedia.v3.internal.abx
            @Override // com.google.ads.interactivemedia.v3.internal.zn
            public final zh[] a() {
                throw null;
            }
        };
    }

    public aby() {
        this((byte[]) null);
    }

    public aby(long j9) {
        this.f18862a = 0;
        this.f18863b = j9;
        this.f18864c = new cj(10);
        this.f18865d = new zr();
        this.f18866e = new zp();
        this.f18873l = -9223372036854775807L;
        this.f18880s = new wo(null);
        zg zgVar = new zg();
        this.f18867f = zgVar;
        this.f18870i = zgVar;
    }

    public aby(byte[] bArr) {
        this(-9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int g(com.google.ads.interactivemedia.v3.internal.zi r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aby.g(com.google.ads.interactivemedia.v3.internal.zi):int");
    }

    private final long h(long j9) {
        return this.f18873l + ((j9 * 1000000) / ((long) this.f18865d.f25276d));
    }

    private static boolean i(int i9, long j9) {
        return ((long) (i9 & (-128000))) == (j9 & (-128000));
    }

    private final boolean j(zi ziVar) throws IOException {
        abz abzVar = this.f18877p;
        if (abzVar != null) {
            long jA = abzVar.a();
            if (jA != -1 && ziVar.c() > jA - 4) {
                return true;
            }
        }
        try {
            return !ziVar.k(this.f18864c.H(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean k(zi ziVar, boolean z9) throws IOException {
        int i9;
        int iC;
        int iB;
        int i10 = true != z9 ? 131072 : 32768;
        ziVar.h();
        if (ziVar.d() == 0) {
            ao aoVarD = this.f18880s.d(ziVar, null);
            this.f18872k = aoVarD;
            if (aoVarD != null) {
                this.f18866e.b(aoVarD);
            }
            iC = (int) ziVar.c();
            if (!z9) {
                ziVar.i(iC);
            }
            i9 = 0;
        } else {
            i9 = 0;
            iC = 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (!j(ziVar)) {
                this.f18864c.F(0);
                int iE = this.f18864c.e();
                if ((i9 == 0 || i(iE, i9)) && (iB = zs.b(iE)) != -1) {
                    i11++;
                    if (i11 != 1) {
                        if (i11 == 4) {
                            break;
                        }
                    } else {
                        this.f18865d.a(iE);
                        i9 = iE;
                    }
                    ziVar.e(iB - 4);
                } else {
                    int i13 = i12 + 1;
                    if (i12 == i10) {
                        if (z9) {
                            return false;
                        }
                        throw as.a("Searched too many bytes.", null);
                    }
                    if (z9) {
                        ziVar.h();
                        ziVar.e(iC + i13);
                    } else {
                        ziVar.i(1);
                    }
                    i12 = i13;
                    i9 = 0;
                    i11 = 0;
                }
            } else if (i11 <= 0) {
                throw new EOFException();
            }
        }
        if (z9) {
            ziVar.i(iC + i12);
        } else {
            ziVar.h();
        }
        this.f18871j = i9;
        return true;
    }

    private final abz l(zi ziVar) throws IOException {
        ziVar.f(this.f18864c.H(), 0, 4);
        this.f18864c.F(0);
        this.f18865d.a(this.f18864c.e());
        return new abu(ziVar.b(), ziVar.d(), this.f18865d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final boolean C(zi ziVar) throws IOException {
        return k(ziVar, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final int a(zi ziVar, zy zyVar) throws IOException {
        af.t(this.f18869h);
        int i9 = cq.f22640a;
        int iG = g(ziVar);
        if (iG == -1 && (this.f18877p instanceof abv)) {
            if (this.f18877p.e() != h(this.f18874m)) {
                throw null;
            }
        }
        return iG;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void b(zk zkVar) {
        this.f18868g = zkVar;
        aae aaeVarI = zkVar.i(0, 1);
        this.f18869h = aaeVarI;
        this.f18870i = aaeVarI;
        this.f18868g.n();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void d(long j9, long j10) {
        this.f18871j = 0;
        this.f18873l = -9223372036854775807L;
        this.f18874m = 0L;
        this.f18876o = 0;
        this.f18879r = j10;
        if (this.f18877p instanceof abv) {
            throw null;
        }
    }

    public final void f() {
        this.f18878q = true;
    }
}
