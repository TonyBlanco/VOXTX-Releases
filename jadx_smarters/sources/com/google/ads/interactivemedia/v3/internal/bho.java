package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bho extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bho f21387a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bhp f21389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bpb f21390f = bpb.f21870b;

    static {
        bho bhoVar = new bho();
        f21387a = bhoVar;
        bqn.aL(bho.class, bhoVar);
    }

    private bho() {
    }

    public static bho c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bho) bqn.aC(f21387a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void f(bho bhoVar, bhp bhpVar) {
        bhpVar.getClass();
        bhoVar.f21389e = bhpVar;
    }

    public static bif k() {
        return (bif) f21387a.ay();
    }

    public final int a() {
        return this.f21388d;
    }

    public final bhp d() {
        bhp bhpVar = this.f21389e;
        return bhpVar == null ? bhp.d() : bhpVar;
    }

    public final bpb e() {
        return this.f21390f;
    }

    public final boolean h() {
        return this.f21389e != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21387a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bho();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (char[]) (null == true ? 1 : 0), (char[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21387a;
    }
}
