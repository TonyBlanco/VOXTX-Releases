package Z3;

import B3.g0;
import O2.C0936z0;
import android.os.SystemClock;
import d4.AbstractC1684a;
import d4.k0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: Z3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1069c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f11111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f11113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0936z0[] f11115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f11116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11117g;

    public AbstractC1069c(g0 g0Var, int... iArr) {
        this(g0Var, iArr, 0);
    }

    public AbstractC1069c(g0 g0Var, int[] iArr, int i9) {
        int i10 = 0;
        AbstractC1684a.g(iArr.length > 0);
        this.f11114d = i9;
        this.f11111a = (g0) AbstractC1684a.e(g0Var);
        int length = iArr.length;
        this.f11112b = length;
        this.f11115e = new C0936z0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f11115e[i11] = g0Var.c(iArr[i11]);
        }
        Arrays.sort(this.f11115e, new Comparator() { // from class: Z3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC1069c.u((C0936z0) obj, (C0936z0) obj2);
            }
        });
        this.f11113c = new int[this.f11112b];
        while (true) {
            int i12 = this.f11112b;
            if (i10 >= i12) {
                this.f11116f = new long[i12];
                return;
            } else {
                this.f11113c[i10] = g0Var.d(this.f11115e[i10]);
                i10++;
            }
        }
    }

    public static /* synthetic */ int u(C0936z0 c0936z0, C0936z0 c0936z02) {
        return c0936z02.f6463i - c0936z0.f6463i;
    }

    @Override // Z3.s
    public boolean a(int i9, long j9) {
        return this.f11116f[i9] > j9;
    }

    @Override // Z3.v
    public final C0936z0 c(int i9) {
        return this.f11115e[i9];
    }

    @Override // Z3.v
    public final int d(int i9) {
        return this.f11113c[i9];
    }

    @Override // Z3.s
    public void disable() {
    }

    @Override // Z3.s
    public boolean e(int i9, long j9) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i9, jElapsedRealtime);
        int i10 = 0;
        while (i10 < this.f11112b && !zA) {
            zA = (i10 == i9 || a(i10, jElapsedRealtime)) ? false : true;
            i10++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.f11116f;
        jArr[i9] = Math.max(jArr[i9], k0.b(jElapsedRealtime, j9, Long.MAX_VALUE));
        return true;
    }

    @Override // Z3.s
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1069c abstractC1069c = (AbstractC1069c) obj;
        return this.f11111a == abstractC1069c.f11111a && Arrays.equals(this.f11113c, abstractC1069c.f11113c);
    }

    @Override // Z3.s
    public void f(float f9) {
    }

    @Override // Z3.s
    public /* synthetic */ void h() {
        r.a(this);
    }

    public int hashCode() {
        if (this.f11117g == 0) {
            this.f11117g = (System.identityHashCode(this.f11111a) * 31) + Arrays.hashCode(this.f11113c);
        }
        return this.f11117g;
    }

    @Override // Z3.v
    public final int i(int i9) {
        for (int i10 = 0; i10 < this.f11112b; i10++) {
            if (this.f11113c[i10] == i9) {
                return i10;
            }
        }
        return -1;
    }

    @Override // Z3.s
    public /* synthetic */ boolean j(long j9, D3.f fVar, List list) {
        return r.d(this, j9, fVar, list);
    }

    @Override // Z3.v
    public final g0 k() {
        return this.f11111a;
    }

    @Override // Z3.v
    public final int l(C0936z0 c0936z0) {
        for (int i9 = 0; i9 < this.f11112b; i9++) {
            if (this.f11115e[i9] == c0936z0) {
                return i9;
            }
        }
        return -1;
    }

    @Override // Z3.v
    public final int length() {
        return this.f11113c.length;
    }

    @Override // Z3.s
    public /* synthetic */ void m(boolean z9) {
        r.b(this, z9);
    }

    @Override // Z3.s
    public int n(long j9, List list) {
        return list.size();
    }

    @Override // Z3.s
    public final int o() {
        return this.f11113c[b()];
    }

    @Override // Z3.s
    public final C0936z0 p() {
        return this.f11115e[b()];
    }

    @Override // Z3.s
    public /* synthetic */ void s() {
        r.c(this);
    }
}
