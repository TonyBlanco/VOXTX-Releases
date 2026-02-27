package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class aff extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final aff f19423a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19425e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19428h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19426f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f19427g = "unknown_host";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19429i = true;

    static {
        aff affVar = new aff();
        f19423a = affVar;
        bqn.aL(aff.class, affVar);
    }

    private aff() {
    }

    public static /* synthetic */ void f(aff affVar) {
        affVar.f19424d |= 16;
        affVar.f19429i = false;
    }

    public static /* synthetic */ void g(aff affVar) {
        affVar.f19424d |= 4;
        affVar.f19427g = "a.3.29.0";
    }

    public static /* synthetic */ void h(aff affVar) {
        affVar.f19424d |= 8;
        affVar.f19428h = false;
    }

    public static /* synthetic */ void k(aff affVar, int i9) {
        affVar.f19425e = afg.b(i9);
        affVar.f19424d |= 1;
    }

    public static afl l() {
        return (afl) f19423a.ay();
    }

    public final String b() {
        return this.f19427g;
    }

    public final boolean c() {
        return this.f19428h;
    }

    public final boolean d() {
        return this.f19429i;
    }

    public final boolean e() {
        return this.f19426f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19423a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"d", "e", afg.a(), "f", "g", "h", "i"});
        }
        if (i10 == 3) {
            return new aff();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new afl(bArr, bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f19423a;
    }

    public final int j() {
        int iC = afg.c(this.f19425e);
        return iC == 0 ? afg.f19430a : iC;
    }
}
