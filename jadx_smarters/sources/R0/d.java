package R0;

import R0.k;
import a1.n;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import c1.InterfaceC1247a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import y5.InterfaceFutureC2987b;

/* JADX INFO: loaded from: classes.dex */
public class d implements b, Y0.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f8461m = Q0.k.f("Processor");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f8463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.work.a f8464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1247a f8465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WorkDatabase f8466f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f8469i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f8468h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f8467g = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Set f8470j = new HashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f8471k = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f8462a = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8472l = new Object();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f8473a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceFutureC2987b f8475d;

        public a(b bVar, String str, InterfaceFutureC2987b interfaceFutureC2987b) {
            this.f8473a = bVar;
            this.f8474c = str;
            this.f8475d = interfaceFutureC2987b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.f8475d.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f8473a.d(this.f8474c, zBooleanValue);
        }
    }

    public d(Context context, androidx.work.a aVar, InterfaceC1247a interfaceC1247a, WorkDatabase workDatabase, List list) {
        this.f8463c = context;
        this.f8464d = aVar;
        this.f8465e = interfaceC1247a;
        this.f8466f = workDatabase;
        this.f8469i = list;
    }

    public static boolean e(String str, k kVar) {
        if (kVar == null) {
            Q0.k.c().a(f8461m, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        kVar.d();
        Q0.k.c().a(f8461m, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    @Override // Y0.a
    public void a(String str) {
        synchronized (this.f8472l) {
            this.f8467g.remove(str);
            m();
        }
    }

    @Override // Y0.a
    public void b(String str, Q0.e eVar) {
        synchronized (this.f8472l) {
            try {
                Q0.k.c().d(f8461m, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                k kVar = (k) this.f8468h.remove(str);
                if (kVar != null) {
                    if (this.f8462a == null) {
                        PowerManager.WakeLock wakeLockB = n.b(this.f8463c, "ProcessorForegroundLck");
                        this.f8462a = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.f8467g.put(str, kVar);
                    E.b.startForegroundService(this.f8463c, androidx.work.impl.foreground.a.c(this.f8463c, str, eVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.f8472l) {
            this.f8471k.add(bVar);
        }
    }

    @Override // R0.b
    public void d(String str, boolean z9) {
        synchronized (this.f8472l) {
            try {
                this.f8468h.remove(str);
                Q0.k.c().a(f8461m, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z9)), new Throwable[0]);
                Iterator it = this.f8471k.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).d(str, z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean f(String str) {
        boolean zContains;
        synchronized (this.f8472l) {
            zContains = this.f8470j.contains(str);
        }
        return zContains;
    }

    public boolean g(String str) {
        boolean z9;
        synchronized (this.f8472l) {
            try {
                z9 = this.f8468h.containsKey(str) || this.f8467g.containsKey(str);
            } finally {
            }
        }
        return z9;
    }

    public boolean h(String str) {
        boolean zContainsKey;
        synchronized (this.f8472l) {
            zContainsKey = this.f8467g.containsKey(str);
        }
        return zContainsKey;
    }

    public void i(b bVar) {
        synchronized (this.f8472l) {
            this.f8471k.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.f8472l) {
            try {
                if (g(str)) {
                    Q0.k.c().a(f8461m, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                    return false;
                }
                k kVarA = new k.c(this.f8463c, this.f8464d, this.f8465e, this, this.f8466f, str).c(this.f8469i).b(aVar).a();
                InterfaceFutureC2987b interfaceFutureC2987bB = kVarA.b();
                interfaceFutureC2987bB.addListener(new a(this, str, interfaceFutureC2987bB), this.f8465e.a());
                this.f8468h.put(str, kVarA);
                this.f8465e.c().execute(kVarA);
                Q0.k.c().a(f8461m, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean l(String str) {
        boolean zE;
        synchronized (this.f8472l) {
            try {
                Q0.k.c().a(f8461m, String.format("Processor cancelling %s", str), new Throwable[0]);
                this.f8470j.add(str);
                k kVar = (k) this.f8467g.remove(str);
                boolean z9 = kVar != null;
                if (kVar == null) {
                    kVar = (k) this.f8468h.remove(str);
                }
                zE = e(str, kVar);
                if (z9) {
                    m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zE;
    }

    public final void m() {
        synchronized (this.f8472l) {
            try {
                if (!(!this.f8467g.isEmpty())) {
                    try {
                        this.f8463c.startService(androidx.work.impl.foreground.a.e(this.f8463c));
                    } catch (Throwable th) {
                        Q0.k.c().b(f8461m, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f8462a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f8462a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean n(String str) {
        boolean zE;
        synchronized (this.f8472l) {
            Q0.k.c().a(f8461m, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zE = e(str, (k) this.f8467g.remove(str));
        }
        return zE;
    }

    public boolean o(String str) {
        boolean zE;
        synchronized (this.f8472l) {
            Q0.k.c().a(f8461m, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zE = e(str, (k) this.f8468h.remove(str));
        }
        return zE;
    }
}
