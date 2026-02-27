package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bjj f21142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f21143b;

    public bel(bjj bjjVar, Class cls) {
        this(bjjVar, cls, null);
    }

    public /* synthetic */ bel(bjj bjjVar, Class cls, byte[] bArr) {
        this.f21142a = bjjVar;
        this.f21143b = cls;
    }

    public bel(byte[] bArr, byte[] bArr2) {
        this.f21142a = bjj.b(bArr);
        this.f21143b = bjj.b(bArr2);
    }

    public static bel a(bek bekVar, bjj bjjVar, Class cls) {
        return new bel(bjjVar, cls);
    }

    public final bjj b() {
        return this.f21142a;
    }

    public final Class c() {
        return (Class) this.f21143b;
    }

    public final byte[] d() {
        return this.f21142a.c();
    }

    public final byte[] e() {
        return ((bjj) this.f21143b).c();
    }
}
