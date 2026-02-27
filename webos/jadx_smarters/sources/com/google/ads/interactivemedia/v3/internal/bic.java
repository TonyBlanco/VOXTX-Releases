package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bic extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bic f21474a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21475d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bht f21476e;

    static {
        bic bicVar = new bic();
        f21474a = bicVar;
        bqn.aL(bic.class, bicVar);
    }

    private bic() {
    }

    public static bic c() {
        return f21474a;
    }

    public static bic d(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bic) bqn.aC(f21474a, bpbVar, bqbVar);
    }

    public final bht a() {
        bht bhtVar = this.f21476e;
        return bhtVar == null ? bht.b() : bhtVar;
    }

    public final String e() {
        return this.f21475d;
    }

    public final boolean f() {
        return this.f21476e != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21474a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bic();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (boolean[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21474a;
    }
}
