package h1;

import h1.InterfaceC1847b;
import h1.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class w implements n.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f41592b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1848c f41594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BlockingQueue f41595e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f41591a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f41593c = null;

    public w(C1848c c1848c, BlockingQueue blockingQueue, q qVar) {
        this.f41592b = qVar;
        this.f41594d = c1848c;
        this.f41595e = blockingQueue;
    }

    @Override // h1.n.b
    public void a(n nVar, p pVar) {
        List list;
        InterfaceC1847b.a aVar = pVar.f41577b;
        if (aVar == null || aVar.a()) {
            b(nVar);
            return;
        }
        String strT = nVar.t();
        synchronized (this) {
            list = (List) this.f41591a.remove(strT);
        }
        if (list != null) {
            if (v.f41583b) {
                v.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strT);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f41592b.b((n) it.next(), pVar);
            }
        }
    }

    @Override // h1.n.b
    public synchronized void b(n nVar) {
        BlockingQueue blockingQueue;
        try {
            String strT = nVar.t();
            List list = (List) this.f41591a.remove(strT);
            if (list != null && !list.isEmpty()) {
                if (v.f41583b) {
                    v.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strT);
                }
                n nVar2 = (n) list.remove(0);
                this.f41591a.put(strT, list);
                nVar2.P(this);
                o oVar = this.f41593c;
                if (oVar != null) {
                    oVar.f(nVar2);
                } else if (this.f41594d != null && (blockingQueue = this.f41595e) != null) {
                    try {
                        blockingQueue.put(nVar2);
                    } catch (InterruptedException e9) {
                        v.c("Couldn't add request to queue. %s", e9.toString());
                        Thread.currentThread().interrupt();
                        this.f41594d.d();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean c(n nVar) {
        try {
            String strT = nVar.t();
            if (!this.f41591a.containsKey(strT)) {
                this.f41591a.put(strT, null);
                nVar.P(this);
                if (v.f41583b) {
                    v.b("new request, sending to network %s", strT);
                }
                return false;
            }
            List arrayList = (List) this.f41591a.get(strT);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            nVar.b("waiting-for-response");
            arrayList.add(nVar);
            this.f41591a.put(strT, arrayList);
            if (v.f41583b) {
                v.b("Request for cacheKey=%s is in flight, putting on hold.", strT);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
