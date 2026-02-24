package O5;

import O5.C0954s;
import Q5.B;
import Q5.D;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: O5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0949m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final FilenameFilter f6584s = new FilenameFilter() { // from class: O5.l
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C0949m.K(file, str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0956u f6586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0952p f6587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P5.h f6588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0947k f6589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f6590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final T5.f f6591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0937a f6592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final P5.c f6593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final L5.a f6594j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final M5.a f6595k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final O f6596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0954s f6597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public V5.i f6598n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TaskCompletionSource f6599o = new TaskCompletionSource();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f6600p = new TaskCompletionSource();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource f6601q = new TaskCompletionSource();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f6602r = new AtomicBoolean(false);

    /* JADX INFO: renamed from: O5.m$a */
    public class a implements C0954s.a {
        public a() {
        }

        @Override // O5.C0954s.a
        public void a(V5.i iVar, Thread thread, Throwable th) {
            C0949m.this.H(iVar, thread, th);
        }
    }

    /* JADX INFO: renamed from: O5.m$b */
    public class b implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f6604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable f6605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Thread f6606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ V5.i f6607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f6608e;

        /* JADX INFO: renamed from: O5.m$b$a */
        public class a implements SuccessContinuation {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Executor f6610a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f6611b;

            public a(Executor executor, String str) {
                this.f6610a = executor;
                this.f6611b = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task then(V5.d dVar) {
                if (dVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{C0949m.this.N(), C0949m.this.f6596l.w(this.f6610a, b.this.f6608e ? this.f6611b : null)});
                }
                L5.f.f().k("Received null app settings, cannot send reports at crash time.");
                return Tasks.forResult(null);
            }
        }

        public b(long j9, Throwable th, Thread thread, V5.i iVar, boolean z9) {
            this.f6604a = j9;
            this.f6605b = th;
            this.f6606c = thread;
            this.f6607d = iVar;
            this.f6608e = z9;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task call() {
            long jF = C0949m.F(this.f6604a);
            String strB = C0949m.this.B();
            if (strB == null) {
                L5.f.f().d("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            C0949m.this.f6587c.a();
            C0949m.this.f6596l.s(this.f6605b, this.f6606c, strB, jF);
            C0949m.this.w(this.f6604a);
            C0949m.this.t(this.f6607d);
            C0949m.this.v(new C0944h(C0949m.this.f6590f).toString());
            if (!C0949m.this.f6586b.d()) {
                return Tasks.forResult(null);
            }
            Executor executorC = C0949m.this.f6589e.c();
            return this.f6607d.a().onSuccessTask(executorC, new a(executorC, strB));
        }
    }

    /* JADX INFO: renamed from: O5.m$c */
    public class c implements SuccessContinuation {
        public c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task then(Void r12) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: O5.m$d */
    public class d implements SuccessContinuation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Task f6614a;

        /* JADX INFO: renamed from: O5.m$d$a */
        public class a implements Callable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Boolean f6616a;

            /* JADX INFO: renamed from: O5.m$d$a$a, reason: collision with other inner class name */
            public class C0074a implements SuccessContinuation {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Executor f6618a;

                public C0074a(Executor executor) {
                    this.f6618a = executor;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Task then(V5.d dVar) {
                    if (dVar == null) {
                        L5.f.f().k("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        C0949m.this.N();
                        C0949m.this.f6596l.v(this.f6618a);
                        C0949m.this.f6601q.trySetResult(null);
                    }
                    return Tasks.forResult(null);
                }
            }

            public a(Boolean bool) {
                this.f6616a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task call() {
                if (this.f6616a.booleanValue()) {
                    L5.f.f().b("Sending cached crash reports...");
                    C0949m.this.f6586b.c(this.f6616a.booleanValue());
                    Executor executorC = C0949m.this.f6589e.c();
                    return d.this.f6614a.onSuccessTask(executorC, new C0074a(executorC));
                }
                L5.f.f().i("Deleting cached crash reports...");
                C0949m.r(C0949m.this.L());
                C0949m.this.f6596l.u();
                C0949m.this.f6601q.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        public d(Task task) {
            this.f6614a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task then(Boolean bool) {
            return C0949m.this.f6589e.h(new a(bool));
        }
    }

    /* JADX INFO: renamed from: O5.m$e */
    public class e implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f6620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f6621b;

        public e(long j9, String str) {
            this.f6620a = j9;
            this.f6621b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (C0949m.this.J()) {
                return null;
            }
            C0949m.this.f6593i.g(this.f6620a, this.f6621b);
            return null;
        }
    }

    /* JADX INFO: renamed from: O5.m$f */
    public class f implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6623a;

        public f(String str) {
            this.f6623a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            C0949m.this.v(this.f6623a);
            return null;
        }
    }

    /* JADX INFO: renamed from: O5.m$g */
    public class g implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f6625a;

        public g(long j9) {
            this.f6625a = j9;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f6625a);
            C0949m.this.f6595k.a("_ae", bundle);
            return null;
        }
    }

    public C0949m(Context context, C0947k c0947k, y yVar, C0956u c0956u, T5.f fVar, C0952p c0952p, C0937a c0937a, P5.h hVar, P5.c cVar, O o9, L5.a aVar, M5.a aVar2) {
        this.f6585a = context;
        this.f6589e = c0947k;
        this.f6590f = yVar;
        this.f6586b = c0956u;
        this.f6591g = fVar;
        this.f6587c = c0952p;
        this.f6592h = c0937a;
        this.f6588d = hVar;
        this.f6593i = cVar;
        this.f6594j = aVar;
        this.f6595k = aVar2;
        this.f6596l = o9;
    }

    public static boolean A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static long C() {
        return F(System.currentTimeMillis());
    }

    public static List D(L5.g gVar, String str, T5.f fVar, byte[] bArr) {
        File fileO = fVar.o(str, "user-data");
        File fileO2 = fVar.o(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0943g("logs_file", "logs", bArr));
        arrayList.add(new x("crash_meta_file", "metadata", gVar.d()));
        arrayList.add(new x("session_meta_file", "session", gVar.g()));
        arrayList.add(new x("app_meta_file", "app", gVar.e()));
        arrayList.add(new x("device_meta_file", "device", gVar.a()));
        arrayList.add(new x("os_meta_file", "os", gVar.f()));
        arrayList.add(P(gVar));
        arrayList.add(new x("user_meta_file", "user", fileO));
        arrayList.add(new x("keys_file", "keys", fileO2));
        return arrayList;
    }

    public static long F(long j9) {
        return j9 / 1000;
    }

    public static /* synthetic */ boolean K(File file, String str) {
        return str.startsWith(".ae");
    }

    public static boolean O(String str, File file, B.a aVar) {
        if (file == null || !file.exists()) {
            L5.f.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            L5.f.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    public static B P(L5.g gVar) {
        File fileC = gVar.c();
        return (fileC == null || !fileC.exists()) ? new C0943g("minidump_file", "minidump", new byte[]{0}) : new x("minidump_file", "minidump", fileC);
    }

    public static byte[] R(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i9 = inputStream.read(bArr);
            if (i9 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i9);
        }
    }

    public static D.a o(y yVar, C0937a c0937a) {
        return D.a.b(yVar.f(), c0937a.f6554f, c0937a.f6555g, yVar.a().c(), EnumC0957v.determineFrom(c0937a.f6552d).getId(), c0937a.f6556h);
    }

    public static D.b p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return D.b.c(AbstractC0945i.m(), Build.MODEL, Runtime.getRuntime().availableProcessors(), AbstractC0945i.t(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), AbstractC0945i.z(), AbstractC0945i.n(), Build.MANUFACTURER, Build.PRODUCT);
    }

    public static D.c q() {
        return D.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, AbstractC0945i.A());
    }

    public static void r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public final String B() {
        SortedSet sortedSetO = this.f6596l.o();
        if (sortedSetO.isEmpty()) {
            return null;
        }
        return (String) sortedSetO.first();
    }

    public final InputStream E(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            L5.f.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        L5.f.f().g("No version control information found");
        return null;
    }

    public String G() {
        InputStream inputStreamE = E("META-INF/version-control-info.textproto");
        if (inputStreamE == null) {
            return null;
        }
        L5.f.f().b("Read version control info");
        return Base64.encodeToString(R(inputStreamE), 0);
    }

    public void H(V5.i iVar, Thread thread, Throwable th) {
        I(iVar, thread, th, false);
    }

    public synchronized void I(V5.i iVar, Thread thread, Throwable th, boolean z9) {
        L5.f.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            W.f(this.f6589e.h(new b(System.currentTimeMillis(), th, thread, iVar, z9)));
        } catch (TimeoutException unused) {
            L5.f.f().d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e9) {
            L5.f.f().e("Error handling uncaught exception", e9);
        }
    }

    public boolean J() {
        C0954s c0954s = this.f6597m;
        return c0954s != null && c0954s.a();
    }

    public List L() {
        return this.f6591g.f(f6584s);
    }

    public final Task M(long j9) {
        if (A()) {
            L5.f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        L5.f.f().b("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new g(j9));
    }

    public final Task N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                L5.f.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public void Q(String str) {
        this.f6589e.g(new f(str));
    }

    public void S() {
        try {
            String strG = G();
            if (strG != null) {
                T("com.crashlytics.version-control-info", strG);
                L5.f.f().g("Saved version control info");
            }
        } catch (IOException e9) {
            L5.f.f().l("Unable to save version control info", e9);
        }
    }

    public void T(String str, String str2) {
        try {
            this.f6588d.h(str, str2);
        } catch (IllegalArgumentException e9) {
            Context context = this.f6585a;
            if (context != null && AbstractC0945i.x(context)) {
                throw e9;
            }
            L5.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public Task U(Task task) {
        if (this.f6596l.m()) {
            L5.f.f().i("Crash reports are available to be sent.");
            return V().onSuccessTask(new d(task));
        }
        L5.f.f().i("No crash reports are available to be sent.");
        this.f6599o.trySetResult(Boolean.FALSE);
        return Tasks.forResult(null);
    }

    public final Task V() {
        if (this.f6586b.d()) {
            L5.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f6599o.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        L5.f.f().b("Automatic data collection is disabled.");
        L5.f.f().i("Notifying that unsent reports are available.");
        this.f6599o.trySetResult(Boolean.TRUE);
        Task taskOnSuccessTask = this.f6586b.h().onSuccessTask(new c());
        L5.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return W.n(taskOnSuccessTask, this.f6600p.getTask());
    }

    public final void W(String str) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 30) {
            L5.f.f().i("ANR feature enabled, but device is API " + i9);
            return;
        }
        List historicalProcessExitReasons = ((ActivityManager) this.f6585a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f6596l.t(str, historicalProcessExitReasons, new P5.c(this.f6591g, str), P5.h.f(str, this.f6591g, this.f6589e));
        } else {
            L5.f.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    public void X(long j9, String str) {
        this.f6589e.g(new e(j9, str));
    }

    public boolean s() {
        if (!this.f6587c.c()) {
            String strB = B();
            return strB != null && this.f6594j.d(strB);
        }
        L5.f.f().i("Found previous crash marker.");
        this.f6587c.d();
        return true;
    }

    public void t(V5.i iVar) {
        u(false, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(boolean z9, V5.i iVar) {
        ArrayList arrayList = new ArrayList(this.f6596l.o());
        if (arrayList.size() <= z9) {
            L5.f.f().i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z9 ? 1 : 0);
        if (iVar.b().f10070b.f10078b) {
            W(str);
        } else {
            L5.f.f().i("ANR feature disabled.");
        }
        if (this.f6594j.d(str)) {
            y(str);
        }
        this.f6596l.j(C(), z9 != 0 ? (String) arrayList.get(0) : null);
    }

    public final void v(String str) {
        long jC = C();
        L5.f.f().b("Opening a new session with ID " + str);
        this.f6594j.c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C0951o.i()), jC, Q5.D.b(o(this.f6590f, this.f6592h), q(), p()));
        this.f6593i.e(str);
        this.f6596l.p(str, jC);
    }

    public final void w(long j9) {
        try {
            if (this.f6591g.e(".ae" + j9).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e9) {
            L5.f.f().l("Could not create app exception marker file.", e9);
        }
    }

    public void x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, V5.i iVar) {
        this.f6598n = iVar;
        Q(str);
        C0954s c0954s = new C0954s(new a(), iVar, uncaughtExceptionHandler, this.f6594j);
        this.f6597m = c0954s;
        Thread.setDefaultUncaughtExceptionHandler(c0954s);
    }

    public final void y(String str) {
        L5.f.f().i("Finalizing native report for session " + str);
        L5.g gVarA = this.f6594j.a(str);
        File fileC = gVarA.c();
        B.a aVarB = gVarA.b();
        if (O(str, fileC, aVarB)) {
            L5.f.f().k("No native core present");
            return;
        }
        long jLastModified = fileC.lastModified();
        P5.c cVar = new P5.c(this.f6591g, str);
        File fileI = this.f6591g.i(str);
        if (!fileI.isDirectory()) {
            L5.f.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        w(jLastModified);
        List listD = D(gVarA, str, this.f6591g, cVar.b());
        C.b(fileI, listD);
        L5.f.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f6596l.i(str, listD, aVarB);
        cVar.a();
    }

    public boolean z(V5.i iVar) {
        this.f6589e.b();
        if (J()) {
            L5.f.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        L5.f.f().i("Finalizing previously open sessions.");
        try {
            u(true, iVar);
            L5.f.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e9) {
            L5.f.f().e("Unable to finalize previously open sessions.", e9);
            return false;
        }
    }
}
