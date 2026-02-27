package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iw f23119a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final gz f23123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final tj f23124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final nn f23125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f23126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Set f23127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private dw f23129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ui f23130l = new ui();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f23121c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f23122d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f23120b = new ArrayList();

    public ha(gz gzVar, hu huVar, Handler handler, iw iwVar) {
        this.f23119a = iwVar;
        this.f23123e = gzVar;
        tj tjVar = new tj();
        this.f23124f = tjVar;
        nn nnVar = new nn();
        this.f23125g = nnVar;
        this.f23126h = new HashMap();
        this.f23127i = new HashSet();
        tjVar.b(handler, huVar);
        nnVar.b(handler, huVar);
    }

    private final void p(int i9, int i10) {
        while (i9 < this.f23120b.size()) {
            ((gy) this.f23120b.get(i9)).f23116d += i10;
            i9++;
        }
    }

    private final void q(gy gyVar) {
        gx gxVar = (gx) this.f23126h.get(gyVar);
        if (gxVar != null) {
            gxVar.f23110a.B(gxVar.f23111b);
        }
    }

    private final void r() {
        Iterator it = this.f23127i.iterator();
        while (it.hasNext()) {
            gy gyVar = (gy) it.next();
            if (gyVar.f23115c.isEmpty()) {
                q(gyVar);
                it.remove();
            }
        }
    }

    private final void s(gy gyVar) {
        if (gyVar.f23117e && gyVar.f23115c.isEmpty()) {
            gx gxVar = (gx) this.f23126h.remove(gyVar);
            af.s(gxVar);
            gxVar.f23110a.H(gxVar.f23111b);
            gxVar.f23110a.J(gxVar.f23112c);
            gxVar.f23110a.I(gxVar.f23112c);
            this.f23127i.remove(gyVar);
        }
    }

    private final void t(gy gyVar) {
        ta taVar = gyVar.f23113a;
        tf tfVar = new tf() { // from class: com.google.ads.interactivemedia.v3.internal.gv
            @Override // com.google.ads.interactivemedia.v3.internal.tf
            public final void a(tg tgVar, be beVar) {
                this.f23105a.n();
            }
        };
        gw gwVar = new gw(this, gyVar);
        this.f23126h.put(gyVar, new gx(taVar, tfVar, gwVar));
        taVar.A(cq.C(), gwVar);
        taVar.z(cq.C(), gwVar);
        taVar.F(tfVar, this.f23129k, this.f23119a);
    }

    private final void u(int i9, int i10) {
        while (true) {
            i10--;
            if (i10 < i9) {
                return;
            }
            gy gyVar = (gy) this.f23120b.remove(i10);
            this.f23122d.remove(gyVar.f23114b);
            p(i10, -gyVar.f23113a.k().c());
            gyVar.f23117e = true;
            if (this.f23128j) {
                s(gyVar);
            }
        }
    }

    public final int a() {
        return this.f23120b.size();
    }

    public final be b() {
        if (this.f23120b.isEmpty()) {
            return be.f21126a;
        }
        int iC = 0;
        for (int i9 = 0; i9 < this.f23120b.size(); i9++) {
            gy gyVar = (gy) this.f23120b.get(i9);
            gyVar.f23116d = iC;
            iC += gyVar.f23113a.k().c();
        }
        return new hf(this.f23120b, this.f23130l);
    }

    public final void e(dw dwVar) {
        af.w(!this.f23128j);
        this.f23129k = dwVar;
        for (int i9 = 0; i9 < this.f23120b.size(); i9++) {
            gy gyVar = (gy) this.f23120b.get(i9);
            t(gyVar);
            this.f23127i.add(gyVar);
        }
        this.f23128j = true;
    }

    public final void f() {
        for (gx gxVar : this.f23126h.values()) {
            try {
                gxVar.f23110a.H(gxVar.f23111b);
            } catch (RuntimeException e9) {
                cd.c("MediaSourceList", "Failed to release child source.", e9);
            }
            gxVar.f23110a.J(gxVar.f23112c);
            gxVar.f23110a.I(gxVar.f23112c);
        }
        this.f23126h.clear();
        this.f23127i.clear();
        this.f23128j = false;
    }

    public final void g(td tdVar) {
        gy gyVar = (gy) this.f23121c.remove(tdVar);
        af.s(gyVar);
        gyVar.f23113a.o(tdVar);
        gyVar.f23115c.remove(((sx) tdVar).f24554a);
        if (!this.f23121c.isEmpty()) {
            r();
        }
        s(gyVar);
    }

    public final boolean h() {
        return this.f23128j;
    }

    public final be i(int i9, List list, ui uiVar) {
        int iC;
        if (!list.isEmpty()) {
            this.f23130l = uiVar;
            for (int i10 = i9; i10 < list.size() + i9; i10++) {
                gy gyVar = (gy) list.get(i10 - i9);
                if (i10 > 0) {
                    gy gyVar2 = (gy) this.f23120b.get(i10 - 1);
                    iC = gyVar2.f23116d + gyVar2.f23113a.k().c();
                } else {
                    iC = 0;
                }
                gyVar.c(iC);
                p(i10, gyVar.f23113a.k().c());
                this.f23120b.add(i10, gyVar);
                this.f23122d.put(gyVar.f23114b, gyVar);
                if (this.f23128j) {
                    t(gyVar);
                    if (this.f23121c.isEmpty()) {
                        this.f23127i.add(gyVar);
                    } else {
                        q(gyVar);
                    }
                }
            }
        }
        return b();
    }

    public final be j(int i9, int i10, ui uiVar) {
        boolean z9 = false;
        if (i9 >= 0 && i9 <= i10 && i10 <= a()) {
            z9 = true;
        }
        af.u(z9);
        this.f23130l = uiVar;
        u(i9, i10);
        return b();
    }

    public final be k(List list, ui uiVar) {
        u(0, this.f23120b.size());
        return i(this.f23120b.size(), list, uiVar);
    }

    public final be l(ui uiVar) {
        int iA = a();
        if (uiVar.c() != iA) {
            uiVar = uiVar.f().g(0, iA);
        }
        this.f23130l = uiVar;
        return b();
    }

    public final td m(te teVar, wr wrVar, long j9) {
        Object objY = eg.y(teVar.f20173a);
        te teVarC = teVar.c(eg.x(teVar.f20173a));
        gy gyVar = (gy) this.f23122d.get(objY);
        af.s(gyVar);
        this.f23127i.add(gyVar);
        gx gxVar = (gx) this.f23126h.get(gyVar);
        if (gxVar != null) {
            gxVar.f23110a.D(gxVar.f23111b);
        }
        gyVar.f23115c.add(teVarC);
        sx sxVarS = gyVar.f23113a.q(teVarC, wrVar, j9);
        this.f23121c.put(sxVarS, gyVar);
        r();
        return sxVarS;
    }

    public final /* synthetic */ void n() {
        this.f23123e.h();
    }

    public final be o() {
        af.u(a() >= 0);
        this.f23130l = null;
        return b();
    }
}
