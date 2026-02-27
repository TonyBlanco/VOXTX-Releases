package com.google.ads.interactivemedia.v3.internal;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mh extends mf {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final mn f23788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final mn f23789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f23790g;

    public mh(mb mbVar, long j9, long j10, long j11, long j12, long j13, List list, long j14, mn mnVar, mn mnVar2, long j15, long j16) {
        super(mbVar, j9, j10, j11, j13, list, j14, j15, j16);
        this.f23788e = mnVar;
        this.f23789f = mnVar2;
        this.f23790g = j12;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mf
    public final long c(long j9) {
        if (this.f23783c != null) {
            return r0.size();
        }
        long j10 = this.f23790g;
        if (j10 != -1) {
            return (j10 - this.f23781a) + 1;
        }
        if (j9 != -9223372036854775807L) {
            return axt.a(BigInteger.valueOf(j9).multiply(BigInteger.valueOf(this.f23796i)), BigInteger.valueOf(this.f23782b).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
        }
        return -1L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mf
    public final mb g(me meVar, long j9) {
        List list = this.f23783c;
        long j10 = list != null ? ((mi) list.get((int) (j9 - this.f23781a))).f23791a : (j9 - this.f23781a) * this.f23782b;
        mn mnVar = this.f23789f;
        C1333s c1333s = meVar.f23777b;
        return new mb(mnVar.b(c1333s.f24456a, j9, c1333s.f24463h, j10), 0L, -1L);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mk
    public final mb i(me meVar) {
        mn mnVar = this.f23788e;
        if (mnVar == null) {
            return this.f23795h;
        }
        C1333s c1333s = meVar.f23777b;
        return new mb(mnVar.b(c1333s.f24456a, 0L, c1333s.f24463h, 0L), 0L, -1L);
    }
}
