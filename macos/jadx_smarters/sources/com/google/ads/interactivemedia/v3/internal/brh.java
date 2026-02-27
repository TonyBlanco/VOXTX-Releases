package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class brh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final brh f22153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final brh f22154b;

    static {
        byte[] bArr = null;
        f22153a = new brf(bArr);
        f22154b = new brg(bArr);
    }

    public static brh e() {
        return f22153a;
    }

    public static brh f() {
        return f22154b;
    }

    public abstract List b(Object obj, long j9);

    public abstract void c(Object obj, long j9);

    public abstract void d(Object obj, Object obj2, long j9);
}
