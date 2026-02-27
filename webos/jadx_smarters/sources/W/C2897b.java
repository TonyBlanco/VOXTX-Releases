package w;

import java.util.ArrayList;
import w.C2899d;
import w.i;

/* JADX INFO: renamed from: w.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2897b implements C2899d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f51489e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f51485a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f51486b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f51487c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f51488d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51490f = false;

    /* JADX INFO: renamed from: w.b$a */
    public interface a {
        boolean a(i iVar);

        i b(int i9);

        void c();

        void clear();

        void d(i iVar, float f9);

        float e(C2897b c2897b, boolean z9);

        float f(i iVar);

        float g(i iVar, boolean z9);

        void h(i iVar, float f9, boolean z9);

        int i();

        float j(int i9);

        void k(float f9);
    }

    public C2897b() {
    }

    public C2897b(C2898c c2898c) {
        this.f51489e = new C2896a(this, c2898c);
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.lang.String A() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2897b.A():java.lang.String");
    }

    public void B(C2899d c2899d, i iVar, boolean z9) {
        if (iVar.f51535g) {
            this.f51486b += iVar.f51534f * this.f51489e.f(iVar);
            this.f51489e.g(iVar, z9);
            if (z9) {
                iVar.c(this);
            }
        }
    }

    public void C(C2897b c2897b, boolean z9) {
        this.f51486b += c2897b.f51486b * this.f51489e.e(c2897b, z9);
        if (z9) {
            c2897b.f51485a.c(this);
        }
    }

    public void D(C2899d c2899d) {
        if (c2899d.f51504f.length == 0) {
            return;
        }
        boolean z9 = false;
        while (!z9) {
            int i9 = this.f51489e.i();
            for (int i10 = 0; i10 < i9; i10++) {
                i iVarB = this.f51489e.b(i10);
                if (iVarB.f51532d != -1 || iVarB.f51535g) {
                    this.f51488d.add(iVarB);
                }
            }
            if (this.f51488d.size() > 0) {
                for (i iVar : this.f51488d) {
                    if (iVar.f51535g) {
                        B(c2899d, iVar, true);
                    } else {
                        C(c2899d.f51504f[iVar.f51532d], true);
                    }
                }
                this.f51488d.clear();
            } else {
                z9 = true;
            }
        }
    }

    @Override // w.C2899d.a
    public i a(C2899d c2899d, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // w.C2899d.a
    public void b(C2899d.a aVar) {
        if (aVar instanceof C2897b) {
            C2897b c2897b = (C2897b) aVar;
            this.f51485a = null;
            this.f51489e.clear();
            for (int i9 = 0; i9 < c2897b.f51489e.i(); i9++) {
                this.f51489e.h(c2897b.f51489e.b(i9), c2897b.f51489e.j(i9), true);
            }
        }
    }

    @Override // w.C2899d.a
    public void c(i iVar) {
        int i9 = iVar.f51533e;
        float f9 = 1.0f;
        if (i9 != 1) {
            if (i9 == 2) {
                f9 = 1000.0f;
            } else if (i9 == 3) {
                f9 = 1000000.0f;
            } else if (i9 == 4) {
                f9 = 1.0E9f;
            } else if (i9 == 5) {
                f9 = 1.0E12f;
            }
        }
        this.f51489e.d(iVar, f9);
    }

    @Override // w.C2899d.a
    public void clear() {
        this.f51489e.clear();
        this.f51485a = null;
        this.f51486b = 0.0f;
    }

    public C2897b d(C2899d c2899d, int i9) {
        this.f51489e.d(c2899d.o(i9, "ep"), 1.0f);
        this.f51489e.d(c2899d.o(i9, "em"), -1.0f);
        return this;
    }

    public C2897b e(i iVar, int i9) {
        this.f51489e.d(iVar, i9);
        return this;
    }

    public boolean f(C2899d c2899d) {
        boolean z9;
        i iVarG = g(c2899d);
        if (iVarG == null) {
            z9 = true;
        } else {
            y(iVarG);
            z9 = false;
        }
        if (this.f51489e.i() == 0) {
            this.f51490f = true;
        }
        return z9;
    }

    public i g(C2899d c2899d) {
        int i9 = this.f51489e.i();
        i iVar = null;
        i iVar2 = null;
        boolean zV = false;
        boolean zV2 = false;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < i9; i10++) {
            float fJ = this.f51489e.j(i10);
            i iVarB = this.f51489e.b(i10);
            if (iVarB.f51538j == i.a.UNRESTRICTED) {
                if (iVar == null || f9 > fJ) {
                    zV = v(iVarB, c2899d);
                    f9 = fJ;
                    iVar = iVarB;
                } else if (!zV && v(iVarB, c2899d)) {
                    f9 = fJ;
                    iVar = iVarB;
                    zV = true;
                }
            } else if (iVar == null && fJ < 0.0f) {
                if (iVar2 == null || f10 > fJ) {
                    zV2 = v(iVarB, c2899d);
                    f10 = fJ;
                    iVar2 = iVarB;
                } else if (!zV2 && v(iVarB, c2899d)) {
                    f10 = fJ;
                    iVar2 = iVarB;
                    zV2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // w.C2899d.a
    public i getKey() {
        return this.f51485a;
    }

    public C2897b h(i iVar, i iVar2, int i9, float f9, i iVar3, i iVar4, int i10) {
        float f10;
        int i11;
        if (iVar2 == iVar3) {
            this.f51489e.d(iVar, 1.0f);
            this.f51489e.d(iVar4, 1.0f);
            this.f51489e.d(iVar2, -2.0f);
            return this;
        }
        if (f9 == 0.5f) {
            this.f51489e.d(iVar, 1.0f);
            this.f51489e.d(iVar2, -1.0f);
            this.f51489e.d(iVar3, -1.0f);
            this.f51489e.d(iVar4, 1.0f);
            if (i9 > 0 || i10 > 0) {
                i11 = (-i9) + i10;
                f10 = i11;
            }
            return this;
        }
        if (f9 <= 0.0f) {
            this.f51489e.d(iVar, -1.0f);
            this.f51489e.d(iVar2, 1.0f);
            f10 = i9;
        } else {
            if (f9 < 1.0f) {
                float f11 = 1.0f - f9;
                this.f51489e.d(iVar, f11 * 1.0f);
                this.f51489e.d(iVar2, f11 * (-1.0f));
                this.f51489e.d(iVar3, (-1.0f) * f9);
                this.f51489e.d(iVar4, 1.0f * f9);
                if (i9 > 0 || i10 > 0) {
                    f10 = ((-i9) * f11) + (i10 * f9);
                }
                return this;
            }
            this.f51489e.d(iVar4, -1.0f);
            this.f51489e.d(iVar3, 1.0f);
            i11 = -i10;
            f10 = i11;
        }
        this.f51486b = f10;
        return this;
    }

    public C2897b i(i iVar, int i9) {
        this.f51485a = iVar;
        float f9 = i9;
        iVar.f51534f = f9;
        this.f51486b = f9;
        this.f51490f = true;
        return this;
    }

    public C2897b j(i iVar, i iVar2, float f9) {
        this.f51489e.d(iVar, -1.0f);
        this.f51489e.d(iVar2, f9);
        return this;
    }

    public C2897b k(i iVar, i iVar2, i iVar3, i iVar4, float f9) {
        this.f51489e.d(iVar, -1.0f);
        this.f51489e.d(iVar2, 1.0f);
        this.f51489e.d(iVar3, f9);
        this.f51489e.d(iVar4, -f9);
        return this;
    }

    public C2897b l(float f9, float f10, float f11, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f51486b = 0.0f;
        if (f10 == 0.0f || f9 == f11) {
            this.f51489e.d(iVar, 1.0f);
            this.f51489e.d(iVar2, -1.0f);
            this.f51489e.d(iVar4, 1.0f);
            this.f51489e.d(iVar3, -1.0f);
        } else if (f9 == 0.0f) {
            this.f51489e.d(iVar, 1.0f);
            this.f51489e.d(iVar2, -1.0f);
        } else if (f11 == 0.0f) {
            this.f51489e.d(iVar3, 1.0f);
            this.f51489e.d(iVar4, -1.0f);
        } else {
            float f12 = (f9 / f10) / (f11 / f10);
            this.f51489e.d(iVar, 1.0f);
            this.f51489e.d(iVar2, -1.0f);
            this.f51489e.d(iVar4, f12);
            this.f51489e.d(iVar3, -f12);
        }
        return this;
    }

    public C2897b m(i iVar, int i9) {
        a aVar;
        float f9;
        if (i9 < 0) {
            this.f51486b = i9 * (-1);
            aVar = this.f51489e;
            f9 = 1.0f;
        } else {
            this.f51486b = i9;
            aVar = this.f51489e;
            f9 = -1.0f;
        }
        aVar.d(iVar, f9);
        return this;
    }

    public C2897b n(i iVar, i iVar2, int i9) {
        boolean z9 = false;
        if (i9 != 0) {
            if (i9 < 0) {
                i9 *= -1;
                z9 = true;
            }
            this.f51486b = i9;
        }
        if (z9) {
            this.f51489e.d(iVar, 1.0f);
            this.f51489e.d(iVar2, -1.0f);
        } else {
            this.f51489e.d(iVar, -1.0f);
            this.f51489e.d(iVar2, 1.0f);
        }
        return this;
    }

    public C2897b o(i iVar, i iVar2, i iVar3, int i9) {
        boolean z9 = false;
        if (i9 != 0) {
            if (i9 < 0) {
                i9 *= -1;
                z9 = true;
            }
            this.f51486b = i9;
        }
        if (z9) {
            this.f51489e.d(iVar, 1.0f);
            this.f51489e.d(iVar2, -1.0f);
            this.f51489e.d(iVar3, -1.0f);
        } else {
            this.f51489e.d(iVar, -1.0f);
            this.f51489e.d(iVar2, 1.0f);
            this.f51489e.d(iVar3, 1.0f);
        }
        return this;
    }

    public C2897b p(i iVar, i iVar2, i iVar3, int i9) {
        boolean z9 = false;
        if (i9 != 0) {
            if (i9 < 0) {
                i9 *= -1;
                z9 = true;
            }
            this.f51486b = i9;
        }
        if (z9) {
            this.f51489e.d(iVar, 1.0f);
            this.f51489e.d(iVar2, -1.0f);
            this.f51489e.d(iVar3, 1.0f);
        } else {
            this.f51489e.d(iVar, -1.0f);
            this.f51489e.d(iVar2, 1.0f);
            this.f51489e.d(iVar3, -1.0f);
        }
        return this;
    }

    public C2897b q(i iVar, i iVar2, i iVar3, i iVar4, float f9) {
        this.f51489e.d(iVar3, 0.5f);
        this.f51489e.d(iVar4, 0.5f);
        this.f51489e.d(iVar, -0.5f);
        this.f51489e.d(iVar2, -0.5f);
        this.f51486b = -f9;
        return this;
    }

    public void r() {
        float f9 = this.f51486b;
        if (f9 < 0.0f) {
            this.f51486b = f9 * (-1.0f);
            this.f51489e.c();
        }
    }

    public boolean s() {
        i iVar = this.f51485a;
        return iVar != null && (iVar.f51538j == i.a.UNRESTRICTED || this.f51486b >= 0.0f);
    }

    public boolean t(i iVar) {
        return this.f51489e.a(iVar);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.f51485a == null && this.f51486b == 0.0f && this.f51489e.i() == 0;
    }

    public final boolean v(i iVar, C2899d c2899d) {
        return iVar.f51541m <= 1;
    }

    public i w(i iVar) {
        return x(null, iVar);
    }

    public final i x(boolean[] zArr, i iVar) {
        i.a aVar;
        int i9 = this.f51489e.i();
        i iVar2 = null;
        float f9 = 0.0f;
        for (int i10 = 0; i10 < i9; i10++) {
            float fJ = this.f51489e.j(i10);
            if (fJ < 0.0f) {
                i iVarB = this.f51489e.b(i10);
                if ((zArr == null || !zArr[iVarB.f51531c]) && iVarB != iVar && (((aVar = iVarB.f51538j) == i.a.SLACK || aVar == i.a.ERROR) && fJ < f9)) {
                    f9 = fJ;
                    iVar2 = iVarB;
                }
            }
        }
        return iVar2;
    }

    public void y(i iVar) {
        i iVar2 = this.f51485a;
        if (iVar2 != null) {
            this.f51489e.d(iVar2, -1.0f);
            this.f51485a = null;
        }
        float fG = this.f51489e.g(iVar, true) * (-1.0f);
        this.f51485a = iVar;
        if (fG == 1.0f) {
            return;
        }
        this.f51486b /= fG;
        this.f51489e.k(fG);
    }

    public void z() {
        this.f51485a = null;
        this.f51489e.clear();
        this.f51486b = 0.0f;
        this.f51490f = false;
    }
}
