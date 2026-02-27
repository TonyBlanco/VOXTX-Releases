package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgt extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgt f21283a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bpb f21285e = bpb.f21870b;

    static {
        bgt bgtVar = new bgt();
        f21283a = bgtVar;
        bqn.aL(bgt.class, bgtVar);
    }

    private bgt() {
    }

    public static bgt c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgt) bqn.aC(f21283a, bpbVar, bqbVar);
    }

    public static bif g() {
        return (bif) f21283a.ay();
    }

    public final int a() {
        return this.f21284d;
    }

    public final bpb d() {
        return this.f21285e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21283a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bgt();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (boolean[]) (null == true ? 1 : 0), (byte[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21283a;
    }
}
