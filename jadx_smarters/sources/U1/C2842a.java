package u1;

import E1.f;
import E1.i;
import F1.e;
import K1.d;
import com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall;
import com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch;
import com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall;
import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import com.amazonaws.mobileconnectors.appsync.fetcher.AppSyncResponseFetchers;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import v1.InterfaceC2867e;
import v1.InterfaceC2868f;
import v1.h;
import v1.s;
import v1.t;
import w1.AbstractC2902b;
import w1.InterfaceC2901a;
import x1.g;
import y1.C2982a;
import z1.AbstractC3004c;
import z1.AbstractC3008g;
import z1.C3011j;
import z1.InterfaceC3002a;

/* JADX INFO: renamed from: u1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2842a implements AppSyncQueryCall.Factory, AppSyncMutationCall.Factory, AppSyncSubscriptionCall.Factory, AppSyncPrefetch.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpUrl f51162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call.Factory f51163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3002a f51164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f51165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f51166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f51167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC2902b.c f51168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1.a f51169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2982a f51170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final E1.b f51171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E1.a f51172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f51173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f51174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final L1.b f51175n;

    /* JADX INFO: renamed from: u1.a$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Call.Factory f51176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HttpUrl f51177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC3002a f51178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public x1.d f51179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public x1.d f51180e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public AbstractC2902b.c f51181f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C1.a f51182g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C2982a f51183h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Map f51184i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Executor f51185j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public x1.d f51186k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final List f51187l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f51188m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public L1.b f51189n;

        /* JADX INFO: renamed from: u1.a$b$a, reason: collision with other inner class name */
        public class ThreadFactoryC0466a implements ThreadFactory {
            public ThreadFactoryC0466a() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "Apollo Dispatcher");
            }
        }

        public b() {
            this.f51178c = InterfaceC3002a.f52621a;
            this.f51179d = x1.d.a();
            this.f51180e = x1.d.a();
            this.f51181f = AbstractC2902b.f51587b;
            this.f51182g = AppSyncResponseFetchers.CACHE_FIRST;
            this.f51183h = C2982a.f52130b;
            this.f51184i = new LinkedHashMap();
            this.f51186k = x1.d.a();
            this.f51187l = new ArrayList();
            this.f51189n = new L1.a();
        }

        public b a(D1.a aVar) {
            this.f51187l.add(aVar);
            return this;
        }

        public b b(s sVar, InterfaceC2843b interfaceC2843b) {
            this.f51184i.put(sVar, interfaceC2843b);
            return this;
        }

        public C2842a c() {
            g.c(this.f51177b, "serverUrl is null");
            E1.b bVar = new E1.b(this.f51186k);
            Call.Factory okHttpClient = this.f51176a;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            Executor executorF = this.f51185j;
            if (executorF == null) {
                executorF = f();
            }
            Executor executor = executorF;
            d dVar = new d(this.f51184i);
            InterfaceC3002a interfaceC3002a = this.f51178c;
            x1.d dVar2 = this.f51179d;
            x1.d dVar3 = this.f51180e;
            return new C2842a(this.f51177b, okHttpClient, null, (dVar2.f() && dVar3.f()) ? new e(((AbstractC3008g) dVar2.e()).b(C3011j.a()), (AbstractC3004c) dVar3.e(), dVar, executor, bVar) : interfaceC3002a, dVar, executor, this.f51181f, this.f51182g, this.f51183h, bVar, this.f51187l, this.f51188m, this.f51189n);
        }

        public b d(Call.Factory factory) {
            this.f51176a = (Call.Factory) g.c(factory, "factory == null");
            return this;
        }

        public b e(C2982a c2982a) {
            this.f51183h = (C2982a) g.c(c2982a, "cacheHeaders == null");
            return this;
        }

        public final Executor f() {
            return new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC0466a());
        }

        public b g(C1.a aVar) {
            this.f51182g = (C1.a) g.c(aVar, "defaultResponseFetcher == null");
            return this;
        }

        public b h(Executor executor) {
            this.f51185j = (Executor) g.c(executor, "dispatcher == null");
            return this;
        }

        public b i(AbstractC3008g abstractC3008g, AbstractC3004c abstractC3004c) {
            this.f51179d = x1.d.d(g.c(abstractC3008g, "normalizedCacheFactory == null"));
            this.f51180e = x1.d.d(g.c(abstractC3004c, "cacheKeyResolver == null"));
            return this;
        }

        public b j(OkHttpClient okHttpClient) {
            return d((Call.Factory) g.c(okHttpClient, "okHttpClient is null"));
        }

        public b k(String str) {
            this.f51177b = HttpUrl.parse((String) g.c(str, "serverUrl == null"));
            return this;
        }

        public b l(L1.b bVar) {
            this.f51189n = bVar;
            return this;
        }
    }

    public C2842a(HttpUrl httpUrl, Call.Factory factory, InterfaceC2901a interfaceC2901a, InterfaceC3002a interfaceC3002a, d dVar, Executor executor, AbstractC2902b.c cVar, C1.a aVar, C2982a c2982a, E1.b bVar, List list, boolean z9, L1.b bVar2) {
        this.f51166e = new i();
        this.f51172k = new E1.a();
        this.f51162a = httpUrl;
        this.f51163b = factory;
        this.f51164c = interfaceC3002a;
        this.f51165d = dVar;
        this.f51167f = executor;
        this.f51168g = cVar;
        this.f51169h = aVar;
        this.f51170i = c2982a;
        this.f51171j = bVar;
        this.f51173l = list;
        this.f51174m = z9;
        this.f51175n = bVar2;
    }

    public static b b() {
        return new b();
    }

    public InterfaceC3002a a() {
        return this.f51164c;
    }

    public final E1.e c(InterfaceC2868f interfaceC2868f) {
        return E1.e.d().j(interfaceC2868f).r(this.f51162a).h(this.f51163b).f(null).g(this.f51168g).o(this.f51166e).p(this.f51165d).a(this.f51164c).n(this.f51169h).d(this.f51170i).e(this.f51167f).i(this.f51171j).b(this.f51173l).t(this.f51172k).l(Collections.emptyList()).m(Collections.emptyList()).q(this.f51174m).s(this.f51175n).c();
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall.Factory
    public AppSyncMutationCall mutate(InterfaceC2867e interfaceC2867e) {
        return c(interfaceC2867e).responseFetcher(AppSyncResponseFetchers.NETWORK_ONLY);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall.Factory
    public AppSyncMutationCall mutate(InterfaceC2867e interfaceC2867e, InterfaceC2868f.a aVar) {
        g.c(aVar, "withOptimisticUpdate == null");
        return c(interfaceC2867e).n().n(AppSyncResponseFetchers.NETWORK_ONLY).k(x1.d.d(aVar)).c();
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch.Factory
    public AppSyncPrefetch prefetch(InterfaceC2868f interfaceC2868f) {
        return new f(interfaceC2868f, this.f51162a, this.f51163b, this.f51165d, this.f51167f, this.f51171j, this.f51172k, this.f51174m);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall.Factory
    public AppSyncQueryCall query(h hVar) {
        return c(hVar);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall.Factory
    public AppSyncSubscriptionCall subscribe(t tVar) {
        return new E1.h(tVar, this.f51175n, this, this.f51171j, c(tVar));
    }
}
