package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class bro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bsr f22169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bsr f22170b;

    static {
        bsr bsrVar = null;
        try {
            bsrVar = (bsr) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f22169a = bsrVar;
        f22170b = new bsr();
    }

    public static bsr a() {
        return f22169a;
    }

    public static bsr b() {
        return f22170b;
    }
}
