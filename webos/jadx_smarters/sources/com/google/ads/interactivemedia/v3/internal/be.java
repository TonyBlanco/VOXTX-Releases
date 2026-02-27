package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final be f21126a = new bb();

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract bc d(int i9, bc bcVar, boolean z9);

    public abstract bd e(int i9, bd bdVar, long j9);

    public final boolean equals(Object obj) {
        int iH;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        if (beVar.c() == c() && beVar.b() == b()) {
            bd bdVar = new bd();
            bc bcVar = new bc();
            bd bdVar2 = new bd();
            bc bcVar2 = new bc();
            for (int i9 = 0; i9 < c(); i9++) {
                if (!o(i9, bdVar).equals(beVar.o(i9, bdVar2))) {
                    return false;
                }
            }
            for (int i10 = 0; i10 < b(); i10++) {
                if (!d(i10, bcVar, true).equals(beVar.d(i10, bcVar2, true))) {
                    return false;
                }
            }
            int iG = g(true);
            if (iG == beVar.g(true) && (iH = h(true)) == beVar.h(true)) {
                while (iG != iH) {
                    int iJ = j(iG, 0, true);
                    if (iJ != beVar.j(iG, 0, true)) {
                        return false;
                    }
                    iG = iJ;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i9);

    public int g(boolean z9) {
        return p() ? -1 : 0;
    }

    public int h(boolean z9) {
        if (p()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i9;
        bd bdVar = new bd();
        bc bcVar = new bc();
        int iC = c() + 217;
        int i10 = 0;
        while (true) {
            i9 = iC * 31;
            if (i10 >= c()) {
                break;
            }
            iC = i9 + o(i10, bdVar).hashCode();
            i10++;
        }
        int iB = i9 + b();
        for (int i11 = 0; i11 < b(); i11++) {
            iB = (iB * 31) + d(i11, bcVar, true).hashCode();
        }
        int iG = g(true);
        while (iG != -1) {
            iB = (iB * 31) + iG;
            iG = j(iG, 0, true);
        }
        return iB;
    }

    public final int i(int i9, bc bcVar, bd bdVar, int i10, boolean z9) {
        int i11 = m(i9, bcVar).f21037c;
        if (o(i11, bdVar).f21077p != i9) {
            return i9 + 1;
        }
        int iJ = j(i11, i10, z9);
        if (iJ == -1) {
            return -1;
        }
        return o(iJ, bdVar).f21076o;
    }

    public int j(int i9, int i10, boolean z9) {
        if (i10 == 0) {
            if (i9 == h(z9)) {
                return -1;
            }
            return i9 + 1;
        }
        if (i10 == 1) {
            return i9;
        }
        if (i10 == 2) {
            return i9 == h(z9) ? g(z9) : i9 + 1;
        }
        throw new IllegalStateException();
    }

    public final Pair k(bd bdVar, bc bcVar, int i9, long j9) {
        Pair pairL = l(bdVar, bcVar, i9, j9, 0L);
        af.s(pairL);
        return pairL;
    }

    public final Pair l(bd bdVar, bc bcVar, int i9, long j9, long j10) {
        af.y(i9, c());
        e(i9, bdVar, j10);
        if (j9 == -9223372036854775807L) {
            j9 = bdVar.f21074m;
            if (j9 == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = bdVar.f21076o;
        m(i10, bcVar);
        while (i10 < bdVar.f21077p && bcVar.f21039e != j9) {
            int i11 = i10 + 1;
            if (m(i11, bcVar).f21039e > j9) {
                break;
            }
            i10 = i11;
        }
        d(i10, bcVar, true);
        long jMin = j9 - bcVar.f21039e;
        long j11 = bcVar.f21038d;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(jMin, j11 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = bcVar.f21036b;
        af.s(obj);
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public final bc m(int i9, bc bcVar) {
        return d(i9, bcVar, false);
    }

    public bc n(Object obj, bc bcVar) {
        return d(a(obj), bcVar, true);
    }

    public final bd o(int i9, bd bdVar) {
        return e(i9, bdVar, 0L);
    }

    public final boolean p() {
        return c() == 0;
    }

    public int q(int i9) {
        if (i9 == g(false)) {
            return -1;
        }
        return i9 - 1;
    }
}
