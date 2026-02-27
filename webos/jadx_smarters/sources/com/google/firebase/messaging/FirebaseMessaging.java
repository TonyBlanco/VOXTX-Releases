package com.google.firebase.messaging;

import A5.f;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.a;
import com.google.firebase.messaging.b;
import g6.AbstractC1838a;
import g6.d;
import i6.InterfaceC1901a;
import j6.InterfaceC2102b;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k6.h;
import q6.AbstractC2597o;
import q6.C2596n;
import q6.C2598p;
import q6.D;
import q6.I;
import q6.O;
import q6.Z;
import q6.d0;
import z2.InterfaceC3019g;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f27927m = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static b f27928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static InterfaceC3019g f27929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static ScheduledExecutorService f27930p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f27931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f27932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f27933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f27934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.firebase.messaging.a f27935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f27936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f27937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f27938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Task f27939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final I f27940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f27942l;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f27943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f27944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g6.b f27945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f27946d;

        public a(d dVar) {
            this.f27943a = dVar;
        }

        public synchronized void a() {
            try {
                if (this.f27944b) {
                    return;
                }
                Boolean boolD = d();
                this.f27946d = boolD;
                if (boolD == null) {
                    g6.b bVar = new g6.b() { // from class: q6.z
                        @Override // g6.b
                        public final void a(AbstractC1838a abstractC1838a) {
                            this.f47112a.c(abstractC1838a);
                        }
                    };
                    this.f27945c = bVar;
                    this.f27943a.a(A5.b.class, bVar);
                }
                this.f27944b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean b() {
            Boolean bool;
            try {
                a();
                bool = this.f27946d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f27931a.v();
        }

        public /* synthetic */ void c(AbstractC1838a abstractC1838a) {
            if (b()) {
                FirebaseMessaging.this.x();
            }
        }

        public final Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextL = FirebaseMessaging.this.f27931a.l();
            SharedPreferences sharedPreferences = contextL.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextL.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextL.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(f fVar, InterfaceC1901a interfaceC1901a, InterfaceC2102b interfaceC2102b, InterfaceC2102b interfaceC2102b2, h hVar, InterfaceC3019g interfaceC3019g, d dVar) {
        this(fVar, interfaceC1901a, interfaceC2102b, interfaceC2102b2, hVar, interfaceC3019g, dVar, new I(fVar.l()));
    }

    public FirebaseMessaging(f fVar, InterfaceC1901a interfaceC1901a, InterfaceC2102b interfaceC2102b, InterfaceC2102b interfaceC2102b2, h hVar, InterfaceC3019g interfaceC3019g, d dVar, I i9) {
        this(fVar, interfaceC1901a, hVar, interfaceC3019g, dVar, i9, new D(fVar, i9, interfaceC2102b, interfaceC2102b2, hVar), AbstractC2597o.d(), AbstractC2597o.a());
    }

    public FirebaseMessaging(f fVar, InterfaceC1901a interfaceC1901a, h hVar, InterfaceC3019g interfaceC3019g, d dVar, I i9, D d9, Executor executor, Executor executor2) {
        this.f27941k = false;
        f27929o = interfaceC3019g;
        this.f27931a = fVar;
        this.f27932b = hVar;
        this.f27936f = new a(dVar);
        Context contextL = fVar.l();
        this.f27933c = contextL;
        C2598p c2598p = new C2598p();
        this.f27942l = c2598p;
        this.f27940j = i9;
        this.f27938h = executor;
        this.f27934d = d9;
        this.f27935e = new com.google.firebase.messaging.a(executor);
        this.f27937g = executor2;
        Context contextL2 = fVar.l();
        if (contextL2 instanceof Application) {
            ((Application) contextL2).registerActivityLifecycleCallbacks(c2598p);
        } else {
            String strValueOf = String.valueOf(contextL2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 125);
            sb.append("Context ");
            sb.append(strValueOf);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        if (interfaceC1901a != null) {
            interfaceC1901a.a(new InterfaceC1901a.InterfaceC0347a() { // from class: q6.v
            });
        }
        executor2.execute(new Runnable() { // from class: q6.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f47110a.r();
            }
        });
        Task taskE = d0.e(this, i9, d9, contextL, AbstractC2597o.e());
        this.f27939i = taskE;
        taskE.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: q6.q
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f47098a.s((d0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: q6.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f47111a.t();
            }
        });
    }

    public static synchronized FirebaseMessaging f() {
        return getInstance(f.m());
    }

    public static synchronized b g(Context context) {
        try {
            if (f27928n == null) {
                f27928n = new b(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f27928n;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(f fVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) fVar.j(FirebaseMessaging.class);
        r.n(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static InterfaceC3019g k() {
        return f27929o;
    }

    public boolean A(b.a aVar) {
        return aVar == null || aVar.b(this.f27940j.a());
    }

    public String c() throws IOException {
        final b.a aVarJ = j();
        if (!A(aVarJ)) {
            return aVarJ.f27953a;
        }
        final String strC = I.c(this.f27931a);
        try {
            return (String) Tasks.await(this.f27935e.a(strC, new a.InterfaceC0268a() { // from class: q6.w
                @Override // com.google.firebase.messaging.a.InterfaceC0268a
                public final Task start() {
                    return this.f47107a.p(strC, aVarJ);
                }
            }));
        } catch (InterruptedException | ExecutionException e9) {
            throw new IOException(e9);
        }
    }

    public void d(Runnable runnable, long j9) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f27930p == null) {
                    f27930p = new ScheduledThreadPoolExecutor(1, new D4.b("TAG"));
                }
                f27930p.schedule(runnable, j9, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context e() {
        return this.f27933c;
    }

    public final String h() {
        return "[DEFAULT]".equals(this.f27931a.o()) ? "" : this.f27931a.q();
    }

    public Task i() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f27937g.execute(new Runnable() { // from class: q6.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f47099a.q(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public b.a j() {
        return g(this.f27933c).d(h(), I.c(this.f27931a));
    }

    public final void l(String str) {
        if ("[DEFAULT]".equals(this.f27931a.o())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String strValueOf = String.valueOf(this.f27931a.o());
                Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(strValueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT, str);
            new C2596n(this.f27933c).g(intent);
        }
    }

    public boolean m() {
        return this.f27936f.b();
    }

    public boolean n() {
        return this.f27940j.g();
    }

    public /* synthetic */ Task o(String str, b.a aVar, String str2) {
        g(this.f27933c).f(h(), str, str2, this.f27940j.a());
        if (aVar == null || !str2.equals(aVar.f27953a)) {
            l(str2);
        }
        return Tasks.forResult(str2);
    }

    public /* synthetic */ Task p(final String str, final b.a aVar) {
        return this.f27934d.d().onSuccessTask(new Executor() { // from class: q6.s
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new SuccessContinuation() { // from class: q6.t
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f47102a.o(str, aVar, (String) obj);
            }
        });
    }

    public /* synthetic */ void q(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(c());
        } catch (Exception e9) {
            taskCompletionSource.setException(e9);
        }
    }

    public /* synthetic */ void r() {
        if (m()) {
            x();
        }
    }

    public /* synthetic */ void s(d0 d0Var) {
        if (m()) {
            d0Var.p();
        }
    }

    public /* synthetic */ void t() {
        O.b(this.f27933c);
    }

    public synchronized void v(boolean z9) {
        this.f27941k = z9;
    }

    public final synchronized void w() {
        if (this.f27941k) {
            return;
        }
        z(0L);
    }

    public final void x() {
        if (A(j())) {
            w();
        }
    }

    public Task y(final String str) {
        return this.f27939i.onSuccessTask(new SuccessContinuation() { // from class: q6.u
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return ((d0) obj).q(str);
            }
        });
    }

    public synchronized void z(long j9) {
        d(new Z(this, Math.min(Math.max(30L, j9 + j9), f27927m)), j9);
        this.f27941k = true;
    }
}
