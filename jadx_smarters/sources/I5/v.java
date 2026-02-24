package I5;

import d.AbstractC1617D;
import g6.AbstractC1838a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class v implements g6.d, g6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f2913a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Queue f2914b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f2915c;

    public v(Executor executor) {
        this.f2915c = executor;
    }

    public static /* synthetic */ void f(Map.Entry entry, AbstractC1838a abstractC1838a) {
        ((g6.b) entry.getKey()).a(abstractC1838a);
    }

    @Override // g6.d
    public void a(Class cls, g6.b bVar) {
        b(cls, this.f2915c, bVar);
    }

    @Override // g6.d
    public synchronized void b(Class cls, Executor executor, g6.b bVar) {
        try {
            E.b(cls);
            E.b(bVar);
            E.b(executor);
            if (!this.f2913a.containsKey(cls)) {
                this.f2913a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f2913a.get(cls)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void d() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f2914b;
                if (queue != null) {
                    this.f2914b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                AbstractC1617D.a(it.next());
                g(null);
            }
        }
    }

    public final synchronized Set e(AbstractC1838a abstractC1838a) {
        throw null;
    }

    public void g(final AbstractC1838a abstractC1838a) {
        E.b(abstractC1838a);
        synchronized (this) {
            try {
                Queue queue = this.f2914b;
                if (queue != null) {
                    queue.add(abstractC1838a);
                    return;
                }
                for (final Map.Entry entry : e(abstractC1838a)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, abstractC1838a) { // from class: I5.u

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ Map.Entry f2912a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            v.f(this.f2912a, null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
