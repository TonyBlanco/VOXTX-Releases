package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhh extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhh f21355a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bhi f21356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21358f;

    static {
        bhh bhhVar = new bhh();
        f21355a = bhhVar;
        bqn.aL(bhh.class, bhhVar);
    }

    private bhh() {
    }

    public static bhh c() {
        return f21355a;
    }

    public static bhh d(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bhh) bqn.aC(f21355a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void f(bhh bhhVar, bhi bhiVar) {
        bhiVar.getClass();
        bhhVar.f21356d = bhiVar;
    }

    public static bif h() {
        return (bif) f21355a.ay();
    }

    public final int a() {
        return this.f21357e;
    }

    public final bhi e() {
        bhi bhiVar = this.f21356d;
        return bhiVar == null ? bhi.c() : bhiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21355a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bhh();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (char[]) (null == true ? 1 : 0), (byte[]) (null == true ? 1 : 0), (char[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21355a;
    }
}
