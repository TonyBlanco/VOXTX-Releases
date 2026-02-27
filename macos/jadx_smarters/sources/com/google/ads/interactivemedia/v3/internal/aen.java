package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class aen implements aei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aep f19370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ci f19371b = new ci(new byte[4]);

    public aen(aep aepVar) {
        this.f19370a = aepVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aei
    public final void a(cj cjVar) {
        if (cjVar.i() == 0 && (cjVar.i() & 128) != 0) {
            cjVar.G(6);
            int iA = cjVar.a() / 4;
            for (int i9 = 0; i9 < iA; i9++) {
                cjVar.z(this.f19371b, 4);
                int iC = this.f19371b.c(16);
                this.f19371b.i(3);
                if (iC == 0) {
                    this.f19371b.i(13);
                } else {
                    int iC2 = this.f19371b.c(13);
                    if (this.f19370a.f19383g.get(iC2) == null) {
                        aep aepVar = this.f19370a;
                        aepVar.f19383g.put(iC2, new aej(new aeo(aepVar, iC2)));
                        this.f19370a.f19389m++;
                    }
                }
            }
            aep aepVar2 = this.f19370a;
            if (aepVar2.f19377a != 2) {
                aepVar2.f19383g.remove(0);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aei
    public final void b(co coVar, zk zkVar, aet aetVar) {
    }
}
