package V2;

import B3.C0512u;
import B3.C0515x;
import O2.AbstractC0904o;
import P2.v0;
import V2.G;
import V2.InterfaceC1058o;
import V2.InterfaceC1065w;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import b4.F;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.C1693j;
import d4.InterfaceC1692i;
import d4.k0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: V2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1050g implements InterfaceC1058o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f9923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f9924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f9925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f9929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1693j f9930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b4.F f9931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v0 f9932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final O f9933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UUID f9934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Looper f9935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f9936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HandlerThread f9939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f9940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CryptoConfig f9941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC1058o.a f9942u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f9943v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f9944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public G.a f9945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public G.d f9946y;

    /* JADX INFO: renamed from: V2.g$a */
    public interface a {
        void a(C1050g c1050g);

        void b(Exception exc, boolean z9);

        void c();
    }

    /* JADX INFO: renamed from: V2.g$b */
    public interface b {
        void a(C1050g c1050g, int i9);

        void b(C1050g c1050g, int i9);
    }

    /* JADX INFO: renamed from: V2.g$c */
    public class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f9947a;

        public c(Looper looper) {
            super(looper);
        }

        public final boolean a(Message message, P p9) {
            d dVar = (d) message.obj;
            if (!dVar.f9950b) {
                return false;
            }
            int i9 = dVar.f9953e + 1;
            dVar.f9953e = i9;
            if (i9 > C1050g.this.f9931j.b(3)) {
                return false;
            }
            long jC = C1050g.this.f9931j.c(new F.c(new C0512u(dVar.f9949a, p9.f9895a, p9.f9896c, p9.f9897d, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f9951c, p9.f9898e), new C0515x(3), p9.getCause() instanceof IOException ? (IOException) p9.getCause() : new f(p9.getCause()), dVar.f9953e));
            if (jC == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f9947a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jC);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b(int i9, Object obj, boolean z9) {
            obtainMessage(i9, new d(C0512u.a(), z9, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f9947a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objA;
            d dVar = (d) message.obj;
            try {
                int i9 = message.what;
                if (i9 == 0) {
                    objA = C1050g.this.f9933l.a(C1050g.this.f9934m, (G.d) dVar.f9952d);
                } else {
                    if (i9 != 1) {
                        throw new RuntimeException();
                    }
                    objA = C1050g.this.f9933l.b(C1050g.this.f9934m, (G.a) dVar.f9952d);
                }
            } catch (P e9) {
                boolean zA = a(message, e9);
                objA = e9;
                if (zA) {
                    return;
                }
            } catch (Exception e10) {
                AbstractC1681B.k("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e10);
                objA = e10;
            }
            C1050g.this.f9931j.d(dVar.f9949a);
            synchronized (this) {
                try {
                    if (!this.f9947a) {
                        C1050g.this.f9936o.obtainMessage(message.what, Pair.create(dVar.f9952d, objA)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: V2.g$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f9952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9953e;

        public d(long j9, boolean z9, long j10, Object obj) {
            this.f9949a = j9;
            this.f9950b = z9;
            this.f9951c = j10;
            this.f9952d = obj;
        }
    }

    /* JADX INFO: renamed from: V2.g$e */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i9 = message.what;
            if (i9 == 0) {
                C1050g.this.E(obj, obj2);
            } else {
                if (i9 != 1) {
                    return;
                }
                C1050g.this.y(obj, obj2);
            }
        }
    }

    /* JADX INFO: renamed from: V2.g$f */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public C1050g(UUID uuid, G g9, a aVar, b bVar, List list, int i9, boolean z9, boolean z10, byte[] bArr, HashMap map, O o9, Looper looper, b4.F f9, v0 v0Var) {
        List listUnmodifiableList;
        if (i9 == 1 || i9 == 3) {
            AbstractC1684a.e(bArr);
        }
        this.f9934m = uuid;
        this.f9924c = aVar;
        this.f9925d = bVar;
        this.f9923b = g9;
        this.f9926e = i9;
        this.f9927f = z9;
        this.f9928g = z10;
        if (bArr != null) {
            this.f9944w = bArr;
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList((List) AbstractC1684a.e(list));
        }
        this.f9922a = listUnmodifiableList;
        this.f9929h = map;
        this.f9933l = o9;
        this.f9930i = new C1693j();
        this.f9931j = f9;
        this.f9932k = v0Var;
        this.f9937p = 2;
        this.f9935n = looper;
        this.f9936o = new e(looper);
    }

    public final void A() {
        if (this.f9926e == 0 && this.f9937p == 4) {
            k0.j(this.f9943v);
            r(false);
        }
    }

    public void B(int i9) {
        if (i9 != 2) {
            return;
        }
        A();
    }

    public void C() {
        if (F()) {
            r(true);
        }
    }

    public void D(Exception exc, boolean z9) {
        x(exc, z9 ? 1 : 3);
    }

    public final void E(Object obj, Object obj2) {
        if (obj == this.f9946y) {
            if (this.f9937p == 2 || u()) {
                this.f9946y = null;
                if (obj2 instanceof Exception) {
                    this.f9924c.b((Exception) obj2, false);
                    return;
                }
                try {
                    this.f9923b.g((byte[]) obj2);
                    this.f9924c.c();
                } catch (Exception e9) {
                    this.f9924c.b(e9, true);
                }
            }
        }
    }

    public final boolean F() {
        if (u()) {
            return true;
        }
        try {
            byte[] bArrC = this.f9923b.c();
            this.f9943v = bArrC;
            this.f9923b.e(bArrC, this.f9932k);
            this.f9941t = this.f9923b.i(this.f9943v);
            final int i9 = 3;
            this.f9937p = 3;
            q(new InterfaceC1692i() { // from class: V2.b
                @Override // d4.InterfaceC1692i
                public final void accept(Object obj) {
                    ((InterfaceC1065w.a) obj).k(i9);
                }
            });
            AbstractC1684a.e(this.f9943v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f9924c.a(this);
            return false;
        } catch (Exception e9) {
            x(e9, 1);
            return false;
        }
    }

    public final void G(byte[] bArr, int i9, boolean z9) {
        try {
            this.f9945x = this.f9923b.m(bArr, this.f9922a, i9, this.f9929h);
            ((c) k0.j(this.f9940s)).b(1, AbstractC1684a.e(this.f9945x), z9);
        } catch (Exception e9) {
            z(e9, true);
        }
    }

    public void H() {
        this.f9946y = this.f9923b.b();
        ((c) k0.j(this.f9940s)).b(0, AbstractC1684a.e(this.f9946y), true);
    }

    public final boolean I() {
        try {
            this.f9923b.f(this.f9943v, this.f9944w);
            return true;
        } catch (Exception e9) {
            x(e9, 1);
            return false;
        }
    }

    public final void J() {
        if (Thread.currentThread() != this.f9935n.getThread()) {
            AbstractC1681B.k("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f9935n.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // V2.InterfaceC1058o
    public final UUID a() {
        J();
        return this.f9934m;
    }

    @Override // V2.InterfaceC1058o
    public boolean b() {
        J();
        return this.f9927f;
    }

    @Override // V2.InterfaceC1058o
    public byte[] c() {
        J();
        return this.f9944w;
    }

    @Override // V2.InterfaceC1058o
    public final CryptoConfig d() {
        J();
        return this.f9941t;
    }

    @Override // V2.InterfaceC1058o
    public Map e() {
        J();
        byte[] bArr = this.f9943v;
        if (bArr == null) {
            return null;
        }
        return this.f9923b.a(bArr);
    }

    @Override // V2.InterfaceC1058o
    public void f(InterfaceC1065w.a aVar) {
        J();
        int i9 = this.f9938q;
        if (i9 <= 0) {
            AbstractC1681B.d("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i9 - 1;
        this.f9938q = i10;
        if (i10 == 0) {
            this.f9937p = 0;
            ((e) k0.j(this.f9936o)).removeCallbacksAndMessages(null);
            ((c) k0.j(this.f9940s)).c();
            this.f9940s = null;
            ((HandlerThread) k0.j(this.f9939r)).quit();
            this.f9939r = null;
            this.f9941t = null;
            this.f9942u = null;
            this.f9945x = null;
            this.f9946y = null;
            byte[] bArr = this.f9943v;
            if (bArr != null) {
                this.f9923b.k(bArr);
                this.f9943v = null;
            }
        }
        if (aVar != null) {
            this.f9930i.c(aVar);
            if (this.f9930i.b(aVar) == 0) {
                aVar.m();
            }
        }
        this.f9925d.b(this, this.f9938q);
    }

    @Override // V2.InterfaceC1058o
    public void g(InterfaceC1065w.a aVar) {
        J();
        if (this.f9938q < 0) {
            AbstractC1681B.d("DefaultDrmSession", "Session reference count less than zero: " + this.f9938q);
            this.f9938q = 0;
        }
        if (aVar != null) {
            this.f9930i.a(aVar);
        }
        int i9 = this.f9938q + 1;
        this.f9938q = i9;
        if (i9 == 1) {
            AbstractC1684a.g(this.f9937p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f9939r = handlerThread;
            handlerThread.start();
            this.f9940s = new c(this.f9939r.getLooper());
            if (F()) {
                r(true);
            }
        } else if (aVar != null && u() && this.f9930i.b(aVar) == 1) {
            aVar.k(this.f9937p);
        }
        this.f9925d.a(this, this.f9938q);
    }

    @Override // V2.InterfaceC1058o
    public final InterfaceC1058o.a getError() {
        J();
        if (this.f9937p == 1) {
            return this.f9942u;
        }
        return null;
    }

    @Override // V2.InterfaceC1058o
    public final int getState() {
        J();
        return this.f9937p;
    }

    @Override // V2.InterfaceC1058o
    public boolean h(String str) {
        J();
        return this.f9923b.j((byte[]) AbstractC1684a.i(this.f9943v), str);
    }

    public final void q(InterfaceC1692i interfaceC1692i) {
        Iterator it = this.f9930i.v().iterator();
        while (it.hasNext()) {
            interfaceC1692i.accept((InterfaceC1065w.a) it.next());
        }
    }

    public final void r(boolean z9) {
        if (this.f9928g) {
            return;
        }
        byte[] bArr = (byte[]) k0.j(this.f9943v);
        int i9 = this.f9926e;
        if (i9 == 0 || i9 == 1) {
            if (this.f9944w == null) {
                G(bArr, 1, z9);
                return;
            }
            if (this.f9937p != 4 && !I()) {
                return;
            }
            long jS = s();
            if (this.f9926e != 0 || jS > 60) {
                if (jS <= 0) {
                    x(new N(), 2);
                    return;
                } else {
                    this.f9937p = 4;
                    q(new InterfaceC1692i() { // from class: V2.c
                        @Override // d4.InterfaceC1692i
                        public final void accept(Object obj) {
                            ((InterfaceC1065w.a) obj).j();
                        }
                    });
                    return;
                }
            }
            AbstractC1681B.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jS);
        } else {
            if (i9 != 2) {
                if (i9 != 3) {
                    return;
                }
                AbstractC1684a.e(this.f9944w);
                AbstractC1684a.e(this.f9943v);
                G(this.f9944w, 3, z9);
                return;
            }
            if (this.f9944w != null && !I()) {
                return;
            }
        }
        G(bArr, 2, z9);
    }

    public final long s() {
        if (!AbstractC0904o.f6140d.equals(this.f9934m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) AbstractC1684a.e(X.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public boolean t(byte[] bArr) {
        J();
        return Arrays.equals(this.f9943v, bArr);
    }

    public final boolean u() {
        int i9 = this.f9937p;
        return i9 == 3 || i9 == 4;
    }

    public final void x(final Exception exc, int i9) {
        this.f9942u = new InterfaceC1058o.a(exc, C.a(exc, i9));
        AbstractC1681B.e("DefaultDrmSession", "DRM session error", exc);
        q(new InterfaceC1692i() { // from class: V2.d
            @Override // d4.InterfaceC1692i
            public final void accept(Object obj) {
                ((InterfaceC1065w.a) obj).l(exc);
            }
        });
        if (this.f9937p != 4) {
            this.f9937p = 1;
        }
    }

    public final void y(Object obj, Object obj2) {
        InterfaceC1692i interfaceC1692i;
        if (obj == this.f9945x && u()) {
            this.f9945x = null;
            if (obj2 instanceof Exception) {
                z((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f9926e == 3) {
                    this.f9923b.l((byte[]) k0.j(this.f9944w), bArr);
                    interfaceC1692i = new InterfaceC1692i() { // from class: V2.e
                        @Override // d4.InterfaceC1692i
                        public final void accept(Object obj3) {
                            ((InterfaceC1065w.a) obj3).i();
                        }
                    };
                } else {
                    byte[] bArrL = this.f9923b.l(this.f9943v, bArr);
                    int i9 = this.f9926e;
                    if ((i9 == 2 || (i9 == 0 && this.f9944w != null)) && bArrL != null && bArrL.length != 0) {
                        this.f9944w = bArrL;
                    }
                    this.f9937p = 4;
                    interfaceC1692i = new InterfaceC1692i() { // from class: V2.f
                        @Override // d4.InterfaceC1692i
                        public final void accept(Object obj3) {
                            ((InterfaceC1065w.a) obj3).h();
                        }
                    };
                }
                q(interfaceC1692i);
            } catch (Exception e9) {
                z(e9, true);
            }
        }
    }

    public final void z(Exception exc, boolean z9) {
        if (exc instanceof NotProvisionedException) {
            this.f9924c.a(this);
        } else {
            x(exc, z9 ? 1 : 2);
        }
    }
}
