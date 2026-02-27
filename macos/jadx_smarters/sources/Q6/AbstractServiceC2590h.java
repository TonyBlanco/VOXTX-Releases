package q6;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import q6.i0;

/* JADX INFO: renamed from: q6.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractServiceC2590h extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Binder f47069c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47071e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f47068a = AbstractC2597o.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f47070d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47072f = 0;

    /* JADX INFO: renamed from: q6.h$a */
    public class a implements i0.a {
        public a() {
        }

        @Override // q6.i0.a
        public Task a(Intent intent) {
            return AbstractServiceC2590h.this.h(intent);
        }
    }

    public final void b(Intent intent) {
        if (intent != null) {
            f0.b(intent);
        }
        synchronized (this.f47070d) {
            try {
                int i9 = this.f47072f - 1;
                this.f47072f = i9;
                if (i9 == 0) {
                    i(this.f47071e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Intent c(Intent intent);

    public abstract void d(Intent intent);

    public boolean e(Intent intent) {
        return false;
    }

    public /* synthetic */ void f(Intent intent, Task task) {
        b(intent);
    }

    public /* synthetic */ void g(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            d(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    public final Task h(final Intent intent) {
        if (e(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f47068a.execute(new Runnable() { // from class: q6.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f47060a.g(intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public boolean i(int i9) {
        return stopSelfResult(i9);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f47069c == null) {
                this.f47069c = new i0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f47069c;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f47068a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i9, int i10) {
        synchronized (this.f47070d) {
            this.f47071e = i10;
            this.f47072f++;
        }
        Intent intentC = c(intent);
        if (intentC == null) {
            b(intent);
            return 2;
        }
        Task taskH = h(intentC);
        if (taskH.isComplete()) {
            b(intent);
            return 2;
        }
        taskH.addOnCompleteListener(new Executor() { // from class: q6.g
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new OnCompleteListener() { // from class: q6.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f47048a.f(intent, task);
            }
        });
        return 3;
    }
}
