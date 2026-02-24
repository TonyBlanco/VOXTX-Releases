package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgl extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgl f21260a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21261d;

    static {
        bgl bglVar = new bgl();
        f21260a = bglVar;
        bqn.aL(bgl.class, bglVar);
    }

    private bgl() {
    }

    public static bgl c() {
        return f21260a;
    }

    public static bif e() {
        return (bif) f21260a.ay();
    }

    public final int a() {
        return this.f21261d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21260a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"d"});
        }
        if (i10 == 3) {
            return new bgl();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (int[]) bArr, bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21260a;
    }
}
