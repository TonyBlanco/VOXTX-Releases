package V0;

import Q0.k;
import W0.c;
import W0.e;
import W0.f;
import W0.g;
import W0.h;
import android.content.Context;
import c1.InterfaceC1247a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d implements c.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f9842d = k.f("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W0.c[] f9844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9845c;

    public d(Context context, InterfaceC1247a interfaceC1247a, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f9843a = cVar;
        this.f9844b = new W0.c[]{new W0.a(applicationContext, interfaceC1247a), new W0.b(applicationContext, interfaceC1247a), new h(applicationContext, interfaceC1247a), new W0.d(applicationContext, interfaceC1247a), new g(applicationContext, interfaceC1247a), new f(applicationContext, interfaceC1247a), new e(applicationContext, interfaceC1247a)};
        this.f9845c = new Object();
    }

    @Override // W0.c.a
    public void a(List list) {
        synchronized (this.f9845c) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (c(str)) {
                        k.c().a(f9842d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                c cVar = this.f9843a;
                if (cVar != null) {
                    cVar.f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W0.c.a
    public void b(List list) {
        synchronized (this.f9845c) {
            try {
                c cVar = this.f9843a;
                if (cVar != null) {
                    cVar.b(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.f9845c) {
            try {
                for (W0.c cVar : this.f9844b) {
                    if (cVar.d(str)) {
                        k.c().a(f9842d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Iterable iterable) {
        synchronized (this.f9845c) {
            try {
                for (W0.c cVar : this.f9844b) {
                    cVar.g(null);
                }
                for (W0.c cVar2 : this.f9844b) {
                    cVar2.e(iterable);
                }
                for (W0.c cVar3 : this.f9844b) {
                    cVar3.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f9845c) {
            try {
                for (W0.c cVar : this.f9844b) {
                    cVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
