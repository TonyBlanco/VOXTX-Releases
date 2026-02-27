package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class axf extends avx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final axf f20877a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f20878d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient Object[] f20879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f20880c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f20881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f20882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f20883g;

    static {
        Object[] objArr = new Object[0];
        f20878d = objArr;
        f20877a = new axf(objArr, 0, objArr, 0, 0);
    }

    public axf(Object[] objArr, int i9, Object[] objArr2, int i10, int i11) {
        this.f20879b = objArr;
        this.f20881e = i9;
        this.f20880c = objArr2;
        this.f20882f = i10;
        this.f20883g = i11;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final int a(Object[] objArr, int i9) {
        System.arraycopy(this.f20879b, 0, objArr, i9, this.f20883g);
        return i9 + this.f20883g;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final int b() {
        return this.f20883g;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final int c() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.f20880c;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iF = axo.F(obj);
        while (true) {
            int i9 = iF & this.f20882f;
            Object obj2 = objArr[i9];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iF = i9 + 1;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final axq listIterator() {
        return d().iterator();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final boolean f() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final Object[] g() {
        return this.f20879b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx
    public final boolean h() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f20881e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx
    public final avo i() {
        return avo.l(this.f20879b, this.f20883g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20883g;
    }
}
