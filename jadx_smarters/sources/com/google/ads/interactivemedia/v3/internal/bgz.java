package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgz extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgz f21301a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bha f21302d;

    static {
        bgz bgzVar = new bgz();
        f21301a = bgzVar;
        bqn.aL(bgz.class, bgzVar);
    }

    private bgz() {
    }

    public static bgz b(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgz) bqn.aC(f21301a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void d(bgz bgzVar, bha bhaVar) {
        bhaVar.getClass();
        bgzVar.f21302d = bhaVar;
    }

    public static bif e() {
        return (bif) f21301a.ay();
    }

    public final bha c() {
        bha bhaVar = this.f21302d;
        return bhaVar == null ? bha.c() : bhaVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21301a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"d"});
        }
        if (i10 == 3) {
            return new bgz();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (short[]) bArr, bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21301a;
    }
}
