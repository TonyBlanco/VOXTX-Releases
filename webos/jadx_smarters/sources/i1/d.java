package I1;

import D1.a;
import F1.h;
import com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.Response;
import v1.InterfaceC2868f;
import v1.i;
import v1.t;

/* JADX INFO: loaded from: classes.dex */
public class d implements D1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L1.b f2798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f2799b;

    public class a implements a.InterfaceC0015a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Executor f2800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.c f2801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0015a f2802c;

        /* JADX INFO: renamed from: I1.d$a$a, reason: collision with other inner class name */
        public class RunnableC0048a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.d f2804a;

            public RunnableC0048a(a.d dVar) {
                this.f2804a = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                Map map = null;
                try {
                    try {
                        Map mapU = J1.a.c(new J1.b(((Response) this.f2804a.f1322a.e()).body().source())).u();
                        try {
                            Map map2 = (Map) ((Map) mapU.get("extensions")).get("subscription");
                            List<Map> list = (List) map2.get("mqttConnections");
                            ArrayList arrayList = new ArrayList();
                            for (Map map3 : ((Map) map2.get("newSubscriptions")).values()) {
                                if (map3.containsKey("topic")) {
                                    arrayList.add((String) map3.get("topic"));
                                }
                            }
                            SubscriptionResponse subscriptionResponse = new SubscriptionResponse();
                            for (Map map4 : list) {
                                subscriptionResponse.add(new SubscriptionResponse.MqttInfo((String) map4.get("client"), (String) map4.get("url"), (String[]) ((List) map4.get("topics")).toArray(new String[0])));
                            }
                            L1.b bVar = d.this.f2798a;
                            a aVar = a.this;
                            bVar.subscribe((t) aVar.f2801b.f1314b, arrayList, subscriptionResponse, d.this.f2799b);
                            a aVar2 = a.this;
                            a.this.f2802c.onResponse(new a.d((Response) this.f2804a.f1322a.e(), d.this.d(aVar2.f2801b.f1314b, this.f2804a), null));
                        } catch (Exception e9) {
                            e = e9;
                            map = mapU;
                            try {
                                a.this.f2802c.onFailure(new B1.b("Failed to parse subscription response: " + map, e));
                            } catch (Exception unused) {
                                a.this.f2802c.onFailure(new B1.b("Failed to parse subscription response, failed to get body string", e));
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                    }
                    a.this.f2802c.onCompleted();
                } catch (Throwable th) {
                    a.this.f2802c.onCompleted();
                    throw th;
                }
            }
        }

        public a(Executor executor, a.c cVar, a.InterfaceC0015a interfaceC0015a) {
            this.f2800a = executor;
            this.f2801b = cVar;
            this.f2802c = interfaceC0015a;
        }

        @Override // D1.a.InterfaceC0015a
        public void onCompleted() {
        }

        @Override // D1.a.InterfaceC0015a
        public void onFailure(B1.b bVar) {
            this.f2802c.onFailure(bVar);
        }

        @Override // D1.a.InterfaceC0015a
        public void onFetch(a.b bVar) {
            this.f2802c.onFetch(bVar);
        }

        @Override // D1.a.InterfaceC0015a
        public void onResponse(a.d dVar) {
            this.f2800a.execute(new RunnableC0048a(dVar));
        }
    }

    public d(L1.b bVar, h hVar) {
        this.f2798a = bVar;
        this.f2799b = hVar;
    }

    public final i d(InterfaceC2868f interfaceC2868f, a.d dVar) {
        return i.a(interfaceC2868f).g(null).f();
    }

    @Override // D1.a
    public void dispose() {
    }

    @Override // D1.a
    public void interceptAsync(a.c cVar, D1.b bVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
        if (cVar.f1314b instanceof t) {
            bVar.a(cVar, executor, new a(executor, cVar, interfaceC0015a));
        } else {
            bVar.a(cVar, executor, interfaceC0015a);
        }
    }
}
