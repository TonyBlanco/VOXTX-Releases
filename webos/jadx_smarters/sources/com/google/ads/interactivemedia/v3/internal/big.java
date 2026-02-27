package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class big extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final big f21489a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bpb f21491e = bpb.f21870b;

    static {
        big bigVar = new big();
        f21489a = bigVar;
        bqn.aL(big.class, bigVar);
    }

    private big() {
    }

    public static bif b() {
        return (bif) f21489a.ay();
    }

    public static big d(bpb bpbVar, bqb bqbVar) throws bqw {
        return (big) bqn.aC(f21489a, bpbVar, bqbVar);
    }

    public final int a() {
        return this.f21490d;
    }

    public final bpb e() {
        return this.f21491e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21489a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new big();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21489a;
    }
}
