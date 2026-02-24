package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgf extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgf f21241a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bgg f21243e;

    static {
        bgf bgfVar = new bgf();
        f21241a = bgfVar;
        bqn.aL(bgf.class, bgfVar);
    }

    private bgf() {
    }

    public static bgf c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgf) bqn.aC(f21241a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void e(bgf bgfVar, bgg bggVar) {
        bggVar.getClass();
        bgfVar.f21243e = bggVar;
    }

    public static bif g() {
        return (bif) f21241a.ay();
    }

    public final int a() {
        return this.f21242d;
    }

    public final bgg d() {
        bgg bggVar = this.f21243e;
        return bggVar == null ? bgg.c() : bggVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21241a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bgf();
        }
        if (i10 == 4) {
            return new bif((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21241a;
    }
}
