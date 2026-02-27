package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class bfu implements bag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bal f21223a;

    public /* synthetic */ bfu(bal balVar) {
        this.f21223a = balVar;
        if (balVar.e()) {
            bfz bfzVarB = bei.a().b();
            beg.a(balVar);
            bfzVarB.a();
            bfzVarB.a();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bag
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        if (this.f21223a.a().c().equals(bid.LEGACY)) {
            bArr = bjh.y(bArr, bfv.f21224a);
        }
        byte[] bArrY = bjh.y(this.f21223a.a().e(), ((bag) this.f21223a.a().d()).a(bArr));
        this.f21223a.a().a();
        return bArrY;
    }
}
