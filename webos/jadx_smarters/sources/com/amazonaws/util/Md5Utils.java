package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes.dex */
public class Md5Utils {
    private static final int FOURTEEN = 14;
    private static final int SIXTEEN_K = 16384;

    public static byte[] computeMD5Hash(File file) throws IOException {
        return computeMD5Hash(new FileInputStream(file));
    }

    public static byte[] computeMD5Hash(InputStream inputStream) throws IOException {
        MessageDigest messageDigest;
        byte[] bArr;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            try {
                messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
                bArr = new byte[16384];
            } catch (NoSuchAlgorithmException e9) {
                throw new IllegalStateException(e9);
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Exception e10) {
                LogFactory.getLog((Class<?>) Md5Utils.class).debug("Unable to close input stream of hash candidate: " + e10);
            }
            throw th;
        }
        while (true) {
            int i9 = bufferedInputStream.read(bArr, 0, 16384);
            if (i9 == -1) {
                break;
            }
            messageDigest.update(bArr, 0, i9);
            bufferedInputStream.close();
            throw th;
        }
        byte[] bArrDigest = messageDigest.digest();
        try {
            bufferedInputStream.close();
        } catch (Exception e11) {
            LogFactory.getLog((Class<?>) Md5Utils.class).debug("Unable to close input stream of hash candidate: " + e11);
        }
        return bArrDigest;
    }

    public static byte[] computeMD5Hash(byte[] bArr) {
        try {
            return MessageDigest.getInstance(MessageDigestAlgorithms.MD5).digest(bArr);
        } catch (NoSuchAlgorithmException e9) {
            throw new IllegalStateException(e9);
        }
    }

    public static String md5AsBase64(File file) throws IOException {
        return Base64.encodeAsString(computeMD5Hash(file));
    }

    public static String md5AsBase64(InputStream inputStream) throws IOException {
        return Base64.encodeAsString(computeMD5Hash(inputStream));
    }

    public static String md5AsBase64(byte[] bArr) {
        return Base64.encodeAsString(computeMD5Hash(bArr));
    }
}
