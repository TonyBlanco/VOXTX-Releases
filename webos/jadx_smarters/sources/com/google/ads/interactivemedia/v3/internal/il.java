package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bc f23256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private avo f23257b = avo.o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private avs f23258c = avs.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private te f23259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private te f23260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private te f23261f;

    public il(bc bcVar) {
        this.f23256a = bcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static te j(az azVar, avo avoVar, te teVar, bc bcVar) {
        be beVarO = azVar.o();
        int i9 = azVar.i();
        Object objF = beVarO.p() ? null : beVarO.f(i9);
        int iB = (azVar.r() || beVarO.p()) ? -1 : beVarO.m(i9, bcVar).b(cq.t(azVar.m()) - bcVar.f21039e);
        for (int i10 = 0; i10 < avoVar.size(); i10++) {
            te teVar2 = (te) avoVar.get(i10);
            if (m(teVar2, objF, azVar.r(), azVar.f(), azVar.g(), iB)) {
                return teVar2;
            }
        }
        if (avoVar.isEmpty() && teVar != null) {
            if (m(teVar, objF, azVar.r(), azVar.f(), azVar.g(), iB)) {
                return teVar;
            }
        }
        return null;
    }

    private final void k(avq avqVar, te teVar, be beVar) {
        if (teVar == null) {
            return;
        }
        if (beVar.a(teVar.f20173a) != -1) {
            avqVar.a(teVar, beVar);
            return;
        }
        be beVar2 = (be) this.f23258c.get(teVar);
        if (beVar2 != null) {
            avqVar.a(teVar, beVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l(com.google.ads.interactivemedia.v3.internal.be r4) {
        /*
            r3 = this;
            com.google.ads.interactivemedia.v3.internal.avq r0 = new com.google.ads.interactivemedia.v3.internal.avq
            r0.<init>()
            com.google.ads.interactivemedia.v3.internal.avo r1 = r3.f23257b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3b
            com.google.ads.interactivemedia.v3.internal.te r1 = r3.f23260e
            r3.k(r0, r1, r4)
            com.google.ads.interactivemedia.v3.internal.te r1 = r3.f23261f
            com.google.ads.interactivemedia.v3.internal.te r2 = r3.f23260e
            boolean r1 = com.google.ads.interactivemedia.v3.impl.data.k.c(r1, r2)
            if (r1 != 0) goto L21
            com.google.ads.interactivemedia.v3.internal.te r1 = r3.f23261f
            r3.k(r0, r1, r4)
        L21:
            com.google.ads.interactivemedia.v3.internal.te r1 = r3.f23259d
            com.google.ads.interactivemedia.v3.internal.te r2 = r3.f23260e
            boolean r1 = com.google.ads.interactivemedia.v3.impl.data.k.c(r1, r2)
            if (r1 != 0) goto L5d
            com.google.ads.interactivemedia.v3.internal.te r1 = r3.f23259d
            com.google.ads.interactivemedia.v3.internal.te r2 = r3.f23261f
            boolean r1 = com.google.ads.interactivemedia.v3.impl.data.k.c(r1, r2)
            if (r1 != 0) goto L5d
        L35:
            com.google.ads.interactivemedia.v3.internal.te r1 = r3.f23259d
            r3.k(r0, r1, r4)
            goto L5d
        L3b:
            r1 = 0
        L3c:
            com.google.ads.interactivemedia.v3.internal.avo r2 = r3.f23257b
            int r2 = r2.size()
            if (r1 >= r2) goto L52
            com.google.ads.interactivemedia.v3.internal.avo r2 = r3.f23257b
            java.lang.Object r2 = r2.get(r1)
            com.google.ads.interactivemedia.v3.internal.te r2 = (com.google.ads.interactivemedia.v3.internal.te) r2
            r3.k(r0, r2, r4)
            int r1 = r1 + 1
            goto L3c
        L52:
            com.google.ads.interactivemedia.v3.internal.avo r1 = r3.f23257b
            com.google.ads.interactivemedia.v3.internal.te r2 = r3.f23259d
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L5d
            goto L35
        L5d:
            com.google.ads.interactivemedia.v3.internal.avs r4 = r0.b()
            r3.f23258c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.il.l(com.google.ads.interactivemedia.v3.internal.be):void");
    }

    private static boolean m(te teVar, Object obj, boolean z9, int i9, int i10, int i11) {
        if (!teVar.f20173a.equals(obj)) {
            return false;
        }
        if (z9) {
            if (teVar.f20174b != i9 || teVar.f20175c != i10) {
                return false;
            }
        } else if (teVar.f20174b != -1 || teVar.f20177e != i11) {
            return false;
        }
        return true;
    }

    public final be a(te teVar) {
        return (be) this.f23258c.get(teVar);
    }

    public final te b() {
        return this.f23259d;
    }

    public final te c() {
        if (this.f23257b.isEmpty()) {
            return null;
        }
        return (te) axo.z(this.f23257b);
    }

    public final te d() {
        return this.f23260e;
    }

    public final te e() {
        return this.f23261f;
    }

    public final void g(az azVar) {
        this.f23259d = j(azVar, this.f23257b, this.f23260e, this.f23256a);
    }

    public final void h(List list, te teVar, az azVar) {
        this.f23257b = avo.m(list);
        if (!list.isEmpty()) {
            this.f23260e = (te) list.get(0);
            af.s(teVar);
            this.f23261f = teVar;
        }
        if (this.f23259d == null) {
            this.f23259d = j(azVar, this.f23257b, this.f23260e, this.f23256a);
        }
        l(azVar.o());
    }

    public final void i(az azVar) {
        this.f23259d = j(azVar, this.f23257b, this.f23260e, this.f23256a);
        l(azVar.o());
    }
}
