package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhb extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhb f21323a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bhc f21325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bpb f21326f = bpb.f21870b;

    static {
        bhb bhbVar = new bhb();
        f21323a = bhbVar;
        bqn.aL(bhb.class, bhbVar);
    }

    private bhb() {
    }

    public static bhb c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bhb) bqn.aC(f21323a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void f(bhb bhbVar, bhc bhcVar) {
        bhcVar.getClass();
        bhbVar.f21325e = bhcVar;
    }

    public static bif j() {
        return (bif) f21323a.ay();
    }

    public final int a() {
        return this.f21324d;
    }

    public final bhc d() {
        bhc bhcVar = this.f21325e;
        return bhcVar == null ? bhc.d() : bhcVar;
    }

    public final bpb e() {
        return this.f21326f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21323a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bhb();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (char[]) (null == true ? 1 : 0), (char[]) (null == true ? 1 : 0), (byte[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21323a;
    }
}
