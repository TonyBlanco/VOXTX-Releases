package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bia extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bia f21469a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21470d = "";

    static {
        bia biaVar = new bia();
        f21469a = biaVar;
        bqn.aL(bia.class, biaVar);
    }

    private bia() {
    }

    public static bia b() {
        return f21469a;
    }

    public static bia c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bia) bqn.aC(f21469a, bpbVar, bqbVar);
    }

    public final String d() {
        return this.f21470d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21469a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"d"});
        }
        if (i10 == 3) {
            return new bia();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (int[]) bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21469a;
    }
}
