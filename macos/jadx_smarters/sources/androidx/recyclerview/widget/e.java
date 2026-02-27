package androidx.recyclerview.widget;

import L.t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f16988f = new ThreadLocal();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Comparator f16989g = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16992d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f16990a = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f16993e = new ArrayList();

    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f17001d;
            if ((recyclerView == null) != (cVar2.f17001d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z9 = cVar.f16998a;
            if (z9 != cVar2.f16998a) {
                return z9 ? -1 : 1;
            }
            int i9 = cVar2.f16999b - cVar.f16999b;
            if (i9 != 0) {
                return i9;
            }
            int i10 = cVar.f17000c - cVar2.f17000c;
            if (i10 != 0) {
                return i10;
            }
            return 0;
        }
    }

    public static class b implements RecyclerView.o.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f16996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16997d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i9, int i10) {
            if (i9 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i11 = this.f16997d;
            int i12 = i11 * 2;
            int[] iArr = this.f16996c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f16996c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int[] iArr3 = new int[i11 * 4];
                this.f16996c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f16996c;
            iArr4[i12] = i9;
            iArr4[i12 + 1] = i10;
            this.f16997d++;
        }

        public void b() {
            int[] iArr = this.f16996c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f16997d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z9) {
            this.f16997d = 0;
            int[] iArr = this.f16996c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f16682n;
            if (recyclerView.f16680m == null || oVar == null || !oVar.P0()) {
                return;
            }
            if (z9) {
                if (!recyclerView.f16664e.p()) {
                    oVar.M(recyclerView.f16680m.n(), this);
                }
            } else if (!recyclerView.q0()) {
                oVar.L(this.f16994a, this.f16995b, recyclerView.f16681m0, this);
            }
            int i9 = this.f16997d;
            if (i9 > oVar.f16781m) {
                oVar.f16781m = i9;
                oVar.f16782n = z9;
                recyclerView.f16662c.K();
            }
        }

        public boolean d(int i9) {
            if (this.f16996c != null) {
                int i10 = this.f16997d * 2;
                for (int i11 = 0; i11 < i10; i11 += 2) {
                    if (this.f16996c[i11] == i9) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i9, int i10) {
            this.f16994a = i9;
            this.f16995b = i10;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f16998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f17001d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17002e;

        public void a() {
            this.f16998a = false;
            this.f16999b = 0;
            this.f17000c = 0;
            this.f17001d = null;
            this.f17002e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i9) {
        int iJ = recyclerView.f16666f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            RecyclerView.D dJ0 = RecyclerView.j0(recyclerView.f16666f.i(i10));
            if (dJ0.f16735c == i9 && !dJ0.w()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.f16990a.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f16990a.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView = (RecyclerView) this.f16990a.get(i10);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f16679l0.c(recyclerView, false);
                i9 += recyclerView.f16679l0.f16997d;
            }
        }
        this.f16993e.ensureCapacity(i9);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f16990a.get(i12);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f16679l0;
                int iAbs = Math.abs(bVar.f16994a) + Math.abs(bVar.f16995b);
                for (int i13 = 0; i13 < bVar.f16997d * 2; i13 += 2) {
                    if (i11 >= this.f16993e.size()) {
                        cVar = new c();
                        this.f16993e.add(cVar);
                    } else {
                        cVar = (c) this.f16993e.get(i11);
                    }
                    int[] iArr = bVar.f16996c;
                    int i14 = iArr[i13 + 1];
                    cVar.f16998a = i14 <= iAbs;
                    cVar.f16999b = iAbs;
                    cVar.f17000c = i14;
                    cVar.f17001d = recyclerView2;
                    cVar.f17002e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(this.f16993e, f16989g);
    }

    public final void c(c cVar, long j9) {
        RecyclerView.D dI = i(cVar.f17001d, cVar.f17002e, cVar.f16998a ? Long.MAX_VALUE : j9);
        if (dI == null || dI.f16734b == null || !dI.v() || dI.w()) {
            return;
        }
        h((RecyclerView) dI.f16734b.get(), j9);
    }

    public final void d(long j9) {
        for (int i9 = 0; i9 < this.f16993e.size(); i9++) {
            c cVar = (c) this.f16993e.get(i9);
            if (cVar.f17001d == null) {
                return;
            }
            c(cVar, j9);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i9, int i10) {
        if (recyclerView.isAttachedToWindow() && this.f16991c == 0) {
            this.f16991c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f16679l0.e(i9, i10);
    }

    public void g(long j9) {
        b();
        d(j9);
    }

    public final void h(RecyclerView recyclerView, long j9) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f16642E && recyclerView.f16666f.j() != 0) {
            recyclerView.Y0();
        }
        b bVar = recyclerView.f16679l0;
        bVar.c(recyclerView, true);
        if (bVar.f16997d != 0) {
            try {
                t.a("RV Nested Prefetch");
                recyclerView.f16681m0.i(recyclerView.f16680m);
                for (int i9 = 0; i9 < bVar.f16997d * 2; i9 += 2) {
                    i(recyclerView, bVar.f16996c[i9], j9);
                }
            } finally {
                t.b();
            }
        }
    }

    public final RecyclerView.D i(RecyclerView recyclerView, int i9, long j9) {
        if (e(recyclerView, i9)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.f16662c;
        try {
            recyclerView.K0();
            RecyclerView.D dI = vVar.I(i9, false, j9);
            if (dI != null) {
                if (!dI.v() || dI.w()) {
                    vVar.a(dI, false);
                } else {
                    vVar.B(dI.f16733a);
                }
            }
            recyclerView.M0(false);
            return dI;
        } catch (Throwable th) {
            recyclerView.M0(false);
            throw th;
        }
    }

    public void j(RecyclerView recyclerView) {
        this.f16990a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            t.a("RV Prefetch");
            if (!this.f16990a.isEmpty()) {
                int size = this.f16990a.size();
                long jMax = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    RecyclerView recyclerView = (RecyclerView) this.f16990a.get(i9);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f16992d);
                    this.f16991c = 0L;
                    t.b();
                }
            }
        } finally {
            this.f16991c = 0L;
            t.b();
        }
    }
}
