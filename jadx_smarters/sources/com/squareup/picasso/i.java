package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f39082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f39083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f39084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f39085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f39086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f39087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f39088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f39089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f39090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f39091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC1610d f39092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A f39093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f39094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f39095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f39096o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f39097p;

    public static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f39098a;

        /* JADX INFO: renamed from: com.squareup.picasso.i$a$a, reason: collision with other inner class name */
        public class RunnableC0308a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message f39099a;

            public RunnableC0308a(Message message) {
                this.f39099a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f39099a.what);
            }
        }

        public a(Looper looper, i iVar) {
            super(looper);
            this.f39098a = iVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f39098a.v((AbstractC1607a) message.obj);
                    break;
                case 2:
                    this.f39098a.o((AbstractC1607a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    t.f39125p.post(new RunnableC0308a(message));
                    break;
                case 4:
                    this.f39098a.p((RunnableC1609c) message.obj);
                    break;
                case 5:
                    this.f39098a.u((RunnableC1609c) message.obj);
                    break;
                case 6:
                    this.f39098a.q((RunnableC1609c) message.obj, false);
                    break;
                case 7:
                    this.f39098a.n();
                    break;
                case 9:
                    this.f39098a.r((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.f39098a.m(message.arg1 == 1);
                    break;
                case 11:
                    this.f39098a.s(message.obj);
                    break;
                case 12:
                    this.f39098a.t(message.obj);
                    break;
            }
        }
    }

    public static class b extends HandlerThread {
        public b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    public static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f39101a;

        public c(i iVar) {
            this.f39101a = iVar;
        }

        public void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f39101a.f39096o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f39101a.f39083b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.f39101a.b(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f39101a.f(((ConnectivityManager) G.p(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    public i(Context context, ExecutorService executorService, Handler handler, j jVar, InterfaceC1610d interfaceC1610d, A a9) {
        b bVar = new b();
        this.f39082a = bVar;
        bVar.start();
        G.j(bVar.getLooper());
        this.f39083b = context;
        this.f39084c = executorService;
        this.f39086e = new LinkedHashMap();
        this.f39087f = new WeakHashMap();
        this.f39088g = new WeakHashMap();
        this.f39089h = new HashSet();
        this.f39090i = new a(bVar.getLooper(), this);
        this.f39085d = jVar;
        this.f39091j = handler;
        this.f39092k = interfaceC1610d;
        this.f39093l = a9;
        this.f39094m = new ArrayList(4);
        this.f39097p = G.r(context);
        this.f39096o = G.q(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.f39095n = cVar;
        cVar.a();
    }

    public final void a(RunnableC1609c runnableC1609c) {
        if (runnableC1609c.s()) {
            return;
        }
        this.f39094m.add(runnableC1609c);
        if (this.f39090i.hasMessages(7)) {
            return;
        }
        this.f39090i.sendEmptyMessageDelayed(7, 200L);
    }

    public void b(boolean z9) {
        Handler handler = this.f39090i;
        handler.sendMessage(handler.obtainMessage(10, z9 ? 1 : 0, 0));
    }

    public void c(AbstractC1607a abstractC1607a) {
        Handler handler = this.f39090i;
        handler.sendMessage(handler.obtainMessage(2, abstractC1607a));
    }

    public void d(RunnableC1609c runnableC1609c) {
        Handler handler = this.f39090i;
        handler.sendMessage(handler.obtainMessage(4, runnableC1609c));
    }

    public void e(RunnableC1609c runnableC1609c) {
        Handler handler = this.f39090i;
        handler.sendMessage(handler.obtainMessage(6, runnableC1609c));
    }

    public void f(NetworkInfo networkInfo) {
        Handler handler = this.f39090i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    public void g(RunnableC1609c runnableC1609c) {
        Handler handler = this.f39090i;
        handler.sendMessageDelayed(handler.obtainMessage(5, runnableC1609c), 500L);
    }

    public void h(AbstractC1607a abstractC1607a) {
        Handler handler = this.f39090i;
        handler.sendMessage(handler.obtainMessage(1, abstractC1607a));
    }

    public final void i() {
        if (this.f39087f.isEmpty()) {
            return;
        }
        Iterator it = this.f39087f.values().iterator();
        while (it.hasNext()) {
            AbstractC1607a abstractC1607a = (AbstractC1607a) it.next();
            it.remove();
            if (abstractC1607a.g().f39140n) {
                G.u("Dispatcher", "replaying", abstractC1607a.i().d());
            }
            w(abstractC1607a, false);
        }
    }

    public final void j(List list) {
        if (list == null || list.isEmpty() || !((RunnableC1609c) list.get(0)).o().f39140n) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RunnableC1609c runnableC1609c = (RunnableC1609c) it.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(G.l(runnableC1609c));
        }
        G.u("Dispatcher", "delivered", sb.toString());
    }

    public final void k(AbstractC1607a abstractC1607a) {
        Object objK = abstractC1607a.k();
        if (objK != null) {
            abstractC1607a.f39047k = true;
            this.f39087f.put(objK, abstractC1607a);
        }
    }

    public final void l(RunnableC1609c runnableC1609c) {
        AbstractC1607a abstractC1607aH = runnableC1609c.h();
        if (abstractC1607aH != null) {
            k(abstractC1607aH);
        }
        List listI = runnableC1609c.i();
        if (listI != null) {
            int size = listI.size();
            for (int i9 = 0; i9 < size; i9++) {
                k((AbstractC1607a) listI.get(i9));
            }
        }
    }

    public void m(boolean z9) {
        this.f39097p = z9;
    }

    public void n() {
        ArrayList arrayList = new ArrayList(this.f39094m);
        this.f39094m.clear();
        Handler handler = this.f39091j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    public void o(AbstractC1607a abstractC1607a) {
        String strD = abstractC1607a.d();
        RunnableC1609c runnableC1609c = (RunnableC1609c) this.f39086e.get(strD);
        if (runnableC1609c != null) {
            runnableC1609c.f(abstractC1607a);
            if (runnableC1609c.c()) {
                this.f39086e.remove(strD);
                if (abstractC1607a.g().f39140n) {
                    G.u("Dispatcher", "canceled", abstractC1607a.i().d());
                }
            }
        }
        if (this.f39089h.contains(abstractC1607a.j())) {
            this.f39088g.remove(abstractC1607a.k());
            if (abstractC1607a.g().f39140n) {
                G.v("Dispatcher", "canceled", abstractC1607a.i().d(), "because paused request got canceled");
            }
        }
        AbstractC1607a abstractC1607a2 = (AbstractC1607a) this.f39087f.remove(abstractC1607a.k());
        if (abstractC1607a2 == null || !abstractC1607a2.g().f39140n) {
            return;
        }
        G.v("Dispatcher", "canceled", abstractC1607a2.i().d(), "from replaying");
    }

    public void p(RunnableC1609c runnableC1609c) {
        if (p.shouldWriteToMemoryCache(runnableC1609c.n())) {
            this.f39092k.b(runnableC1609c.l(), runnableC1609c.q());
        }
        this.f39086e.remove(runnableC1609c.l());
        a(runnableC1609c);
        if (runnableC1609c.o().f39140n) {
            G.v("Dispatcher", "batched", G.l(runnableC1609c), "for completion");
        }
    }

    public void q(RunnableC1609c runnableC1609c, boolean z9) {
        if (runnableC1609c.o().f39140n) {
            String strL = G.l(runnableC1609c);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z9 ? " (will replay)" : "");
            G.v("Dispatcher", "batched", strL, sb.toString());
        }
        this.f39086e.remove(runnableC1609c.l());
        a(runnableC1609c);
    }

    public void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f39084c;
        if (executorService instanceof v) {
            ((v) executorService).a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        i();
    }

    public void s(Object obj) {
        if (this.f39089h.add(obj)) {
            Iterator it = this.f39086e.values().iterator();
            while (it.hasNext()) {
                RunnableC1609c runnableC1609c = (RunnableC1609c) it.next();
                boolean z9 = runnableC1609c.o().f39140n;
                AbstractC1607a abstractC1607aH = runnableC1609c.h();
                List listI = runnableC1609c.i();
                boolean z10 = (listI == null || listI.isEmpty()) ? false : true;
                if (abstractC1607aH != null || z10) {
                    if (abstractC1607aH != null && abstractC1607aH.j().equals(obj)) {
                        runnableC1609c.f(abstractC1607aH);
                        this.f39088g.put(abstractC1607aH.k(), abstractC1607aH);
                        if (z9) {
                            G.v("Dispatcher", "paused", abstractC1607aH.f39038b.d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z10) {
                        for (int size = listI.size() - 1; size >= 0; size--) {
                            AbstractC1607a abstractC1607a = (AbstractC1607a) listI.get(size);
                            if (abstractC1607a.j().equals(obj)) {
                                runnableC1609c.f(abstractC1607a);
                                this.f39088g.put(abstractC1607a.k(), abstractC1607a);
                                if (z9) {
                                    G.v("Dispatcher", "paused", abstractC1607a.f39038b.d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (runnableC1609c.c()) {
                        it.remove();
                        if (z9) {
                            G.v("Dispatcher", "canceled", G.l(runnableC1609c), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    public void t(Object obj) {
        if (this.f39089h.remove(obj)) {
            Iterator it = this.f39088g.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                AbstractC1607a abstractC1607a = (AbstractC1607a) it.next();
                if (abstractC1607a.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractC1607a);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f39091j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    public void u(RunnableC1609c runnableC1609c) {
        if (runnableC1609c.s()) {
            return;
        }
        boolean z9 = false;
        if (this.f39084c.isShutdown()) {
            q(runnableC1609c, false);
            return;
        }
        NetworkInfo activeNetworkInfo = this.f39096o ? ((ConnectivityManager) G.p(this.f39083b, "connectivity")).getActiveNetworkInfo() : null;
        boolean z10 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zU = runnableC1609c.u(this.f39097p, activeNetworkInfo);
        boolean zV = runnableC1609c.v();
        if (!zU) {
            if (this.f39096o && zV) {
                z9 = true;
            }
            q(runnableC1609c, z9);
            if (z9) {
                l(runnableC1609c);
                return;
            }
            return;
        }
        if (this.f39096o && !z10) {
            q(runnableC1609c, zV);
            if (zV) {
                l(runnableC1609c);
                return;
            }
            return;
        }
        if (runnableC1609c.o().f39140n) {
            G.u("Dispatcher", "retrying", G.l(runnableC1609c));
        }
        if (runnableC1609c.k() instanceof r.a) {
            runnableC1609c.f39064j |= q.NO_CACHE.index;
        }
        runnableC1609c.f39069o = this.f39084c.submit(runnableC1609c);
    }

    public void v(AbstractC1607a abstractC1607a) {
        w(abstractC1607a, true);
    }

    public void w(AbstractC1607a abstractC1607a, boolean z9) {
        if (this.f39089h.contains(abstractC1607a.j())) {
            this.f39088g.put(abstractC1607a.k(), abstractC1607a);
            if (abstractC1607a.g().f39140n) {
                G.v("Dispatcher", "paused", abstractC1607a.f39038b.d(), "because tag '" + abstractC1607a.j() + "' is paused");
                return;
            }
            return;
        }
        RunnableC1609c runnableC1609c = (RunnableC1609c) this.f39086e.get(abstractC1607a.d());
        if (runnableC1609c != null) {
            runnableC1609c.b(abstractC1607a);
            return;
        }
        if (this.f39084c.isShutdown()) {
            if (abstractC1607a.g().f39140n) {
                G.v("Dispatcher", "ignored", abstractC1607a.f39038b.d(), "because shut down");
                return;
            }
            return;
        }
        RunnableC1609c runnableC1609cG = RunnableC1609c.g(abstractC1607a.g(), this, this.f39092k, this.f39093l, abstractC1607a);
        runnableC1609cG.f39069o = this.f39084c.submit(runnableC1609cG);
        this.f39086e.put(abstractC1607a.d(), runnableC1609cG);
        if (z9) {
            this.f39087f.remove(abstractC1607a.k());
        }
        if (abstractC1607a.g().f39140n) {
            G.u("Dispatcher", "enqueued", abstractC1607a.f39038b.d());
        }
    }
}
