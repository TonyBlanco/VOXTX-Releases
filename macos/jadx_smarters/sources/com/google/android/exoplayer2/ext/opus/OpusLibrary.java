package com.google.android.exoplayer2.ext.opus;

import O2.AbstractC0928w0;
import d4.AbstractC1706x;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class OpusLibrary {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1706x f25369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f25370b;

    public class a extends AbstractC1706x {
        public a(String... strArr) {
            super(strArr);
        }

        @Override // d4.AbstractC1706x
        public void b(String str) {
            System.loadLibrary(str);
        }
    }

    static {
        AbstractC0928w0.a("goog.exo.opus");
        f25369a = new a("opusV2JNI");
        f25370b = 1;
    }

    public static String a() {
        if (b()) {
            return opusGetVersion();
        }
        return null;
    }

    public static boolean b() {
        return f25369a.a();
    }

    public static boolean c(int i9) {
        if (i9 != 0) {
            return i9 != 1 && i9 == f25370b;
        }
        return true;
    }

    public static native String opusGetVersion();

    public static native boolean opusIsSecureDecodeSupported();
}
