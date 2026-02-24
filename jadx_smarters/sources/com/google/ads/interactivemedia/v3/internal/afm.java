package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class afm extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final afm f19461a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private afn f19463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private afp f19464f;

    static {
        afm afmVar = new afm();
        f19461a = afmVar;
        bqn.aL(afm.class, afmVar);
    }

    private afm() {
    }

    public static afm b(byte[] bArr, bqb bqbVar) throws bqw {
        return (afm) bqn.aD(f19461a, bArr, bqbVar);
    }

    public final afn c() {
        afn afnVar = this.f19463e;
        return afnVar == null ? afn.b() : afnVar;
    }

    public final afp d() {
        afp afpVar = this.f19464f;
        return afpVar == null ? afp.b() : afpVar;
    }

    public final boolean e() {
        return (this.f19462d & 1) != 0;
    }

    public final boolean f() {
        return (this.f19462d & 2) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19461a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new afm();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new afl(bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f19461a;
    }
}
