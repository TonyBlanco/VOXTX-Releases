package y;

import x.e;
import y.AbstractC2979m;
import y.C2972f;

/* JADX INFO: renamed from: y.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2978l extends AbstractC2979m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2972f f52064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2973g f52065l;

    /* JADX INFO: renamed from: y.l$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52066a;

        static {
            int[] iArr = new int[AbstractC2979m.b.values().length];
            f52066a = iArr;
            try {
                iArr[AbstractC2979m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52066a[AbstractC2979m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52066a[AbstractC2979m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C2978l(x.e eVar) {
        super(eVar);
        C2972f c2972f = new C2972f(this);
        this.f52064k = c2972f;
        this.f52065l = null;
        this.f52074h.f52045e = C2972f.a.TOP;
        this.f52075i.f52045e = C2972f.a.BOTTOM;
        c2972f.f52045e = C2972f.a.BASELINE;
        this.f52072f = 1;
    }

    @Override // y.AbstractC2979m, y.InterfaceC2970d
    public void a(InterfaceC2970d interfaceC2970d) {
        int i9;
        float fR;
        int i10 = a.f52066a[this.f52076j.ordinal()];
        if (i10 == 1) {
            p(interfaceC2970d);
        } else if (i10 == 2) {
            o(interfaceC2970d);
        } else if (i10 == 3) {
            x.e eVar = this.f52068b;
            n(interfaceC2970d, eVar.f51755C, eVar.f51757E, 1);
            return;
        }
        C2973g c2973g = this.f52071e;
        if (c2973g.f52043c && !c2973g.f52050j && this.f52070d == e.b.MATCH_CONSTRAINT) {
            x.e eVar2 = this.f52068b;
            int i11 = eVar2.f51803m;
            if (i11 == 2) {
                x.e eVarE = eVar2.E();
                if (eVarE != null) {
                    if (eVarE.f51789f.f52071e.f52050j) {
                        i9 = (int) ((r7.f52047g * this.f52068b.f51817t) + 0.5f);
                        this.f52071e.d(i9);
                    }
                }
            } else if (i11 == 3 && eVar2.f51787e.f52071e.f52050j) {
                int iS = eVar2.s();
                if (iS == -1) {
                    fR = r7.f51787e.f52071e.f52047g / this.f52068b.r();
                    i9 = (int) (fR + 0.5f);
                    this.f52071e.d(i9);
                } else if (iS != 0) {
                    if (iS != 1) {
                        i9 = 0;
                        this.f52071e.d(i9);
                    }
                    fR = r7.f51787e.f52071e.f52047g / this.f52068b.r();
                    i9 = (int) (fR + 0.5f);
                    this.f52071e.d(i9);
                } else {
                    fR = r7.f51787e.f52071e.f52047g * this.f52068b.r();
                    i9 = (int) (fR + 0.5f);
                    this.f52071e.d(i9);
                }
            }
        }
        C2972f c2972f = this.f52074h;
        if (c2972f.f52043c) {
            C2972f c2972f2 = this.f52075i;
            if (c2972f2.f52043c) {
                if (c2972f.f52050j && c2972f2.f52050j && this.f52071e.f52050j) {
                    return;
                }
                if (!this.f52071e.f52050j && this.f52070d == e.b.MATCH_CONSTRAINT) {
                    x.e eVar3 = this.f52068b;
                    if (eVar3.f51801l == 0 && !eVar3.V()) {
                        C2972f c2972f3 = (C2972f) this.f52074h.f52052l.get(0);
                        C2972f c2972f4 = (C2972f) this.f52075i.f52052l.get(0);
                        int i12 = c2972f3.f52047g;
                        C2972f c2972f5 = this.f52074h;
                        int i13 = i12 + c2972f5.f52046f;
                        int i14 = c2972f4.f52047g + this.f52075i.f52046f;
                        c2972f5.d(i13);
                        this.f52075i.d(i14);
                        this.f52071e.d(i14 - i13);
                        return;
                    }
                }
                if (!this.f52071e.f52050j && this.f52070d == e.b.MATCH_CONSTRAINT && this.f52067a == 1 && this.f52074h.f52052l.size() > 0 && this.f52075i.f52052l.size() > 0) {
                    C2972f c2972f6 = (C2972f) this.f52074h.f52052l.get(0);
                    int i15 = (((C2972f) this.f52075i.f52052l.get(0)).f52047g + this.f52075i.f52046f) - (c2972f6.f52047g + this.f52074h.f52046f);
                    C2973g c2973g2 = this.f52071e;
                    int i16 = c2973g2.f52053m;
                    if (i15 < i16) {
                        c2973g2.d(i15);
                    } else {
                        c2973g2.d(i16);
                    }
                }
                if (this.f52071e.f52050j && this.f52074h.f52052l.size() > 0 && this.f52075i.f52052l.size() > 0) {
                    C2972f c2972f7 = (C2972f) this.f52074h.f52052l.get(0);
                    C2972f c2972f8 = (C2972f) this.f52075i.f52052l.get(0);
                    int i17 = c2972f7.f52047g + this.f52074h.f52046f;
                    int i18 = c2972f8.f52047g + this.f52075i.f52046f;
                    float fI = this.f52068b.I();
                    if (c2972f7 == c2972f8) {
                        i17 = c2972f7.f52047g;
                        i18 = c2972f8.f52047g;
                        fI = 0.5f;
                    }
                    this.f52074h.d((int) (i17 + 0.5f + (((i18 - i17) - this.f52071e.f52047g) * fI)));
                    this.f52075i.d(this.f52074h.f52047g + this.f52071e.f52047g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d9, code lost:
    
        if (r10.f52068b.Q() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02db, code lost:
    
        r0 = r10.f52064k;
        r1 = r10.f52074h;
        r2 = r10.f52065l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x035e, code lost:
    
        if (r10.f52068b.Q() != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d5 A[PHI: r0
      0x03d5: PHI (r0v32 y.j) = (r0v23 y.j), (r0v47 y.j) binds: [B:150:0x03d3, B:124:0x032e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    @Override // y.AbstractC2979m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2978l.d():void");
    }

    @Override // y.AbstractC2979m
    public void e() {
        C2972f c2972f = this.f52074h;
        if (c2972f.f52050j) {
            this.f52068b.C0(c2972f.f52047g);
        }
    }

    @Override // y.AbstractC2979m
    public void f() {
        this.f52069c = null;
        this.f52074h.c();
        this.f52075i.c();
        this.f52064k.c();
        this.f52071e.c();
        this.f52073g = false;
    }

    @Override // y.AbstractC2979m
    public boolean m() {
        return this.f52070d != e.b.MATCH_CONSTRAINT || this.f52068b.f51803m == 0;
    }

    public void q() {
        this.f52073g = false;
        this.f52074h.c();
        this.f52074h.f52050j = false;
        this.f52075i.c();
        this.f52075i.f52050j = false;
        this.f52064k.c();
        this.f52064k.f52050j = false;
        this.f52071e.f52050j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f52068b.p();
    }
}
