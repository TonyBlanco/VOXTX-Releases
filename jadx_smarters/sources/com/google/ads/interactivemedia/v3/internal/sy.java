package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class sy extends st {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f24561c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f24562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f24563e;

    private sy(be beVar, Object obj, Object obj2) {
        super(beVar);
        this.f24562d = obj;
        this.f24563e = obj2;
    }

    public static sy s(ai aiVar) {
        return new sy(new sz(aiVar), bd.f21061a, f24561c);
    }

    public static sy t(be beVar, Object obj, Object obj2) {
        return new sy(beVar, obj, obj2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.st, com.google.ads.interactivemedia.v3.internal.be
    public final int a(Object obj) {
        Object obj2;
        be beVar = this.f24546b;
        if (f24561c.equals(obj) && (obj2 = this.f24563e) != null) {
            obj = obj2;
        }
        return beVar.a(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.st, com.google.ads.interactivemedia.v3.internal.be
    public final bc d(int i9, bc bcVar, boolean z9) {
        this.f24546b.d(i9, bcVar, z9);
        if (cq.V(bcVar.f21036b, this.f24563e) && z9) {
            bcVar.f21036b = f24561c;
        }
        return bcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.st, com.google.ads.interactivemedia.v3.internal.be
    public final bd e(int i9, bd bdVar, long j9) {
        this.f24546b.e(i9, bdVar, j9);
        if (cq.V(bdVar.f21063b, this.f24562d)) {
            bdVar.f21063b = bd.f21061a;
        }
        return bdVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.st, com.google.ads.interactivemedia.v3.internal.be
    public final Object f(int i9) {
        Object objF = this.f24546b.f(i9);
        return cq.V(objF, this.f24563e) ? f24561c : objF;
    }

    public final sy r(be beVar) {
        return new sy(beVar, this.f24562d, this.f24563e);
    }
}
