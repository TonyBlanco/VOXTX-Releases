package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class sj implements uh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final uh[] f24512a;

    public sj(uh[] uhVarArr) {
        this.f24512a = uhVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final long bo() {
        long jMin = Long.MAX_VALUE;
        for (uh uhVar : this.f24512a) {
            long jBo = uhVar.bo();
            if (jBo != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jBo);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final long c() {
        long jMin = Long.MAX_VALUE;
        for (uh uhVar : this.f24512a) {
            long jC = uhVar.c();
            if (jC != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final void l(long j9) {
        for (uh uhVar : this.f24512a) {
            uhVar.l(j9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final boolean o(long j9) {
        boolean zO;
        boolean z9 = false;
        do {
            long jC = c();
            if (jC == Long.MIN_VALUE) {
                break;
            }
            zO = false;
            for (uh uhVar : this.f24512a) {
                long jC2 = uhVar.c();
                boolean z10 = jC2 != Long.MIN_VALUE && jC2 <= j9;
                if (jC2 == jC || z10) {
                    zO |= uhVar.o(j9);
                }
            }
            z9 |= zO;
        } while (zO);
        return z9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.uh
    public final boolean p() {
        for (uh uhVar : this.f24512a) {
            if (uhVar.p()) {
                return true;
            }
        }
        return false;
    }
}
