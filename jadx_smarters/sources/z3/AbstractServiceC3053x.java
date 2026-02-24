package z3;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.K;
import d4.k0;
import java.util.HashMap;
import java.util.List;
import z3.C3048s;

/* JADX INFO: renamed from: z3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractServiceC3053x extends Service {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f52815l = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f52816a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f52819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f52820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f52822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f52823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f52824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f52825k;

    /* JADX INFO: renamed from: z3.x$b */
    public static final class b implements C3048s.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f52826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C3048s f52827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f52828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final A3.g f52829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Class f52830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public AbstractServiceC3053x f52831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public A3.c f52832g;

        public b(Context context, C3048s c3048s, boolean z9, A3.g gVar, Class cls) {
            this.f52826a = context;
            this.f52827b = c3048s;
            this.f52828c = z9;
            this.f52829d = gVar;
            this.f52830e = cls;
            c3048s.d(this);
            q();
        }

        @Override // z3.C3048s.d
        public void a(C3048s c3048s, C3032c c3032c, Exception exc) {
            AbstractServiceC3053x abstractServiceC3053x = this.f52831f;
            if (abstractServiceC3053x != null) {
                abstractServiceC3053x.t(c3032c);
            }
            if (p() && AbstractServiceC3053x.s(c3032c.f52715b)) {
                AbstractC1681B.j("DownloadService", "DownloadService wasn't running. Restarting.");
                n();
            }
        }

        @Override // z3.C3048s.d
        public void b(C3048s c3048s, A3.c cVar, int i9) {
            q();
        }

        @Override // z3.C3048s.d
        public final void c(C3048s c3048s) {
            AbstractServiceC3053x abstractServiceC3053x = this.f52831f;
            if (abstractServiceC3053x != null) {
                abstractServiceC3053x.w();
            }
        }

        @Override // z3.C3048s.d
        public void d(C3048s c3048s, C3032c c3032c) {
            AbstractServiceC3053x abstractServiceC3053x = this.f52831f;
            if (abstractServiceC3053x != null) {
                abstractServiceC3053x.u();
            }
        }

        @Override // z3.C3048s.d
        public /* synthetic */ void e(C3048s c3048s, boolean z9) {
            AbstractC3050u.b(this, c3048s, z9);
        }

        @Override // z3.C3048s.d
        public void f(C3048s c3048s, boolean z9) {
            if (z9 || c3048s.g() || !p()) {
                return;
            }
            List listE = c3048s.e();
            for (int i9 = 0; i9 < listE.size(); i9++) {
                if (((C3032c) listE.get(i9)).f52715b == 0) {
                    n();
                    return;
                }
            }
        }

        @Override // z3.C3048s.d
        public void g(C3048s c3048s) {
            AbstractServiceC3053x abstractServiceC3053x = this.f52831f;
            if (abstractServiceC3053x != null) {
                abstractServiceC3053x.v(c3048s.e());
            }
        }

        public void j(final AbstractServiceC3053x abstractServiceC3053x) {
            AbstractC1684a.g(this.f52831f == null);
            this.f52831f = abstractServiceC3053x;
            if (this.f52827b.l()) {
                k0.z().postAtFrontOfQueue(new Runnable() { // from class: z3.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f52839a.m(abstractServiceC3053x);
                    }
                });
            }
        }

        public final void k() {
            A3.c cVar = new A3.c(0);
            if (o(cVar)) {
                this.f52829d.cancel();
                this.f52832g = cVar;
            }
        }

        public void l(AbstractServiceC3053x abstractServiceC3053x) {
            AbstractC1684a.g(this.f52831f == abstractServiceC3053x);
            this.f52831f = null;
        }

        public final /* synthetic */ void m(AbstractServiceC3053x abstractServiceC3053x) {
            abstractServiceC3053x.v(this.f52827b.e());
        }

        public final void n() {
            String str;
            if (this.f52828c) {
                try {
                    k0.l1(this.f52826a, AbstractServiceC3053x.o(this.f52826a, this.f52830e, "com.google.android.exoplayer.downloadService.action.RESTART"));
                    return;
                } catch (IllegalStateException unused) {
                    str = "Failed to restart (foreground launch restriction)";
                }
            } else {
                try {
                    this.f52826a.startService(AbstractServiceC3053x.o(this.f52826a, this.f52830e, "com.google.android.exoplayer.downloadService.action.INIT"));
                    return;
                } catch (IllegalStateException unused2) {
                    str = "Failed to restart (process is idle)";
                }
            }
            AbstractC1681B.j("DownloadService", str);
        }

        public final boolean o(A3.c cVar) {
            return !k0.c(this.f52832g, cVar);
        }

        public final boolean p() {
            AbstractServiceC3053x abstractServiceC3053x = this.f52831f;
            return abstractServiceC3053x == null || abstractServiceC3053x.r();
        }

        public boolean q() {
            boolean zM = this.f52827b.m();
            if (this.f52829d == null) {
                return !zM;
            }
            if (!zM) {
                k();
                return true;
            }
            A3.c cVarI = this.f52827b.i();
            if (!this.f52829d.b(cVarI).equals(cVarI)) {
                k();
                return false;
            }
            if (!o(cVarI)) {
                return true;
            }
            if (this.f52829d.a(cVarI, this.f52826a.getPackageName(), "com.google.android.exoplayer.downloadService.action.RESTART")) {
                this.f52832g = cVarI;
                return true;
            }
            AbstractC1681B.j("DownloadService", "Failed to schedule restart");
            k();
            return false;
        }
    }

    /* JADX INFO: renamed from: z3.x$c */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f52834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f52835c = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f52836d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f52837e;

        public c(int i9, long j9) {
            this.f52833a = i9;
            this.f52834b = j9;
        }

        public void b() {
            if (this.f52837e) {
                f();
            }
        }

        public void c() {
            if (this.f52837e) {
                return;
            }
            f();
        }

        public void d() {
            this.f52836d = true;
            f();
        }

        public void e() {
            this.f52836d = false;
            this.f52835c.removeCallbacksAndMessages(null);
        }

        public final void f() {
            C3048s c3048s = ((b) AbstractC1684a.e(AbstractServiceC3053x.this.f52820f)).f52827b;
            Notification notificationN = AbstractServiceC3053x.this.n(c3048s.e(), c3048s.h());
            if (this.f52837e) {
                ((NotificationManager) AbstractServiceC3053x.this.getSystemService(TransferService.INTENT_KEY_NOTIFICATION)).notify(this.f52833a, notificationN);
            } else {
                AbstractServiceC3053x.this.startForeground(this.f52833a, notificationN);
                this.f52837e = true;
            }
            if (this.f52836d) {
                this.f52835c.removeCallbacksAndMessages(null);
                this.f52835c.postDelayed(new Runnable() { // from class: z3.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f52841a.f();
                    }
                }, this.f52834b);
            }
        }
    }

    public AbstractServiceC3053x(int i9, long j9, String str, int i10, int i11) {
        if (i9 == 0) {
            this.f52816a = null;
            this.f52817c = null;
            this.f52818d = 0;
            this.f52819e = 0;
            return;
        }
        this.f52816a = new c(i9, j9);
        this.f52817c = str;
        this.f52818d = i10;
        this.f52819e = i11;
    }

    public static void A(Context context, Class cls) {
        context.startService(o(context, cls, "com.google.android.exoplayer.downloadService.action.INIT"));
    }

    public static void B(Context context, Class cls) {
        k0.l1(context, p(context, cls, "com.google.android.exoplayer.downloadService.action.INIT", true));
    }

    public static void C(Context context, Intent intent, boolean z9) {
        if (z9) {
            k0.l1(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent i(Context context, Class cls, C3052w c3052w, int i9, boolean z9) {
        return p(context, cls, "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD", z9).putExtra("download_request", c3052w).putExtra("stop_reason", i9);
    }

    public static Intent j(Context context, Class cls, C3052w c3052w, boolean z9) {
        return i(context, cls, c3052w, 0, z9);
    }

    public static Intent k(Context context, Class cls, String str, boolean z9) {
        return p(context, cls, "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD", z9).putExtra("content_id", str);
    }

    public static Intent l(Context context, Class cls, String str, int i9, boolean z9) {
        return p(context, cls, "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON", z9).putExtra("content_id", str).putExtra("stop_reason", i9);
    }

    public static Intent o(Context context, Class cls, String str) {
        return new Intent(context, (Class<?>) cls).setAction(str);
    }

    public static Intent p(Context context, Class cls, String str, boolean z9) {
        return o(context, cls, str).putExtra("foreground", z9);
    }

    public static boolean s(int i9) {
        return i9 == 2 || i9 == 5 || i9 == 7;
    }

    public static void x(Context context, Class cls, C3052w c3052w, boolean z9) {
        C(context, j(context, cls, c3052w, z9), z9);
    }

    public static void y(Context context, Class cls, String str, boolean z9) {
        C(context, k(context, cls, str, z9), z9);
    }

    public static void z(Context context, Class cls, String str, int i9, boolean z9) {
        C(context, l(context, cls, str, i9, z9), z9);
    }

    public abstract C3048s m();

    public abstract Notification n(List list, int i9);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.f52817c;
        if (str != null) {
            K.a(this, str, this.f52818d, this.f52819e, 2);
        }
        Class<?> cls = getClass();
        HashMap map = f52815l;
        b bVar = (b) map.get(cls);
        if (bVar == null) {
            boolean z9 = this.f52816a != null;
            A3.g gVarQ = (z9 && (k0.f39777a < 31)) ? q() : null;
            C3048s c3048sM = m();
            c3048sM.w();
            bVar = new b(getApplicationContext(), c3048sM, z9, gVarQ, cls);
            map.put(cls, bVar);
        }
        this.f52820f = bVar;
        bVar.j(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f52825k = true;
        ((b) AbstractC1684a.e(this.f52820f)).l(this);
        c cVar = this.f52816a;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i9, int i10) {
        String action;
        String stringExtra;
        C3048s c3048s;
        c cVar;
        String str;
        this.f52821g = i10;
        this.f52823i = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.f52822h |= intent.getBooleanExtra("foreground", false) || "com.google.android.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "com.google.android.exoplayer.downloadService.action.INIT";
        }
        c3048s = ((b) AbstractC1684a.e(this.f52820f)).f52827b;
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                C3052w c3052w = (C3052w) ((Intent) AbstractC1684a.e(intent)).getParcelableExtra("download_request");
                if (c3052w != null) {
                    c3048s.c(c3052w, intent.getIntExtra("stop_reason", 0));
                    break;
                } else {
                    str = "Ignored ADD_DOWNLOAD: Missing download_request extra";
                    AbstractC1681B.d("DownloadService", str);
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                c3048s.w();
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                c3048s.u();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                A3.c cVar2 = (A3.c) ((Intent) AbstractC1684a.e(intent)).getParcelableExtra("requirements");
                if (cVar2 != null) {
                    c3048s.z(cVar2);
                    break;
                } else {
                    str = "Ignored SET_REQUIREMENTS: Missing requirements extra";
                    AbstractC1681B.d("DownloadService", str);
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                c3048s.t();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) AbstractC1684a.e(intent)).hasExtra("stop_reason")) {
                    str = "Ignored SET_STOP_REASON: Missing stop_reason extra";
                    AbstractC1681B.d("DownloadService", str);
                    break;
                } else {
                    c3048s.A(stringExtra, intent.getIntExtra("stop_reason", 0));
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    c3048s.v(stringExtra);
                    break;
                } else {
                    str = "Ignored REMOVE_DOWNLOAD: Missing content_id extra";
                    AbstractC1681B.d("DownloadService", str);
                    break;
                }
                break;
            default:
                str = "Ignored unrecognized action: " + action;
                AbstractC1681B.d("DownloadService", str);
                break;
        }
        if (k0.f39777a >= 26 && this.f52822h && (cVar = this.f52816a) != null) {
            cVar.c();
        }
        this.f52824j = false;
        if (c3048s.k()) {
            w();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.f52823i = true;
    }

    public abstract A3.g q();

    public final boolean r() {
        return this.f52824j;
    }

    public final void t(C3032c c3032c) {
        if (this.f52816a != null) {
            if (s(c3032c.f52715b)) {
                this.f52816a.d();
            } else {
                this.f52816a.b();
            }
        }
    }

    public final void u() {
        c cVar = this.f52816a;
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void v(List list) {
        if (this.f52816a != null) {
            for (int i9 = 0; i9 < list.size(); i9++) {
                if (s(((C3032c) list.get(i9)).f52715b)) {
                    this.f52816a.d();
                    return;
                }
            }
        }
    }

    public final void w() {
        boolean zStopSelfResult;
        c cVar = this.f52816a;
        if (cVar != null) {
            cVar.e();
        }
        if (((b) AbstractC1684a.e(this.f52820f)).q()) {
            if (k0.f39777a >= 28 || !this.f52823i) {
                zStopSelfResult = this.f52824j | stopSelfResult(this.f52821g);
            } else {
                stopSelf();
                zStopSelfResult = true;
            }
            this.f52824j = zStopSelfResult;
        }
    }
}
