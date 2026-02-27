package q6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class l0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47084a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f47085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f47086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Queue f47087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f47088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47089g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f47090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TaskCompletionSource f47091b = new TaskCompletionSource();

        public a(Intent intent) {
            this.f47090a = intent;
        }

        public void a(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: q6.k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47081a.d();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            c().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: q6.j0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        public void b() {
            this.f47091b.trySetResult(null);
        }

        public Task c() {
            return this.f47091b.getTask();
        }

        public /* synthetic */ void d() {
            String action = this.f47090a.getAction();
            StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
            sb.append("Service took too long to process intent: ");
            sb.append(action);
            sb.append(" App may get closed.");
            Log.w("FirebaseMessaging", sb.toString());
            b();
        }
    }

    public l0(Context context, String str) {
        this(context, "com.google.firebase.MESSAGING_EVENT", new ScheduledThreadPoolExecutor(0, new D4.b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    public l0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f47087e = new ArrayDeque();
        this.f47089g = false;
        Context applicationContext = context.getApplicationContext();
        this.f47084a = applicationContext;
        this.f47085c = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f47086d = scheduledExecutorService;
    }

    public final void a() {
        while (!this.f47087e.isEmpty()) {
            ((a) this.f47087e.poll()).b();
        }
    }

    public final synchronized void b() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f47087e.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                i0 i0Var = this.f47088f;
                if (i0Var == null || !i0Var.isBinderAlive()) {
                    d();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f47088f.b((a) this.f47087e.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Task c(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.a(this.f47086d);
            this.f47087e.add(aVar);
            b();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.c();
    }

    public final void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            boolean z9 = this.f47089g;
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(!z9);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f47089g) {
            return;
        }
        this.f47089g = true;
        try {
            if (B4.b.b().a(this.f47084a, this.f47085c, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e9) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e9);
        }
        this.f47089g = false;
        a();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: ".concat(String.valueOf(componentName)));
            }
            this.f47089g = false;
            if (iBinder instanceof i0) {
                this.f47088f = (i0) iBinder;
                b();
            } else {
                Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(iBinder)));
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
        }
        b();
    }
}
