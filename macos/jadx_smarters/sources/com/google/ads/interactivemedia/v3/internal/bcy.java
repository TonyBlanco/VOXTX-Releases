package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class bcy implements azt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final bal f21060a;

    public bcy(bal balVar) {
        this.f21060a = balVar;
        if (balVar.e()) {
            bfz bfzVarB = bei.a().b();
            beg.a(balVar);
            bfzVarB.a();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azt
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        bal balVar = this.f21060a;
        if (balVar.a() == null) {
            throw new GeneralSecurityException("keyset without primary key");
        }
        byte[] bArrY = bjh.y(balVar.a().e(), ((azt) this.f21060a.a().d()).a(bArr, bArr2));
        this.f21060a.a().a();
        int length = bArr.length;
        return bArrY;
    }
}
