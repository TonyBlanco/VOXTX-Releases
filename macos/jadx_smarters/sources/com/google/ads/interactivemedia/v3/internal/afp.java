package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class afp extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final afp f19474a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f19476e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f19477f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f19478g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f19479h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f19480i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f19481j = "";

    static {
        afp afpVar = new afp();
        f19474a = afpVar;
        bqn.aL(afp.class, afpVar);
    }

    private afp() {
    }

    public static afp b() {
        return f19474a;
    }

    public final String c() {
        return this.f19476e;
    }

    public final String d() {
        return this.f19481j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19474a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"d", "e", "f", "g", "h", "i", "j"});
        }
        if (i10 == 3) {
            return new afp();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new afl(bArr, (short[]) bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f19474a;
    }
}
