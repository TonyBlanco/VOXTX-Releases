package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bha extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bha f21319a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bhd f21320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bgy f21321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21322f;

    static {
        bha bhaVar = new bha();
        f21319a = bhaVar;
        bqn.aL(bha.class, bhaVar);
    }

    private bha() {
    }

    public static bha c() {
        return f21319a;
    }

    public static /* synthetic */ void e(bha bhaVar, bhd bhdVar) {
        bhdVar.getClass();
        bhaVar.f21320d = bhdVar;
    }

    public static /* synthetic */ void f(bha bhaVar, bgy bgyVar) {
        bgyVar.getClass();
        bhaVar.f21321e = bgyVar;
    }

    public static bif j() {
        return (bif) f21319a.ay();
    }

    public final bgy a() {
        bgy bgyVar = this.f21321e;
        return bgyVar == null ? bgy.b() : bgyVar;
    }

    public final bhd d() {
        bhd bhdVar = this.f21320d;
        return bhdVar == null ? bhd.b() : bhdVar;
    }

    public final int g() {
        int iB = bgx.b(this.f21322f);
        return iB == 0 ? bgx.f21297e : iB;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21319a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bha();
        }
        if (i10 == 4) {
            return new bif((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null, (byte[]) null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21319a;
    }
}
