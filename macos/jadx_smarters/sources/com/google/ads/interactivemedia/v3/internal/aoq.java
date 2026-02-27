package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class aoq extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final anx f20438h;

    public aoq(anw anwVar, agl aglVar, int i9, anx anxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "DEi5JrQn0pxSuKS2Ij/fpEA7I+0FPLXDsBWBfvVwt/zwZUJJ4fnydbsyET2LCYMF", "Jj1vyuWfy0iUak+iXdGffQYzyyVnoa3nOmSynhrPgns=", aglVar, i9, 85, null, null, null);
        this.f20438h = anxVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.f20471d.invoke(null, Long.valueOf(this.f20438h.d()), Long.valueOf(this.f20438h.h()), Long.valueOf(this.f20438h.b()), Long.valueOf(this.f20438h.f()));
        synchronized (this.f20474g) {
            this.f20474g.ae(jArr[0]);
            this.f20474g.ad(jArr[1]);
        }
    }
}
