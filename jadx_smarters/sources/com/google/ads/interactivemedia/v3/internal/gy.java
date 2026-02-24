package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class gy implements gu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta f23113a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23117e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f23115c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23114b = new Object();

    public gy(tg tgVar, boolean z9) {
        this.f23113a = new ta(tgVar, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gu
    public final be a() {
        return this.f23113a.k();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gu
    public final Object b() {
        return this.f23114b;
    }

    public final void c(int i9) {
        this.f23116d = i9;
        this.f23117e = false;
        this.f23115c.clear();
    }
}
