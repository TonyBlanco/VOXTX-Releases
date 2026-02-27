package androidx.recyclerview.widget;

import Q.C;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f16570I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f16571J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int[] f16572K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public View[] f16573L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final SparseIntArray f16574M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final SparseIntArray f16575N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public c f16576O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Rect f16577P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f16578Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i9, int i10) {
            return i9 % i10;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i9) {
            return 1;
        }
    }

    public static class b extends RecyclerView.p {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16579f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f16580g;

        public b(int i9, int i10) {
            super(i9, i10);
            this.f16579f = -1;
            this.f16580g = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16579f = -1;
            this.f16580g = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16579f = -1;
            this.f16580g = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f16579f = -1;
            this.f16580g = 0;
        }

        public int h() {
            return this.f16579f;
        }

        public int k() {
            return this.f16580g;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseIntArray f16581a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseIntArray f16582b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16583c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16584d = false;

        public static int a(SparseIntArray sparseIntArray, int i9) {
            int size = sparseIntArray.size() - 1;
            int i10 = 0;
            while (i10 <= size) {
                int i11 = (i10 + size) >>> 1;
                if (sparseIntArray.keyAt(i11) < i9) {
                    i10 = i11 + 1;
                } else {
                    size = i11 - 1;
                }
            }
            int i12 = i10 - 1;
            if (i12 < 0 || i12 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i12);
        }

        public int b(int i9, int i10) {
            if (!this.f16584d) {
                return d(i9, i10);
            }
            int i11 = this.f16582b.get(i9, -1);
            if (i11 != -1) {
                return i11;
            }
            int iD = d(i9, i10);
            this.f16582b.put(i9, iD);
            return iD;
        }

        public int c(int i9, int i10) {
            if (!this.f16583c) {
                return e(i9, i10);
            }
            int i11 = this.f16581a.get(i9, -1);
            if (i11 != -1) {
                return i11;
            }
            int iE = e(i9, i10);
            this.f16581a.put(i9, iE);
            return iE;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f16584d
                r1 = 0
                if (r0 == 0) goto L25
                android.util.SparseIntArray r0 = r6.f16582b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L25
                android.util.SparseIntArray r2 = r6.f16582b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L28
                int r2 = r2 + 1
            L23:
                r4 = 0
                goto L28
            L25:
                r2 = 0
                r3 = 0
                goto L23
            L28:
                int r0 = r6.f(r7)
            L2c:
                if (r3 >= r7) goto L41
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L39
                int r2 = r2 + 1
                r4 = 0
                goto L3e
            L39:
                if (r4 <= r8) goto L3e
                int r2 = r2 + 1
                r4 = r5
            L3e:
                int r3 = r3 + 1
                goto L2c
            L41:
                int r4 = r4 + r0
                if (r4 <= r8) goto L46
                int r2 = r2 + 1
            L46:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        public abstract int e(int i9, int i10);

        public abstract int f(int i9);

        public void g() {
            this.f16582b.clear();
        }

        public void h() {
            this.f16581a.clear();
        }
    }

    public GridLayoutManager(Context context, int i9) {
        super(context);
        this.f16570I = false;
        this.f16571J = -1;
        this.f16574M = new SparseIntArray();
        this.f16575N = new SparseIntArray();
        this.f16576O = new a();
        this.f16577P = new Rect();
        C3(i9);
    }

    public GridLayoutManager(Context context, int i9, int i10, boolean z9) {
        super(context, i10, z9);
        this.f16570I = false;
        this.f16571J = -1;
        this.f16574M = new SparseIntArray();
        this.f16575N = new SparseIntArray();
        this.f16576O = new a();
        this.f16577P = new Rect();
        C3(i9);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f16570I = false;
        this.f16571J = -1;
        this.f16574M = new SparseIntArray();
        this.f16575N = new SparseIntArray();
        this.f16576O = new a();
        this.f16577P = new Rect();
        C3(RecyclerView.o.C0(context, attributeSet, i9, i10).f16790b);
    }

    public static int[] p3(int[] iArr, int i9, int i10) {
        int i11;
        if (iArr == null || iArr.length != i9 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i9 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i10 / i9;
        int i14 = i10 % i9;
        int i15 = 0;
        for (int i16 = 1; i16 <= i9; i16++) {
            i12 += i14;
            if (i12 <= 0 || i9 - i12 >= i14) {
                i11 = i13;
            } else {
                i11 = i13 + 1;
                i12 -= i9;
            }
            i15 += i11;
            iArr[i16] = i15;
        }
        return iArr;
    }

    public final void A3(View view, int i9, boolean z9) {
        int iI0;
        int iI02;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f16794c;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iV3 = v3(bVar.f16579f, bVar.f16580g);
        if (this.f16593s == 1) {
            iI02 = RecyclerView.o.i0(iV3, i9, i11, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iI0 = RecyclerView.o.i0(this.f16595u.n(), v0(), i10, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iI03 = RecyclerView.o.i0(iV3, i9, i10, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iI04 = RecyclerView.o.i0(this.f16595u.n(), J0(), i11, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iI0 = iI03;
            iI02 = iI04;
        }
        B3(view, iI02, iI0, z9);
    }

    public final void B3(View view, int i9, int i10, boolean z9) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z9 ? f2(view, i9, i10, pVar) : d2(view, i9, i10, pVar)) {
            view.measure(i9, i10);
        }
    }

    public void C3(int i9) {
        if (i9 == this.f16571J) {
            return;
        }
        this.f16570I = true;
        if (i9 >= 1) {
            this.f16571J = i9;
            this.f16576O.h();
            Q1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i9);
        }
    }

    public final void D3() {
        int iU0;
        int iN;
        if (N2() == 1) {
            iU0 = I0() - k();
            iN = o();
        } else {
            iU0 = u0() - b();
            iN = n();
        }
        o3(iU0 - iN);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int E0(RecyclerView.v vVar, RecyclerView.A a9) {
        if (this.f16593s == 0) {
            return this.f16571J;
        }
        if (a9.c() < 1) {
            return 0;
        }
        return w3(vVar, a9, a9.c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View F2(RecyclerView.v vVar, RecyclerView.A a9, int i9, int i10, int i11) {
        r2();
        int iM = this.f16595u.m();
        int i12 = this.f16595u.i();
        int i13 = i10 > i9 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i9 != i10) {
            View viewG0 = g0(i9);
            int iB0 = B0(viewG0);
            if (iB0 >= 0 && iB0 < i11 && x3(vVar, a9, iB0) == 0) {
                if (((RecyclerView.p) viewG0.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = viewG0;
                    }
                } else {
                    if (this.f16595u.g(viewG0) < i12 && this.f16595u.d(viewG0) >= iM) {
                        return viewG0;
                    }
                    if (view == null) {
                        view = viewG0;
                    }
                }
            }
            i9 += i13;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean J(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int O(RecyclerView.A a9) {
        return this.f16578Q ? r3(a9) : super.O(a9);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int P(RecyclerView.A a9) {
        return this.f16578Q ? s3(a9) : super.P(a9);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0214  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q2(androidx.recyclerview.widget.RecyclerView.v r18, androidx.recyclerview.widget.RecyclerView.A r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Q2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int R(RecyclerView.A a9) {
        return this.f16578Q ? r3(a9) : super.R(a9);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int S(RecyclerView.A a9) {
        return this.f16578Q ? s3(a9) : super.S(a9);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void S2(RecyclerView.v vVar, RecyclerView.A a9, LinearLayoutManager.a aVar, int i9) {
        super.S2(vVar, a9, aVar, i9);
        D3();
        if (a9.c() > 0 && !a9.h()) {
            t3(vVar, a9, aVar, i9);
        }
        u3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int T1(int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        D3();
        u3();
        return super.T1(i9, vVar, a9);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int V1(int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        D3();
        u3();
        return super.V1(i9, vVar, a9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a2(Rect rect, int i9, int i10) {
        int iK;
        int iK2;
        if (this.f16572K == null) {
            super.a2(rect, i9, i10);
        }
        int iO = o() + k();
        int iN = n() + b();
        if (this.f16593s == 1) {
            iK2 = RecyclerView.o.K(i10, rect.height() + iN, z0());
            int[] iArr = this.f16572K;
            iK = RecyclerView.o.K(i9, iArr[iArr.length - 1] + iO, A0());
        } else {
            iK = RecyclerView.o.K(i9, rect.width() + iO, A0());
            int[] iArr2 = this.f16572K;
            iK2 = RecyclerView.o.K(i10, iArr2[iArr2.length - 1] + iN, z0());
        }
        Z1(iK, iK2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p b0() {
        return this.f16593s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p c0(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p d0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void d3(boolean z9) {
        if (z9) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.d3(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View f1(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.A r27) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.f1(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$A):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean j2() {
        return this.f16588D == null && !this.f16570I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int l0(RecyclerView.v vVar, RecyclerView.A a9) {
        if (this.f16593s == 1) {
            return this.f16571J;
        }
        if (a9.c() < 1) {
            return 0;
        }
        return w3(vVar, a9, a9.c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l1(RecyclerView.v vVar, RecyclerView.A a9, View view, C c9) {
        int iH;
        int iK;
        boolean z9;
        boolean z10;
        int iK2;
        int iH2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.k1(view, c9);
            return;
        }
        b bVar = (b) layoutParams;
        int iW3 = w3(vVar, a9, bVar.c());
        if (this.f16593s == 0) {
            iH2 = bVar.h();
            iK2 = bVar.k();
            z9 = false;
            z10 = false;
            iK = 1;
            iH = iW3;
        } else {
            iH = bVar.h();
            iK = bVar.k();
            z9 = false;
            z10 = false;
            iK2 = 1;
            iH2 = iW3;
        }
        c9.a0(C.c.a(iH2, iK2, iH, iK, z9, z10));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void l2(RecyclerView.A a9, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int iF = this.f16571J;
        for (int i9 = 0; i9 < this.f16571J && cVar.c(a9) && iF > 0; i9++) {
            int i10 = cVar.f16613d;
            cVar2.a(i10, Math.max(0, cVar.f16616g));
            iF -= this.f16576O.f(i10);
            cVar.f16613d += cVar.f16614e;
        }
    }

    public final void m3(RecyclerView.v vVar, RecyclerView.A a9, int i9, boolean z9) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (z9) {
            i11 = i9;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = i9 - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View view = this.f16573L[i10];
            b bVar = (b) view.getLayoutParams();
            int iY3 = y3(vVar, a9, B0(view));
            bVar.f16580g = iY3;
            bVar.f16579f = i13;
            i13 += iY3;
            i10 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n1(RecyclerView recyclerView, int i9, int i10) {
        this.f16576O.h();
        this.f16576O.g();
    }

    public final void n3() {
        int iH0 = h0();
        for (int i9 = 0; i9 < iH0; i9++) {
            b bVar = (b) g0(i9).getLayoutParams();
            int iC = bVar.c();
            this.f16574M.put(iC, bVar.k());
            this.f16575N.put(iC, bVar.h());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o1(RecyclerView recyclerView) {
        this.f16576O.h();
        this.f16576O.g();
    }

    public final void o3(int i9) {
        this.f16572K = p3(this.f16572K, this.f16571J, i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p1(RecyclerView recyclerView, int i9, int i10, int i11) {
        this.f16576O.h();
        this.f16576O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void q1(RecyclerView recyclerView, int i9, int i10) {
        this.f16576O.h();
        this.f16576O.g();
    }

    public final void q3() {
        this.f16574M.clear();
        this.f16575N.clear();
    }

    public final int r3(RecyclerView.A a9) {
        if (h0() != 0 && a9.c() != 0) {
            r2();
            boolean zP2 = P2();
            View viewW2 = w2(!zP2, true);
            View viewV2 = v2(!zP2, true);
            if (viewW2 != null && viewV2 != null) {
                int iB = this.f16576O.b(B0(viewW2), this.f16571J);
                int iB2 = this.f16576O.b(B0(viewV2), this.f16571J);
                int iMax = this.f16598x ? Math.max(0, ((this.f16576O.b(a9.c() - 1, this.f16571J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zP2) {
                    return Math.round((iMax * (Math.abs(this.f16595u.d(viewV2) - this.f16595u.g(viewW2)) / ((this.f16576O.b(B0(viewV2), this.f16571J) - this.f16576O.b(B0(viewW2), this.f16571J)) + 1))) + (this.f16595u.m() - this.f16595u.g(viewW2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void s1(RecyclerView recyclerView, int i9, int i10, Object obj) {
        this.f16576O.h();
        this.f16576O.g();
    }

    public final int s3(RecyclerView.A a9) {
        if (h0() != 0 && a9.c() != 0) {
            r2();
            View viewW2 = w2(!P2(), true);
            View viewV2 = v2(!P2(), true);
            if (viewW2 != null && viewV2 != null) {
                if (!P2()) {
                    return this.f16576O.b(a9.c() - 1, this.f16571J) + 1;
                }
                int iD = this.f16595u.d(viewV2) - this.f16595u.g(viewW2);
                int iB = this.f16576O.b(B0(viewW2), this.f16571J);
                return (int) ((iD / ((this.f16576O.b(B0(viewV2), this.f16571J) - iB) + 1)) * (this.f16576O.b(a9.c() - 1, this.f16571J) + 1));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void t1(RecyclerView.v vVar, RecyclerView.A a9) {
        if (a9.h()) {
            n3();
        }
        super.t1(vVar, a9);
        q3();
    }

    public final void t3(RecyclerView.v vVar, RecyclerView.A a9, LinearLayoutManager.a aVar, int i9) {
        boolean z9 = i9 == 1;
        int iX3 = x3(vVar, a9, aVar.f16602b);
        if (z9) {
            while (iX3 > 0) {
                int i10 = aVar.f16602b;
                if (i10 <= 0) {
                    return;
                }
                int i11 = i10 - 1;
                aVar.f16602b = i11;
                iX3 = x3(vVar, a9, i11);
            }
            return;
        }
        int iC = a9.c() - 1;
        int i12 = aVar.f16602b;
        while (i12 < iC) {
            int i13 = i12 + 1;
            int iX32 = x3(vVar, a9, i13);
            if (iX32 <= iX3) {
                break;
            }
            i12 = i13;
            iX3 = iX32;
        }
        aVar.f16602b = i12;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void u1(RecyclerView.A a9) {
        super.u1(a9);
        this.f16570I = false;
    }

    public final void u3() {
        View[] viewArr = this.f16573L;
        if (viewArr == null || viewArr.length != this.f16571J) {
            this.f16573L = new View[this.f16571J];
        }
    }

    public int v3(int i9, int i10) {
        if (this.f16593s != 1 || !O2()) {
            int[] iArr = this.f16572K;
            return iArr[i10 + i9] - iArr[i9];
        }
        int[] iArr2 = this.f16572K;
        int i11 = this.f16571J;
        return iArr2[i11 - i9] - iArr2[(i11 - i9) - i10];
    }

    public final int w3(RecyclerView.v vVar, RecyclerView.A a9, int i9) {
        if (!a9.h()) {
            return this.f16576O.b(i9, this.f16571J);
        }
        int iF = vVar.f(i9);
        if (iF != -1) {
            return this.f16576O.b(iF, this.f16571J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i9);
        return 0;
    }

    public final int x3(RecyclerView.v vVar, RecyclerView.A a9, int i9) {
        if (!a9.h()) {
            return this.f16576O.c(i9, this.f16571J);
        }
        int i10 = this.f16575N.get(i9, -1);
        if (i10 != -1) {
            return i10;
        }
        int iF = vVar.f(i9);
        if (iF != -1) {
            return this.f16576O.c(iF, this.f16571J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i9);
        return 0;
    }

    public final int y3(RecyclerView.v vVar, RecyclerView.A a9, int i9) {
        if (!a9.h()) {
            return this.f16576O.f(i9);
        }
        int i10 = this.f16574M.get(i9, -1);
        if (i10 != -1) {
            return i10;
        }
        int iF = vVar.f(i9);
        if (iF != -1) {
            return this.f16576O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i9);
        return 1;
    }

    public final void z3(float f9, int i9) {
        o3(Math.max(Math.round(f9 * this.f16571J), i9));
    }
}
