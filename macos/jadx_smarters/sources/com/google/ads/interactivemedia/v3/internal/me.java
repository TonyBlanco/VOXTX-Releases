package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mb f23776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1333s f23777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final avo f23778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f23780e;

    public /* synthetic */ me(C1333s c1333s, List list, mk mkVar, List list2) {
        af.u(!list.isEmpty());
        this.f23777b = c1333s;
        this.f23778c = avo.m(list);
        this.f23780e = Collections.unmodifiableList(list2);
        this.f23776a = mkVar.i(this);
        this.f23779d = cq.w(mkVar.f23797j, 1000000L, mkVar.f23796i);
    }

    public abstract li k();

    public abstract mb l();

    public abstract void m();

    public final mb n() {
        return this.f23776a;
    }
}
