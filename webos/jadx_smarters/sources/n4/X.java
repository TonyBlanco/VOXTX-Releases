package n4;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import n4.AbstractC2268e;
import t4.AbstractBinderC2783j;
import t4.C2776c;
import t4.C2778e;

/* JADX INFO: loaded from: classes3.dex */
public final class X extends AbstractBinderC2783j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f45320a;

    public X(Y y9) {
        this.f45320a = y9;
    }

    @Override // t4.InterfaceC2784k
    public final void G(final int i9) {
        Y.D(this.f45320a).post(new Runnable() { // from class: n4.W
            @Override // java.lang.Runnable
            public final void run() {
                X x9 = this.f45318a;
                int i10 = i9;
                if (i10 != 0) {
                    x9.f45320a.f45345y = 1;
                    synchronized (x9.f45320a.f45344x) {
                        try {
                            Iterator it = x9.f45320a.f45344x.iterator();
                            while (it.hasNext()) {
                                ((C0) it.next()).b(i10);
                            }
                        } finally {
                        }
                    }
                    x9.f45320a.y();
                    return;
                }
                x9.f45320a.f45345y = 2;
                x9.f45320a.f45326f = true;
                x9.f45320a.f45327g = true;
                synchronized (x9.f45320a.f45344x) {
                    try {
                        Iterator it2 = x9.f45320a.f45344x.iterator();
                        while (it2.hasNext()) {
                            ((C0) it2.next()).a();
                        }
                    } finally {
                    }
                }
            }
        });
    }

    @Override // t4.InterfaceC2784k
    public final void G0(String str, long j9) {
        Y.l(this.f45320a, j9, 0);
    }

    @Override // t4.InterfaceC2784k
    public final void J(String str, double d9, boolean z9) {
        Y.f45323z.a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // t4.InterfaceC2784k
    public final void N0(final int i9) {
        Y.D(this.f45320a).post(new Runnable() { // from class: n4.U
            @Override // java.lang.Runnable
            public final void run() {
                X x9 = this.f45313a;
                int i10 = i9;
                x9.f45320a.f45345y = 3;
                synchronized (x9.f45320a.f45344x) {
                    try {
                        Iterator it = x9.f45320a.f45344x.iterator();
                        while (it.hasNext()) {
                            ((C0) it.next()).c(i10);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // t4.InterfaceC2784k
    public final void P(final C2778e c2778e) {
        Y.D(this.f45320a).post(new Runnable() { // from class: n4.S
            @Override // java.lang.Runnable
            public final void run() {
                X x9 = this.f45309a;
                Y.h(x9.f45320a, c2778e);
            }
        });
    }

    @Override // t4.InterfaceC2784k
    public final void S0(String str, byte[] bArr) {
        Y.f45323z.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // t4.InterfaceC2784k
    public final void a0(C2266d c2266d, String str, String str2, boolean z9) {
        this.f45320a.f45333m = c2266d;
        this.f45320a.f45334n = str;
        Y.k(this.f45320a, new t4.K(new Status(0), c2266d, str, str2, z9));
    }

    @Override // t4.InterfaceC2784k
    public final void c(int i9) {
        this.f45320a.A(i9);
    }

    @Override // t4.InterfaceC2784k
    public final void e(final int i9) {
        Y.D(this.f45320a).post(new Runnable() { // from class: n4.T
            @Override // java.lang.Runnable
            public final void run() {
                X x9 = this.f45311a;
                int i10 = i9;
                Y.N(x9.f45320a);
                x9.f45320a.f45345y = 1;
                synchronized (x9.f45320a.f45344x) {
                    try {
                        Iterator it = x9.f45320a.f45344x.iterator();
                        while (it.hasNext()) {
                            ((C0) it.next()).d(i10);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                x9.f45320a.y();
                Y y9 = x9.f45320a;
                y9.w(y9.f45324d);
            }
        });
    }

    @Override // t4.InterfaceC2784k
    public final void f(final C2776c c2776c) {
        Y.D(this.f45320a).post(new Runnable() { // from class: n4.P
            @Override // java.lang.Runnable
            public final void run() {
                X x9 = this.f45305a;
                Y.O(x9.f45320a, c2776c);
            }
        });
    }

    @Override // t4.InterfaceC2784k
    public final void m(String str, long j9, int i9) {
        Y.l(this.f45320a, j9, i9);
    }

    @Override // t4.InterfaceC2784k
    public final void v0(final String str, final String str2) {
        Y.f45323z.a("Receive (type=text, ns=%s) %s", str, str2);
        Y.D(this.f45320a).post(new Runnable() { // from class: n4.V
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2268e.InterfaceC0394e interfaceC0394e;
                X x9 = this.f45315a;
                String str3 = str;
                String str4 = str2;
                synchronized (x9.f45320a.f45342v) {
                    interfaceC0394e = (AbstractC2268e.InterfaceC0394e) x9.f45320a.f45342v.get(str3);
                }
                if (interfaceC0394e != null) {
                    interfaceC0394e.a(x9.f45320a.f45340t, str3, str4);
                } else {
                    Y.f45323z.a("Discarded message for unknown namespace '%s'", str3);
                }
            }
        });
    }

    @Override // t4.InterfaceC2784k
    public final void zzd(final int i9) {
        Y.m(this.f45320a, i9);
        Y y9 = this.f45320a;
        if (y9.f45343w != null) {
            Y.D(y9).post(new Runnable() { // from class: n4.Q
                @Override // java.lang.Runnable
                public final void run() {
                    X x9 = this.f45307a;
                    x9.f45320a.f45343w.onApplicationDisconnected(i9);
                }
            });
        }
    }

    @Override // t4.InterfaceC2784k
    public final void zze(int i9) {
        Y.m(this.f45320a, i9);
    }

    @Override // t4.InterfaceC2784k
    public final void zzg(int i9) {
        Y.m(this.f45320a, i9);
    }
}
