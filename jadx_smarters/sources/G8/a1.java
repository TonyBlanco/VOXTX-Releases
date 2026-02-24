package G8;

import d.AbstractC1617D;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends H {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a1 f2317d = new a1();

    @Override // G8.H
    public void c0(o8.g gVar, Runnable runnable) {
        AbstractC1617D.a(gVar.a(d1.f2326c));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // G8.H
    public boolean d0(o8.g gVar) {
        return false;
    }

    @Override // G8.H
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
