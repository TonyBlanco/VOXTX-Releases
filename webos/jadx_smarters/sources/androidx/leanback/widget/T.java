package androidx.leanback.widget;

import androidx.leanback.widget.AbstractC1157l;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import s.C2698d;

/* JADX INFO: loaded from: classes.dex */
public class T extends AbstractC1157l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC1157l.a f15585j = new AbstractC1157l.a(0);

    public T() {
        C(1);
    }

    public int H() {
        int i9 = this.f15669g;
        if (i9 >= 0) {
            return i9 + 1;
        }
        int i10 = this.f15671i;
        if (i10 != -1) {
            return Math.min(i10, this.f15664b.getCount() - 1);
        }
        return 0;
    }

    public int I() {
        int i9 = this.f15668f;
        if (i9 >= 0) {
            return i9 - 1;
        }
        int i10 = this.f15671i;
        return i10 != -1 ? Math.min(i10, this.f15664b.getCount() - 1) : this.f15664b.getCount() - 1;
    }

    @Override // androidx.leanback.widget.AbstractC1157l
    public final boolean c(int i9, boolean z9) {
        int iB;
        if (this.f15664b.getCount() == 0) {
            return false;
        }
        if (!z9 && d(i9)) {
            return false;
        }
        int iH = H();
        boolean z10 = false;
        while (iH < this.f15664b.getCount()) {
            int iE = this.f15664b.e(iH, true, this.f15663a, false);
            if (this.f15668f < 0 || this.f15669g < 0) {
                iB = this.f15665c ? a.e.API_PRIORITY_OTHER : Integer.MIN_VALUE;
                this.f15668f = iH;
            } else if (this.f15665c) {
                int i10 = iH - 1;
                iB = (this.f15664b.b(i10) - this.f15664b.d(i10)) - this.f15666d;
            } else {
                int i11 = iH - 1;
                iB = this.f15664b.b(i11) + this.f15664b.d(i11) + this.f15666d;
            }
            this.f15669g = iH;
            this.f15664b.c(this.f15663a[0], iH, iE, 0, iB);
            if (z9 || d(i9)) {
                return true;
            }
            iH++;
            z10 = true;
        }
        return z10;
    }

    @Override // androidx.leanback.widget.AbstractC1157l
    public void f(int i9, int i10, RecyclerView.o.c cVar) {
        int I9;
        int iB;
        if (!this.f15665c ? i10 < 0 : i10 > 0) {
            if (p() == this.f15664b.getCount() - 1) {
                return;
            }
            I9 = H();
            int iD = this.f15664b.d(this.f15669g) + this.f15666d;
            int iB2 = this.f15664b.b(this.f15669g);
            if (this.f15665c) {
                iD = -iD;
            }
            iB = iD + iB2;
        } else {
            if (m() == 0) {
                return;
            }
            I9 = I();
            iB = this.f15664b.b(this.f15668f) + (this.f15665c ? this.f15666d : -this.f15666d);
        }
        cVar.a(I9, Math.abs(iB - i9));
    }

    @Override // androidx.leanback.widget.AbstractC1157l
    public final int i(boolean z9, int i9, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i9;
        }
        return this.f15665c ? this.f15664b.b(i9) : this.f15664b.b(i9) + this.f15664b.d(i9);
    }

    @Override // androidx.leanback.widget.AbstractC1157l
    public final int k(boolean z9, int i9, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i9;
        }
        return this.f15665c ? this.f15664b.b(i9) - this.f15664b.d(i9) : this.f15664b.b(i9);
    }

    @Override // androidx.leanback.widget.AbstractC1157l
    public final C2698d[] o(int i9, int i10) {
        this.f15670h[0].b();
        this.f15670h[0].a(i9);
        this.f15670h[0].a(i10);
        return this.f15670h;
    }

    @Override // androidx.leanback.widget.AbstractC1157l
    public final AbstractC1157l.a q(int i9) {
        return this.f15585j;
    }

    @Override // androidx.leanback.widget.AbstractC1157l
    public final boolean x(int i9, boolean z9) {
        int iB;
        if (this.f15664b.getCount() == 0) {
            return false;
        }
        if (!z9 && e(i9)) {
            return false;
        }
        int iA = this.f15664b.a();
        boolean z10 = false;
        for (int I9 = I(); I9 >= iA; I9--) {
            int iE = this.f15664b.e(I9, false, this.f15663a, false);
            if (this.f15668f < 0 || this.f15669g < 0) {
                iB = this.f15665c ? Integer.MIN_VALUE : a.e.API_PRIORITY_OTHER;
                this.f15668f = I9;
                this.f15669g = I9;
            } else {
                iB = this.f15665c ? this.f15664b.b(I9 + 1) + this.f15666d + iE : (this.f15664b.b(I9 + 1) - this.f15666d) - iE;
                this.f15668f = I9;
            }
            this.f15664b.c(this.f15663a[0], I9, iE, 0, iB);
            z10 = true;
            if (z9 || e(i9)) {
                break;
            }
        }
        return z10;
    }
}
