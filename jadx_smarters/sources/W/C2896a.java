package w;

import java.util.Arrays;
import w.C2897b;

/* JADX INFO: renamed from: w.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2896a implements C2897b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static float f51473l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2897b f51475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2898c f51476c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51474a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51477d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f51478e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f51479f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f51480g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f51481h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51482i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51483j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f51484k = false;

    public C2896a(C2897b c2897b, C2898c c2898c) {
        this.f51475b = c2897b;
        this.f51476c = c2898c;
    }

    @Override // w.C2897b.a
    public boolean a(i iVar) {
        int i9 = this.f51482i;
        if (i9 == -1) {
            return false;
        }
        for (int i10 = 0; i9 != -1 && i10 < this.f51474a; i10++) {
            if (this.f51479f[i9] == iVar.f51531c) {
                return true;
            }
            i9 = this.f51480g[i9];
        }
        return false;
    }

    @Override // w.C2897b.a
    public i b(int i9) {
        int i10 = this.f51482i;
        for (int i11 = 0; i10 != -1 && i11 < this.f51474a; i11++) {
            if (i11 == i9) {
                return this.f51476c.f51494d[this.f51479f[i10]];
            }
            i10 = this.f51480g[i10];
        }
        return null;
    }

    @Override // w.C2897b.a
    public void c() {
        int i9 = this.f51482i;
        for (int i10 = 0; i9 != -1 && i10 < this.f51474a; i10++) {
            float[] fArr = this.f51481h;
            fArr[i9] = fArr[i9] * (-1.0f);
            i9 = this.f51480g[i9];
        }
    }

    @Override // w.C2897b.a
    public final void clear() {
        int i9 = this.f51482i;
        for (int i10 = 0; i9 != -1 && i10 < this.f51474a; i10++) {
            i iVar = this.f51476c.f51494d[this.f51479f[i9]];
            if (iVar != null) {
                iVar.c(this.f51475b);
            }
            i9 = this.f51480g[i9];
        }
        this.f51482i = -1;
        this.f51483j = -1;
        this.f51484k = false;
        this.f51474a = 0;
    }

    @Override // w.C2897b.a
    public final void d(i iVar, float f9) {
        if (f9 == 0.0f) {
            g(iVar, true);
            return;
        }
        int i9 = this.f51482i;
        if (i9 == -1) {
            this.f51482i = 0;
            this.f51481h[0] = f9;
            this.f51479f[0] = iVar.f51531c;
            this.f51480g[0] = -1;
            iVar.f51541m++;
            iVar.a(this.f51475b);
            this.f51474a++;
            if (this.f51484k) {
                return;
            }
            int i10 = this.f51483j + 1;
            this.f51483j = i10;
            int[] iArr = this.f51479f;
            if (i10 >= iArr.length) {
                this.f51484k = true;
                this.f51483j = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i9 != -1 && i12 < this.f51474a; i12++) {
            int i13 = this.f51479f[i9];
            int i14 = iVar.f51531c;
            if (i13 == i14) {
                this.f51481h[i9] = f9;
                return;
            }
            if (i13 < i14) {
                i11 = i9;
            }
            i9 = this.f51480g[i9];
        }
        int length = this.f51483j;
        int i15 = length + 1;
        if (this.f51484k) {
            int[] iArr2 = this.f51479f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i15;
        }
        int[] iArr3 = this.f51479f;
        if (length >= iArr3.length && this.f51474a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f51479f;
                if (i16 >= iArr4.length) {
                    break;
                }
                if (iArr4[i16] == -1) {
                    length = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr5 = this.f51479f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i17 = this.f51477d * 2;
            this.f51477d = i17;
            this.f51484k = false;
            this.f51483j = length - 1;
            this.f51481h = Arrays.copyOf(this.f51481h, i17);
            this.f51479f = Arrays.copyOf(this.f51479f, this.f51477d);
            this.f51480g = Arrays.copyOf(this.f51480g, this.f51477d);
        }
        this.f51479f[length] = iVar.f51531c;
        this.f51481h[length] = f9;
        int[] iArr6 = this.f51480g;
        if (i11 != -1) {
            iArr6[length] = iArr6[i11];
            iArr6[i11] = length;
        } else {
            iArr6[length] = this.f51482i;
            this.f51482i = length;
        }
        iVar.f51541m++;
        iVar.a(this.f51475b);
        int i18 = this.f51474a + 1;
        this.f51474a = i18;
        if (!this.f51484k) {
            this.f51483j++;
        }
        int[] iArr7 = this.f51479f;
        if (i18 >= iArr7.length) {
            this.f51484k = true;
        }
        if (this.f51483j >= iArr7.length) {
            this.f51484k = true;
            this.f51483j = iArr7.length - 1;
        }
    }

    @Override // w.C2897b.a
    public float e(C2897b c2897b, boolean z9) {
        float f9 = f(c2897b.f51485a);
        g(c2897b.f51485a, z9);
        C2897b.a aVar = c2897b.f51489e;
        int i9 = aVar.i();
        for (int i10 = 0; i10 < i9; i10++) {
            i iVarB = aVar.b(i10);
            h(iVarB, aVar.f(iVarB) * f9, z9);
        }
        return f9;
    }

    @Override // w.C2897b.a
    public final float f(i iVar) {
        int i9 = this.f51482i;
        for (int i10 = 0; i9 != -1 && i10 < this.f51474a; i10++) {
            if (this.f51479f[i9] == iVar.f51531c) {
                return this.f51481h[i9];
            }
            i9 = this.f51480g[i9];
        }
        return 0.0f;
    }

    @Override // w.C2897b.a
    public final float g(i iVar, boolean z9) {
        if (this.f51478e == iVar) {
            this.f51478e = null;
        }
        int i9 = this.f51482i;
        if (i9 == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i9 != -1 && i10 < this.f51474a) {
            if (this.f51479f[i9] == iVar.f51531c) {
                if (i9 == this.f51482i) {
                    this.f51482i = this.f51480g[i9];
                } else {
                    int[] iArr = this.f51480g;
                    iArr[i11] = iArr[i9];
                }
                if (z9) {
                    iVar.c(this.f51475b);
                }
                iVar.f51541m--;
                this.f51474a--;
                this.f51479f[i9] = -1;
                if (this.f51484k) {
                    this.f51483j = i9;
                }
                return this.f51481h[i9];
            }
            i10++;
            i11 = i9;
            i9 = this.f51480g[i9];
        }
        return 0.0f;
    }

    @Override // w.C2897b.a
    public void h(i iVar, float f9, boolean z9) {
        float f10 = f51473l;
        if (f9 <= (-f10) || f9 >= f10) {
            int i9 = this.f51482i;
            if (i9 == -1) {
                this.f51482i = 0;
                this.f51481h[0] = f9;
                this.f51479f[0] = iVar.f51531c;
                this.f51480g[0] = -1;
                iVar.f51541m++;
                iVar.a(this.f51475b);
                this.f51474a++;
                if (this.f51484k) {
                    return;
                }
                int i10 = this.f51483j + 1;
                this.f51483j = i10;
                int[] iArr = this.f51479f;
                if (i10 >= iArr.length) {
                    this.f51484k = true;
                    this.f51483j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i9 != -1 && i12 < this.f51474a; i12++) {
                int i13 = this.f51479f[i9];
                int i14 = iVar.f51531c;
                if (i13 == i14) {
                    float[] fArr = this.f51481h;
                    float f11 = fArr[i9] + f9;
                    float f12 = f51473l;
                    if (f11 > (-f12) && f11 < f12) {
                        f11 = 0.0f;
                    }
                    fArr[i9] = f11;
                    if (f11 == 0.0f) {
                        if (i9 == this.f51482i) {
                            this.f51482i = this.f51480g[i9];
                        } else {
                            int[] iArr2 = this.f51480g;
                            iArr2[i11] = iArr2[i9];
                        }
                        if (z9) {
                            iVar.c(this.f51475b);
                        }
                        if (this.f51484k) {
                            this.f51483j = i9;
                        }
                        iVar.f51541m--;
                        this.f51474a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i9;
                }
                i9 = this.f51480g[i9];
            }
            int length = this.f51483j;
            int i15 = length + 1;
            if (this.f51484k) {
                int[] iArr3 = this.f51479f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i15;
            }
            int[] iArr4 = this.f51479f;
            if (length >= iArr4.length && this.f51474a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.f51479f;
                    if (i16 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i16] == -1) {
                        length = i16;
                        break;
                    }
                    i16++;
                }
            }
            int[] iArr6 = this.f51479f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i17 = this.f51477d * 2;
                this.f51477d = i17;
                this.f51484k = false;
                this.f51483j = length - 1;
                this.f51481h = Arrays.copyOf(this.f51481h, i17);
                this.f51479f = Arrays.copyOf(this.f51479f, this.f51477d);
                this.f51480g = Arrays.copyOf(this.f51480g, this.f51477d);
            }
            this.f51479f[length] = iVar.f51531c;
            this.f51481h[length] = f9;
            int[] iArr7 = this.f51480g;
            if (i11 != -1) {
                iArr7[length] = iArr7[i11];
                iArr7[i11] = length;
            } else {
                iArr7[length] = this.f51482i;
                this.f51482i = length;
            }
            iVar.f51541m++;
            iVar.a(this.f51475b);
            this.f51474a++;
            if (!this.f51484k) {
                this.f51483j++;
            }
            int i18 = this.f51483j;
            int[] iArr8 = this.f51479f;
            if (i18 >= iArr8.length) {
                this.f51484k = true;
                this.f51483j = iArr8.length - 1;
            }
        }
    }

    @Override // w.C2897b.a
    public int i() {
        return this.f51474a;
    }

    @Override // w.C2897b.a
    public float j(int i9) {
        int i10 = this.f51482i;
        for (int i11 = 0; i10 != -1 && i11 < this.f51474a; i11++) {
            if (i11 == i9) {
                return this.f51481h[i10];
            }
            i10 = this.f51480g[i10];
        }
        return 0.0f;
    }

    @Override // w.C2897b.a
    public void k(float f9) {
        int i9 = this.f51482i;
        for (int i10 = 0; i9 != -1 && i10 < this.f51474a; i10++) {
            float[] fArr = this.f51481h;
            fArr[i9] = fArr[i9] / f9;
            i9 = this.f51480g[i9];
        }
    }

    public String toString() {
        int i9 = this.f51482i;
        String str = "";
        for (int i10 = 0; i9 != -1 && i10 < this.f51474a; i10++) {
            str = ((str + " -> ") + this.f51481h[i9] + " : ") + this.f51476c.f51494d[this.f51479f[i9]];
            i9 = this.f51480g[i9];
        }
        return str;
    }
}
