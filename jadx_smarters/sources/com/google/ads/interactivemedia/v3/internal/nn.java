package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te f23896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f23897c;

    public nn() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private nn(CopyOnWriteArrayList copyOnWriteArrayList, int i9, te teVar) {
        this.f23897c = copyOnWriteArrayList;
        this.f23895a = i9;
        this.f23896b = teVar;
    }

    public final nn a(int i9, te teVar) {
        return new nn(this.f23897c, i9, teVar);
    }

    public final void b(Handler handler, no noVar) {
        af.s(handler);
        af.s(noVar);
        this.f23897c.add(new aeq(handler, noVar));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.ads.interactivemedia.v3.internal.no, java.lang.Object] */
    public final void c() {
        for (aeq aeqVar : this.f23897c) {
            ?? r22 = aeqVar.f19396a;
            cq.at((Handler) aeqVar.f19397b, new jc(this, (no) r22, 9));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.ads.interactivemedia.v3.internal.no, java.lang.Object] */
    public final void d() {
        for (aeq aeqVar : this.f23897c) {
            ?? r22 = aeqVar.f19396a;
            cq.at((Handler) aeqVar.f19397b, new jc(this, (no) r22, 7));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.ads.interactivemedia.v3.internal.no, java.lang.Object] */
    public final void e(int i9) {
        for (aeq aeqVar : this.f23897c) {
            ?? r22 = aeqVar.f19396a;
            cq.at((Handler) aeqVar.f19397b, new bw(this, (no) r22, i9, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.ads.interactivemedia.v3.internal.no, java.lang.Object] */
    public final void f(Exception exc) {
        for (aeq aeqVar : this.f23897c) {
            ?? r22 = aeqVar.f19396a;
            cq.at((Handler) aeqVar.f19397b, new jg(this, (no) r22, exc, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.ads.interactivemedia.v3.internal.no, java.lang.Object] */
    public final void g() {
        for (aeq aeqVar : this.f23897c) {
            ?? r22 = aeqVar.f19396a;
            cq.at((Handler) aeqVar.f19397b, new jc(this, (no) r22, 8));
        }
    }

    public final void h(no noVar) {
        for (aeq aeqVar : this.f23897c) {
            if (aeqVar.f19396a == noVar) {
                this.f23897c.remove(aeqVar);
            }
        }
    }
}
