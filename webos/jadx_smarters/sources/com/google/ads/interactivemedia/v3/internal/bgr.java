package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgr extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgr f21277a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bpb f21279e = bpb.f21870b;

    static {
        bgr bgrVar = new bgr();
        f21277a = bgrVar;
        bqn.aL(bgr.class, bgrVar);
    }

    private bgr() {
    }

    public static bgr c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgr) bqn.aC(f21277a, bpbVar, bqbVar);
    }

    public static bif g() {
        return (bif) f21277a.ay();
    }

    public final int a() {
        return this.f21278d;
    }

    public final bpb d() {
        return this.f21279e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21277a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bgr();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (char[]) (null == true ? 1 : 0), (short[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21277a;
    }
}
