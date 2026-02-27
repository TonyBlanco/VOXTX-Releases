package com.google.ads.interactivemedia.v3.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes3.dex */
final class afc extends afd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f19421a;

    public afc(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f19421a = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.afd, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f19421a;
    }
}
