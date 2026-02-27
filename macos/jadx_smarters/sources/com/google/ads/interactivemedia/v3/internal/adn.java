package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class adn implements adr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f19127a = {73, 68, 51};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ci f19129c = new ci(new byte[7]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cj f19130d = new cj(Arrays.copyOf(f19127a, 10));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f19131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f19132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private aae f19133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private aae f19134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f19143q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f19144r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f19145s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f19146t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private aae f19147u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f19148v;

    public adn(boolean z9, String str) {
        h();
        this.f19140n = -1;
        this.f19141o = -1;
        this.f19144r = -9223372036854775807L;
        this.f19146t = -9223372036854775807L;
        this.f19128b = z9;
        this.f19131e = str;
    }

    public static boolean f(int i9) {
        return (i9 & 65526) == 65520;
    }

    private final void g() {
        this.f19139m = false;
        h();
    }

    private final void h() {
        this.f19135i = 0;
        this.f19136j = 0;
        this.f19137k = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
    }

    private final void i() {
        this.f19135i = 3;
        this.f19136j = 0;
    }

    private final void j(aae aaeVar, long j9, int i9, int i10) {
        this.f19135i = 4;
        this.f19136j = i9;
        this.f19147u = aaeVar;
        this.f19148v = j9;
        this.f19145s = i10;
    }

    private final boolean k(cj cjVar, byte[] bArr, int i9) {
        int iMin = Math.min(cjVar.a(), i9 - this.f19136j);
        cjVar.A(bArr, this.f19136j, iMin);
        int i10 = this.f19136j + iMin;
        this.f19136j = i10;
        return i10 == i9;
    }

    private static final boolean l(byte b9) {
        return f((b9 & 255) | 65280);
    }

    private static final boolean m(cj cjVar, byte[] bArr, int i9) {
        if (cjVar.a() < i9) {
            return false;
        }
        cjVar.A(bArr, 0, i9);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0205  */
    @Override // com.google.ads.interactivemedia.v3.internal.adr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.ads.interactivemedia.v3.internal.cj r21) throws com.google.ads.interactivemedia.v3.internal.as {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.adn.a(com.google.ads.interactivemedia.v3.internal.cj):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void b(zk zkVar, aet aetVar) {
        aetVar.c();
        this.f19132f = aetVar.b();
        aae aaeVarI = zkVar.i(aetVar.a(), 1);
        this.f19133g = aaeVarI;
        this.f19147u = aaeVarI;
        if (!this.f19128b) {
            this.f19134h = new zg();
            return;
        }
        aetVar.c();
        aae aaeVarI2 = zkVar.i(aetVar.a(), 5);
        this.f19134h = aaeVarI2;
        r rVar = new r();
        rVar.S(aetVar.b());
        rVar.ae("application/id3");
        aaeVarI2.b(rVar.v());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void d(long j9, int i9) {
        if (j9 != -9223372036854775807L) {
            this.f19146t = j9;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void e() {
        this.f19146t = -9223372036854775807L;
        g();
    }
}
