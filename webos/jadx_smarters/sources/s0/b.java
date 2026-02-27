package S0;

import Q0.k;
import Q0.t;
import R0.e;
import R0.j;
import V0.c;
import V0.d;
import Z0.p;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import c1.InterfaceC1247a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b implements e, c, R0.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f9376j = k.f("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9377a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f9378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f9379d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f9381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9382g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f9384i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f9380e = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f9383h = new Object();

    public b(Context context, androidx.work.a aVar, InterfaceC1247a interfaceC1247a, j jVar) {
        this.f9377a = context;
        this.f9378c = jVar;
        this.f9379d = new d(context, interfaceC1247a, this);
        this.f9381f = new a(this, aVar.k());
    }

    @Override // R0.e
    public void a(String str) {
        if (this.f9384i == null) {
            g();
        }
        if (!this.f9384i.booleanValue()) {
            k.c().d(f9376j, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        k.c().a(f9376j, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f9381f;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f9378c.z(str);
    }

    @Override // V0.c
    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            k.c().a(f9376j, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f9378c.z(str);
        }
    }

    @Override // R0.e
    public boolean c() {
        return false;
    }

    @Override // R0.b
    public void d(String str, boolean z9) {
        i(str);
    }

    @Override // R0.e
    public void e(p... pVarArr) {
        if (this.f9384i == null) {
            g();
        }
        if (!this.f9384i.booleanValue()) {
            k.c().d(f9376j, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long jA = pVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (pVar.f10812b == t.ENQUEUED) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f9381f;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i9 = Build.VERSION.SDK_INT;
                    if (i9 >= 23 && pVar.f10820j.h()) {
                        k.c().a(f9376j, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i9 < 24 || !pVar.f10820j.e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f10811a);
                    } else {
                        k.c().a(f9376j, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    }
                } else {
                    k.c().a(f9376j, String.format("Starting work for %s", pVar.f10811a), new Throwable[0]);
                    this.f9378c.w(pVar.f10811a);
                }
            }
        }
        synchronized (this.f9383h) {
            try {
                if (!hashSet.isEmpty()) {
                    k.c().a(f9376j, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f9380e.addAll(hashSet);
                    this.f9379d.d(this.f9380e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V0.c
    public void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            k.c().a(f9376j, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f9378c.w(str);
        }
    }

    public final void g() {
        this.f9384i = Boolean.valueOf(a1.j.b(this.f9377a, this.f9378c.k()));
    }

    public final void h() {
        if (this.f9382g) {
            return;
        }
        this.f9378c.o().c(this);
        this.f9382g = true;
    }

    public final void i(String str) {
        synchronized (this.f9383h) {
            try {
                Iterator it = this.f9380e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    p pVar = (p) it.next();
                    if (pVar.f10811a.equals(str)) {
                        k.c().a(f9376j, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.f9380e.remove(pVar);
                        this.f9379d.d(this.f9380e);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
