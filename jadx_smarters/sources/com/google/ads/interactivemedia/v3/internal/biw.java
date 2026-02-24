package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes3.dex */
public final class biw implements bix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21533a;

    public biw(int i9) {
        this.f21533a = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bix
    public final /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        int i9 = this.f21533a;
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider) : provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider) : provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider) : provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider) : provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider) : provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider) : provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
