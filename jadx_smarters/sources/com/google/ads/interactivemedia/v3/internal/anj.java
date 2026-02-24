package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class anj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Cipher f20330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f20331b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f20332c = new Object();

    private static final Cipher c() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher;
        synchronized (f20332c) {
            try {
                if (f20330a == null) {
                    f20330a = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
                }
                cipher = f20330a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) throws ani {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            synchronized (f20331b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return com.google.ads.interactivemedia.v3.impl.data.aq.a(bArr3, false);
        } catch (InvalidKeyException e9) {
            throw new ani(e9);
        } catch (NoSuchAlgorithmException e10) {
            throw new ani(e10);
        } catch (BadPaddingException e11) {
            throw new ani(e11);
        } catch (IllegalBlockSizeException e12) {
            throw new ani(e12);
        } catch (NoSuchPaddingException e13) {
            throw new ani(e13);
        }
    }

    public final byte[] b(byte[] bArr, String str) throws ani {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrB = com.google.ads.interactivemedia.v3.impl.data.aq.b(str, false);
            int length2 = bArrB.length;
            if (length2 <= 16) {
                throw new ani();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrB);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            synchronized (f20331b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e9) {
            throw new ani(e9);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new ani(e10);
        } catch (InvalidKeyException e11) {
            throw new ani(e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new ani(e12);
        } catch (BadPaddingException e13) {
            throw new ani(e13);
        } catch (IllegalBlockSizeException e14) {
            throw new ani(e14);
        } catch (NoSuchPaddingException e15) {
            throw new ani(e15);
        }
    }
}
