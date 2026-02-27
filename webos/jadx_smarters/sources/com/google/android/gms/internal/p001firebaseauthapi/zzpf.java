package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpf {
    public static final Charset zza = Charset.forName("UTF-8");

    public static int zza() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i9 = 0;
        while (i9 == 0) {
            secureRandom.nextBytes(bArr);
            i9 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i9;
    }

    public static final zzxt zza(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i9 = 0; i9 < str.length(); i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i9] = (byte) cCharAt;
        }
        return zzxt.zza(bArr);
    }

    public static boolean zza(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i9 = 0; i9 < bArr.length; i9++) {
            if (bArr2[i9] != bArr[i9]) {
                return false;
            }
        }
        return true;
    }

    public static final zzxt zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i9 = 0; i9 < str.length(); i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new zzpd("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i9] = (byte) cCharAt;
        }
        return zzxt.zza(bArr);
    }

    public static Integer zzb() {
        String property = System.getProperty("java.vendor");
        if (property == "The Android Project" || (property != null && property.equals("The Android Project"))) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }
}
