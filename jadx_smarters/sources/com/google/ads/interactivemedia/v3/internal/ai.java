package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ad f19815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ac f19816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final al f19817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1345x f19818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ag f19819f;

    static {
        new C1341v().a();
    }

    public /* synthetic */ ai(String str, C1347y c1347y, ae aeVar, ac acVar, al alVar, ag agVar) {
        this.f19814a = str;
        this.f19815b = aeVar;
        this.f19816c = acVar;
        this.f19817d = alVar;
        this.f19818e = c1347y;
        this.f19819f = agVar;
    }

    public static ai a(Uri uri) {
        C1341v c1341v = new C1341v();
        c1341v.c(uri);
        return c1341v.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return cq.V(this.f19814a, aiVar.f19814a) && this.f19818e.equals(aiVar.f19818e) && cq.V(this.f19815b, aiVar.f19815b) && cq.V(this.f19816c, aiVar.f19816c) && cq.V(this.f19817d, aiVar.f19817d) && cq.V(this.f19819f, aiVar.f19819f);
    }

    public final int hashCode() {
        int iHashCode = this.f19814a.hashCode() * 31;
        ad adVar = this.f19815b;
        return (((((((iHashCode + (adVar != null ? adVar.hashCode() : 0)) * 31) + this.f19816c.hashCode()) * 31) + this.f19818e.hashCode()) * 31) + this.f19817d.hashCode()) * 31;
    }
}
