package w;

import java.util.Arrays;
import w.C2897b;

/* JADX INFO: loaded from: classes.dex */
public class j implements C2897b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static float f51543n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51544a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51545b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51546c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f51547d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f51548e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f51549f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f51550g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f51551h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f51552i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51553j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51554k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2897b f51555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C2898c f51556m;

    public j(C2897b c2897b, C2898c c2898c) {
        this.f51555l = c2897b;
        this.f51556m = c2898c;
        clear();
    }

    @Override // w.C2897b.a
    public boolean a(i iVar) {
        return p(iVar) != -1;
    }

    @Override // w.C2897b.a
    public i b(int i9) {
        int i10 = this.f51553j;
        if (i10 == 0) {
            return null;
        }
        int i11 = this.f51554k;
        for (int i12 = 0; i12 < i10; i12++) {
            if (i12 == i9 && i11 != -1) {
                return this.f51556m.f51494d[this.f51549f[i11]];
            }
            i11 = this.f51552i[i11];
            if (i11 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // w.C2897b.a
    public void c() {
        int i9 = this.f51553j;
        int i10 = this.f51554k;
        for (int i11 = 0; i11 < i9; i11++) {
            float[] fArr = this.f51550g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f51552i[i10];
            if (i10 == -1) {
                return;
            }
        }
    }

    @Override // w.C2897b.a
    public void clear() {
        int i9 = this.f51553j;
        for (int i10 = 0; i10 < i9; i10++) {
            i iVarB = b(i10);
            if (iVarB != null) {
                iVarB.c(this.f51555l);
            }
        }
        for (int i11 = 0; i11 < this.f51545b; i11++) {
            this.f51549f[i11] = -1;
            this.f51548e[i11] = -1;
        }
        for (int i12 = 0; i12 < this.f51546c; i12++) {
            this.f51547d[i12] = -1;
        }
        this.f51553j = 0;
        this.f51554k = -1;
    }

    @Override // w.C2897b.a
    public void d(i iVar, float f9) {
        float f10 = f51543n;
        if (f9 > (-f10) && f9 < f10) {
            g(iVar, true);
            return;
        }
        if (this.f51553j == 0) {
            m(0, iVar, f9);
            l(iVar, 0);
            this.f51554k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f51550g[iP] = f9;
            return;
        }
        if (this.f51553j + 1 >= this.f51545b) {
            o();
        }
        int i9 = this.f51553j;
        int i10 = this.f51554k;
        int i11 = -1;
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = this.f51549f[i10];
            int i14 = iVar.f51531c;
            if (i13 == i14) {
                this.f51550g[i10] = f9;
                return;
            }
            if (i13 < i14) {
                i11 = i10;
            }
            i10 = this.f51552i[i10];
            if (i10 == -1) {
                break;
            }
        }
        q(i11, iVar, f9);
    }

    @Override // w.C2897b.a
    public float e(C2897b c2897b, boolean z9) {
        float f9 = f(c2897b.f51485a);
        g(c2897b.f51485a, z9);
        j jVar = (j) c2897b.f51489e;
        int i9 = jVar.i();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int i12 = jVar.f51549f[i11];
            if (i12 != -1) {
                h(this.f51556m.f51494d[i12], jVar.f51550g[i11] * f9, z9);
                i10++;
            }
            i11++;
        }
        return f9;
    }

    @Override // w.C2897b.a
    public float f(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f51550g[iP];
        }
        return 0.0f;
    }

    @Override // w.C2897b.a
    public float g(i iVar, boolean z9) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f9 = this.f51550g[iP];
        if (this.f51554k == iP) {
            this.f51554k = this.f51552i[iP];
        }
        this.f51549f[iP] = -1;
        int[] iArr = this.f51551h;
        int i9 = iArr[iP];
        if (i9 != -1) {
            int[] iArr2 = this.f51552i;
            iArr2[i9] = iArr2[iP];
        }
        int i10 = this.f51552i[iP];
        if (i10 != -1) {
            iArr[i10] = iArr[iP];
        }
        this.f51553j--;
        iVar.f51541m--;
        if (z9) {
            iVar.c(this.f51555l);
        }
        return f9;
    }

    @Override // w.C2897b.a
    public void h(i iVar, float f9, boolean z9) {
        float f10 = f51543n;
        if (f9 <= (-f10) || f9 >= f10) {
            int iP = p(iVar);
            if (iP == -1) {
                d(iVar, f9);
                return;
            }
            float[] fArr = this.f51550g;
            float f11 = fArr[iP] + f9;
            fArr[iP] = f11;
            float f12 = f51543n;
            if (f11 <= (-f12) || f11 >= f12) {
                return;
            }
            fArr[iP] = 0.0f;
            g(iVar, z9);
        }
    }

    @Override // w.C2897b.a
    public int i() {
        return this.f51553j;
    }

    @Override // w.C2897b.a
    public float j(int i9) {
        int i10 = this.f51553j;
        int i11 = this.f51554k;
        for (int i12 = 0; i12 < i10; i12++) {
            if (i12 == i9) {
                return this.f51550g[i11];
            }
            i11 = this.f51552i[i11];
            if (i11 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // w.C2897b.a
    public void k(float f9) {
        int i9 = this.f51553j;
        int i10 = this.f51554k;
        for (int i11 = 0; i11 < i9; i11++) {
            float[] fArr = this.f51550g;
            fArr[i10] = fArr[i10] / f9;
            i10 = this.f51552i[i10];
            if (i10 == -1) {
                return;
            }
        }
    }

    public final void l(i iVar, int i9) {
        int[] iArr;
        int i10 = iVar.f51531c % this.f51546c;
        int[] iArr2 = this.f51547d;
        int i11 = iArr2[i10];
        if (i11 == -1) {
            iArr2[i10] = i9;
        } else {
            while (true) {
                iArr = this.f51548e;
                int i12 = iArr[i11];
                if (i12 == -1) {
                    break;
                } else {
                    i11 = i12;
                }
            }
            iArr[i11] = i9;
        }
        this.f51548e[i9] = -1;
    }

    public final void m(int i9, i iVar, float f9) {
        this.f51549f[i9] = iVar.f51531c;
        this.f51550g[i9] = f9;
        this.f51551h[i9] = -1;
        this.f51552i[i9] = -1;
        iVar.a(this.f51555l);
        iVar.f51541m++;
        this.f51553j++;
    }

    public final int n() {
        for (int i9 = 0; i9 < this.f51545b; i9++) {
            if (this.f51549f[i9] == -1) {
                return i9;
            }
        }
        return -1;
    }

    public final void o() {
        int i9 = this.f51545b * 2;
        this.f51549f = Arrays.copyOf(this.f51549f, i9);
        this.f51550g = Arrays.copyOf(this.f51550g, i9);
        this.f51551h = Arrays.copyOf(this.f51551h, i9);
        this.f51552i = Arrays.copyOf(this.f51552i, i9);
        this.f51548e = Arrays.copyOf(this.f51548e, i9);
        for (int i10 = this.f51545b; i10 < i9; i10++) {
            this.f51549f[i10] = -1;
            this.f51548e[i10] = -1;
        }
        this.f51545b = i9;
    }

    public int p(i iVar) {
        if (this.f51553j == 0) {
            return -1;
        }
        int i9 = iVar.f51531c;
        int i10 = this.f51547d[i9 % this.f51546c];
        if (i10 == -1) {
            return -1;
        }
        if (this.f51549f[i10] == i9) {
            return i10;
        }
        do {
            i10 = this.f51548e[i10];
            if (i10 == -1) {
                break;
            }
        } while (this.f51549f[i10] != i9);
        if (i10 != -1 && this.f51549f[i10] == i9) {
            return i10;
        }
        return -1;
    }

    public final void q(int i9, i iVar, float f9) {
        int iN = n();
        m(iN, iVar, f9);
        if (i9 != -1) {
            this.f51551h[iN] = i9;
            int[] iArr = this.f51552i;
            iArr[iN] = iArr[i9];
            iArr[i9] = iN;
        } else {
            this.f51551h[iN] = -1;
            if (this.f51553j > 0) {
                this.f51552i[iN] = this.f51554k;
                this.f51554k = iN;
            } else {
                this.f51552i[iN] = -1;
            }
        }
        int i10 = this.f51552i[iN];
        if (i10 != -1) {
            this.f51551h[i10] = iN;
        }
        l(iVar, iN);
    }

    public final void r(i iVar) {
        int[] iArr;
        int i9;
        int i10 = iVar.f51531c;
        int i11 = i10 % this.f51546c;
        int[] iArr2 = this.f51547d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            return;
        }
        if (this.f51549f[i12] == i10) {
            int[] iArr3 = this.f51548e;
            iArr2[i11] = iArr3[i12];
            iArr3[i12] = -1;
            return;
        }
        while (true) {
            iArr = this.f51548e;
            i9 = iArr[i12];
            if (i9 == -1 || this.f51549f[i9] == i10) {
                break;
            } else {
                i12 = i9;
            }
        }
        if (i9 == -1 || this.f51549f[i9] != i10) {
            return;
        }
        iArr[i12] = iArr[i9];
        iArr[i9] = -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i9 = this.f51553j;
        for (int i10 = 0; i10 < i9; i10++) {
            i iVarB = b(i10);
            if (iVarB != null) {
                String str2 = str + iVarB + " = " + j(i10) + " ";
                int iP = p(iVarB);
                String str3 = str2 + "[p: ";
                if (this.f51551h[iP] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.f51556m.f51494d[this.f51549f[this.f51551h[iP]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f51552i[iP] != -1 ? str4 + this.f51556m.f51494d[this.f51549f[this.f51552i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
