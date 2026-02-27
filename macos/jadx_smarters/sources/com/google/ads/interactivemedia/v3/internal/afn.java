package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class afn extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final afn f19465a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19467e = 2;

    static {
        afn afnVar = new afn();
        f19465a = afnVar;
        bqn.aL(afn.class, afnVar);
    }

    private afn() {
    }

    public static afn b() {
        return f19465a;
    }

    public final int c() {
        int iB = afo.b(this.f19467e);
        return iB == 0 ? afo.f19470c : iB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19465a, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"d", "e", afo.a()});
        }
        if (i10 == 3) {
            return new afn();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new afl(bArr, (char[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f19465a;
    }
}
