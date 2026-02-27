package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhz extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhz f21439a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bia f21441e;

    static {
        bhz bhzVar = new bhz();
        f21439a = bhzVar;
        bqn.aL(bhz.class, bhzVar);
    }

    private bhz() {
    }

    public static bhz c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bhz) bqn.aC(f21439a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void e(bhz bhzVar, bia biaVar) {
        biaVar.getClass();
        bhzVar.f21441e = biaVar;
    }

    public static bif g() {
        return (bif) f21439a.ay();
    }

    public final int a() {
        return this.f21440d;
    }

    public final bia d() {
        bia biaVar = this.f21441e;
        return biaVar == null ? bia.b() : biaVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21439a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bhz();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21439a;
    }
}
