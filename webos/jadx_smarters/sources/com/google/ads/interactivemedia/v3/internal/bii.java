package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
final class bii extends ThreadLocal {
    public static final Cipher a() {
        try {
            return (Cipher) biv.f21524a.a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e9) {
            throw new IllegalStateException(e9);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
