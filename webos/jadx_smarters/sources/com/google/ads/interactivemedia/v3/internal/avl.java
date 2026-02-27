package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class avl extends avo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient avo f20811a;

    public avl(avo avoVar) {
        this.f20811a = avoVar;
    }

    private final int u(int i9) {
        return (size() - 1) - i9;
    }

    private final int v(int i9) {
        return size() - i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avo, com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20811a.contains(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final boolean f() {
        return this.f20811a.f();
    }

    @Override // java.util.List
    public final Object get(int i9) {
        atp.j(i9, size());
        return this.f20811a.get(u(i9));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avo
    public final avo h() {
        return this.f20811a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avo
    /* JADX INFO: renamed from: i */
    public final avo subList(int i9, int i10) {
        atp.h(i9, i10, size());
        return this.f20811a.subList(v(i10), v(i9)).h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avo, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f20811a.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return u(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avo, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f20811a.indexOf(obj);
        if (iIndexOf >= 0) {
            return u(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20811a.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avo, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i9, int i10) {
        return subList(i9, i10);
    }
}
