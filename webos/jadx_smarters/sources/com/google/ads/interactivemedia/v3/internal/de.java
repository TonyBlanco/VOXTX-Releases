package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class de implements cy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f22697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cy f22698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private cy f22699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private cy f22700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private cy f22701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private cy f22702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private cy f22703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private cy f22704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private cy f22705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private cy f22706k;

    public de(Context context, cy cyVar) {
        this.f22696a = context.getApplicationContext();
        af.s(cyVar);
        this.f22698c = cyVar;
        this.f22697b = new ArrayList();
    }

    private final cy g() {
        if (this.f22700e == null) {
            cs csVar = new cs(this.f22696a);
            this.f22700e = csVar;
            h(csVar);
        }
        return this.f22700e;
    }

    private final void h(cy cyVar) {
        for (int i9 = 0; i9 < this.f22697b.size(); i9++) {
            cyVar.f((dw) this.f22697b.get(i9));
        }
    }

    private static final void i(cy cyVar, dw dwVar) {
        if (cyVar != null) {
            cyVar.f(dwVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.InterfaceC1310k
    public final int a(byte[] bArr, int i9, int i10) throws IOException {
        cy cyVar = this.f22706k;
        af.s(cyVar);
        return cyVar.a(bArr, i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    @Override // com.google.ads.interactivemedia.v3.internal.cy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.google.ads.interactivemedia.v3.internal.dc r3) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.de.b(com.google.ads.interactivemedia.v3.internal.dc):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Uri c() {
        cy cyVar = this.f22706k;
        if (cyVar == null) {
            return null;
        }
        return cyVar.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void d() throws IOException {
        cy cyVar = this.f22706k;
        if (cyVar != null) {
            try {
                cyVar.d();
            } finally {
                this.f22706k = null;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Map e() {
        cy cyVar = this.f22706k;
        return cyVar == null ? Collections.emptyMap() : cyVar.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void f(dw dwVar) {
        af.s(dwVar);
        this.f22698c.f(dwVar);
        this.f22697b.add(dwVar);
        i(this.f22699d, dwVar);
        i(this.f22700e, dwVar);
        i(this.f22701f, dwVar);
        i(this.f22702g, dwVar);
        i(this.f22703h, dwVar);
        i(this.f22704i, dwVar);
        i(this.f22705j, dwVar);
    }
}
