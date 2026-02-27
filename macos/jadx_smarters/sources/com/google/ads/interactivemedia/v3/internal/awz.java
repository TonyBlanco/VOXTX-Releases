package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class awz extends avo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final avo f20861a = new awz(new Object[0], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient Object[] f20862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f20863c;

    public awz(Object[] objArr, int i9) {
        this.f20862b = objArr;
        this.f20863c = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avo, com.google.ads.interactivemedia.v3.internal.avi
    public final int a(Object[] objArr, int i9) {
        System.arraycopy(this.f20862b, 0, objArr, i9, this.f20863c);
        return i9 + this.f20863c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final int b() {
        return this.f20863c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final int c() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final boolean f() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final Object[] g() {
        return this.f20862b;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        atp.j(i9, this.f20863c);
        Object obj = this.f20862b[i9];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20863c;
    }
}
