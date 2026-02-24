package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhc extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhc f21327a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bha f21329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bpb f21330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bpb f21331g;

    static {
        bhc bhcVar = new bhc();
        f21327a = bhcVar;
        bqn.aL(bhc.class, bhcVar);
    }

    private bhc() {
        bpb bpbVar = bpb.f21870b;
        this.f21330f = bpbVar;
        this.f21331g = bpbVar;
    }

    public static bhc d() {
        return f21327a;
    }

    public static bhc e(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bhc) bqn.aC(f21327a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void h(bhc bhcVar, bha bhaVar) {
        bhaVar.getClass();
        bhcVar.f21329e = bhaVar;
    }

    public static bif m() {
        return (bif) f21327a.ay();
    }

    public final int a() {
        return this.f21328d;
    }

    public final bha b() {
        bha bhaVar = this.f21329e;
        return bhaVar == null ? bha.c() : bhaVar;
    }

    public final bpb f() {
        return this.f21330f;
    }

    public final bpb g() {
        return this.f21331g;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21327a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"d", "e", "f", "g"});
        }
        if (i10 == 3) {
            return new bhc();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, bArr, (short[]) bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21327a;
    }
}
