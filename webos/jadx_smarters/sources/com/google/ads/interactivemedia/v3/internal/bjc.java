package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes3.dex */
public final class bjc implements bgd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21548a = bch.f21050b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadLocal f21549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Key f21551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21552e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bjc(java.lang.String r6, java.security.Key r7) throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            r5.<init>()
            com.google.ads.interactivemedia.v3.internal.bjb r0 = new com.google.ads.interactivemedia.v3.internal.bjb
            r0.<init>(r5)
            r5.f21549b = r0
            int r1 = com.google.ads.interactivemedia.v3.internal.bjc.f21548a
            boolean r1 = com.google.ads.interactivemedia.v3.internal.bch.a(r1)
            if (r1 == 0) goto L91
            r5.f21550c = r6
            r5.f21551d = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r1 = 16
            if (r7 < r1) goto L89
            int r7 = r6.hashCode()
            r1 = 1
            r2 = 2
            r3 = 3
            r4 = 4
            switch(r7) {
                case -1823053428: goto L53;
                case 392315023: goto L49;
                case 392315118: goto L3f;
                case 392316170: goto L35;
                case 392317873: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L5d
        L2b:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5d
            r7 = 4
            goto L5e
        L35:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5d
            r7 = 3
            goto L5e
        L3f:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5d
            r7 = 2
            goto L5e
        L49:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5d
            r7 = 1
            goto L5e
        L53:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5d
            r7 = 0
            goto L5e
        L5d:
            r7 = -1
        L5e:
            if (r7 == 0) goto L82
            if (r7 == r1) goto L7f
            if (r7 == r2) goto L7c
            if (r7 == r3) goto L79
            if (r7 != r4) goto L6d
            r6 = 64
        L6a:
            r5.f21552e = r6
            goto L85
        L6d:
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            java.lang.String r6 = r0.concat(r6)
            r7.<init>(r6)
            throw r7
        L79:
            r6 = 48
            goto L6a
        L7c:
            r6 = 32
            goto L6a
        L7f:
            r6 = 28
            goto L6a
        L82:
            r6 = 20
            goto L6a
        L85:
            r0.get()
            return
        L89:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        L91:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bjc.<init>(java.lang.String, java.security.Key):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bgd
    public final byte[] a(byte[] bArr, int i9) throws GeneralSecurityException {
        if (i9 > this.f21552e) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f21549b.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f21549b.get()).doFinal(), i9);
    }
}
