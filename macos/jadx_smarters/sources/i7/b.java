package i7;

import android.content.Context;
import android.util.Log;
import android.view.View;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n4.C2284p;
import n4.r;
import o4.C2325b;
import o4.C2328e;
import o4.InterfaceC2347y;
import p4.C2434i;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static b f41904l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41906b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f41907c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2347y f41908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2434i.a f41909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2284p f41912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2284p f41913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f41914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41915k;

    /* JADX INFO: renamed from: i7.b$b, reason: collision with other inner class name */
    public class C0351b extends C2434i.a {
        public C0351b() {
        }

        @Override // p4.C2434i.a
        public void d() {
            r rVarL;
            C2434i c2434iR = b.this.r();
            if (c2434iR == null || (rVarL = c2434iR.l()) == null) {
                return;
            }
            b.this.f41913i = rVarL.Y(rVarL.V());
            Log.d("QueueDataProvider", "onRemoteMediaPreloadStatusUpdated() with item=" + b.this.f41913i);
            if (b.this.f41914j != null) {
                b.this.f41914j.a();
            }
        }

        @Override // p4.C2434i.a
        public void e() {
            o();
            if (b.this.f41914j != null) {
                b.this.f41914j.a();
            }
            Log.d("QueueDataProvider", "Queue was updated");
        }

        @Override // p4.C2434i.a
        public void g() {
            o();
            if (b.this.f41914j != null) {
                b.this.f41914j.a();
            }
        }

        public final void o() {
            List listA0;
            b bVar;
            boolean z9;
            r rVarL;
            C2434i c2434iR = b.this.r();
            if (c2434iR == null || (rVarL = c2434iR.l()) == null) {
                listA0 = null;
            } else {
                listA0 = rVarL.a0();
                b.this.f41910f = rVarL.b0();
                b.this.f41912h = rVarL.Y(rVarL.K());
            }
            b.this.f41906b.clear();
            if (listA0 == null) {
                Log.d("QueueDataProvider", "Queue is cleared");
                return;
            }
            Log.d("QueueDataProvider", "Queue is updated with a list of size: " + listA0.size());
            if (listA0.size() > 0) {
                b.this.f41906b.addAll(listA0);
                bVar = b.this;
                z9 = false;
            } else {
                bVar = b.this;
                z9 = true;
            }
            bVar.f41915k = z9;
        }
    }

    public class c implements InterfaceC2347y {
        public c() {
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSessionEnded(C2328e c2328e, int i9) {
            b.this.j();
            if (b.this.f41914j != null) {
                b.this.f41914j.a();
            }
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSessionEnding(C2328e c2328e) {
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSessionResumeFailed(C2328e c2328e, int i9) {
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSessionResumed(C2328e c2328e, boolean z9) {
            b.this.A();
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSessionResuming(C2328e c2328e, String str) {
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onSessionStartFailed(C2328e c2328e, int i9) {
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onSessionStarted(C2328e c2328e, String str) {
            b.this.A();
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onSessionStarting(C2328e c2328e) {
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onSessionSuspended(C2328e c2328e, int i9) {
        }
    }

    public interface d {
        void a();
    }

    public b(Context context) {
        c cVar = new c();
        this.f41908d = cVar;
        this.f41909e = new C0351b();
        this.f41915k = true;
        Context applicationContext = context.getApplicationContext();
        this.f41905a = applicationContext;
        this.f41910f = 0;
        this.f41911g = false;
        this.f41912h = null;
        C2325b.e(applicationContext).c().a(cVar, C2328e.class);
        A();
    }

    public static synchronized b n(Context context) {
        try {
            if (f41904l == null) {
                f41904l = new b(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f41904l;
    }

    public final void A() {
        List listA0;
        C2434i c2434iR = r();
        if (c2434iR != null) {
            c2434iR.N(this.f41909e);
            r rVarL = c2434iR.l();
            if (rVarL == null || (listA0 = rVarL.a0()) == null || listA0.isEmpty()) {
                return;
            }
            this.f41906b.clear();
            this.f41906b.addAll(listA0);
            this.f41910f = rVarL.b0();
            this.f41912h = rVarL.Y(rVarL.K());
            this.f41915k = false;
            this.f41913i = rVarL.Y(rVarL.V());
        }
    }

    public void j() {
        this.f41906b.clear();
        this.f41915k = true;
        this.f41912h = null;
    }

    public int k() {
        return this.f41906b.size();
    }

    public C2284p l() {
        return this.f41912h;
    }

    public int m() {
        return this.f41912h.K();
    }

    public C2284p o(int i9) {
        return (C2284p) this.f41906b.get(i9);
    }

    public List p() {
        return this.f41906b;
    }

    public int q(int i9) {
        if (this.f41906b.isEmpty()) {
            return -1;
        }
        for (int i10 = 0; i10 < this.f41906b.size(); i10++) {
            if (((C2284p) this.f41906b.get(i10)).K() == i9) {
                return i10;
            }
        }
        return -1;
    }

    public final C2434i r() {
        C2328e c2328eC = C2325b.e(this.f41905a).c().c();
        if (c2328eC != null && c2328eC.c()) {
            return c2328eC.r();
        }
        Log.w("QueueDataProvider", "Trying to get a RemoteMediaClient when no CastSession is started.");
        return null;
    }

    public C2284p s() {
        Log.d("QueueDataProvider", "[upcoming] getUpcomingItem() returning " + this.f41913i);
        return this.f41913i;
    }

    public boolean t() {
        return this.f41915k;
    }

    public void u(int i9, int i10) {
        C2434i c2434iR;
        if (i9 == i10 || (c2434iR = r()) == null) {
            return;
        }
        c2434iR.I(((C2284p) this.f41906b.get(i9)).K(), i10, null);
        this.f41906b.add(i10, (C2284p) this.f41906b.remove(i9));
    }

    public void v(View view, C2284p c2284p) {
        C2434i c2434iR = r();
        if (c2434iR == null) {
            return;
        }
        c2434iR.F(c2284p.K(), null);
    }

    public void w(View view, C2284p c2284p) {
        C2434i c2434iR = r();
        if (c2434iR == null) {
            return;
        }
        int iQ = q(c2284p.K());
        int iK = k() - iQ;
        int[] iArr = new int[iK];
        for (int i9 = 0; i9 < iK; i9++) {
            iArr[i9] = ((C2284p) this.f41906b.get(i9 + iQ)).K();
        }
        c2434iR.M(iArr, null);
    }

    public void x() {
        synchronized (this.f41907c) {
            try {
                if (this.f41906b.isEmpty()) {
                    return;
                }
                C2434i c2434iR = r();
                if (c2434iR == null) {
                    return;
                }
                int[] iArr = new int[this.f41906b.size()];
                for (int i9 = 0; i9 < this.f41906b.size(); i9++) {
                    iArr[i9] = ((C2284p) this.f41906b.get(i9)).K();
                }
                c2434iR.M(iArr, null);
                this.f41906b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y(int i9) {
        synchronized (this.f41907c) {
            try {
                C2434i c2434iR = r();
                if (c2434iR == null) {
                    return;
                }
                c2434iR.L(((C2284p) this.f41906b.get(i9)).K(), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z(d dVar) {
        this.f41914j = dVar;
    }
}
