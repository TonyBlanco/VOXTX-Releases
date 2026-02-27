package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhr extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhr f21403a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21404d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bpb f21405e = bpb.f21870b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21406f;

    static {
        bhr bhrVar = new bhr();
        f21403a = bhrVar;
        bqn.aL(bhr.class, bhrVar);
    }

    private bhr() {
    }

    public static bhr c() {
        return f21403a;
    }

    public static bif j() {
        return (bif) f21403a.ay();
    }

    public final bhq a() {
        bhq bhqVarA = bhq.a(this.f21406f);
        return bhqVarA == null ? bhq.UNRECOGNIZED : bhqVarA;
    }

    public final bpb d() {
        return this.f21405e;
    }

    public final String e() {
        return this.f21404d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21403a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bhr();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (short[][]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21403a;
    }
}
