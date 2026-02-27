package androidx.leanback.widget;

import androidx.leanback.widget.AbstractC1157l;
import com.google.android.gms.common.api.a;
import s.C2697c;
import s.C2698d;

/* JADX INFO: loaded from: classes.dex */
public abstract class V extends AbstractC1157l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2697c f15601j = new C2697c(64);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15602k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f15603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15604m;

    public static class a extends AbstractC1157l.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15606c;

        public a(int i9, int i10, int i11) {
            super(i9);
            this.f15605b = i10;
            this.f15606c = i11;
        }
    }

    public final boolean H(int i9, boolean z9) {
        int i10;
        int iB;
        int i11;
        if (this.f15601j.h() == 0) {
            return false;
        }
        int count = this.f15664b.getCount();
        int i12 = this.f15669g;
        if (i12 >= 0) {
            i10 = i12 + 1;
            iB = this.f15664b.b(i12);
        } else {
            int i13 = this.f15671i;
            i10 = i13 != -1 ? i13 : 0;
            if (i10 > M() + 1 || i10 < L()) {
                this.f15601j.c();
                return false;
            }
            if (i10 > M()) {
                return false;
            }
            iB = a.e.API_PRIORITY_OTHER;
        }
        int iM = M();
        int i14 = i10;
        while (i14 < count && i14 <= iM) {
            a aVarQ = q(i14);
            if (iB != Integer.MAX_VALUE) {
                iB += aVarQ.f15605b;
            }
            int i15 = aVarQ.f15672a;
            int iE = this.f15664b.e(i14, true, this.f15663a, false);
            if (iE != aVarQ.f15606c) {
                aVarQ.f15606c = iE;
                this.f15601j.f(iM - i14);
                i11 = i14;
            } else {
                i11 = iM;
            }
            this.f15669g = i14;
            if (this.f15668f < 0) {
                this.f15668f = i14;
            }
            this.f15664b.c(this.f15663a[0], i14, iE, i15, iB);
            if (!z9 && d(i9)) {
                return true;
            }
            if (iB == Integer.MAX_VALUE) {
                iB = this.f15664b.b(i14);
            }
            if (i15 == this.f15667e - 1 && z9) {
                return true;
            }
            i14++;
            iM = i11;
        }
        return false;
    }

    public final int I(int i9, int i10, int i11) {
        int i12 = this.f15669g;
        if (i12 >= 0 && (i12 != M() || this.f15669g != i9 - 1)) {
            throw new IllegalStateException();
        }
        int i13 = this.f15669g;
        a aVar = new a(i10, i13 < 0 ? (this.f15601j.h() <= 0 || i9 != M() + 1) ? 0 : K(i10) : i11 - this.f15664b.b(i13), 0);
        this.f15601j.b(aVar);
        Object obj = this.f15603l;
        if (obj != null) {
            aVar.f15606c = this.f15604m;
            this.f15603l = null;
        } else {
            aVar.f15606c = this.f15664b.e(i9, true, this.f15663a, false);
            obj = this.f15663a[0];
        }
        Object obj2 = obj;
        if (this.f15601j.h() == 1) {
            this.f15669g = i9;
            this.f15668f = i9;
            this.f15602k = i9;
        } else {
            int i14 = this.f15669g;
            if (i14 < 0) {
                this.f15669g = i9;
                this.f15668f = i9;
            } else {
                this.f15669g = i14 + 1;
            }
        }
        this.f15664b.c(obj2, i9, aVar.f15606c, i10, i11);
        return aVar.f15606c;
    }

    public abstract boolean J(int i9, boolean z9);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0039 -> B:17:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int K(int r3) {
        /*
            r2 = this;
            int r0 = r2.M()
        L4:
            int r1 = r2.f15602k
            if (r0 < r1) goto L14
            androidx.leanback.widget.V$a r1 = r2.q(r0)
            int r1 = r1.f15672a
            if (r1 != r3) goto L11
            goto L18
        L11:
            int r0 = r0 + (-1)
            goto L4
        L14:
            int r0 = r2.M()
        L18:
            boolean r3 = r2.u()
            if (r3 == 0) goto L28
            androidx.leanback.widget.V$a r3 = r2.q(r0)
            int r3 = r3.f15606c
            int r3 = -r3
            int r1 = r2.f15666d
            goto L3f
        L28:
            androidx.leanback.widget.V$a r3 = r2.q(r0)
            int r3 = r3.f15606c
            int r1 = r2.f15666d
            int r3 = r3 + r1
        L31:
            int r0 = r0 + 1
            int r1 = r2.M()
            if (r0 > r1) goto L41
            androidx.leanback.widget.V$a r1 = r2.q(r0)
            int r1 = r1.f15605b
        L3f:
            int r3 = r3 - r1
            goto L31
        L41:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.V.K(int):int");
    }

    public final int L() {
        return this.f15602k;
    }

    public final int M() {
        return (this.f15602k + this.f15601j.h()) - 1;
    }

    @Override // androidx.leanback.widget.AbstractC1157l
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final a q(int i9) {
        int i10 = i9 - this.f15602k;
        if (i10 < 0 || i10 >= this.f15601j.h()) {
            return null;
        }
        return (a) this.f15601j.e(i10);
    }

    public final boolean O(int i9, boolean z9) {
        int i10;
        int iB;
        int i11;
        if (this.f15601j.h() == 0) {
            return false;
        }
        int i12 = this.f15668f;
        if (i12 >= 0) {
            iB = this.f15664b.b(i12);
            i11 = q(this.f15668f).f15605b;
            i10 = this.f15668f - 1;
        } else {
            int i13 = this.f15671i;
            i10 = i13 != -1 ? i13 : 0;
            if (i10 > M() || i10 < L() - 1) {
                this.f15601j.c();
                return false;
            }
            if (i10 < L()) {
                return false;
            }
            iB = a.e.API_PRIORITY_OTHER;
            i11 = 0;
        }
        int iMax = Math.max(this.f15664b.a(), this.f15602k);
        while (i10 >= iMax) {
            a aVarQ = q(i10);
            int i14 = aVarQ.f15672a;
            int iE = this.f15664b.e(i10, false, this.f15663a, false);
            if (iE != aVarQ.f15606c) {
                this.f15601j.g((i10 + 1) - this.f15602k);
                this.f15602k = this.f15668f;
                this.f15603l = this.f15663a[0];
                this.f15604m = iE;
                return false;
            }
            this.f15668f = i10;
            if (this.f15669g < 0) {
                this.f15669g = i10;
            }
            this.f15664b.c(this.f15663a[0], i10, iE, i14, iB - i11);
            if (!z9 && e(i9)) {
                return true;
            }
            iB = this.f15664b.b(i10);
            i11 = aVarQ.f15605b;
            if (i14 == 0 && z9) {
                return true;
            }
            i10--;
        }
        return false;
    }

    public final int P(int i9, int i10, int i11) {
        int i12 = this.f15668f;
        if (i12 >= 0 && (i12 != L() || this.f15668f != i9 + 1)) {
            throw new IllegalStateException();
        }
        int i13 = this.f15602k;
        a aVarQ = i13 >= 0 ? q(i13) : null;
        int iB = this.f15664b.b(this.f15602k);
        a aVar = new a(i10, 0, 0);
        this.f15601j.a(aVar);
        Object obj = this.f15603l;
        if (obj != null) {
            aVar.f15606c = this.f15604m;
            this.f15603l = null;
        } else {
            aVar.f15606c = this.f15664b.e(i9, false, this.f15663a, false);
            obj = this.f15663a[0];
        }
        Object obj2 = obj;
        this.f15668f = i9;
        this.f15602k = i9;
        if (this.f15669g < 0) {
            this.f15669g = i9;
        }
        int i14 = !this.f15665c ? i11 - aVar.f15606c : i11 + aVar.f15606c;
        if (aVarQ != null) {
            aVarQ.f15605b = iB - i14;
        }
        this.f15664b.c(obj2, i9, aVar.f15606c, i10, i14);
        return aVar.f15606c;
    }

    public abstract boolean Q(int i9, boolean z9);

    @Override // androidx.leanback.widget.AbstractC1157l
    public final boolean c(int i9, boolean z9) {
        if (this.f15664b.getCount() == 0) {
            return false;
        }
        if (!z9 && d(i9)) {
            return false;
        }
        try {
            if (!H(i9, z9)) {
                return J(i9, z9);
            }
            this.f15663a[0] = null;
            this.f15603l = null;
            return true;
        } finally {
            this.f15663a[0] = null;
            this.f15603l = null;
        }
    }

    @Override // androidx.leanback.widget.AbstractC1157l
    public final C2698d[] o(int i9, int i10) {
        for (int i11 = 0; i11 < this.f15667e; i11++) {
            this.f15670h[i11].b();
        }
        if (i9 >= 0) {
            while (i9 <= i10) {
                C2698d c2698d = this.f15670h[q(i9).f15672a];
                if (c2698d.g() <= 0 || c2698d.e() != i9 - 1) {
                    c2698d.a(i9);
                } else {
                    c2698d.f();
                }
                c2698d.a(i9);
                i9++;
            }
        }
        return this.f15670h;
    }

    @Override // androidx.leanback.widget.AbstractC1157l
    public void t(int i9) {
        super.t(i9);
        this.f15601j.f((M() - i9) + 1);
        if (this.f15601j.h() == 0) {
            this.f15602k = -1;
        }
    }

    @Override // androidx.leanback.widget.AbstractC1157l
    public final boolean x(int i9, boolean z9) {
        if (this.f15664b.getCount() == 0) {
            return false;
        }
        if (!z9 && e(i9)) {
            return false;
        }
        try {
            if (!O(i9, z9)) {
                return Q(i9, z9);
            }
            this.f15663a[0] = null;
            this.f15603l = null;
            return true;
        } finally {
            this.f15663a[0] = null;
            this.f15603l = null;
        }
    }
}
