package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bih extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bih f21492a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21493d;

    static {
        bih bihVar = new bih();
        f21492a = bihVar;
        bqn.aL(bih.class, bihVar);
    }

    private bih() {
    }

    public static bih b() {
        return f21492a;
    }

    public static bih c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bih) bqn.aC(f21492a, bpbVar, bqbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21492a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"d"});
        }
        if (i10 == 3) {
            return new bih();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (byte[][]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21492a;
    }
}
