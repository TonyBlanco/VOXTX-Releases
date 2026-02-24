package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sa implements tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f24482a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f24483b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tj f24484c = new tj();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nn f24485d = new nn();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f24486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private be f24487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private iw f24488g;

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void A(Handler handler, tk tkVar) {
        af.s(handler);
        af.s(tkVar);
        this.f24484c.b(handler, tkVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void B(tf tfVar) {
        boolean zIsEmpty = this.f24483b.isEmpty();
        this.f24483b.remove(tfVar);
        if ((!zIsEmpty) && this.f24483b.isEmpty()) {
            C();
        }
    }

    public void C() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void D(tf tfVar) {
        af.s(this.f24486e);
        boolean zIsEmpty = this.f24483b.isEmpty();
        this.f24483b.add(tfVar);
        if (zIsEmpty) {
            E();
        }
    }

    public void E() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void F(tf tfVar, dw dwVar, iw iwVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f24486e;
        boolean z9 = true;
        if (looper != null && looper != looperMyLooper) {
            z9 = false;
        }
        af.u(z9);
        this.f24488g = iwVar;
        be beVar = this.f24487f;
        this.f24482a.add(tfVar);
        if (this.f24486e == null) {
            this.f24486e = looperMyLooper;
            this.f24483b.add(tfVar);
            n(dwVar);
        } else if (beVar != null) {
            D(tfVar);
            tfVar.a(this, beVar);
        }
    }

    public final void G(be beVar) {
        this.f24487f = beVar;
        ArrayList arrayList = this.f24482a;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((tf) arrayList.get(i9)).a(this, beVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void H(tf tfVar) {
        this.f24482a.remove(tfVar);
        if (!this.f24482a.isEmpty()) {
            B(tfVar);
            return;
        }
        this.f24486e = null;
        this.f24487f = null;
        this.f24488g = null;
        this.f24483b.clear();
        p();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void I(no noVar) {
        this.f24485d.h(noVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void J(tk tkVar) {
        this.f24484c.l(tkVar);
    }

    public final boolean K() {
        return !this.f24483b.isEmpty();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public /* synthetic */ boolean L() {
        return true;
    }

    public final tj M(int i9, te teVar) {
        return this.f24484c.a(i9, teVar, 0L);
    }

    public abstract void n(dw dwVar);

    public abstract void p();

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public /* synthetic */ be t() {
        return null;
    }

    public final iw u() {
        iw iwVar = this.f24488g;
        af.t(iwVar);
        return iwVar;
    }

    public final nn v(te teVar) {
        return this.f24485d.a(0, teVar);
    }

    public final nn w(int i9, te teVar) {
        return this.f24485d.a(i9, teVar);
    }

    public final tj x(te teVar) {
        return this.f24484c.a(0, teVar, 0L);
    }

    public final tj y(te teVar, long j9) {
        return this.f24484c.a(0, teVar, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tg
    public final void z(Handler handler, no noVar) {
        af.s(handler);
        af.s(noVar);
        this.f24485d.b(handler, noVar);
    }
}
