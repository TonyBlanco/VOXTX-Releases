package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1301h implements az {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final bd f23118a = new bd();

    private final void v() {
        s();
    }

    public final int a() {
        be beVarO = o();
        if (beVarO.p()) {
            return -1;
        }
        int iH = h();
        v();
        t();
        return beVarO.j(iH, 0, false);
    }

    public final int b() {
        be beVarO = o();
        if (beVarO.p()) {
            return -1;
        }
        int iH = h();
        v();
        t();
        return beVarO.q(iH);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final boolean c() {
        be beVarO = o();
        return !beVarO.p() && beVarO.o(h(), this.f23118a).f21070i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final boolean d() {
        be beVarO = o();
        return !beVarO.p() && beVarO.o(h(), this.f23118a).c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final boolean e() {
        be beVarO = o();
        return !beVarO.p() && beVarO.o(h(), this.f23118a).f21069h;
    }
}
