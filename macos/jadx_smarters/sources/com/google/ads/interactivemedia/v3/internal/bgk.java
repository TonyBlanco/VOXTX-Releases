package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgk extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgk f21257a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bgl f21258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21259e;

    static {
        bgk bgkVar = new bgk();
        f21257a = bgkVar;
        bqn.aL(bgk.class, bgkVar);
    }

    private bgk() {
    }

    public static bgk c() {
        return f21257a;
    }

    public static bgk d(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgk) bqn.aC(f21257a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void f(bgk bgkVar, bgl bglVar) {
        bglVar.getClass();
        bgkVar.f21258d = bglVar;
    }

    public static bif h() {
        return (bif) f21257a.ay();
    }

    public final int a() {
        return this.f21259e;
    }

    public final bgl e() {
        bgl bglVar = this.f21258d;
        return bglVar == null ? bgl.c() : bglVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21257a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bgk();
        }
        if (i10 == 4) {
            return new bif((byte[]) null, (byte[]) null, (short[]) null, (byte[]) null, (byte[]) null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21257a;
    }
}
