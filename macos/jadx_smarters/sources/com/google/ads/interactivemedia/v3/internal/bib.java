package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bib extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bib f21471a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bic f21473e;

    static {
        bib bibVar = new bib();
        f21471a = bibVar;
        bqn.aL(bib.class, bibVar);
    }

    private bib() {
    }

    public static bib c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bib) bqn.aC(f21471a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void e(bib bibVar, bic bicVar) {
        bicVar.getClass();
        bibVar.f21473e = bicVar;
    }

    public static bif g() {
        return (bif) f21471a.ay();
    }

    public final int a() {
        return this.f21472d;
    }

    public final bic d() {
        bic bicVar = this.f21473e;
        return bicVar == null ? bic.c() : bicVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21471a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bib();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21471a;
    }
}
