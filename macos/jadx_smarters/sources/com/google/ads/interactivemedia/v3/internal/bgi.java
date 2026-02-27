package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgi extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgi f21250a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bgk f21251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bhh f21252e;

    static {
        bgi bgiVar = new bgi();
        f21250a = bgiVar;
        bqn.aL(bgi.class, bgiVar);
    }

    private bgi() {
    }

    public static bgi b(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgi) bqn.aC(f21250a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void e(bgi bgiVar, bgk bgkVar) {
        bgkVar.getClass();
        bgiVar.f21251d = bgkVar;
    }

    public static /* synthetic */ void f(bgi bgiVar, bhh bhhVar) {
        bhhVar.getClass();
        bgiVar.f21252e = bhhVar;
    }

    public static bif g() {
        return (bif) f21250a.ay();
    }

    public final bgk c() {
        bgk bgkVar = this.f21251d;
        return bgkVar == null ? bgk.c() : bgkVar;
    }

    public final bhh d() {
        bhh bhhVar = this.f21252e;
        return bhhVar == null ? bhh.c() : bhhVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21250a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bgi();
        }
        if (i10 == 4) {
            return new bif((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21250a;
    }
}
