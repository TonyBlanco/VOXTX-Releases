package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class apo extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final apo f20488a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20490e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f20491f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f20492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f20493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f20494i;

    static {
        apo apoVar = new apo();
        f20488a = apoVar;
        bqn.aL(apo.class, apoVar);
    }

    private apo() {
    }

    public static apn d() {
        return (apn) f20488a.ay();
    }

    public static apo f() {
        return f20488a;
    }

    public static apo g(bpb bpbVar) throws bqw {
        return (apo) bqn.aB(f20488a, bpbVar);
    }

    public static apo h(bpb bpbVar, bqb bqbVar) throws bqw {
        return (apo) bqn.aC(f20488a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void l(apo apoVar, String str) {
        str.getClass();
        apoVar.f20489d |= 1;
        apoVar.f20490e = str;
    }

    public static /* synthetic */ void m(apo apoVar, long j9) {
        apoVar.f20489d |= 16;
        apoVar.f20494i = j9;
    }

    public static /* synthetic */ void n(apo apoVar, String str) {
        str.getClass();
        apoVar.f20489d |= 2;
        apoVar.f20491f = str;
    }

    public static /* synthetic */ void o(apo apoVar, long j9) {
        apoVar.f20489d |= 4;
        apoVar.f20492g = j9;
    }

    public static /* synthetic */ void p(apo apoVar, long j9) {
        apoVar.f20489d |= 8;
        apoVar.f20493h = j9;
    }

    public final long a() {
        return this.f20493h;
    }

    public final long b() {
        return this.f20492g;
    }

    public final long c() {
        return this.f20494i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f20488a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"d", "e", "f", "g", "h", "i"});
        }
        if (i10 == 3) {
            return new apo();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new apn(bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f20488a;
    }

    public final String j() {
        return this.f20491f;
    }

    public final String k() {
        return this.f20490e;
    }
}
