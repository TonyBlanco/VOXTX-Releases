package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1341v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f24818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f24819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1343w f24820c = new C1343w();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1349z f24821d = new C1349z(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f24822e = Collections.emptyList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final avo f24823f = avo.o();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ab f24824g = new ab();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ag f24825h = ag.f19559a;

    public final ai a() {
        af.w(true);
        Uri uri = this.f24819b;
        ae aeVar = uri != null ? new ae(uri, null, this.f24822e, this.f24823f) : null;
        String str = this.f24818a;
        if (str == null) {
            str = "";
        }
        return new ai(str, this.f24820c.a(), aeVar, this.f24824g.f(), al.f20083a, this.f24825h);
    }

    public final void b(String str) {
        this.f24818a = str;
    }

    public final void c(Uri uri) {
        this.f24819b = uri;
    }
}
