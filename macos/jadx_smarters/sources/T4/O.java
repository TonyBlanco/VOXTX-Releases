package t4;

import n4.AbstractC2268e;

/* JADX INFO: loaded from: classes3.dex */
public final class O implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f50668a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f50669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f50670d;

    public O(P p9, Q q9, String str, String str2) {
        this.f50668a = q9;
        this.f50669c = str;
        this.f50670d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2268e.InterfaceC0394e interfaceC0394e;
        synchronized (this.f50668a.f50679f) {
            interfaceC0394e = (AbstractC2268e.InterfaceC0394e) this.f50668a.f50679f.get(this.f50669c);
        }
        if (interfaceC0394e != null) {
            interfaceC0394e.a(this.f50668a.f50677d, this.f50669c, this.f50670d);
        } else {
            Q.f50675z.a("Discarded message for unknown namespace '%s'", this.f50669c);
        }
    }
}
