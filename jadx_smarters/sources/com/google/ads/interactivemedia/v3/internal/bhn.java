package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhn extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhn f21383a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21386f;

    static {
        bhn bhnVar = new bhn();
        f21383a = bhnVar;
        bqn.aL(bhn.class, bhnVar);
    }

    private bhn() {
    }

    public static bhn b() {
        return f21383a;
    }

    public static bif j() {
        return (bif) f21383a.ay();
    }

    public final int c() {
        int iC = bhj.c(this.f21386f);
        return iC == 0 ? bhj.f21366e : iC;
    }

    public final int d() {
        int iC = bhk.c(this.f21385e);
        return iC == 0 ? bhk.f21372e : iC;
    }

    public final int e() {
        int iC = bhl.c(this.f21384d);
        return iC == 0 ? bhl.f21379f : iC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21383a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bhn();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (byte[]) (null == true ? 1 : 0), (byte[]) (null == true ? 1 : 0), (char[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21383a;
    }
}
