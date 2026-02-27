package B3;

import B3.C;
import B3.J;
import O2.Q1;
import P2.v0;
import V2.InterfaceC1065w;
import android.os.Handler;
import android.os.Looper;
import d4.AbstractC1684a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: B3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0493a implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f474a = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f475c = new HashSet(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J.a f476d = new J.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1065w.a f477e = new InterfaceC1065w.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Looper f478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Q1 f479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v0 f480h;

    @Override // B3.C
    public final void A(Handler handler, InterfaceC1065w interfaceC1065w) {
        AbstractC1684a.e(handler);
        AbstractC1684a.e(interfaceC1065w);
        this.f477e.g(handler, interfaceC1065w);
    }

    @Override // B3.C
    public final void B(C.c cVar) {
        boolean z9 = !this.f475c.isEmpty();
        this.f475c.remove(cVar);
        if (z9 && this.f475c.isEmpty()) {
            g0();
        }
    }

    @Override // B3.C
    public final void F(C.c cVar) {
        AbstractC1684a.e(this.f478f);
        boolean zIsEmpty = this.f475c.isEmpty();
        this.f475c.add(cVar);
        if (zIsEmpty) {
            h0();
        }
    }

    @Override // B3.C
    public /* synthetic */ boolean S() {
        return B.b(this);
    }

    @Override // B3.C
    public /* synthetic */ Q1 U() {
        return B.a(this);
    }

    @Override // B3.C
    public final void V(C.c cVar) {
        this.f474a.remove(cVar);
        if (!this.f474a.isEmpty()) {
            B(cVar);
            return;
        }
        this.f478f = null;
        this.f479g = null;
        this.f480h = null;
        this.f475c.clear();
        n0();
    }

    @Override // B3.C
    public final void a(C.c cVar, b4.S s9, v0 v0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f478f;
        AbstractC1684a.a(looper == null || looper == looperMyLooper);
        this.f480h = v0Var;
        Q1 q12 = this.f479g;
        this.f474a.add(cVar);
        if (this.f478f == null) {
            this.f478f = looperMyLooper;
            this.f475c.add(cVar);
            l0(s9);
        } else if (q12 != null) {
            F(cVar);
            cVar.J(this, q12);
        }
    }

    public final InterfaceC1065w.a a0(int i9, C.b bVar) {
        return this.f477e.u(i9, bVar);
    }

    public final InterfaceC1065w.a b0(C.b bVar) {
        return this.f477e.u(0, bVar);
    }

    public final J.a d0(int i9, C.b bVar) {
        return this.f476d.E(i9, bVar);
    }

    public final J.a f0(C.b bVar) {
        return this.f476d.E(0, bVar);
    }

    public void g0() {
    }

    public void h0() {
    }

    public final v0 i0() {
        return (v0) AbstractC1684a.i(this.f480h);
    }

    public final boolean j0() {
        return !this.f475c.isEmpty();
    }

    @Override // B3.C
    public final void k(Handler handler, J j9) {
        AbstractC1684a.e(handler);
        AbstractC1684a.e(j9);
        this.f476d.g(handler, j9);
    }

    public abstract void l0(b4.S s9);

    public final void m0(Q1 q12) {
        this.f479g = q12;
        Iterator it = this.f474a.iterator();
        while (it.hasNext()) {
            ((C.c) it.next()).J(this, q12);
        }
    }

    public abstract void n0();

    @Override // B3.C
    public final void u(J j9) {
        this.f476d.B(j9);
    }

    @Override // B3.C
    public final void z(InterfaceC1065w interfaceC1065w) {
        this.f477e.t(interfaceC1065w);
    }
}
