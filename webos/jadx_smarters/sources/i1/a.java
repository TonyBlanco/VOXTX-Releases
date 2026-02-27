package I1;

import D1.a;
import F1.h;
import F1.i;
import F1.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import v1.l;
import x1.g;
import z1.C3010i;
import z1.InterfaceC3002a;

/* JADX INFO: loaded from: classes.dex */
public final class a implements D1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3002a f2758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f2759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f2760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E1.b f2761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f2762e;

    /* JADX INFO: renamed from: I1.a$a, reason: collision with other inner class name */
    public class RunnableC0045a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.c f2763a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0015a f2764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ D1.b f2765d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Executor f2766e;

        /* JADX INFO: renamed from: I1.a$a$a, reason: collision with other inner class name */
        public class C0046a implements a.InterfaceC0015a {
            public C0046a() {
            }

            @Override // D1.a.InterfaceC0015a
            public void onCompleted() {
            }

            @Override // D1.a.InterfaceC0015a
            public void onFailure(B1.b bVar) {
                RunnableC0045a.this.f2764c.onFailure(bVar);
            }

            @Override // D1.a.InterfaceC0015a
            public void onFetch(a.b bVar) {
                RunnableC0045a.this.f2764c.onFetch(bVar);
            }

            @Override // D1.a.InterfaceC0015a
            public void onResponse(a.d dVar) {
                if (a.this.f2762e) {
                    return;
                }
                RunnableC0045a runnableC0045a = RunnableC0045a.this;
                Set setG = a.this.g(dVar, runnableC0045a.f2763a);
                HashSet hashSet = new HashSet();
                hashSet.addAll(setG);
                a.this.h(hashSet);
                RunnableC0045a.this.f2764c.onResponse(dVar);
                RunnableC0045a.this.f2764c.onCompleted();
            }
        }

        public RunnableC0045a(a.c cVar, a.InterfaceC0015a interfaceC0015a, D1.b bVar, Executor executor) {
            this.f2763a = cVar;
            this.f2764c = interfaceC0015a;
            this.f2765d = bVar;
            this.f2766e = executor;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f2762e) {
                return;
            }
            a.c cVar = this.f2763a;
            if (!cVar.f1316d) {
                this.f2765d.a(cVar, this.f2766e, new C0046a());
                return;
            }
            this.f2764c.onFetch(a.b.CACHE);
            try {
                this.f2764c.onResponse(a.this.i(this.f2763a));
                this.f2764c.onCompleted();
            } catch (B1.b e9) {
                this.f2764c.onFailure(e9);
            }
        }
    }

    public class b implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.c f2769a;

        public b(a.c cVar) {
            this.f2769a = cVar;
        }

        @Override // x1.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List apply(Collection collection) {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3010i) it.next()).i().e(this.f2769a.f1313a).c());
            }
            return arrayList;
        }
    }

    public class c implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x1.d f2771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.c f2772b;

        public c(x1.d dVar, a.c cVar) {
            this.f2771a = dVar;
            this.f2772b = cVar;
        }

        @Override // F1.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Set a(j jVar) {
            return jVar.q((Collection) this.f2771a.e(), this.f2772b.f1315c);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f2774a;

        public d(Set set) {
            this.f2774a = set;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.f2758a.r(this.f2774a);
            } catch (Exception e9) {
                a.this.f2761d.d(e9, "Failed to publish cache changes", new Object[0]);
            }
        }
    }

    public a(InterfaceC3002a interfaceC3002a, l lVar, Executor executor, E1.b bVar) {
        this.f2758a = (InterfaceC3002a) g.c(interfaceC3002a, "cache == null");
        this.f2759b = (l) g.c(lVar, "responseFieldMapper == null");
        this.f2760c = (Executor) g.c(executor, "dispatcher == null");
        this.f2761d = (E1.b) g.c(bVar, "logger == null");
    }

    @Override // D1.a
    public void dispose() {
        this.f2762e = true;
    }

    public final Set g(a.d dVar, a.c cVar) {
        x1.d dVarG = dVar.f1324c.g(new b(cVar));
        if (!dVarG.f()) {
            return Collections.emptySet();
        }
        try {
            return (Set) this.f2758a.n(new c(dVarG, cVar));
        } catch (Exception e9) {
            this.f2761d.c("Failed to cache operation response", e9);
            return Collections.emptySet();
        }
    }

    public final void h(Set set) {
        this.f2760c.execute(new d(set));
    }

    public final a.d i(a.c cVar) throws B1.b {
        h hVarE = this.f2758a.e();
        v1.i iVar = (v1.i) this.f2758a.v(cVar.f1314b, this.f2759b, hVarE, cVar.f1315c).c();
        if (iVar.b() != null) {
            this.f2761d.a("Cache HIT for operation %s", cVar.f1314b);
            return new a.d(null, iVar, hVarE.m());
        }
        this.f2761d.a("Cache MISS for operation %s", cVar.f1314b);
        throw new B1.b(String.format("Cache miss for operation %s", cVar.f1314b));
    }

    @Override // D1.a
    public void interceptAsync(a.c cVar, D1.b bVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
        executor.execute(new RunnableC0045a(cVar, interfaceC0015a, bVar, executor));
    }
}
