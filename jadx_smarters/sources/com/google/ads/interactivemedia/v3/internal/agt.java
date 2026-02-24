package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class agt extends agq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f19708a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final agr f19709b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ahi f19711d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private aia f19715h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f19710c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19712e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19713f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19714g = UUID.randomUUID().toString();

    public agt(ly lyVar, agr agrVar, byte[] bArr, byte[] bArr2) {
        this.f19709b = agrVar;
        l(null);
        this.f19711d = (agrVar.b() == ags.HTML || agrVar.b() == ags.JAVASCRIPT) ? new ahj(agrVar.a()) : new ahl(agrVar.f());
        this.f19711d.j();
        agz.a().d(this);
        ahd.a().d(this.f19711d.a(), lyVar.i());
    }

    private final void l(View view) {
        this.f19715h = new aia(view);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.agq
    public final void a(View view, agv agvVar, String str) {
        ly lyVar;
        if (this.f19713f) {
            return;
        }
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f19708a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = this.f19710c.iterator();
        while (true) {
            if (!it.hasNext()) {
                lyVar = null;
                break;
            } else {
                lyVar = (ly) it.next();
                if (lyVar.j().get() == view) {
                    break;
                }
            }
        }
        if (lyVar == null) {
            this.f19710c.add(new ly(view, agvVar, str));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.agq
    public final void b() {
        if (this.f19713f) {
            return;
        }
        this.f19715h.clear();
        d();
        this.f19713f = true;
        ahd.a().c(this.f19711d.a());
        agz.a().e(this);
        this.f19711d.c();
        this.f19711d = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.agq
    public final void c(View view) {
        if (this.f19713f) {
            return;
        }
        com.google.ads.interactivemedia.v3.impl.data.i.e(view, "AdView is null");
        if (g() == view) {
            return;
        }
        l(view);
        this.f19711d.b();
        Collection<agt> collectionC = agz.a().c();
        if (collectionC == null || collectionC.isEmpty()) {
            return;
        }
        for (agt agtVar : collectionC) {
            if (agtVar != this && agtVar.g() == view) {
                agtVar.f19715h.clear();
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.agq
    public final void d() {
        if (this.f19713f) {
            return;
        }
        this.f19710c.clear();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.agq
    public final void e() {
        if (this.f19712e) {
            return;
        }
        this.f19712e = true;
        agz.a().f(this);
        this.f19711d.h(ahe.b().a());
        this.f19711d.f(this, this.f19709b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View g() {
        return (View) this.f19715h.get();
    }

    public final ahi h() {
        return this.f19711d;
    }

    public final String i() {
        return this.f19714g;
    }

    public final List j() {
        return this.f19710c;
    }

    public final boolean k() {
        return this.f19712e && !this.f19713f;
    }
}
