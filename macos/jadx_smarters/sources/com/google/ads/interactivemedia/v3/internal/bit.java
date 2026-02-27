package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes3.dex */
public final class bit implements azt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f21516a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f21518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bir f21519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final oq f21521f;

    public bit(ECPublicKey eCPublicKey, byte[] bArr, String str, int i9, bir birVar) throws GeneralSecurityException {
        bjh.l(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f21521f = new oq(eCPublicKey);
        this.f21518c = bArr;
        this.f21517b = str;
        this.f21520e = i9;
        this.f21519d = birVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azt
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        bel belVarH = this.f21521f.h(this.f21517b, this.f21518c, bArr2, this.f21519d.a(), this.f21520e);
        byte[] bArrD = this.f21519d.b(belVarH.e()).d(bArr, f21516a);
        byte[] bArrD2 = belVarH.d();
        return ByteBuffer.allocate(bArrD2.length + bArrD.length).put(bArrD2).put(bArrD).array();
    }
}
