package androidx.work.impl.background.systemalarm;

import Q0.k;
import R0.j;
import a1.n;
import a1.r;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import c1.InterfaceC1247a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d implements R0.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f17353l = k.f("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17354a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1247a f17355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f17356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final R0.d f17357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f17358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.a f17359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f17360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f17361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Intent f17362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f17363k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            RunnableC0204d runnableC0204d;
            synchronized (d.this.f17361i) {
                d dVar2 = d.this;
                dVar2.f17362j = (Intent) dVar2.f17361i.get(0);
            }
            Intent intent = d.this.f17362j;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.f17362j.getIntExtra("KEY_START_ID", 0);
                k kVarC = k.c();
                String str = d.f17353l;
                kVarC.a(str, String.format("Processing command %s, %s", d.this.f17362j, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockB = n.b(d.this.f17354a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    k.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.acquire();
                    d dVar3 = d.this;
                    dVar3.f17359g.p(dVar3.f17362j, intExtra, dVar3);
                    k.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.release();
                    dVar = d.this;
                    runnableC0204d = new RunnableC0204d(dVar);
                } catch (Throwable th) {
                    try {
                        k kVarC2 = k.c();
                        String str2 = d.f17353l;
                        kVarC2.b(str2, "Unexpected error in onHandleIntent", th);
                        k.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        dVar = d.this;
                        runnableC0204d = new RunnableC0204d(dVar);
                    } catch (Throwable th2) {
                        k.c().a(d.f17353l, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        d dVar4 = d.this;
                        dVar4.k(new RunnableC0204d(dVar4));
                        throw th2;
                    }
                }
                dVar.k(runnableC0204d);
            }
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f17365a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Intent f17366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17367d;

        public b(d dVar, Intent intent, int i9) {
            this.f17365a = dVar;
            this.f17366c = intent;
            this.f17367d = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17365a.a(this.f17366c, this.f17367d);
        }
    }

    public interface c {
        void b();
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$d, reason: collision with other inner class name */
    public static class RunnableC0204d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f17368a;

        public RunnableC0204d(d dVar) {
            this.f17368a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17368a.c();
        }
    }

    public d(Context context) {
        this(context, null, null);
    }

    public d(Context context, R0.d dVar, j jVar) {
        Context applicationContext = context.getApplicationContext();
        this.f17354a = applicationContext;
        this.f17359g = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.f17356d = new r();
        jVar = jVar == null ? j.m(context) : jVar;
        this.f17358f = jVar;
        dVar = dVar == null ? jVar.o() : dVar;
        this.f17357e = dVar;
        this.f17355c = jVar.r();
        dVar.c(this);
        this.f17361i = new ArrayList();
        this.f17362j = null;
        this.f17360h = new Handler(Looper.getMainLooper());
    }

    public boolean a(Intent intent, int i9) {
        k kVarC = k.c();
        String str = f17353l;
        kVarC.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i9)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            k.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i9);
        synchronized (this.f17361i) {
            try {
                boolean z9 = !this.f17361i.isEmpty();
                this.f17361i.add(intent);
                if (!z9) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final void b() {
        if (this.f17360h.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void c() {
        k kVarC = k.c();
        String str = f17353l;
        kVarC.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f17361i) {
            try {
                if (this.f17362j != null) {
                    k.c().a(str, String.format("Removing command %s", this.f17362j), new Throwable[0]);
                    if (!((Intent) this.f17361i.remove(0)).equals(this.f17362j)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f17362j = null;
                }
                a1.k kVarC2 = this.f17355c.c();
                if (!this.f17359g.o() && this.f17361i.isEmpty() && !kVarC2.a()) {
                    k.c().a(str, "No more commands & intents.", new Throwable[0]);
                    c cVar = this.f17363k;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.f17361i.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // R0.b
    public void d(String str, boolean z9) {
        k(new b(this, androidx.work.impl.background.systemalarm.a.c(this.f17354a, str, z9), 0));
    }

    public R0.d e() {
        return this.f17357e;
    }

    public InterfaceC1247a f() {
        return this.f17355c;
    }

    public j g() {
        return this.f17358f;
    }

    public r h() {
        return this.f17356d;
    }

    public final boolean i(String str) {
        b();
        synchronized (this.f17361i) {
            try {
                Iterator it = this.f17361i.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        k.c().a(f17353l, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f17357e.i(this);
        this.f17356d.a();
        this.f17363k = null;
    }

    public void k(Runnable runnable) {
        this.f17360h.post(runnable);
    }

    public final void l() {
        b();
        PowerManager.WakeLock wakeLockB = n.b(this.f17354a, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f17358f.r().b(new a());
        } finally {
            wakeLockB.release();
        }
    }

    public void m(c cVar) {
        if (this.f17363k != null) {
            k.c().b(f17353l, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f17363k = cVar;
        }
    }
}
