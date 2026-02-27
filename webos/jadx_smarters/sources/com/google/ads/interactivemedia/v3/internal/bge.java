package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bge extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bge f21237a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bpb f21239e = bpb.f21870b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bgg f21240f;

    static {
        bge bgeVar = new bge();
        f21237a = bgeVar;
        bqn.aL(bge.class, bgeVar);
    }

    private bge() {
    }

    public static bge c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bge) bqn.aC(f21237a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void g(bge bgeVar, bgg bggVar) {
        bggVar.getClass();
        bgeVar.f21240f = bggVar;
    }

    public static bif j() {
        return (bif) f21237a.ay();
    }

    public final int a() {
        return this.f21238d;
    }

    public final bgg d() {
        bgg bggVar = this.f21240f;
        return bggVar == null ? bgg.c() : bggVar;
    }

    public final bpb e() {
        return this.f21239e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21237a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bge();
        }
        if (i10 == 4) {
            return new bif(null, null, null, null, null, null, null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21237a;
    }
}
