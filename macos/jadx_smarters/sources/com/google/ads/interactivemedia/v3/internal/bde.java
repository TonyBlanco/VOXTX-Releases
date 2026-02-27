package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
final class bde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21086a;

    public bde(String str) {
        this.f21086a = str;
    }

    private final byte[] f(byte[] bArr, byte[] bArr2, int i9) throws GeneralSecurityException {
        Mac mac = (Mac) biv.f21525b.a(this.f21086a);
        if (i9 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i9];
        mac.init(new SecretKeySpec(bArr, this.f21086a));
        byte[] bArrDoFinal = new byte[0];
        int i10 = 1;
        int i11 = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr2);
            mac.update((byte) i10);
            bArrDoFinal = mac.doFinal();
            int length = bArrDoFinal.length;
            int i12 = i11 + length;
            if (i12 >= i9) {
                System.arraycopy(bArrDoFinal, 0, bArr3, i11, i9 - i11);
                return bArr3;
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, i11, length);
            i10++;
            i11 = i12;
        }
    }

    private final byte[] g(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac mac = (Mac) biv.f21525b.a(this.f21086a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.f21086a));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.f21086a));
        }
        return mac.doFinal(bArr);
    }

    public final int a() throws GeneralSecurityException {
        return Mac.getInstance(this.f21086a).getMacLength();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] b() throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            java.lang.String r0 = r5.f21086a
            int r1 = r0.hashCode()
            r2 = 984523022(0x3aaea10e, float:0.0013323145)
            r3 = 1
            r4 = 2
            if (r1 == r2) goto L2c
            r2 = 984524074(0x3aaea52a, float:0.0013324369)
            if (r1 == r2) goto L22
            r2 = 984525777(0x3aaeabd1, float:0.0013326352)
            if (r1 == r2) goto L18
            goto L36
        L18:
            java.lang.String r1 = "HmacSha512"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = 2
            goto L37
        L22:
            java.lang.String r1 = "HmacSha384"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = 1
            goto L37
        L2c:
            java.lang.String r1 = "HmacSha256"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = 0
            goto L37
        L36:
            r0 = -1
        L37:
            if (r0 == 0) goto L4b
            if (r0 == r3) goto L48
            if (r0 != r4) goto L40
            byte[] r0 = com.google.ads.interactivemedia.v3.internal.bdr.f21108h
            return r0
        L40:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KDF ID"
            r0.<init>(r1)
            throw r0
        L48:
            byte[] r0 = com.google.ads.interactivemedia.v3.internal.bdr.f21107g
            return r0
        L4b:
            byte[] r0 = com.google.ads.interactivemedia.v3.internal.bdr.f21106f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bde.b():byte[]");
    }

    public final byte[] c(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i9) throws GeneralSecurityException {
        return f(bArr, bdr.f(str, bArr2, bArr3, i9), i9);
    }

    public final byte[] d(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) throws GeneralSecurityException {
        return g(bdr.e(str, bArr2, bArr3), bArr);
    }

    public final byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3, int i9) throws GeneralSecurityException {
        return f(g(bdr.e("eae_prk", bArr, bArr3), null), bdr.f("shared_secret", bArr2, bArr3, i9), i9);
    }
}
