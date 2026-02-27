package com.google.android.exoplayer2.ext.vp9;

import O2.AbstractC0928w0;
import d4.AbstractC1706x;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class VpxLibrary {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1706x f25375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f25376b;

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
        AbstractC0928w0.a("goog.exo.vpx");
        f25375a = new a("vpx", "vpxV2JNI");
        f25376b = 1;
    }

    public static String a() {
        if (b()) {
            return vpxGetVersion();
        }
        return null;
    }

    public static boolean b() {
        return f25375a.a();
    }

    public static boolean c(int i9) {
        if (i9 != 0) {
            return i9 != 1 && i9 == f25376b;
        }
        return true;
    }

    private static native String vpxGetVersion();

    public static native boolean vpxIsSecureDecodeSupported();
}
