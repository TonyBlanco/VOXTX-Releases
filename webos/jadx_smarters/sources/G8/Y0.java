package G8;

import o8.InterfaceC2372d;

/* JADX INFO: loaded from: classes4.dex */
public final class Y0 extends kotlinx.coroutines.internal.x implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2314e;

    public Y0(long j9, InterfaceC2372d interfaceC2372d) {
        super(interfaceC2372d.getContext(), interfaceC2372d);
        this.f2314e = j9;
    }

    @Override // G8.AbstractC0559a, G8.E0
    public String p0() {
        return super.p0() + "(timeMillis=" + this.f2314e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        G(Z0.a(this.f2314e, this));
    }
}
