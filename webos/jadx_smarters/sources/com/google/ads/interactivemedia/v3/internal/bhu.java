package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class bhu extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhu f21417a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21421g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21418d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f21419e = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21422h = "";

    static {
        bhu bhuVar = new bhu();
        f21417a = bhuVar;
        bqn.aL(bhu.class, bhuVar);
    }

    private bhu() {
    }

    public final int a() {
        return this.f21420f;
    }

    public final String c() {
        return this.f21422h;
    }

    public final String d() {
        return this.f21418d;
    }

    public final String e() {
        return this.f21419e;
    }

    public final boolean f() {
        return this.f21421g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21417a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"d", "e", "f", "g", "h"});
        }
        if (i10 == 3) {
            return new bhu();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (char[]) (null == true ? 1 : 0), (byte[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21417a;
    }
}
