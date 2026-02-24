package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhp extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhp f21391a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bhn f21393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bpb f21394f = bpb.f21870b;

    static {
        bhp bhpVar = new bhp();
        f21391a = bhpVar;
        bqn.aL(bhp.class, bhpVar);
    }

    private bhp() {
    }

    public static bhp d() {
        return f21391a;
    }

    public static bhp e(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bhp) bqn.aC(f21391a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void g(bhp bhpVar, bhn bhnVar) {
        bhnVar.getClass();
        bhpVar.f21393e = bhnVar;
    }

    public static bif l() {
        return (bif) f21391a.ay();
    }

    public final int a() {
        return this.f21392d;
    }

    public final bhn b() {
        bhn bhnVar = this.f21393e;
        return bhnVar == null ? bhn.b() : bhnVar;
    }

    public final bpb f() {
        return this.f21394f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21391a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bhp();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, bArr, (short[]) bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21391a;
    }

    public final boolean j() {
        return this.f21393e != null;
    }
}
