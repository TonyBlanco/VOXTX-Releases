package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class avp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f20819c;

    public avp(Object obj, Object obj2, Object obj3) {
        this.f20817a = obj;
        this.f20818b = obj2;
        this.f20819c = obj3;
    }

    public final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f20817a + "=" + this.f20818b + " and " + this.f20817a + "=" + this.f20819c);
    }
}
