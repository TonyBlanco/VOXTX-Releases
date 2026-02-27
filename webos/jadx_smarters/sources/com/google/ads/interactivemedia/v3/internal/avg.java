package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class avg extends avh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f20806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f20807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f20808c;

    public avg() {
        axo.K(4, "initialCapacity");
        this.f20806a = new Object[4];
        this.f20807b = 0;
    }

    private final void f(int i9) {
        Object[] objArr = this.f20806a;
        int length = objArr.length;
        if (length < i9) {
            this.f20806a = Arrays.copyOf(objArr, avh.e(length, i9));
        } else if (!this.f20808c) {
            return;
        } else {
            this.f20806a = (Object[]) objArr.clone();
        }
        this.f20808c = false;
    }

    public final void a(Object obj) {
        atp.k(obj);
        f(this.f20807b + 1);
        Object[] objArr = this.f20806a;
        int i9 = this.f20807b;
        this.f20807b = i9 + 1;
        objArr[i9] = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avh
    public /* bridge */ /* synthetic */ void b(Object obj) {
        throw null;
    }

    public final void c(Object... objArr) {
        int length = objArr.length;
        axo.l(objArr, length);
        f(this.f20807b + length);
        System.arraycopy(objArr, 0, this.f20806a, this.f20807b, length);
        this.f20807b += length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            f(this.f20807b + iterable.size());
            if (iterable instanceof avi) {
                this.f20807b = ((avi) iterable).a(this.f20806a, this.f20807b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
