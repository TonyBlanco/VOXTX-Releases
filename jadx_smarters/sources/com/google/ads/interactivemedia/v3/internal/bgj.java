package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgj extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgj f21253a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bgl f21255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bpb f21256f = bpb.f21870b;

    static {
        bgj bgjVar = new bgj();
        f21253a = bgjVar;
        bqn.aL(bgj.class, bgjVar);
    }

    private bgj() {
    }

    public static bgj c() {
        return f21253a;
    }

    public static bgj d(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgj) bqn.aC(f21253a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void g(bgj bgjVar, bgl bglVar) {
        bglVar.getClass();
        bgjVar.f21255e = bglVar;
    }

    public static bif k() {
        return (bif) f21253a.ay();
    }

    public final int a() {
        return this.f21254d;
    }

    public final bgl e() {
        bgl bglVar = this.f21255e;
        return bglVar == null ? bgl.c() : bglVar;
    }

    public final bpb f() {
        return this.f21256f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21253a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bgj();
        }
        if (i10 == 4) {
            return new bif((byte[]) null, (char[]) null, (char[]) null, (byte[]) null, (byte[]) null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21253a;
    }
}
