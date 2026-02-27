package k6;

import I5.x;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d.AbstractC1617D;
import j6.InterfaceC2102b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import k6.i;
import l6.C2200b;
import l6.C2201c;
import m6.AbstractC2233d;
import m6.AbstractC2235f;
import m6.C2232c;

/* JADX INFO: loaded from: classes3.dex */
public class g implements h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f43601m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f43602n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A5.f f43603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2232c f43604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2201c f43605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f43606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f43607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f43608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f43609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f43610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f43611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f43612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set f43613k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f43614l;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f43615a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f43615a.getAndIncrement())));
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43617b;

        static {
            int[] iArr = new int[AbstractC2235f.b.values().length];
            f43617b = iArr;
            try {
                iArr[AbstractC2235f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43617b[AbstractC2235f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43617b[AbstractC2235f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC2233d.b.values().length];
            f43616a = iArr2;
            try {
                iArr2[AbstractC2233d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43616a[AbstractC2233d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public g(final A5.f fVar, InterfaceC2102b interfaceC2102b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new C2232c(fVar.l(), interfaceC2102b), new C2201c(fVar), p.c(), new x(new InterfaceC2102b() { // from class: k6.c
            @Override // j6.InterfaceC2102b
            public final Object get() {
                return g.y(fVar);
            }
        }), new n());
    }

    public g(ExecutorService executorService, Executor executor, A5.f fVar, C2232c c2232c, C2201c c2201c, p pVar, x xVar, n nVar) {
        this.f43609g = new Object();
        this.f43613k = new HashSet();
        this.f43614l = new ArrayList();
        this.f43603a = fVar;
        this.f43604b = c2232c;
        this.f43605c = c2201c;
        this.f43606d = pVar;
        this.f43607e = xVar;
        this.f43608f = nVar;
        this.f43610h = executorService;
        this.f43611i = executor;
    }

    public static g p() {
        return q(A5.f.m());
    }

    public static g q(A5.f fVar) {
        r.b(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (g) fVar.j(h.class);
    }

    public static /* synthetic */ C2200b y(A5.f fVar) {
        return new C2200b(fVar);
    }

    public final String A(l6.d dVar) {
        if ((!this.f43603a.o().equals("CHIME_ANDROID_SDK") && !this.f43603a.w()) || !dVar.m()) {
            return this.f43608f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f43608f.a() : strF;
    }

    public final l6.d B(l6.d dVar) throws i {
        AbstractC2233d abstractC2233dD = this.f43604b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i9 = b.f43616a[abstractC2233dD.e().ordinal()];
        if (i9 == 1) {
            return dVar.s(abstractC2233dD.c(), abstractC2233dD.d(), this.f43606d.b(), abstractC2233dD.b().c(), abstractC2233dD.b().d());
        }
        if (i9 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public final void C(Exception exc) {
        synchronized (this.f43609g) {
            try {
                Iterator it = this.f43614l.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void D(l6.d dVar) {
        synchronized (this.f43609g) {
            try {
                Iterator it = this.f43614l.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void E(String str) {
        this.f43612j = str;
    }

    public final synchronized void F(l6.d dVar, l6.d dVar2) {
        if (this.f43613k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f43613k.iterator();
            if (it.hasNext()) {
                AbstractC1617D.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    @Override // k6.h
    public Task a(final boolean z9) {
        z();
        Task taskF = f();
        this.f43610h.execute(new Runnable() { // from class: k6.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f43597a.x(z9);
            }
        });
        return taskF;
    }

    public final Task f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new k(this.f43606d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new l(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // k6.h
    public Task getId() {
        z();
        String strN = n();
        if (strN != null) {
            return Tasks.forResult(strN);
        }
        Task taskG = g();
        this.f43610h.execute(new Runnable() { // from class: k6.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f43596a.w();
            }
        });
        return taskG;
    }

    public final void h(o oVar) {
        synchronized (this.f43609g) {
            this.f43614l.add(oVar);
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void v(boolean z9) {
        l6.d dVarB;
        Exception iOException;
        l6.d dVarR = r();
        try {
            if (dVarR.i() || dVarR.l()) {
                dVarB = B(dVarR);
            } else {
                if (!z9 && !this.f43606d.f(dVarR)) {
                    return;
                }
                dVarB = k(dVarR);
            }
            u(dVarB);
            F(dVarR, dVarB);
            if (dVarB.k()) {
                E(dVarB.d());
            }
            if (dVarB.i()) {
                iOException = new i(i.a.BAD_CONFIG);
            } else {
                if (!dVarB.j()) {
                    D(dVarB);
                    return;
                }
                iOException = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
            }
            C(iOException);
        } catch (i e9) {
            C(e9);
        }
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void x(final boolean z9) {
        l6.d dVarS = s();
        if (z9) {
            dVarS = dVarS.p();
        }
        D(dVarS);
        this.f43611i.execute(new Runnable() { // from class: k6.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f43599a.v(z9);
            }
        });
    }

    public final l6.d k(l6.d dVar) throws i {
        AbstractC2235f abstractC2235fE = this.f43604b.e(l(), dVar.d(), t(), dVar.f());
        int i9 = b.f43617b[abstractC2235fE.b().ordinal()];
        if (i9 == 1) {
            return dVar.o(abstractC2235fE.c(), abstractC2235fE.d(), this.f43606d.b());
        }
        if (i9 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i9 != 3) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        E(null);
        return dVar.r();
    }

    public String l() {
        return this.f43603a.p().b();
    }

    public String m() {
        return this.f43603a.p().c();
    }

    public final synchronized String n() {
        return this.f43612j;
    }

    public final C2200b o() {
        return (C2200b) this.f43607e.get();
    }

    /* JADX WARN: Finally extract failed */
    public final l6.d r() {
        l6.d dVarD;
        synchronized (f43601m) {
            try {
                k6.b bVarA = k6.b.a(this.f43603a.l(), "generatefid.lock");
                try {
                    dVarD = this.f43605c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    /* JADX WARN: Finally extract failed */
    public final l6.d s() {
        l6.d dVarD;
        synchronized (f43601m) {
            try {
                k6.b bVarA = k6.b.a(this.f43603a.l(), "generatefid.lock");
                try {
                    dVarD = this.f43605c.d();
                    if (dVarD.j()) {
                        dVarD = this.f43605c.b(dVarD.t(A(dVarD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    public String t() {
        return this.f43603a.p().e();
    }

    /* JADX WARN: Finally extract failed */
    public final void u(l6.d dVar) {
        synchronized (f43601m) {
            try {
                k6.b bVarA = k6.b.a(this.f43603a.l(), "generatefid.lock");
                try {
                    this.f43605c.b(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void w() {
        x(false);
    }

    public final void z() {
        r.h(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.h(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.h(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(p.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(p.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }
}
