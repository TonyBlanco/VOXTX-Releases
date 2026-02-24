package M;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4157b;

        /* JADX INFO: renamed from: M.h$a$a, reason: collision with other inner class name */
        public static class C0068a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f4158a;

            public C0068a(Runnable runnable, String str, int i9) {
                super(runnable, str);
                this.f4158a = i9;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f4158a);
                super.run();
            }
        }

        public a(String str, int i9) {
            this.f4156a = str;
            this.f4157b = i9;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0068a(runnable, this.f4156a, this.f4157b);
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Callable f4159a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public O.a f4160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Handler f4161d;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ O.a f4162a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f4163c;

            public a(O.a aVar, Object obj) {
                this.f4162a = aVar;
                this.f4163c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f4162a.accept(this.f4163c);
            }
        }

        public b(Handler handler, Callable callable, O.a aVar) {
            this.f4159a = callable;
            this.f4160c = aVar;
            this.f4161d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f4159a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f4161d.post(new a(this.f4160c, objCall));
        }
    }

    public static ThreadPoolExecutor a(String str, int i9, int i10) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i10, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i9));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void b(Executor executor, Callable callable, O.a aVar) {
        executor.execute(new b(M.b.a(), callable, aVar));
    }

    public static Object c(ExecutorService executorService, Callable callable, int i9) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i9, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e9) {
            throw e9;
        } catch (ExecutionException e10) {
            throw new RuntimeException(e10);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
