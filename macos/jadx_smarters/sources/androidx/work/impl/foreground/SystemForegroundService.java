package androidx.work.impl.foreground;

import Q0.k;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.r;
import androidx.work.impl.foreground.a;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends r implements a.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f17373g = k.f("SystemFgService");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static SystemForegroundService f17374h = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f17375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.impl.foreground.a f17377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NotificationManager f17378f;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17379a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Notification f17380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f17381d;

        public a(int i9, Notification notification, int i10) {
            this.f17379a = i9;
            this.f17380c = notification;
            this.f17381d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f17379a, this.f17380c, this.f17381d);
            } else {
                SystemForegroundService.this.startForeground(this.f17379a, this.f17380c);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17383a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Notification f17384c;

        public b(int i9, Notification notification) {
            this.f17383a = i9;
            this.f17384c = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f17378f.notify(this.f17383a, this.f17384c);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17386a;

        public c(int i9) {
            this.f17386a = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f17378f.cancel(this.f17386a);
        }
    }

    private void e() {
        this.f17375c = new Handler(Looper.getMainLooper());
        this.f17378f = (NotificationManager) getApplicationContext().getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f17377e = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i9, Notification notification) {
        this.f17375c.post(new b(i9, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i9, int i10, Notification notification) {
        this.f17375c.post(new a(i9, notification, i10));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i9) {
        this.f17375c.post(new c(i9));
    }

    @Override // androidx.lifecycle.r, android.app.Service
    public void onCreate() {
        super.onCreate();
        f17374h = this;
        e();
    }

    @Override // androidx.lifecycle.r, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f17377e.k();
    }

    @Override // androidx.lifecycle.r, android.app.Service
    public int onStartCommand(Intent intent, int i9, int i10) {
        super.onStartCommand(intent, i9, i10);
        if (this.f17376d) {
            k.c().d(f17373g, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f17377e.k();
            e();
            this.f17376d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f17377e.l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f17376d = true;
        k.c().a(f17373g, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f17374h = null;
        stopSelf();
    }
}
