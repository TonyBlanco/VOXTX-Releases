package o4;

import android.os.RemoteException;
import n4.C0;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2328e f45909a;

    public /* synthetic */ o0(C2328e c2328e, n0 n0Var) {
        this.f45909a = c2328e;
    }

    @Override // n4.C0
    public final void a() {
        C2328e c2328e = this.f45909a;
        if (c2328e.f45871f != null) {
            try {
                if (c2328e.f45876k != null) {
                    c2328e.f45876k.l0();
                }
                this.f45909a.f45871f.d(null);
            } catch (RemoteException e9) {
                C2328e.f45868o.b(e9, "Unable to call %s on %s.", "onConnected", InterfaceC2322E.class.getSimpleName());
            }
        }
    }

    @Override // n4.C0
    public final void b(int i9) {
        C2328e c2328e = this.f45909a;
        if (c2328e.f45871f != null) {
            try {
                c2328e.f45871f.H(new C2914b(i9));
            } catch (RemoteException e9) {
                C2328e.f45868o.b(e9, "Unable to call %s on %s.", "onConnectionFailed", InterfaceC2322E.class.getSimpleName());
            }
        }
    }

    @Override // n4.C0
    public final void c(int i9) {
        C2328e c2328e = this.f45909a;
        if (c2328e.f45871f != null) {
            try {
                c2328e.f45871f.zzj(i9);
            } catch (RemoteException e9) {
                C2328e.f45868o.b(e9, "Unable to call %s on %s.", "onConnectionSuspended", InterfaceC2322E.class.getSimpleName());
            }
        }
    }

    @Override // n4.C0
    public final void d(int i9) {
        C2328e c2328e = this.f45909a;
        if (c2328e.f45871f != null) {
            try {
                c2328e.f45871f.H(new C2914b(i9));
            } catch (RemoteException e9) {
                C2328e.f45868o.b(e9, "Unable to call %s on %s.", "onDisconnected", InterfaceC2322E.class.getSimpleName());
            }
        }
    }
}
