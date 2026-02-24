package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.j;
import com.google.android.flexbox.a;
import g4.C1836c;
import g4.InterfaceC1834a;
import g4.InterfaceC1835b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FlexboxLayoutManager extends RecyclerView.o implements InterfaceC1834a, RecyclerView.z.b {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Rect f26157S = new Rect();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final com.google.android.flexbox.a f26158A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RecyclerView.v f26159B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public RecyclerView.A f26160C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public d f26161D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public b f26162E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public j f26163F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public j f26164G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public e f26165H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f26166I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f26167J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f26168K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f26169L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f26170M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SparseArray f26171N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Context f26172O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public View f26173P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f26174Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public a.C0251a f26175R;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f26176s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f26177t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f26178u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f26179v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f26180w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f26181x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f26182y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f26183z;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f26186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f26187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f26188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f26189f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f26190g;

        public b() {
            this.f26187d = 0;
        }

        public static /* synthetic */ int l(b bVar, int i9) {
            int i10 = bVar.f26187d + i9;
            bVar.f26187d = i10;
            return i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void r() {
            /*
                r2 = this;
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                boolean r0 = r0.x()
                if (r0 != 0) goto L33
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                boolean r0 = com.google.android.flexbox.FlexboxLayoutManager.m2(r0)
                if (r0 == 0) goto L33
                boolean r0 = r2.f26188e
                if (r0 == 0) goto L1f
            L14:
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                androidx.recyclerview.widget.j r0 = com.google.android.flexbox.FlexboxLayoutManager.n2(r0)
                int r0 = r0.i()
                goto L30
            L1f:
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                int r0 = r0.I0()
                com.google.android.flexbox.FlexboxLayoutManager r1 = com.google.android.flexbox.FlexboxLayoutManager.this
                androidx.recyclerview.widget.j r1 = com.google.android.flexbox.FlexboxLayoutManager.n2(r1)
                int r1 = r1.m()
                int r0 = r0 - r1
            L30:
                r2.f26186c = r0
                goto L43
            L33:
                boolean r0 = r2.f26188e
                if (r0 == 0) goto L38
                goto L14
            L38:
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                androidx.recyclerview.widget.j r0 = com.google.android.flexbox.FlexboxLayoutManager.n2(r0)
                int r0 = r0.m()
                goto L30
            L43:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.b.r():void");
        }

        public final void s(View view) {
            int iG;
            int iD;
            j jVar = FlexboxLayoutManager.this.f26177t == 0 ? FlexboxLayoutManager.this.f26164G : FlexboxLayoutManager.this.f26163F;
            if (FlexboxLayoutManager.this.x() || !FlexboxLayoutManager.this.f26181x) {
                if (this.f26188e) {
                    iD = jVar.d(view);
                    this.f26186c = iD + jVar.o();
                } else {
                    iG = jVar.g(view);
                    this.f26186c = iG;
                }
            } else if (this.f26188e) {
                iD = jVar.g(view);
                this.f26186c = iD + jVar.o();
            } else {
                iG = jVar.d(view);
                this.f26186c = iG;
            }
            this.f26184a = FlexboxLayoutManager.this.B0(view);
            this.f26190g = false;
            int[] iArr = FlexboxLayoutManager.this.f26158A.f26215c;
            int i9 = this.f26184a;
            if (i9 == -1) {
                i9 = 0;
            }
            int i10 = iArr[i9];
            this.f26185b = i10 != -1 ? i10 : 0;
            if (FlexboxLayoutManager.this.f26183z.size() > this.f26185b) {
                this.f26184a = ((C1836c) FlexboxLayoutManager.this.f26183z.get(this.f26185b)).f41347o;
            }
        }

        public final void t() {
            this.f26184a = -1;
            this.f26185b = -1;
            this.f26186c = Integer.MIN_VALUE;
            boolean z9 = false;
            this.f26189f = false;
            this.f26190g = false;
            if (!FlexboxLayoutManager.this.x() ? !(FlexboxLayoutManager.this.f26177t != 0 ? FlexboxLayoutManager.this.f26177t != 2 : FlexboxLayoutManager.this.f26176s != 3) : !(FlexboxLayoutManager.this.f26177t != 0 ? FlexboxLayoutManager.this.f26177t != 2 : FlexboxLayoutManager.this.f26176s != 1)) {
                z9 = true;
            }
            this.f26188e = z9;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f26184a + ", mFlexLinePosition=" + this.f26185b + ", mCoordinate=" + this.f26186c + ", mPerpendicularCoordinate=" + this.f26187d + ", mLayoutFromEnd=" + this.f26188e + ", mValid=" + this.f26189f + ", mAssignedFromSavedState=" + this.f26190g + '}';
        }
    }

    public static class c extends RecyclerView.p implements InterfaceC1835b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f26192f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f26193g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f26194h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f26195i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26196j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f26197k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f26198l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f26199m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f26200n;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i9) {
                return new c[i9];
            }
        }

        public c(int i9, int i10) {
            super(i9, i10);
            this.f26192f = 0.0f;
            this.f26193g = 1.0f;
            this.f26194h = -1;
            this.f26195i = -1.0f;
            this.f26198l = 16777215;
            this.f26199m = 16777215;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f26192f = 0.0f;
            this.f26193g = 1.0f;
            this.f26194h = -1;
            this.f26195i = -1.0f;
            this.f26198l = 16777215;
            this.f26199m = 16777215;
        }

        public c(Parcel parcel) {
            super(-2, -2);
            this.f26192f = 0.0f;
            this.f26193g = 1.0f;
            this.f26194h = -1;
            this.f26195i = -1.0f;
            this.f26198l = 16777215;
            this.f26199m = 16777215;
            this.f26192f = parcel.readFloat();
            this.f26193g = parcel.readFloat();
            this.f26194h = parcel.readInt();
            this.f26195i = parcel.readFloat();
            this.f26196j = parcel.readInt();
            this.f26197k = parcel.readInt();
            this.f26198l = parcel.readInt();
            this.f26199m = parcel.readInt();
            this.f26200n = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        @Override // g4.InterfaceC1835b
        public int D() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // g4.InterfaceC1835b
        public int E() {
            return this.f26197k;
        }

        @Override // g4.InterfaceC1835b
        public int F() {
            return this.f26199m;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // g4.InterfaceC1835b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // g4.InterfaceC1835b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // g4.InterfaceC1835b
        public int i() {
            return this.f26194h;
        }

        @Override // g4.InterfaceC1835b
        public float j() {
            return this.f26193g;
        }

        @Override // g4.InterfaceC1835b
        public int l() {
            return this.f26196j;
        }

        @Override // g4.InterfaceC1835b
        public int n() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // g4.InterfaceC1835b
        public void o(int i9) {
            this.f26197k = i9;
        }

        @Override // g4.InterfaceC1835b
        public float p() {
            return this.f26192f;
        }

        @Override // g4.InterfaceC1835b
        public float q() {
            return this.f26195i;
        }

        @Override // g4.InterfaceC1835b
        public boolean s() {
            return this.f26200n;
        }

        @Override // g4.InterfaceC1835b
        public void setMinWidth(int i9) {
            this.f26196j = i9;
        }

        @Override // g4.InterfaceC1835b
        public int u() {
            return this.f26198l;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeFloat(this.f26192f);
            parcel.writeFloat(this.f26193g);
            parcel.writeInt(this.f26194h);
            parcel.writeFloat(this.f26195i);
            parcel.writeInt(this.f26196j);
            parcel.writeInt(this.f26197k);
            parcel.writeInt(this.f26198l);
            parcel.writeInt(this.f26199m);
            parcel.writeByte(this.f26200n ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // g4.InterfaceC1835b
        public int y() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // g4.InterfaceC1835b
        public int z() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f26202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f26203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f26204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f26205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f26206f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f26207g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f26208h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f26209i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f26210j;

        public d() {
            this.f26208h = 1;
            this.f26209i = 1;
        }

        public static /* synthetic */ int c(d dVar, int i9) {
            int i10 = dVar.f26205e + i9;
            dVar.f26205e = i10;
            return i10;
        }

        public static /* synthetic */ int d(d dVar, int i9) {
            int i10 = dVar.f26205e - i9;
            dVar.f26205e = i10;
            return i10;
        }

        public static /* synthetic */ int i(d dVar, int i9) {
            int i10 = dVar.f26201a - i9;
            dVar.f26201a = i10;
            return i10;
        }

        public static /* synthetic */ int l(d dVar) {
            int i9 = dVar.f26203c;
            dVar.f26203c = i9 + 1;
            return i9;
        }

        public static /* synthetic */ int m(d dVar) {
            int i9 = dVar.f26203c;
            dVar.f26203c = i9 - 1;
            return i9;
        }

        public static /* synthetic */ int n(d dVar, int i9) {
            int i10 = dVar.f26203c + i9;
            dVar.f26203c = i10;
            return i10;
        }

        public static /* synthetic */ int q(d dVar, int i9) {
            int i10 = dVar.f26206f + i9;
            dVar.f26206f = i10;
            return i10;
        }

        public static /* synthetic */ int u(d dVar, int i9) {
            int i10 = dVar.f26204d + i9;
            dVar.f26204d = i10;
            return i10;
        }

        public static /* synthetic */ int v(d dVar, int i9) {
            int i10 = dVar.f26204d - i9;
            dVar.f26204d = i10;
            return i10;
        }

        public final boolean D(RecyclerView.A a9, List list) {
            int i9;
            int i10 = this.f26204d;
            return i10 >= 0 && i10 < a9.c() && (i9 = this.f26203c) >= 0 && i9 < list.size();
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f26201a + ", mFlexLinePosition=" + this.f26203c + ", mPosition=" + this.f26204d + ", mOffset=" + this.f26205e + ", mScrollingOffset=" + this.f26206f + ", mLastScrollDelta=" + this.f26207g + ", mItemDirection=" + this.f26208h + ", mLayoutDirection=" + this.f26209i + '}';
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26211a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f26212c;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i9) {
                return new e[i9];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f26211a = parcel.readInt();
            this.f26212c = parcel.readInt();
        }

        public e(e eVar) {
            this.f26211a = eVar.f26211a;
            this.f26212c = eVar.f26212c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean h(int i9) {
            int i10 = this.f26211a;
            return i10 >= 0 && i10 < i9;
        }

        public final void k() {
            this.f26211a = -1;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f26211a + ", mAnchorOffset=" + this.f26212c + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeInt(this.f26211a);
            parcel.writeInt(this.f26212c);
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    public FlexboxLayoutManager(Context context, int i9, int i10) {
        this.f26180w = -1;
        this.f26183z = new ArrayList();
        this.f26158A = new com.google.android.flexbox.a(this);
        this.f26162E = new b();
        this.f26166I = -1;
        this.f26167J = Integer.MIN_VALUE;
        this.f26168K = Integer.MIN_VALUE;
        this.f26169L = Integer.MIN_VALUE;
        this.f26171N = new SparseArray();
        this.f26174Q = -1;
        this.f26175R = new a.C0251a();
        d3(i9);
        e3(i10);
        c3(4);
        this.f26172O = context;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        int i11;
        this.f26180w = -1;
        this.f26183z = new ArrayList();
        this.f26158A = new com.google.android.flexbox.a(this);
        this.f26162E = new b();
        this.f26166I = -1;
        this.f26167J = Integer.MIN_VALUE;
        this.f26168K = Integer.MIN_VALUE;
        this.f26169L = Integer.MIN_VALUE;
        this.f26171N = new SparseArray();
        this.f26174Q = -1;
        this.f26175R = new a.C0251a();
        RecyclerView.o.d dVarC0 = RecyclerView.o.C0(context, attributeSet, i9, i10);
        int i12 = dVarC0.f16789a;
        if (i12 != 0) {
            if (i12 == 1) {
                i11 = dVarC0.f16791c ? 3 : 2;
                d3(i11);
            }
        } else if (dVarC0.f16791c) {
            d3(1);
        } else {
            i11 = 0;
            d3(i11);
        }
        e3(1);
        c3(4);
        this.f26172O = context;
    }

    public static boolean S0(int i9, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i9 != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i9;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i9;
        }
        return true;
    }

    private boolean d2(View view, int i9, int i10, RecyclerView.p pVar) {
        return (!view.isLayoutRequested() && R0() && S0(view.getWidth(), i9, ((ViewGroup.MarginLayoutParams) pVar).width) && S0(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
    }

    private void x2() {
        if (this.f26161D == null) {
            this.f26161D = new d();
        }
    }

    public final View A2(int i9) {
        View viewH2 = H2(0, h0(), i9);
        if (viewH2 == null) {
            return null;
        }
        int i10 = this.f26158A.f26215c[B0(viewH2)];
        if (i10 == -1) {
            return null;
        }
        return B2(viewH2, (C1836c) this.f26183z.get(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View B2(android.view.View r6, g4.C1836c r7) {
        /*
            r5 = this;
            boolean r0 = r5.x()
            int r7 = r7.f41340h
            r1 = 1
        L7:
            if (r1 >= r7) goto L3f
            android.view.View r2 = r5.g0(r1)
            if (r2 == 0) goto L3c
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L18
            goto L3c
        L18:
            boolean r3 = r5.f26181x
            if (r3 == 0) goto L2d
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.j r3 = r5.f26163F
            int r3 = r3.d(r6)
            androidx.recyclerview.widget.j r4 = r5.f26163F
            int r4 = r4.d(r2)
            if (r3 >= r4) goto L3c
            goto L3b
        L2d:
            androidx.recyclerview.widget.j r3 = r5.f26163F
            int r3 = r3.g(r6)
            androidx.recyclerview.widget.j r4 = r5.f26163F
            int r4 = r4.g(r2)
            if (r3 <= r4) goto L3c
        L3b:
            r6 = r2
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.B2(android.view.View, g4.c):android.view.View");
    }

    public int C2() {
        View viewG2 = G2(0, h0(), false);
        if (viewG2 == null) {
            return -1;
        }
        return B0(viewG2);
    }

    public final View D2(int i9) {
        View viewH2 = H2(h0() - 1, -1, i9);
        if (viewH2 == null) {
            return null;
        }
        return E2(viewH2, (C1836c) this.f26183z.get(this.f26158A.f26215c[B0(viewH2)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View E2(android.view.View r6, g4.C1836c r7) {
        /*
            r5 = this;
            boolean r0 = r5.x()
            int r1 = r5.h0()
            int r1 = r1 + (-2)
            int r2 = r5.h0()
            int r7 = r7.f41340h
            int r2 = r2 - r7
            int r2 = r2 + (-1)
        L13:
            if (r1 <= r2) goto L4b
            android.view.View r7 = r5.g0(r1)
            if (r7 == 0) goto L48
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 != r4) goto L24
            goto L48
        L24:
            boolean r3 = r5.f26181x
            if (r3 == 0) goto L39
            if (r0 != 0) goto L39
            androidx.recyclerview.widget.j r3 = r5.f26163F
            int r3 = r3.g(r6)
            androidx.recyclerview.widget.j r4 = r5.f26163F
            int r4 = r4.g(r7)
            if (r3 <= r4) goto L48
            goto L47
        L39:
            androidx.recyclerview.widget.j r3 = r5.f26163F
            int r3 = r3.d(r6)
            androidx.recyclerview.widget.j r4 = r5.f26163F
            int r4 = r4.d(r7)
            if (r3 >= r4) goto L48
        L47:
            r6 = r7
        L48:
            int r1 = r1 + (-1)
            goto L13
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.E2(android.view.View, g4.c):android.view.View");
    }

    public int F2() {
        View viewG2 = G2(h0() - 1, -1, false);
        if (viewG2 == null) {
            return -1;
        }
        return B0(viewG2);
    }

    public final View G2(int i9, int i10, boolean z9) {
        int i11 = i10 > i9 ? 1 : -1;
        while (i9 != i10) {
            View viewG0 = g0(i9);
            if (S2(viewG0, z9)) {
                return viewG0;
            }
            i9 += i11;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean H() {
        if (this.f26177t == 0) {
            return x();
        }
        if (x()) {
            int iI0 = I0();
            View view = this.f26173P;
            if (iI0 <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    public final View H2(int i9, int i10, int i11) {
        int iB0;
        y2();
        x2();
        int iM = this.f26163F.m();
        int i12 = this.f26163F.i();
        int i13 = i10 > i9 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i9 != i10) {
            View viewG0 = g0(i9);
            if (viewG0 != null && (iB0 = B0(viewG0)) >= 0 && iB0 < i11) {
                if (((RecyclerView.p) viewG0.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = viewG0;
                    }
                } else {
                    if (this.f26163F.g(viewG0) >= iM && this.f26163F.d(viewG0) <= i12) {
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
    public boolean I() {
        if (this.f26177t == 0) {
            return !x();
        }
        if (x()) {
            return true;
        }
        int iU0 = u0();
        View view = this.f26173P;
        return iU0 > (view != null ? view.getHeight() : 0);
    }

    public final int I2(int i9, RecyclerView.v vVar, RecyclerView.A a9, boolean z9) {
        int iQ2;
        int i10;
        if (x() || !this.f26181x) {
            int i11 = this.f26163F.i() - i9;
            if (i11 <= 0) {
                return 0;
            }
            iQ2 = -Q2(-i11, vVar, a9);
        } else {
            int iM = i9 - this.f26163F.m();
            if (iM <= 0) {
                return 0;
            }
            iQ2 = Q2(iM, vVar, a9);
        }
        int i12 = i9 + iQ2;
        if (!z9 || (i10 = this.f26163F.i() - i12) <= 0) {
            return iQ2;
        }
        this.f26163F.r(i10);
        return i10 + iQ2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean J(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    public final int J2(int i9, RecyclerView.v vVar, RecyclerView.A a9, boolean z9) {
        int iQ2;
        int iM;
        if (x() || !this.f26181x) {
            int iM2 = i9 - this.f26163F.m();
            if (iM2 <= 0) {
                return 0;
            }
            iQ2 = -Q2(iM2, vVar, a9);
        } else {
            int i10 = this.f26163F.i() - i9;
            if (i10 <= 0) {
                return 0;
            }
            iQ2 = Q2(-i10, vVar, a9);
        }
        int i11 = i9 + iQ2;
        if (!z9 || (iM = i11 - this.f26163F.m()) <= 0) {
            return iQ2;
        }
        this.f26163F.r(-iM);
        return iQ2 - iM;
    }

    public final int K2(View view) {
        return m0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
    }

    public final View L2() {
        return g0(0);
    }

    public final int M2(View view) {
        return o0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.A a9) {
        return u2(a9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean N0() {
        return true;
    }

    public final int N2(View view) {
        return r0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int O(RecyclerView.A a9) {
        return v2(a9);
    }

    public final int O2(View view) {
        return s0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int P(RecyclerView.A a9) {
        return w2(a9);
    }

    public View P2(int i9) {
        View view = (View) this.f26171N.get(i9);
        return view != null ? view : this.f26159B.o(i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int Q(RecyclerView.A a9) {
        return u2(a9);
    }

    public final int Q2(int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        if (h0() == 0 || i9 == 0) {
            return 0;
        }
        y2();
        int i10 = 1;
        this.f26161D.f26210j = true;
        boolean z9 = !x() && this.f26181x;
        if (!z9 ? i9 <= 0 : i9 >= 0) {
            i10 = -1;
        }
        int iAbs = Math.abs(i9);
        l3(i10, iAbs);
        int iZ2 = this.f26161D.f26206f + z2(vVar, a9, this.f26161D);
        if (iZ2 < 0) {
            return 0;
        }
        if (z9) {
            if (iAbs > iZ2) {
                i9 = (-i10) * iZ2;
            }
        } else if (iAbs > iZ2) {
            i9 = i10 * iZ2;
        }
        this.f26163F.r(-i9);
        this.f26161D.f26207g = i9;
        return i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int R(RecyclerView.A a9) {
        return v2(a9);
    }

    public final int R2(int i9) {
        int iMin;
        if (h0() == 0 || i9 == 0) {
            return 0;
        }
        y2();
        boolean zX = x();
        View view = this.f26173P;
        int width = zX ? view.getWidth() : view.getHeight();
        int iI0 = zX ? I0() : u0();
        if (x0() == 1) {
            int iAbs = Math.abs(i9);
            if (i9 < 0) {
                iMin = Math.min((iI0 + this.f26162E.f26187d) - width, iAbs);
                return -iMin;
            }
            if (this.f26162E.f26187d + i9 <= 0) {
                return i9;
            }
        } else {
            if (i9 > 0) {
                return Math.min((iI0 - this.f26162E.f26187d) - width, i9);
            }
            if (this.f26162E.f26187d + i9 >= 0) {
                return i9;
            }
        }
        iMin = this.f26162E.f26187d;
        return -iMin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int S(RecyclerView.A a9) {
        return w2(a9);
    }

    public final boolean S2(View view, boolean z9) {
        int iO = o();
        int iN = n();
        int iI0 = I0() - k();
        int iU0 = u0() - b();
        int iM2 = M2(view);
        int iO2 = O2(view);
        int iN2 = N2(view);
        int iK2 = K2(view);
        return z9 ? (iO <= iM2 && iI0 >= iN2) && (iN <= iO2 && iU0 >= iK2) : (iM2 >= iI0 || iN2 >= iO) && (iO2 >= iU0 || iK2 >= iN);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int T1(int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        if (!x() || this.f26177t == 0) {
            int iQ2 = Q2(i9, vVar, a9);
            this.f26171N.clear();
            return iQ2;
        }
        int iR2 = R2(i9);
        b.l(this.f26162E, iR2);
        this.f26164G.r(-iR2);
        return iR2;
    }

    public final int T2(C1836c c1836c, d dVar) {
        return x() ? U2(c1836c, dVar) : V2(c1836c, dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U1(int i9) {
        this.f26166I = i9;
        this.f26167J = Integer.MIN_VALUE;
        e eVar = this.f26165H;
        if (eVar != null) {
            eVar.k();
        }
        Q1();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int U2(g4.C1836c r22, com.google.android.flexbox.FlexboxLayoutManager.d r23) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.U2(g4.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int V1(int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        if (x() || (this.f26177t == 0 && !x())) {
            int iQ2 = Q2(i9, vVar, a9);
            this.f26171N.clear();
            return iQ2;
        }
        int iR2 = R2(i9);
        b.l(this.f26162E, iR2);
        this.f26164G.r(-iR2);
        return iR2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int V2(g4.C1836c r26, com.google.android.flexbox.FlexboxLayoutManager.d r27) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.V2(g4.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    public final void W2(RecyclerView.v vVar, d dVar) {
        if (dVar.f26210j) {
            if (dVar.f26209i == -1) {
                Y2(vVar, dVar);
            } else {
                Z2(vVar, dVar);
            }
        }
    }

    public final void X2(RecyclerView.v vVar, int i9, int i10) {
        while (i10 >= i9) {
            K1(i10, vVar);
            i10--;
        }
    }

    public final void Y2(RecyclerView.v vVar, d dVar) {
        int iH0;
        int i9;
        View viewG0;
        int i10;
        if (dVar.f26206f < 0 || (iH0 = h0()) == 0 || (viewG0 = g0(iH0 - 1)) == null || (i10 = this.f26158A.f26215c[B0(viewG0)]) == -1) {
            return;
        }
        C1836c c1836c = (C1836c) this.f26183z.get(i10);
        int i11 = i9;
        while (true) {
            if (i11 < 0) {
                break;
            }
            View viewG02 = g0(i11);
            if (viewG02 != null) {
                if (!r2(viewG02, dVar.f26206f)) {
                    break;
                }
                if (c1836c.f41347o != B0(viewG02)) {
                    continue;
                } else if (i10 <= 0) {
                    iH0 = i11;
                    break;
                } else {
                    i10 += dVar.f26209i;
                    c1836c = (C1836c) this.f26183z.get(i10);
                    iH0 = i11;
                }
            }
            i11--;
        }
        X2(vVar, iH0, i9);
    }

    public final void Z2(RecyclerView.v vVar, d dVar) {
        int iH0;
        View viewG0;
        if (dVar.f26206f < 0 || (iH0 = h0()) == 0 || (viewG0 = g0(0)) == null) {
            return;
        }
        int i9 = this.f26158A.f26215c[B0(viewG0)];
        int i10 = -1;
        if (i9 == -1) {
            return;
        }
        C1836c c1836c = (C1836c) this.f26183z.get(i9);
        int i11 = 0;
        while (true) {
            if (i11 >= iH0) {
                break;
            }
            View viewG02 = g0(i11);
            if (viewG02 != null) {
                if (!s2(viewG02, dVar.f26206f)) {
                    break;
                }
                if (c1836c.f41348p != B0(viewG02)) {
                    continue;
                } else if (i9 >= this.f26183z.size() - 1) {
                    i10 = i11;
                    break;
                } else {
                    i9 += dVar.f26209i;
                    c1836c = (C1836c) this.f26183z.get(i9);
                    i10 = i11;
                }
            }
            i11++;
        }
        X2(vVar, 0, i10);
    }

    @Override // g4.InterfaceC1834a
    public void a(C1836c c1836c) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(RecyclerView.g gVar, RecyclerView.g gVar2) {
        G1();
    }

    public final void a3() {
        int iV0 = x() ? v0() : J0();
        this.f26161D.f26202b = iV0 == 0 || iV0 == Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p b0() {
        return new c(-2, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b3() {
        /*
            r6 = this;
            int r0 = r6.x0()
            int r1 = r6.f26176s
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L43
            if (r1 == r4) goto L36
            if (r1 == r2) goto L27
            r5 = 3
            if (r1 == r5) goto L17
            r6.f26181x = r3
        L14:
            r6.f26182y = r3
            goto L4f
        L17:
            if (r0 != r4) goto L1a
            r3 = 1
        L1a:
            r6.f26181x = r3
            int r0 = r6.f26177t
            if (r0 != r2) goto L24
            r0 = r3 ^ 1
            r6.f26181x = r0
        L24:
            r6.f26182y = r4
            goto L4f
        L27:
            if (r0 != r4) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            r6.f26181x = r0
            int r1 = r6.f26177t
            if (r1 != r2) goto L14
            r0 = r0 ^ r4
            r6.f26181x = r0
            goto L14
        L36:
            if (r0 == r4) goto L3a
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            r6.f26181x = r0
            int r0 = r6.f26177t
            if (r0 != r2) goto L14
        L41:
            r3 = 1
            goto L14
        L43:
            if (r0 != r4) goto L47
            r0 = 1
            goto L48
        L47:
            r0 = 0
        L48:
            r6.f26181x = r0
            int r0 = r6.f26177t
            if (r0 != r2) goto L14
            goto L41
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.b3():void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p c0(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView recyclerView) {
        super.c1(recyclerView);
        this.f26173P = (View) recyclerView.getParent();
    }

    public void c3(int i9) {
        int i10 = this.f26179v;
        if (i10 != i9) {
            if (i10 == 4 || i9 == 4) {
                G1();
                t2();
            }
            this.f26179v = i9;
            Q1();
        }
    }

    @Override // g4.InterfaceC1834a
    public int d() {
        return this.f26160C.c();
    }

    public void d3(int i9) {
        if (this.f26176s != i9) {
            G1();
            this.f26176s = i9;
            this.f26163F = null;
            this.f26164G = null;
            t2();
            Q1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF e(int i9) {
        View viewG0;
        if (h0() == 0 || (viewG0 = g0(0)) == null) {
            return null;
        }
        int i10 = i9 < B0(viewG0) ? -1 : 1;
        return x() ? new PointF(0.0f, i10) : new PointF(i10, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.e1(recyclerView, vVar);
        if (this.f26170M) {
            H1(vVar);
            vVar.c();
        }
    }

    public void e3(int i9) {
        if (i9 == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i10 = this.f26177t;
        if (i10 != i9) {
            if (i10 == 0 || i9 == 0) {
                G1();
                t2();
            }
            this.f26177t = i9;
            this.f26163F = null;
            this.f26164G = null;
            Q1();
        }
    }

    @Override // g4.InterfaceC1834a
    public int f() {
        return this.f26176s;
    }

    public void f3(int i9) {
        if (this.f26178u != i9) {
            this.f26178u = i9;
            Q1();
        }
    }

    @Override // g4.InterfaceC1834a
    public int g() {
        return this.f26180w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g2(RecyclerView recyclerView, RecyclerView.A a9, int i9) {
        h hVar = new h(recyclerView.getContext());
        hVar.p(i9);
        h2(hVar);
    }

    public final boolean g3(RecyclerView.A a9, b bVar) {
        if (h0() == 0) {
            return false;
        }
        View viewD2 = bVar.f26188e ? D2(a9.c()) : A2(a9.c());
        if (viewD2 == null) {
            return false;
        }
        bVar.s(viewD2);
        if (a9.h() || !j2()) {
            return true;
        }
        if (this.f26163F.g(viewD2) < this.f26163F.i() && this.f26163F.d(viewD2) >= this.f26163F.m()) {
            return true;
        }
        bVar.f26186c = bVar.f26188e ? this.f26163F.i() : this.f26163F.m();
        return true;
    }

    @Override // g4.InterfaceC1834a
    public int h() {
        if (this.f26183z.size() == 0) {
            return 0;
        }
        int size = this.f26183z.size();
        int iMax = Integer.MIN_VALUE;
        for (int i9 = 0; i9 < size; i9++) {
            iMax = Math.max(iMax, ((C1836c) this.f26183z.get(i9)).f41337e);
        }
        return iMax;
    }

    public final boolean h3(RecyclerView.A a9, b bVar, e eVar) {
        int i9;
        View viewG0;
        if (!a9.h() && (i9 = this.f26166I) != -1) {
            if (i9 >= 0 && i9 < a9.c()) {
                bVar.f26184a = this.f26166I;
                bVar.f26185b = this.f26158A.f26215c[bVar.f26184a];
                e eVar2 = this.f26165H;
                if (eVar2 != null && eVar2.h(a9.c())) {
                    bVar.f26186c = this.f26163F.m() + eVar.f26212c;
                    bVar.f26190g = true;
                    bVar.f26185b = -1;
                    return true;
                }
                if (this.f26167J != Integer.MIN_VALUE) {
                    bVar.f26186c = (x() || !this.f26181x) ? this.f26163F.m() + this.f26167J : this.f26167J - this.f26163F.j();
                    return true;
                }
                View viewA0 = a0(this.f26166I);
                if (viewA0 == null) {
                    if (h0() > 0 && (viewG0 = g0(0)) != null) {
                        bVar.f26188e = this.f26166I < B0(viewG0);
                    }
                    bVar.r();
                } else {
                    if (this.f26163F.e(viewA0) > this.f26163F.n()) {
                        bVar.r();
                        return true;
                    }
                    if (this.f26163F.g(viewA0) - this.f26163F.m() < 0) {
                        bVar.f26186c = this.f26163F.m();
                        bVar.f26188e = false;
                        return true;
                    }
                    if (this.f26163F.i() - this.f26163F.d(viewA0) < 0) {
                        bVar.f26186c = this.f26163F.i();
                        bVar.f26188e = true;
                        return true;
                    }
                    bVar.f26186c = bVar.f26188e ? this.f26163F.d(viewA0) + this.f26163F.o() : this.f26163F.g(viewA0);
                }
                return true;
            }
            this.f26166I = -1;
            this.f26167J = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // g4.InterfaceC1834a
    public int i(int i9, int i10, int i11) {
        return RecyclerView.o.i0(I0(), J0(), i10, i11, H());
    }

    public final void i3(RecyclerView.A a9, b bVar) {
        if (h3(a9, bVar, this.f26165H) || g3(a9, bVar)) {
            return;
        }
        bVar.r();
        bVar.f26184a = 0;
        bVar.f26185b = 0;
    }

    public final void j3(int i9) {
        if (i9 >= F2()) {
            return;
        }
        int iH0 = h0();
        this.f26158A.m(iH0);
        this.f26158A.n(iH0);
        this.f26158A.l(iH0);
        if (i9 >= this.f26158A.f26215c.length) {
            return;
        }
        this.f26174Q = i9;
        View viewL2 = L2();
        if (viewL2 == null) {
            return;
        }
        this.f26166I = B0(viewL2);
        this.f26167J = (x() || !this.f26181x) ? this.f26163F.g(viewL2) - this.f26163F.m() : this.f26163F.d(viewL2) + this.f26163F.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[PHI: r5
      0x0046: PHI (r5v3 boolean) = (r5v1 boolean), (r5v12 boolean) binds: [B:18:0x005b, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k3(int r12) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.k3(int):void");
    }

    @Override // g4.InterfaceC1834a
    public List l() {
        return this.f26183z;
    }

    public final void l3(int i9, int i10) {
        this.f26161D.f26209i = i9;
        boolean zX = x();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(I0(), J0());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(u0(), v0());
        boolean z9 = !zX && this.f26181x;
        if (i9 == 1) {
            View viewG0 = g0(h0() - 1);
            if (viewG0 == null) {
                return;
            }
            this.f26161D.f26205e = this.f26163F.d(viewG0);
            int iB0 = B0(viewG0);
            View viewE2 = E2(viewG0, (C1836c) this.f26183z.get(this.f26158A.f26215c[iB0]));
            this.f26161D.f26208h = 1;
            d dVar = this.f26161D;
            dVar.f26204d = iB0 + dVar.f26208h;
            if (this.f26158A.f26215c.length <= this.f26161D.f26204d) {
                this.f26161D.f26203c = -1;
            } else {
                d dVar2 = this.f26161D;
                dVar2.f26203c = this.f26158A.f26215c[dVar2.f26204d];
            }
            if (z9) {
                this.f26161D.f26205e = this.f26163F.g(viewE2);
                this.f26161D.f26206f = (-this.f26163F.g(viewE2)) + this.f26163F.m();
                d dVar3 = this.f26161D;
                dVar3.f26206f = Math.max(dVar3.f26206f, 0);
            } else {
                this.f26161D.f26205e = this.f26163F.d(viewE2);
                this.f26161D.f26206f = this.f26163F.d(viewE2) - this.f26163F.i();
            }
            if ((this.f26161D.f26203c == -1 || this.f26161D.f26203c > this.f26183z.size() - 1) && this.f26161D.f26204d <= d()) {
                int i11 = i10 - this.f26161D.f26206f;
                this.f26175R.a();
                if (i11 > 0) {
                    com.google.android.flexbox.a aVar = this.f26158A;
                    a.C0251a c0251a = this.f26175R;
                    int i12 = this.f26161D.f26204d;
                    List list = this.f26183z;
                    if (zX) {
                        aVar.c(c0251a, iMakeMeasureSpec, iMakeMeasureSpec2, i11, i12, list);
                    } else {
                        aVar.e(c0251a, iMakeMeasureSpec, iMakeMeasureSpec2, i11, i12, list);
                    }
                    this.f26158A.j(iMakeMeasureSpec, iMakeMeasureSpec2, this.f26161D.f26204d);
                    this.f26158A.P(this.f26161D.f26204d);
                }
            }
        } else {
            View viewG02 = g0(0);
            if (viewG02 == null) {
                return;
            }
            this.f26161D.f26205e = this.f26163F.g(viewG02);
            int iB02 = B0(viewG02);
            View viewB2 = B2(viewG02, (C1836c) this.f26183z.get(this.f26158A.f26215c[iB02]));
            this.f26161D.f26208h = 1;
            int i13 = this.f26158A.f26215c[iB02];
            if (i13 == -1) {
                i13 = 0;
            }
            if (i13 > 0) {
                this.f26161D.f26204d = iB02 - ((C1836c) this.f26183z.get(i13 - 1)).b();
            } else {
                this.f26161D.f26204d = -1;
            }
            this.f26161D.f26203c = i13 > 0 ? i13 - 1 : 0;
            d dVar4 = this.f26161D;
            j jVar = this.f26163F;
            if (z9) {
                dVar4.f26205e = jVar.d(viewB2);
                this.f26161D.f26206f = this.f26163F.d(viewB2) - this.f26163F.i();
                d dVar5 = this.f26161D;
                dVar5.f26206f = Math.max(dVar5.f26206f, 0);
            } else {
                dVar4.f26205e = jVar.g(viewB2);
                this.f26161D.f26206f = (-this.f26163F.g(viewB2)) + this.f26163F.m();
            }
        }
        d dVar6 = this.f26161D;
        dVar6.f26201a = i10 - dVar6.f26206f;
    }

    @Override // g4.InterfaceC1834a
    public int m(int i9, int i10, int i11) {
        return RecyclerView.o.i0(u0(), v0(), i10, i11, I());
    }

    public final void m3(b bVar, boolean z9, boolean z10) {
        d dVar;
        int i9;
        int iK;
        if (z10) {
            a3();
        } else {
            this.f26161D.f26202b = false;
        }
        if (x() || !this.f26181x) {
            dVar = this.f26161D;
            i9 = this.f26163F.i();
            iK = bVar.f26186c;
        } else {
            dVar = this.f26161D;
            i9 = bVar.f26186c;
            iK = k();
        }
        dVar.f26201a = i9 - iK;
        this.f26161D.f26204d = bVar.f26184a;
        this.f26161D.f26208h = 1;
        this.f26161D.f26209i = 1;
        this.f26161D.f26205e = bVar.f26186c;
        this.f26161D.f26206f = Integer.MIN_VALUE;
        this.f26161D.f26203c = bVar.f26185b;
        if (!z9 || this.f26183z.size() <= 1 || bVar.f26185b < 0 || bVar.f26185b >= this.f26183z.size() - 1) {
            return;
        }
        C1836c c1836c = (C1836c) this.f26183z.get(bVar.f26185b);
        d.l(this.f26161D);
        d.u(this.f26161D, c1836c.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n1(RecyclerView recyclerView, int i9, int i10) {
        super.n1(recyclerView, i9, i10);
        j3(i9);
    }

    public final void n3(b bVar, boolean z9, boolean z10) {
        d dVar;
        int width;
        if (z10) {
            a3();
        } else {
            this.f26161D.f26202b = false;
        }
        if (x() || !this.f26181x) {
            dVar = this.f26161D;
            width = bVar.f26186c;
        } else {
            dVar = this.f26161D;
            width = this.f26173P.getWidth() - bVar.f26186c;
        }
        dVar.f26201a = width - this.f26163F.m();
        this.f26161D.f26204d = bVar.f26184a;
        this.f26161D.f26208h = 1;
        this.f26161D.f26209i = -1;
        this.f26161D.f26205e = bVar.f26186c;
        this.f26161D.f26206f = Integer.MIN_VALUE;
        this.f26161D.f26203c = bVar.f26185b;
        if (!z9 || bVar.f26185b <= 0 || this.f26183z.size() <= bVar.f26185b) {
            return;
        }
        C1836c c1836c = (C1836c) this.f26183z.get(bVar.f26185b);
        d.m(this.f26161D);
        d.v(this.f26161D, c1836c.b());
    }

    @Override // g4.InterfaceC1834a
    public int p(View view) {
        int iY0;
        int iD0;
        if (x()) {
            iY0 = G0(view);
            iD0 = f0(view);
        } else {
            iY0 = y0(view);
            iD0 = D0(view);
        }
        return iY0 + iD0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p1(RecyclerView recyclerView, int i9, int i10, int i11) {
        super.p1(recyclerView, i9, i10, i11);
        j3(Math.min(i9, i10));
    }

    @Override // g4.InterfaceC1834a
    public void q(View view, int i9, int i10, C1836c c1836c) {
        int iG0;
        int iF0;
        G(view, f26157S);
        if (x()) {
            iG0 = y0(view);
            iF0 = D0(view);
        } else {
            iG0 = G0(view);
            iF0 = f0(view);
        }
        int i11 = iG0 + iF0;
        c1836c.f41337e += i11;
        c1836c.f41338f += i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void q1(RecyclerView recyclerView, int i9, int i10) {
        super.q1(recyclerView, i9, i10);
        j3(i9);
    }

    @Override // g4.InterfaceC1834a
    public int r() {
        return this.f26177t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void r1(RecyclerView recyclerView, int i9, int i10) {
        super.r1(recyclerView, i9, i10);
        j3(i9);
    }

    public final boolean r2(View view, int i9) {
        return (x() || !this.f26181x) ? this.f26163F.g(view) >= this.f26163F.h() - i9 : this.f26163F.d(view) <= i9;
    }

    @Override // g4.InterfaceC1834a
    public View s(int i9) {
        return P2(i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void s1(RecyclerView recyclerView, int i9, int i10, Object obj) {
        super.s1(recyclerView, i9, i10, obj);
        j3(i9);
    }

    public final boolean s2(View view, int i9) {
        return (x() || !this.f26181x) ? this.f26163F.d(view) <= i9 : this.f26163F.h() - this.f26163F.g(view) <= i9;
    }

    @Override // g4.InterfaceC1834a
    public int t() {
        return this.f26179v;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t1(RecyclerView.v vVar, RecyclerView.A a9) {
        int i9;
        int i10;
        this.f26159B = vVar;
        this.f26160C = a9;
        int iC = a9.c();
        if (iC == 0 && a9.h()) {
            return;
        }
        b3();
        y2();
        x2();
        this.f26158A.m(iC);
        this.f26158A.n(iC);
        this.f26158A.l(iC);
        this.f26161D.f26210j = false;
        e eVar = this.f26165H;
        if (eVar != null && eVar.h(iC)) {
            this.f26166I = this.f26165H.f26211a;
        }
        if (!this.f26162E.f26189f || this.f26166I != -1 || this.f26165H != null) {
            this.f26162E.t();
            i3(a9, this.f26162E);
            this.f26162E.f26189f = true;
        }
        T(vVar);
        if (this.f26162E.f26188e) {
            n3(this.f26162E, false, true);
        } else {
            m3(this.f26162E, false, true);
        }
        k3(iC);
        z2(vVar, a9, this.f26161D);
        if (this.f26162E.f26188e) {
            i10 = this.f26161D.f26205e;
            m3(this.f26162E, true, false);
            z2(vVar, a9, this.f26161D);
            i9 = this.f26161D.f26205e;
        } else {
            i9 = this.f26161D.f26205e;
            n3(this.f26162E, true, false);
            z2(vVar, a9, this.f26161D);
            i10 = this.f26161D.f26205e;
        }
        if (h0() > 0) {
            if (this.f26162E.f26188e) {
                J2(i10 + I2(i9, vVar, a9, true), vVar, a9, false);
            } else {
                I2(i9 + J2(i10, vVar, a9, true), vVar, a9, false);
            }
        }
    }

    public final void t2() {
        this.f26183z.clear();
        this.f26162E.t();
        this.f26162E.f26187d = 0;
    }

    @Override // g4.InterfaceC1834a
    public void u(int i9, View view) {
        this.f26171N.put(i9, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void u1(RecyclerView.A a9) {
        super.u1(a9);
        this.f26165H = null;
        this.f26166I = -1;
        this.f26167J = Integer.MIN_VALUE;
        this.f26174Q = -1;
        this.f26162E.t();
        this.f26171N.clear();
    }

    public final int u2(RecyclerView.A a9) {
        if (h0() == 0) {
            return 0;
        }
        int iC = a9.c();
        y2();
        View viewA2 = A2(iC);
        View viewD2 = D2(iC);
        if (a9.c() == 0 || viewA2 == null || viewD2 == null) {
            return 0;
        }
        return Math.min(this.f26163F.n(), this.f26163F.d(viewD2) - this.f26163F.g(viewA2));
    }

    @Override // g4.InterfaceC1834a
    public int v(View view, int i9, int i10) {
        int iG0;
        int iF0;
        if (x()) {
            iG0 = y0(view);
            iF0 = D0(view);
        } else {
            iG0 = G0(view);
            iF0 = f0(view);
        }
        return iG0 + iF0;
    }

    public final int v2(RecyclerView.A a9) {
        if (h0() == 0) {
            return 0;
        }
        int iC = a9.c();
        View viewA2 = A2(iC);
        View viewD2 = D2(iC);
        if (a9.c() != 0 && viewA2 != null && viewD2 != null) {
            int iB0 = B0(viewA2);
            int iB02 = B0(viewD2);
            int iAbs = Math.abs(this.f26163F.d(viewD2) - this.f26163F.g(viewA2));
            int i9 = this.f26158A.f26215c[iB0];
            if (i9 != 0 && i9 != -1) {
                return Math.round((i9 * (iAbs / ((r4[iB02] - i9) + 1))) + (this.f26163F.m() - this.f26163F.g(viewA2)));
            }
        }
        return 0;
    }

    public final int w2(RecyclerView.A a9) {
        if (h0() == 0) {
            return 0;
        }
        int iC = a9.c();
        View viewA2 = A2(iC);
        View viewD2 = D2(iC);
        if (a9.c() == 0 || viewA2 == null || viewD2 == null) {
            return 0;
        }
        int iC2 = C2();
        return (int) ((Math.abs(this.f26163F.d(viewD2) - this.f26163F.g(viewA2)) / ((F2() - iC2) + 1)) * a9.c());
    }

    @Override // g4.InterfaceC1834a
    public boolean x() {
        int i9 = this.f26176s;
        return i9 == 0 || i9 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void y1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f26165H = (e) parcelable;
            Q1();
        }
    }

    public final void y2() {
        j jVarA;
        if (this.f26163F != null) {
            return;
        }
        if (!x() ? this.f26177t == 0 : this.f26177t != 0) {
            this.f26163F = j.a(this);
            jVarA = j.c(this);
        } else {
            this.f26163F = j.c(this);
            jVarA = j.a(this);
        }
        this.f26164G = jVarA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable z1() {
        if (this.f26165H != null) {
            return new e(this.f26165H);
        }
        e eVar = new e();
        if (h0() > 0) {
            View viewL2 = L2();
            eVar.f26211a = B0(viewL2);
            eVar.f26212c = this.f26163F.g(viewL2) - this.f26163F.m();
        } else {
            eVar.k();
        }
        return eVar;
    }

    public final int z2(RecyclerView.v vVar, RecyclerView.A a9, d dVar) {
        if (dVar.f26206f != Integer.MIN_VALUE) {
            if (dVar.f26201a < 0) {
                d.q(dVar, dVar.f26201a);
            }
            W2(vVar, dVar);
        }
        int i9 = dVar.f26201a;
        int iA = dVar.f26201a;
        boolean zX = x();
        int iT2 = 0;
        while (true) {
            if ((iA <= 0 && !this.f26161D.f26202b) || !dVar.D(a9, this.f26183z)) {
                break;
            }
            C1836c c1836c = (C1836c) this.f26183z.get(dVar.f26203c);
            dVar.f26204d = c1836c.f41347o;
            iT2 += T2(c1836c, dVar);
            if (zX || !this.f26181x) {
                d.c(dVar, c1836c.a() * dVar.f26209i);
            } else {
                d.d(dVar, c1836c.a() * dVar.f26209i);
            }
            iA -= c1836c.a();
        }
        d.i(dVar, iT2);
        if (dVar.f26206f != Integer.MIN_VALUE) {
            d.q(dVar, iT2);
            if (dVar.f26201a < 0) {
                d.q(dVar, dVar.f26201a);
            }
            W2(vVar, dVar);
        }
        return i9 - dVar.f26201a;
    }
}
