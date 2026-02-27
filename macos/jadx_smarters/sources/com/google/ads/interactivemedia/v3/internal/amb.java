package com.google.ads.interactivemedia.v3.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes3.dex */
final class amb implements Runnable {
    private amb() {
    }

    public /* synthetic */ amb(byte[] bArr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            amc.f20185c = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            amc.f20184b.countDown();
            throw th;
        }
        amc.f20184b.countDown();
    }
}
