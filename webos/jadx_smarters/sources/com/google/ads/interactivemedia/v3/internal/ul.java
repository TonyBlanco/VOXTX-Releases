package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
final class ul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f24746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bp f24747c;

    public ul() {
        uk ukVar = uk.f24742a;
        throw null;
    }

    public ul(bp bpVar) {
        this.f24746b = new SparseArray();
        this.f24747c = bpVar;
        this.f24745a = -1;
    }

    public final Object a(int i9) {
        if (this.f24745a == -1) {
            this.f24745a = 0;
        }
        while (true) {
            int i10 = this.f24745a;
            if (i10 <= 0 || i9 >= this.f24746b.keyAt(i10)) {
                break;
            }
            this.f24745a--;
        }
        while (this.f24745a < this.f24746b.size() - 1 && i9 >= this.f24746b.keyAt(this.f24745a + 1)) {
            this.f24745a++;
        }
        return this.f24746b.valueAt(this.f24745a);
    }

    public final Object b() {
        return this.f24746b.valueAt(r0.size() - 1);
    }

    public final void c(int i9, Object obj) {
        if (this.f24745a == -1) {
            af.w(this.f24746b.size() == 0);
            this.f24745a = 0;
        }
        if (this.f24746b.size() > 0) {
            int iKeyAt = this.f24746b.keyAt(r0.size() - 1);
            af.u(i9 >= iKeyAt);
            if (iKeyAt == i9) {
                this.f24747c.a(this.f24746b.valueAt(r1.size() - 1));
            }
        }
        this.f24746b.append(i9, obj);
    }

    public final void d() {
        for (int i9 = 0; i9 < this.f24746b.size(); i9++) {
            this.f24747c.a(this.f24746b.valueAt(i9));
        }
        this.f24745a = -1;
        this.f24746b.clear();
    }

    public final void e(int i9) {
        for (int size = this.f24746b.size() - 1; size >= 0 && i9 < this.f24746b.keyAt(size); size--) {
            this.f24747c.a(this.f24746b.valueAt(size));
            this.f24746b.removeAt(size);
        }
        this.f24745a = this.f24746b.size() > 0 ? Math.min(this.f24745a, this.f24746b.size() - 1) : -1;
    }

    public final void f(int i9) {
        int i10 = 0;
        while (i10 < this.f24746b.size() - 1) {
            int i11 = i10 + 1;
            if (i9 < this.f24746b.keyAt(i11)) {
                return;
            }
            this.f24747c.a(this.f24746b.valueAt(i10));
            this.f24746b.removeAt(i10);
            int i12 = this.f24745a;
            if (i12 > 0) {
                this.f24745a = i12 - 1;
            }
            i10 = i11;
        }
    }

    public final boolean g() {
        return this.f24746b.size() == 0;
    }
}
