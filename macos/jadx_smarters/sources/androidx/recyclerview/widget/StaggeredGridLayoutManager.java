package androidx.recyclerview.widget;

import Q.C;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public BitSet f16829B;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f16834G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f16835H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public e f16836I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f16837J;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int[] f16842O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f[] f16845t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j f16846u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f16847v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16848w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16849x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f16850y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16844s = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f16851z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f16828A = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f16830C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f16831D = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public d f16832E = new d();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f16833F = 2;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Rect f16838K = new Rect();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final b f16839L = new b();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f16840M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f16841N = true;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Runnable f16843P = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.q2();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16856d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f16857e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f16858f;

        public b() {
            c();
        }

        public void a() {
            this.f16854b = this.f16855c ? StaggeredGridLayoutManager.this.f16846u.i() : StaggeredGridLayoutManager.this.f16846u.m();
        }

        public void b(int i9) {
            this.f16854b = this.f16855c ? StaggeredGridLayoutManager.this.f16846u.i() - i9 : StaggeredGridLayoutManager.this.f16846u.m() + i9;
        }

        public void c() {
            this.f16853a = -1;
            this.f16854b = Integer.MIN_VALUE;
            this.f16855c = false;
            this.f16856d = false;
            this.f16857e = false;
            int[] iArr = this.f16858f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f16858f;
            if (iArr == null || iArr.length < length) {
                this.f16858f = new int[StaggeredGridLayoutManager.this.f16845t.length];
            }
            for (int i9 = 0; i9 < length; i9++) {
                this.f16858f[i9] = fVarArr[i9].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public f f16860f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f16861g;

        public c(int i9, int i10) {
            super(i9, i10);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public final int h() {
            f fVar = this.f16860f;
            if (fVar == null) {
                return -1;
            }
            return fVar.f16882e;
        }

        public boolean k() {
            return this.f16861g;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f16862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f16863b;

        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0189a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f16864a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f16865c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int[] f16866d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f16867e;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public static class C0189a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i9) {
                    return new a[i9];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f16864a = parcel.readInt();
                this.f16865c = parcel.readInt();
                this.f16867e = parcel.readInt() == 1;
                int i9 = parcel.readInt();
                if (i9 > 0) {
                    int[] iArr = new int[i9];
                    this.f16866d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i9) {
                int[] iArr = this.f16866d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i9];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f16864a + ", mGapDir=" + this.f16865c + ", mHasUnwantedGapAfter=" + this.f16867e + ", mGapPerSpan=" + Arrays.toString(this.f16866d) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i9) {
                parcel.writeInt(this.f16864a);
                parcel.writeInt(this.f16865c);
                parcel.writeInt(this.f16867e ? 1 : 0);
                int[] iArr = this.f16866d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f16866d);
                }
            }
        }

        public void a(a aVar) {
            if (this.f16863b == null) {
                this.f16863b = new ArrayList();
            }
            int size = this.f16863b.size();
            for (int i9 = 0; i9 < size; i9++) {
                a aVar2 = (a) this.f16863b.get(i9);
                if (aVar2.f16864a == aVar.f16864a) {
                    this.f16863b.remove(i9);
                }
                if (aVar2.f16864a >= aVar.f16864a) {
                    this.f16863b.add(i9, aVar);
                    return;
                }
            }
            this.f16863b.add(aVar);
        }

        public void b() {
            int[] iArr = this.f16862a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f16863b = null;
        }

        public void c(int i9) {
            int[] iArr = this.f16862a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i9, 10) + 1];
                this.f16862a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i9 >= iArr.length) {
                int[] iArr3 = new int[o(i9)];
                this.f16862a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f16862a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i9) {
            List list = this.f16863b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f16863b.get(size)).f16864a >= i9) {
                        this.f16863b.remove(size);
                    }
                }
            }
            return h(i9);
        }

        public a e(int i9, int i10, int i11, boolean z9) {
            List list = this.f16863b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                a aVar = (a) this.f16863b.get(i12);
                int i13 = aVar.f16864a;
                if (i13 >= i10) {
                    return null;
                }
                if (i13 >= i9 && (i11 == 0 || aVar.f16865c == i11 || (z9 && aVar.f16867e))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i9) {
            List list = this.f16863b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f16863b.get(size);
                if (aVar.f16864a == i9) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i9) {
            int[] iArr = this.f16862a;
            if (iArr == null || i9 >= iArr.length) {
                return -1;
            }
            return iArr[i9];
        }

        public int h(int i9) {
            int[] iArr = this.f16862a;
            if (iArr == null || i9 >= iArr.length) {
                return -1;
            }
            int i10 = i(i9);
            if (i10 == -1) {
                int[] iArr2 = this.f16862a;
                Arrays.fill(iArr2, i9, iArr2.length, -1);
                return this.f16862a.length;
            }
            int i11 = i10 + 1;
            Arrays.fill(this.f16862a, i9, i11, -1);
            return i11;
        }

        public final int i(int i9) {
            if (this.f16863b == null) {
                return -1;
            }
            a aVarF = f(i9);
            if (aVarF != null) {
                this.f16863b.remove(aVarF);
            }
            int size = this.f16863b.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                }
                if (((a) this.f16863b.get(i10)).f16864a >= i9) {
                    break;
                }
                i10++;
            }
            if (i10 == -1) {
                return -1;
            }
            a aVar = (a) this.f16863b.get(i10);
            this.f16863b.remove(i10);
            return aVar.f16864a;
        }

        public void j(int i9, int i10) {
            int[] iArr = this.f16862a;
            if (iArr == null || i9 >= iArr.length) {
                return;
            }
            int i11 = i9 + i10;
            c(i11);
            int[] iArr2 = this.f16862a;
            System.arraycopy(iArr2, i9, iArr2, i11, (iArr2.length - i9) - i10);
            Arrays.fill(this.f16862a, i9, i11, -1);
            l(i9, i10);
        }

        public void k(int i9, int i10) {
            int[] iArr = this.f16862a;
            if (iArr == null || i9 >= iArr.length) {
                return;
            }
            int i11 = i9 + i10;
            c(i11);
            int[] iArr2 = this.f16862a;
            System.arraycopy(iArr2, i11, iArr2, i9, (iArr2.length - i9) - i10);
            int[] iArr3 = this.f16862a;
            Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
            m(i9, i10);
        }

        public final void l(int i9, int i10) {
            List list = this.f16863b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f16863b.get(size);
                int i11 = aVar.f16864a;
                if (i11 >= i9) {
                    aVar.f16864a = i11 + i10;
                }
            }
        }

        public final void m(int i9, int i10) {
            List list = this.f16863b;
            if (list == null) {
                return;
            }
            int i11 = i9 + i10;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f16863b.get(size);
                int i12 = aVar.f16864a;
                if (i12 >= i9) {
                    if (i12 < i11) {
                        this.f16863b.remove(size);
                    } else {
                        aVar.f16864a = i12 - i10;
                    }
                }
            }
        }

        public void n(int i9, f fVar) {
            c(i9);
            this.f16862a[i9] = fVar.f16882e;
        }

        public int o(int i9) {
            int length = this.f16862a.length;
            while (length <= i9) {
                length *= 2;
            }
            return length;
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16868a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f16871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int[] f16873g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f16874h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f16875i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f16876j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f16877k;

        public static class a implements Parcelable.Creator {
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
            this.f16868a = parcel.readInt();
            this.f16869c = parcel.readInt();
            int i9 = parcel.readInt();
            this.f16870d = i9;
            if (i9 > 0) {
                int[] iArr = new int[i9];
                this.f16871e = iArr;
                parcel.readIntArray(iArr);
            }
            int i10 = parcel.readInt();
            this.f16872f = i10;
            if (i10 > 0) {
                int[] iArr2 = new int[i10];
                this.f16873g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f16875i = parcel.readInt() == 1;
            this.f16876j = parcel.readInt() == 1;
            this.f16877k = parcel.readInt() == 1;
            this.f16874h = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f16870d = eVar.f16870d;
            this.f16868a = eVar.f16868a;
            this.f16869c = eVar.f16869c;
            this.f16871e = eVar.f16871e;
            this.f16872f = eVar.f16872f;
            this.f16873g = eVar.f16873g;
            this.f16875i = eVar.f16875i;
            this.f16876j = eVar.f16876j;
            this.f16877k = eVar.f16877k;
            this.f16874h = eVar.f16874h;
        }

        public void a() {
            this.f16871e = null;
            this.f16870d = 0;
            this.f16868a = -1;
            this.f16869c = -1;
        }

        public void c() {
            this.f16871e = null;
            this.f16870d = 0;
            this.f16872f = 0;
            this.f16873g = null;
            this.f16874h = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeInt(this.f16868a);
            parcel.writeInt(this.f16869c);
            parcel.writeInt(this.f16870d);
            if (this.f16870d > 0) {
                parcel.writeIntArray(this.f16871e);
            }
            parcel.writeInt(this.f16872f);
            if (this.f16872f > 0) {
                parcel.writeIntArray(this.f16873g);
            }
            parcel.writeInt(this.f16875i ? 1 : 0);
            parcel.writeInt(this.f16876j ? 1 : 0);
            parcel.writeInt(this.f16877k ? 1 : 0);
            parcel.writeList(this.f16874h);
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f16878a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16879b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16880c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16881d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f16882e;

        public f(int i9) {
            this.f16882e = i9;
        }

        public void a(View view) {
            c cVarN = n(view);
            cVarN.f16860f = this;
            this.f16878a.add(view);
            this.f16880c = Integer.MIN_VALUE;
            if (this.f16878a.size() == 1) {
                this.f16879b = Integer.MIN_VALUE;
            }
            if (cVarN.e() || cVarN.d()) {
                this.f16881d += StaggeredGridLayoutManager.this.f16846u.e(view);
            }
        }

        public void b(boolean z9, int i9) {
            int iL = z9 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z9 || iL >= StaggeredGridLayoutManager.this.f16846u.i()) {
                if (z9 || iL <= StaggeredGridLayoutManager.this.f16846u.m()) {
                    if (i9 != Integer.MIN_VALUE) {
                        iL += i9;
                    }
                    this.f16880c = iL;
                    this.f16879b = iL;
                }
            }
        }

        public void c() {
            d.a aVarF;
            ArrayList arrayList = this.f16878a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f16880c = StaggeredGridLayoutManager.this.f16846u.d(view);
            if (cVarN.f16861g && (aVarF = StaggeredGridLayoutManager.this.f16832E.f(cVarN.c())) != null && aVarF.f16865c == 1) {
                this.f16880c += aVarF.a(this.f16882e);
            }
        }

        public void d() {
            d.a aVarF;
            View view = (View) this.f16878a.get(0);
            c cVarN = n(view);
            this.f16879b = StaggeredGridLayoutManager.this.f16846u.g(view);
            if (cVarN.f16861g && (aVarF = StaggeredGridLayoutManager.this.f16832E.f(cVarN.c())) != null && aVarF.f16865c == -1) {
                this.f16879b -= aVarF.a(this.f16882e);
            }
        }

        public void e() {
            this.f16878a.clear();
            q();
            this.f16881d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f16851z ? i(this.f16878a.size() - 1, -1, true) : i(0, this.f16878a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f16851z ? i(0, this.f16878a.size(), true) : i(this.f16878a.size() - 1, -1, true);
        }

        public int h(int i9, int i10, boolean z9, boolean z10, boolean z11) {
            int iM = StaggeredGridLayoutManager.this.f16846u.m();
            int i11 = StaggeredGridLayoutManager.this.f16846u.i();
            int i12 = i10 > i9 ? 1 : -1;
            while (i9 != i10) {
                View view = (View) this.f16878a.get(i9);
                int iG = StaggeredGridLayoutManager.this.f16846u.g(view);
                int iD = StaggeredGridLayoutManager.this.f16846u.d(view);
                boolean z12 = false;
                boolean z13 = !z11 ? iG >= i11 : iG > i11;
                if (!z11 ? iD > iM : iD >= iM) {
                    z12 = true;
                }
                if (z13 && z12) {
                    if (z9 && z10) {
                        if (iG >= iM && iD <= i11) {
                            return StaggeredGridLayoutManager.this.B0(view);
                        }
                    } else if (z10 || iG < iM || iD > i11) {
                        return StaggeredGridLayoutManager.this.B0(view);
                    }
                }
                i9 += i12;
            }
            return -1;
        }

        public int i(int i9, int i10, boolean z9) {
            return h(i9, i10, false, false, z9);
        }

        public int j() {
            return this.f16881d;
        }

        public int k() {
            int i9 = this.f16880c;
            if (i9 != Integer.MIN_VALUE) {
                return i9;
            }
            c();
            return this.f16880c;
        }

        public int l(int i9) {
            int i10 = this.f16880c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (this.f16878a.size() == 0) {
                return i9;
            }
            c();
            return this.f16880c;
        }

        public View m(int i9, int i10) {
            View view = null;
            if (i10 != -1) {
                int size = this.f16878a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f16878a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f16851z && staggeredGridLayoutManager.B0(view2) >= i9) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f16851z && staggeredGridLayoutManager2.B0(view2) <= i9) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f16878a.size();
                int i11 = 0;
                while (i11 < size2) {
                    View view3 = (View) this.f16878a.get(i11);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f16851z && staggeredGridLayoutManager3.B0(view3) <= i9) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f16851z && staggeredGridLayoutManager4.B0(view3) >= i9) || !view3.hasFocusable()) {
                        break;
                    }
                    i11++;
                    view = view3;
                }
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i9 = this.f16879b;
            if (i9 != Integer.MIN_VALUE) {
                return i9;
            }
            d();
            return this.f16879b;
        }

        public int p(int i9) {
            int i10 = this.f16879b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (this.f16878a.size() == 0) {
                return i9;
            }
            d();
            return this.f16879b;
        }

        public void q() {
            this.f16879b = Integer.MIN_VALUE;
            this.f16880c = Integer.MIN_VALUE;
        }

        public void r(int i9) {
            int i10 = this.f16879b;
            if (i10 != Integer.MIN_VALUE) {
                this.f16879b = i10 + i9;
            }
            int i11 = this.f16880c;
            if (i11 != Integer.MIN_VALUE) {
                this.f16880c = i11 + i9;
            }
        }

        public void s() {
            int size = this.f16878a.size();
            View view = (View) this.f16878a.remove(size - 1);
            c cVarN = n(view);
            cVarN.f16860f = null;
            if (cVarN.e() || cVarN.d()) {
                this.f16881d -= StaggeredGridLayoutManager.this.f16846u.e(view);
            }
            if (size == 1) {
                this.f16879b = Integer.MIN_VALUE;
            }
            this.f16880c = Integer.MIN_VALUE;
        }

        public void t() {
            View view = (View) this.f16878a.remove(0);
            c cVarN = n(view);
            cVarN.f16860f = null;
            if (this.f16878a.size() == 0) {
                this.f16880c = Integer.MIN_VALUE;
            }
            if (cVarN.e() || cVarN.d()) {
                this.f16881d -= StaggeredGridLayoutManager.this.f16846u.e(view);
            }
            this.f16879b = Integer.MIN_VALUE;
        }

        public void u(View view) {
            c cVarN = n(view);
            cVarN.f16860f = this;
            this.f16878a.add(0, view);
            this.f16879b = Integer.MIN_VALUE;
            if (this.f16878a.size() == 1) {
                this.f16880c = Integer.MIN_VALUE;
            }
            if (cVarN.e() || cVarN.d()) {
                this.f16881d += StaggeredGridLayoutManager.this.f16846u.e(view);
            }
        }

        public void v(int i9) {
            this.f16879b = i9;
            this.f16880c = i9;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        RecyclerView.o.d dVarC0 = RecyclerView.o.C0(context, attributeSet, i9, i10);
        f3(dVarC0.f16789a);
        h3(dVarC0.f16790b);
        g3(dVarC0.f16791c);
        this.f16850y = new g();
        y2();
    }

    private void S2(View view, int i9, int i10, boolean z9) {
        G(view, this.f16838K);
        c cVar = (c) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f16838K;
        int iP3 = p3(i9, i11 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f16838K;
        int iP32 = p3(i10, i12 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z9 ? f2(view, iP3, iP32, cVar) : d2(view, iP3, iP32, cVar)) {
            view.measure(iP3, iP32);
        }
    }

    private void c3() {
        this.f16828A = (this.f16848w == 1 || !R2()) ? this.f16851z : !this.f16851z;
    }

    private int s2(RecyclerView.A a9) {
        if (h0() == 0) {
            return 0;
        }
        return m.a(a9, this.f16846u, C2(!this.f16841N), B2(!this.f16841N), this, this.f16841N);
    }

    private int t2(RecyclerView.A a9) {
        if (h0() == 0) {
            return 0;
        }
        return m.b(a9, this.f16846u, C2(!this.f16841N), B2(!this.f16841N), this, this.f16841N, this.f16828A);
    }

    private int u2(RecyclerView.A a9) {
        if (h0() == 0) {
            return 0;
        }
        return m.c(a9, this.f16846u, C2(!this.f16841N), B2(!this.f16841N), this, this.f16841N);
    }

    private int v2(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 17 ? i9 != 33 ? i9 != 66 ? (i9 == 130 && this.f16848w == 1) ? 1 : Integer.MIN_VALUE : this.f16848w == 0 ? 1 : Integer.MIN_VALUE : this.f16848w == 1 ? -1 : Integer.MIN_VALUE : this.f16848w == 0 ? -1 : Integer.MIN_VALUE : (this.f16848w != 1 && R2()) ? -1 : 1 : (this.f16848w != 1 && R2()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void A1(int i9) {
        if (i9 == 0) {
            q2();
        }
    }

    public final int A2(int i9) {
        int iH0 = h0();
        for (int i10 = 0; i10 < iH0; i10++) {
            int iB0 = B0(g0(i10));
            if (iB0 >= 0 && iB0 < i9) {
                return iB0;
            }
        }
        return 0;
    }

    public View B2(boolean z9) {
        int iM = this.f16846u.m();
        int i9 = this.f16846u.i();
        View view = null;
        for (int iH0 = h0() - 1; iH0 >= 0; iH0--) {
            View viewG0 = g0(iH0);
            int iG = this.f16846u.g(viewG0);
            int iD = this.f16846u.d(viewG0);
            if (iD > iM && iG < i9) {
                if (iD <= i9 || !z9) {
                    return viewG0;
                }
                if (view == null) {
                    view = viewG0;
                }
            }
        }
        return view;
    }

    public View C2(boolean z9) {
        int iM = this.f16846u.m();
        int i9 = this.f16846u.i();
        int iH0 = h0();
        View view = null;
        for (int i10 = 0; i10 < iH0; i10++) {
            View viewG0 = g0(i10);
            int iG = this.f16846u.g(viewG0);
            if (this.f16846u.d(viewG0) > iM && iG < i9) {
                if (iG >= iM || !z9) {
                    return viewG0;
                }
                if (view == null) {
                    view = viewG0;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void D(String str) {
        if (this.f16836I == null) {
            super.D(str);
        }
    }

    public int D2() {
        View viewB2 = this.f16828A ? B2(true) : C2(true);
        if (viewB2 == null) {
            return -1;
        }
        return B0(viewB2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int E0(RecyclerView.v vVar, RecyclerView.A a9) {
        return this.f16848w == 0 ? this.f16844s : super.E0(vVar, a9);
    }

    public final int E2(int i9) {
        for (int iH0 = h0() - 1; iH0 >= 0; iH0--) {
            int iB0 = B0(g0(iH0));
            if (iB0 >= 0 && iB0 < i9) {
                return iB0;
            }
        }
        return 0;
    }

    public final void F2(RecyclerView.v vVar, RecyclerView.A a9, boolean z9) {
        int i9;
        int iJ2 = J2(Integer.MIN_VALUE);
        if (iJ2 != Integer.MIN_VALUE && (i9 = this.f16846u.i() - iJ2) > 0) {
            int i10 = i9 - (-d3(-i9, vVar, a9));
            if (!z9 || i10 <= 0) {
                return;
            }
            this.f16846u.r(i10);
        }
    }

    public final void G2(RecyclerView.v vVar, RecyclerView.A a9, boolean z9) {
        int iM;
        int iM2 = M2(a.e.API_PRIORITY_OTHER);
        if (iM2 != Integer.MAX_VALUE && (iM = iM2 - this.f16846u.m()) > 0) {
            int iD3 = iM - d3(iM, vVar, a9);
            if (!z9 || iD3 <= 0) {
                return;
            }
            this.f16846u.r(-iD3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean H() {
        return this.f16848w == 0;
    }

    public int H2() {
        if (h0() == 0) {
            return 0;
        }
        return B0(g0(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean I() {
        return this.f16848w == 1;
    }

    public int I2() {
        int iH0 = h0();
        if (iH0 == 0) {
            return 0;
        }
        return B0(g0(iH0 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean J(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    public final int J2(int i9) {
        int iL = this.f16845t[0].l(i9);
        for (int i10 = 1; i10 < this.f16844s; i10++) {
            int iL2 = this.f16845t[i10].l(i9);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    public final int K2(int i9) {
        int iP = this.f16845t[0].p(i9);
        for (int i10 = 1; i10 < this.f16844s; i10++) {
            int iP2 = this.f16845t[i10].p(i9);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void L(int i9, int i10, RecyclerView.A a9, RecyclerView.o.c cVar) {
        int iL;
        int iP;
        if (this.f16848w != 0) {
            i9 = i10;
        }
        if (h0() == 0 || i9 == 0) {
            return;
        }
        W2(i9, a9);
        int[] iArr = this.f16842O;
        if (iArr == null || iArr.length < this.f16844s) {
            this.f16842O = new int[this.f16844s];
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f16844s; i12++) {
            g gVar = this.f16850y;
            if (gVar.f17064d == -1) {
                iL = gVar.f17066f;
                iP = this.f16845t[i12].p(iL);
            } else {
                iL = this.f16845t[i12].l(gVar.f17067g);
                iP = this.f16850y.f17067g;
            }
            int i13 = iL - iP;
            if (i13 >= 0) {
                this.f16842O[i11] = i13;
                i11++;
            }
        }
        Arrays.sort(this.f16842O, 0, i11);
        for (int i14 = 0; i14 < i11 && this.f16850y.a(a9); i14++) {
            cVar.a(this.f16850y.f17063c, this.f16842O[i14]);
            g gVar2 = this.f16850y;
            gVar2.f17063c += gVar2.f17064d;
        }
    }

    public final int L2(int i9) {
        int iL = this.f16845t[0].l(i9);
        for (int i10 = 1; i10 < this.f16844s; i10++) {
            int iL2 = this.f16845t[i10].l(i9);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    public final int M2(int i9) {
        int iP = this.f16845t[0].p(i9);
        for (int i10 = 1; i10 < this.f16844s; i10++) {
            int iP2 = this.f16845t[i10].p(i9);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.A a9) {
        return s2(a9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean N0() {
        return this.f16833F != 0;
    }

    public final f N2(g gVar) {
        int i9;
        int i10;
        int i11;
        if (V2(gVar.f17065e)) {
            i10 = this.f16844s - 1;
            i9 = -1;
            i11 = -1;
        } else {
            i9 = this.f16844s;
            i10 = 0;
            i11 = 1;
        }
        f fVar = null;
        if (gVar.f17065e == 1) {
            int iM = this.f16846u.m();
            int i12 = a.e.API_PRIORITY_OTHER;
            while (i10 != i9) {
                f fVar2 = this.f16845t[i10];
                int iL = fVar2.l(iM);
                if (iL < i12) {
                    fVar = fVar2;
                    i12 = iL;
                }
                i10 += i11;
            }
            return fVar;
        }
        int i13 = this.f16846u.i();
        int i14 = Integer.MIN_VALUE;
        while (i10 != i9) {
            f fVar3 = this.f16845t[i10];
            int iP = fVar3.p(i13);
            if (iP > i14) {
                fVar = fVar3;
                i14 = iP;
            }
            i10 += i11;
        }
        return fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int O(RecyclerView.A a9) {
        return t2(a9);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f16828A
            if (r0 == 0) goto L9
            int r0 = r6.I2()
            goto Ld
        L9:
            int r0 = r6.H2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f16832E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f16832E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f16832E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f16832E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f16832E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.f16828A
            if (r7 == 0) goto L4e
            int r7 = r6.H2()
            goto L52
        L4e:
            int r7 = r6.I2()
        L52:
            if (r3 > r7) goto L57
            r6.Q1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int P(RecyclerView.A a9) {
        return u2(a9);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View P2() {
        /*
            r12 = this;
            int r0 = r12.h0()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f16844s
            r2.<init>(r3)
            int r3 = r12.f16844s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f16848w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.R2()
            if (r3 == 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = -1
        L22:
            boolean r7 = r12.f16828A
            if (r7 == 0) goto L28
            r0 = -1
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 >= r0) goto L2c
            r6 = 1
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.g0(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f16860f
            int r9 = r9.f16882e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f16860f
            boolean r9 = r12.r2(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f16860f
            int r9 = r9.f16882e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f16861g
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.g0(r9)
            boolean r10 = r12.f16828A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.j r10 = r12.f16846u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.j r11 = r12.f16846u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.j r10 = r12.f16846u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.j r11 = r12.f16846u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f16860f
            int r8 = r8.f16882e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f16860f
            int r9 = r9.f16882e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = 1
            goto L9a
        L99:
            r8 = 0
        L9a:
            if (r3 >= 0) goto L9e
            r9 = 1
            goto L9f
        L9e:
            r9 = 0
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int Q(RecyclerView.A a9) {
        return s2(a9);
    }

    public void Q2() {
        this.f16832E.b();
        Q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int R(RecyclerView.A a9) {
        return t2(a9);
    }

    public boolean R2() {
        return x0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int S(RecyclerView.A a9) {
        return u2(a9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int T1(int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        return d3(i9, vVar, a9);
    }

    public final void T2(View view, c cVar, boolean z9) {
        int iI0;
        int iI02;
        if (cVar.f16861g) {
            if (this.f16848w != 1) {
                S2(view, RecyclerView.o.i0(I0(), J0(), o() + k(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f16837J, z9);
                return;
            }
            iI0 = this.f16837J;
        } else {
            if (this.f16848w != 1) {
                iI0 = RecyclerView.o.i0(I0(), J0(), o() + k(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
                iI02 = RecyclerView.o.i0(this.f16849x, v0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
                S2(view, iI0, iI02, z9);
            }
            iI0 = RecyclerView.o.i0(this.f16849x, J0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        }
        iI02 = RecyclerView.o.i0(u0(), v0(), n() + b(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        S2(view, iI0, iI02, z9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U1(int i9) {
        e eVar = this.f16836I;
        if (eVar != null && eVar.f16868a != i9) {
            eVar.a();
        }
        this.f16830C = i9;
        this.f16831D = Integer.MIN_VALUE;
        Q1();
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.A r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$A, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int V1(int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        return d3(i9, vVar, a9);
    }

    public final boolean V2(int i9) {
        if (this.f16848w == 0) {
            return (i9 == -1) != this.f16828A;
        }
        return ((i9 == -1) == this.f16828A) == R2();
    }

    public void W2(int i9, RecyclerView.A a9) {
        int iH2;
        int i10;
        if (i9 > 0) {
            iH2 = I2();
            i10 = 1;
        } else {
            iH2 = H2();
            i10 = -1;
        }
        this.f16850y.f17061a = true;
        m3(iH2, a9);
        e3(i10);
        g gVar = this.f16850y;
        gVar.f17063c = iH2 + gVar.f17064d;
        gVar.f17062b = Math.abs(i9);
    }

    public final void X2(View view) {
        for (int i9 = this.f16844s - 1; i9 >= 0; i9--) {
            this.f16845t[i9].u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(int i9) {
        super.Y0(i9);
        for (int i10 = 0; i10 < this.f16844s; i10++) {
            this.f16845t[i10].r(i9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r4.f17065e == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y2(androidx.recyclerview.widget.RecyclerView.v r3, androidx.recyclerview.widget.g r4) {
        /*
            r2 = this;
            boolean r0 = r4.f17061a
            if (r0 == 0) goto L4d
            boolean r0 = r4.f17069i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f17062b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.f17065e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.f17067g
        L14:
            r2.Z2(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f17066f
        L1a:
            r2.a3(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.f17065e
            if (r0 != r1) goto L37
            int r0 = r4.f17066f
            int r1 = r2.K2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.f17067g
            int r4 = r4.f17062b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.f17067g
            int r0 = r2.L2(r0)
            int r1 = r4.f17067g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f17066f
            int r4 = r4.f17062b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.g):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Z0(int i9) {
        super.Z0(i9);
        for (int i10 = 0; i10 < this.f16844s; i10++) {
            this.f16845t[i10].r(i9);
        }
    }

    public final void Z2(RecyclerView.v vVar, int i9) {
        for (int iH0 = h0() - 1; iH0 >= 0; iH0--) {
            View viewG0 = g0(iH0);
            if (this.f16846u.g(viewG0) < i9 || this.f16846u.q(viewG0) < i9) {
                return;
            }
            c cVar = (c) viewG0.getLayoutParams();
            if (cVar.f16861g) {
                for (int i10 = 0; i10 < this.f16844s; i10++) {
                    if (this.f16845t[i10].f16878a.size() == 1) {
                        return;
                    }
                }
                for (int i11 = 0; i11 < this.f16844s; i11++) {
                    this.f16845t[i11].s();
                }
            } else if (cVar.f16860f.f16878a.size() == 1) {
                return;
            } else {
                cVar.f16860f.s();
            }
            J1(viewG0, vVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a2(Rect rect, int i9, int i10) {
        int iK;
        int iK2;
        int iO = o() + k();
        int iN = n() + b();
        if (this.f16848w == 1) {
            iK2 = RecyclerView.o.K(i10, rect.height() + iN, z0());
            iK = RecyclerView.o.K(i9, (this.f16849x * this.f16844s) + iO, A0());
        } else {
            iK = RecyclerView.o.K(i9, rect.width() + iO, A0());
            iK2 = RecyclerView.o.K(i10, (this.f16849x * this.f16844s) + iN, z0());
        }
        Z1(iK, iK2);
    }

    public final void a3(RecyclerView.v vVar, int i9) {
        while (h0() > 0) {
            View viewG0 = g0(0);
            if (this.f16846u.d(viewG0) > i9 || this.f16846u.p(viewG0) > i9) {
                return;
            }
            c cVar = (c) viewG0.getLayoutParams();
            if (cVar.f16861g) {
                for (int i10 = 0; i10 < this.f16844s; i10++) {
                    if (this.f16845t[i10].f16878a.size() == 1) {
                        return;
                    }
                }
                for (int i11 = 0; i11 < this.f16844s; i11++) {
                    this.f16845t[i11].t();
                }
            } else if (cVar.f16860f.f16878a.size() == 1) {
                return;
            } else {
                cVar.f16860f.t();
            }
            J1(viewG0, vVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p b0() {
        return this.f16848w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public final void b3() {
        if (this.f16847v.k() == 1073741824) {
            return;
        }
        int iH0 = h0();
        float fMax = 0.0f;
        for (int i9 = 0; i9 < iH0; i9++) {
            View viewG0 = g0(i9);
            float fE = this.f16847v.e(viewG0);
            if (fE >= fMax) {
                if (((c) viewG0.getLayoutParams()).k()) {
                    fE = (fE * 1.0f) / this.f16844s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i10 = this.f16849x;
        int iRound = Math.round(fMax * this.f16844s);
        if (this.f16847v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f16847v.n());
        }
        n3(iRound);
        if (this.f16849x == i10) {
            return;
        }
        for (int i11 = 0; i11 < iH0; i11++) {
            View viewG02 = g0(i11);
            c cVar = (c) viewG02.getLayoutParams();
            if (!cVar.f16861g) {
                if (R2() && this.f16848w == 1) {
                    int i12 = this.f16844s;
                    int i13 = cVar.f16860f.f16882e;
                    viewG02.offsetLeftAndRight(((-((i12 - 1) - i13)) * this.f16849x) - ((-((i12 - 1) - i13)) * i10));
                } else {
                    int i14 = cVar.f16860f.f16882e;
                    int i15 = this.f16848w;
                    int i16 = (this.f16849x * i14) - (i14 * i10);
                    if (i15 == 1) {
                        viewG02.offsetLeftAndRight(i16);
                    } else {
                        viewG02.offsetTopAndBottom(i16);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p c0(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p d0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public int d3(int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        if (h0() == 0 || i9 == 0) {
            return 0;
        }
        W2(i9, a9);
        int iZ2 = z2(vVar, this.f16850y, a9);
        if (this.f16850y.f17062b >= iZ2) {
            i9 = i9 < 0 ? -iZ2 : iZ2;
        }
        this.f16846u.r(-i9);
        this.f16834G = this.f16828A;
        g gVar = this.f16850y;
        gVar.f17062b = 0;
        Y2(vVar, gVar);
        return i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF e(int i9) {
        int iP2 = p2(i9);
        PointF pointF = new PointF();
        if (iP2 == 0) {
            return null;
        }
        if (this.f16848w == 0) {
            pointF.x = iP2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iP2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.e1(recyclerView, vVar);
        L1(this.f16843P);
        for (int i9 = 0; i9 < this.f16844s; i9++) {
            this.f16845t[i9].e();
        }
        recyclerView.requestLayout();
    }

    public final void e3(int i9) {
        g gVar = this.f16850y;
        gVar.f17065e = i9;
        gVar.f17064d = this.f16828A != (i9 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View f1(View view, int i9, RecyclerView.v vVar, RecyclerView.A a9) {
        View viewZ;
        View viewM;
        if (h0() == 0 || (viewZ = Z(view)) == null) {
            return null;
        }
        c3();
        int iV2 = v2(i9);
        if (iV2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewZ.getLayoutParams();
        boolean z9 = cVar.f16861g;
        f fVar = cVar.f16860f;
        int iI2 = iV2 == 1 ? I2() : H2();
        m3(iI2, a9);
        e3(iV2);
        g gVar = this.f16850y;
        gVar.f17063c = gVar.f17064d + iI2;
        gVar.f17062b = (int) (this.f16846u.n() * 0.33333334f);
        g gVar2 = this.f16850y;
        gVar2.f17068h = true;
        gVar2.f17061a = false;
        z2(vVar, gVar2, a9);
        this.f16834G = this.f16828A;
        if (!z9 && (viewM = fVar.m(iI2, iV2)) != null && viewM != viewZ) {
            return viewM;
        }
        if (V2(iV2)) {
            for (int i10 = this.f16844s - 1; i10 >= 0; i10--) {
                View viewM2 = this.f16845t[i10].m(iI2, iV2);
                if (viewM2 != null && viewM2 != viewZ) {
                    return viewM2;
                }
            }
        } else {
            for (int i11 = 0; i11 < this.f16844s; i11++) {
                View viewM3 = this.f16845t[i11].m(iI2, iV2);
                if (viewM3 != null && viewM3 != viewZ) {
                    return viewM3;
                }
            }
        }
        boolean z10 = (this.f16851z ^ true) == (iV2 == -1);
        if (!z9) {
            View viewA0 = a0(z10 ? fVar.f() : fVar.g());
            if (viewA0 != null && viewA0 != viewZ) {
                return viewA0;
            }
        }
        if (V2(iV2)) {
            for (int i12 = this.f16844s - 1; i12 >= 0; i12--) {
                if (i12 != fVar.f16882e) {
                    f[] fVarArr = this.f16845t;
                    View viewA02 = a0(z10 ? fVarArr[i12].f() : fVarArr[i12].g());
                    if (viewA02 != null && viewA02 != viewZ) {
                        return viewA02;
                    }
                }
            }
        } else {
            for (int i13 = 0; i13 < this.f16844s; i13++) {
                f[] fVarArr2 = this.f16845t;
                View viewA03 = a0(z10 ? fVarArr2[i13].f() : fVarArr2[i13].g());
                if (viewA03 != null && viewA03 != viewZ) {
                    return viewA03;
                }
            }
        }
        return null;
    }

    public void f3(int i9) {
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        D(null);
        if (i9 == this.f16848w) {
            return;
        }
        this.f16848w = i9;
        j jVar = this.f16846u;
        this.f16846u = this.f16847v;
        this.f16847v = jVar;
        Q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g1(AccessibilityEvent accessibilityEvent) {
        super.g1(accessibilityEvent);
        if (h0() > 0) {
            View viewC2 = C2(false);
            View viewB2 = B2(false);
            if (viewC2 == null || viewB2 == null) {
                return;
            }
            int iB0 = B0(viewC2);
            int iB02 = B0(viewB2);
            if (iB0 < iB02) {
                accessibilityEvent.setFromIndex(iB0);
                accessibilityEvent.setToIndex(iB02);
            } else {
                accessibilityEvent.setFromIndex(iB02);
                accessibilityEvent.setToIndex(iB0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g2(RecyclerView recyclerView, RecyclerView.A a9, int i9) {
        h hVar = new h(recyclerView.getContext());
        hVar.p(i9);
        h2(hVar);
    }

    public void g3(boolean z9) {
        D(null);
        e eVar = this.f16836I;
        if (eVar != null && eVar.f16875i != z9) {
            eVar.f16875i = z9;
        }
        this.f16851z = z9;
        Q1();
    }

    public void h3(int i9) {
        D(null);
        if (i9 != this.f16844s) {
            Q2();
            this.f16844s = i9;
            this.f16829B = new BitSet(this.f16844s);
            this.f16845t = new f[this.f16844s];
            for (int i10 = 0; i10 < this.f16844s; i10++) {
                this.f16845t[i10] = new f(i10);
            }
            Q1();
        }
    }

    public final void i3(int i9, int i10) {
        for (int i11 = 0; i11 < this.f16844s; i11++) {
            if (!this.f16845t[i11].f16878a.isEmpty()) {
                o3(this.f16845t[i11], i9, i10);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean j2() {
        return this.f16836I == null;
    }

    public final boolean j3(RecyclerView.A a9, b bVar) {
        boolean z9 = this.f16834G;
        int iC = a9.c();
        bVar.f16853a = z9 ? E2(iC) : A2(iC);
        bVar.f16854b = Integer.MIN_VALUE;
        return true;
    }

    public final void k2(View view) {
        for (int i9 = this.f16844s - 1; i9 >= 0; i9--) {
            this.f16845t[i9].a(view);
        }
    }

    public boolean k3(RecyclerView.A a9, b bVar) {
        int i9;
        int iM;
        int iG;
        if (!a9.h() && (i9 = this.f16830C) != -1) {
            if (i9 >= 0 && i9 < a9.c()) {
                e eVar = this.f16836I;
                if (eVar == null || eVar.f16868a == -1 || eVar.f16870d < 1) {
                    View viewA0 = a0(this.f16830C);
                    if (viewA0 != null) {
                        bVar.f16853a = this.f16828A ? I2() : H2();
                        if (this.f16831D != Integer.MIN_VALUE) {
                            if (bVar.f16855c) {
                                iM = this.f16846u.i() - this.f16831D;
                                iG = this.f16846u.d(viewA0);
                            } else {
                                iM = this.f16846u.m() + this.f16831D;
                                iG = this.f16846u.g(viewA0);
                            }
                            bVar.f16854b = iM - iG;
                            return true;
                        }
                        if (this.f16846u.e(viewA0) > this.f16846u.n()) {
                            bVar.f16854b = bVar.f16855c ? this.f16846u.i() : this.f16846u.m();
                            return true;
                        }
                        int iG2 = this.f16846u.g(viewA0) - this.f16846u.m();
                        if (iG2 < 0) {
                            bVar.f16854b = -iG2;
                            return true;
                        }
                        int i10 = this.f16846u.i() - this.f16846u.d(viewA0);
                        if (i10 < 0) {
                            bVar.f16854b = i10;
                            return true;
                        }
                        bVar.f16854b = Integer.MIN_VALUE;
                    } else {
                        int i11 = this.f16830C;
                        bVar.f16853a = i11;
                        int i12 = this.f16831D;
                        if (i12 == Integer.MIN_VALUE) {
                            bVar.f16855c = p2(i11) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i12);
                        }
                        bVar.f16856d = true;
                    }
                } else {
                    bVar.f16854b = Integer.MIN_VALUE;
                    bVar.f16853a = this.f16830C;
                }
                return true;
            }
            this.f16830C = -1;
            this.f16831D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int l0(RecyclerView.v vVar, RecyclerView.A a9) {
        return this.f16848w == 1 ? this.f16844s : super.l0(vVar, a9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l1(RecyclerView.v vVar, RecyclerView.A a9, View view, C c9) {
        int iH;
        int i9;
        boolean z9;
        boolean z10;
        int iH2;
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.k1(view, c9);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f16848w == 0) {
            iH2 = cVar.h();
            i10 = cVar.f16861g ? this.f16844s : 1;
            z9 = false;
            z10 = false;
            iH = -1;
            i9 = -1;
        } else {
            iH = cVar.h();
            i9 = cVar.f16861g ? this.f16844s : 1;
            z9 = false;
            z10 = false;
            iH2 = -1;
            i10 = -1;
        }
        c9.a0(C.c.a(iH2, i10, iH, i9, z9, z10));
    }

    public final void l2(b bVar) {
        boolean z9;
        e eVar = this.f16836I;
        int i9 = eVar.f16870d;
        if (i9 > 0) {
            if (i9 == this.f16844s) {
                for (int i10 = 0; i10 < this.f16844s; i10++) {
                    this.f16845t[i10].e();
                    e eVar2 = this.f16836I;
                    int i11 = eVar2.f16871e[i10];
                    if (i11 != Integer.MIN_VALUE) {
                        i11 += eVar2.f16876j ? this.f16846u.i() : this.f16846u.m();
                    }
                    this.f16845t[i10].v(i11);
                }
            } else {
                eVar.c();
                e eVar3 = this.f16836I;
                eVar3.f16868a = eVar3.f16869c;
            }
        }
        e eVar4 = this.f16836I;
        this.f16835H = eVar4.f16877k;
        g3(eVar4.f16875i);
        c3();
        e eVar5 = this.f16836I;
        int i12 = eVar5.f16868a;
        if (i12 != -1) {
            this.f16830C = i12;
            z9 = eVar5.f16876j;
        } else {
            z9 = this.f16828A;
        }
        bVar.f16855c = z9;
        if (eVar5.f16872f > 1) {
            d dVar = this.f16832E;
            dVar.f16862a = eVar5.f16873g;
            dVar.f16863b = eVar5.f16874h;
        }
    }

    public void l3(RecyclerView.A a9, b bVar) {
        if (k3(a9, bVar) || j3(a9, bVar)) {
            return;
        }
        bVar.a();
        bVar.f16853a = 0;
    }

    public boolean m2() {
        int iL = this.f16845t[0].l(Integer.MIN_VALUE);
        for (int i9 = 1; i9 < this.f16844s; i9++) {
            if (this.f16845t[i9].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3(int r5, androidx.recyclerview.widget.RecyclerView.A r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.g r0 = r4.f16850y
            r1 = 0
            r0.f17062b = r1
            r0.f17063c = r5
            boolean r0 = r4.T0()
            r2 = 1
            if (r0 == 0) goto L2f
            int r6 = r6.f()
            r0 = -1
            if (r6 == r0) goto L2f
            boolean r0 = r4.f16828A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L26
            androidx.recyclerview.widget.j r5 = r4.f16846u
            int r5 = r5.n()
        L24:
            r6 = 0
            goto L31
        L26:
            androidx.recyclerview.widget.j r5 = r4.f16846u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L31
        L2f:
            r5 = 0
            goto L24
        L31:
            boolean r0 = r4.k0()
            if (r0 == 0) goto L4e
            androidx.recyclerview.widget.g r0 = r4.f16850y
            androidx.recyclerview.widget.j r3 = r4.f16846u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f17066f = r3
            androidx.recyclerview.widget.g r6 = r4.f16850y
            androidx.recyclerview.widget.j r0 = r4.f16846u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.f17067g = r0
            goto L5e
        L4e:
            androidx.recyclerview.widget.g r0 = r4.f16850y
            androidx.recyclerview.widget.j r3 = r4.f16846u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.f17067g = r3
            androidx.recyclerview.widget.g r5 = r4.f16850y
            int r6 = -r6
            r5.f17066f = r6
        L5e:
            androidx.recyclerview.widget.g r5 = r4.f16850y
            r5.f17068h = r1
            r5.f17061a = r2
            androidx.recyclerview.widget.j r6 = r4.f16846u
            int r6 = r6.k()
            if (r6 != 0) goto L75
            androidx.recyclerview.widget.j r6 = r4.f16846u
            int r6 = r6.h()
            if (r6 != 0) goto L75
            r1 = 1
        L75:
            r5.f17069i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3(int, androidx.recyclerview.widget.RecyclerView$A):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n1(RecyclerView recyclerView, int i9, int i10) {
        O2(i9, i10, 1);
    }

    public boolean n2() {
        int iP = this.f16845t[0].p(Integer.MIN_VALUE);
        for (int i9 = 1; i9 < this.f16844s; i9++) {
            if (this.f16845t[i9].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    public void n3(int i9) {
        this.f16849x = i9 / this.f16844s;
        this.f16837J = View.MeasureSpec.makeMeasureSpec(i9, this.f16847v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o1(RecyclerView recyclerView) {
        this.f16832E.b();
        Q1();
    }

    public final void o2(View view, c cVar, g gVar) {
        if (gVar.f17065e == 1) {
            if (cVar.f16861g) {
                k2(view);
                return;
            } else {
                cVar.f16860f.a(view);
                return;
            }
        }
        if (cVar.f16861g) {
            X2(view);
        } else {
            cVar.f16860f.u(view);
        }
    }

    public final void o3(f fVar, int i9, int i10) {
        int iJ = fVar.j();
        if (i9 == -1) {
            if (fVar.o() + iJ > i10) {
                return;
            }
        } else if (fVar.k() - iJ < i10) {
            return;
        }
        this.f16829B.set(fVar.f16882e, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p1(RecyclerView recyclerView, int i9, int i10, int i11) {
        O2(i9, i10, 8);
    }

    public final int p2(int i9) {
        if (h0() == 0) {
            return this.f16828A ? 1 : -1;
        }
        return (i9 < H2()) != this.f16828A ? -1 : 1;
    }

    public final int p3(int i9, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return i9;
        }
        int mode = View.MeasureSpec.getMode(i9);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i9) - i10) - i11), mode) : i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void q1(RecyclerView recyclerView, int i9, int i10) {
        O2(i9, i10, 2);
    }

    public boolean q2() {
        int iH2;
        int iI2;
        if (h0() == 0 || this.f16833F == 0 || !M0()) {
            return false;
        }
        if (this.f16828A) {
            iH2 = I2();
            iI2 = H2();
        } else {
            iH2 = H2();
            iI2 = I2();
        }
        if (iH2 == 0 && P2() != null) {
            this.f16832E.b();
        } else {
            if (!this.f16840M) {
                return false;
            }
            int i9 = this.f16828A ? -1 : 1;
            int i10 = iI2 + 1;
            d.a aVarE = this.f16832E.e(iH2, i10, i9, true);
            if (aVarE == null) {
                this.f16840M = false;
                this.f16832E.d(i10);
                return false;
            }
            d.a aVarE2 = this.f16832E.e(iH2, aVarE.f16864a, i9 * (-1), true);
            if (aVarE2 == null) {
                this.f16832E.d(aVarE.f16864a);
            } else {
                this.f16832E.d(aVarE2.f16864a + 1);
            }
        }
        R1();
        Q1();
        return true;
    }

    public final boolean r2(f fVar) {
        if (this.f16828A) {
            if (fVar.k() < this.f16846u.i()) {
                ArrayList arrayList = fVar.f16878a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f16861g;
            }
        } else if (fVar.o() > this.f16846u.m()) {
            return !fVar.n((View) fVar.f16878a.get(0)).f16861g;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void s1(RecyclerView recyclerView, int i9, int i10, Object obj) {
        O2(i9, i10, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t1(RecyclerView.v vVar, RecyclerView.A a9) {
        U2(vVar, a9, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void u1(RecyclerView.A a9) {
        super.u1(a9);
        this.f16830C = -1;
        this.f16831D = Integer.MIN_VALUE;
        this.f16836I = null;
        this.f16839L.c();
    }

    public final d.a w2(int i9) {
        d.a aVar = new d.a();
        aVar.f16866d = new int[this.f16844s];
        for (int i10 = 0; i10 < this.f16844s; i10++) {
            aVar.f16866d[i10] = i9 - this.f16845t[i10].l(i9);
        }
        return aVar;
    }

    public final d.a x2(int i9) {
        d.a aVar = new d.a();
        aVar.f16866d = new int[this.f16844s];
        for (int i10 = 0; i10 < this.f16844s; i10++) {
            aVar.f16866d[i10] = this.f16845t[i10].p(i9) - i9;
        }
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void y1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f16836I = (e) parcelable;
            Q1();
        }
    }

    public final void y2() {
        this.f16846u = j.b(this, this.f16848w);
        this.f16847v = j.b(this, 1 - this.f16848w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable z1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.f16836I != null) {
            return new e(this.f16836I);
        }
        e eVar = new e();
        eVar.f16875i = this.f16851z;
        eVar.f16876j = this.f16834G;
        eVar.f16877k = this.f16835H;
        d dVar = this.f16832E;
        if (dVar == null || (iArr = dVar.f16862a) == null) {
            eVar.f16872f = 0;
        } else {
            eVar.f16873g = iArr;
            eVar.f16872f = iArr.length;
            eVar.f16874h = dVar.f16863b;
        }
        if (h0() > 0) {
            eVar.f16868a = this.f16834G ? I2() : H2();
            eVar.f16869c = D2();
            int i9 = this.f16844s;
            eVar.f16870d = i9;
            eVar.f16871e = new int[i9];
            for (int i10 = 0; i10 < this.f16844s; i10++) {
                if (this.f16834G) {
                    iP = this.f16845t[i10].l(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f16846u.i();
                        iP -= iM;
                    }
                } else {
                    iP = this.f16845t[i10].p(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f16846u.m();
                        iP -= iM;
                    }
                }
                eVar.f16871e[i10] = iP;
            }
        } else {
            eVar.f16868a = -1;
            eVar.f16869c = -1;
            eVar.f16870d = 0;
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final int z2(RecyclerView.v vVar, g gVar, RecyclerView.A a9) {
        int i9;
        f fVarN2;
        int iE;
        int i10;
        int iE2;
        int iE3;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        View view;
        int i11;
        int i12;
        ?? r9 = 0;
        this.f16829B.set(0, this.f16844s, true);
        if (this.f16850y.f17069i) {
            i9 = gVar.f17065e == 1 ? a.e.API_PRIORITY_OTHER : Integer.MIN_VALUE;
        } else {
            i9 = gVar.f17065e == 1 ? gVar.f17067g + gVar.f17062b : gVar.f17066f - gVar.f17062b;
        }
        i3(gVar.f17065e, i9);
        int i13 = this.f16828A ? this.f16846u.i() : this.f16846u.m();
        boolean z9 = false;
        while (gVar.a(a9) && (this.f16850y.f17069i || !this.f16829B.isEmpty())) {
            View viewB = gVar.b(vVar);
            c cVar = (c) viewB.getLayoutParams();
            int iC = cVar.c();
            int iG = this.f16832E.g(iC);
            boolean z10 = iG == -1;
            if (z10) {
                fVarN2 = cVar.f16861g ? this.f16845t[r9] : N2(gVar);
                this.f16832E.n(iC, fVarN2);
            } else {
                fVarN2 = this.f16845t[iG];
            }
            f fVar = fVarN2;
            cVar.f16860f = fVar;
            if (gVar.f17065e == 1) {
                A(viewB);
            } else {
                B(viewB, r9);
            }
            T2(viewB, cVar, r9);
            if (gVar.f17065e == 1) {
                int iJ2 = cVar.f16861g ? J2(i13) : fVar.l(i13);
                int iE4 = this.f16846u.e(viewB) + iJ2;
                if (z10 && cVar.f16861g) {
                    d.a aVarW2 = w2(iJ2);
                    aVarW2.f16865c = -1;
                    aVarW2.f16864a = iC;
                    this.f16832E.a(aVarW2);
                }
                i10 = iE4;
                iE = iJ2;
            } else {
                int iM2 = cVar.f16861g ? M2(i13) : fVar.p(i13);
                iE = iM2 - this.f16846u.e(viewB);
                if (z10 && cVar.f16861g) {
                    d.a aVarX2 = x2(iM2);
                    aVarX2.f16865c = 1;
                    aVarX2.f16864a = iC;
                    this.f16832E.a(aVarX2);
                }
                i10 = iM2;
            }
            if (cVar.f16861g && gVar.f17064d == -1) {
                if (z10) {
                    this.f16840M = true;
                } else {
                    if (!(gVar.f17065e == 1 ? m2() : n2())) {
                        d.a aVarF = this.f16832E.f(iC);
                        if (aVarF != null) {
                            aVarF.f16867e = true;
                        }
                        this.f16840M = true;
                    }
                }
            }
            o2(viewB, cVar, gVar);
            if (R2() && this.f16848w == 1) {
                int i14 = cVar.f16861g ? this.f16847v.i() : this.f16847v.i() - (((this.f16844s - 1) - fVar.f16882e) * this.f16849x);
                iE3 = i14;
                iE2 = i14 - this.f16847v.e(viewB);
            } else {
                int iM = cVar.f16861g ? this.f16847v.m() : (fVar.f16882e * this.f16849x) + this.f16847v.m();
                iE2 = iM;
                iE3 = this.f16847v.e(viewB) + iM;
            }
            if (this.f16848w == 1) {
                staggeredGridLayoutManager = this;
                view = viewB;
                i11 = iE2;
                iE2 = iE;
                i12 = iE3;
            } else {
                staggeredGridLayoutManager = this;
                view = viewB;
                i11 = iE;
                i12 = i10;
                i10 = iE3;
            }
            staggeredGridLayoutManager.V0(view, i11, iE2, i12, i10);
            if (cVar.f16861g) {
                i3(this.f16850y.f17065e, i9);
            } else {
                o3(fVar, this.f16850y.f17065e, i9);
            }
            Y2(vVar, this.f16850y);
            if (this.f16850y.f17068h && viewB.hasFocusable()) {
                if (cVar.f16861g) {
                    this.f16829B.clear();
                } else {
                    this.f16829B.set(fVar.f16882e, false);
                }
            }
            z9 = true;
            r9 = 0;
        }
        if (!z9) {
            Y2(vVar, this.f16850y);
        }
        int iM3 = this.f16850y.f17065e == -1 ? this.f16846u.m() - M2(this.f16846u.m()) : J2(this.f16846u.i()) - this.f16846u.i();
        if (iM3 > 0) {
            return Math.min(gVar.f17062b, iM3);
        }
        return 0;
    }
}
