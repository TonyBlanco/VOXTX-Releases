package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class agm extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final agm f19687a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bqt f19689e = bqn.aF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bpb f19690f = bpb.f21870b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19691g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19692h = 1;

    static {
        agm agmVar = new agm();
        f19687a = agmVar;
        bqn.aL(agm.class, agmVar);
    }

    private agm() {
    }

    public static agl a() {
        return (agl) f19687a.ay();
    }

    public static /* synthetic */ void c(agm agmVar, bpb bpbVar) {
        agmVar.f();
        agmVar.f19689e.add(bpbVar);
    }

    public static /* synthetic */ void d(agm agmVar, bpb bpbVar) {
        agmVar.f19688d |= 1;
        agmVar.f19690f = bpbVar;
    }

    public static /* synthetic */ void e(agm agmVar, int i9) {
        agmVar.f19692h = agg.b(i9);
        agmVar.f19688d |= 4;
    }

    private final void f() {
        bqt bqtVar = this.f19689e;
        if (bqtVar.c()) {
            return;
        }
        this.f19689e = bqn.aG(bqtVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19687a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"d", "e", "f", "g", agi.a(), "h", agg.a()});
        }
        if (i10 == 3) {
            return new agm();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new agl(bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f19687a;
    }
}
