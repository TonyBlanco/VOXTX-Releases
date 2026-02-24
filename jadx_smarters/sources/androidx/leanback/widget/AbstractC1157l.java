package androidx.leanback.widget;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.util.Arrays;
import s.C2698d;

/* JADX INFO: renamed from: androidx.leanback.widget.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1157l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f15664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15667e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2698d[] f15670h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f15663a = new Object[1];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15668f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15669g = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15671i = -1;

    /* JADX INFO: renamed from: androidx.leanback.widget.l$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15672a;

        public a(int i9) {
            this.f15672a = i9;
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.l$b */
    public interface b {
        int a();

        int b(int i9);

        void c(Object obj, int i9, int i10, int i11, int i12);

        int d(int i9);

        int e(int i9, boolean z9, Object[] objArr, boolean z10);

        int getCount();

        void removeItem(int i9);
    }

    public static AbstractC1157l g(int i9) {
        if (i9 == 1) {
            return new T();
        }
        W w9 = new W();
        w9.C(i9);
        return w9;
    }

    public void A() {
        this.f15669g = -1;
        this.f15668f = -1;
    }

    public final void B() {
        if (this.f15669g < this.f15668f) {
            A();
        }
    }

    public void C(int i9) {
        if (i9 <= 0) {
            throw new IllegalArgumentException();
        }
        if (this.f15667e == i9) {
            return;
        }
        this.f15667e = i9;
        this.f15670h = new C2698d[i9];
        for (int i10 = 0; i10 < this.f15667e; i10++) {
            this.f15670h[i10] = new C2698d();
        }
    }

    public void D(b bVar) {
        this.f15664b = bVar;
    }

    public final void E(boolean z9) {
        this.f15665c = z9;
    }

    public final void F(int i9) {
        this.f15666d = i9;
    }

    public void G(int i9) {
        this.f15671i = i9;
    }

    public boolean a() {
        return c(this.f15665c ? a.e.API_PRIORITY_OTHER : Integer.MIN_VALUE, true);
    }

    public final void b(int i9) {
        c(i9, false);
    }

    public abstract boolean c(int i9, boolean z9);

    public final boolean d(int i9) {
        if (this.f15669g < 0) {
            return false;
        }
        if (this.f15665c) {
            if (l(true, null) > i9 + this.f15666d) {
                return false;
            }
        } else if (j(false, null) < i9 - this.f15666d) {
            return false;
        }
        return true;
    }

    public final boolean e(int i9) {
        if (this.f15669g < 0) {
            return false;
        }
        if (this.f15665c) {
            if (j(false, null) < i9 - this.f15666d) {
                return false;
            }
        } else if (l(true, null) > i9 + this.f15666d) {
            return false;
        }
        return true;
    }

    public void f(int i9, int i10, RecyclerView.o.c cVar) {
    }

    public void h(int[] iArr, int i9, SparseIntArray sparseIntArray) {
        int iP = p();
        int iBinarySearch = iP >= 0 ? Arrays.binarySearch(iArr, 0, i9, iP) : 0;
        if (iBinarySearch < 0) {
            int iB = this.f15665c ? (this.f15664b.b(iP) - this.f15664b.d(iP)) - this.f15666d : this.f15664b.b(iP) + this.f15664b.d(iP) + this.f15666d;
            for (int i10 = (-iBinarySearch) - 1; i10 < i9; i10++) {
                int i11 = iArr[i10];
                int i12 = sparseIntArray.get(i11);
                int i13 = i12 < 0 ? 0 : i12;
                int iE = this.f15664b.e(i11, true, this.f15663a, true);
                this.f15664b.c(this.f15663a[0], i11, iE, i13, iB);
                iB = this.f15665c ? (iB - iE) - this.f15666d : iB + iE + this.f15666d;
            }
        }
        int iM = m();
        int iBinarySearch2 = iM >= 0 ? Arrays.binarySearch(iArr, 0, i9, iM) : 0;
        if (iBinarySearch2 < 0) {
            boolean z9 = this.f15665c;
            int iB2 = this.f15664b.b(iM);
            for (int i14 = (-iBinarySearch2) - 2; i14 >= 0; i14--) {
                int i15 = iArr[i14];
                int i16 = sparseIntArray.get(i15);
                int i17 = i16 < 0 ? 0 : i16;
                int iE2 = this.f15664b.e(i15, false, this.f15663a, true);
                iB2 = this.f15665c ? iB2 + this.f15666d + iE2 : (iB2 - this.f15666d) - iE2;
                this.f15664b.c(this.f15663a[0], i15, iE2, i17, iB2);
            }
        }
    }

    public abstract int i(boolean z9, int i9, int[] iArr);

    public final int j(boolean z9, int[] iArr) {
        return i(z9, this.f15665c ? this.f15668f : this.f15669g, iArr);
    }

    public abstract int k(boolean z9, int i9, int[] iArr);

    public final int l(boolean z9, int[] iArr) {
        return k(z9, this.f15665c ? this.f15669g : this.f15668f, iArr);
    }

    public final int m() {
        return this.f15668f;
    }

    public final C2698d[] n() {
        return o(m(), p());
    }

    public abstract C2698d[] o(int i9, int i10);

    public final int p() {
        return this.f15669g;
    }

    public abstract a q(int i9);

    public int r() {
        return this.f15667e;
    }

    public final int s(int i9) {
        a aVarQ = q(i9);
        if (aVarQ == null) {
            return -1;
        }
        return aVarQ.f15672a;
    }

    public void t(int i9) {
        int i10;
        if (i9 >= 0 && (i10 = this.f15669g) >= 0) {
            if (i10 >= i9) {
                this.f15669g = i9 - 1;
            }
            B();
            if (m() < 0) {
                G(i9);
            }
        }
    }

    public boolean u() {
        return this.f15665c;
    }

    public final boolean v() {
        return x(this.f15665c ? Integer.MIN_VALUE : a.e.API_PRIORITY_OTHER, true);
    }

    public final void w(int i9) {
        x(i9, false);
    }

    public abstract boolean x(int i9, boolean z9);

    public void y(int i9, int i10) {
        while (true) {
            int i11 = this.f15669g;
            if (i11 >= this.f15668f && i11 > i9) {
                if (!this.f15665c) {
                    if (this.f15664b.b(i11) < i10) {
                        break;
                    }
                    this.f15664b.removeItem(this.f15669g);
                    this.f15669g--;
                } else {
                    if (this.f15664b.b(i11) > i10) {
                        break;
                    }
                    this.f15664b.removeItem(this.f15669g);
                    this.f15669g--;
                }
            } else {
                break;
            }
        }
        B();
    }

    public void z(int i9, int i10) {
        while (true) {
            int i11 = this.f15669g;
            int i12 = this.f15668f;
            if (i11 >= i12 && i12 < i9) {
                int iD = this.f15664b.d(i12);
                if (!this.f15665c) {
                    if (this.f15664b.b(this.f15668f) + iD > i10) {
                        break;
                    }
                    this.f15664b.removeItem(this.f15668f);
                    this.f15668f++;
                } else {
                    if (this.f15664b.b(this.f15668f) - iD < i10) {
                        break;
                    }
                    this.f15664b.removeItem(this.f15668f);
                    this.f15668f++;
                }
            } else {
                break;
            }
        }
        B();
    }
}
