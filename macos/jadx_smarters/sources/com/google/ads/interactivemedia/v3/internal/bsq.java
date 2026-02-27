package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bsq implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bst f22228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22229b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Iterator f22231d;

    private final Iterator a() {
        if (this.f22231d == null) {
            this.f22231d = this.f22228a.f22235c.entrySet().iterator();
        }
        return this.f22231d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22229b + 1 >= this.f22228a.f22234b.size()) {
            return !this.f22228a.f22235c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f22230c = true;
        int i9 = this.f22229b + 1;
        this.f22229b = i9;
        return (Map.Entry) (i9 < this.f22228a.f22234b.size() ? this.f22228a.f22234b.get(this.f22229b) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f22230c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f22230c = false;
        this.f22228a.o();
        if (this.f22229b >= this.f22228a.f22234b.size()) {
            a().remove();
            return;
        }
        bst bstVar = this.f22228a;
        int i9 = this.f22229b;
        this.f22229b = i9 - 1;
        bstVar.m(i9);
    }
}
