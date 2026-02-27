package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class axd extends avo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient Object[] f20870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f20871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f20872c;

    public axd(Object[] objArr, int i9, int i10) {
        this.f20870a = objArr;
        this.f20871b = i9;
        this.f20872c = i10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        atp.j(i9, this.f20872c);
        Object obj = this.f20870a[i9 + i9 + this.f20871b];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20872c;
    }
}
