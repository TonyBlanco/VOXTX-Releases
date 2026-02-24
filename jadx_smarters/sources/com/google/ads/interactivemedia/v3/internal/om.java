package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
final class om implements cy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cy f23925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f23926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f23927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CipherInputStream f23928d;

    public om(cy cyVar, byte[] bArr, byte[] bArr2) {
        this.f23925a = cyVar;
        this.f23926b = bArr;
        this.f23927c = bArr2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.InterfaceC1310k
    public final int a(byte[] bArr, int i9, int i10) throws IOException {
        af.s(this.f23928d);
        int i11 = this.f23928d.read(bArr, i9, i10);
        if (i11 < 0) {
            return -1;
        }
        return i11;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final long b(dc dcVar) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f23926b, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(this.f23927c));
                da daVar = new da(this.f23925a, dcVar);
                this.f23928d = new CipherInputStream(daVar, cipher);
                daVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e9) {
                throw new RuntimeException(e9);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Uri c() {
        return this.f23925a.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void d() throws IOException {
        if (this.f23928d != null) {
            this.f23928d = null;
            this.f23925a.d();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Map e() {
        return this.f23925a.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void f(dw dwVar) {
        af.s(dwVar);
        this.f23925a.f(dwVar);
    }
}
