package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class afz extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final afz f19555a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19557e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19558f = 1000;

    static {
        afz afzVar = new afz();
        f19555a = afzVar;
        bqn.aL(afz.class, afzVar);
    }

    private afz() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19555a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"d", "e", "f", agh.a()});
        }
        if (i10 == 3) {
            return new afz();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new agl(bArr, (int[]) bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f19555a;
    }
}
