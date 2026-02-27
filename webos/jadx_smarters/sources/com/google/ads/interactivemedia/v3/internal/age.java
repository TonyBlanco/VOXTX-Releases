package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class age extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final age f19652a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bpb f19654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bpb f19655f;

    static {
        age ageVar = new age();
        f19652a = ageVar;
        bqn.aL(age.class, ageVar);
    }

    private age() {
        bpb bpbVar = bpb.f21870b;
        this.f19654e = bpbVar;
        this.f19655f = bpbVar;
    }

    public static /* synthetic */ void b(age ageVar, bpb bpbVar) {
        ageVar.f19653d |= 1;
        ageVar.f19654e = bpbVar;
    }

    public static /* synthetic */ void c(age ageVar, bpb bpbVar) {
        ageVar.f19653d |= 2;
        ageVar.f19655f = bpbVar;
    }

    public static agl d() {
        return (agl) f19652a.ay();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19652a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new age();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new agl(bArr, bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f19652a;
    }
}
