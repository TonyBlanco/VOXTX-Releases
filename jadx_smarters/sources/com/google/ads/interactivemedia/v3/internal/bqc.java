package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class bqc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bsr f22032a = new bsr(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bsr f22033b;

    static {
        bsr bsrVar = null;
        try {
            bsrVar = (bsr) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f22033b = bsrVar;
    }

    public static bsr a() {
        bsr bsrVar = f22033b;
        if (bsrVar != null) {
            return bsrVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static bsr b() {
        return f22032a;
    }
}
