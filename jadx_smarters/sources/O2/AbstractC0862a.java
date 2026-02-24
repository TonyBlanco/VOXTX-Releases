package O2;

import O2.Q1;
import android.util.Pair;
import d4.AbstractC1684a;

/* JADX INFO: renamed from: O2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0862a extends Q1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B3.a0 f5944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5945i;

    public AbstractC0862a(boolean z9, B3.a0 a0Var) {
        this.f5945i = z9;
        this.f5944h = a0Var;
        this.f5943g = a0Var.getLength();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object B(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object D(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract Object C(int i9);

    public abstract int E(int i9);

    public abstract int F(int i9);

    public final int G(int i9, boolean z9) {
        if (z9) {
            return this.f5944h.c(i9);
        }
        if (i9 < this.f5943g - 1) {
            return i9 + 1;
        }
        return -1;
    }

    public final int H(int i9, boolean z9) {
        if (z9) {
            return this.f5944h.b(i9);
        }
        if (i9 > 0) {
            return i9 - 1;
        }
        return -1;
    }

    public abstract Q1 I(int i9);

    @Override // O2.Q1
    public int e(boolean z9) {
        if (this.f5943g == 0) {
            return -1;
        }
        if (this.f5945i) {
            z9 = false;
        }
        int iF = z9 ? this.f5944h.f() : 0;
        while (I(iF).v()) {
            iF = G(iF, z9);
            if (iF == -1) {
                return -1;
            }
        }
        return F(iF) + I(iF).e(z9);
    }

    @Override // O2.Q1
    public final int f(Object obj) {
        int iF;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objB = B(obj);
        Object objA = A(obj);
        int iX = x(objB);
        if (iX == -1 || (iF = I(iX).f(objA)) == -1) {
            return -1;
        }
        return E(iX) + iF;
    }

    @Override // O2.Q1
    public int g(boolean z9) {
        int i9 = this.f5943g;
        if (i9 == 0) {
            return -1;
        }
        if (this.f5945i) {
            z9 = false;
        }
        int iD = z9 ? this.f5944h.d() : i9 - 1;
        while (I(iD).v()) {
            iD = H(iD, z9);
            if (iD == -1) {
                return -1;
            }
        }
        return F(iD) + I(iD).g(z9);
    }

    @Override // O2.Q1
    public int j(int i9, int i10, boolean z9) {
        if (this.f5945i) {
            if (i10 == 1) {
                i10 = 2;
            }
            z9 = false;
        }
        int iZ = z(i9);
        int iF = F(iZ);
        int iJ = I(iZ).j(i9 - iF, i10 != 2 ? i10 : 0, z9);
        if (iJ != -1) {
            return iF + iJ;
        }
        int iG = G(iZ, z9);
        while (iG != -1 && I(iG).v()) {
            iG = G(iG, z9);
        }
        if (iG != -1) {
            return F(iG) + I(iG).e(z9);
        }
        if (i10 == 2) {
            return e(z9);
        }
        return -1;
    }

    @Override // O2.Q1
    public final Q1.b l(int i9, Q1.b bVar, boolean z9) {
        int iY = y(i9);
        int iF = F(iY);
        I(iY).l(i9 - E(iY), bVar, z9);
        bVar.f5718d += iF;
        if (z9) {
            bVar.f5717c = D(C(iY), AbstractC1684a.e(bVar.f5717c));
        }
        return bVar;
    }

    @Override // O2.Q1
    public final Q1.b m(Object obj, Q1.b bVar) {
        Object objB = B(obj);
        Object objA = A(obj);
        int iX = x(objB);
        int iF = F(iX);
        I(iX).m(objA, bVar);
        bVar.f5718d += iF;
        bVar.f5717c = obj;
        return bVar;
    }

    @Override // O2.Q1
    public int q(int i9, int i10, boolean z9) {
        if (this.f5945i) {
            if (i10 == 1) {
                i10 = 2;
            }
            z9 = false;
        }
        int iZ = z(i9);
        int iF = F(iZ);
        int iQ = I(iZ).q(i9 - iF, i10 != 2 ? i10 : 0, z9);
        if (iQ != -1) {
            return iF + iQ;
        }
        int iH = H(iZ, z9);
        while (iH != -1 && I(iH).v()) {
            iH = H(iH, z9);
        }
        if (iH != -1) {
            return F(iH) + I(iH).g(z9);
        }
        if (i10 == 2) {
            return g(z9);
        }
        return -1;
    }

    @Override // O2.Q1
    public final Object r(int i9) {
        int iY = y(i9);
        return D(C(iY), I(iY).r(i9 - E(iY)));
    }

    @Override // O2.Q1
    public final Q1.d t(int i9, Q1.d dVar, long j9) {
        int iZ = z(i9);
        int iF = F(iZ);
        int iE = E(iZ);
        I(iZ).t(i9 - iF, dVar, j9);
        Object objC = C(iZ);
        if (!Q1.d.f5736s.equals(dVar.f5744a)) {
            objC = D(objC, dVar.f5744a);
        }
        dVar.f5744a = objC;
        dVar.f5758p += iE;
        dVar.f5759q += iE;
        return dVar;
    }

    public abstract int x(Object obj);

    public abstract int y(int i9);

    public abstract int z(int i9);
}
