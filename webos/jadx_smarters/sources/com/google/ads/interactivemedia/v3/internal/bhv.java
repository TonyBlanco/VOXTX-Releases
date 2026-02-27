package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhv extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhv f21423a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bhr f21424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21427g;

    static {
        bhv bhvVar = new bhv();
        f21423a = bhvVar;
        bqn.aL(bhv.class, bhvVar);
    }

    private bhv() {
    }

    public final int a() {
        return this.f21426f;
    }

    public final bhr b() {
        bhr bhrVar = this.f21424d;
        return bhrVar == null ? bhr.c() : bhrVar;
    }

    public final bid d() {
        bid bidVarA = bid.a(this.f21427g);
        return bidVarA == null ? bid.UNRECOGNIZED : bidVarA;
    }

    public final boolean e() {
        return this.f21424d != null;
    }

    public final int f() {
        int iB = bhs.b(this.f21425e);
        return iB == 0 ? bhs.f21411e : iB;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21423a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"d", "e", "f", "g"});
        }
        if (i10 == 3) {
            return new bhv();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (short[]) bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21423a;
    }
}
