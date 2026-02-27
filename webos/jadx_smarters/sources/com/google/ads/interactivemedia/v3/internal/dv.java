package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dv implements cy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cy f22747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f22748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f22749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f22750d;

    public dv(cy cyVar) {
        af.s(cyVar);
        this.f22747a = cyVar;
        this.f22749c = Uri.EMPTY;
        this.f22750d = Collections.emptyMap();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.InterfaceC1310k
    public final int a(byte[] bArr, int i9, int i10) throws IOException {
        int iA = this.f22747a.a(bArr, i9, i10);
        if (iA != -1) {
            this.f22748b += (long) iA;
        }
        return iA;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final long b(dc dcVar) throws IOException {
        this.f22749c = dcVar.f22688a;
        this.f22750d = Collections.emptyMap();
        long jB = this.f22747a.b(dcVar);
        Uri uriC = c();
        af.s(uriC);
        this.f22749c = uriC;
        this.f22750d = e();
        return jB;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Uri c() {
        return this.f22747a.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void d() throws IOException {
        this.f22747a.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Map e() {
        return this.f22747a.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void f(dw dwVar) {
        af.s(dwVar);
        this.f22747a.f(dwVar);
    }

    public final long g() {
        return this.f22748b;
    }

    public final Uri h() {
        return this.f22749c;
    }

    public final Map i() {
        return this.f22750d;
    }

    public final void j() {
        this.f22748b = 0L;
    }
}
