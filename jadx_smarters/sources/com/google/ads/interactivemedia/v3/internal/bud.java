package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bud extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bud f22421a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22424f;

    static {
        bud budVar = new bud();
        f22421a = budVar;
        bqn.aL(bud.class, budVar);
    }

    private bud() {
    }

    public static bud e() {
        return f22421a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f22421a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bud();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bub(bArr, (char[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f22421a;
    }
}
