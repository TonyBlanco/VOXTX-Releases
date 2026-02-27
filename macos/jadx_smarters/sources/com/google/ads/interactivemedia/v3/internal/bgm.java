package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgm extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgm f21262a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bgo f21264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bpb f21265f = bpb.f21870b;

    static {
        bgm bgmVar = new bgm();
        f21262a = bgmVar;
        bqn.aL(bgm.class, bgmVar);
    }

    private bgm() {
    }

    public static bgm c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgm) bqn.aC(f21262a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void f(bgm bgmVar, bgo bgoVar) {
        bgoVar.getClass();
        bgmVar.f21264e = bgoVar;
    }

    public static bif j() {
        return (bif) f21262a.ay();
    }

    public final int a() {
        return this.f21263d;
    }

    public final bgo d() {
        bgo bgoVar = this.f21264e;
        return bgoVar == null ? bgo.c() : bgoVar;
    }

    public final bpb e() {
        return this.f21265f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21262a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bgm();
        }
        if (i10 == 4) {
            return new bif((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21262a;
    }
}
