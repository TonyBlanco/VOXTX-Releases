package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.common.internal.AbstractC1410i;
import com.google.android.gms.common.internal.AbstractC1423w;
import com.google.android.gms.common.internal.C1417p;
import com.google.android.gms.common.internal.C1419s;
import com.google.android.gms.common.internal.C1420t;
import com.google.android.gms.common.internal.C1422v;
import com.google.android.gms.common.internal.InterfaceC1424x;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d.AbstractC1617D;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import s.C2696b;
import w4.C2914b;
import w4.C2920h;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1363g implements Handler.Callback {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Status f26616q = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Status f26617r = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f26618s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static C1363g f26619t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1422v f26622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1424x f26623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f26624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2920h f26625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.common.internal.L f26626h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f26633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f26634p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f26620a = 10000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26621c = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f26627i = new AtomicInteger(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f26628j = new AtomicInteger(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f26629k = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public A f26630l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f26631m = new C2696b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f26632n = new C2696b();

    public C1363g(Context context, Looper looper, C2920h c2920h) {
        this.f26634p = true;
        this.f26624f = context;
        zau zauVar = new zau(looper, this);
        this.f26633o = zauVar;
        this.f26625g = c2920h;
        this.f26626h = new com.google.android.gms.common.internal.L(c2920h);
        if (C4.i.a(context)) {
            this.f26634p = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static Status f(C1353b c1353b, C2914b c2914b) {
        return new Status(c2914b, "API: " + c1353b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c2914b));
    }

    public static C1363g t(Context context) {
        C1363g c1363g;
        synchronized (f26618s) {
            try {
                if (f26619t == null) {
                    f26619t = new C1363g(context.getApplicationContext(), AbstractC1410i.b().getLooper(), C2920h.q());
                }
                c1363g = f26619t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1363g;
    }

    public final void C(com.google.android.gms.common.api.e eVar, int i9, AbstractC1357d abstractC1357d) {
        this.f26633o.sendMessage(this.f26633o.obtainMessage(4, new C1401z0(new R0(i9, abstractC1357d), this.f26628j.get(), eVar)));
    }

    public final void D(com.google.android.gms.common.api.e eVar, int i9, AbstractC1388t abstractC1388t, TaskCompletionSource taskCompletionSource, InterfaceC1386s interfaceC1386s) {
        j(taskCompletionSource, abstractC1388t.d(), eVar);
        this.f26633o.sendMessage(this.f26633o.obtainMessage(4, new C1401z0(new T0(i9, abstractC1388t, taskCompletionSource, interfaceC1386s), this.f26628j.get(), eVar)));
    }

    public final void E(C1417p c1417p, int i9, long j9, int i10) {
        this.f26633o.sendMessage(this.f26633o.obtainMessage(18, new C1399y0(c1417p, i9, j9, i10)));
    }

    public final void F(C2914b c2914b, int i9) {
        if (e(c2914b, i9)) {
            return;
        }
        Handler handler = this.f26633o;
        handler.sendMessage(handler.obtainMessage(5, i9, 0, c2914b));
    }

    public final void G() {
        Handler handler = this.f26633o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void H(com.google.android.gms.common.api.e eVar) {
        Handler handler = this.f26633o;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void a(A a9) {
        synchronized (f26618s) {
            try {
                if (this.f26630l != a9) {
                    this.f26630l = a9;
                    this.f26631m.clear();
                }
                this.f26631m.addAll(a9.i());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(A a9) {
        synchronized (f26618s) {
            try {
                if (this.f26630l == a9) {
                    this.f26630l = null;
                    this.f26631m.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        if (this.f26621c) {
            return false;
        }
        C1420t c1420tA = C1419s.b().a();
        if (c1420tA != null && !c1420tA.J()) {
            return false;
        }
        int iA = this.f26626h.a(this.f26624f, 203400000);
        return iA == -1 || iA == 0;
    }

    public final boolean e(C2914b c2914b, int i9) {
        return this.f26625g.A(this.f26624f, c2914b, i9);
    }

    public final C1372k0 g(com.google.android.gms.common.api.e eVar) {
        Map map = this.f26629k;
        C1353b apiKey = eVar.getApiKey();
        C1372k0 c1372k0 = (C1372k0) map.get(apiKey);
        if (c1372k0 == null) {
            c1372k0 = new C1372k0(this, eVar);
            this.f26629k.put(apiKey, c1372k0);
        }
        if (c1372k0.a()) {
            this.f26632n.add(apiKey);
        }
        c1372k0.C();
        return c1372k0;
    }

    public final InterfaceC1424x h() {
        if (this.f26623e == null) {
            this.f26623e = AbstractC1423w.a(this.f26624f);
        }
        return this.f26623e;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        TaskCompletionSource taskCompletionSourceB;
        Boolean boolValueOf;
        int i9 = message.what;
        C1372k0 c1372k0 = null;
        switch (i9) {
            case 1:
                this.f26620a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f26633o.removeMessages(12);
                for (C1353b c1353b : this.f26629k.keySet()) {
                    Handler handler = this.f26633o;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c1353b), this.f26620a);
                }
                return true;
            case 2:
                AbstractC1617D.a(message.obj);
                throw null;
            case 3:
                for (C1372k0 c1372k02 : this.f26629k.values()) {
                    c1372k02.B();
                    c1372k02.C();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C1401z0 c1401z0 = (C1401z0) message.obj;
                C1372k0 c1372k0G = (C1372k0) this.f26629k.get(c1401z0.f26745c.getApiKey());
                if (c1372k0G == null) {
                    c1372k0G = g(c1401z0.f26745c);
                }
                if (!c1372k0G.a() || this.f26628j.get() == c1401z0.f26744b) {
                    c1372k0G.D(c1401z0.f26743a);
                } else {
                    c1401z0.f26743a.a(f26616q);
                    c1372k0G.I();
                }
                return true;
            case 5:
                int i10 = message.arg1;
                C2914b c2914b = (C2914b) message.obj;
                Iterator it = this.f26629k.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C1372k0 c1372k03 = (C1372k0) it.next();
                        if (c1372k03.p() == i10) {
                            c1372k0 = c1372k03;
                        }
                    }
                }
                if (c1372k0 == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i10 + " while trying to fail enqueued calls.", new Exception());
                } else if (c2914b.H() == 13) {
                    c1372k0.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f26625g.g(c2914b.H()) + ": " + c2914b.I()));
                } else {
                    c1372k0.e(f(c1372k0.f26650d, c2914b));
                }
                return true;
            case 6:
                if (this.f26624f.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C1355c.c((Application) this.f26624f.getApplicationContext());
                    ComponentCallbacks2C1355c.b().a(new C1362f0(this));
                    if (!ComponentCallbacks2C1355c.b().e(true)) {
                        this.f26620a = 300000L;
                    }
                }
                return true;
            case 7:
                g((com.google.android.gms.common.api.e) message.obj);
                return true;
            case 9:
                if (this.f26629k.containsKey(message.obj)) {
                    ((C1372k0) this.f26629k.get(message.obj)).H();
                }
                return true;
            case 10:
                Iterator it2 = this.f26632n.iterator();
                while (it2.hasNext()) {
                    C1372k0 c1372k04 = (C1372k0) this.f26629k.remove((C1353b) it2.next());
                    if (c1372k04 != null) {
                        c1372k04.I();
                    }
                }
                this.f26632n.clear();
                return true;
            case 11:
                if (this.f26629k.containsKey(message.obj)) {
                    ((C1372k0) this.f26629k.get(message.obj)).J();
                }
                return true;
            case 12:
                if (this.f26629k.containsKey(message.obj)) {
                    ((C1372k0) this.f26629k.get(message.obj)).b();
                }
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                B b9 = (B) message.obj;
                C1353b c1353bA = b9.a();
                if (this.f26629k.containsKey(c1353bA)) {
                    boolean zO = ((C1372k0) this.f26629k.get(c1353bA)).o(false);
                    taskCompletionSourceB = b9.b();
                    boolValueOf = Boolean.valueOf(zO);
                } else {
                    taskCompletionSourceB = b9.b();
                    boolValueOf = Boolean.FALSE;
                }
                taskCompletionSourceB.setResult(boolValueOf);
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                C1376m0 c1376m0 = (C1376m0) message.obj;
                if (this.f26629k.containsKey(c1376m0.f26669a)) {
                    C1372k0.y((C1372k0) this.f26629k.get(c1376m0.f26669a), c1376m0);
                }
                return true;
            case 16:
                C1376m0 c1376m02 = (C1376m0) message.obj;
                if (this.f26629k.containsKey(c1376m02.f26669a)) {
                    C1372k0.z((C1372k0) this.f26629k.get(c1376m02.f26669a), c1376m02);
                }
                return true;
            case LangUtils.HASH_SEED /* 17 */:
                i();
                return true;
            case 18:
                C1399y0 c1399y0 = (C1399y0) message.obj;
                if (c1399y0.f26739c == 0) {
                    h().a(new C1422v(c1399y0.f26738b, Arrays.asList(c1399y0.f26737a)));
                } else {
                    C1422v c1422v = this.f26622d;
                    if (c1422v != null) {
                        List listI = c1422v.I();
                        if (c1422v.H() != c1399y0.f26738b || (listI != null && listI.size() >= c1399y0.f26740d)) {
                            this.f26633o.removeMessages(17);
                            i();
                        } else {
                            this.f26622d.J(c1399y0.f26737a);
                        }
                    }
                    if (this.f26622d == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c1399y0.f26737a);
                        this.f26622d = new C1422v(c1399y0.f26738b, arrayList);
                        Handler handler2 = this.f26633o;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c1399y0.f26739c);
                    }
                }
                return true;
            case 19:
                this.f26621c = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i9);
                return false;
        }
    }

    public final void i() {
        C1422v c1422v = this.f26622d;
        if (c1422v != null) {
            if (c1422v.H() > 0 || d()) {
                h().a(c1422v);
            }
            this.f26622d = null;
        }
    }

    public final void j(TaskCompletionSource taskCompletionSource, int i9, com.google.android.gms.common.api.e eVar) {
        C1397x0 c1397x0A;
        if (i9 == 0 || (c1397x0A = C1397x0.a(this, i9, eVar.getApiKey())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        final Handler handler = this.f26633o;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.e0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, c1397x0A);
    }

    public final int k() {
        return this.f26627i.getAndIncrement();
    }

    public final C1372k0 s(C1353b c1353b) {
        return (C1372k0) this.f26629k.get(c1353b);
    }

    public final Task v(com.google.android.gms.common.api.e eVar) {
        B b9 = new B(eVar.getApiKey());
        this.f26633o.sendMessage(this.f26633o.obtainMessage(14, b9));
        return b9.b().getTask();
    }

    public final Task w(com.google.android.gms.common.api.e eVar, AbstractC1379o abstractC1379o, AbstractC1392v abstractC1392v, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        j(taskCompletionSource, abstractC1379o.e(), eVar);
        this.f26633o.sendMessage(this.f26633o.obtainMessage(8, new C1401z0(new S0(new A0(abstractC1379o, abstractC1392v, runnable), taskCompletionSource), this.f26628j.get(), eVar)));
        return taskCompletionSource.getTask();
    }

    public final Task x(com.google.android.gms.common.api.e eVar, C1371k.a aVar, int i9) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        j(taskCompletionSource, i9, eVar);
        this.f26633o.sendMessage(this.f26633o.obtainMessage(13, new C1401z0(new U0(aVar, taskCompletionSource), this.f26628j.get(), eVar)));
        return taskCompletionSource.getTask();
    }
}
