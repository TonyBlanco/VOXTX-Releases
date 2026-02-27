package o0;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2304d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadFactory f45729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BlockingQueue f45730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Executor f45731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static f f45732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile Executor f45733k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f45734a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FutureTask f45735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile g f45736d = g.PENDING;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f45737e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f45738f = new AtomicBoolean();

    /* JADX INFO: renamed from: o0.d$a */
    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f45739a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f45739a.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: o0.d$b */
    public class b extends h {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            AbstractC2304d.this.f45738f.set(true);
            Object objB = null;
            try {
                Process.setThreadPriority(10);
                objB = AbstractC2304d.this.b(this.f45745a);
                Binder.flushPendingCommands();
                return objB;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: o0.d$c */
    public class c extends FutureTask {
        public c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                AbstractC2304d.this.l(get());
            } catch (InterruptedException e9) {
                Log.w("AsyncTask", e9);
            } catch (CancellationException unused) {
                AbstractC2304d.this.l(null);
            } catch (ExecutionException e10) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e10.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: o0.d$d, reason: collision with other inner class name */
    public static /* synthetic */ class C0401d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45742a;

        static {
            int[] iArr = new int[g.values().length];
            f45742a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45742a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: o0.d$e */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2304d f45743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f45744b;

        public e(AbstractC2304d abstractC2304d, Object... objArr) {
            this.f45743a = abstractC2304d;
            this.f45744b = objArr;
        }
    }

    /* JADX INFO: renamed from: o0.d$f */
    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i9 = message.what;
            if (i9 == 1) {
                eVar.f45743a.d(eVar.f45744b[0]);
            } else {
                if (i9 != 2) {
                    return;
                }
                eVar.f45743a.j(eVar.f45744b);
            }
        }
    }

    /* JADX INFO: renamed from: o0.d$g */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX INFO: renamed from: o0.d$h */
    public static abstract class h implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f45745a;
    }

    static {
        a aVar = new a();
        f45729g = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f45730h = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f45731i = threadPoolExecutor;
        f45733k = threadPoolExecutor;
    }

    public AbstractC2304d() {
        b bVar = new b();
        this.f45734a = bVar;
        this.f45735c = new c(bVar);
    }

    public static Handler e() {
        f fVar;
        synchronized (AbstractC2304d.class) {
            try {
                if (f45732j == null) {
                    f45732j = new f();
                }
                fVar = f45732j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public final boolean a(boolean z9) {
        this.f45737e.set(true);
        return this.f45735c.cancel(z9);
    }

    public abstract Object b(Object... objArr);

    public final AbstractC2304d c(Executor executor, Object... objArr) {
        if (this.f45736d == g.PENDING) {
            this.f45736d = g.RUNNING;
            i();
            this.f45734a.f45745a = objArr;
            executor.execute(this.f45735c);
            return this;
        }
        int i9 = C0401d.f45742a[this.f45736d.ordinal()];
        if (i9 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i9 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f45736d = g.FINISHED;
    }

    public final boolean f() {
        return this.f45737e.get();
    }

    public abstract void g(Object obj);

    public abstract void h(Object obj);

    public void i() {
    }

    public void j(Object... objArr) {
    }

    public Object k(Object obj) {
        e().obtainMessage(1, new e(this, obj)).sendToTarget();
        return obj;
    }

    public void l(Object obj) {
        if (this.f45738f.get()) {
            return;
        }
        k(obj);
    }
}
