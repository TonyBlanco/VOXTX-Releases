package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import com.google.android.gms.common.api.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements f.h, RecyclerView.z.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f16585A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f16586B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f16587C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public d f16588D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final a f16589E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final b f16590F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f16591G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int[] f16592H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f16594t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j f16595u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16596v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16598x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16599y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f16600z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j f16601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f16605e;

        public a() {
            e();
        }

        public void a() {
            this.f16603c = this.f16604d ? this.f16601a.i() : this.f16601a.m();
        }

        public void b(View view, int i9) {
            this.f16603c = this.f16604d ? this.f16601a.d(view) + this.f16601a.o() : this.f16601a.g(view);
            this.f16602b = i9;
        }

        public void c(View view, int i9) {
            int iO = this.f16601a.o();
            if (iO >= 0) {
                b(view, i9);
                return;
            }
            this.f16602b = i9;
            if (this.f16604d) {
                int i10 = (this.f16601a.i() - iO) - this.f16601a.d(view);
                this.f16603c = this.f16601a.i() - i10;
                if (i10 > 0) {
                    int iE = this.f16603c - this.f16601a.e(view);
                    int iM = this.f16601a.m();
                    int iMin = iE - (iM + Math.min(this.f16601a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f16603c += Math.min(i10, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f16601a.g(view);
            int iM2 = iG - this.f16601a.m();
            this.f16603c = iG;
            if (iM2 > 0) {
                int i11 = (this.f16601a.i() - Math.min(0, (this.f16601a.i() - iO) - this.f16601a.d(view))) - (iG + this.f16601a.e(view));
                if (i11 < 0) {
                    this.f16603c -= Math.min(iM2, -i11);
                }
            }
        }

        public boolean d(View view, RecyclerView.A a9) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.e() && pVar.c() >= 0 && pVar.c() < a9.c();
        }

        public void e() {
            this.f16602b = -1;
            this.f16603c = Integer.MIN_VALUE;
            this.f16604d = false;
            this.f16605e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f16602b + ", mCoordinate=" + this.f16603c + ", mLayoutFromEnd=" + this.f16604d + ", mValid=" + this.f16605e + '}';
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16609d;

        public void a() {
            this.f16606a = 0;
            this.f16607b = false;
            this.f16608c = false;
            this.f16609d = false;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16615f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f16616g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f16620k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f16622m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f16610a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f16617h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f16618i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f16619j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List f16621l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            this.f16613d = viewF == null ? -1 : ((RecyclerView.p) viewF.getLayoutParams()).c();
        }

        public boolean c(RecyclerView.A a9) {
            int i9 = this.f16613d;
            return i9 >= 0 && i9 < a9.c();
        }

        public View d(RecyclerView.v vVar) {
            if (this.f16621l != null) {
                return e();
            }
            View viewO = vVar.o(this.f16613d);
            this.f16613d += this.f16614e;
            return viewO;
        }

        public final View e() {
            int size = this.f16621l.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view = ((RecyclerView.D) this.f16621l.get(i9)).f16733a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.e() && this.f16613d == pVar.c()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int iC;
            int size = this.f16621l.size();
            View view2 = null;
            int i9 = a.e.API_PRIORITY_OTHER;
            for (int i10 = 0; i10 < size; i10++) {
                View view3 = ((RecyclerView.D) this.f16621l.get(i10)).f16733a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.e() && (iC = (pVar.c() - this.f16613d) * this.f16614e) >= 0 && iC < i9) {
                    view2 = view3;
                    if (iC == 0) {
                        break;
                    }
                    i9 = iC;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16623a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16625d;

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i9) {
                return new d[i9];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f16623a = parcel.readInt();
            this.f16624c = parcel.readInt();
            this.f16625d = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f16623a = dVar.f16623a;
            this.f16624c = dVar.f16624c;
            this.f16625d = dVar.f16625d;
        }

        public boolean a() {
            return this.f16623a >= 0;
        }

        public void c() {
            this.f16623a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeInt(this.f16623a);
            parcel.writeInt(this.f16624c);
            parcel.writeInt(this.f16625d ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i9, boolean z9) {
        this.f16593s = 1;
        this.f16597w = false;
        this.f16598x = false;
        this.f16599y = false;
        this.f16600z = true;
        this.f16585A = -1;
        this.f16586B = Integer.MIN_VALUE;
        this.f16588D = null;
        this.f16589E = new a();
        this.f16590F = new b();
        this.f16591G = 2;
        this.f16592H = new int[2];
        b3(i9);
        c3(z9);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        this.f16593s = 1;
        this.f16597w = false;
        this.f16598x = false;
        this.f16599y = false;
        this.f16600z = true;
        this.f16585A = -1;
        this.f16586B = Integer.MIN_VALUE;
        this.f16588D = null;
        this.f16589E = new a();
        this.f16590F = new b();
        this.f16591G = 2;
        this.f16592H = new int[2];
        RecyclerView.o.d dVarC0 = RecyclerView.o.C0(context, attributeSet, i9, i10);
        b3(dVarC0.f16789a);
        c3(dVarC0.f16791c);
        d3(dVarC0.f16792d);
    }

    private int I2(int i9, RecyclerView.v vVar, RecyclerView.A a9, boolean z9) {
        int i10;
        int i11 = this.f16595u.i() - i9;
        if (i11 <= 0) {
            return 0;
        }
        int i12 = -Z2(-i11, vVar, a9);
        int i13 = i9 + i12;
        if (!z9 || (i10 = this.f16595u.i() - i13) <= 0) {
            return i12;
        }
        this.f16595u.r(i10);
        return i10 + i12;
    }

    private int J2(int i9, RecyclerView.v vVar, RecyclerView.A a9, boolean z9) {
        int iM;
        int iM2 = i9 - this.f16595u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i10 = -Z2(iM2, vVar, a9);
        int i11 = i9 + i10;
        if (!z9 || (iM = i11 - this.f16595u.m()) <= 0) {
            return i10;
        }
        this.f16595u.r(-iM);
        return i10 - iM;
    }

    private View L2() {
        return g0(this.f16598x ? h0() - 1 : 0);
    }

    private void U2(RecyclerView.v vVar, int i9, int i10) {
        if (i9 == i10) {
            return;
        }
        if (i10 <= i9) {
            while (i9 > i10) {
                K1(i9, vVar);
                i9--;
            }
        } else {
            for (int i11 = i10 - 1; i11 >= i9; i11--) {
                K1(i11, vVar);
            }
        }
    }

    private int m2(RecyclerView.A a9) {
        if (h0() == 0) {
            return 0;
        }
        r2();
        return m.a(a9, this.f16595u, w2(!this.f16600z, true), v2(!this.f16600z, true), this, this.f16600z);
    }

    private int n2(RecyclerView.A a9) {
        if (h0() == 0) {
            return 0;
        }
        r2();
        return m.b(a9, this.f16595u, w2(!this.f16600z, true), v2(!this.f16600z, true), this, this.f16600z, this.f16598x);
    }

    private int o2(RecyclerView.A a9) {
        if (h0() == 0) {
            return 0;
        }
        r2();
        return m.c(a9, this.f16595u, w2(!this.f16600z, true), v2(!this.f16600z, true), this, this.f16600z);
    }

    public int A2() {
        View viewC2 = C2(h0() - 1, -1, false, true);
        if (viewC2 == null) {
            return -1;
        }
        return B0(viewC2);
    }

    public View B2(int i9, int i10) {
        int i11;
        int i12;
        r2();
        if (i10 <= i9 && i10 >= i9) {
            return g0(i9);
        }
        if (this.f16595u.g(g0(i9)) < this.f16595u.m()) {
            i11 = 16644;
            i12 = 16388;
        } else {
            i11 = 4161;
            i12 = 4097;
        }
        return (this.f16593s == 0 ? this.f16773e : this.f16774f).a(i9, i10, i11, i12);
    }

    public View C2(int i9, int i10, boolean z9, boolean z10) {
        r2();
        return (this.f16593s == 0 ? this.f16773e : this.f16774f).a(i9, i10, z9 ? 24579 : 320, z10 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void D(String str) {
        if (this.f16588D == null) {
            super.D(str);
        }
    }

    public final View D2() {
        return this.f16598x ? t2() : y2();
    }

    public final View E2() {
        return this.f16598x ? y2() : t2();
    }

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
            if (iB0 >= 0 && iB0 < i11) {
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

    public final View G2(RecyclerView.v vVar, RecyclerView.A a9) {
        return this.f16598x ? u2(vVar, a9) : z2(vVar, a9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean H() {
        return this.f16593s == 0;
    }

    public final View H2(RecyclerView.v vVar, RecyclerView.A a9) {
        return this.f16598x ? z2(vVar, a9) : u2(vVar, a9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean I() {
        return this.f16593s == 1;
    }

    public final View K2() {
        return g0(this.f16598x ? 0 : h0() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void L(int i9, int i10, RecyclerView.A a9, RecyclerView.o.c cVar) {
        if (this.f16593s != 0) {
            i9 = i10;
        }
        if (h0() == 0 || i9 == 0) {
            return;
        }
        r2();
        h3(i9 > 0 ? 1 : -1, Math.abs(i9), true, a9);
        l2(a9, this.f16594t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M(int i9, RecyclerView.o.c cVar) {
        boolean z9;
        int i10;
        d dVar = this.f16588D;
        if (dVar == null || !dVar.a()) {
            Y2();
            z9 = this.f16598x;
            i10 = this.f16585A;
            if (i10 == -1) {
                i10 = z9 ? i9 - 1 : 0;
            }
        } else {
            d dVar2 = this.f16588D;
            z9 = dVar2.f16625d;
            i10 = dVar2.f16623a;
        }
        int i11 = z9 ? -1 : 1;
        for (int i12 = 0; i12 < this.f16591G && i10 >= 0 && i10 < i9; i12++) {
            cVar.a(i10, 0);
            i10 += i11;
        }
    }

    public int M2(RecyclerView.A a9) {
        if (a9.g()) {
            return this.f16595u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.A a9) {
        return m2(a9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean N0() {
        return true;
    }

    public int N2() {
        return this.f16593s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int O(RecyclerView.A a9) {
        return n2(a9);
    }

    public boolean O2() {
        return x0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int P(RecyclerView.A a9) {
        return o2(a9);
    }

    public boolean P2() {
        return this.f16600z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int Q(RecyclerView.A a9) {
        return m2(a9);
    }

    public void Q2(RecyclerView.v vVar, RecyclerView.A a9, c cVar, b bVar) {
        int i9;
        int i10;
        int i11;
        int iO;
        int iF;
        View viewD = cVar.d(vVar);
        if (viewD == null) {
            bVar.f16607b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) viewD.getLayoutParams();
        if (cVar.f16621l == null) {
            if (this.f16598x == (cVar.f16615f == -1)) {
                A(viewD);
            } else {
                B(viewD, 0);
            }
        } else {
            if (this.f16598x == (cVar.f16615f == -1)) {
                y(viewD);
            } else {
                z(viewD, 0);
            }
        }
        W0(viewD, 0, 0);
        bVar.f16606a = this.f16595u.e(viewD);
        if (this.f16593s == 1) {
            if (O2()) {
                iF = I0() - k();
                iO = iF - this.f16595u.f(viewD);
            } else {
                iO = o();
                iF = this.f16595u.f(viewD) + iO;
            }
            int i12 = cVar.f16615f;
            int i13 = cVar.f16611b;
            if (i12 == -1) {
                i11 = i13;
                i10 = iF;
                i9 = i13 - bVar.f16606a;
            } else {
                i9 = i13;
                i10 = iF;
                i11 = bVar.f16606a + i13;
            }
        } else {
            int iN = n();
            int iF2 = this.f16595u.f(viewD) + iN;
            int i14 = cVar.f16615f;
            int i15 = cVar.f16611b;
            if (i14 == -1) {
                i10 = i15;
                i9 = iN;
                i11 = iF2;
                iO = i15 - bVar.f16606a;
            } else {
                i9 = iN;
                i10 = bVar.f16606a + i15;
                i11 = iF2;
                iO = i15;
            }
        }
        V0(viewD, iO, i9, i10, i11);
        if (pVar.e() || pVar.d()) {
            bVar.f16608c = true;
        }
        bVar.f16609d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int R(RecyclerView.A a9) {
        return n2(a9);
    }

    public final void R2(RecyclerView.v vVar, RecyclerView.A a9, int i9, int i10) {
        if (!a9.j() || h0() == 0 || a9.h() || !j2()) {
            return;
        }
        List listK = vVar.k();
        int size = listK.size();
        int iB0 = B0(g0(0));
        int iE = 0;
        int iE2 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView.D d9 = (RecyclerView.D) listK.get(i11);
            if (!d9.y()) {
                if ((d9.p() < iB0) != this.f16598x) {
                    iE += this.f16595u.e(d9.f16733a);
                } else {
                    iE2 += this.f16595u.e(d9.f16733a);
                }
            }
        }
        this.f16594t.f16621l = listK;
        if (iE > 0) {
            k3(B0(L2()), i9);
            c cVar = this.f16594t;
            cVar.f16617h = iE;
            cVar.f16612c = 0;
            cVar.a();
            s2(vVar, this.f16594t, a9, false);
        }
        if (iE2 > 0) {
            i3(B0(K2()), i10);
            c cVar2 = this.f16594t;
            cVar2.f16617h = iE2;
            cVar2.f16612c = 0;
            cVar2.a();
            s2(vVar, this.f16594t, a9, false);
        }
        this.f16594t.f16621l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int S(RecyclerView.A a9) {
        return o2(a9);
    }

    public void S2(RecyclerView.v vVar, RecyclerView.A a9, a aVar, int i9) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int T1(int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        if (this.f16593s == 1) {
            return 0;
        }
        return Z2(i9, vVar, a9);
    }

    public final void T2(RecyclerView.v vVar, c cVar) {
        if (!cVar.f16610a || cVar.f16622m) {
            return;
        }
        int i9 = cVar.f16616g;
        int i10 = cVar.f16618i;
        if (cVar.f16615f == -1) {
            V2(vVar, i9, i10);
        } else {
            W2(vVar, i9, i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U1(int i9) {
        this.f16585A = i9;
        this.f16586B = Integer.MIN_VALUE;
        d dVar = this.f16588D;
        if (dVar != null) {
            dVar.c();
        }
        Q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int V1(int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        if (this.f16593s == 0) {
            return 0;
        }
        return Z2(i9, vVar, a9);
    }

    public final void V2(RecyclerView.v vVar, int i9, int i10) {
        int iH0 = h0();
        if (i9 < 0) {
            return;
        }
        int iH = (this.f16595u.h() - i9) + i10;
        if (this.f16598x) {
            for (int i11 = 0; i11 < iH0; i11++) {
                View viewG0 = g0(i11);
                if (this.f16595u.g(viewG0) < iH || this.f16595u.q(viewG0) < iH) {
                    U2(vVar, 0, i11);
                    return;
                }
            }
            return;
        }
        int i12 = iH0 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View viewG02 = g0(i13);
            if (this.f16595u.g(viewG02) < iH || this.f16595u.q(viewG02) < iH) {
                U2(vVar, i12, i13);
                return;
            }
        }
    }

    public final void W2(RecyclerView.v vVar, int i9, int i10) {
        if (i9 < 0) {
            return;
        }
        int i11 = i9 - i10;
        int iH0 = h0();
        if (!this.f16598x) {
            for (int i12 = 0; i12 < iH0; i12++) {
                View viewG0 = g0(i12);
                if (this.f16595u.d(viewG0) > i11 || this.f16595u.p(viewG0) > i11) {
                    U2(vVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iH0 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewG02 = g0(i14);
            if (this.f16595u.d(viewG02) > i11 || this.f16595u.p(viewG02) > i11) {
                U2(vVar, i13, i14);
                return;
            }
        }
    }

    public boolean X2() {
        return this.f16595u.k() == 0 && this.f16595u.h() == 0;
    }

    public final void Y2() {
        this.f16598x = (this.f16593s == 1 || !O2()) ? this.f16597w : !this.f16597w;
    }

    public int Z2(int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        if (h0() == 0 || i9 == 0) {
            return 0;
        }
        r2();
        this.f16594t.f16610a = true;
        int i10 = i9 > 0 ? 1 : -1;
        int iAbs = Math.abs(i9);
        h3(i10, iAbs, true, a9);
        c cVar = this.f16594t;
        int iS2 = cVar.f16616g + s2(vVar, cVar, a9, false);
        if (iS2 < 0) {
            return 0;
        }
        if (iAbs > iS2) {
            i9 = i10 * iS2;
        }
        this.f16595u.r(-i9);
        this.f16594t.f16620k = i9;
        return i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View a0(int i9) {
        int iH0 = h0();
        if (iH0 == 0) {
            return null;
        }
        int iB0 = i9 - B0(g0(0));
        if (iB0 >= 0 && iB0 < iH0) {
            View viewG0 = g0(iB0);
            if (B0(viewG0) == i9) {
                return viewG0;
            }
        }
        return super.a0(i9);
    }

    public void a3(int i9, int i10) {
        this.f16585A = i9;
        this.f16586B = i10;
        d dVar = this.f16588D;
        if (dVar != null) {
            dVar.c();
        }
        Q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p b0() {
        return new RecyclerView.p(-2, -2);
    }

    public void b3(int i9) {
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i9);
        }
        D(null);
        if (i9 != this.f16593s || this.f16595u == null) {
            j jVarB = j.b(this, i9);
            this.f16595u = jVarB;
            this.f16589E.f16601a = jVarB;
            this.f16593s = i9;
            Q1();
        }
    }

    public void c3(boolean z9) {
        D(null);
        if (z9 == this.f16597w) {
            return;
        }
        this.f16597w = z9;
        Q1();
    }

    public void d3(boolean z9) {
        D(null);
        if (this.f16599y == z9) {
            return;
        }
        this.f16599y = z9;
        Q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF e(int i9) {
        if (h0() == 0) {
            return null;
        }
        int i10 = (i9 < B0(g0(0))) != this.f16598x ? -1 : 1;
        return this.f16593s == 0 ? new PointF(i10, 0.0f) : new PointF(0.0f, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.e1(recyclerView, vVar);
        if (this.f16587C) {
            H1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean e2() {
        return (v0() == 1073741824 || J0() == 1073741824 || !K0()) ? false : true;
    }

    public final boolean e3(RecyclerView.v vVar, RecyclerView.A a9, a aVar) {
        if (h0() == 0) {
            return false;
        }
        View viewT0 = t0();
        if (viewT0 != null && aVar.d(viewT0, a9)) {
            aVar.c(viewT0, B0(viewT0));
            return true;
        }
        if (this.f16596v != this.f16599y) {
            return false;
        }
        View viewG2 = aVar.f16604d ? G2(vVar, a9) : H2(vVar, a9);
        if (viewG2 == null) {
            return false;
        }
        aVar.b(viewG2, B0(viewG2));
        if (!a9.h() && j2() && (this.f16595u.g(viewG2) >= this.f16595u.i() || this.f16595u.d(viewG2) < this.f16595u.m())) {
            aVar.f16603c = aVar.f16604d ? this.f16595u.i() : this.f16595u.m();
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View f1(View view, int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        int iP2;
        Y2();
        if (h0() == 0 || (iP2 = p2(i9)) == Integer.MIN_VALUE) {
            return null;
        }
        r2();
        h3(iP2, (int) (this.f16595u.n() * 0.33333334f), false, a9);
        c cVar = this.f16594t;
        cVar.f16616g = Integer.MIN_VALUE;
        cVar.f16610a = false;
        s2(vVar, cVar, a9, true);
        View viewE2 = iP2 == -1 ? E2() : D2();
        View viewL2 = iP2 == -1 ? L2() : K2();
        if (!viewL2.hasFocusable()) {
            return viewE2;
        }
        if (viewE2 == null) {
            return null;
        }
        return viewL2;
    }

    public final boolean f3(RecyclerView.A a9, a aVar) {
        int i9;
        if (!a9.h() && (i9 = this.f16585A) != -1) {
            if (i9 >= 0 && i9 < a9.c()) {
                aVar.f16602b = this.f16585A;
                d dVar = this.f16588D;
                if (dVar != null && dVar.a()) {
                    boolean z9 = this.f16588D.f16625d;
                    aVar.f16604d = z9;
                    aVar.f16603c = z9 ? this.f16595u.i() - this.f16588D.f16624c : this.f16595u.m() + this.f16588D.f16624c;
                    return true;
                }
                if (this.f16586B != Integer.MIN_VALUE) {
                    boolean z10 = this.f16598x;
                    aVar.f16604d = z10;
                    aVar.f16603c = z10 ? this.f16595u.i() - this.f16586B : this.f16595u.m() + this.f16586B;
                    return true;
                }
                View viewA0 = a0(this.f16585A);
                if (viewA0 == null) {
                    if (h0() > 0) {
                        aVar.f16604d = (this.f16585A < B0(g0(0))) == this.f16598x;
                    }
                    aVar.a();
                } else {
                    if (this.f16595u.e(viewA0) > this.f16595u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f16595u.g(viewA0) - this.f16595u.m() < 0) {
                        aVar.f16603c = this.f16595u.m();
                        aVar.f16604d = false;
                        return true;
                    }
                    if (this.f16595u.i() - this.f16595u.d(viewA0) < 0) {
                        aVar.f16603c = this.f16595u.i();
                        aVar.f16604d = true;
                        return true;
                    }
                    aVar.f16603c = aVar.f16604d ? this.f16595u.d(viewA0) + this.f16595u.o() : this.f16595u.g(viewA0);
                }
                return true;
            }
            this.f16585A = -1;
            this.f16586B = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g1(AccessibilityEvent accessibilityEvent) {
        super.g1(accessibilityEvent);
        if (h0() > 0) {
            accessibilityEvent.setFromIndex(x2());
            accessibilityEvent.setToIndex(A2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g2(RecyclerView recyclerView, RecyclerView.A a9, int i9) {
        h hVar = new h(recyclerView.getContext());
        hVar.p(i9);
        h2(hVar);
    }

    public final void g3(RecyclerView.v vVar, RecyclerView.A a9, a aVar) {
        if (f3(a9, aVar) || e3(vVar, a9, aVar)) {
            return;
        }
        aVar.a();
        aVar.f16602b = this.f16599y ? a9.c() - 1 : 0;
    }

    public final void h3(int i9, int i10, boolean z9, RecyclerView.A a9) {
        int iM;
        this.f16594t.f16622m = X2();
        this.f16594t.f16615f = i9;
        int[] iArr = this.f16592H;
        iArr[0] = 0;
        iArr[1] = 0;
        k2(a9, iArr);
        int iMax = Math.max(0, this.f16592H[0]);
        int iMax2 = Math.max(0, this.f16592H[1]);
        boolean z10 = i9 == 1;
        c cVar = this.f16594t;
        int i11 = z10 ? iMax2 : iMax;
        cVar.f16617h = i11;
        if (!z10) {
            iMax = iMax2;
        }
        cVar.f16618i = iMax;
        if (z10) {
            cVar.f16617h = i11 + this.f16595u.j();
            View viewK2 = K2();
            c cVar2 = this.f16594t;
            cVar2.f16614e = this.f16598x ? -1 : 1;
            int iB0 = B0(viewK2);
            c cVar3 = this.f16594t;
            cVar2.f16613d = iB0 + cVar3.f16614e;
            cVar3.f16611b = this.f16595u.d(viewK2);
            iM = this.f16595u.d(viewK2) - this.f16595u.i();
        } else {
            View viewL2 = L2();
            this.f16594t.f16617h += this.f16595u.m();
            c cVar4 = this.f16594t;
            cVar4.f16614e = this.f16598x ? 1 : -1;
            int iB02 = B0(viewL2);
            c cVar5 = this.f16594t;
            cVar4.f16613d = iB02 + cVar5.f16614e;
            cVar5.f16611b = this.f16595u.g(viewL2);
            iM = (-this.f16595u.g(viewL2)) + this.f16595u.m();
        }
        c cVar6 = this.f16594t;
        cVar6.f16612c = i10;
        if (z9) {
            cVar6.f16612c = i10 - iM;
        }
        cVar6.f16616g = iM;
    }

    public final void i3(int i9, int i10) {
        this.f16594t.f16612c = this.f16595u.i() - i10;
        c cVar = this.f16594t;
        cVar.f16614e = this.f16598x ? -1 : 1;
        cVar.f16613d = i9;
        cVar.f16615f = 1;
        cVar.f16611b = i10;
        cVar.f16616g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.f.h
    public void j(View view, View view2, int i9, int i10) {
        int iG;
        D("Cannot drop a view during a scroll or layout calculation");
        r2();
        Y2();
        int iB0 = B0(view);
        int iB02 = B0(view2);
        byte b9 = iB0 < iB02 ? (byte) 1 : (byte) -1;
        if (this.f16598x) {
            if (b9 == 1) {
                a3(iB02, this.f16595u.i() - (this.f16595u.g(view2) + this.f16595u.e(view)));
                return;
            }
            iG = this.f16595u.i() - this.f16595u.d(view2);
        } else {
            if (b9 != -1) {
                a3(iB02, this.f16595u.d(view2) - this.f16595u.e(view));
                return;
            }
            iG = this.f16595u.g(view2);
        }
        a3(iB02, iG);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean j2() {
        return this.f16588D == null && this.f16596v == this.f16599y;
    }

    public final void j3(a aVar) {
        i3(aVar.f16602b, aVar.f16603c);
    }

    public void k2(RecyclerView.A a9, int[] iArr) {
        int i9;
        int iM2 = M2(a9);
        if (this.f16594t.f16615f == -1) {
            i9 = 0;
        } else {
            i9 = iM2;
            iM2 = 0;
        }
        iArr[0] = iM2;
        iArr[1] = i9;
    }

    public final void k3(int i9, int i10) {
        this.f16594t.f16612c = i10 - this.f16595u.m();
        c cVar = this.f16594t;
        cVar.f16613d = i9;
        cVar.f16614e = this.f16598x ? 1 : -1;
        cVar.f16615f = -1;
        cVar.f16611b = i10;
        cVar.f16616g = Integer.MIN_VALUE;
    }

    public void l2(RecyclerView.A a9, c cVar, RecyclerView.o.c cVar2) {
        int i9 = cVar.f16613d;
        if (i9 < 0 || i9 >= a9.c()) {
            return;
        }
        cVar2.a(i9, Math.max(0, cVar.f16616g));
    }

    public final void l3(a aVar) {
        k3(aVar.f16602b, aVar.f16603c);
    }

    public int p2(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 17 ? i9 != 33 ? i9 != 66 ? (i9 == 130 && this.f16593s == 1) ? 1 : Integer.MIN_VALUE : this.f16593s == 0 ? 1 : Integer.MIN_VALUE : this.f16593s == 1 ? -1 : Integer.MIN_VALUE : this.f16593s == 0 ? -1 : Integer.MIN_VALUE : (this.f16593s != 1 && O2()) ? -1 : 1 : (this.f16593s != 1 && O2()) ? 1 : -1;
    }

    public c q2() {
        return new c();
    }

    public void r2() {
        if (this.f16594t == null) {
            this.f16594t = q2();
        }
    }

    public int s2(RecyclerView.v vVar, c cVar, RecyclerView.A a9, boolean z9) {
        int i9 = cVar.f16612c;
        int i10 = cVar.f16616g;
        if (i10 != Integer.MIN_VALUE) {
            if (i9 < 0) {
                cVar.f16616g = i10 + i9;
            }
            T2(vVar, cVar);
        }
        int i11 = cVar.f16612c + cVar.f16617h;
        b bVar = this.f16590F;
        while (true) {
            if ((!cVar.f16622m && i11 <= 0) || !cVar.c(a9)) {
                break;
            }
            bVar.a();
            Q2(vVar, a9, cVar, bVar);
            if (!bVar.f16607b) {
                cVar.f16611b += bVar.f16606a * cVar.f16615f;
                if (!bVar.f16608c || cVar.f16621l != null || !a9.h()) {
                    int i12 = cVar.f16612c;
                    int i13 = bVar.f16606a;
                    cVar.f16612c = i12 - i13;
                    i11 -= i13;
                }
                int i14 = cVar.f16616g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + bVar.f16606a;
                    cVar.f16616g = i15;
                    int i16 = cVar.f16612c;
                    if (i16 < 0) {
                        cVar.f16616g = i15 + i16;
                    }
                    T2(vVar, cVar);
                }
                if (z9 && bVar.f16609d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i9 - cVar.f16612c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t1(RecyclerView.v vVar, RecyclerView.A a9) {
        int i9;
        int i10;
        int i11;
        int i12;
        int iI2;
        int i13;
        View viewA0;
        int iG;
        int i14;
        int i15 = -1;
        if (!(this.f16588D == null && this.f16585A == -1) && a9.c() == 0) {
            H1(vVar);
            return;
        }
        d dVar = this.f16588D;
        if (dVar != null && dVar.a()) {
            this.f16585A = this.f16588D.f16623a;
        }
        r2();
        this.f16594t.f16610a = false;
        Y2();
        View viewT0 = t0();
        a aVar = this.f16589E;
        if (!aVar.f16605e || this.f16585A != -1 || this.f16588D != null) {
            aVar.e();
            a aVar2 = this.f16589E;
            aVar2.f16604d = this.f16598x ^ this.f16599y;
            g3(vVar, a9, aVar2);
            this.f16589E.f16605e = true;
        } else if (viewT0 != null && (this.f16595u.g(viewT0) >= this.f16595u.i() || this.f16595u.d(viewT0) <= this.f16595u.m())) {
            this.f16589E.c(viewT0, B0(viewT0));
        }
        c cVar = this.f16594t;
        cVar.f16615f = cVar.f16620k >= 0 ? 1 : -1;
        int[] iArr = this.f16592H;
        iArr[0] = 0;
        iArr[1] = 0;
        k2(a9, iArr);
        int iMax = Math.max(0, this.f16592H[0]) + this.f16595u.m();
        int iMax2 = Math.max(0, this.f16592H[1]) + this.f16595u.j();
        if (a9.h() && (i13 = this.f16585A) != -1 && this.f16586B != Integer.MIN_VALUE && (viewA0 = a0(i13)) != null) {
            if (this.f16598x) {
                i14 = this.f16595u.i() - this.f16595u.d(viewA0);
                iG = this.f16586B;
            } else {
                iG = this.f16595u.g(viewA0) - this.f16595u.m();
                i14 = this.f16586B;
            }
            int i16 = i14 - iG;
            if (i16 > 0) {
                iMax += i16;
            } else {
                iMax2 -= i16;
            }
        }
        a aVar3 = this.f16589E;
        if (!aVar3.f16604d ? !this.f16598x : this.f16598x) {
            i15 = 1;
        }
        S2(vVar, a9, aVar3, i15);
        T(vVar);
        this.f16594t.f16622m = X2();
        this.f16594t.f16619j = a9.h();
        this.f16594t.f16618i = 0;
        a aVar4 = this.f16589E;
        if (aVar4.f16604d) {
            l3(aVar4);
            c cVar2 = this.f16594t;
            cVar2.f16617h = iMax;
            s2(vVar, cVar2, a9, false);
            c cVar3 = this.f16594t;
            i10 = cVar3.f16611b;
            int i17 = cVar3.f16613d;
            int i18 = cVar3.f16612c;
            if (i18 > 0) {
                iMax2 += i18;
            }
            j3(this.f16589E);
            c cVar4 = this.f16594t;
            cVar4.f16617h = iMax2;
            cVar4.f16613d += cVar4.f16614e;
            s2(vVar, cVar4, a9, false);
            c cVar5 = this.f16594t;
            i9 = cVar5.f16611b;
            int i19 = cVar5.f16612c;
            if (i19 > 0) {
                k3(i17, i10);
                c cVar6 = this.f16594t;
                cVar6.f16617h = i19;
                s2(vVar, cVar6, a9, false);
                i10 = this.f16594t.f16611b;
            }
        } else {
            j3(aVar4);
            c cVar7 = this.f16594t;
            cVar7.f16617h = iMax2;
            s2(vVar, cVar7, a9, false);
            c cVar8 = this.f16594t;
            i9 = cVar8.f16611b;
            int i20 = cVar8.f16613d;
            int i21 = cVar8.f16612c;
            if (i21 > 0) {
                iMax += i21;
            }
            l3(this.f16589E);
            c cVar9 = this.f16594t;
            cVar9.f16617h = iMax;
            cVar9.f16613d += cVar9.f16614e;
            s2(vVar, cVar9, a9, false);
            c cVar10 = this.f16594t;
            i10 = cVar10.f16611b;
            int i22 = cVar10.f16612c;
            if (i22 > 0) {
                i3(i20, i9);
                c cVar11 = this.f16594t;
                cVar11.f16617h = i22;
                s2(vVar, cVar11, a9, false);
                i9 = this.f16594t.f16611b;
            }
        }
        if (h0() > 0) {
            if (this.f16598x ^ this.f16599y) {
                int iI22 = I2(i9, vVar, a9, true);
                i11 = i10 + iI22;
                i12 = i9 + iI22;
                iI2 = J2(i11, vVar, a9, false);
            } else {
                int iJ2 = J2(i10, vVar, a9, true);
                i11 = i10 + iJ2;
                i12 = i9 + iJ2;
                iI2 = I2(i12, vVar, a9, false);
            }
            i10 = i11 + iI2;
            i9 = i12 + iI2;
        }
        R2(vVar, a9, i10, i9);
        if (a9.h()) {
            this.f16589E.e();
        } else {
            this.f16595u.s();
        }
        this.f16596v = this.f16599y;
    }

    public final View t2() {
        return B2(0, h0());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void u1(RecyclerView.A a9) {
        super.u1(a9);
        this.f16588D = null;
        this.f16585A = -1;
        this.f16586B = Integer.MIN_VALUE;
        this.f16589E.e();
    }

    public final View u2(RecyclerView.v vVar, RecyclerView.A a9) {
        return F2(vVar, a9, 0, h0(), a9.c());
    }

    public View v2(boolean z9, boolean z10) {
        int iH0;
        int iH02;
        if (this.f16598x) {
            iH0 = 0;
            iH02 = h0();
        } else {
            iH0 = h0() - 1;
            iH02 = -1;
        }
        return C2(iH0, iH02, z9, z10);
    }

    public View w2(boolean z9, boolean z10) {
        int iH0;
        int iH02;
        if (this.f16598x) {
            iH0 = h0() - 1;
            iH02 = -1;
        } else {
            iH0 = 0;
            iH02 = h0();
        }
        return C2(iH0, iH02, z9, z10);
    }

    public int x2() {
        View viewC2 = C2(0, h0(), false, true);
        if (viewC2 == null) {
            return -1;
        }
        return B0(viewC2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void y1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.f16588D = (d) parcelable;
            Q1();
        }
    }

    public final View y2() {
        return B2(h0() - 1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable z1() {
        if (this.f16588D != null) {
            return new d(this.f16588D);
        }
        d dVar = new d();
        if (h0() > 0) {
            r2();
            boolean z9 = this.f16596v ^ this.f16598x;
            dVar.f16625d = z9;
            if (z9) {
                View viewK2 = K2();
                dVar.f16624c = this.f16595u.i() - this.f16595u.d(viewK2);
                dVar.f16623a = B0(viewK2);
            } else {
                View viewL2 = L2();
                dVar.f16623a = B0(viewL2);
                dVar.f16624c = this.f16595u.g(viewL2) - this.f16595u.m();
            }
        } else {
            dVar.c();
        }
        return dVar;
    }

    public final View z2(RecyclerView.v vVar, RecyclerView.A a9) {
        return F2(vVar, a9, h0() - 1, -1, a9.c());
    }
}
