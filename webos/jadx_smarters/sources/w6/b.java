package W6;

import java.util.ArrayList;
import java.util.List;
import x6.k;
import x6.r;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D6.b f10314a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f10320g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f10322i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10315b = new ArrayList(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f10321h = new int[3];

    public b(D6.b bVar, int i9, int i10, int i11, int i12, float f9, r rVar) {
        this.f10314a = bVar;
        this.f10316c = i9;
        this.f10317d = i10;
        this.f10318e = i11;
        this.f10319f = i12;
        this.f10320g = f9;
        this.f10322i = rVar;
    }

    public static float a(int[] iArr, int i9) {
        return (i9 - iArr[2]) - (iArr[1] / 2.0f);
    }

    public final float b(int i9, int i10, int i11, int i12) {
        D6.b bVar = this.f10314a;
        int i13 = bVar.i();
        int[] iArr = this.f10321h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i14 = i9;
        while (i14 >= 0 && bVar.f(i10, i14)) {
            int i15 = iArr[1];
            if (i15 > i11) {
                break;
            }
            iArr[1] = i15 + 1;
            i14--;
        }
        if (i14 >= 0 && iArr[1] <= i11) {
            while (i14 >= 0 && !bVar.f(i10, i14)) {
                int i16 = iArr[0];
                if (i16 > i11) {
                    break;
                }
                iArr[0] = i16 + 1;
                i14--;
            }
            if (iArr[0] > i11) {
                return Float.NaN;
            }
            int i17 = i9 + 1;
            while (i17 < i13 && bVar.f(i10, i17)) {
                int i18 = iArr[1];
                if (i18 > i11) {
                    break;
                }
                iArr[1] = i18 + 1;
                i17++;
            }
            if (i17 != i13 && iArr[1] <= i11) {
                while (i17 < i13 && !bVar.f(i10, i17)) {
                    int i19 = iArr[2];
                    if (i19 > i11) {
                        break;
                    }
                    iArr[2] = i19 + 1;
                    i17++;
                }
                int i20 = iArr[2];
                if (i20 <= i11 && Math.abs(((iArr[0] + iArr[1]) + i20) - i12) * 5 < i12 * 2 && d(iArr)) {
                    return a(iArr, i17);
                }
            }
        }
        return Float.NaN;
    }

    public a c() throws k {
        a aVarE;
        a aVarE2;
        int i9 = this.f10316c;
        int i10 = this.f10319f;
        int i11 = this.f10318e + i9;
        int i12 = this.f10317d + (i10 / 2);
        int[] iArr = new int[3];
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = ((i13 & 1) == 0 ? (i13 + 1) / 2 : -((i13 + 1) / 2)) + i12;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i15 = i9;
            while (i15 < i11 && !this.f10314a.f(i15, i14)) {
                i15++;
            }
            int i16 = 0;
            while (i15 < i11) {
                if (!this.f10314a.f(i15, i14)) {
                    if (i16 == 1) {
                        i16++;
                    }
                    iArr[i16] = iArr[i16] + 1;
                } else if (i16 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i16 != 2) {
                    i16++;
                    iArr[i16] = iArr[i16] + 1;
                } else {
                    if (d(iArr) && (aVarE2 = e(iArr, i14, i15)) != null) {
                        return aVarE2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i16 = 1;
                }
                i15++;
            }
            if (d(iArr) && (aVarE = e(iArr, i14, i11)) != null) {
                return aVarE;
            }
        }
        if (this.f10315b.isEmpty()) {
            throw k.a();
        }
        return (a) this.f10315b.get(0);
    }

    public final boolean d(int[] iArr) {
        float f9 = this.f10320g;
        float f10 = f9 / 2.0f;
        for (int i9 = 0; i9 < 3; i9++) {
            if (Math.abs(f9 - iArr[i9]) >= f10) {
                return false;
            }
        }
        return true;
    }

    public final a e(int[] iArr, int i9, int i10) {
        int i11 = iArr[0] + iArr[1] + iArr[2];
        float fA = a(iArr, i10);
        float fB = b(i9, (int) fA, iArr[1] * 2, i11);
        if (Float.isNaN(fB)) {
            return null;
        }
        float f9 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (a aVar : this.f10315b) {
            if (aVar.f(f9, fB, fA)) {
                return aVar.g(fB, fA, f9);
            }
        }
        a aVar2 = new a(fA, fB, f9);
        this.f10315b.add(aVar2);
        r rVar = this.f10322i;
        if (rVar == null) {
            return null;
        }
        rVar.a(aVar2);
        return null;
    }
}
