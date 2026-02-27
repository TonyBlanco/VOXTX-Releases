package y;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import x.e;
import y.C2968b;

/* JADX INFO: renamed from: y.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2971e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x.f f52032a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x.f f52035d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f52033b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f52034c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f52036e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f52037f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2968b.InterfaceC0481b f52038g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2968b.a f52039h = new C2968b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f52040i = new ArrayList();

    public C2971e(x.f fVar) {
        this.f52032a = fVar;
        this.f52035d = fVar;
    }

    public final void a(C2972f c2972f, int i9, int i10, C2972f c2972f2, ArrayList arrayList, C2977k c2977k) {
        AbstractC2979m abstractC2979m = c2972f.f52044d;
        if (abstractC2979m.f52069c == null) {
            x.f fVar = this.f52032a;
            if (abstractC2979m == fVar.f51787e || abstractC2979m == fVar.f51789f) {
                return;
            }
            if (c2977k == null) {
                c2977k = new C2977k(abstractC2979m, i10);
                arrayList.add(c2977k);
            }
            abstractC2979m.f52069c = c2977k;
            c2977k.a(abstractC2979m);
            for (InterfaceC2970d interfaceC2970d : abstractC2979m.f52074h.f52051k) {
                if (interfaceC2970d instanceof C2972f) {
                    a((C2972f) interfaceC2970d, i9, 0, c2972f2, arrayList, c2977k);
                }
            }
            for (InterfaceC2970d interfaceC2970d2 : abstractC2979m.f52075i.f52051k) {
                if (interfaceC2970d2 instanceof C2972f) {
                    a((C2972f) interfaceC2970d2, i9, 1, c2972f2, arrayList, c2977k);
                }
            }
            if (i9 == 1 && (abstractC2979m instanceof C2978l)) {
                for (InterfaceC2970d interfaceC2970d3 : ((C2978l) abstractC2979m).f52064k.f52051k) {
                    if (interfaceC2970d3 instanceof C2972f) {
                        a((C2972f) interfaceC2970d3, i9, 2, c2972f2, arrayList, c2977k);
                    }
                }
            }
            for (C2972f c2972f3 : abstractC2979m.f52074h.f52052l) {
                if (c2972f3 == c2972f2) {
                    c2977k.f52058b = true;
                }
                a(c2972f3, i9, 0, c2972f2, arrayList, c2977k);
            }
            for (C2972f c2972f4 : abstractC2979m.f52075i.f52052l) {
                if (c2972f4 == c2972f2) {
                    c2977k.f52058b = true;
                }
                a(c2972f4, i9, 1, c2972f2, arrayList, c2977k);
            }
            if (i9 == 1 && (abstractC2979m instanceof C2978l)) {
                Iterator it = ((C2978l) abstractC2979m).f52064k.f52052l.iterator();
                while (it.hasNext()) {
                    a((C2972f) it.next(), i9, 2, c2972f2, arrayList, c2977k);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(x.f r17) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2971e.b(x.f):boolean");
    }

    public void c() {
        d(this.f52036e);
        this.f52040i.clear();
        C2977k.f52056h = 0;
        i(this.f52032a.f51787e, 0, this.f52040i);
        i(this.f52032a.f51789f, 1, this.f52040i);
        this.f52033b = false;
    }

    public void d(ArrayList arrayList) {
        AbstractC2979m c2974h;
        arrayList.clear();
        this.f52035d.f51787e.f();
        this.f52035d.f51789f.f();
        arrayList.add(this.f52035d.f51787e);
        arrayList.add(this.f52035d.f51789f);
        HashSet hashSet = null;
        for (x.e eVar : this.f52035d.f51861w0) {
            if (eVar instanceof x.g) {
                c2974h = new C2974h(eVar);
            } else {
                if (eVar.T()) {
                    if (eVar.f51783c == null) {
                        eVar.f51783c = new C2969c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f51783c);
                } else {
                    arrayList.add(eVar.f51787e);
                }
                if (eVar.V()) {
                    if (eVar.f51785d == null) {
                        eVar.f51785d = new C2969c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f51785d);
                } else {
                    arrayList.add(eVar.f51789f);
                }
                if (eVar instanceof x.i) {
                    c2974h = new C2975i(eVar);
                }
            }
            arrayList.add(c2974h);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC2979m) it.next()).f();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC2979m abstractC2979m = (AbstractC2979m) it2.next();
            if (abstractC2979m.f52068b != this.f52035d) {
                abstractC2979m.d();
            }
        }
    }

    public final int e(x.f fVar, int i9) {
        int size = this.f52040i.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, ((C2977k) this.f52040i.get(i10)).b(fVar, i9));
        }
        return (int) jMax;
    }

    public boolean f(boolean z9) {
        boolean z10;
        boolean z11 = false;
        if (this.f52033b || this.f52034c) {
            for (x.e eVar : this.f52032a.f51861w0) {
                eVar.f51779a = false;
                eVar.f51787e.r();
                eVar.f51789f.q();
            }
            x.f fVar = this.f52032a;
            fVar.f51779a = false;
            fVar.f51787e.r();
            this.f52032a.f51789f.q();
            this.f52034c = false;
        }
        if (b(this.f52035d)) {
            return false;
        }
        this.f52032a.B0(0);
        this.f52032a.C0(0);
        e.b bVarQ = this.f52032a.q(0);
        e.b bVarQ2 = this.f52032a.q(1);
        if (this.f52033b) {
            c();
        }
        int iO = this.f52032a.O();
        int iP = this.f52032a.P();
        this.f52032a.f51787e.f52074h.d(iO);
        this.f52032a.f51789f.f52074h.d(iP);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarQ == bVar || bVarQ2 == bVar) {
            if (z9) {
                Iterator it = this.f52036e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((AbstractC2979m) it.next()).m()) {
                        z9 = false;
                        break;
                    }
                }
            }
            if (z9 && bVarQ == e.b.WRAP_CONTENT) {
                this.f52032a.i0(e.b.FIXED);
                x.f fVar2 = this.f52032a;
                fVar2.A0(e(fVar2, 0));
                x.f fVar3 = this.f52032a;
                fVar3.f51787e.f52071e.d(fVar3.N());
            }
            if (z9 && bVarQ2 == e.b.WRAP_CONTENT) {
                this.f52032a.w0(e.b.FIXED);
                x.f fVar4 = this.f52032a;
                fVar4.e0(e(fVar4, 1));
                x.f fVar5 = this.f52032a;
                fVar5.f51789f.f52071e.d(fVar5.t());
            }
        }
        x.f fVar6 = this.f52032a;
        e.b bVar2 = fVar6.f51765M[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int iN = fVar6.N() + iO;
            this.f52032a.f51787e.f52075i.d(iN);
            this.f52032a.f51787e.f52071e.d(iN - iO);
            m();
            x.f fVar7 = this.f52032a;
            e.b bVar4 = fVar7.f51765M[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int iT = fVar7.t() + iP;
                this.f52032a.f51789f.f52075i.d(iT);
                this.f52032a.f51789f.f52071e.d(iT - iP);
            }
            m();
            z10 = true;
        } else {
            z10 = false;
        }
        for (AbstractC2979m abstractC2979m : this.f52036e) {
            if (abstractC2979m.f52068b != this.f52032a || abstractC2979m.f52073g) {
                abstractC2979m.e();
            }
        }
        Iterator it2 = this.f52036e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z11 = true;
                break;
            }
            AbstractC2979m abstractC2979m2 = (AbstractC2979m) it2.next();
            if (z10 || abstractC2979m2.f52068b != this.f52032a) {
                if (!abstractC2979m2.f52074h.f52050j || ((!abstractC2979m2.f52075i.f52050j && !(abstractC2979m2 instanceof C2974h)) || (!abstractC2979m2.f52071e.f52050j && !(abstractC2979m2 instanceof C2969c) && !(abstractC2979m2 instanceof C2974h)))) {
                    break;
                }
            }
        }
        this.f52032a.i0(bVarQ);
        this.f52032a.w0(bVarQ2);
        return z11;
    }

    public boolean g(boolean z9) {
        if (this.f52033b) {
            for (x.e eVar : this.f52032a.f51861w0) {
                eVar.f51779a = false;
                C2976j c2976j = eVar.f51787e;
                c2976j.f52071e.f52050j = false;
                c2976j.f52073g = false;
                c2976j.r();
                C2978l c2978l = eVar.f51789f;
                c2978l.f52071e.f52050j = false;
                c2978l.f52073g = false;
                c2978l.q();
            }
            x.f fVar = this.f52032a;
            fVar.f51779a = false;
            C2976j c2976j2 = fVar.f51787e;
            c2976j2.f52071e.f52050j = false;
            c2976j2.f52073g = false;
            c2976j2.r();
            C2978l c2978l2 = this.f52032a.f51789f;
            c2978l2.f52071e.f52050j = false;
            c2978l2.f52073g = false;
            c2978l2.q();
            c();
        }
        if (b(this.f52035d)) {
            return false;
        }
        this.f52032a.B0(0);
        this.f52032a.C0(0);
        this.f52032a.f51787e.f52074h.d(0);
        this.f52032a.f51789f.f52074h.d(0);
        return true;
    }

    public boolean h(boolean z9, int i9) {
        boolean z10;
        e.b bVar;
        C2973g c2973g;
        int iT;
        boolean z11 = false;
        e.b bVarQ = this.f52032a.q(0);
        e.b bVarQ2 = this.f52032a.q(1);
        int iO = this.f52032a.O();
        int iP = this.f52032a.P();
        if (z9 && (bVarQ == (bVar = e.b.WRAP_CONTENT) || bVarQ2 == bVar)) {
            Iterator it = this.f52036e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC2979m abstractC2979m = (AbstractC2979m) it.next();
                if (abstractC2979m.f52072f == i9 && !abstractC2979m.m()) {
                    z9 = false;
                    break;
                }
            }
            if (i9 == 0) {
                if (z9 && bVarQ == e.b.WRAP_CONTENT) {
                    this.f52032a.i0(e.b.FIXED);
                    x.f fVar = this.f52032a;
                    fVar.A0(e(fVar, 0));
                    x.f fVar2 = this.f52032a;
                    c2973g = fVar2.f51787e.f52071e;
                    iT = fVar2.N();
                    c2973g.d(iT);
                }
            } else if (z9 && bVarQ2 == e.b.WRAP_CONTENT) {
                this.f52032a.w0(e.b.FIXED);
                x.f fVar3 = this.f52032a;
                fVar3.e0(e(fVar3, 1));
                x.f fVar4 = this.f52032a;
                c2973g = fVar4.f51789f.f52071e;
                iT = fVar4.t();
                c2973g.d(iT);
            }
        }
        x.f fVar5 = this.f52032a;
        if (i9 == 0) {
            e.b bVar2 = fVar5.f51765M[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int iN = fVar5.N() + iO;
                this.f52032a.f51787e.f52075i.d(iN);
                this.f52032a.f51787e.f52071e.d(iN - iO);
                z10 = true;
            }
            z10 = false;
        } else {
            e.b bVar3 = fVar5.f51765M[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int iT2 = fVar5.t() + iP;
                this.f52032a.f51789f.f52075i.d(iT2);
                this.f52032a.f51789f.f52071e.d(iT2 - iP);
                z10 = true;
            }
            z10 = false;
        }
        m();
        for (AbstractC2979m abstractC2979m2 : this.f52036e) {
            if (abstractC2979m2.f52072f == i9 && (abstractC2979m2.f52068b != this.f52032a || abstractC2979m2.f52073g)) {
                abstractC2979m2.e();
            }
        }
        Iterator it2 = this.f52036e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z11 = true;
                break;
            }
            AbstractC2979m abstractC2979m3 = (AbstractC2979m) it2.next();
            if (abstractC2979m3.f52072f == i9 && (z10 || abstractC2979m3.f52068b != this.f52032a)) {
                if (!abstractC2979m3.f52074h.f52050j || !abstractC2979m3.f52075i.f52050j || (!(abstractC2979m3 instanceof C2969c) && !abstractC2979m3.f52071e.f52050j)) {
                    break;
                }
            }
        }
        this.f52032a.i0(bVarQ);
        this.f52032a.w0(bVarQ2);
        return z11;
    }

    public final void i(AbstractC2979m abstractC2979m, int i9, ArrayList arrayList) {
        for (InterfaceC2970d interfaceC2970d : abstractC2979m.f52074h.f52051k) {
            if (interfaceC2970d instanceof C2972f) {
                a((C2972f) interfaceC2970d, i9, 0, abstractC2979m.f52075i, arrayList, null);
            } else if (interfaceC2970d instanceof AbstractC2979m) {
                a(((AbstractC2979m) interfaceC2970d).f52074h, i9, 0, abstractC2979m.f52075i, arrayList, null);
            }
        }
        for (InterfaceC2970d interfaceC2970d2 : abstractC2979m.f52075i.f52051k) {
            if (interfaceC2970d2 instanceof C2972f) {
                a((C2972f) interfaceC2970d2, i9, 1, abstractC2979m.f52074h, arrayList, null);
            } else if (interfaceC2970d2 instanceof AbstractC2979m) {
                a(((AbstractC2979m) interfaceC2970d2).f52075i, i9, 1, abstractC2979m.f52074h, arrayList, null);
            }
        }
        if (i9 == 1) {
            for (InterfaceC2970d interfaceC2970d3 : ((C2978l) abstractC2979m).f52064k.f52051k) {
                if (interfaceC2970d3 instanceof C2972f) {
                    a((C2972f) interfaceC2970d3, i9, 2, null, arrayList, null);
                }
            }
        }
    }

    public void j() {
        this.f52033b = true;
    }

    public void k() {
        this.f52034c = true;
    }

    public final void l(x.e eVar, e.b bVar, int i9, e.b bVar2, int i10) {
        C2968b.a aVar = this.f52039h;
        aVar.f52020a = bVar;
        aVar.f52021b = bVar2;
        aVar.f52022c = i9;
        aVar.f52023d = i10;
        this.f52038g.b(eVar, aVar);
        eVar.A0(this.f52039h.f52024e);
        eVar.e0(this.f52039h.f52025f);
        eVar.d0(this.f52039h.f52027h);
        eVar.Y(this.f52039h.f52026g);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m() {
        /*
            r12 = this;
            x.f r0 = r12.f52032a
            java.util.ArrayList r0 = r0.f51861w0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r0.next()
            x.e r1 = (x.e) r1
            boolean r2 = r1.f51779a
            if (r2 == 0) goto L19
            goto L8
        L19:
            x.e$b[] r2 = r1.f51765M
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f51801l
            int r4 = r1.f51803m
            x.e$b r6 = x.e.b.WRAP_CONTENT
            if (r8 == r6) goto L32
            x.e$b r5 = x.e.b.MATCH_CONSTRAINT
            if (r8 != r5) goto L30
            if (r2 != r9) goto L30
            goto L32
        L30:
            r2 = 0
            goto L33
        L32:
            r2 = 1
        L33:
            if (r10 == r6) goto L3b
            x.e$b r5 = x.e.b.MATCH_CONSTRAINT
            if (r10 != r5) goto L3c
            if (r4 != r9) goto L3c
        L3b:
            r3 = 1
        L3c:
            y.j r4 = r1.f51787e
            y.g r4 = r4.f52071e
            boolean r5 = r4.f52050j
            y.l r7 = r1.f51789f
            y.g r7 = r7.f52071e
            boolean r11 = r7.f52050j
            if (r5 == 0) goto L5b
            if (r11 == 0) goto L5b
            x.e$b r6 = x.e.b.FIXED
            int r5 = r4.f52047g
            int r7 = r7.f52047g
            r2 = r12
            r3 = r1
            r4 = r6
            r2.l(r3, r4, r5, r6, r7)
        L58:
            r1.f51779a = r9
            goto Lae
        L5b:
            if (r5 == 0) goto L87
            if (r3 == 0) goto L87
            x.e$b r5 = x.e.b.FIXED
            int r8 = r4.f52047g
            int r7 = r7.f52047g
            r2 = r12
            r3 = r1
            r4 = r5
            r5 = r8
            r2.l(r3, r4, r5, r6, r7)
            x.e$b r2 = x.e.b.MATCH_CONSTRAINT
            if (r10 != r2) goto L7b
            y.l r2 = r1.f51789f
            y.g r2 = r2.f52071e
            int r3 = r1.t()
        L78:
            r2.f52053m = r3
            goto Lae
        L7b:
            y.l r2 = r1.f51789f
            y.g r2 = r2.f52071e
            int r3 = r1.t()
        L83:
            r2.d(r3)
            goto L58
        L87:
            if (r11 == 0) goto Lae
            if (r2 == 0) goto Lae
            int r5 = r4.f52047g
            x.e$b r10 = x.e.b.FIXED
            int r7 = r7.f52047g
            r2 = r12
            r3 = r1
            r4 = r6
            r6 = r10
            r2.l(r3, r4, r5, r6, r7)
            x.e$b r2 = x.e.b.MATCH_CONSTRAINT
            if (r8 != r2) goto La5
            y.j r2 = r1.f51787e
            y.g r2 = r2.f52071e
            int r3 = r1.N()
            goto L78
        La5:
            y.j r2 = r1.f51787e
            y.g r2 = r2.f52071e
            int r3 = r1.N()
            goto L83
        Lae:
            boolean r2 = r1.f51779a
            if (r2 == 0) goto L8
            y.l r2 = r1.f51789f
            y.g r2 = r2.f52065l
            if (r2 == 0) goto L8
            int r1 = r1.l()
            r2.d(r1)
            goto L8
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2971e.m():void");
    }

    public void n(C2968b.InterfaceC0481b interfaceC0481b) {
        this.f52038g = interfaceC0481b;
    }
}
