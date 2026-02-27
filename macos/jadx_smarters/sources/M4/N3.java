package M4;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class N3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4386a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f5 f4387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4388d;

    public N3(C0760i4 c0760i4, AtomicReference atomicReference, f5 f5Var) {
        this.f4388d = c0760i4;
        this.f4386a = atomicReference;
        this.f4387c = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f4386a) {
            try {
                try {
                } catch (RemoteException e9) {
                    this.f4388d.f4245a.d().r().b("Failed to get app instance id", e9);
                    atomicReference = this.f4386a;
                }
                if (!this.f4388d.f4245a.F().q().j(J2.ANALYTICS_STORAGE)) {
                    this.f4388d.f4245a.d().x().a("Analytics storage consent denied; will not get app instance id");
                    this.f4388d.f4245a.I().C(null);
                    this.f4388d.f4245a.F().f4406g.b(null);
                    this.f4386a.set(null);
                    return;
                }
                C0760i4 c0760i4 = this.f4388d;
                InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
                if (interfaceC0799p1 == null) {
                    c0760i4.f4245a.d().r().a("Failed to get app instance id");
                    return;
                }
                com.google.android.gms.common.internal.r.m(this.f4387c);
                this.f4386a.set(interfaceC0799p1.I(this.f4387c));
                String str = (String) this.f4386a.get();
                if (str != null) {
                    this.f4388d.f4245a.I().C(str);
                    this.f4388d.f4245a.F().f4406g.b(str);
                }
                this.f4388d.E();
                atomicReference = this.f4386a;
                atomicReference.notify();
            } finally {
                this.f4386a.notify();
            }
        }
    }
}
