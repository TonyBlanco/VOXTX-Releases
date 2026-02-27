package O5;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: O5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0951o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A5.f f6629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0956u f6630c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0952p f6633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0952p f6634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0949m f6636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f6637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final T5.f f6638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N5.b f6639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final M5.a f6640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ExecutorService f6641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0947k f6642o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0946j f6643p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final L5.a f6644q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6632e = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f6631d = new D();

    /* JADX INFO: renamed from: O5.o$a */
    public class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V5.i f6645a;

        public a(V5.i iVar) {
            this.f6645a = iVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task call() {
            return C0951o.this.f(this.f6645a);
        }
    }

    /* JADX INFO: renamed from: O5.o$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V5.i f6647a;

        public b(V5.i iVar) {
            this.f6647a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0951o.this.f(this.f6647a);
        }
    }

    /* JADX INFO: renamed from: O5.o$c */
    public class c implements Callable {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean zD = C0951o.this.f6633f.d();
                if (!zD) {
                    L5.f.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(zD);
            } catch (Exception e9) {
                L5.f.f().e("Problem encountered deleting Crashlytics initialization marker.", e9);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: renamed from: O5.o$d */
    public class d implements Callable {
        public d() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(C0951o.this.f6636i.s());
        }
    }

    public C0951o(A5.f fVar, y yVar, L5.a aVar, C0956u c0956u, N5.b bVar, M5.a aVar2, T5.f fVar2, ExecutorService executorService, C0946j c0946j) {
        this.f6629b = fVar;
        this.f6630c = c0956u;
        this.f6628a = fVar.l();
        this.f6637j = yVar;
        this.f6644q = aVar;
        this.f6639l = bVar;
        this.f6640m = aVar2;
        this.f6641n = executorService;
        this.f6638k = fVar2;
        this.f6642o = new C0947k(executorService);
        this.f6643p = c0946j;
    }

    public static String i() {
        return "18.4.1";
    }

    public static boolean j(String str, boolean z9) {
        if (!z9) {
            L5.f.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", InstructionFileId.DOT);
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", InstructionFileId.DOT);
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", InstructionFileId.DOT);
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", InstructionFileId.DOT);
        return false;
    }

    public final void d() {
        boolean zEquals;
        try {
            zEquals = Boolean.TRUE.equals((Boolean) W.f(this.f6642o.g(new d())));
        } catch (Exception unused) {
            zEquals = false;
        }
        this.f6635h = zEquals;
    }

    public boolean e() {
        return this.f6633f.c();
    }

    public final Task f(V5.i iVar) {
        m();
        try {
            this.f6639l.a(new N5.a() { // from class: O5.n
                @Override // N5.a
                public final void a(String str) {
                    this.f6627a.k(str);
                }
            });
            this.f6636i.S();
            if (!iVar.b().f10070b.f10077a) {
                L5.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f6636i.z(iVar)) {
                L5.f.f().k("Previous sessions could not be finalized.");
            }
            return this.f6636i.U(iVar.a());
        } catch (Exception e9) {
            L5.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", e9);
            return Tasks.forException(e9);
        } finally {
            l();
        }
    }

    public Task g(V5.i iVar) {
        return W.h(this.f6641n, new a(iVar));
    }

    public final void h(V5.i iVar) {
        L5.f fVarF;
        String str;
        Future<?> futureSubmit = this.f6641n.submit(new b(iVar));
        L5.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e9) {
            e = e9;
            fVarF = L5.f.f();
            str = "Crashlytics was interrupted during initialization.";
            fVarF.e(str, e);
        } catch (ExecutionException e10) {
            e = e10;
            fVarF = L5.f.f();
            str = "Crashlytics encountered a problem during initialization.";
            fVarF.e(str, e);
        } catch (TimeoutException e11) {
            e = e11;
            fVarF = L5.f.f();
            str = "Crashlytics timed out during initialization.";
            fVarF.e(str, e);
        }
    }

    public void k(String str) {
        this.f6636i.X(System.currentTimeMillis() - this.f6632e, str);
    }

    public void l() {
        this.f6642o.g(new c());
    }

    public void m() {
        this.f6642o.b();
        this.f6633f.a();
        L5.f.f().i("Initialization marker file was created.");
    }

    public boolean n(C0937a c0937a, V5.i iVar) {
        if (!j(c0937a.f6550b, AbstractC0945i.k(this.f6628a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String string = new C0944h(this.f6637j).toString();
        try {
            this.f6634g = new C0952p("crash_marker", this.f6638k);
            this.f6633f = new C0952p("initialization_marker", this.f6638k);
            P5.h hVar = new P5.h(string, this.f6638k, this.f6642o);
            P5.c cVar = new P5.c(this.f6638k);
            this.f6636i = new C0949m(this.f6628a, this.f6642o, this.f6637j, this.f6630c, this.f6638k, this.f6634g, c0937a, hVar, cVar, O.g(this.f6628a, this.f6637j, this.f6638k, c0937a, cVar, hVar, new W5.a(1024, new W5.c(10)), iVar, this.f6631d, this.f6643p), this.f6644q, this.f6640m);
            boolean zE = e();
            d();
            this.f6636i.x(string, Thread.getDefaultUncaughtExceptionHandler(), iVar);
            if (!zE || !AbstractC0945i.c(this.f6628a)) {
                L5.f.f().b("Successfully configured exception handler.");
                return true;
            }
            L5.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            h(iVar);
            return false;
        } catch (Exception e9) {
            L5.f.f().e("Crashlytics was not started due to an exception during initialization", e9);
            this.f6636i = null;
            return false;
        }
    }
}
