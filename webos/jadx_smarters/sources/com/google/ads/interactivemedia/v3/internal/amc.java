package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class amc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f20183a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static MessageDigest f20185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f20186d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f20187e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final CountDownLatch f20184b = new CountDownLatch(1);

    public static String a(agc agcVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArrH;
        bqn bqnVarAW;
        byte[] bArrAv = agcVar.av();
        if (((Boolean) aqo.f20546u.f()).booleanValue()) {
            Vector vectorF = f(bArrAv);
            if (vectorF == null || vectorF.size() == 0) {
                bArrH = h(g(afx.f19545u).av(), str, true);
                return com.google.ads.interactivemedia.v3.impl.data.aq.a(bArrH, true);
            }
            agl aglVarA = agm.a();
            int size = vectorF.size();
            for (int i9 = 0; i9 < size; i9++) {
                aglVarA.a(bpb.t(h((byte[]) vectorF.get(i9), str, false)));
            }
            aglVarA.b(bpb.t(d(bArrAv)));
            bqnVarAW = aglVarA.aY();
        } else {
            if (any.f20386a == null) {
                throw new GeneralSecurityException();
            }
            byte[] bArrA = any.f20386a.a(bArrAv, str != null ? str.getBytes() : new byte[0]);
            agl aglVarA2 = agm.a();
            aglVarA2.a(bpb.t(bArrA));
            aglVarA2.c(agg.f19664c);
            bqnVarAW = aglVarA2.aY();
        }
        bArrH = ((agm) bqnVarAW).av();
        return com.google.ads.interactivemedia.v3.impl.data.aq.a(bArrH, true);
    }

    public static void c() {
        synchronized (f20187e) {
            try {
                if (!f20183a) {
                    f20183a = true;
                    new Thread(new amb(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] d(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f20186d) {
            try {
                c();
                MessageDigest messageDigest2 = null;
                try {
                    if (f20184b.await(2L, TimeUnit.SECONDS) && (messageDigest = f20185c) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f20185c.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    public static byte[] e(String str, String str2) {
        agl aglVarD = age.d();
        try {
            aglVarD.j(bpb.t(str.length() < 3 ? str.getBytes("ISO-8859-1") : com.google.ads.interactivemedia.v3.impl.data.aq.b(str, true)));
            aglVarD.i(bpb.t(str2.length() < 3 ? str2.getBytes("ISO-8859-1") : com.google.ads.interactivemedia.v3.impl.data.aq.b(str2, true)));
            return ((age) aglVarD.aY()).av();
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    public static Vector f(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i9 = (length + 254) / 255;
        Vector vector = new Vector();
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = i10 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i11 > 255) {
                    length2 = i11 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i11, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static agc g(int i9) {
        agl aglVarAs = agc.as();
        aglVarAs.am(afx.a(i9));
        return (agc) aglVarAs.aY();
    }

    private static byte[] h(byte[] bArr, String str, boolean z9) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ByteBuffer byteBufferPut;
        int i9 = true != z9 ? 255 : 239;
        if (bArr.length > i9) {
            bArr = g(afx.f19545u).av();
        }
        int length = bArr.length;
        if (length < i9) {
            byte[] bArr2 = new byte[i9 - length];
            new SecureRandom().nextBytes(bArr2);
            byteBufferPut = ByteBuffer.allocate(i9 + 1).put((byte) length).put(bArr).put(bArr2);
        } else {
            byteBufferPut = ByteBuffer.allocate(i9 + 1).put((byte) length).put(bArr);
        }
        byte[] bArrArray = byteBufferPut.array();
        if (z9) {
            bArrArray = ByteBuffer.allocate(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH).put(d(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
        amd[] amdVarArr = new amq().cN;
        int length2 = amdVarArr.length;
        for (int i10 = 0; i10 < 12; i10++) {
            amdVarArr[i10].a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new bol(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }
}
