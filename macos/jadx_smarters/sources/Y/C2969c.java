package y;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: y.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2969c extends AbstractC2979m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f52030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f52031l;

    public C2969c(x.e eVar, int i9) {
        super(eVar);
        this.f52030k = new ArrayList();
        this.f52072f = i9;
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01d0 A[PHI: r1 r22 r23 r24
      0x01d0: PHI (r1v51 int) = (r1v49 int), (r1v57 int) binds: [B:119:0x01ce, B:110:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r22v1 float) = (r22v0 float), (r22v3 float) binds: [B:119:0x01ce, B:110:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r23v4 boolean) = (r23v3 boolean), (r23v6 boolean) binds: [B:119:0x01ce, B:110:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r24v4 int) = (r24v3 int), (r24v6 int) binds: [B:119:0x01ce, B:110:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014f  */
    @Override // y.AbstractC2979m, y.InterfaceC2970d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(y.InterfaceC2970d r26) {
        /*
            Method dump skipped, instruction units count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2969c.a(y.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[PHI: r0 r1
      0x00a5: PHI (r0v13 int) = (r0v10 int), (r0v19 int) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r1v3 y.f) = (r1v2 y.f), (r1v7 y.f) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // y.AbstractC2979m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f52030k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            y.m r1 = (y.AbstractC2979m) r1
            r1.d()
            goto L6
        L16:
            java.util.ArrayList r0 = r5.f52030k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList r2 = r5.f52030k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            y.m r2 = (y.AbstractC2979m) r2
            x.e r2 = r2.f52068b
            java.util.ArrayList r4 = r5.f52030k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            y.m r0 = (y.AbstractC2979m) r0
            x.e r0 = r0.f52068b
            int r4 = r5.f52072f
            if (r4 != 0) goto L70
            x.d r1 = r2.f51754B
            x.d r0 = r0.f51756D
            y.f r2 = r5.i(r1, r3)
            int r1 = r1.b()
            x.e r4 = r5.r()
            if (r4 == 0) goto L52
            x.d r1 = r4.f51754B
            int r1 = r1.b()
        L52:
            if (r2 == 0) goto L59
            y.f r4 = r5.f52074h
            r5.b(r4, r2, r1)
        L59:
            y.f r1 = r5.i(r0, r3)
            int r0 = r0.b()
            x.e r2 = r5.s()
            if (r2 == 0) goto L6d
            x.d r0 = r2.f51756D
            int r0 = r0.b()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            x.d r2 = r2.f51755C
            x.d r0 = r0.f51757E
            y.f r3 = r5.i(r2, r1)
            int r2 = r2.b()
            x.e r4 = r5.r()
            if (r4 == 0) goto L88
            x.d r2 = r4.f51755C
            int r2 = r2.b()
        L88:
            if (r3 == 0) goto L8f
            y.f r4 = r5.f52074h
            r5.b(r4, r3, r2)
        L8f:
            y.f r1 = r5.i(r0, r1)
            int r0 = r0.b()
            x.e r2 = r5.s()
            if (r2 == 0) goto La3
            x.d r0 = r2.f51757E
            int r0 = r0.b()
        La3:
            if (r1 == 0) goto Lab
        La5:
            y.f r2 = r5.f52075i
            int r0 = -r0
            r5.b(r2, r1, r0)
        Lab:
            y.f r0 = r5.f52074h
            r0.f52041a = r5
            y.f r0 = r5.f52075i
            r0.f52041a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2969c.d():void");
    }

    @Override // y.AbstractC2979m
    public void e() {
        for (int i9 = 0; i9 < this.f52030k.size(); i9++) {
            ((AbstractC2979m) this.f52030k.get(i9)).e();
        }
    }

    @Override // y.AbstractC2979m
    public void f() {
        this.f52069c = null;
        Iterator it = this.f52030k.iterator();
        while (it.hasNext()) {
            ((AbstractC2979m) it.next()).f();
        }
    }

    @Override // y.AbstractC2979m
    public long j() {
        int size = this.f52030k.size();
        long j9 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC2979m abstractC2979m = (AbstractC2979m) this.f52030k.get(i9);
            j9 = j9 + ((long) abstractC2979m.f52074h.f52046f) + abstractC2979m.j() + ((long) abstractC2979m.f52075i.f52046f);
        }
        return j9;
    }

    @Override // y.AbstractC2979m
    public boolean m() {
        int size = this.f52030k.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (!((AbstractC2979m) this.f52030k.get(i9)).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        x.e eVar;
        x.e eVarF = this.f52068b;
        do {
            eVar = eVarF;
            eVarF = eVarF.F(this.f52072f);
        } while (eVarF != null);
        this.f52068b = eVar;
        this.f52030k.add(eVar.H(this.f52072f));
        x.e eVarD = eVar.D(this.f52072f);
        while (eVarD != null) {
            this.f52030k.add(eVarD.H(this.f52072f));
            eVarD = eVarD.D(this.f52072f);
        }
        for (AbstractC2979m abstractC2979m : this.f52030k) {
            int i9 = this.f52072f;
            if (i9 == 0) {
                abstractC2979m.f52068b.f51783c = this;
            } else if (i9 == 1) {
                abstractC2979m.f52068b.f51785d = this;
            }
        }
        if (this.f52072f == 0 && ((x.f) this.f52068b.E()).V0() && this.f52030k.size() > 1) {
            ArrayList arrayList = this.f52030k;
            this.f52068b = ((AbstractC2979m) arrayList.get(arrayList.size() - 1)).f52068b;
        }
        this.f52031l = this.f52072f == 0 ? this.f52068b.v() : this.f52068b.J();
    }

    public final x.e r() {
        for (int i9 = 0; i9 < this.f52030k.size(); i9++) {
            AbstractC2979m abstractC2979m = (AbstractC2979m) this.f52030k.get(i9);
            if (abstractC2979m.f52068b.M() != 8) {
                return abstractC2979m.f52068b;
            }
        }
        return null;
    }

    public final x.e s() {
        for (int size = this.f52030k.size() - 1; size >= 0; size--) {
            AbstractC2979m abstractC2979m = (AbstractC2979m) this.f52030k.get(size);
            if (abstractC2979m.f52068b.M() != 8) {
                return abstractC2979m.f52068b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f52072f == 0 ? "horizontal : " : "vertical : ");
        String string = sb.toString();
        Iterator it = this.f52030k.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + ((AbstractC2979m) it.next())) + "> ";
        }
        return string;
    }
}
