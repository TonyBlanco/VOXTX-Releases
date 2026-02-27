package O5;

import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f6548a = AbstractC0958w.c("awaitEvenIfOnMainThread task continuation executor");

    public static Object f(Task task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f6548a, new Continuation() { // from class: O5.Q
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return W.i(countDownLatch, task2);
            }
        });
        countDownLatch.await(Looper.getMainLooper() == Looper.myLooper() ? 3L : 4L, TimeUnit.SECONDS);
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    public static boolean g(CountDownLatch countDownLatch, long j9, TimeUnit timeUnit) {
        boolean z9 = false;
        try {
            long nanos = timeUnit.toNanos(j9);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z9 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static Task h(final Executor executor, final Callable callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: O5.S
            @Override // java.lang.Runnable
            public final void run() {
                W.k(callable, executor, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public static /* synthetic */ Object i(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    public static /* synthetic */ Object j(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    public static /* synthetic */ void k(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: O5.V
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return W.j(taskCompletionSource, task);
                }
            });
        } catch (Exception e9) {
            taskCompletionSource.setException(e9);
        }
    }

    public static /* synthetic */ Void l(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    public static /* synthetic */ Void m(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    public static Task n(Task task, Task task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation continuation = new Continuation() { // from class: O5.U
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return W.l(taskCompletionSource, task3);
            }
        };
        task.continueWith(continuation);
        task2.continueWith(continuation);
        return taskCompletionSource.getTask();
    }

    public static Task o(Executor executor, Task task, Task task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation continuation = new Continuation() { // from class: O5.T
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return W.m(taskCompletionSource, task3);
            }
        };
        task.continueWith(executor, continuation);
        task2.continueWith(executor, continuation);
        return taskCompletionSource.getTask();
    }
}
