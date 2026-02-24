package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import s.C2700f;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s.i f17102a = new s.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2700f f17103b = new C2700f();

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static O.e f17104d = new O.f(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.l.c f17106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RecyclerView.l.c f17107c;

        public static void a() {
            while (f17104d.b() != null) {
            }
        }

        public static a b() {
            a aVar = (a) f17104d.b();
            return aVar == null ? new a() : aVar;
        }

        public static void c(a aVar) {
            aVar.f17105a = 0;
            aVar.f17106b = null;
            aVar.f17107c = null;
            f17104d.a(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.D d9, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void b(RecyclerView.D d9);

        void c(RecyclerView.D d9, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.D d9, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    public void a(RecyclerView.D d9, RecyclerView.l.c cVar) {
        a aVarB = (a) this.f17102a.get(d9);
        if (aVarB == null) {
            aVarB = a.b();
            this.f17102a.put(d9, aVarB);
        }
        aVarB.f17105a |= 2;
        aVarB.f17106b = cVar;
    }

    public void b(RecyclerView.D d9) {
        a aVarB = (a) this.f17102a.get(d9);
        if (aVarB == null) {
            aVarB = a.b();
            this.f17102a.put(d9, aVarB);
        }
        aVarB.f17105a |= 1;
    }

    public void c(long j9, RecyclerView.D d9) {
        this.f17103b.k(j9, d9);
    }

    public void d(RecyclerView.D d9, RecyclerView.l.c cVar) {
        a aVarB = (a) this.f17102a.get(d9);
        if (aVarB == null) {
            aVarB = a.b();
            this.f17102a.put(d9, aVarB);
        }
        aVarB.f17107c = cVar;
        aVarB.f17105a |= 8;
    }

    public void e(RecyclerView.D d9, RecyclerView.l.c cVar) {
        a aVarB = (a) this.f17102a.get(d9);
        if (aVarB == null) {
            aVarB = a.b();
            this.f17102a.put(d9, aVarB);
        }
        aVarB.f17106b = cVar;
        aVarB.f17105a |= 4;
    }

    public void f() {
        this.f17102a.clear();
        this.f17103b.d();
    }

    public RecyclerView.D g(long j9) {
        return (RecyclerView.D) this.f17103b.g(j9);
    }

    public boolean h(RecyclerView.D d9) {
        a aVar = (a) this.f17102a.get(d9);
        return (aVar == null || (aVar.f17105a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.D d9) {
        a aVar = (a) this.f17102a.get(d9);
        return (aVar == null || (aVar.f17105a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.D d9) {
        p(d9);
    }

    public final RecyclerView.l.c l(RecyclerView.D d9, int i9) {
        a aVar;
        RecyclerView.l.c cVar;
        int iG = this.f17102a.g(d9);
        if (iG >= 0 && (aVar = (a) this.f17102a.o(iG)) != null) {
            int i10 = aVar.f17105a;
            if ((i10 & i9) != 0) {
                int i11 = (~i9) & i10;
                aVar.f17105a = i11;
                if (i9 == 4) {
                    cVar = aVar.f17106b;
                } else {
                    if (i9 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVar.f17107c;
                }
                if ((i11 & 12) == 0) {
                    this.f17102a.m(iG);
                    a.c(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.l.c m(RecyclerView.D d9) {
        return l(d9, 8);
    }

    public RecyclerView.l.c n(RecyclerView.D d9) {
        return l(d9, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(androidx.recyclerview.widget.q.b r7) {
        /*
            r6 = this;
            s.i r0 = r6.f17102a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L63
            s.i r1 = r6.f17102a
            java.lang.Object r1 = r1.j(r0)
            androidx.recyclerview.widget.RecyclerView$D r1 = (androidx.recyclerview.widget.RecyclerView.D) r1
            s.i r2 = r6.f17102a
            java.lang.Object r2 = r2.m(r0)
            androidx.recyclerview.widget.q$a r2 = (androidx.recyclerview.widget.q.a) r2
            int r3 = r2.f17105a
            r4 = r3 & 3
            r5 = 3
            if (r4 != r5) goto L25
        L21:
            r7.b(r1)
            goto L5d
        L25:
            r4 = r3 & 1
            if (r4 == 0) goto L34
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f17106b
            if (r3 != 0) goto L2e
            goto L21
        L2e:
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r2.f17107c
        L30:
            r7.c(r1, r3, r4)
            goto L5d
        L34:
            r4 = r3 & 14
            r5 = 14
            if (r4 != r5) goto L42
        L3a:
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f17106b
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r2.f17107c
            r7.a(r1, r3, r4)
            goto L5d
        L42:
            r4 = r3 & 12
            r5 = 12
            if (r4 != r5) goto L50
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f17106b
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r2.f17107c
            r7.d(r1, r3, r4)
            goto L5d
        L50:
            r4 = r3 & 4
            if (r4 == 0) goto L58
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f17106b
            r4 = 0
            goto L30
        L58:
            r3 = r3 & 8
            if (r3 == 0) goto L5d
            goto L3a
        L5d:
            androidx.recyclerview.widget.q.a.c(r2)
            int r0 = r0 + (-1)
            goto L8
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.q.o(androidx.recyclerview.widget.q$b):void");
    }

    public void p(RecyclerView.D d9) {
        a aVar = (a) this.f17102a.get(d9);
        if (aVar == null) {
            return;
        }
        aVar.f17105a &= -2;
    }

    public void q(RecyclerView.D d9) {
        int iN = this.f17103b.n() - 1;
        while (true) {
            if (iN < 0) {
                break;
            }
            if (d9 == this.f17103b.o(iN)) {
                this.f17103b.m(iN);
                break;
            }
            iN--;
        }
        a aVar = (a) this.f17102a.remove(d9);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
