package w;

import java.util.Arrays;
import java.util.Comparator;
import w.C2897b;

/* JADX INFO: loaded from: classes.dex */
public class h extends C2897b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i[] f51519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i[] f51520i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f51522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2898c f51523l;

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f51531c - iVar2.f51531c;
        }
    }

    public class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i f51525a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h f51526c;

        public b(h hVar) {
            this.f51526c = hVar;
        }

        public boolean a(i iVar, float f9) {
            boolean z9 = true;
            if (!this.f51525a.f51529a) {
                for (int i9 = 0; i9 < 9; i9++) {
                    float f10 = iVar.f51537i[i9];
                    if (f10 != 0.0f) {
                        float f11 = f10 * f9;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        this.f51525a.f51537i[i9] = f11;
                    } else {
                        this.f51525a.f51537i[i9] = 0.0f;
                    }
                }
                return true;
            }
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f51525a.f51537i;
                float f12 = fArr[i10] + (iVar.f51537i[i10] * f9);
                fArr[i10] = f12;
                if (Math.abs(f12) < 1.0E-4f) {
                    this.f51525a.f51537i[i10] = 0.0f;
                } else {
                    z9 = false;
                }
            }
            if (z9) {
                h.this.G(this.f51525a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f51525a = iVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f51525a.f51531c - ((i) obj).f51531c;
        }

        public final boolean h() {
            for (int i9 = 8; i9 >= 0; i9--) {
                float f9 = this.f51525a.f51537i[i9];
                if (f9 > 0.0f) {
                    return false;
                }
                if (f9 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean i(i iVar) {
            int i9 = 8;
            while (true) {
                if (i9 < 0) {
                    break;
                }
                float f9 = iVar.f51537i[i9];
                float f10 = this.f51525a.f51537i[i9];
                if (f10 == f9) {
                    i9--;
                } else if (f10 < f9) {
                    return true;
                }
            }
            return false;
        }

        public void j() {
            Arrays.fill(this.f51525a.f51537i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f51525a != null) {
                for (int i9 = 0; i9 < 9; i9++) {
                    str = str + this.f51525a.f51537i[i9] + " ";
                }
            }
            return str + "] " + this.f51525a;
        }
    }

    public h(C2898c c2898c) {
        super(c2898c);
        this.f51518g = 128;
        this.f51519h = new i[128];
        this.f51520i = new i[128];
        this.f51521j = 0;
        this.f51522k = new b(this);
        this.f51523l = c2898c;
    }

    @Override // w.C2897b
    public void C(C2897b c2897b, boolean z9) {
        i iVar = c2897b.f51485a;
        if (iVar == null) {
            return;
        }
        C2897b.a aVar = c2897b.f51489e;
        int i9 = aVar.i();
        for (int i10 = 0; i10 < i9; i10++) {
            i iVarB = aVar.b(i10);
            float fJ = aVar.j(i10);
            this.f51522k.b(iVarB);
            if (this.f51522k.a(iVar, fJ)) {
                F(iVarB);
            }
            this.f51486b += c2897b.f51486b * fJ;
        }
        G(iVar);
    }

    public final void F(i iVar) {
        int i9;
        int i10 = this.f51521j + 1;
        i[] iVarArr = this.f51519h;
        if (i10 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f51519h = iVarArr2;
            this.f51520i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f51519h;
        int i11 = this.f51521j;
        iVarArr3[i11] = iVar;
        int i12 = i11 + 1;
        this.f51521j = i12;
        if (i12 > 1 && iVarArr3[i11].f51531c > iVar.f51531c) {
            int i13 = 0;
            while (true) {
                i9 = this.f51521j;
                if (i13 >= i9) {
                    break;
                }
                this.f51520i[i13] = this.f51519h[i13];
                i13++;
            }
            Arrays.sort(this.f51520i, 0, i9, new a());
            for (int i14 = 0; i14 < this.f51521j; i14++) {
                this.f51519h[i14] = this.f51520i[i14];
            }
        }
        iVar.f51529a = true;
        iVar.a(this);
    }

    public final void G(i iVar) {
        int i9 = 0;
        while (i9 < this.f51521j) {
            if (this.f51519h[i9] == iVar) {
                while (true) {
                    int i10 = this.f51521j;
                    if (i9 >= i10 - 1) {
                        this.f51521j = i10 - 1;
                        iVar.f51529a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f51519h;
                        int i11 = i9 + 1;
                        iVarArr[i9] = iVarArr[i11];
                        i9 = i11;
                    }
                }
            } else {
                i9++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // w.C2897b, w.C2899d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w.i a(w.C2899d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = -1
        L3:
            int r2 = r4.f51521j
            if (r0 >= r2) goto L30
            w.i[] r2 = r4.f51519h
            r2 = r2[r0]
            int r3 = r2.f51531c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2d
        L12:
            w.h$b r3 = r4.f51522k
            r3.b(r2)
            w.h$b r2 = r4.f51522k
            if (r1 != r5) goto L22
            boolean r2 = r2.h()
            if (r2 == 0) goto L2d
            goto L2c
        L22:
            w.i[] r3 = r4.f51519h
            r3 = r3[r1]
            boolean r2 = r2.i(r3)
            if (r2 == 0) goto L2d
        L2c:
            r1 = r0
        L2d:
            int r0 = r0 + 1
            goto L3
        L30:
            if (r1 != r5) goto L34
            r5 = 0
            return r5
        L34:
            w.i[] r5 = r4.f51519h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.a(w.d, boolean[]):w.i");
    }

    @Override // w.C2897b, w.C2899d.a
    public void c(i iVar) {
        this.f51522k.b(iVar);
        this.f51522k.j();
        iVar.f51537i[iVar.f51533e] = 1.0f;
        F(iVar);
    }

    @Override // w.C2897b, w.C2899d.a
    public void clear() {
        this.f51521j = 0;
        this.f51486b = 0.0f;
    }

    @Override // w.C2897b
    public String toString() {
        String str = " goal -> (" + this.f51486b + ") : ";
        for (int i9 = 0; i9 < this.f51521j; i9++) {
            this.f51522k.b(this.f51519h[i9]);
            str = str + this.f51522k + " ";
        }
        return str;
    }
}
