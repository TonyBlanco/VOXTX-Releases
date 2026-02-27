package com.google.ads.interactivemedia.v3.internal;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f21101a = c(1, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f21102b = c(2, 32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f21103c = c(2, 16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f21104d = c(2, 17);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f21105e = c(2, 18);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f21106f = c(2, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f21107g = c(2, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f21108h = c(2, 3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f21109i = c(2, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f21110j = c(2, 2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f21111k = c(2, 3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f21112l = new byte[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f21113m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f21114n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f21115o;

    static {
        Charset charset = StandardCharsets.UTF_8;
        f21113m = "KEM".getBytes(charset);
        f21114n = "HPKE".getBytes(charset);
        f21115o = "HPKE-v1".getBytes(charset);
    }

    public static void a(bhn bhnVar) throws GeneralSecurityException {
        if (bhnVar.e() == bhl.f21374a || bhnVar.e() == bhl.f21379f) {
            int iE = bhnVar.e();
            String strA = bhl.a(iE);
            if (iE == 0) {
                throw null;
            }
            throw new GeneralSecurityException("Invalid KEM param: ".concat(String.valueOf(strA)));
        }
        if (bhnVar.d() == bhk.f21368a || bhnVar.d() == bhk.f21372e) {
            int iD = bhnVar.d();
            String strA2 = bhk.a(iD);
            if (iD == 0) {
                throw null;
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(String.valueOf(strA2)));
        }
        if (bhnVar.c() == bhj.f21362a || bhnVar.c() == bhj.f21366e) {
            int iC = bhnVar.c();
            String strA3 = bhj.a(iC);
            if (iC == 0) {
                throw null;
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(String.valueOf(strA3)));
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return bjh.y(f21114n, bArr, bArr2, bArr3);
    }

    public static byte[] c(int i9, int i10) {
        byte[] bArr = new byte[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            bArr[i11] = (byte) ((i10 >> (((i9 - i11) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] d(byte[] bArr) throws GeneralSecurityException {
        return bjh.y(f21113m, bArr);
    }

    public static byte[] e(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return bjh.y(f21115o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    public static byte[] f(String str, byte[] bArr, byte[] bArr2, int i9) throws GeneralSecurityException {
        return bjh.y(c(2, i9), f21115o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    public static int g(int i9) throws GeneralSecurityException {
        int i10 = i9 - 2;
        int i11 = bhl.f21374a;
        if (i9 == 0) {
            throw null;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }
}
