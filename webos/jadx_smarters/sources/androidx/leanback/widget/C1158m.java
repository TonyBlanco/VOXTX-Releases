package androidx.leanback.widget;

import Q.C;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.FocusFinder;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.AbstractC1157l;
import androidx.leanback.widget.c0;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okio.Segment;
import s.C2698d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: androidx.leanback.widget.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1158m extends RecyclerView.o {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Rect f15673j0 = new Rect();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static int[] f15674k0 = new int[2];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int[] f15675A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RecyclerView.v f15676B;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public d f15682H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public f f15683I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f15685K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f15687M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f15688N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f15689O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int[] f15690P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f15691Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f15692R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f15693S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f15694T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f15695U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f15697W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public AbstractC1157l f15699Y;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f15703c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f15704d0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public InterfaceC1151f f15707g0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC1147b f15711t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RecyclerView.A f15714w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15715x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15716y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15710s = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15712u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.recyclerview.widget.j f15713v = androidx.recyclerview.widget.j.a(this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final SparseIntArray f15717z = new SparseIntArray();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f15677C = 221696;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public A f15678D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayList f15679E = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f15680F = -1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f15681G = 0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f15684J = 0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f15696V = 8388659;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f15698X = 1;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f15700Z = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final c0 f15701a0 = new c0();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final C1162q f15702b0 = new C1162q();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int[] f15705e0 = new int[2];

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final b0 f15706f0 = new b0();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Runnable f15708h0 = new a();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public AbstractC1157l.b f15709i0 = new b();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f15686L = -1;

    /* JADX INFO: renamed from: androidx.leanback.widget.m$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1158m.this.Q1();
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.m$b */
    public class b implements AbstractC1157l.b {
        public b() {
        }

        @Override // androidx.leanback.widget.AbstractC1157l.b
        public int a() {
            return C1158m.this.f15715x;
        }

        @Override // androidx.leanback.widget.AbstractC1157l.b
        public int b(int i9) {
            C1158m c1158m = C1158m.this;
            View viewA0 = c1158m.a0(i9 - c1158m.f15715x);
            C1158m c1158m2 = C1158m.this;
            return (c1158m2.f15677C & 262144) != 0 ? c1158m2.g3(viewA0) : c1158m2.h3(viewA0);
        }

        @Override // androidx.leanback.widget.AbstractC1157l.b
        public void c(Object obj, int i9, int i10, int i11, int i12) {
            int i13;
            int i14;
            f fVar;
            View view = (View) obj;
            if (i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE) {
                i12 = !C1158m.this.f15699Y.u() ? C1158m.this.f15701a0.a().g() : C1158m.this.f15701a0.a().i() - C1158m.this.f15701a0.a().f();
            }
            if (!C1158m.this.f15699Y.u()) {
                i14 = i10 + i12;
                i13 = i12;
            } else {
                i13 = i12 - i10;
                i14 = i12;
            }
            int iR2 = C1158m.this.R2(i11) + C1158m.this.f15701a0.c().g();
            C1158m c1158m = C1158m.this;
            int i15 = iR2 - c1158m.f15687M;
            c1158m.f15706f0.g(view, i9);
            C1158m.this.y3(i11, view, i13, i14, i15);
            if (!C1158m.this.f15714w.h()) {
                C1158m.this.K4();
            }
            C1158m c1158m2 = C1158m.this;
            if ((c1158m2.f15677C & 3) != 1 && (fVar = c1158m2.f15683I) != null) {
                fVar.E();
            }
            C1158m.this.getClass();
        }

        @Override // androidx.leanback.widget.AbstractC1157l.b
        public int d(int i9) {
            C1158m c1158m = C1158m.this;
            return c1158m.i3(c1158m.a0(i9 - c1158m.f15715x));
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[PHI: r9
          0x007d: PHI (r9v7 androidx.leanback.widget.m) = (r9v6 androidx.leanback.widget.m), (r9v3 androidx.leanback.widget.m), (r9v3 androidx.leanback.widget.m) binds: [B:41:0x00a0, B:33:0x008f, B:24:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // androidx.leanback.widget.AbstractC1157l.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int e(int r6, boolean r7, java.lang.Object[] r8, boolean r9) {
            /*
                r5 = this;
                androidx.leanback.widget.m r0 = androidx.leanback.widget.C1158m.this
                int r1 = r0.f15715x
                int r1 = r6 - r1
                android.view.View r0 = r0.f3(r1)
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                androidx.leanback.widget.m$e r1 = (androidx.leanback.widget.C1158m.e) r1
                androidx.leanback.widget.m r2 = androidx.leanback.widget.C1158m.this
                androidx.leanback.widget.b r2 = r2.f15711t
                androidx.recyclerview.widget.RecyclerView$D r2 = r2.i0(r0)
                androidx.leanback.widget.m r3 = androidx.leanback.widget.C1158m.this
                java.lang.Class<androidx.leanback.widget.r> r4 = androidx.leanback.widget.r.class
                java.lang.Object r2 = r3.F2(r2, r4)
                d.AbstractC1617D.a(r2)
                r2 = 0
                r1.K(r2)
                boolean r1 = r1.e()
                r2 = 0
                if (r1 != 0) goto Lb2
                if (r9 == 0) goto L3e
                if (r7 == 0) goto L38
                androidx.leanback.widget.m r7 = androidx.leanback.widget.C1158m.this
                r7.y(r0)
                goto L4b
            L38:
                androidx.leanback.widget.m r7 = androidx.leanback.widget.C1158m.this
                r7.z(r0, r2)
                goto L4b
            L3e:
                if (r7 == 0) goto L46
                androidx.leanback.widget.m r7 = androidx.leanback.widget.C1158m.this
                r7.A(r0)
                goto L4b
            L46:
                androidx.leanback.widget.m r7 = androidx.leanback.widget.C1158m.this
                r7.B(r0, r2)
            L4b:
                androidx.leanback.widget.m r7 = androidx.leanback.widget.C1158m.this
                int r7 = r7.f15686L
                r9 = -1
                if (r7 == r9) goto L55
                r0.setVisibility(r7)
            L55:
                androidx.leanback.widget.m r7 = androidx.leanback.widget.C1158m.this
                androidx.leanback.widget.m$f r7 = r7.f15683I
                if (r7 == 0) goto L5e
                r7.F()
            L5e:
                androidx.leanback.widget.m r7 = androidx.leanback.widget.C1158m.this
                android.view.View r9 = r0.findFocus()
                int r7 = r7.X2(r0, r9)
                androidx.leanback.widget.m r9 = androidx.leanback.widget.C1158m.this
                int r1 = r9.f15677C
                r3 = r1 & 3
                r4 = 1
                if (r3 == r4) goto L81
                int r1 = r9.f15680F
                if (r6 != r1) goto Lad
                int r6 = r9.f15681G
                if (r7 != r6) goto Lad
                androidx.leanback.widget.m$f r6 = r9.f15683I
                if (r6 != 0) goto Lad
            L7d:
                r9.o2()
                goto Lad
            L81:
                r3 = r1 & 4
                if (r3 != 0) goto Lad
                r3 = r1 & 16
                if (r3 != 0) goto L92
                int r3 = r9.f15680F
                if (r6 != r3) goto L92
                int r3 = r9.f15681G
                if (r7 != r3) goto L92
                goto L7d
            L92:
                r1 = r1 & 16
                if (r1 == 0) goto Lad
                int r9 = r9.f15680F
                if (r6 < r9) goto Lad
                boolean r9 = r0.hasFocusable()
                if (r9 == 0) goto Lad
                androidx.leanback.widget.m r9 = androidx.leanback.widget.C1158m.this
                r9.f15680F = r6
                r9.f15681G = r7
                int r6 = r9.f15677C
                r6 = r6 & (-17)
                r9.f15677C = r6
                goto L7d
            Lad:
                androidx.leanback.widget.m r6 = androidx.leanback.widget.C1158m.this
                r6.B3(r0)
            Lb2:
                r8[r2] = r0
                androidx.leanback.widget.m r6 = androidx.leanback.widget.C1158m.this
                int r7 = r6.f15712u
                if (r7 != 0) goto Lbf
                int r6 = r6.D2(r0)
                goto Lc3
            Lbf:
                int r6 = r6.C2(r0)
            Lc3:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C1158m.b.e(int, boolean, java.lang.Object[], boolean):int");
        }

        @Override // androidx.leanback.widget.AbstractC1157l.b
        public int getCount() {
            return C1158m.this.f15714w.c() + C1158m.this.f15715x;
        }

        @Override // androidx.leanback.widget.AbstractC1157l.b
        public void removeItem(int i9) {
            C1158m c1158m = C1158m.this;
            View viewA0 = c1158m.a0(i9 - c1158m.f15715x);
            C1158m c1158m2 = C1158m.this;
            if ((c1158m2.f15677C & 3) == 1) {
                c1158m2.U(viewA0, c1158m2.f15676B);
            } else {
                c1158m2.J1(viewA0, c1158m2.f15676B);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.m$c */
    public class c extends d {
        public c() {
            super();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.z
        public PointF a(int i9) {
            if (c() == 0) {
                return null;
            }
            C1158m c1158m = C1158m.this;
            int iB0 = c1158m.B0(c1158m.g0(0));
            C1158m c1158m2 = C1158m.this;
            int i10 = ((c1158m2.f15677C & 262144) == 0 ? i9 >= iB0 : i9 <= iB0) ? 1 : -1;
            return c1158m2.f15712u == 0 ? new PointF(i10, 0.0f) : new PointF(0.0f, i10);
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.m$d */
    public abstract class d extends androidx.recyclerview.widget.h {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f15721q;

        public d() {
            super(C1158m.this.f15711t.getContext());
        }

        public void D() {
            View viewB = b(f());
            if (viewB == null) {
                if (f() >= 0) {
                    C1158m.this.T3(f(), 0, false, 0);
                    return;
                }
                return;
            }
            if (C1158m.this.f15680F != f()) {
                C1158m.this.f15680F = f();
            }
            if (C1158m.this.L0()) {
                C1158m.this.f15677C |= 32;
                viewB.requestFocus();
                C1158m.this.f15677C &= -33;
            }
            C1158m.this.o2();
            C1158m.this.p2();
        }

        @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.z
        public void n() {
            super.n();
            if (!this.f15721q) {
                D();
            }
            C1158m c1158m = C1158m.this;
            if (c1158m.f15682H == this) {
                c1158m.f15682H = null;
            }
            if (c1158m.f15683I == this) {
                c1158m.f15683I = null;
            }
        }

        @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.z
        public void o(View view, RecyclerView.A a9, RecyclerView.z.a aVar) {
            int i9;
            int i10;
            if (C1158m.this.S2(view, null, C1158m.f15674k0)) {
                if (C1158m.this.f15712u == 0) {
                    int[] iArr = C1158m.f15674k0;
                    i10 = iArr[0];
                    i9 = iArr[1];
                } else {
                    int[] iArr2 = C1158m.f15674k0;
                    int i11 = iArr2[1];
                    i9 = iArr2[0];
                    i10 = i11;
                }
                aVar.d(i10, i9, w((int) Math.sqrt((i10 * i10) + (i9 * i9))), this.f17071j);
            }
        }

        @Override // androidx.recyclerview.widget.h
        public int x(int i9) {
            int iX = super.x(i9);
            if (C1158m.this.f15701a0.a().i() <= 0) {
                return iX;
            }
            float fI = (30.0f / C1158m.this.f15701a0.a().i()) * i9;
            return ((float) iX) < fI ? (int) fI : iX;
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.m$e */
    public static final class e extends RecyclerView.p {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15724g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15725h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f15726i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f15727j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f15728k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f15729l;

        public e(int i9, int i10) {
            super(i9, i10);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public e(e eVar) {
            super((RecyclerView.p) eVar);
        }

        public e(RecyclerView.p pVar) {
            super(pVar);
        }

        public int A() {
            return this.f15725h;
        }

        public int C(View view) {
            return view.getTop() + this.f15724g;
        }

        public int G() {
            return this.f15724g;
        }

        public int H(View view) {
            return (view.getWidth() - this.f15723f) - this.f15725h;
        }

        public void I(int i9) {
            this.f15727j = i9;
        }

        public void J(int i9) {
            this.f15728k = i9;
        }

        public void K(r rVar) {
        }

        public void L(int i9, int i10, int i11, int i12) {
            this.f15723f = i9;
            this.f15724g = i10;
            this.f15725h = i11;
            this.f15726i = i12;
        }

        public int[] h() {
            return this.f15729l;
        }

        public int k() {
            return this.f15727j;
        }

        public int m() {
            return this.f15728k;
        }

        public r r() {
            return null;
        }

        public int t(View view) {
            return (view.getHeight() - this.f15724g) - this.f15726i;
        }

        public int v(View view) {
            return view.getLeft() + this.f15723f;
        }

        public int w() {
            return this.f15723f;
        }

        public int x(View view) {
            return view.getRight() - this.f15725h;
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.m$f */
    public final class f extends d {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f15730s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f15731t;

        public f(int i9, boolean z9) {
            super();
            this.f15731t = i9;
            this.f15730s = z9;
            p(-2);
        }

        @Override // androidx.recyclerview.widget.h
        public void C(RecyclerView.z.a aVar) {
            if (this.f15731t == 0) {
                return;
            }
            super.C(aVar);
        }

        @Override // androidx.leanback.widget.C1158m.d
        public void D() {
            super.D();
            this.f15731t = 0;
            View viewB = b(f());
            if (viewB != null) {
                C1158m.this.W3(viewB, true);
            }
        }

        public void E() {
            int i9;
            if (this.f15730s && (i9 = this.f15731t) != 0) {
                this.f15731t = C1158m.this.M3(true, i9);
            }
            int i10 = this.f15731t;
            if (i10 == 0 || ((i10 > 0 && C1158m.this.r3()) || (this.f15731t < 0 && C1158m.this.q3()))) {
                p(C1158m.this.f15680F);
                r();
            }
        }

        public void F() {
            int i9;
            int i10;
            View viewB;
            if (this.f15730s || (i9 = this.f15731t) == 0) {
                return;
            }
            if (i9 > 0) {
                C1158m c1158m = C1158m.this;
                i10 = c1158m.f15680F + c1158m.f15697W;
            } else {
                C1158m c1158m2 = C1158m.this;
                i10 = c1158m2.f15680F - c1158m2.f15697W;
            }
            View view = null;
            while (this.f15731t != 0 && (viewB = b(i10)) != null) {
                if (C1158m.this.m2(viewB)) {
                    C1158m c1158m3 = C1158m.this;
                    c1158m3.f15680F = i10;
                    c1158m3.f15681G = 0;
                    int i11 = this.f15731t;
                    this.f15731t = i11 > 0 ? i11 - 1 : i11 + 1;
                    view = viewB;
                }
                i10 = this.f15731t > 0 ? i10 + C1158m.this.f15697W : i10 - C1158m.this.f15697W;
            }
            if (view == null || !C1158m.this.L0()) {
                return;
            }
            C1158m.this.f15677C |= 32;
            view.requestFocus();
            C1158m.this.f15677C &= -33;
        }

        public void G() {
            int i9 = this.f15731t;
            if (i9 > (-C1158m.this.f15710s)) {
                this.f15731t = i9 - 1;
            }
        }

        public void H() {
            int i9 = this.f15731t;
            if (i9 < C1158m.this.f15710s) {
                this.f15731t = i9 + 1;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.z
        public PointF a(int i9) {
            int i10 = this.f15731t;
            if (i10 == 0) {
                return null;
            }
            C1158m c1158m = C1158m.this;
            int i11 = ((c1158m.f15677C & 262144) == 0 ? i10 >= 0 : i10 <= 0) ? 1 : -1;
            return c1158m.f15712u == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.m$g */
    public static final class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15733a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bundle f15734c;

        /* JADX INFO: renamed from: androidx.leanback.widget.m$g$a */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i9) {
                return new g[i9];
            }
        }

        public g() {
            this.f15734c = Bundle.EMPTY;
        }

        public g(Parcel parcel) {
            this.f15734c = Bundle.EMPTY;
            this.f15733a = parcel.readInt();
            this.f15734c = parcel.readBundle(C1158m.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeInt(this.f15733a);
            parcel.writeBundle(this.f15734c);
        }
    }

    public C1158m(AbstractC1147b abstractC1147b) {
        this.f15711t = abstractC1147b;
        X1(false);
    }

    public final boolean A2(View view, View view2, int[] iArr) {
        int iP2 = P2(view);
        if (view2 != null) {
            iP2 = z2(iP2, view, view2);
        }
        int iT2 = T2(view);
        int i9 = iP2 + this.f15685K;
        if (i9 == 0 && iT2 == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        iArr[0] = i9;
        iArr[1] = iT2;
        return true;
    }

    public final void A3() {
        this.f15676B = null;
        this.f15714w = null;
        this.f15715x = 0;
        this.f15716y = 0;
    }

    public void A4(int i9) {
        this.f15701a0.a().z(i9);
    }

    public int B2(RecyclerView recyclerView, int i9, int i10) {
        int iIndexOfChild;
        View viewA0 = a0(this.f15680F);
        return (viewA0 != null && i10 >= (iIndexOfChild = recyclerView.indexOfChild(viewA0))) ? i10 < i9 + (-1) ? ((iIndexOfChild + i9) - 1) - i10 : iIndexOfChild : i10;
    }

    public void B3(View view) {
        int childMeasureSpec;
        int childMeasureSpec2;
        e eVar = (e) view.getLayoutParams();
        Rect rect = f15673j0;
        G(view, rect);
        int i9 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + rect.left + rect.right;
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin + rect.top + rect.bottom;
        int iMakeMeasureSpec = this.f15688N == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(this.f15689O, 1073741824);
        if (this.f15712u == 0) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i9, ((ViewGroup.MarginLayoutParams) eVar).width);
            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i10, ((ViewGroup.MarginLayoutParams) eVar).height);
        } else {
            int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i10, ((ViewGroup.MarginLayoutParams) eVar).height);
            childMeasureSpec = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i9, ((ViewGroup.MarginLayoutParams) eVar).width);
            childMeasureSpec2 = childMeasureSpec3;
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void B4(float f9) {
        this.f15701a0.a().A(f9);
    }

    public int C2(View view) {
        e eVar = (e) view.getLayoutParams();
        return p0(view) + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
    }

    public final void C3(int i9, int i10, int i11, int[] iArr) {
        View viewO = this.f15676B.o(i9);
        if (viewO != null) {
            e eVar = (e) viewO.getLayoutParams();
            Rect rect = f15673j0;
            G(viewO, rect);
            viewO.measure(ViewGroup.getChildMeasureSpec(i10, o() + k() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + rect.left + rect.right, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i11, n() + b() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin + rect.top + rect.bottom, ((ViewGroup.MarginLayoutParams) eVar).height));
            iArr[0] = D2(viewO);
            iArr[1] = C2(viewO);
            this.f15676B.B(viewO);
        }
    }

    public void C4() {
        d dVar = this.f15682H;
        if (dVar != null) {
            dVar.f15721q = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D1(androidx.recyclerview.widget.RecyclerView.v r5, androidx.recyclerview.widget.RecyclerView.A r6, int r7, android.os.Bundle r8) {
        /*
            r4 = this;
            boolean r8 = r4.w3()
            r0 = 1
            if (r8 != 0) goto L8
            return r0
        L8:
            r4.P3(r5, r6)
            int r5 = r4.f15677C
            r6 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 & r6
            r6 = 0
            if (r5 == 0) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            int r8 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 8192(0x2000, float:1.148E-41)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r8 < r1) goto L4f
            int r8 = r4.f15712u
            if (r8 != 0) goto L3a
            Q.C$a r8 = Q.C.a.f7386D
            int r8 = r8.b()
            if (r7 != r8) goto L2f
            if (r5 == 0) goto L42
            goto L4d
        L2f:
            Q.C$a r8 = Q.C.a.f7388F
            int r8 = r8.b()
            if (r7 != r8) goto L4f
            if (r5 == 0) goto L4d
            goto L42
        L3a:
            Q.C$a r5 = Q.C.a.f7385C
            int r5 = r5.b()
            if (r7 != r5) goto L45
        L42:
            r7 = 8192(0x2000, float:1.148E-41)
            goto L4f
        L45:
            Q.C$a r5 = Q.C.a.f7387E
            int r5 = r5.b()
            if (r7 != r5) goto L4f
        L4d:
            r7 = 4096(0x1000, float:5.74E-42)
        L4f:
            if (r7 == r3) goto L5c
            if (r7 == r2) goto L54
            goto L62
        L54:
            r4.K3(r6)
            r5 = -1
            r4.M3(r6, r5)
            goto L62
        L5c:
            r4.K3(r0)
            r4.M3(r6, r0)
        L62:
            r4.A3()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C1158m.D1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$A, int, android.os.Bundle):boolean");
    }

    public int D2(View view) {
        e eVar = (e) view.getLayoutParams();
        return q0(view) + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    public final void D3(int i9) {
        int iH0 = h0();
        int i10 = 0;
        if (this.f15712u == 1) {
            while (i10 < iH0) {
                g0(i10).offsetTopAndBottom(i9);
                i10++;
            }
        } else {
            while (i10 < iH0) {
                g0(i10).offsetLeftAndRight(i9);
                i10++;
            }
        }
    }

    public int D4(int i9) {
        c cVar = new c();
        cVar.p(i9);
        h2(cVar);
        return cVar.f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int E0(RecyclerView.v vVar, RecyclerView.A a9) {
        AbstractC1157l abstractC1157l;
        return (this.f15712u != 0 || (abstractC1157l = this.f15699Y) == null) ? super.E0(vVar, a9) : abstractC1157l.r();
    }

    public int E2() {
        return this.f15704d0;
    }

    public final void E3(int i9) {
        int iH0 = h0();
        int i10 = 0;
        if (this.f15712u == 0) {
            while (i10 < iH0) {
                g0(i10).offsetTopAndBottom(i9);
                i10++;
            }
        } else {
            while (i10 < iH0) {
                g0(i10).offsetLeftAndRight(i9);
                i10++;
            }
        }
    }

    public final void E4() {
        int iH0 = h0();
        for (int i9 = 0; i9 < iH0; i9++) {
            F4(g0(i9));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object F2(RecyclerView.D d9, Class cls) {
        InterfaceC1151f interfaceC1151f;
        InterfaceC1150e interfaceC1150eG;
        Object objC = d9 instanceof InterfaceC1150e ? ((InterfaceC1150e) d9).c(cls) : null;
        return (objC != null || (interfaceC1151f = this.f15707g0) == null || (interfaceC1150eG = interfaceC1151f.g(d9.o())) == null) ? objC : interfaceC1150eG.c(cls);
    }

    public void F3(RecyclerView.D d9) {
        int iM = d9.m();
        if (iM != -1) {
            this.f15706f0.j(d9.f16733a, iM);
        }
    }

    public final void F4(View view) {
        e eVar = (e) view.getLayoutParams();
        eVar.r();
        eVar.I(this.f15702b0.f15761c.i(view));
        eVar.J(this.f15702b0.f15760b.i(view));
    }

    public int G2() {
        return this.f15700Z;
    }

    public void G3(boolean z9, int i9, Rect rect) {
        if (!z9) {
            return;
        }
        int i10 = this.f15680F;
        while (true) {
            View viewA0 = a0(i10);
            if (viewA0 == null) {
                return;
            }
            if (viewA0.getVisibility() == 0 && viewA0.hasFocusable()) {
                viewA0.requestFocus();
                return;
            }
            i10++;
        }
    }

    public void G4() {
        int iM = 0;
        if (h0() > 0) {
            iM = this.f15699Y.m() - ((e) g0(0).getLayoutParams()).c();
        }
        this.f15715x = iM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean H() {
        return this.f15712u == 0 || this.f15697W > 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void H1(RecyclerView.v vVar) {
        for (int iH0 = h0() - 1; iH0 >= 0; iH0--) {
            K1(iH0, vVar);
        }
    }

    public int H2() {
        return this.f15692R;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H3(int r6) {
        /*
            r5 = this;
            int r0 = r5.f15712u
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Ld
            if (r6 != r2) goto Lb
            r0 = 262144(0x40000, float:3.67342E-40)
            goto L11
        Lb:
            r0 = 0
            goto L11
        Ld:
            if (r6 != r2) goto Lb
            r0 = 524288(0x80000, float:7.34684E-40)
        L11:
            int r3 = r5.f15677C
            r4 = 786432(0xc0000, float:1.102026E-39)
            r4 = r4 & r3
            if (r4 != r0) goto L19
            return
        L19:
            r4 = -786433(0xfffffffffff3ffff, float:NaN)
            r3 = r3 & r4
            r0 = r0 | r3
            r0 = r0 | 256(0x100, float:3.59E-43)
            r5.f15677C = r0
            androidx.leanback.widget.c0 r0 = r5.f15701a0
            androidx.leanback.widget.c0$a r0 = r0.f15635c
            if (r6 != r2) goto L29
            r1 = 1
        L29:
            r0.w(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C1158m.H3(int):void");
    }

    public void H4() {
        AbstractC1157l.a aVarQ;
        this.f15717z.clear();
        int iH0 = h0();
        for (int i9 = 0; i9 < iH0; i9++) {
            int iQ = this.f15711t.i0(g0(i9)).q();
            if (iQ >= 0 && (aVarQ = this.f15699Y.q(iQ)) != null) {
                this.f15717z.put(iQ, aVarQ.f15672a);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean I() {
        return this.f15712u == 1 || this.f15697W > 1;
    }

    public int I2() {
        return this.f15702b0.a().a();
    }

    public final boolean I3() {
        return this.f15699Y.v();
    }

    public final void I4() {
        int i9 = (this.f15677C & (-1025)) | (L3(false) ? 1024 : 0);
        this.f15677C = i9;
        if ((i9 & 1024) != 0) {
            w2();
        }
    }

    public float J2() {
        return this.f15702b0.a().b();
    }

    public final void J3() {
        this.f15699Y.w((this.f15677C & 262144) != 0 ? this.f15703c0 + this.f15704d0 + this.f15716y : (-this.f15704d0) - this.f15716y);
    }

    public final void J4() {
        this.f15701a0.f15635c.x(I0());
        this.f15701a0.f15634b.x(u0());
        this.f15701a0.f15635c.t(o(), k());
        this.f15701a0.f15634b.t(n(), b());
        this.f15703c0 = this.f15701a0.a().i();
    }

    public int K2() {
        return this.f15702b0.a().c();
    }

    public final void K3(boolean z9) {
        if (z9) {
            if (r3()) {
                return;
            }
        } else if (q3()) {
            return;
        }
        f fVar = this.f15683I;
        if (fVar == null) {
            this.f15711t.z1();
            f fVar2 = new f(z9 ? 1 : -1, this.f15697W > 1);
            this.f15684J = 0;
            h2(fVar2);
            return;
        }
        if (z9) {
            fVar.H();
        } else {
            fVar.G();
        }
    }

    public void K4() {
        int iM;
        int iP;
        int iC;
        int iC2;
        int iJ;
        int iB3;
        int iL;
        int iB32;
        if (this.f15714w.c() == 0) {
            return;
        }
        if ((this.f15677C & 262144) == 0) {
            iM = this.f15699Y.p();
            iC2 = this.f15714w.c() - 1;
            iP = this.f15699Y.m();
            iC = 0;
        } else {
            iM = this.f15699Y.m();
            iP = this.f15699Y.p();
            iC = this.f15714w.c() - 1;
            iC2 = 0;
        }
        if (iM < 0 || iP < 0) {
            return;
        }
        boolean z9 = iM == iC2;
        boolean z10 = iP == iC;
        if (z9 || !this.f15701a0.a().o() || z10 || !this.f15701a0.a().p()) {
            if (z9) {
                iJ = this.f15699Y.j(true, f15674k0);
                View viewA0 = a0(f15674k0[1]);
                iB3 = b3(viewA0);
                int[] iArrH = ((e) viewA0.getLayoutParams()).h();
                if (iArrH != null && iArrH.length > 0) {
                    iB3 += iArrH[iArrH.length - 1] - iArrH[0];
                }
            } else {
                iJ = a.e.API_PRIORITY_OTHER;
                iB3 = a.e.API_PRIORITY_OTHER;
            }
            if (z10) {
                iL = this.f15699Y.l(false, f15674k0);
                iB32 = b3(a0(f15674k0[1]));
            } else {
                iL = Integer.MIN_VALUE;
                iB32 = Integer.MIN_VALUE;
            }
            this.f15701a0.a().B(iL, iJ, iB32, iB3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void L(int i9, int i10, RecyclerView.A a9, RecyclerView.o.c cVar) {
        try {
            P3(null, a9);
            if (this.f15712u != 0) {
                i9 = i10;
            }
            if (h0() != 0 && i9 != 0) {
                this.f15699Y.f(i9 < 0 ? -this.f15704d0 : this.f15703c0 + this.f15704d0, i9, cVar);
                A3();
            }
        } finally {
            A3();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int L2(int r10) {
        /*
            r9 = this;
            int r0 = r9.f15712u
            r1 = 130(0x82, float:1.82E-43)
            r2 = 66
            r3 = 33
            r4 = 2
            r5 = 0
            r6 = 3
            r7 = 1
            r8 = 17
            if (r0 != 0) goto L30
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r10 == r8) goto L28
            if (r10 == r3) goto L2e
            if (r10 == r2) goto L1f
            if (r10 == r1) goto L1d
            r4 = 17
            goto L2e
        L1d:
            r4 = 3
            goto L2e
        L1f:
            int r10 = r9.f15677C
            r10 = r10 & r0
            if (r10 != 0) goto L26
        L24:
            r4 = 1
            goto L2e
        L26:
            r4 = 0
            goto L2e
        L28:
            int r10 = r9.f15677C
            r10 = r10 & r0
            if (r10 != 0) goto L24
            goto L26
        L2e:
            r5 = r4
            goto L4d
        L30:
            if (r0 != r7) goto L4b
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r10 == r8) goto L45
            if (r10 == r3) goto L4d
            if (r10 == r2) goto L3f
            if (r10 == r1) goto L3d
            goto L4b
        L3d:
            r5 = 1
            goto L4d
        L3f:
            int r10 = r9.f15677C
            r10 = r10 & r0
            if (r10 != 0) goto L2e
            goto L1d
        L45:
            int r10 = r9.f15677C
            r10 = r10 & r0
            if (r10 != 0) goto L1d
            goto L2e
        L4b:
            r5 = 17
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C1158m.L2(int):int");
    }

    public final boolean L3(boolean z9) {
        if (this.f15689O != 0 || this.f15690P == null) {
            return false;
        }
        AbstractC1157l abstractC1157l = this.f15699Y;
        C2698d[] c2698dArrN = abstractC1157l == null ? null : abstractC1157l.n();
        boolean z10 = false;
        int i9 = -1;
        for (int i10 = 0; i10 < this.f15697W; i10++) {
            C2698d c2698d = c2698dArrN == null ? null : c2698dArrN[i10];
            int iG = c2698d == null ? 0 : c2698d.g();
            int i11 = -1;
            for (int i12 = 0; i12 < iG; i12 += 2) {
                int iD = c2698d.d(i12 + 1);
                for (int iD2 = c2698d.d(i12); iD2 <= iD; iD2++) {
                    View viewA0 = a0(iD2 - this.f15715x);
                    if (viewA0 != null) {
                        if (z9) {
                            B3(viewA0);
                        }
                        int iC2 = this.f15712u == 0 ? C2(viewA0) : D2(viewA0);
                        if (iC2 > i11) {
                            i11 = iC2;
                        }
                    }
                }
            }
            int iC = this.f15714w.c();
            if (!this.f15711t.p0() && z9 && i11 < 0 && iC > 0) {
                if (i9 < 0) {
                    int i13 = this.f15680F;
                    if (i13 < 0) {
                        i13 = 0;
                    } else if (i13 >= iC) {
                        i13 = iC - 1;
                    }
                    if (h0() > 0) {
                        int iP = this.f15711t.i0(g0(0)).p();
                        int iP2 = this.f15711t.i0(g0(h0() - 1)).p();
                        if (i13 >= iP && i13 <= iP2) {
                            i13 = i13 - iP <= iP2 - i13 ? iP - 1 : iP2 + 1;
                            if (i13 < 0 && iP2 < iC - 1) {
                                i13 = iP2 + 1;
                            } else if (i13 >= iC && iP > 0) {
                                i13 = iP - 1;
                            }
                        }
                    }
                    if (i13 >= 0 && i13 < iC) {
                        C3(i13, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), this.f15705e0);
                        i9 = this.f15712u == 0 ? this.f15705e0[1] : this.f15705e0[0];
                    }
                }
                if (i9 >= 0) {
                    i11 = i9;
                }
            }
            if (i11 < 0) {
                i11 = 0;
            }
            int[] iArr = this.f15690P;
            if (iArr[i10] != i11) {
                iArr[i10] = i11;
                z10 = true;
            }
        }
        return z10;
    }

    public final void L4() {
        c0.a aVarC = this.f15701a0.c();
        int iG = aVarC.g() - this.f15687M;
        int iV2 = V2() + iG;
        aVarC.B(iG, iV2, iG, iV2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M(int i9, RecyclerView.o.c cVar) {
        int i10 = this.f15711t.f15628S0;
        if (i9 == 0 || i10 == 0) {
            return;
        }
        int iMax = Math.max(0, Math.min(this.f15680F - ((i10 - 1) / 2), i9 - i10));
        for (int i11 = iMax; i11 < i9 && i11 < iMax + i10; i11++) {
            cVar.a(i11, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean M2(android.view.View r13, int[] r14) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C1158m.M2(android.view.View, int[]):boolean");
    }

    public int M3(boolean z9, int i9) {
        AbstractC1157l abstractC1157l = this.f15699Y;
        if (abstractC1157l == null) {
            return i9;
        }
        int i10 = this.f15680F;
        int iS = i10 != -1 ? abstractC1157l.s(i10) : -1;
        int iH0 = h0();
        View view = null;
        for (int i11 = 0; i11 < iH0 && i9 != 0; i11++) {
            int i12 = i9 > 0 ? i11 : (iH0 - 1) - i11;
            View viewG0 = g0(i12);
            if (m2(viewG0)) {
                int iX2 = x2(i12);
                int iS2 = this.f15699Y.s(iX2);
                if (iS == -1) {
                    i10 = iX2;
                    view = viewG0;
                    iS = iS2;
                } else if (iS2 == iS && ((i9 > 0 && iX2 > i10) || (i9 < 0 && iX2 < i10))) {
                    i9 = i9 > 0 ? i9 - 1 : i9 + 1;
                    i10 = iX2;
                    view = viewG0;
                }
            }
        }
        if (view != null) {
            if (z9) {
                if (L0()) {
                    this.f15677C |= 32;
                    view.requestFocus();
                    this.f15677C &= -33;
                }
                this.f15680F = i10;
                this.f15681G = 0;
            } else {
                W3(view, true);
            }
        }
        return i9;
    }

    public final int N2(View view) {
        return ((e) view.getLayoutParams()).v(view);
    }

    public final void N3() {
        int i9 = this.f15677C;
        if ((65600 & i9) == 65536) {
            this.f15699Y.y(this.f15680F, (i9 & 262144) != 0 ? -this.f15704d0 : this.f15703c0 + this.f15704d0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean O1(RecyclerView recyclerView, View view, Rect rect, boolean z9) {
        return false;
    }

    public final int O2(View view) {
        return ((e) view.getLayoutParams()).x(view);
    }

    public final void O3() {
        int i9 = this.f15677C;
        if ((65600 & i9) == 65536) {
            this.f15699Y.z(this.f15680F, (i9 & 262144) != 0 ? this.f15703c0 + this.f15704d0 : -this.f15704d0);
        }
    }

    public final int P2(View view) {
        return this.f15701a0.a().h(b3(view));
    }

    public final void P3(RecyclerView.v vVar, RecyclerView.A a9) {
        if (this.f15676B != null || this.f15714w != null) {
            Log.e("GridLayoutManager", "Recycler information was not released, bug!");
        }
        this.f15676B = vVar;
        this.f15714w = a9;
        this.f15715x = 0;
        this.f15716y = 0;
    }

    public final int Q2(int i9) {
        int i10 = this.f15689O;
        if (i10 != 0) {
            return i10;
        }
        int[] iArr = this.f15690P;
        if (iArr == null) {
            return 0;
        }
        return iArr[i9];
    }

    public final int Q3(int i9) {
        int iE;
        int i10 = this.f15677C;
        if ((i10 & 64) == 0 && (i10 & 3) != 1 && (i9 <= 0 ? !(i9 >= 0 || this.f15701a0.a().p() || i9 >= (iE = this.f15701a0.a().e())) : !(this.f15701a0.a().o() || i9 <= (iE = this.f15701a0.a().d())))) {
            i9 = iE;
        }
        if (i9 == 0) {
            return 0;
        }
        D3(-i9);
        if ((this.f15677C & 3) == 1) {
            K4();
            return i9;
        }
        int iH0 = h0();
        if ((this.f15677C & 262144) == 0 ? i9 >= 0 : i9 <= 0) {
            l2();
        } else {
            J3();
        }
        boolean z9 = h0() > iH0;
        int iH02 = h0();
        if ((262144 & this.f15677C) == 0 ? i9 >= 0 : i9 <= 0) {
            O3();
        } else {
            N3();
        }
        if (z9 | (h0() < iH02)) {
            I4();
        }
        this.f15711t.invalidate();
        K4();
        return i9;
    }

    public int R2(int i9) {
        int iQ2 = 0;
        if ((this.f15677C & 524288) != 0) {
            for (int i10 = this.f15697W - 1; i10 > i9; i10--) {
                iQ2 += Q2(i10) + this.f15695U;
            }
            return iQ2;
        }
        int iQ22 = 0;
        while (iQ2 < i9) {
            iQ22 += Q2(iQ2) + this.f15695U;
            iQ2++;
        }
        return iQ22;
    }

    public final int R3(int i9) {
        if (i9 == 0) {
            return 0;
        }
        E3(-i9);
        this.f15687M += i9;
        L4();
        this.f15711t.invalidate();
        return i9;
    }

    public boolean S2(View view, View view2, int[] iArr) {
        int i9 = this.f15700Z;
        return (i9 == 1 || i9 == 2) ? M2(view, iArr) : A2(view, view2, iArr);
    }

    public final void S3(int i9, int i10, boolean z9) {
        if ((this.f15677C & 3) == 1) {
            Q3(i9);
            R3(i10);
            return;
        }
        if (this.f15712u != 0) {
            i10 = i9;
            i9 = i10;
        }
        if (z9) {
            this.f15711t.q1(i9, i10);
        } else {
            this.f15711t.scrollBy(i9, i10);
            p2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int T1(int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        if ((this.f15677C & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 || !s3()) {
            return 0;
        }
        P3(vVar, a9);
        this.f15677C = (this.f15677C & (-4)) | 2;
        int iQ3 = this.f15712u == 0 ? Q3(i9) : R3(i9);
        A3();
        this.f15677C &= -4;
        return iQ3;
    }

    public final int T2(View view) {
        return this.f15701a0.c().h(c3(view));
    }

    public void T3(int i9, int i10, boolean z9, int i11) {
        this.f15685K = i11;
        View viewA0 = a0(i9);
        boolean z10 = !T0();
        if (!z10 || this.f15711t.isLayoutRequested() || viewA0 == null || y2(viewA0) != i9) {
            int i12 = this.f15677C;
            if ((i12 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 || (i12 & 64) != 0) {
                this.f15680F = i9;
                this.f15681G = i10;
                this.f15684J = Integer.MIN_VALUE;
                return;
            }
            if (z9 && !this.f15711t.isLayoutRequested()) {
                this.f15680F = i9;
                this.f15681G = i10;
                this.f15684J = Integer.MIN_VALUE;
                if (!s3()) {
                    Log.w(Z2(), "setSelectionSmooth should not be called before first layout pass");
                    return;
                }
                int iD4 = D4(i9);
                if (iD4 != this.f15680F) {
                    this.f15680F = iD4;
                    this.f15681G = 0;
                    return;
                }
                return;
            }
            if (!z10) {
                C4();
                this.f15711t.z1();
            }
            if (this.f15711t.isLayoutRequested() || viewA0 == null || y2(viewA0) != i9) {
                this.f15680F = i9;
                this.f15681G = i10;
                this.f15684J = Integer.MIN_VALUE;
                this.f15677C |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                Q1();
                return;
            }
        }
        this.f15677C |= 32;
        W3(viewA0, z9);
        this.f15677C &= -33;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U1(int i9) {
        v4(i9, 0, false, 0);
    }

    public int U2() {
        return this.f15680F;
    }

    public final void U3(View view, View view2, boolean z9) {
        V3(view, view2, z9, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int V1(int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        if ((this.f15677C & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0 || !s3()) {
            return 0;
        }
        this.f15677C = (this.f15677C & (-4)) | 2;
        P3(vVar, a9);
        int iQ3 = this.f15712u == 1 ? Q3(i9) : R3(i9);
        A3();
        this.f15677C &= -4;
        return iQ3;
    }

    public final int V2() {
        int i9 = (this.f15677C & 524288) != 0 ? 0 : this.f15697W - 1;
        return R2(i9) + Q2(i9);
    }

    public final void V3(View view, View view2, boolean z9, int i9, int i10) {
        if ((this.f15677C & 64) != 0) {
            return;
        }
        int iY2 = y2(view);
        int iX2 = X2(view, view2);
        if (iY2 != this.f15680F || iX2 != this.f15681G) {
            this.f15680F = iY2;
            this.f15681G = iX2;
            this.f15684J = 0;
            if ((this.f15677C & 3) != 1) {
                o2();
            }
            if (this.f15711t.E1()) {
                this.f15711t.invalidate();
            }
        }
        if (view == null) {
            return;
        }
        if (!view.hasFocus() && this.f15711t.hasFocus()) {
            view.requestFocus();
        }
        if ((this.f15677C & 131072) == 0 && z9) {
            return;
        }
        if (!S2(view, view2, f15674k0) && i9 == 0 && i10 == 0) {
            return;
        }
        int[] iArr = f15674k0;
        S3(iArr[0] + i9, iArr[1] + i10, z9);
    }

    public int W2() {
        int i9;
        int left;
        int right;
        if (this.f15712u == 1) {
            i9 = -u0();
            if (h0() <= 0 || (left = g0(0).getTop()) >= 0) {
                return i9;
            }
        } else {
            if ((this.f15677C & 262144) != 0) {
                int iI0 = I0();
                return (h0() <= 0 || (right = g0(0).getRight()) <= iI0) ? iI0 : right;
            }
            i9 = -I0();
            if (h0() <= 0 || (left = g0(0).getLeft()) >= 0) {
                return i9;
            }
        }
        return i9 + left;
    }

    public void W3(View view, boolean z9) {
        U3(view, view == null ? null : view.findFocus(), z9);
    }

    public int X2(View view, View view2) {
        if (view != null && view2 != null) {
            ((e) view.getLayoutParams()).r();
        }
        return 0;
    }

    public void X3(View view, boolean z9, int i9, int i10) {
        V3(view, view == null ? null : view.findFocus(), z9, i9, i10);
    }

    public int Y2() {
        return this.f15681G;
    }

    public void Y3(int i9) {
        this.f15686L = i9;
        if (i9 != -1) {
            int iH0 = h0();
            for (int i10 = 0; i10 < iH0; i10++) {
                g0(i10).setVisibility(this.f15686L);
            }
        }
    }

    public String Z2() {
        return "GridLayoutManager:" + this.f15711t.getId();
    }

    public void Z3(int i9) {
        int i10 = this.f15704d0;
        if (i10 == i9) {
            return;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
        }
        this.f15704d0 = i9;
        Q1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(RecyclerView.g gVar, RecyclerView.g gVar2) {
        if (gVar != null) {
            n2();
            this.f15680F = -1;
            this.f15684J = 0;
            this.f15706f0.b();
        }
        this.f15707g0 = gVar2 instanceof InterfaceC1151f ? (InterfaceC1151f) gVar2 : null;
        super.a1(gVar, gVar2);
    }

    public int a3() {
        return this.f15693S;
    }

    public void a4(boolean z9, boolean z10) {
        this.f15677C = (z9 ? 2048 : 0) | (this.f15677C & (-6145)) | (z10 ? 4096 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p b0() {
        return new e(-2, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b1(androidx.recyclerview.widget.RecyclerView r18, java.util.ArrayList r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C1158m.b1(androidx.recyclerview.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    public final int b3(View view) {
        return this.f15712u == 0 ? d3(view) : e3(view);
    }

    public void b4(boolean z9, boolean z10) {
        this.f15677C = (z9 ? Segment.SIZE : 0) | (this.f15677C & (-24577)) | (z10 ? Http2.INITIAL_MAX_FRAME_SIZE : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p c0(Context context, AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    public final int c3(View view) {
        return this.f15712u == 0 ? e3(view) : d3(view);
    }

    public void c4(int i9) {
        this.f15700Z = i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p d0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof RecyclerView.p ? new e((RecyclerView.p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int d3(View view) {
        e eVar = (e) view.getLayoutParams();
        return eVar.v(view) + eVar.k();
    }

    public void d4(boolean z9) {
        this.f15677C = (z9 ? 32768 : 0) | (this.f15677C & (-32769));
    }

    public final int e3(View view) {
        e eVar = (e) view.getLayoutParams();
        return eVar.C(view) + eVar.m();
    }

    public void e4(int i9) {
        this.f15696V = i9;
    }

    public View f3(int i9) {
        return this.f15676B.o(i9);
    }

    public void f4(int i9) {
        int i10 = this.f15712u;
        this.f15692R = i9;
        if (i10 == 0) {
            this.f15694T = i9;
        } else {
            this.f15695U = i9;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g2(RecyclerView recyclerView, RecyclerView.A a9, int i9) {
        v4(i9, 0, true, 0);
    }

    public int g3(View view) {
        return this.f15713v.d(view);
    }

    public void g4(int i9) {
        this.f15702b0.a().e(i9);
        E4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void h2(RecyclerView.z zVar) {
        C4();
        super.h2(zVar);
        if (zVar.h() && (zVar instanceof d)) {
            d dVar = (d) zVar;
            this.f15682H = dVar;
            if (dVar instanceof f) {
                this.f15683I = (f) dVar;
                return;
            }
        } else {
            this.f15682H = null;
        }
        this.f15683I = null;
    }

    public int h3(View view) {
        return this.f15713v.g(view);
    }

    public void h4(float f9) {
        this.f15702b0.a().f(f9);
        E4();
    }

    public int i3(View view) {
        Rect rect = f15673j0;
        n0(view, rect);
        return this.f15712u == 0 ? rect.width() : rect.height();
    }

    public void i4(boolean z9) {
        this.f15702b0.a().g(z9);
        E4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void j1(RecyclerView.v vVar, RecyclerView.A a9, Q.C c9) {
        P3(vVar, a9);
        int iC = a9.c();
        boolean z9 = (this.f15677C & 262144) != 0;
        if (iC > 1 && !v3(0)) {
            if (Build.VERSION.SDK_INT >= 23) {
                c9.b(this.f15712u == 0 ? z9 ? C.a.f7388F : C.a.f7386D : C.a.f7385C);
            } else {
                c9.a(Segment.SIZE);
            }
            c9.q0(true);
        }
        if (iC > 1 && !v3(iC - 1)) {
            if (Build.VERSION.SDK_INT >= 23) {
                c9.b(this.f15712u == 0 ? z9 ? C.a.f7386D : C.a.f7388F : C.a.f7387E);
            } else {
                c9.a(4096);
            }
            c9.q0(true);
        }
        c9.Z(C.b.a(E0(vVar, a9), l0(vVar, a9), Q0(vVar, a9), F0(vVar, a9)));
        A3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean j2() {
        return true;
    }

    public void j3(View view, int[] iArr) {
        if (this.f15712u == 0) {
            iArr[0] = P2(view);
            iArr[1] = T2(view);
        } else {
            iArr[1] = P2(view);
            iArr[0] = T2(view);
        }
    }

    public void j4(int i9) {
        this.f15702b0.a().h(i9);
        E4();
    }

    public final boolean k2() {
        return this.f15699Y.a();
    }

    public int k3() {
        return this.f15701a0.a().j();
    }

    public void k4(int i9) {
        this.f15692R = i9;
        this.f15693S = i9;
        this.f15695U = i9;
        this.f15694T = i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int l0(RecyclerView.v vVar, RecyclerView.A a9) {
        AbstractC1157l abstractC1157l;
        return (this.f15712u != 1 || (abstractC1157l = this.f15699Y) == null) ? super.l0(vVar, a9) : abstractC1157l.r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l1(RecyclerView.v vVar, RecyclerView.A a9, View view, Q.C c9) {
        int i9;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f15699Y == null || !(layoutParams instanceof e)) {
            return;
        }
        int iA = ((e) layoutParams).a();
        int iS = iA >= 0 ? this.f15699Y.s(iA) : -1;
        if (iS < 0) {
            return;
        }
        int iR = iA / this.f15699Y.r();
        if (this.f15712u == 0) {
            i9 = iS;
            iS = iR;
        } else {
            i9 = iR;
        }
        c9.a0(C.c.a(i9, 1, iS, 1, false, false));
    }

    public final void l2() {
        this.f15699Y.b((this.f15677C & 262144) != 0 ? (-this.f15704d0) - this.f15716y : this.f15703c0 + this.f15704d0 + this.f15716y);
    }

    public int l3() {
        return this.f15701a0.a().k();
    }

    public void l4(boolean z9) {
        int i9 = this.f15677C;
        if (((i9 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0) != z9) {
            this.f15677C = (i9 & (-513)) | (z9 ? IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED : 0);
            Q1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int m0(View view) {
        return super.m0(view) - ((e) view.getLayoutParams()).f15726i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View m1(View view, int i9) {
        View viewFindNextFocus;
        View viewFindNextFocus2;
        if ((this.f15677C & 32768) != 0) {
            return view;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (i9 == 2 || i9 == 1) {
            if (I()) {
                viewFindNextFocus = focusFinder.findNextFocus(this.f15711t, view, i9 == 2 ? 130 : 33);
            } else {
                viewFindNextFocus = null;
            }
            if (H()) {
                viewFindNextFocus2 = focusFinder.findNextFocus(this.f15711t, view, (x0() == 1) ^ (i9 == 2) ? 66 : 17);
            } else {
                viewFindNextFocus2 = viewFindNextFocus;
            }
        } else {
            viewFindNextFocus2 = focusFinder.findNextFocus(this.f15711t, view, i9);
        }
        if (viewFindNextFocus2 != null) {
            return viewFindNextFocus2;
        }
        if (this.f15711t.getDescendantFocusability() == 393216) {
            return this.f15711t.getParent().focusSearch(view, i9);
        }
        int iL2 = L2(i9);
        boolean z9 = this.f15711t.getScrollState() != 0;
        if (iL2 == 1) {
            if (z9 || (this.f15677C & 4096) == 0) {
                viewFindNextFocus2 = view;
            }
            if ((this.f15677C & 131072) != 0 && !r3()) {
                K3(true);
                viewFindNextFocus2 = view;
            }
        } else if (iL2 == 0) {
            if (z9 || (this.f15677C & 2048) == 0) {
                viewFindNextFocus2 = view;
            }
            if ((this.f15677C & 131072) != 0 && !q3()) {
                K3(false);
                viewFindNextFocus2 = view;
            }
        } else if (iL2 == 3) {
        }
        if (viewFindNextFocus2 != null) {
            return viewFindNextFocus2;
        }
        View viewFocusSearch = this.f15711t.getParent().focusSearch(view, i9);
        return viewFocusSearch != null ? viewFocusSearch : view != null ? view : this.f15711t;
    }

    public boolean m2(View view) {
        return view.getVisibility() == 0 && (!L0() || view.hasFocusable());
    }

    public float m3() {
        return this.f15701a0.a().l();
    }

    public void m4(int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException();
        }
        this.f15698X = i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n0(View view, Rect rect) {
        super.n0(view, rect);
        e eVar = (e) view.getLayoutParams();
        rect.left += eVar.f15723f;
        rect.top += eVar.f15724g;
        rect.right -= eVar.f15725h;
        rect.bottom -= eVar.f15726i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n1(RecyclerView recyclerView, int i9, int i10) {
        AbstractC1157l abstractC1157l;
        int i11;
        if (this.f15680F != -1 && (abstractC1157l = this.f15699Y) != null && abstractC1157l.m() >= 0 && (i11 = this.f15684J) != Integer.MIN_VALUE && i9 <= this.f15680F + i11) {
            this.f15684J = i11 + i10;
        }
        this.f15706f0.b();
    }

    public final void n2() {
        this.f15699Y = null;
        this.f15690P = null;
        this.f15677C &= -1025;
    }

    public boolean n3(RecyclerView recyclerView, int i9, Rect rect) {
        int i10 = this.f15700Z;
        return (i10 == 1 || i10 == 2) ? p3(recyclerView, i9, rect) : o3(recyclerView, i9, rect);
    }

    public void n4(InterfaceC1170z interfaceC1170z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int o0(View view) {
        return super.o0(view) + ((e) view.getLayoutParams()).f15723f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o1(RecyclerView recyclerView) {
        this.f15684J = 0;
        this.f15706f0.b();
    }

    public void o2() {
        if (this.f15678D != null || t3()) {
            int i9 = this.f15680F;
            View viewA0 = i9 == -1 ? null : a0(i9);
            if (viewA0 != null) {
                RecyclerView.D dI0 = this.f15711t.i0(viewA0);
                A a9 = this.f15678D;
                if (a9 != null) {
                    a9.a(this.f15711t, viewA0, this.f15680F, dI0 == null ? -1L : dI0.n());
                }
                t2(this.f15711t, dI0, this.f15680F, this.f15681G);
            } else {
                A a10 = this.f15678D;
                if (a10 != null) {
                    a10.a(this.f15711t, null, -1, -1L);
                }
                t2(this.f15711t, null, -1, 0);
            }
            if ((this.f15677C & 3) == 1 || this.f15711t.isLayoutRequested()) {
                return;
            }
            int iH0 = h0();
            for (int i10 = 0; i10 < iH0; i10++) {
                if (g0(i10).isLayoutRequested()) {
                    w2();
                    return;
                }
            }
        }
    }

    public final boolean o3(RecyclerView recyclerView, int i9, Rect rect) {
        View viewA0 = a0(this.f15680F);
        if (viewA0 != null) {
            return viewA0.requestFocus(i9, rect);
        }
        return false;
    }

    public void o4(A a9) {
        this.f15678D = a9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p1(RecyclerView recyclerView, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14 = this.f15680F;
        if (i14 != -1 && (i12 = this.f15684J) != Integer.MIN_VALUE) {
            int i15 = i14 + i12;
            if (i9 <= i15 && i15 < i9 + i11) {
                i13 = i12 + (i10 - i9);
            } else if (i9 < i15 && i10 > i15 - i11) {
                i13 = i12 - i11;
            } else if (i9 > i15 && i10 < i15) {
                i13 = i12 + i11;
            }
            this.f15684J = i13;
        }
        this.f15706f0.b();
    }

    public void p2() {
        if (t3()) {
            int i9 = this.f15680F;
            View viewA0 = i9 == -1 ? null : a0(i9);
            if (viewA0 != null) {
                u2(this.f15711t, this.f15711t.i0(viewA0), this.f15680F, this.f15681G);
                return;
            }
            A a9 = this.f15678D;
            if (a9 != null) {
                a9.a(this.f15711t, null, -1, -1L);
            }
            u2(this.f15711t, null, -1, 0);
        }
    }

    public final boolean p3(RecyclerView recyclerView, int i9, Rect rect) {
        int i10;
        int i11;
        int i12;
        int iH0 = h0();
        if ((i9 & 2) != 0) {
            i11 = iH0;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = iH0 - 1;
            i11 = -1;
            i12 = -1;
        }
        int iG = this.f15701a0.a().g();
        int iC = this.f15701a0.a().c() + iG;
        while (i10 != i11) {
            View viewG0 = g0(i10);
            if (viewG0.getVisibility() == 0 && h3(viewG0) >= iG && g3(viewG0) <= iC && viewG0.requestFocus(i9, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    public void p4(B b9) {
        if (b9 == null) {
            this.f15679E = null;
            return;
        }
        ArrayList arrayList = this.f15679E;
        if (arrayList == null) {
            this.f15679E = new ArrayList();
        } else {
            arrayList.clear();
        }
        this.f15679E.add(b9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void q1(RecyclerView recyclerView, int i9, int i10) {
        AbstractC1157l abstractC1157l;
        int i11;
        int i12;
        int i13;
        if (this.f15680F != -1 && (abstractC1157l = this.f15699Y) != null && abstractC1157l.m() >= 0 && (i11 = this.f15684J) != Integer.MIN_VALUE && i9 <= (i13 = (i12 = this.f15680F) + i11)) {
            if (i9 + i10 > i13) {
                this.f15680F = i12 + i11 + (i9 - i13);
                this.f15684J = Integer.MIN_VALUE;
            } else {
                this.f15684J = i11 - i10;
            }
        }
        this.f15706f0.b();
    }

    public final void q2() {
        AbstractC1157l.a aVarQ;
        int iH0 = h0();
        int iM = this.f15699Y.m();
        this.f15677C &= -9;
        int i9 = 0;
        while (i9 < iH0) {
            View viewG0 = g0(i9);
            if (iM == y2(viewG0) && (aVarQ = this.f15699Y.q(iM)) != null) {
                int iR2 = (R2(aVarQ.f15672a) + this.f15701a0.c().g()) - this.f15687M;
                int iH3 = h3(viewG0);
                int iI3 = i3(viewG0);
                if (((e) viewG0.getLayoutParams()).g()) {
                    this.f15677C |= 8;
                    U(viewG0, this.f15676B);
                    viewG0 = f3(iM);
                    B(viewG0, i9);
                }
                View view = viewG0;
                B3(view);
                int iD2 = this.f15712u == 0 ? D2(view) : C2(view);
                y3(aVarQ.f15672a, view, iH3, iH3 + iD2, iR2);
                if (iI3 == iD2) {
                    i9++;
                    iM++;
                }
            }
            int iP = this.f15699Y.p();
            for (int i10 = iH0 - 1; i10 >= i9; i10--) {
                U(g0(i10), this.f15676B);
            }
            this.f15699Y.t(iM);
            if ((this.f15677C & 65536) != 0) {
                l2();
                int i11 = this.f15680F;
                if (i11 >= 0 && i11 <= iP) {
                    while (this.f15699Y.p() < this.f15680F) {
                        this.f15699Y.a();
                    }
                }
            } else {
                while (this.f15699Y.a() && this.f15699Y.p() < iP) {
                }
            }
            K4();
            L4();
        }
        K4();
        L4();
    }

    public boolean q3() {
        return w0() == 0 || this.f15711t.Z(0) != null;
    }

    public void q4(int i9) {
        if (i9 == 0 || i9 == 1) {
            this.f15712u = i9;
            this.f15713v = androidx.recyclerview.widget.j.b(this, i9);
            this.f15701a0.d(i9);
            this.f15702b0.b(i9);
            this.f15677C |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r0(View view) {
        return super.r0(view) - ((e) view.getLayoutParams()).f15725h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void r1(RecyclerView recyclerView, int i9, int i10) {
        int i11 = i10 + i9;
        while (i9 < i11) {
            this.f15706f0.h(i9);
            i9++;
        }
    }

    public void r2() {
        List listK = this.f15676B.k();
        int size = listK.size();
        if (size == 0) {
            return;
        }
        int[] iArr = this.f15675A;
        if (iArr == null || size > iArr.length) {
            int length = iArr == null ? 16 : iArr.length;
            while (length < size) {
                length <<= 1;
            }
            this.f15675A = new int[length];
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int iM = ((RecyclerView.D) listK.get(i10)).m();
            if (iM >= 0) {
                this.f15675A[i9] = iM;
                i9++;
            }
        }
        if (i9 > 0) {
            Arrays.sort(this.f15675A, 0, i9);
            this.f15699Y.h(this.f15675A, i9, this.f15717z);
        }
        this.f15717z.clear();
    }

    public boolean r3() {
        int iW0 = w0();
        return iW0 == 0 || this.f15711t.Z(iW0 - 1) != null;
    }

    public void r4(boolean z9) {
        int i9 = this.f15677C;
        if (((i9 & 65536) != 0) != z9) {
            this.f15677C = (i9 & (-65537)) | (z9 ? 65536 : 0);
            if (z9) {
                Q1();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s0(View view) {
        return super.s0(view) + ((e) view.getLayoutParams()).f15724g;
    }

    public final int s2(View view) {
        View viewZ;
        AbstractC1147b abstractC1147b = this.f15711t;
        if (abstractC1147b == null || view == abstractC1147b || (viewZ = Z(view)) == null) {
            return -1;
        }
        int iH0 = h0();
        for (int i9 = 0; i9 < iH0; i9++) {
            if (g0(i9) == viewZ) {
                return i9;
            }
        }
        return -1;
    }

    public boolean s3() {
        return this.f15699Y != null;
    }

    public void s4(int i9) {
        if (i9 >= 0 || i9 == -2) {
            this.f15688N = i9;
            return;
        }
        throw new IllegalArgumentException("Invalid row height: " + i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t1(RecyclerView.v vVar, RecyclerView.A a9) {
        int iD;
        int iE;
        int i9;
        int i10;
        int i11;
        if (this.f15697W != 0 && a9.c() >= 0) {
            if ((this.f15677C & 64) != 0 && h0() > 0) {
                this.f15677C |= 128;
                return;
            }
            int i12 = this.f15677C;
            if ((i12 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0) {
                n2();
                H1(vVar);
                return;
            }
            this.f15677C = (i12 & (-4)) | 1;
            P3(vVar, a9);
            int iMax = Integer.MIN_VALUE;
            if (a9.h()) {
                G4();
                int iH0 = h0();
                if (this.f15699Y != null && iH0 > 0) {
                    int iQ = this.f15711t.i0(g0(0)).q();
                    int iQ2 = this.f15711t.i0(g0(iH0 - 1)).q();
                    int iMin = a.e.API_PRIORITY_OTHER;
                    while (i < iH0) {
                        View viewG0 = g0(i);
                        e eVar = (e) viewG0.getLayoutParams();
                        int iG0 = this.f15711t.g0(viewG0);
                        if (eVar.d() || eVar.e() || viewG0.isLayoutRequested() || ((!viewG0.hasFocus() && this.f15680F == eVar.a()) || ((viewG0.hasFocus() && this.f15680F != eVar.a()) || iG0 < iQ || iG0 > iQ2))) {
                            iMin = Math.min(iMin, h3(viewG0));
                            iMax = Math.max(iMax, g3(viewG0));
                        }
                        i++;
                    }
                    if (iMax > iMin) {
                        this.f15716y = iMax - iMin;
                    }
                    l2();
                    J3();
                }
                this.f15677C &= -4;
                A3();
                return;
            }
            if (a9.j()) {
                H4();
            }
            boolean z9 = !T0() && this.f15700Z == 0;
            int i13 = this.f15680F;
            if (i13 != -1 && (i11 = this.f15684J) != Integer.MIN_VALUE) {
                this.f15680F = i13 + i11;
                this.f15681G = 0;
            }
            this.f15684J = 0;
            View viewA0 = a0(this.f15680F);
            int i14 = this.f15680F;
            int i15 = this.f15681G;
            boolean zHasFocus = this.f15711t.hasFocus();
            AbstractC1157l abstractC1157l = this.f15699Y;
            int iM = abstractC1157l != null ? abstractC1157l.m() : -1;
            AbstractC1157l abstractC1157l2 = this.f15699Y;
            int iP = abstractC1157l2 != null ? abstractC1157l2.p() : -1;
            if (this.f15712u == 0) {
                iE = a9.d();
                iD = a9.e();
            } else {
                iD = a9.d();
                iE = a9.e();
            }
            if (z3()) {
                this.f15677C |= 4;
                this.f15699Y.G(this.f15680F);
                q2();
            } else {
                int i16 = this.f15677C;
                this.f15677C = i16 & (-5);
                this.f15677C = (zHasFocus ? 16 : 0) | (i16 & (-21));
                if (z9 && (iM < 0 || (i9 = this.f15680F) > iP || i9 < iM)) {
                    iM = this.f15680F;
                    iP = iM;
                }
                this.f15699Y.G(iM);
                if (iP != -1) {
                    while (k2() && a0(iP) == null) {
                    }
                }
            }
            while (true) {
                K4();
                int iM2 = this.f15699Y.m();
                int iP2 = this.f15699Y.p();
                v2(zHasFocus, z9, -iE, -iD);
                l2();
                J3();
                if (this.f15699Y.m() == iM2 && this.f15699Y.p() == iP2) {
                    break;
                }
            }
            O3();
            N3();
            if (a9.j()) {
                r2();
            }
            int i17 = this.f15677C;
            if ((i17 & 1024) != 0) {
                this.f15677C = i17 & (-1025);
            } else {
                I4();
            }
            if (((this.f15677C & 4) != 0 && ((i10 = this.f15680F) != i14 || this.f15681G != i15 || a0(i10) != viewA0 || (this.f15677C & 8) != 0)) || (this.f15677C & 20) == 16) {
                o2();
            }
            p2();
            if ((this.f15677C & 64) != 0) {
                Q3(W2());
            }
            this.f15677C &= -4;
            A3();
        }
    }

    public void t2(RecyclerView recyclerView, RecyclerView.D d9, int i9, int i10) {
        ArrayList arrayList = this.f15679E;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((B) this.f15679E.get(size)).a(recyclerView, d9, i9, i10);
        }
    }

    public boolean t3() {
        ArrayList arrayList = this.f15679E;
        return arrayList != null && arrayList.size() > 0;
    }

    public void t4(boolean z9) {
        int i9;
        int i10 = this.f15677C;
        if (((i10 & 131072) != 0) != z9) {
            int i11 = (i10 & (-131073)) | (z9 ? 131072 : 0);
            this.f15677C = i11;
            if ((i11 & 131072) == 0 || this.f15700Z != 0 || (i9 = this.f15680F) == -1) {
                return;
            }
            T3(i9, this.f15681G, true, this.f15685K);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void u1(RecyclerView.A a9) {
    }

    public void u2(RecyclerView recyclerView, RecyclerView.D d9, int i9, int i10) {
        ArrayList arrayList = this.f15679E;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((B) this.f15679E.get(size)).b(recyclerView, d9, i9, i10);
        }
    }

    public final void u3() {
        this.f15701a0.b();
        this.f15701a0.f15635c.x(I0());
        this.f15701a0.f15634b.x(u0());
        this.f15701a0.f15635c.t(o(), k());
        this.f15701a0.f15634b.t(n(), b());
        this.f15703c0 = this.f15701a0.a().i();
        this.f15687M = 0;
    }

    public void u4(int i9, int i10) {
        v4(i9, 0, false, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v1(androidx.recyclerview.widget.RecyclerView.v r7, androidx.recyclerview.widget.RecyclerView.A r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C1158m.v1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$A, int, int):void");
    }

    public final void v2(boolean z9, boolean z10, int i9, int i10) {
        View viewA0 = a0(this.f15680F);
        if (viewA0 != null && z10) {
            X3(viewA0, false, i9, i10);
        }
        if (viewA0 != null && z9 && !viewA0.hasFocus()) {
            viewA0.requestFocus();
            return;
        }
        if (z9 || this.f15711t.hasFocus()) {
            return;
        }
        if (viewA0 != null && viewA0.hasFocusable()) {
            this.f15711t.focusableViewAvailable(viewA0);
            break;
        }
        int iH0 = h0();
        for (int i11 = 0; i11 < iH0; i11++) {
            viewA0 = g0(i11);
            if (viewA0 != null && viewA0.hasFocusable()) {
                this.f15711t.focusableViewAvailable(viewA0);
                break;
            }
        }
        if (z10 && viewA0 != null && viewA0.hasFocus()) {
            X3(viewA0, false, i9, i10);
        }
    }

    public boolean v3(int i9) {
        RecyclerView.D dZ = this.f15711t.Z(i9);
        return dZ != null && dZ.f16733a.getLeft() >= 0 && dZ.f16733a.getRight() <= this.f15711t.getWidth() && dZ.f16733a.getTop() >= 0 && dZ.f16733a.getBottom() <= this.f15711t.getHeight();
    }

    public void v4(int i9, int i10, boolean z9, int i11) {
        if ((this.f15680F == i9 || i9 == -1) && i10 == this.f15681G && i11 == this.f15685K) {
            return;
        }
        T3(i9, i10, z9, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w1(RecyclerView recyclerView, View view, View view2) {
        if ((this.f15677C & 32768) == 0 && y2(view) != -1 && (this.f15677C & 35) == 0) {
            U3(view, view2, true);
        }
        return true;
    }

    public final void w2() {
        P.L.k0(this.f15711t, this.f15708h0);
    }

    public boolean w3() {
        return (this.f15677C & 131072) != 0;
    }

    public void w4(int i9) {
        v4(i9, 0, true, 0);
    }

    public final int x2(int i9) {
        return y2(g0(i9));
    }

    public boolean x3() {
        return (this.f15677C & 64) != 0;
    }

    public void x4(int i9, int i10, int i11) {
        v4(i9, i10, false, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void y1(Parcelable parcelable) {
        if (parcelable instanceof g) {
            g gVar = (g) parcelable;
            this.f15680F = gVar.f15733a;
            this.f15684J = 0;
            this.f15706f0.f(gVar.f15734c);
            this.f15677C |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
            Q1();
        }
    }

    public final int y2(View view) {
        e eVar;
        if (view == null || (eVar = (e) view.getLayoutParams()) == null || eVar.e()) {
            return -1;
        }
        return eVar.a();
    }

    public void y3(int i9, View view, int i10, int i11, int i12) {
        int iQ2;
        int iC2 = this.f15712u == 0 ? C2(view) : D2(view);
        int i13 = this.f15689O;
        if (i13 > 0) {
            iC2 = Math.min(iC2, i13);
        }
        int i14 = this.f15696V;
        int i15 = i14 & 112;
        int absoluteGravity = (this.f15677C & 786432) != 0 ? Gravity.getAbsoluteGravity(i14 & 8388615, 1) : i14 & 7;
        int i16 = this.f15712u;
        if ((i16 != 0 || i15 != 48) && (i16 != 1 || absoluteGravity != 3)) {
            if ((i16 == 0 && i15 == 80) || (i16 == 1 && absoluteGravity == 5)) {
                iQ2 = Q2(i9) - iC2;
            } else if ((i16 == 0 && i15 == 16) || (i16 == 1 && absoluteGravity == 1)) {
                iQ2 = (Q2(i9) - iC2) / 2;
            }
            i12 += iQ2;
        }
        int i17 = iC2 + i12;
        if (this.f15712u != 0) {
            int i18 = i12;
            i12 = i10;
            i10 = i18;
            i17 = i11;
            i11 = i17;
        }
        e eVar = (e) view.getLayoutParams();
        V0(view, i10, i12, i11, i17);
        Rect rect = f15673j0;
        super.n0(view, rect);
        eVar.L(i10 - rect.left, i12 - rect.top, rect.right - i11, rect.bottom - i17);
        F4(view);
    }

    public void y4(int i9) {
        int i10 = this.f15712u;
        this.f15693S = i9;
        if (i10 == 1) {
            this.f15694T = i9;
        } else {
            this.f15695U = i9;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable z1() {
        g gVar = new g();
        gVar.f15733a = U2();
        Bundle bundleI = this.f15706f0.i();
        int iH0 = h0();
        for (int i9 = 0; i9 < iH0; i9++) {
            View viewG0 = g0(i9);
            int iY2 = y2(viewG0);
            if (iY2 != -1) {
                bundleI = this.f15706f0.k(bundleI, viewG0, iY2);
            }
        }
        gVar.f15734c = bundleI;
        return gVar;
    }

    public final int z2(int i9, View view, View view2) {
        int iX2 = X2(view, view2);
        if (iX2 == 0) {
            return i9;
        }
        e eVar = (e) view.getLayoutParams();
        return i9 + (eVar.h()[iX2] - eVar.h()[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z3() {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$A r0 = r5.f15714w
            int r0 = r0.c()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L10
            r5.f15680F = r1
        Ld:
            r5.f15681G = r3
            goto L1f
        L10:
            int r4 = r5.f15680F
            if (r4 < r0) goto L18
            int r0 = r0 - r2
            r5.f15680F = r0
            goto Ld
        L18:
            if (r4 != r1) goto L1f
            if (r0 <= 0) goto L1f
            r5.f15680F = r3
            goto Ld
        L1f:
            androidx.recyclerview.widget.RecyclerView$A r0 = r5.f15714w
            boolean r0 = r0.b()
            if (r0 != 0) goto L4f
            androidx.leanback.widget.l r0 = r5.f15699Y
            if (r0 == 0) goto L4f
            int r0 = r0.m()
            if (r0 < 0) goto L4f
            int r0 = r5.f15677C
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L4f
            androidx.leanback.widget.l r0 = r5.f15699Y
            int r0 = r0.r()
            int r1 = r5.f15697W
            if (r0 != r1) goto L4f
            r5.J4()
            r5.L4()
            androidx.leanback.widget.l r0 = r5.f15699Y
            int r1 = r5.f15694T
            r0.F(r1)
            return r2
        L4f:
            int r0 = r5.f15677C
            r0 = r0 & (-257(0xfffffffffffffeff, float:NaN))
            r5.f15677C = r0
            androidx.leanback.widget.l r0 = r5.f15699Y
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 == 0) goto L73
            int r4 = r5.f15697W
            int r0 = r0.r()
            if (r4 != r0) goto L73
            int r0 = r5.f15677C
            r0 = r0 & r1
            if (r0 == 0) goto L6a
            r0 = 1
            goto L6b
        L6a:
            r0 = 0
        L6b:
            androidx.leanback.widget.l r4 = r5.f15699Y
            boolean r4 = r4.u()
            if (r0 == r4) goto L8c
        L73:
            int r0 = r5.f15697W
            androidx.leanback.widget.l r0 = androidx.leanback.widget.AbstractC1157l.g(r0)
            r5.f15699Y = r0
            androidx.leanback.widget.l$b r4 = r5.f15709i0
            r0.D(r4)
            androidx.leanback.widget.l r0 = r5.f15699Y
            int r4 = r5.f15677C
            r1 = r1 & r4
            if (r1 == 0) goto L88
            goto L89
        L88:
            r2 = 0
        L89:
            r0.E(r2)
        L8c:
            r5.u3()
            r5.L4()
            androidx.leanback.widget.l r0 = r5.f15699Y
            int r1 = r5.f15694T
            r0.F(r1)
            androidx.recyclerview.widget.RecyclerView$v r0 = r5.f15676B
            r5.T(r0)
            androidx.leanback.widget.l r0 = r5.f15699Y
            r0.A()
            androidx.leanback.widget.c0 r0 = r5.f15701a0
            androidx.leanback.widget.c0$a r0 = r0.a()
            r0.n()
            androidx.leanback.widget.c0 r0 = r5.f15701a0
            androidx.leanback.widget.c0$a r0 = r0.a()
            r0.m()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C1158m.z3():boolean");
    }

    public void z4(int i9) {
        this.f15701a0.a().y(i9);
    }
}
