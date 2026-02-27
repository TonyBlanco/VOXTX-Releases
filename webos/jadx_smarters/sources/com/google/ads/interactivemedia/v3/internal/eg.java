package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eg extends be {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ui f22780c;

    public eg(ui uiVar) {
        this.f22780c = uiVar;
        this.f22779b = uiVar.c();
    }

    private final int A(int i9, boolean z9) {
        if (z9) {
            return this.f22780c.d(i9);
        }
        if (i9 >= this.f22779b - 1) {
            return -1;
        }
        return i9 + 1;
    }

    private final int B(int i9, boolean z9) {
        if (z9) {
            return this.f22780c.e(i9);
        }
        if (i9 <= 0) {
            return -1;
        }
        return i9 - 1;
    }

    public static Object x(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object y(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int a(Object obj) {
        int iA;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objY = y(obj);
        Object objX = x(obj);
        int iR = r(objY);
        if (iR == -1 || (iA = w(iR).a(objX)) == -1) {
            return -1;
        }
        return u(iR) + iA;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final bc d(int i9, bc bcVar, boolean z9) {
        int iS = s(i9);
        int iV = v(iS);
        w(iS).d(i9 - u(iS), bcVar, z9);
        bcVar.f21037c += iV;
        if (z9) {
            Object objZ = z(iS);
            Object obj = bcVar.f21036b;
            af.s(obj);
            bcVar.f21036b = Pair.create(objZ, obj);
        }
        return bcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final bd e(int i9, bd bdVar, long j9) {
        int iT = t(i9);
        int iV = v(iT);
        int iU = u(iT);
        w(iT).e(i9 - iV, bdVar, j9);
        Object objZ = z(iT);
        if (!bd.f21061a.equals(bdVar.f21063b)) {
            objZ = Pair.create(objZ, bdVar.f21063b);
        }
        bdVar.f21063b = objZ;
        bdVar.f21076o += iU;
        bdVar.f21077p += iU;
        return bdVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final Object f(int i9) {
        int iS = s(i9);
        return Pair.create(z(iS), w(iS).f(i9 - u(iS)));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int g(boolean z9) {
        if (this.f22779b == 0) {
            return -1;
        }
        int iA = z9 ? this.f22780c.a() : 0;
        while (w(iA).p()) {
            iA = A(iA, z9);
            if (iA == -1) {
                return -1;
            }
        }
        return v(iA) + w(iA).g(z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int h(boolean z9) {
        int i9 = this.f22779b;
        if (i9 == 0) {
            return -1;
        }
        int iB = z9 ? this.f22780c.b() : i9 - 1;
        while (w(iB).p()) {
            iB = B(iB, z9);
            if (iB == -1) {
                return -1;
            }
        }
        return v(iB) + w(iB).h(z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int j(int i9, int i10, boolean z9) {
        int iT = t(i9);
        int iV = v(iT);
        int iJ = w(iT).j(i9 - iV, i10 == 2 ? 0 : i10, z9);
        if (iJ != -1) {
            return iV + iJ;
        }
        int iA = A(iT, z9);
        while (iA != -1 && w(iA).p()) {
            iA = A(iA, z9);
        }
        if (iA != -1) {
            return v(iA) + w(iA).g(z9);
        }
        if (i10 == 2) {
            return g(z9);
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final bc n(Object obj, bc bcVar) {
        Object objY = y(obj);
        Object objX = x(obj);
        int iR = r(objY);
        int iV = v(iR);
        w(iR).n(objX, bcVar);
        bcVar.f21037c += iV;
        bcVar.f21036b = obj;
        return bcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int q(int i9) {
        int iT = t(i9);
        int iV = v(iT);
        int iQ = w(iT).q(i9 - iV);
        if (iQ != -1) {
            return iV + iQ;
        }
        do {
            iT = B(iT, false);
            if (iT == -1) {
                break;
            }
        } while (w(iT).p());
        if (iT != -1) {
            return v(iT) + w(iT).h(false);
        }
        return -1;
    }

    public abstract int r(Object obj);

    public abstract int s(int i9);

    public abstract int t(int i9);

    public abstract int u(int i9);

    public abstract int v(int i9);

    public abstract be w(int i9);

    public abstract Object z(int i9);
}
