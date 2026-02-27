package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0191b f16896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f16897b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f16898c = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f16899a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f16900b;

        public void a(int i9) {
            if (i9 < 64) {
                this.f16899a &= ~(1 << i9);
                return;
            }
            a aVar = this.f16900b;
            if (aVar != null) {
                aVar.a(i9 - 64);
            }
        }

        public int b(int i9) {
            a aVar = this.f16900b;
            return aVar == null ? i9 >= 64 ? Long.bitCount(this.f16899a) : Long.bitCount(this.f16899a & ((1 << i9) - 1)) : i9 < 64 ? Long.bitCount(this.f16899a & ((1 << i9) - 1)) : aVar.b(i9 - 64) + Long.bitCount(this.f16899a);
        }

        public final void c() {
            if (this.f16900b == null) {
                this.f16900b = new a();
            }
        }

        public boolean d(int i9) {
            if (i9 < 64) {
                return (this.f16899a & (1 << i9)) != 0;
            }
            c();
            return this.f16900b.d(i9 - 64);
        }

        public void e(int i9, boolean z9) {
            if (i9 >= 64) {
                c();
                this.f16900b.e(i9 - 64, z9);
                return;
            }
            long j9 = this.f16899a;
            boolean z10 = (Long.MIN_VALUE & j9) != 0;
            long j10 = (1 << i9) - 1;
            this.f16899a = ((j9 & (~j10)) << 1) | (j9 & j10);
            if (z9) {
                h(i9);
            } else {
                a(i9);
            }
            if (z10 || this.f16900b != null) {
                c();
                this.f16900b.e(0, z10);
            }
        }

        public boolean f(int i9) {
            if (i9 >= 64) {
                c();
                return this.f16900b.f(i9 - 64);
            }
            long j9 = 1 << i9;
            long j10 = this.f16899a;
            boolean z9 = (j10 & j9) != 0;
            long j11 = j10 & (~j9);
            this.f16899a = j11;
            long j12 = j9 - 1;
            this.f16899a = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
            a aVar = this.f16900b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f16900b.f(0);
            }
            return z9;
        }

        public void g() {
            this.f16899a = 0L;
            a aVar = this.f16900b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i9) {
            if (i9 < 64) {
                this.f16899a |= 1 << i9;
            } else {
                c();
                this.f16900b.h(i9 - 64);
            }
        }

        public String toString() {
            if (this.f16900b == null) {
                return Long.toBinaryString(this.f16899a);
            }
            return this.f16900b.toString() + "xx" + Long.toBinaryString(this.f16899a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC0191b {
        View a(int i9);

        void addView(View view, int i9);

        void b(View view);

        int c();

        RecyclerView.D d(View view);

        void e(int i9);

        void f();

        int g(View view);

        void h(View view);

        void i(int i9);

        void j(View view, int i9, ViewGroup.LayoutParams layoutParams);
    }

    public b(InterfaceC0191b interfaceC0191b) {
        this.f16896a = interfaceC0191b;
    }

    public void a(View view, int i9, boolean z9) {
        int iC = i9 < 0 ? this.f16896a.c() : h(i9);
        this.f16897b.e(iC, z9);
        if (z9) {
            l(view);
        }
        this.f16896a.addView(view, iC);
    }

    public void b(View view, boolean z9) {
        a(view, -1, z9);
    }

    public void c(View view, int i9, ViewGroup.LayoutParams layoutParams, boolean z9) {
        int iC = i9 < 0 ? this.f16896a.c() : h(i9);
        this.f16897b.e(iC, z9);
        if (z9) {
            l(view);
        }
        this.f16896a.j(view, iC, layoutParams);
    }

    public void d(int i9) {
        int iH = h(i9);
        this.f16897b.f(iH);
        this.f16896a.e(iH);
    }

    public View e(int i9) {
        int size = this.f16898c.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) this.f16898c.get(i10);
            RecyclerView.D d9 = this.f16896a.d(view);
            if (d9.p() == i9 && !d9.w() && !d9.y()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i9) {
        return this.f16896a.a(h(i9));
    }

    public int g() {
        return this.f16896a.c() - this.f16898c.size();
    }

    public final int h(int i9) {
        if (i9 < 0) {
            return -1;
        }
        int iC = this.f16896a.c();
        int i10 = i9;
        while (i10 < iC) {
            int iB = i9 - (i10 - this.f16897b.b(i10));
            if (iB == 0) {
                while (this.f16897b.d(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += iB;
        }
        return -1;
    }

    public View i(int i9) {
        return this.f16896a.a(i9);
    }

    public int j() {
        return this.f16896a.c();
    }

    public void k(View view) {
        int iG = this.f16896a.g(view);
        if (iG >= 0) {
            this.f16897b.h(iG);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l(View view) {
        this.f16898c.add(view);
        this.f16896a.b(view);
    }

    public int m(View view) {
        int iG = this.f16896a.g(view);
        if (iG == -1 || this.f16897b.d(iG)) {
            return -1;
        }
        return iG - this.f16897b.b(iG);
    }

    public boolean n(View view) {
        return this.f16898c.contains(view);
    }

    public void o() {
        this.f16897b.g();
        for (int size = this.f16898c.size() - 1; size >= 0; size--) {
            this.f16896a.h((View) this.f16898c.get(size));
            this.f16898c.remove(size);
        }
        this.f16896a.f();
    }

    public void p(View view) {
        int iG = this.f16896a.g(view);
        if (iG < 0) {
            return;
        }
        if (this.f16897b.f(iG)) {
            t(view);
        }
        this.f16896a.i(iG);
    }

    public void q(int i9) {
        int iH = h(i9);
        View viewA = this.f16896a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f16897b.f(iH)) {
            t(viewA);
        }
        this.f16896a.i(iH);
    }

    public boolean r(View view) {
        int iG = this.f16896a.g(view);
        if (iG == -1) {
            t(view);
            return true;
        }
        if (!this.f16897b.d(iG)) {
            return false;
        }
        this.f16897b.f(iG);
        t(view);
        this.f16896a.i(iG);
        return true;
    }

    public void s(View view) {
        int iG = this.f16896a.g(view);
        if (iG < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f16897b.d(iG)) {
            this.f16897b.a(iG);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.f16898c.remove(view)) {
            return false;
        }
        this.f16896a.h(view);
        return true;
    }

    public String toString() {
        return this.f16897b.toString() + ", hidden list:" + this.f16898c.size();
    }
}
