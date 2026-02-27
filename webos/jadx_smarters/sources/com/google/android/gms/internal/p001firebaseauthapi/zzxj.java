package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxj {
    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            int i9 = b9 & 255;
            sb.append("0123456789abcdef".charAt(i9 / 16));
            sb.append("0123456789abcdef".charAt(i9 % 16));
        }
        return sb.toString();
    }
}
