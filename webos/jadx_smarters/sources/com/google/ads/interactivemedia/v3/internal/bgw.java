package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgw extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgw f21292a;

    static {
        bgw bgwVar = new bgw();
        f21292a = bgwVar;
        bqn.aL(bgw.class, bgwVar);
    }

    private bgw() {
    }

    public static bgw b() {
        return f21292a;
    }

    public static bgw c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgw) bqn.aC(f21292a, bpbVar, bqbVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (i10 == 2) {
            return bqn.aI(f21292a, "\u0000\u0000", null);
        }
        if (i10 == 3) {
            return new bgw();
        }
        if (i10 == 4) {
            return new bif(bArr, bArr, bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21292a;
    }
}
