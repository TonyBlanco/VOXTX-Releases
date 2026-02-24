package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bht extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bht f21413a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21414d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bpb f21415e = bpb.f21870b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21416f;

    static {
        bht bhtVar = new bht();
        f21413a = bhtVar;
        bqn.aL(bht.class, bhtVar);
    }

    private bht() {
    }

    public static bht b() {
        return f21413a;
    }

    public static /* synthetic */ void f(bht bhtVar, String str) {
        str.getClass();
        bhtVar.f21414d = str;
    }

    public static bif j() {
        return (bif) f21413a.ay();
    }

    public final bid c() {
        bid bidVarA = bid.a(this.f21416f);
        return bidVarA == null ? bid.UNRECOGNIZED : bidVarA;
    }

    public final bpb d() {
        return this.f21415e;
    }

    public final String e() {
        return this.f21414d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21413a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bht();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (char[][]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21413a;
    }
}
