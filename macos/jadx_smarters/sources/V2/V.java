package V2;

import B3.C;
import O2.C0936z0;
import P2.v0;
import V2.C1051h;
import V2.C1056m;
import V2.InterfaceC1058o;
import V2.InterfaceC1065w;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import b4.InterfaceC1224o;
import d4.AbstractC1684a;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class V {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0936z0 f9912f = new C0936z0.b().O(new C1056m(new C1056m.b[0])).G();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConditionVariable f9913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1051h f9914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThread f9915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f9916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1065w.a f9917e;

    public class a implements InterfaceC1065w {
        public a() {
        }

        @Override // V2.InterfaceC1065w
        public void C(int i9, C.b bVar) {
            V.this.f9913a.open();
        }

        @Override // V2.InterfaceC1065w
        public void G(int i9, C.b bVar) {
            V.this.f9913a.open();
        }

        @Override // V2.InterfaceC1065w
        public /* synthetic */ void K(int i9, C.b bVar) {
            AbstractC1059p.a(this, i9, bVar);
        }

        @Override // V2.InterfaceC1065w
        public /* synthetic */ void N(int i9, C.b bVar, int i10) {
            AbstractC1059p.b(this, i9, bVar, i10);
        }

        @Override // V2.InterfaceC1065w
        public void Q(int i9, C.b bVar, Exception exc) {
            V.this.f9913a.open();
        }

        @Override // V2.InterfaceC1065w
        public void T(int i9, C.b bVar) {
            V.this.f9913a.open();
        }

        @Override // V2.InterfaceC1065w
        public /* synthetic */ void c0(int i9, C.b bVar) {
            AbstractC1059p.c(this, i9, bVar);
        }
    }

    public V(C1051h c1051h, InterfaceC1065w.a aVar) {
        this.f9914b = c1051h;
        this.f9917e = aVar;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.f9915c = handlerThread;
        handlerThread.start();
        this.f9916d = new Handler(handlerThread.getLooper());
        this.f9913a = new ConditionVariable();
        aVar.g(new Handler(handlerThread.getLooper()), new a());
    }

    public static V m(String str, boolean z9, InterfaceC1224o.a aVar, Map map, InterfaceC1065w.a aVar2) {
        return new V(new C1051h.b().b(map).a(new M(str, z9, aVar)), aVar2);
    }

    public final InterfaceC1058o f(final int i9, final byte[] bArr, final C0936z0 c0936z0) {
        AbstractC1684a.e(c0936z0.f6470p);
        final y5.e eVarX = y5.e.x();
        this.f9913a.close();
        this.f9916d.post(new Runnable() { // from class: V2.T
            @Override // java.lang.Runnable
            public final void run() {
                this.f9904a.i(i9, bArr, eVarX, c0936z0);
            }
        });
        try {
            final InterfaceC1058o interfaceC1058o = (InterfaceC1058o) eVarX.get();
            this.f9913a.block();
            final y5.e eVarX2 = y5.e.x();
            this.f9916d.post(new Runnable() { // from class: V2.U
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9909a.j(interfaceC1058o, eVarX2);
                }
            });
            try {
                if (eVarX2.get() == null) {
                    return interfaceC1058o;
                }
                throw ((InterfaceC1058o.a) eVarX2.get());
            } catch (InterruptedException | ExecutionException e9) {
                throw new IllegalStateException(e9);
            }
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final byte[] g(int i9, byte[] bArr, C0936z0 c0936z0) {
        final InterfaceC1058o interfaceC1058oF = f(i9, bArr, c0936z0);
        final y5.e eVarX = y5.e.x();
        this.f9916d.post(new Runnable() { // from class: V2.Q
            @Override // java.lang.Runnable
            public final void run() {
                this.f9899a.k(eVarX, interfaceC1058oF);
            }
        });
        try {
            try {
                return (byte[]) AbstractC1684a.e((byte[]) eVarX.get());
            } finally {
                o();
            }
        } catch (InterruptedException | ExecutionException e9) {
            throw new IllegalStateException(e9);
        }
    }

    public synchronized byte[] h(C0936z0 c0936z0) {
        AbstractC1684a.a(c0936z0.f6470p != null);
        return g(2, null, c0936z0);
    }

    public final /* synthetic */ void i(int i9, byte[] bArr, y5.e eVar, C0936z0 c0936z0) {
        try {
            this.f9914b.b((Looper) AbstractC1684a.e(Looper.myLooper()), v0.f7159b);
            this.f9914b.prepare();
            try {
                this.f9914b.E(i9, bArr);
                eVar.v((InterfaceC1058o) AbstractC1684a.e(this.f9914b.c(this.f9917e, c0936z0)));
            } catch (Throwable th) {
                this.f9914b.release();
                throw th;
            }
        } catch (Throwable th2) {
            eVar.w(th2);
        }
    }

    public final /* synthetic */ void j(InterfaceC1058o interfaceC1058o, y5.e eVar) {
        try {
            InterfaceC1058o.a error = interfaceC1058o.getError();
            if (interfaceC1058o.getState() == 1) {
                interfaceC1058o.f(this.f9917e);
                this.f9914b.release();
            }
            eVar.v(error);
        } catch (Throwable th) {
            eVar.w(th);
            interfaceC1058o.f(this.f9917e);
            this.f9914b.release();
        }
    }

    public final /* synthetic */ void k(y5.e eVar, InterfaceC1058o interfaceC1058o) {
        try {
            eVar.v(interfaceC1058o.c());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final /* synthetic */ void l(y5.e eVar) {
        try {
            this.f9914b.release();
            eVar.v(null);
        } catch (Throwable th) {
            eVar.w(th);
        }
    }

    public void n() {
        this.f9915c.quit();
    }

    public final void o() {
        final y5.e eVarX = y5.e.x();
        this.f9916d.post(new Runnable() { // from class: V2.S
            @Override // java.lang.Runnable
            public final void run() {
                this.f9902a.l(eVarX);
            }
        });
        try {
            eVarX.get();
        } catch (InterruptedException | ExecutionException e9) {
            throw new IllegalStateException(e9);
        }
    }
}
