package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class agj extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final agj f19679a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f19682f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bpb f19683g = bpb.f21870b;

    static {
        agj agjVar = new agj();
        f19679a = agjVar;
        bqn.aL(agj.class, agjVar);
    }

    private agj() {
    }

    public static agj c() {
        return f19679a;
    }

    public final long a() {
        return this.f19681e;
    }

    public final boolean d() {
        return (this.f19680d & 1) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19679a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"d", "e", "f", "g"});
        }
        if (i10 == 3) {
            return new agj();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new agl(bArr, (float[]) bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f19679a;
    }
}
