package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class si extends sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f24509a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f24510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dw f24511c;

    @Override // com.google.ads.interactivemedia.v3.internal.sa
    public void C() {
        for (sh shVar : this.f24509a.values()) {
            shVar.f24506a.B(shVar.f24507b);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sa
    public void E() {
        for (sh shVar : this.f24509a.values()) {
            shVar.f24506a.D(shVar.f24507b);
        }
    }

    public int b(Object obj, int i9) {
        throw null;
    }

    public long c(Object obj, long j9) {
        return j9;
    }

    public te d(Object obj, te teVar) {
        throw null;
    }

    public final void e(Object obj) {
        sh shVar = (sh) this.f24509a.get(obj);
        af.s(shVar);
        shVar.f24506a.B(shVar.f24507b);
    }

    public final void f(Object obj) {
        sh shVar = (sh) this.f24509a.get(obj);
        af.s(shVar);
        shVar.f24506a.D(shVar.f24507b);
    }

    public final void g(final Object obj, tg tgVar) {
        af.u(!this.f24509a.containsKey(obj));
        tf tfVar = new tf() { // from class: com.google.ads.interactivemedia.v3.internal.sf
            @Override // com.google.ads.interactivemedia.v3.internal.tf
            public final void a(tg tgVar2, be beVar) {
                this.f24500a.j(obj, beVar);
            }
        };
        sg sgVar = new sg(this, obj);
        this.f24509a.put(obj, new sh(tgVar, tfVar, sgVar));
        Handler handler = this.f24510b;
        af.s(handler);
        tgVar.A(handler, sgVar);
        Handler handler2 = this.f24510b;
        af.s(handler2);
        tgVar.z(handler2, sgVar);
        tgVar.F(tfVar, this.f24511c, u());
        if (K()) {
            return;
        }
        tgVar.B(tfVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public void h() throws IOException {
        Iterator it = this.f24509a.values().iterator();
        while (it.hasNext()) {
            ((sh) it.next()).f24506a.h();
        }
    }

    public final void i(Object obj) {
        sh shVar = (sh) this.f24509a.remove(obj);
        af.s(shVar);
        shVar.f24506a.H(shVar.f24507b);
        shVar.f24506a.J(shVar.f24508c);
        shVar.f24506a.I(shVar.f24508c);
    }

    public abstract void j(Object obj, be beVar);

    @Override // com.google.ads.interactivemedia.v3.internal.sa
    public void n(dw dwVar) {
        this.f24511c = dwVar;
        this.f24510b = cq.A();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sa
    public void p() {
        for (sh shVar : this.f24509a.values()) {
            shVar.f24506a.H(shVar.f24507b);
            shVar.f24506a.J(shVar.f24508c);
            shVar.f24506a.I(shVar.f24508c);
        }
        this.f24509a.clear();
    }
}
