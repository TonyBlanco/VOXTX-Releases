package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes3.dex */
public final class cd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f22610b = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f22609a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final cc f22611c = cc.f22608a;

    public static void a(String str, String str2) {
        synchronized (f22609a) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        synchronized (f22609a) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        b(str, g(str2, th));
    }

    public static void d(String str, String str2) {
        synchronized (f22609a) {
            Log.i(str, str2);
        }
    }

    public static void e(String str, String str2) {
        synchronized (f22609a) {
            Log.w(str, str2);
        }
    }

    public static void f(String str, String str2, Throwable th) {
        e(str, g(str2, th));
    }

    private static String g(String str, Throwable th) {
        String strReplace;
        synchronized (f22609a) {
            try {
                if (th != null) {
                    Throwable cause = th;
                    while (true) {
                        if (cause == null) {
                            strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    }
                } else {
                    strReplace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + "\n";
    }
}
