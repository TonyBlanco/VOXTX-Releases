package y;

import x.d;
import x.e;

/* JADX INFO: renamed from: y.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2979m implements InterfaceC2970d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x.e f52068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2977k f52069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e.b f52070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2973g f52071e = new C2973g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52072f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f52073g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2972f f52074h = new C2972f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2972f f52075i = new C2972f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f52076j = b.NONE;

    /* JADX INFO: renamed from: y.m$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52077a;

        static {
            int[] iArr = new int[d.b.values().length];
            f52077a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52077a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52077a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52077a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52077a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: y.m$b */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC2979m(x.e eVar) {
        this.f52068b = eVar;
    }

    @Override // y.InterfaceC2970d
    public abstract void a(InterfaceC2970d interfaceC2970d);

    public final void b(C2972f c2972f, C2972f c2972f2, int i9) {
        c2972f.f52052l.add(c2972f2);
        c2972f.f52046f = i9;
        c2972f2.f52051k.add(c2972f);
    }

    public final void c(C2972f c2972f, C2972f c2972f2, int i9, C2973g c2973g) {
        c2972f.f52052l.add(c2972f2);
        c2972f.f52052l.add(this.f52071e);
        c2972f.f52048h = i9;
        c2972f.f52049i = c2973g;
        c2972f2.f52051k.add(c2972f);
        c2973g.f52051k.add(c2972f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i9, int i10) {
        int iMax;
        if (i10 == 0) {
            x.e eVar = this.f52068b;
            int i11 = eVar.f51809p;
            iMax = Math.max(eVar.f51807o, i9);
            if (i11 > 0) {
                iMax = Math.min(i11, i9);
            }
            if (iMax == i9) {
                return i9;
            }
        } else {
            x.e eVar2 = this.f52068b;
            int i12 = eVar2.f51815s;
            iMax = Math.max(eVar2.f51813r, i9);
            if (i12 > 0) {
                iMax = Math.min(i12, i9);
            }
            if (iMax == i9) {
                return i9;
            }
        }
        return iMax;
    }

    public final C2972f h(x.d dVar) {
        AbstractC2979m abstractC2979m;
        AbstractC2979m abstractC2979m2;
        x.d dVar2 = dVar.f51747d;
        if (dVar2 == null) {
            return null;
        }
        x.e eVar = dVar2.f51745b;
        int i9 = a.f52077a[dVar2.f51746c.ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                abstractC2979m2 = eVar.f51787e;
            } else if (i9 == 3) {
                abstractC2979m = eVar.f51789f;
            } else {
                if (i9 == 4) {
                    return eVar.f51789f.f52064k;
                }
                if (i9 != 5) {
                    return null;
                }
                abstractC2979m2 = eVar.f51789f;
            }
            return abstractC2979m2.f52075i;
        }
        abstractC2979m = eVar.f51787e;
        return abstractC2979m.f52074h;
    }

    public final C2972f i(x.d dVar, int i9) {
        x.d dVar2 = dVar.f51747d;
        if (dVar2 == null) {
            return null;
        }
        x.e eVar = dVar2.f51745b;
        AbstractC2979m abstractC2979m = i9 == 0 ? eVar.f51787e : eVar.f51789f;
        int i10 = a.f52077a[dVar2.f51746c.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        return null;
                    }
                }
            }
            return abstractC2979m.f52075i;
        }
        return abstractC2979m.f52074h;
    }

    public long j() {
        if (this.f52071e.f52050j) {
            return r0.f52047g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f52073g;
    }

    public final void l(int i9, int i10) {
        C2973g c2973g;
        int iG;
        int i11 = this.f52067a;
        if (i11 == 0) {
            c2973g = this.f52071e;
            iG = g(i10, i9);
        } else if (i11 == 1) {
            int iG2 = g(this.f52071e.f52053m, i9);
            c2973g = this.f52071e;
            iG = Math.min(iG2, i10);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                x.e eVar = this.f52068b;
                AbstractC2979m abstractC2979m = eVar.f51787e;
                e.b bVar = abstractC2979m.f52070d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && abstractC2979m.f52067a == 3) {
                    C2978l c2978l = eVar.f51789f;
                    if (c2978l.f52070d == bVar2 && c2978l.f52067a == 3) {
                        return;
                    }
                }
                if (i9 == 0) {
                    abstractC2979m = eVar.f51789f;
                }
                if (abstractC2979m.f52071e.f52050j) {
                    float fR = eVar.r();
                    this.f52071e.d(i9 == 1 ? (int) ((abstractC2979m.f52071e.f52047g / fR) + 0.5f) : (int) ((fR * abstractC2979m.f52071e.f52047g) + 0.5f));
                    return;
                }
                return;
            }
            x.e eVarE = this.f52068b.E();
            if (eVarE == null) {
                return;
            }
            if (!(i9 == 0 ? eVarE.f51787e : eVarE.f51789f).f52071e.f52050j) {
                return;
            }
            x.e eVar2 = this.f52068b;
            i10 = (int) ((r9.f52047g * (i9 == 0 ? eVar2.f51811q : eVar2.f51817t)) + 0.5f);
            c2973g = this.f52071e;
            iG = g(i10, i9);
        }
        c2973g.d(iG);
    }

    public abstract boolean m();

    public void n(InterfaceC2970d interfaceC2970d, x.d dVar, x.d dVar2, int i9) {
        C2972f c2972f;
        C2972f c2972fH = h(dVar);
        C2972f c2972fH2 = h(dVar2);
        if (c2972fH.f52050j && c2972fH2.f52050j) {
            int iB = c2972fH.f52047g + dVar.b();
            int iB2 = c2972fH2.f52047g - dVar2.b();
            int i10 = iB2 - iB;
            if (!this.f52071e.f52050j && this.f52070d == e.b.MATCH_CONSTRAINT) {
                l(i9, i10);
            }
            C2973g c2973g = this.f52071e;
            if (c2973g.f52050j) {
                if (c2973g.f52047g == i10) {
                    this.f52074h.d(iB);
                    c2972f = this.f52075i;
                } else {
                    x.e eVar = this.f52068b;
                    float fU = i9 == 0 ? eVar.u() : eVar.I();
                    if (c2972fH == c2972fH2) {
                        iB = c2972fH.f52047g;
                        iB2 = c2972fH2.f52047g;
                        fU = 0.5f;
                    }
                    this.f52074h.d((int) (iB + 0.5f + (((iB2 - iB) - this.f52071e.f52047g) * fU)));
                    c2972f = this.f52075i;
                    iB2 = this.f52074h.f52047g + this.f52071e.f52047g;
                }
                c2972f.d(iB2);
            }
        }
    }

    public void o(InterfaceC2970d interfaceC2970d) {
    }

    public void p(InterfaceC2970d interfaceC2970d) {
    }
}
