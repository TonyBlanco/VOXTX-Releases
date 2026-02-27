package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class aec implements adr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aae f19293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19294c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19297f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cj f19292a = new cj(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19295d = -9223372036854775807L;

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void a(cj cjVar) {
        af.t(this.f19293b);
        if (this.f19294c) {
            int iA = cjVar.a();
            int i9 = this.f19297f;
            if (i9 < 10) {
                int iMin = Math.min(iA, 10 - i9);
                System.arraycopy(cjVar.H(), cjVar.c(), this.f19292a.H(), this.f19297f, iMin);
                if (this.f19297f + iMin == 10) {
                    this.f19292a.F(0);
                    if (this.f19292a.i() != 73 || this.f19292a.i() != 68 || this.f19292a.i() != 51) {
                        cd.e("Id3Reader", "Discarding invalid ID3 tag");
                        this.f19294c = false;
                        return;
                    } else {
                        this.f19292a.G(3);
                        this.f19296e = this.f19292a.h() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f19296e - this.f19297f);
            this.f19293b.e(cjVar, iMin2);
            this.f19297f += iMin2;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void b(zk zkVar, aet aetVar) {
        aetVar.c();
        aae aaeVarI = zkVar.i(aetVar.a(), 5);
        this.f19293b = aaeVarI;
        r rVar = new r();
        rVar.S(aetVar.b());
        rVar.ae("application/id3");
        aaeVarI.b(rVar.v());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void c() {
        int i9;
        af.t(this.f19293b);
        if (this.f19294c && (i9 = this.f19296e) != 0 && this.f19297f == i9) {
            long j9 = this.f19295d;
            if (j9 != -9223372036854775807L) {
                this.f19293b.f(j9, 1, i9, 0, null);
            }
            this.f19294c = false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void d(long j9, int i9) {
        if ((i9 & 4) == 0) {
            return;
        }
        this.f19294c = true;
        if (j9 != -9223372036854775807L) {
            this.f19295d = j9;
        }
        this.f19296e = 0;
        this.f19297f = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adr
    public final void e() {
        this.f19294c = false;
        this.f19295d = -9223372036854775807L;
    }
}
