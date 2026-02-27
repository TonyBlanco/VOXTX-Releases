package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class bcn implements azr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bal f21056a;

    public bcn(bal balVar) {
        this.f21056a = balVar;
        if (balVar.e()) {
            bfz bfzVarB = bei.a().b();
            beg.a(balVar);
            bfzVarB.a();
            bfzVarB.a();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azr
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrY = bjh.y(this.f21056a.a().e(), ((azr) this.f21056a.a().d()).a(bArr, bArr2));
        this.f21056a.a().a();
        int length = bArr.length;
        return bArrY;
    }
}
