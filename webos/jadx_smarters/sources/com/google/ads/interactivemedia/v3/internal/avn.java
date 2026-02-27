package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class avn extends avo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient int f20813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient int f20814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ avo f20815c;

    public avn(avo avoVar, int i9, int i10) {
        this.f20815c = avoVar;
        this.f20813a = i9;
        this.f20814b = i10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final int b() {
        return this.f20815c.c() + this.f20813a + this.f20814b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final int c() {
        return this.f20815c.c() + this.f20813a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final boolean f() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final Object[] g() {
        return this.f20815c.g();
    }

    @Override // java.util.List
    public final Object get(int i9) {
        atp.j(i9, this.f20814b);
        return this.f20815c.get(i9 + this.f20813a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avo
    /* JADX INFO: renamed from: i */
    public final avo subList(int i9, int i10) {
        atp.h(i9, i10, this.f20814b);
        avo avoVar = this.f20815c;
        int i11 = this.f20813a;
        return avoVar.subList(i9 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20814b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avo, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i9, int i10) {
        return subList(i9, i10);
    }
}
