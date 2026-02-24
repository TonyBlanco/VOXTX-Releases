package q6;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s.C2695a;

/* JADX INFO: loaded from: classes3.dex */
public class d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f47039i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f47041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D f47042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f47043d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f47045f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f47047h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f47044e = new C2695a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47046g = false;

    public d0(FirebaseMessaging firebaseMessaging, I i9, b0 b0Var, D d9, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f47043d = firebaseMessaging;
        this.f47041b = i9;
        this.f47047h = b0Var;
        this.f47042c = d9;
        this.f47040a = context;
        this.f47045f = scheduledExecutorService;
    }

    public static void b(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e9) {
            e = e9;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e10);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e11) {
            e = e11;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static Task e(final FirebaseMessaging firebaseMessaging, final I i9, final D d9, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: q6.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d0.i(context, scheduledExecutorService, firebaseMessaging, i9, d9);
            }
        });
    }

    public static boolean g() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public static /* synthetic */ d0 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, I i9, D d9) {
        return new d0(firebaseMessaging, i9, b0.b(context, scheduledExecutorService), d9, context, scheduledExecutorService);
    }

    public final void a(a0 a0Var, TaskCompletionSource taskCompletionSource) {
        ArrayDeque arrayDeque;
        synchronized (this.f47044e) {
            try {
                String strE = a0Var.e();
                if (this.f47044e.containsKey(strE)) {
                    arrayDeque = (ArrayDeque) this.f47044e.get(strE);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f47044e.put(strE, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) throws IOException {
        b(this.f47042c.j(this.f47043d.c(), str));
    }

    public final void d(String str) throws IOException {
        b(this.f47042c.k(this.f47043d.c(), str));
    }

    public boolean f() {
        return this.f47047h.c() != null;
    }

    public synchronized boolean h() {
        return this.f47046g;
    }

    public final void j(a0 a0Var) {
        synchronized (this.f47044e) {
            try {
                String strE = a0Var.e();
                if (this.f47044e.containsKey(strE)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f47044e.get(strE);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f47044e.remove(strE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(q6.a0 r7) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.d0.k(q6.a0):boolean");
    }

    public void l(Runnable runnable, long j9) {
        this.f47045f.schedule(runnable, j9, TimeUnit.SECONDS);
    }

    public Task m(a0 a0Var) {
        this.f47047h.a(a0Var);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(a0Var, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public synchronized void n(boolean z9) {
        this.f47046g = z9;
    }

    public final void o() {
        if (h()) {
            return;
        }
        s(0L);
    }

    public void p() {
        if (f()) {
            o();
        }
    }

    public Task q(String str) {
        Task taskM = m(a0.f(str));
        p();
        return taskM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (g() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean r() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            q6.b0 r0 = r2.f47047h     // Catch: java.lang.Throwable -> L17
            q6.a0 r0 = r0.c()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = g()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            r0 = 1
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            q6.b0 r1 = r2.f47047h
            r1.e(r0)
            r2.j(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.d0.r():boolean");
    }

    public void s(long j9) {
        l(new e0(this, this.f47040a, this.f47041b, Math.min(Math.max(30L, j9 + j9), f47039i)), j9);
        n(true);
    }
}
