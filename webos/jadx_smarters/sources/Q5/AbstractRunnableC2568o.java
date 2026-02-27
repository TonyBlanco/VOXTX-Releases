package q5;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: q5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC2568o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f46920a;

    public AbstractRunnableC2568o() {
        this.f46920a = null;
    }

    public AbstractRunnableC2568o(TaskCompletionSource taskCompletionSource) {
        this.f46920a = taskCompletionSource;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f46920a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f46920a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e9) {
            a(e9);
        }
    }
}
