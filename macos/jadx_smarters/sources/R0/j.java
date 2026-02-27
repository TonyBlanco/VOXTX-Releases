package R0;

import Q0.k;
import Q0.n;
import Q0.q;
import Q0.u;
import U0.m;
import a1.AbstractRunnableC1077a;
import a1.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import c1.InterfaceC1247a;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class j extends u {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f8489j = Q0.k.f("WorkManagerImpl");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static j f8490k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static j f8491l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f8492m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f8493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.work.a f8494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WorkDatabase f8495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1247a f8496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f8497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f8498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a1.h f8499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f8501i;

    public j(Context context, androidx.work.a aVar, InterfaceC1247a interfaceC1247a) {
        this(context, aVar, interfaceC1247a, context.getResources().getBoolean(q.f7467a));
    }

    public j(Context context, androidx.work.a aVar, InterfaceC1247a interfaceC1247a, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        Q0.k.e(new k.a(aVar.j()));
        List listI = i(applicationContext, aVar, interfaceC1247a);
        s(context, aVar, interfaceC1247a, workDatabase, listI, new d(context, aVar, interfaceC1247a, workDatabase, listI));
    }

    public j(Context context, androidx.work.a aVar, InterfaceC1247a interfaceC1247a, boolean z9) {
        this(context, aVar, interfaceC1247a, WorkDatabase.s(context.getApplicationContext(), interfaceC1247a.c(), z9));
    }

    public static void g(Context context, androidx.work.a aVar) {
        synchronized (f8492m) {
            try {
                j jVar = f8490k;
                if (jVar != null && f8491l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (jVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f8491l == null) {
                        f8491l = new j(applicationContext, aVar, new c1.b(aVar.l()));
                    }
                    f8490k = f8491l;
                }
            } finally {
            }
        }
    }

    public static j l() {
        synchronized (f8492m) {
            try {
                j jVar = f8490k;
                if (jVar != null) {
                    return jVar;
                }
                return f8491l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static j m(Context context) {
        j jVarL;
        synchronized (f8492m) {
            try {
                jVarL = l();
                if (jVarL == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVarL;
    }

    @Override // Q0.u
    public n a(String str) {
        AbstractRunnableC1077a abstractRunnableC1077aD = AbstractRunnableC1077a.d(str, this);
        this.f8496d.b(abstractRunnableC1077aD);
        return abstractRunnableC1077aD.e();
    }

    @Override // Q0.u
    public n c(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new g(this, list).a();
    }

    @Override // Q0.u
    public n e(String str, Q0.d dVar, List list) {
        return new g(this, str, dVar, list).a();
    }

    public n h(UUID uuid) {
        AbstractRunnableC1077a abstractRunnableC1077aB = AbstractRunnableC1077a.b(uuid, this);
        this.f8496d.b(abstractRunnableC1077aB);
        return abstractRunnableC1077aB.e();
    }

    public List i(Context context, androidx.work.a aVar, InterfaceC1247a interfaceC1247a) {
        return Arrays.asList(f.a(context, this), new S0.b(context, aVar, interfaceC1247a, this));
    }

    public Context j() {
        return this.f8493a;
    }

    public androidx.work.a k() {
        return this.f8494b;
    }

    public a1.h n() {
        return this.f8499g;
    }

    public d o() {
        return this.f8498f;
    }

    public List p() {
        return this.f8497e;
    }

    public WorkDatabase q() {
        return this.f8495c;
    }

    public InterfaceC1247a r() {
        return this.f8496d;
    }

    public final void s(Context context, androidx.work.a aVar, InterfaceC1247a interfaceC1247a, WorkDatabase workDatabase, List list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f8493a = applicationContext;
        this.f8494b = aVar;
        this.f8496d = interfaceC1247a;
        this.f8495c = workDatabase;
        this.f8497e = list;
        this.f8498f = dVar;
        this.f8499g = new a1.h(workDatabase);
        this.f8500h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f8496d.b(new ForceStopRunnable(applicationContext, this));
    }

    public void t() {
        synchronized (f8492m) {
            try {
                this.f8500h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f8501i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f8501i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u() {
        if (Build.VERSION.SDK_INT >= 23) {
            m.b(j());
        }
        q().B().l();
        f.b(k(), q(), p());
    }

    public void v(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f8492m) {
            try {
                this.f8501i = pendingResult;
                if (this.f8500h) {
                    pendingResult.finish();
                    this.f8501i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w(String str) {
        x(str, null);
    }

    public void x(String str, WorkerParameters.a aVar) {
        this.f8496d.b(new l(this, str, aVar));
    }

    public void y(String str) {
        this.f8496d.b(new a1.m(this, str, true));
    }

    public void z(String str) {
        this.f8496d.b(new a1.m(this, str, false));
    }
}
