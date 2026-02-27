package com.google.android.exoplayer2.ext.flac;

import O2.AbstractC0928w0;
import d4.AbstractC1706x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1706x f25360a;

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
        AbstractC0928w0.a("goog.exo.flac");
        f25360a = new a("flacJNI");
    }

    public static boolean isAvailable() {
        return f25360a.a();
    }
}
