package y;

/* JADX INFO: renamed from: y.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2974h extends AbstractC2979m {
    public C2974h(x.e eVar) {
        super(eVar);
        eVar.f51787e.f();
        eVar.f51789f.f();
        this.f52072f = ((x.g) eVar).G0();
    }

    @Override // y.AbstractC2979m, y.InterfaceC2970d
    public void a(InterfaceC2970d interfaceC2970d) {
        C2972f c2972f = this.f52074h;
        if (c2972f.f52043c && !c2972f.f52050j) {
            this.f52074h.d((int) ((((C2972f) c2972f.f52052l.get(0)).f52047g * ((x.g) this.f52068b).J0()) + 0.5f));
        }
    }

    @Override // y.AbstractC2979m
    public void d() {
        C2972f c2972f;
        AbstractC2979m abstractC2979m;
        C2972f c2972f2;
        x.g gVar = (x.g) this.f52068b;
        int iH0 = gVar.H0();
        int iI0 = gVar.I0();
        gVar.J0();
        if (gVar.G0() == 1) {
            C2972f c2972f3 = this.f52074h;
            if (iH0 != -1) {
                c2972f3.f52052l.add(this.f52068b.f51766N.f51787e.f52074h);
                this.f52068b.f51766N.f51787e.f52074h.f52051k.add(this.f52074h);
                c2972f2 = this.f52074h;
            } else if (iI0 != -1) {
                c2972f3.f52052l.add(this.f52068b.f51766N.f51787e.f52075i);
                this.f52068b.f51766N.f51787e.f52075i.f52051k.add(this.f52074h);
                c2972f2 = this.f52074h;
                iH0 = -iI0;
            } else {
                c2972f3.f52042b = true;
                c2972f3.f52052l.add(this.f52068b.f51766N.f51787e.f52075i);
                this.f52068b.f51766N.f51787e.f52075i.f52051k.add(this.f52074h);
                q(this.f52068b.f51787e.f52074h);
                abstractC2979m = this.f52068b.f51787e;
            }
            c2972f2.f52046f = iH0;
            q(this.f52068b.f51787e.f52074h);
            abstractC2979m = this.f52068b.f51787e;
        } else {
            C2972f c2972f4 = this.f52074h;
            if (iH0 != -1) {
                c2972f4.f52052l.add(this.f52068b.f51766N.f51789f.f52074h);
                this.f52068b.f51766N.f51789f.f52074h.f52051k.add(this.f52074h);
                c2972f = this.f52074h;
            } else if (iI0 != -1) {
                c2972f4.f52052l.add(this.f52068b.f51766N.f51789f.f52075i);
                this.f52068b.f51766N.f51789f.f52075i.f52051k.add(this.f52074h);
                c2972f = this.f52074h;
                iH0 = -iI0;
            } else {
                c2972f4.f52042b = true;
                c2972f4.f52052l.add(this.f52068b.f51766N.f51789f.f52075i);
                this.f52068b.f51766N.f51789f.f52075i.f52051k.add(this.f52074h);
                q(this.f52068b.f51789f.f52074h);
                abstractC2979m = this.f52068b.f51789f;
            }
            c2972f.f52046f = iH0;
            q(this.f52068b.f51789f.f52074h);
            abstractC2979m = this.f52068b.f51789f;
        }
        q(abstractC2979m.f52075i);
    }

    @Override // y.AbstractC2979m
    public void e() {
        if (((x.g) this.f52068b).G0() == 1) {
            this.f52068b.B0(this.f52074h.f52047g);
        } else {
            this.f52068b.C0(this.f52074h.f52047g);
        }
    }

    @Override // y.AbstractC2979m
    public void f() {
        this.f52074h.c();
    }

    @Override // y.AbstractC2979m
    public boolean m() {
        return false;
    }

    public final void q(C2972f c2972f) {
        this.f52074h.f52051k.add(c2972f);
        c2972f.f52052l.add(this.f52074h);
    }
}
