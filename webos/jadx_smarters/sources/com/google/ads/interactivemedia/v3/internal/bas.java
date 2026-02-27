package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class bas implements azo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bal f21017a;

    public /* synthetic */ bas(bal balVar) {
        this.f21017a = balVar;
        if (balVar.e()) {
            bfz bfzVarB = bei.a().b();
            beg.a(balVar);
            bfzVarB.a();
            bfzVarB.a();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azo
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrY = bjh.y(this.f21017a.a().e(), ((azo) this.f21017a.a().d()).a(bArr, bArr2));
        this.f21017a.a().a();
        int length = bArr.length;
        return bArrY;
    }
}
