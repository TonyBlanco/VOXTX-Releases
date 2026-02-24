package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzacj {
    public static String zza(zzack zzackVar, String str) {
        try {
            String str2 = new String(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(str.getBytes()));
            int length = str2.length();
            int i9 = 0;
            while (i9 < length) {
                if (zzk.zza(str2.charAt(i9))) {
                    char[] charArray = str2.toCharArray();
                    while (i9 < length) {
                        char c9 = charArray[i9];
                        if (zzk.zza(c9)) {
                            charArray[i9] = (char) (c9 ^ TokenParser.SP);
                        }
                        i9++;
                    }
                    return String.valueOf(charArray);
                }
                i9++;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            zzack.zza.c("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }

    public static void zzb(zzack zzackVar, String str) {
        zzackVar.zza(str, null);
    }
}
