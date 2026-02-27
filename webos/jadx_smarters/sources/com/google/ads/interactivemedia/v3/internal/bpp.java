package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bpp extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bpp f21930a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f21932e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f21933f = "";

    static {
        bpp bppVar = new bpp();
        f21930a = bppVar;
        bqn.aL(bpp.class, bppVar);
    }

    private bpp() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21930a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bpp();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bpv(bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21930a;
    }
}
