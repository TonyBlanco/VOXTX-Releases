package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class afv extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final afv f19516a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19518e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19519f = 1000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19520g = 1000;

    static {
        afv afvVar = new afv();
        f19516a = afvVar;
        bqn.aL(afv.class, afvVar);
    }

    private afv() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19516a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"d", "e", "f", agh.a(), "g", agh.a()});
        }
        if (i10 == 3) {
            return new afv();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new agl(bArr, (char[]) (null == true ? 1 : 0), (byte[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f19516a;
    }
}
