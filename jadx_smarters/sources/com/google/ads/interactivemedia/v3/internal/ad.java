package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f19027a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa f19029c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f19031e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final avo f19033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f19034h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19028b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1339u f19030d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19032f = null;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ad(Uri uri, aa aaVar, List list, avo avoVar) {
        this.f19027a = uri;
        this.f19029c = aaVar;
        this.f19031e = list;
        this.f19033g = avoVar;
        avk avkVarJ = avo.j();
        if (avoVar.size() > 0) {
            throw null;
        }
        avkVarJ.f();
        this.f19034h = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return this.f19027a.equals(adVar.f19027a) && cq.V(null, null) && cq.V(this.f19029c, adVar.f19029c) && cq.V(null, null) && this.f19031e.equals(adVar.f19031e) && cq.V(null, null) && this.f19033g.equals(adVar.f19033g) && cq.V(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.f19027a.hashCode() * 961;
        aa aaVar = this.f19029c;
        return (((((iHashCode + (aaVar == null ? 0 : aaVar.hashCode())) * 961) + this.f19031e.hashCode()) * 961) + this.f19033g.hashCode()) * 31;
    }
}
