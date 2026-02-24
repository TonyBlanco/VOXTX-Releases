package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class bdi implements azt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f21094a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bhp f21095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bdj f21096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bdf f21097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bde f21098e;

    private bdi(bhp bhpVar, bdj bdjVar, bde bdeVar, bdf bdfVar) {
        this.f21095b = bhpVar;
        this.f21096c = bdjVar;
        this.f21098e = bdeVar;
        this.f21097d = bdfVar;
    }

    public static bdi b(bhp bhpVar) throws GeneralSecurityException {
        if (bhpVar.f().A()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        bhn bhnVarB = bhpVar.b();
        return new bdi(bhpVar, bdl.b(bhnVarB), bdl.c(bhnVarB), bdl.a(bhnVarB));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azt
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        bhp bhpVar = this.f21095b;
        bdj bdjVar = this.f21096c;
        bde bdeVar = this.f21098e;
        bdf bdfVar = this.f21097d;
        bdk bdkVarA = bdjVar.a(bhpVar.f().B());
        bdg bdgVarC = bdg.c(bdkVarA.a(), bdkVarA.b(), bdjVar, bdeVar, bdfVar, bArr3);
        return bjh.y(bdgVarC.a(), bdgVarC.b(bArr, f21094a));
    }
}
