package y;

import java.util.Iterator;
import x.C2944a;
import y.C2972f;

/* JADX INFO: renamed from: y.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2975i extends AbstractC2979m {
    public C2975i(x.e eVar) {
        super(eVar);
    }

    private void q(C2972f c2972f) {
        this.f52074h.f52051k.add(c2972f);
        c2972f.f52052l.add(this.f52074h);
    }

    @Override // y.AbstractC2979m, y.InterfaceC2970d
    public void a(InterfaceC2970d interfaceC2970d) {
        C2944a c2944a = (C2944a) this.f52068b;
        int iH0 = c2944a.H0();
        Iterator it = this.f52074h.f52052l.iterator();
        int i9 = 0;
        int i10 = -1;
        while (it.hasNext()) {
            int i11 = ((C2972f) it.next()).f52047g;
            if (i10 == -1 || i11 < i10) {
                i10 = i11;
            }
            if (i9 < i11) {
                i9 = i11;
            }
        }
        if (iH0 == 0 || iH0 == 2) {
            this.f52074h.d(i10 + c2944a.I0());
        } else {
            this.f52074h.d(i9 + c2944a.I0());
        }
    }

    @Override // y.AbstractC2979m
    public void d() {
        AbstractC2979m abstractC2979m;
        x.e eVar = this.f52068b;
        if (eVar instanceof C2944a) {
            this.f52074h.f52042b = true;
            C2944a c2944a = (C2944a) eVar;
            int iH0 = c2944a.H0();
            boolean zG0 = c2944a.G0();
            int i9 = 0;
            if (iH0 == 0) {
                this.f52074h.f52045e = C2972f.a.LEFT;
                while (i9 < c2944a.f51859x0) {
                    x.e eVar2 = c2944a.f51858w0[i9];
                    if (zG0 || eVar2.M() != 8) {
                        C2972f c2972f = eVar2.f51787e.f52074h;
                        c2972f.f52051k.add(this.f52074h);
                        this.f52074h.f52052l.add(c2972f);
                    }
                    i9++;
                }
            } else {
                if (iH0 != 1) {
                    if (iH0 == 2) {
                        this.f52074h.f52045e = C2972f.a.TOP;
                        while (i9 < c2944a.f51859x0) {
                            x.e eVar3 = c2944a.f51858w0[i9];
                            if (zG0 || eVar3.M() != 8) {
                                C2972f c2972f2 = eVar3.f51789f.f52074h;
                                c2972f2.f52051k.add(this.f52074h);
                                this.f52074h.f52052l.add(c2972f2);
                            }
                            i9++;
                        }
                    } else {
                        if (iH0 != 3) {
                            return;
                        }
                        this.f52074h.f52045e = C2972f.a.BOTTOM;
                        while (i9 < c2944a.f51859x0) {
                            x.e eVar4 = c2944a.f51858w0[i9];
                            if (zG0 || eVar4.M() != 8) {
                                C2972f c2972f3 = eVar4.f51789f.f52075i;
                                c2972f3.f52051k.add(this.f52074h);
                                this.f52074h.f52052l.add(c2972f3);
                            }
                            i9++;
                        }
                    }
                    q(this.f52068b.f51789f.f52074h);
                    abstractC2979m = this.f52068b.f51789f;
                    q(abstractC2979m.f52075i);
                }
                this.f52074h.f52045e = C2972f.a.RIGHT;
                while (i9 < c2944a.f51859x0) {
                    x.e eVar5 = c2944a.f51858w0[i9];
                    if (zG0 || eVar5.M() != 8) {
                        C2972f c2972f4 = eVar5.f51787e.f52075i;
                        c2972f4.f52051k.add(this.f52074h);
                        this.f52074h.f52052l.add(c2972f4);
                    }
                    i9++;
                }
            }
            q(this.f52068b.f51787e.f52074h);
            abstractC2979m = this.f52068b.f51787e;
            q(abstractC2979m.f52075i);
        }
    }

    @Override // y.AbstractC2979m
    public void e() {
        x.e eVar = this.f52068b;
        if (eVar instanceof C2944a) {
            int iH0 = ((C2944a) eVar).H0();
            if (iH0 == 0 || iH0 == 1) {
                this.f52068b.B0(this.f52074h.f52047g);
            } else {
                this.f52068b.C0(this.f52074h.f52047g);
            }
        }
    }

    @Override // y.AbstractC2979m
    public void f() {
        this.f52069c = null;
        this.f52074h.c();
    }

    @Override // y.AbstractC2979m
    public boolean m() {
        return false;
    }
}
