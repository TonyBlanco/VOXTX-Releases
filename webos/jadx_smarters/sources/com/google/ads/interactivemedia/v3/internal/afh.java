package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class afh extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final afh f19434a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f19436e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f19437f = "";

    static {
        afh afhVar = new afh();
        f19434a = afhVar;
        bqn.aL(afh.class, afhVar);
    }

    private afh() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19434a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new afh();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new afl(bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f19434a;
    }
}
