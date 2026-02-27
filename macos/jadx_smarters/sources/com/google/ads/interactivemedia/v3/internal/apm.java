package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class apm extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final apm f20483a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private apo f20485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bpb f20486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bpb f20487g;

    static {
        apm apmVar = new apm();
        f20483a = apmVar;
        bqn.aL(apm.class, apmVar);
    }

    private apm() {
        bpb bpbVar = bpb.f21870b;
        this.f20486f = bpbVar;
        this.f20487g = bpbVar;
    }

    public static apm b(bpb bpbVar, bqb bqbVar) throws bqw {
        return (apm) bqn.aC(f20483a, bpbVar, bqbVar);
    }

    public final apo c() {
        apo apoVar = this.f20485e;
        return apoVar == null ? apo.f() : apoVar;
    }

    public final bpb d() {
        return this.f20487g;
    }

    public final bpb e() {
        return this.f20486f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f20483a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"d", "e", "f", "g"});
        }
        if (i10 == 3) {
            return new apm();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new apn(bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f20483a;
    }
}
