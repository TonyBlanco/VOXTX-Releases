package O5;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: O5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0947k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f6576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Task f6577b = Tasks.forResult(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6578c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f6579d = new ThreadLocal();

    /* JADX INFO: renamed from: O5.k$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0947k.this.f6579d.set(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: O5.k$b */
    public class b implements Continuation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callable f6581a;

        public b(Callable callable) {
            this.f6581a = callable;
        }

        @Override // com.google.android.gms.tasks.Continuation
        public Object then(Task task) {
            return this.f6581a.call();
        }
    }

    /* JADX INFO: renamed from: O5.k$c */
    public class c implements Continuation {
        public c() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(Task task) {
            return null;
        }
    }

    public C0947k(Executor executor) {
        this.f6576a = executor;
        executor.execute(new a());
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.f6576a;
    }

    public final Task d(Task task) {
        return task.continueWith(this.f6576a, new c());
    }

    public final boolean e() {
        return Boolean.TRUE.equals(this.f6579d.get());
    }

    public final Continuation f(Callable callable) {
        return new b(callable);
    }

    public Task g(Callable callable) {
        Task taskContinueWith;
        synchronized (this.f6578c) {
            taskContinueWith = this.f6577b.continueWith(this.f6576a, f(callable));
            this.f6577b = d(taskContinueWith);
        }
        return taskContinueWith;
    }

    public Task h(Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.f6578c) {
            taskContinueWithTask = this.f6577b.continueWithTask(this.f6576a, f(callable));
            this.f6577b = d(taskContinueWithTask);
        }
        return taskContinueWithTask;
    }
}
