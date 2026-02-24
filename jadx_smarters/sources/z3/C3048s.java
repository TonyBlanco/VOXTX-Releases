package z3;

import A3.d;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import b4.InterfaceC1224o;
import c4.C1257c;
import c4.InterfaceC1255a;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import z3.InterfaceC3021A;

/* JADX INFO: renamed from: z3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3048s {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final A3.c f52756q = new A3.c(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f52757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3029I f52758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f52759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f52760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d.c f52761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f52762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f52764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f52765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f52766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f52767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f52768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f52769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f52770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f52771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public A3.d f52772p;

    /* JADX INFO: renamed from: z3.s$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C3032c f52773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f52774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f52775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Exception f52776d;

        public b(C3032c c3032c, boolean z9, List list, Exception exc) {
            this.f52773a = c3032c;
            this.f52774b = z9;
            this.f52775c = list;
            this.f52776d = exc;
        }
    }

    /* JADX INFO: renamed from: z3.s$c */
    public static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f52777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HandlerThread f52778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC3029I f52779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC3022B f52780d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Handler f52781e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList f52782f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HashMap f52783g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f52784h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f52785i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f52786j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f52787k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52788l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f52789m;

        public c(HandlerThread handlerThread, InterfaceC3029I interfaceC3029I, InterfaceC3022B interfaceC3022B, Handler handler, int i9, int i10, boolean z9) {
            super(handlerThread.getLooper());
            this.f52778b = handlerThread;
            this.f52779c = interfaceC3029I;
            this.f52780d = interfaceC3022B;
            this.f52781e = handler;
            this.f52786j = i9;
            this.f52787k = i10;
            this.f52785i = z9;
            this.f52782f = new ArrayList();
            this.f52783g = new HashMap();
        }

        public static int d(C3032c c3032c, C3032c c3032c2) {
            return k0.p(c3032c.f52716c, c3032c2.f52716c);
        }

        public static C3032c e(C3032c c3032c, int i9, int i10) {
            return new C3032c(c3032c.f52714a, i9, c3032c.f52716c, System.currentTimeMillis(), c3032c.f52718e, i10, 0, c3032c.f52721h);
        }

        public final void A(e eVar) {
            if (eVar != null) {
                AbstractC1684a.g(!eVar.f52793e);
                eVar.f(false);
            }
        }

        public final void B() {
            int i9 = 0;
            for (int i10 = 0; i10 < this.f52782f.size(); i10++) {
                C3032c c3032c = (C3032c) this.f52782f.get(i10);
                e eVarY = (e) this.f52783g.get(c3032c.f52714a.f52801a);
                int i11 = c3032c.f52715b;
                if (i11 == 0) {
                    eVarY = y(eVarY, c3032c);
                } else if (i11 == 1) {
                    A(eVarY);
                } else if (i11 == 2) {
                    AbstractC1684a.e(eVarY);
                    x(eVarY, c3032c, i9);
                } else {
                    if (i11 != 5 && i11 != 7) {
                        throw new IllegalStateException();
                    }
                    z(eVarY, c3032c);
                }
                if (eVarY != null && !eVarY.f52793e) {
                    i9++;
                }
            }
        }

        public final void C() {
            for (int i9 = 0; i9 < this.f52782f.size(); i9++) {
                C3032c c3032c = (C3032c) this.f52782f.get(i9);
                if (c3032c.f52715b == 2) {
                    try {
                        this.f52779c.e(c3032c);
                    } catch (IOException e9) {
                        AbstractC1681B.e("DownloadManager", "Failed to update index.", e9);
                    }
                }
            }
            sendEmptyMessageDelayed(11, 5000L);
        }

        public final void b(C3052w c3052w, int i9) {
            C3032c c3032cF = f(c3052w.f52801a, true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c3032cF != null) {
                m(C3048s.n(c3032cF, c3052w, i9, jCurrentTimeMillis));
            } else {
                m(new C3032c(c3052w, i9 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i9, 0));
            }
            B();
        }

        public final boolean c() {
            return !this.f52785i && this.f52784h == 0;
        }

        public final C3032c f(String str, boolean z9) {
            int iG = g(str);
            if (iG != -1) {
                return (C3032c) this.f52782f.get(iG);
            }
            if (!z9) {
                return null;
            }
            try {
                return this.f52779c.h(str);
            } catch (IOException e9) {
                AbstractC1681B.e("DownloadManager", "Failed to load download: " + str, e9);
                return null;
            }
        }

        public final int g(String str) {
            for (int i9 = 0; i9 < this.f52782f.size(); i9++) {
                if (((C3032c) this.f52782f.get(i9)).f52714a.f52801a.equals(str)) {
                    return i9;
                }
            }
            return -1;
        }

        public final void h(int i9) {
            this.f52784h = i9;
            InterfaceC3034e interfaceC3034eD = null;
            try {
                try {
                    this.f52779c.g();
                    interfaceC3034eD = this.f52779c.d(0, 1, 2, 5, 7);
                    while (interfaceC3034eD.a0()) {
                        this.f52782f.add(interfaceC3034eD.J());
                    }
                } catch (IOException e9) {
                    AbstractC1681B.e("DownloadManager", "Failed to load index.", e9);
                    this.f52782f.clear();
                }
                this.f52781e.obtainMessage(0, new ArrayList(this.f52782f)).sendToTarget();
                B();
            } finally {
                k0.o(interfaceC3034eD);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = 0;
            switch (message.what) {
                case 0:
                    h(message.arg1);
                    i9 = 1;
                    this.f52781e.obtainMessage(1, i9, this.f52783g.size()).sendToTarget();
                    return;
                case 1:
                    r(message.arg1 != 0);
                    i9 = 1;
                    this.f52781e.obtainMessage(1, i9, this.f52783g.size()).sendToTarget();
                    return;
                case 2:
                    u(message.arg1);
                    i9 = 1;
                    this.f52781e.obtainMessage(1, i9, this.f52783g.size()).sendToTarget();
                    return;
                case 3:
                    v((String) message.obj, message.arg1);
                    i9 = 1;
                    this.f52781e.obtainMessage(1, i9, this.f52783g.size()).sendToTarget();
                    return;
                case 4:
                    s(message.arg1);
                    i9 = 1;
                    this.f52781e.obtainMessage(1, i9, this.f52783g.size()).sendToTarget();
                    return;
                case 5:
                    t(message.arg1);
                    i9 = 1;
                    this.f52781e.obtainMessage(1, i9, this.f52783g.size()).sendToTarget();
                    return;
                case 6:
                    b((C3052w) message.obj, message.arg1);
                    i9 = 1;
                    this.f52781e.obtainMessage(1, i9, this.f52783g.size()).sendToTarget();
                    return;
                case 7:
                    q((String) message.obj);
                    i9 = 1;
                    this.f52781e.obtainMessage(1, i9, this.f52783g.size()).sendToTarget();
                    return;
                case 8:
                    p();
                    i9 = 1;
                    this.f52781e.obtainMessage(1, i9, this.f52783g.size()).sendToTarget();
                    return;
                case 9:
                    l((e) message.obj);
                    this.f52781e.obtainMessage(1, i9, this.f52783g.size()).sendToTarget();
                    return;
                case 10:
                    i((e) message.obj, k0.t1(message.arg1, message.arg2));
                    return;
                case 11:
                    C();
                    return;
                case 12:
                    o();
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        public final void i(e eVar, long j9) {
            C3032c c3032c = (C3032c) AbstractC1684a.e(f(eVar.f52790a.f52801a, false));
            if (j9 == c3032c.f52718e || j9 == -1) {
                return;
            }
            m(new C3032c(c3032c.f52714a, c3032c.f52715b, c3032c.f52716c, System.currentTimeMillis(), j9, c3032c.f52719f, c3032c.f52720g, c3032c.f52721h));
        }

        public final void j(C3032c c3032c, Exception exc) {
            C3032c c3032c2 = new C3032c(c3032c.f52714a, exc == null ? 3 : 4, c3032c.f52716c, System.currentTimeMillis(), c3032c.f52718e, c3032c.f52719f, exc == null ? 0 : 1, c3032c.f52721h);
            this.f52782f.remove(g(c3032c2.f52714a.f52801a));
            try {
                this.f52779c.e(c3032c2);
            } catch (IOException e9) {
                AbstractC1681B.e("DownloadManager", "Failed to update index.", e9);
            }
            this.f52781e.obtainMessage(2, new b(c3032c2, false, new ArrayList(this.f52782f), exc)).sendToTarget();
        }

        public final void k(C3032c c3032c) {
            if (c3032c.f52715b == 7) {
                int i9 = c3032c.f52719f;
                n(c3032c, i9 == 0 ? 0 : 1, i9);
                B();
            } else {
                this.f52782f.remove(g(c3032c.f52714a.f52801a));
                try {
                    this.f52779c.b(c3032c.f52714a.f52801a);
                } catch (IOException unused) {
                    AbstractC1681B.d("DownloadManager", "Failed to remove from database");
                }
                this.f52781e.obtainMessage(2, new b(c3032c, true, new ArrayList(this.f52782f), null)).sendToTarget();
            }
        }

        public final void l(e eVar) {
            String str = eVar.f52790a.f52801a;
            this.f52783g.remove(str);
            boolean z9 = eVar.f52793e;
            if (z9) {
                this.f52789m = false;
            } else {
                int i9 = this.f52788l - 1;
                this.f52788l = i9;
                if (i9 == 0) {
                    removeMessages(11);
                }
            }
            if (eVar.f52796h) {
                B();
                return;
            }
            Exception exc = eVar.f52797i;
            if (exc != null) {
                AbstractC1681B.e("DownloadManager", "Task failed: " + eVar.f52790a + ", " + z9, exc);
            }
            C3032c c3032c = (C3032c) AbstractC1684a.e(f(str, false));
            int i10 = c3032c.f52715b;
            if (i10 == 2) {
                AbstractC1684a.g(!z9);
                j(c3032c, exc);
            } else {
                if (i10 != 5 && i10 != 7) {
                    throw new IllegalStateException();
                }
                AbstractC1684a.g(z9);
                k(c3032c);
            }
            B();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:7)(1:6)|8|(1:10)(8:12|(1:15)|16|(1:18)|25|19|23|24)|11|25|19|23|24) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        
            d4.AbstractC1681B.e("DownloadManager", "Failed to update index.", r0);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final z3.C3032c m(z3.C3032c r9) {
            /*
                r8 = this;
                int r0 = r9.f52715b
                r1 = 3
                r2 = 1
                r3 = 0
                if (r0 == r1) goto Lc
                r1 = 4
                if (r0 == r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                d4.AbstractC1684a.g(r0)
                z3.w r0 = r9.f52714a
                java.lang.String r0 = r0.f52801a
                int r0 = r8.g(r0)
                r1 = -1
                if (r0 != r1) goto L2b
                java.util.ArrayList r0 = r8.f52782f
                r0.add(r9)
                java.util.ArrayList r0 = r8.f52782f
                z3.t r1 = new z3.t
                r1.<init>()
            L27:
                java.util.Collections.sort(r0, r1)
                goto L4c
            L2b:
                long r4 = r9.f52716c
                java.util.ArrayList r1 = r8.f52782f
                java.lang.Object r1 = r1.get(r0)
                z3.c r1 = (z3.C3032c) r1
                long r6 = r1.f52716c
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 == 0) goto L3c
                goto L3d
            L3c:
                r2 = 0
            L3d:
                java.util.ArrayList r1 = r8.f52782f
                r1.set(r0, r9)
                if (r2 == 0) goto L4c
                java.util.ArrayList r0 = r8.f52782f
                z3.t r1 = new z3.t
                r1.<init>()
                goto L27
            L4c:
                z3.I r0 = r8.f52779c     // Catch: java.io.IOException -> L52
                r0.e(r9)     // Catch: java.io.IOException -> L52
                goto L5a
            L52:
                r0 = move-exception
                java.lang.String r1 = "DownloadManager"
                java.lang.String r2 = "Failed to update index."
                d4.AbstractC1681B.e(r1, r2, r0)
            L5a:
                z3.s$b r0 = new z3.s$b
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.ArrayList r2 = r8.f52782f
                r1.<init>(r2)
                r2 = 0
                r0.<init>(r9, r3, r1, r2)
                android.os.Handler r1 = r8.f52781e
                r2 = 2
                android.os.Message r0 = r1.obtainMessage(r2, r0)
                r0.sendToTarget()
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: z3.C3048s.c.m(z3.c):z3.c");
        }

        public final C3032c n(C3032c c3032c, int i9, int i10) {
            AbstractC1684a.g((i9 == 3 || i9 == 4) ? false : true);
            return m(e(c3032c, i9, i10));
        }

        public final void o() {
            Iterator it = this.f52783g.values().iterator();
            while (it.hasNext()) {
                ((e) it.next()).f(true);
            }
            try {
                this.f52779c.g();
            } catch (IOException e9) {
                AbstractC1681B.e("DownloadManager", "Failed to update index.", e9);
            }
            this.f52782f.clear();
            this.f52778b.quit();
            synchronized (this) {
                this.f52777a = true;
                notifyAll();
            }
        }

        public final void p() {
            ArrayList arrayList = new ArrayList();
            try {
                InterfaceC3034e interfaceC3034eD = this.f52779c.d(3, 4);
                while (interfaceC3034eD.a0()) {
                    try {
                        arrayList.add(interfaceC3034eD.J());
                    } finally {
                    }
                }
                interfaceC3034eD.close();
            } catch (IOException unused) {
                AbstractC1681B.d("DownloadManager", "Failed to load downloads.");
            }
            for (int i9 = 0; i9 < this.f52782f.size(); i9++) {
                ArrayList arrayList2 = this.f52782f;
                arrayList2.set(i9, e((C3032c) arrayList2.get(i9), 5, 0));
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                this.f52782f.add(e((C3032c) arrayList.get(i10), 5, 0));
            }
            Collections.sort(this.f52782f, new C3049t());
            try {
                this.f52779c.f();
            } catch (IOException e9) {
                AbstractC1681B.e("DownloadManager", "Failed to update index.", e9);
            }
            ArrayList arrayList3 = new ArrayList(this.f52782f);
            for (int i11 = 0; i11 < this.f52782f.size(); i11++) {
                this.f52781e.obtainMessage(2, new b((C3032c) this.f52782f.get(i11), false, arrayList3, null)).sendToTarget();
            }
            B();
        }

        public final void q(String str) {
            C3032c c3032cF = f(str, true);
            if (c3032cF != null) {
                n(c3032cF, 5, 0);
                B();
            } else {
                AbstractC1681B.d("DownloadManager", "Failed to remove nonexistent download: " + str);
            }
        }

        public final void r(boolean z9) {
            this.f52785i = z9;
            B();
        }

        public final void s(int i9) {
            this.f52786j = i9;
            B();
        }

        public final void t(int i9) {
            this.f52787k = i9;
        }

        public final void u(int i9) {
            this.f52784h = i9;
            B();
        }

        public final void v(String str, int i9) {
            if (str == null) {
                for (int i10 = 0; i10 < this.f52782f.size(); i10++) {
                    w((C3032c) this.f52782f.get(i10), i9);
                }
                try {
                    this.f52779c.c(i9);
                } catch (IOException e9) {
                    AbstractC1681B.e("DownloadManager", "Failed to set manual stop reason", e9);
                }
            } else {
                C3032c c3032cF = f(str, false);
                if (c3032cF != null) {
                    w(c3032cF, i9);
                } else {
                    try {
                        this.f52779c.a(str, i9);
                    } catch (IOException e10) {
                        AbstractC1681B.e("DownloadManager", "Failed to set manual stop reason: " + str, e10);
                    }
                }
            }
            B();
        }

        public final void w(C3032c c3032c, int i9) {
            if (i9 == 0) {
                if (c3032c.f52715b == 1) {
                    n(c3032c, 0, 0);
                }
            } else if (i9 != c3032c.f52719f) {
                int i10 = c3032c.f52715b;
                if (i10 == 0 || i10 == 2) {
                    i10 = 1;
                }
                m(new C3032c(c3032c.f52714a, i10, c3032c.f52716c, System.currentTimeMillis(), c3032c.f52718e, i9, 0, c3032c.f52721h));
            }
        }

        public final void x(e eVar, C3032c c3032c, int i9) {
            AbstractC1684a.g(!eVar.f52793e);
            if (!c() || i9 >= this.f52786j) {
                n(c3032c, 0, 0);
                eVar.f(false);
            }
        }

        public final e y(e eVar, C3032c c3032c) {
            if (eVar != null) {
                AbstractC1684a.g(!eVar.f52793e);
                eVar.f(false);
                return eVar;
            }
            if (!c() || this.f52788l >= this.f52786j) {
                return null;
            }
            C3032c c3032cN = n(c3032c, 2, 0);
            e eVar2 = new e(c3032cN.f52714a, this.f52780d.a(c3032cN.f52714a), c3032cN.f52721h, false, this.f52787k, this);
            this.f52783g.put(c3032cN.f52714a.f52801a, eVar2);
            int i9 = this.f52788l;
            this.f52788l = i9 + 1;
            if (i9 == 0) {
                sendEmptyMessageDelayed(11, 5000L);
            }
            eVar2.start();
            return eVar2;
        }

        public final void z(e eVar, C3032c c3032c) {
            if (eVar != null) {
                if (eVar.f52793e) {
                    return;
                }
                eVar.f(false);
            } else {
                if (this.f52789m) {
                    return;
                }
                e eVar2 = new e(c3032c.f52714a, this.f52780d.a(c3032c.f52714a), c3032c.f52721h, true, this.f52787k, this);
                this.f52783g.put(c3032c.f52714a.f52801a, eVar2);
                this.f52789m = true;
                eVar2.start();
            }
        }
    }

    /* JADX INFO: renamed from: z3.s$d */
    public interface d {
        void a(C3048s c3048s, C3032c c3032c, Exception exc);

        void b(C3048s c3048s, A3.c cVar, int i9);

        void c(C3048s c3048s);

        void d(C3048s c3048s, C3032c c3032c);

        void e(C3048s c3048s, boolean z9);

        void f(C3048s c3048s, boolean z9);

        void g(C3048s c3048s);
    }

    /* JADX INFO: renamed from: z3.s$e */
    public static class e extends Thread implements InterfaceC3021A.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C3052w f52790a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC3021A f52791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C3051v f52792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f52793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f52794f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile c f52795g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f52796h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Exception f52797i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f52798j;

        public e(C3052w c3052w, InterfaceC3021A interfaceC3021A, C3051v c3051v, boolean z9, int i9, c cVar) {
            this.f52790a = c3052w;
            this.f52791c = interfaceC3021A;
            this.f52792d = c3051v;
            this.f52793e = z9;
            this.f52794f = i9;
            this.f52795g = cVar;
            this.f52798j = -1L;
        }

        public static int g(int i9) {
            return Math.min((i9 - 1) * 1000, 5000);
        }

        @Override // z3.InterfaceC3021A.a
        public void a(long j9, long j10, float f9) {
            this.f52792d.f52799a = j10;
            this.f52792d.f52800b = f9;
            if (j9 != this.f52798j) {
                this.f52798j = j9;
                c cVar = this.f52795g;
                if (cVar != null) {
                    cVar.obtainMessage(10, (int) (j9 >> 32), (int) j9, this).sendToTarget();
                }
            }
        }

        public void f(boolean z9) {
            if (z9) {
                this.f52795g = null;
            }
            if (this.f52796h) {
                return;
            }
            this.f52796h = true;
            this.f52791c.cancel();
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.f52793e) {
                    this.f52791c.remove();
                } else {
                    long j9 = -1;
                    int i9 = 0;
                    while (!this.f52796h) {
                        try {
                            this.f52791c.a(this);
                            break;
                        } catch (IOException e9) {
                            if (!this.f52796h) {
                                long j10 = this.f52792d.f52799a;
                                if (j10 != j9) {
                                    j9 = j10;
                                    i9 = 0;
                                }
                                i9++;
                                if (i9 > this.f52794f) {
                                    throw e9;
                                }
                                Thread.sleep(g(i9));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e10) {
                this.f52797i = e10;
            }
            c cVar = this.f52795g;
            if (cVar != null) {
                cVar.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    public C3048s(Context context, T2.b bVar, InterfaceC1255a interfaceC1255a, InterfaceC1224o.a aVar, Executor executor) {
        this(context, new C3030a(bVar), new C3031b(new C1257c.C0215c().i(interfaceC1255a).l(aVar), executor));
    }

    public C3048s(Context context, InterfaceC3029I interfaceC3029I, InterfaceC3022B interfaceC3022B) {
        this.f52757a = context.getApplicationContext();
        this.f52758b = interfaceC3029I;
        this.f52767k = 3;
        this.f52768l = 5;
        this.f52766j = true;
        this.f52771o = Collections.emptyList();
        this.f52762f = new CopyOnWriteArraySet();
        Handler handlerA = k0.A(new Handler.Callback() { // from class: z3.q
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f52754a.j(message);
            }
        });
        this.f52759c = handlerA;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        c cVar = new c(handlerThread, interfaceC3029I, interfaceC3022B, handlerA, this.f52767k, this.f52768l, this.f52766j);
        this.f52760d = cVar;
        d.c cVar2 = new d.c() { // from class: z3.r
            @Override // A3.d.c
            public final void a(A3.d dVar, int i9) {
                this.f52755a.s(dVar, i9);
            }
        };
        this.f52761e = cVar2;
        A3.d dVar = new A3.d(context, cVar2, f52756q);
        this.f52772p = dVar;
        int i9 = dVar.i();
        this.f52769m = i9;
        this.f52763g = 1;
        cVar.obtainMessage(0, i9, 0).sendToTarget();
    }

    public static C3032c n(C3032c c3032c, C3052w c3052w, int i9, long j9) {
        int i10 = c3032c.f52715b;
        return new C3032c(c3032c.f52714a.c(c3052w), (i10 == 5 || i10 == 7) ? 7 : i9 != 0 ? 1 : 0, (i10 == 5 || c3032c.c()) ? j9 : c3032c.f52716c, j9, -1L, i9, 0);
    }

    public void A(String str, int i9) {
        this.f52763g++;
        this.f52760d.obtainMessage(3, i9, 0, str).sendToTarget();
    }

    public final boolean B() {
        boolean z9;
        if (this.f52766j || this.f52769m == 0) {
            z9 = false;
        } else {
            for (int i9 = 0; i9 < this.f52771o.size(); i9++) {
                if (((C3032c) this.f52771o.get(i9)).f52715b == 0) {
                    z9 = true;
                    break;
                }
            }
            z9 = false;
        }
        boolean z10 = this.f52770n != z9;
        this.f52770n = z9;
        return z10;
    }

    public void c(C3052w c3052w, int i9) {
        this.f52763g++;
        this.f52760d.obtainMessage(6, i9, 0, c3052w).sendToTarget();
    }

    public void d(d dVar) {
        AbstractC1684a.e(dVar);
        this.f52762f.add(dVar);
    }

    public List e() {
        return this.f52771o;
    }

    public InterfaceC3045p f() {
        return this.f52758b;
    }

    public boolean g() {
        return this.f52766j;
    }

    public int h() {
        return this.f52769m;
    }

    public A3.c i() {
        return this.f52772p.f();
    }

    public final boolean j(Message message) {
        int i9 = message.what;
        if (i9 == 0) {
            q((List) message.obj);
        } else if (i9 == 1) {
            r(message.arg1, message.arg2);
        } else {
            if (i9 != 2) {
                throw new IllegalStateException();
            }
            p((b) message.obj);
        }
        return true;
    }

    public boolean k() {
        return this.f52764h == 0 && this.f52763g == 0;
    }

    public boolean l() {
        return this.f52765i;
    }

    public boolean m() {
        return this.f52770n;
    }

    public final void o() {
        Iterator it = this.f52762f.iterator();
        while (it.hasNext()) {
            ((d) it.next()).f(this, this.f52770n);
        }
    }

    public final void p(b bVar) {
        this.f52771o = Collections.unmodifiableList(bVar.f52775c);
        C3032c c3032c = bVar.f52773a;
        boolean zB = B();
        if (bVar.f52774b) {
            Iterator it = this.f52762f.iterator();
            while (it.hasNext()) {
                ((d) it.next()).d(this, c3032c);
            }
        } else {
            Iterator it2 = this.f52762f.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).a(this, c3032c, bVar.f52776d);
            }
        }
        if (zB) {
            o();
        }
    }

    public final void q(List list) {
        this.f52765i = true;
        this.f52771o = Collections.unmodifiableList(list);
        boolean zB = B();
        Iterator it = this.f52762f.iterator();
        while (it.hasNext()) {
            ((d) it.next()).g(this);
        }
        if (zB) {
            o();
        }
    }

    public final void r(int i9, int i10) {
        this.f52763g -= i9;
        this.f52764h = i10;
        if (k()) {
            Iterator it = this.f52762f.iterator();
            while (it.hasNext()) {
                ((d) it.next()).c(this);
            }
        }
    }

    public final void s(A3.d dVar, int i9) {
        A3.c cVarF = dVar.f();
        if (this.f52769m != i9) {
            this.f52769m = i9;
            this.f52763g++;
            this.f52760d.obtainMessage(2, i9, 0).sendToTarget();
        }
        boolean zB = B();
        Iterator it = this.f52762f.iterator();
        while (it.hasNext()) {
            ((d) it.next()).b(this, cVarF, i9);
        }
        if (zB) {
            o();
        }
    }

    public void t() {
        x(true);
    }

    public void u() {
        this.f52763g++;
        this.f52760d.obtainMessage(8).sendToTarget();
    }

    public void v(String str) {
        this.f52763g++;
        this.f52760d.obtainMessage(7, str).sendToTarget();
    }

    public void w() {
        x(false);
    }

    public final void x(boolean z9) {
        if (this.f52766j == z9) {
            return;
        }
        this.f52766j = z9;
        this.f52763g++;
        this.f52760d.obtainMessage(1, z9 ? 1 : 0, 0).sendToTarget();
        boolean zB = B();
        Iterator it = this.f52762f.iterator();
        while (it.hasNext()) {
            ((d) it.next()).e(this, z9);
        }
        if (zB) {
            o();
        }
    }

    public void y(int i9) {
        AbstractC1684a.a(i9 > 0);
        if (this.f52767k == i9) {
            return;
        }
        this.f52767k = i9;
        this.f52763g++;
        this.f52760d.obtainMessage(4, i9, 0).sendToTarget();
    }

    public void z(A3.c cVar) {
        if (cVar.equals(this.f52772p.f())) {
            return;
        }
        this.f52772p.j();
        A3.d dVar = new A3.d(this.f52757a, this.f52761e, cVar);
        this.f52772p = dVar;
        s(this.f52772p, dVar.i());
    }
}
