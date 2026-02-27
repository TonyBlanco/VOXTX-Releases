package q5;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d.AbstractC1617D;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: q5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2578y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Map f46931o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2567n f46933b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f46939h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ServiceConnection f46943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IInterface f46944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.google.android.play.core.integrity.q f46945n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f46935d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f46936e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f46937f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f46941j = new IBinder.DeathRecipient() { // from class: q5.q
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C2578y.h(this.f46923a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f46942k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46934c = "IntegrityService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f46940i = new WeakReference(null);

    public C2578y(Context context, C2567n c2567n, String str, Intent intent, com.google.android.play.core.integrity.q qVar, InterfaceC2573t interfaceC2573t, byte[] bArr) {
        this.f46932a = context;
        this.f46933b = c2567n;
        this.f46939h = intent;
        this.f46945n = qVar;
    }

    public static /* synthetic */ void h(C2578y c2578y) {
        c2578y.f46933b.d("reportBinderDeath", new Object[0]);
        AbstractC1617D.a(c2578y.f46940i.get());
        c2578y.f46933b.d("%s : Binder has died.", c2578y.f46934c);
        Iterator it = c2578y.f46935d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC2568o) it.next()).a(c2578y.s());
        }
        c2578y.f46935d.clear();
        c2578y.t();
    }

    public static /* bridge */ /* synthetic */ void m(C2578y c2578y, AbstractRunnableC2568o abstractRunnableC2568o) {
        if (c2578y.f46944m != null || c2578y.f46938g) {
            if (!c2578y.f46938g) {
                abstractRunnableC2568o.run();
                return;
            } else {
                c2578y.f46933b.d("Waiting to bind to the service.", new Object[0]);
                c2578y.f46935d.add(abstractRunnableC2568o);
                return;
            }
        }
        c2578y.f46933b.d("Initiate binding to the service.", new Object[0]);
        c2578y.f46935d.add(abstractRunnableC2568o);
        ServiceConnectionC2577x serviceConnectionC2577x = new ServiceConnectionC2577x(c2578y, null);
        c2578y.f46943l = serviceConnectionC2577x;
        c2578y.f46938g = true;
        if (c2578y.f46932a.bindService(c2578y.f46939h, serviceConnectionC2577x, 1)) {
            return;
        }
        c2578y.f46933b.d("Failed to bind to the service.", new Object[0]);
        c2578y.f46938g = false;
        Iterator it = c2578y.f46935d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC2568o) it.next()).a(new C2579z());
        }
        c2578y.f46935d.clear();
    }

    public static /* bridge */ /* synthetic */ void n(C2578y c2578y) {
        c2578y.f46933b.d("linkToDeath", new Object[0]);
        try {
            c2578y.f46944m.asBinder().linkToDeath(c2578y.f46941j, 0);
        } catch (RemoteException e9) {
            c2578y.f46933b.c(e9, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void o(C2578y c2578y) {
        c2578y.f46933b.d("unlinkToDeath", new Object[0]);
        c2578y.f46944m.asBinder().unlinkToDeath(c2578y.f46941j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f46931o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f46934c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f46934c, 10);
                    handlerThread.start();
                    map.put(this.f46934c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f46934c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f46944m;
    }

    public final void p(AbstractRunnableC2568o abstractRunnableC2568o, final TaskCompletionSource taskCompletionSource) {
        synchronized (this.f46937f) {
            this.f46936e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: q5.p
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.f46921a.q(taskCompletionSource, task);
                }
            });
        }
        synchronized (this.f46937f) {
            try {
                if (this.f46942k.getAndIncrement() > 0) {
                    this.f46933b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c().post(new C2571r(this, abstractRunnableC2568o.c(), abstractRunnableC2568o));
    }

    public final /* synthetic */ void q(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f46937f) {
            this.f46936e.remove(taskCompletionSource);
        }
    }

    public final void r(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f46937f) {
            this.f46936e.remove(taskCompletionSource);
        }
        synchronized (this.f46937f) {
            try {
                if (this.f46942k.get() > 0 && this.f46942k.decrementAndGet() > 0) {
                    this.f46933b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new C2572s(this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final RemoteException s() {
        return new RemoteException(String.valueOf(this.f46934c).concat(" : Binder has died."));
    }

    public final void t() {
        synchronized (this.f46937f) {
            try {
                Iterator it = this.f46936e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(s());
                }
                this.f46936e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
