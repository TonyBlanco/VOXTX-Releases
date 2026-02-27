package l3;

import d4.AbstractC1684a;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2190o f44065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f44067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f44068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f44070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f44071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f44072h;

    public r(C2190o c2190o, long[] jArr, int[] iArr, int i9, long[] jArr2, int[] iArr2, long j9) {
        AbstractC1684a.a(iArr.length == jArr2.length);
        AbstractC1684a.a(jArr.length == jArr2.length);
        AbstractC1684a.a(iArr2.length == jArr2.length);
        this.f44065a = c2190o;
        this.f44067c = jArr;
        this.f44068d = iArr;
        this.f44069e = i9;
        this.f44070f = jArr2;
        this.f44071g = iArr2;
        this.f44072h = j9;
        this.f44066b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j9) {
        for (int i9 = k0.i(this.f44070f, j9, true, false); i9 >= 0; i9--) {
            if ((this.f44071g[i9] & 1) != 0) {
                return i9;
            }
        }
        return -1;
    }

    public int b(long j9) {
        for (int iE = k0.e(this.f44070f, j9, true, false); iE < this.f44070f.length; iE++) {
            if ((this.f44071g[iE] & 1) != 0) {
                return iE;
            }
        }
        return -1;
    }
}
