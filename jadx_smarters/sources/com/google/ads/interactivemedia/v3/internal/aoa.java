package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class aoa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f20400a = "0123456789abcdef".toCharArray();

    public static long a(double d9, DisplayMetrics displayMetrics) {
        return Math.round(d9 / ((double) displayMetrics.density));
    }

    public static Activity b(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        for (int i9 = 0; (context instanceof ContextWrapper) && i9 < 10; i9++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static String c(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i9 = 0; i9 < bArr.length; i9++) {
            byte b9 = bArr[i9];
            int i10 = i9 + i9;
            char[] cArr2 = f20400a;
            cArr[i10] = cArr2[(b9 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b9 & 15];
        }
        return new String(cArr);
    }

    public static String d(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID uuidFromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
        byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
        return com.google.ads.interactivemedia.v3.impl.data.aq.a(bArr, true);
    }

    public static String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean f() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean g(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean h(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static byte[] i(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i9 = 0; i9 < length; i9 += 2) {
            bArr[i9 / 2] = (byte) ((Character.digit(str.charAt(i9), 16) << 4) + Character.digit(str.charAt(i9 + 1), 16));
        }
        return bArr;
    }
}
