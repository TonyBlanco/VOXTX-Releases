package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ahe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ahe f19760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f19761b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private agy f19762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private agz f19763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final afe f19764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.ads.interactivemedia.v3.impl.data.i f19765f;

    public ahe(com.google.ads.interactivemedia.v3.impl.data.i iVar, afe afeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f19765f = iVar;
        this.f19764e = afeVar;
    }

    public static ahe b() {
        if (f19760a == null) {
            f19760a = new ahe(new com.google.ads.interactivemedia.v3.impl.data.i(), new afe(), null, null, null);
        }
        return f19760a;
    }

    public final float a() {
        return this.f19761b;
    }

    public final void c(Context context) {
        this.f19762c = new agy(new Handler(), context, new afe(), this, null, null);
    }

    public final void d(float f9) {
        this.f19761b = f9;
        if (this.f19763d == null) {
            this.f19763d = agz.a();
        }
        Iterator it = this.f19763d.b().iterator();
        while (it.hasNext()) {
            ((agt) it.next()).h().h(f9);
        }
    }

    public final void e() {
        aha.a().d(this);
        aha.a().b();
        aht.c().h();
        this.f19762c.a();
    }

    public final void f() {
        aht.c().i();
        aha.a().c();
        this.f19762c.b();
    }
}
