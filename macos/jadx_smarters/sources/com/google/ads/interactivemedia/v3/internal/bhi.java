package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhi extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhi f21359a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21361e;

    static {
        bhi bhiVar = new bhi();
        f21359a = bhiVar;
        bqn.aL(bhi.class, bhiVar);
    }

    private bhi() {
    }

    public static bhi c() {
        return f21359a;
    }

    public static bif g() {
        return (bif) f21359a.ay();
    }

    public final int a() {
        return this.f21361e;
    }

    public final int e() {
        int iB = bhf.b(this.f21360d);
        return iB == 0 ? bhf.f21349g : iB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21359a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bhi();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (byte[]) (null == true ? 1 : 0), (char[]) (null == true ? 1 : 0), (byte[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21359a;
    }
}
