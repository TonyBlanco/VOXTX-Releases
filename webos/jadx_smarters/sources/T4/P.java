package t4;

import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.zzdy;
import java.util.concurrent.atomic.AtomicReference;
import n4.C2266d;

/* JADX INFO: loaded from: classes3.dex */
public final class P extends AbstractBinderC2783j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f50671a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f50672c;

    public P(Q q9) {
        this.f50671a = new AtomicReference(q9);
        this.f50672c = new zzdy(q9.getLooper());
    }

    public final Q A() {
        Q q9 = (Q) this.f50671a.getAndSet(null);
        if (q9 == null) {
            return null;
        }
        q9.s();
        return q9;
    }

    @Override // t4.InterfaceC2784k
    public final void G(int i9) {
    }

    @Override // t4.InterfaceC2784k
    public final void G0(String str, long j9) {
        Q q9 = (Q) this.f50671a.get();
        if (q9 == null) {
            return;
        }
        q9.u(j9, 0);
    }

    @Override // t4.InterfaceC2784k
    public final void J(String str, double d9, boolean z9) {
        Q.f50675z.a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // t4.InterfaceC2784k
    public final void N0(int i9) {
    }

    @Override // t4.InterfaceC2784k
    public final void P(C2778e c2778e) {
        Q q9 = (Q) this.f50671a.get();
        if (q9 == null) {
            return;
        }
        Q.f50675z.a("onDeviceStatusChanged", new Object[0]);
        this.f50672c.post(new M(this, q9, c2778e));
    }

    @Override // t4.InterfaceC2784k
    public final void S0(String str, byte[] bArr) {
        if (((Q) this.f50671a.get()) == null) {
            return;
        }
        Q.f50675z.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // t4.InterfaceC2784k
    public final void a0(C2266d c2266d, String str, String str2, boolean z9) {
        Q q9 = (Q) this.f50671a.get();
        if (q9 == null) {
            return;
        }
        q9.f50676c = c2266d;
        q9.f50693t = c2266d.H();
        q9.f50694u = str2;
        q9.f50683j = str;
        synchronized (Q.f50673A) {
            try {
                if (q9.f50697x != null) {
                    q9.f50697x.setResult(new K(new Status(0), c2266d, str, str2, z9));
                    q9.f50697x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t4.InterfaceC2784k
    public final void c(int i9) {
        Q q9 = (Q) this.f50671a.get();
        if (q9 == null) {
            return;
        }
        q9.r(i9);
    }

    @Override // t4.InterfaceC2784k
    public final void e(int i9) {
        Q qA = A();
        if (qA == null) {
            return;
        }
        Q.f50675z.a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i9));
        if (i9 != 0) {
            qA.triggerConnectionSuspended(2);
        }
    }

    @Override // t4.InterfaceC2784k
    public final void f(C2776c c2776c) {
        Q q9 = (Q) this.f50671a.get();
        if (q9 == null) {
            return;
        }
        Q.f50675z.a("onApplicationStatusChanged", new Object[0]);
        this.f50672c.post(new N(this, q9, c2776c));
    }

    @Override // t4.InterfaceC2784k
    public final void m(String str, long j9, int i9) {
        Q q9 = (Q) this.f50671a.get();
        if (q9 == null) {
            return;
        }
        q9.u(j9, i9);
    }

    @Override // t4.InterfaceC2784k
    public final void v0(String str, String str2) {
        Q q9 = (Q) this.f50671a.get();
        if (q9 == null) {
            return;
        }
        Q.f50675z.a("Receive (type=text, ns=%s) %s", str, str2);
        this.f50672c.post(new O(this, q9, str, str2));
    }

    @Override // t4.InterfaceC2784k
    public final void zzd(int i9) {
        Q q9 = (Q) this.f50671a.get();
        if (q9 == null) {
            return;
        }
        q9.f50693t = null;
        q9.f50694u = null;
        q9.v(i9);
        if (q9.f50678e != null) {
            this.f50672c.post(new L(this, q9, i9));
        }
    }

    @Override // t4.InterfaceC2784k
    public final void zze(int i9) {
        Q q9 = (Q) this.f50671a.get();
        if (q9 == null) {
            return;
        }
        q9.v(i9);
    }

    @Override // t4.InterfaceC2784k
    public final void zzg(int i9) {
        Q q9 = (Q) this.f50671a.get();
        if (q9 == null) {
            return;
        }
        q9.v(i9);
    }
}
