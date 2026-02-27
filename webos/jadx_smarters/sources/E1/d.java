package E1;

import com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher;
import com.amazonaws.mobileconnectors.appsync.fetcher.AppSyncResponseFetchers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Call;
import okhttp3.HttpUrl;
import u1.InterfaceC2844c;
import v1.InterfaceC2869g;
import w1.AbstractC2902b;
import y1.C2982a;
import z1.InterfaceC3002a;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E1.b f1568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f1570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E1.a f1571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f1572e = new AtomicBoolean();

    public class a extends InterfaceC2844c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f1573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f1574b;

        public a(AtomicInteger atomicInteger, c cVar, e eVar) {
            this.f1573a = atomicInteger;
            this.f1574b = eVar;
        }

        @Override // u1.InterfaceC2844c.a
        public void onFailure(B1.b bVar) {
            if (d.this.f1568a != null) {
                d.this.f1568a.d(bVar, "Failed to fetch query: %s", this.f1574b.f1587a);
            }
            this.f1573a.decrementAndGet();
        }

        @Override // u1.InterfaceC2844c.a
        public void onResponse(v1.i iVar) {
            this.f1573a.decrementAndGet();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f1576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f1577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HttpUrl f1578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Call.Factory f1579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public i f1580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public K1.d f1581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InterfaceC3002a f1582g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Executor f1583h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public E1.b f1584i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List f1585j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public E1.a f1586k;

        public b() {
            this.f1576a = Collections.emptyList();
            this.f1577b = Collections.emptyList();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public b a(InterfaceC3002a interfaceC3002a) {
            this.f1582g = interfaceC3002a;
            return this;
        }

        public b b(List list) {
            this.f1585j = list;
            return this;
        }

        public d c() {
            return new d(this);
        }

        public b d(E1.a aVar) {
            this.f1586k = aVar;
            return this;
        }

        public b e(Executor executor) {
            this.f1583h = executor;
            return this;
        }

        public b f(Call.Factory factory) {
            this.f1579d = factory;
            return this;
        }

        public b g(E1.b bVar) {
            this.f1584i = bVar;
            return this;
        }

        public b h(List list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.f1576a = list;
            return this;
        }

        public b i(List list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.f1577b = list;
            return this;
        }

        public b j(i iVar) {
            this.f1580e = iVar;
            return this;
        }

        public b k(K1.d dVar) {
            this.f1581f = dVar;
            return this;
        }

        public b l(HttpUrl httpUrl) {
            this.f1578c = httpUrl;
            return this;
        }
    }

    public interface c {
    }

    public d(b bVar) {
        this.f1568a = bVar.f1584i;
        this.f1569b = new ArrayList(bVar.f1576a.size());
        Iterator it = bVar.f1576a.iterator();
        while (it.hasNext()) {
            this.f1569b.add(e.d().j((v1.h) it.next()).r(bVar.f1578c).h(bVar.f1579d).o(bVar.f1580e).p(bVar.f1581f).a(bVar.f1582g).g(AbstractC2902b.f51587b).n(AppSyncResponseFetchers.NETWORK_ONLY).d(C2982a.f52130b).i(bVar.f1584i).b(bVar.f1585j).t(bVar.f1586k).e(bVar.f1583h).c());
        }
        this.f1570c = bVar.f1577b;
        this.f1571d = bVar.f1586k;
    }

    public static b b() {
        return new b(null);
    }

    public void c() {
        Iterator it = this.f1569b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).cancel();
        }
    }

    public void d() {
        if (!this.f1572e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        f();
        e();
    }

    public final void e() {
        AtomicInteger atomicInteger = new AtomicInteger(this.f1569b.size());
        for (e eVar : this.f1569b) {
            eVar.enqueue(new a(atomicInteger, null, eVar));
        }
    }

    public final void f() {
        try {
            Iterator it = this.f1570c.iterator();
            while (it.hasNext()) {
                Iterator it2 = this.f1571d.b((InterfaceC2869g) it.next()).iterator();
                while (it2.hasNext()) {
                    ((AppSyncQueryWatcher) it2.next()).refetch();
                }
            }
        } catch (Exception e9) {
            this.f1568a.d(e9, "Failed to re-fetch query watcher", new Object[0]);
        }
    }
}
