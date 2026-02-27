package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public class bqk extends bqj implements brt {
    public bqk(bql bqlVar) {
        super(bqlVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqj, com.google.ads.interactivemedia.v3.internal.brr
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bql aZ() {
        bqn bqnVarAZ;
        if (((bql) this.f22101a).aO()) {
            ((bql) this.f22101a).f22103a.i();
            bqnVarAZ = super.aZ();
        } else {
            bqnVarAZ = this.f22101a;
        }
        return (bql) bqnVarAZ;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqj
    public final void bc() {
        super.bc();
        if (((bql) this.f22101a).f22103a != bqe.e()) {
            bql bqlVar = (bql) this.f22101a;
            bqlVar.f22103a = bqlVar.f22103a.clone();
        }
    }
}
