package kotlinx.coroutines.internal;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D {

    @NotNull
    private volatile /* synthetic */ int _size = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E[] f43737a;

    public final void a(E e9) {
        e9.a(this);
        E[] eArrF = f();
        int iC = c();
        j(iC + 1);
        eArrF[iC] = e9;
        e9.i(iC);
        l(iC);
    }

    public final E b() {
        E[] eArr = this.f43737a;
        if (eArr != null) {
            return eArr[0];
        }
        return null;
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final E e() {
        E eB;
        synchronized (this) {
            eB = b();
        }
        return eB;
    }

    public final E[] f() {
        E[] eArr = this.f43737a;
        if (eArr == null) {
            E[] eArr2 = new E[4];
            this.f43737a = eArr2;
            return eArr2;
        }
        if (c() < eArr.length) {
            return eArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(eArr, c() * 2);
        kotlin.jvm.internal.l.d(objArrCopyOf, "copyOf(this, newSize)");
        E[] eArr3 = (E[]) objArrCopyOf;
        this.f43737a = eArr3;
        return eArr3;
    }

    public final boolean g(E e9) {
        boolean z9;
        synchronized (this) {
            if (e9.h() == null) {
                z9 = false;
            } else {
                h(e9.getIndex());
                z9 = true;
            }
        }
        return z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.E h(int r6) {
        /*
            r5 = this;
            kotlinx.coroutines.internal.E[] r0 = r5.f43737a
            kotlin.jvm.internal.l.b(r0)
            int r1 = r5.c()
            r2 = -1
            int r1 = r1 + r2
            r5.j(r1)
            int r1 = r5.c()
            if (r6 >= r1) goto L3d
            int r1 = r5.c()
            r5.m(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.l.b(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.l.b(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.m(r6, r1)
            r5.l(r1)
            goto L3d
        L3a:
            r5.k(r6)
        L3d:
            int r6 = r5.c()
            r6 = r0[r6]
            kotlin.jvm.internal.l.b(r6)
            r1 = 0
            r6.a(r1)
            r6.i(r2)
            int r2 = r5.c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.D.h(int):kotlinx.coroutines.internal.E");
    }

    public final E i() {
        E eH;
        synchronized (this) {
            eH = c() > 0 ? h(0) : null;
        }
        return eH;
    }

    public final void j(int i9) {
        this._size = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            return
        Lb:
            kotlinx.coroutines.internal.E[] r2 = r5.f43737a
            kotlin.jvm.internal.l.b(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.l.b(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.l.b(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.l.b(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.l.b(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.m(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.D.k(int):void");
    }

    public final void l(int i9) {
        while (i9 > 0) {
            E[] eArr = this.f43737a;
            kotlin.jvm.internal.l.b(eArr);
            int i10 = (i9 - 1) / 2;
            E e9 = eArr[i10];
            kotlin.jvm.internal.l.b(e9);
            E e10 = eArr[i9];
            kotlin.jvm.internal.l.b(e10);
            if (((Comparable) e9).compareTo(e10) <= 0) {
                return;
            }
            m(i9, i10);
            i9 = i10;
        }
    }

    public final void m(int i9, int i10) {
        E[] eArr = this.f43737a;
        kotlin.jvm.internal.l.b(eArr);
        E e9 = eArr[i10];
        kotlin.jvm.internal.l.b(e9);
        E e10 = eArr[i9];
        kotlin.jvm.internal.l.b(e10);
        eArr[i9] = e9;
        eArr[i10] = e10;
        e9.i(i9);
        e10.i(i10);
    }
}
