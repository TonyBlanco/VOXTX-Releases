package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes3.dex */
public final class vt extends bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray f24906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseBooleanArray f24907h;

    @Deprecated
    public vt() {
        this.f24906g = new SparseArray();
        this.f24907h = new SparseBooleanArray();
        C();
    }

    public vt(Context context) {
        q(context);
        s(context);
        this.f24906g = new SparseArray();
        this.f24907h = new SparseBooleanArray();
        C();
    }

    private final void C() {
        this.f24900a = true;
        this.f24901b = true;
        this.f24902c = true;
        this.f24903d = true;
        this.f24904e = true;
        this.f24905f = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bh
    public final /* synthetic */ void q(Context context) {
        super.q(context);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bh
    public final /* bridge */ /* synthetic */ bh r(int i9, int i10) {
        super.r(i9, i10);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bh
    public final /* bridge */ /* synthetic */ void s(Context context) {
        super.s(context);
    }

    public final vu v() {
        return new vu(this);
    }
}
