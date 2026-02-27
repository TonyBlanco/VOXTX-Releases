package p4;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.zzdy;
import d.AbstractC1617D;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;
import p4.C2434i;
import t4.AbstractC2774a;
import t4.C2775b;

/* JADX INFO: renamed from: p4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2429d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2434i f46445c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LruCache f46448f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.google.android.gms.common.api.f f46454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.google.android.gms.common.api.f f46455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f46456n = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2775b f46443a = new C2775b("MediaQueue");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f46451i = Math.max(20, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f46446d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f46447e = new SparseIntArray();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f46449g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Deque f46450h = new ArrayDeque(20);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f46452j = new zzdy(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TimerTask f46453k = new b0(this);

    public C2429d(C2434i c2434i, int i9, int i10) {
        this.f46445c = c2434i;
        c2434i.N(new d0(this));
        v(20);
        this.f46444b = r();
        q();
    }

    public static /* bridge */ /* synthetic */ void g(C2429d c2429d, int i9, int i10) {
        synchronized (c2429d.f46456n) {
            try {
                Iterator it = c2429d.f46456n.iterator();
                if (it.hasNext()) {
                    AbstractC1617D.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void h(C2429d c2429d, int[] iArr) {
        synchronized (c2429d.f46456n) {
            try {
                Iterator it = c2429d.f46456n.iterator();
                if (it.hasNext()) {
                    AbstractC1617D.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void i(C2429d c2429d, List list, int i9) {
        synchronized (c2429d.f46456n) {
            try {
                Iterator it = c2429d.f46456n.iterator();
                if (it.hasNext()) {
                    AbstractC1617D.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void l(final C2429d c2429d) {
        if (c2429d.f46450h.isEmpty() || c2429d.f46454l != null || c2429d.f46444b == 0) {
            return;
        }
        com.google.android.gms.common.api.f fVarF0 = c2429d.f46445c.f0(AbstractC2774a.l(c2429d.f46450h));
        c2429d.f46454l = fVarF0;
        fVarF0.setResultCallback(new com.google.android.gms.common.api.i() { // from class: p4.a0
            @Override // com.google.android.gms.common.api.i
            public final void a(com.google.android.gms.common.api.h hVar) {
                this.f46437a.p((C2434i.c) hVar);
            }
        });
        c2429d.f46450h.clear();
    }

    public static /* bridge */ /* synthetic */ void m(C2429d c2429d) {
        c2429d.f46447e.clear();
        for (int i9 = 0; i9 < c2429d.f46446d.size(); i9++) {
            c2429d.f46447e.put(((Integer) c2429d.f46446d.get(i9)).intValue(), i9);
        }
    }

    public final void A() {
        s();
        this.f46452j.postDelayed(this.f46453k, 500L);
    }

    public int a(int i9) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        return this.f46447e.get(i9, -1);
    }

    public int b(int i9) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (i9 < 0 || i9 >= this.f46446d.size()) {
            return 0;
        }
        return ((Integer) this.f46446d.get(i9)).intValue();
    }

    public final void n() {
        z();
        this.f46446d.clear();
        this.f46447e.clear();
        this.f46448f.evictAll();
        this.f46449g.clear();
        s();
        this.f46450h.clear();
        t();
        u();
        x();
        w();
    }

    public final void o(C2434i.c cVar) {
        Status status = cVar.getStatus();
        int I9 = status.I();
        if (I9 != 0) {
            this.f46443a.f(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(I9), status.J()), new Object[0]);
        }
        this.f46455m = null;
        if (this.f46450h.isEmpty()) {
            return;
        }
        A();
    }

    public final void p(C2434i.c cVar) {
        Status status = cVar.getStatus();
        int I9 = status.I();
        if (I9 != 0) {
            this.f46443a.f(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(I9), status.J()), new Object[0]);
        }
        this.f46454l = null;
        if (this.f46450h.isEmpty()) {
            return;
        }
        A();
    }

    public final void q() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (this.f46444b != 0 && this.f46455m == null) {
            t();
            u();
            com.google.android.gms.common.api.f fVarE0 = this.f46445c.e0();
            this.f46455m = fVarE0;
            fVarE0.setResultCallback(new com.google.android.gms.common.api.i() { // from class: p4.Z
                @Override // com.google.android.gms.common.api.i
                public final void a(com.google.android.gms.common.api.h hVar) {
                    this.f46425a.o((C2434i.c) hVar);
                }
            });
        }
    }

    public final long r() {
        n4.r rVarL = this.f46445c.l();
        if (rVarL == null || rVarL.j0()) {
            return 0L;
        }
        return rVarL.zzb();
    }

    public final void s() {
        this.f46452j.removeCallbacks(this.f46453k);
    }

    public final void t() {
        com.google.android.gms.common.api.f fVar = this.f46455m;
        if (fVar != null) {
            fVar.cancel();
            this.f46455m = null;
        }
    }

    public final void u() {
        com.google.android.gms.common.api.f fVar = this.f46454l;
        if (fVar != null) {
            fVar.cancel();
            this.f46454l = null;
        }
    }

    public final void v(int i9) {
        this.f46448f = new c0(this, i9);
    }

    public final void w() {
        synchronized (this.f46456n) {
            try {
                Iterator it = this.f46456n.iterator();
                if (it.hasNext()) {
                    AbstractC1617D.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x() {
        synchronized (this.f46456n) {
            try {
                Iterator it = this.f46456n.iterator();
                if (it.hasNext()) {
                    AbstractC1617D.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(int[] iArr) {
        synchronized (this.f46456n) {
            try {
                Iterator it = this.f46456n.iterator();
                if (it.hasNext()) {
                    AbstractC1617D.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z() {
        synchronized (this.f46456n) {
            try {
                Iterator it = this.f46456n.iterator();
                if (it.hasNext()) {
                    AbstractC1617D.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
