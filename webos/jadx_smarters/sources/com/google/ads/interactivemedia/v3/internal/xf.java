package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class xf implements wy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dc f25043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dv f25045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xe f25046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f25047f;

    public xf(cy cyVar, Uri uri, int i9, xe xeVar) {
        db dbVar = new db();
        dbVar.i(uri);
        dbVar.b(1);
        dc dcVarA = dbVar.a();
        this.f25045d = new dv(cyVar);
        this.f25043b = dcVarA;
        this.f25044c = i9;
        this.f25046e = xeVar;
        this.f25042a = sw.a();
    }

    public final long a() {
        return this.f25045d.g();
    }

    public final Uri c() {
        return this.f25045d.h();
    }

    public final Object d() {
        return this.f25047f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void e() throws IOException {
        this.f25045d.j();
        da daVar = new da(this.f25045d, this.f25043b);
        try {
            daVar.a();
            Uri uriC = this.f25045d.c();
            af.s(uriC);
            this.f25047f = this.f25046e.a(uriC, daVar);
        } finally {
            cq.S(daVar);
        }
    }

    public final Map f() {
        return this.f25045d.i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wy
    public final void r() {
    }
}
