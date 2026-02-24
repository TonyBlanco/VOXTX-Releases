package l1;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q1.RunnableC2531d;

/* JADX INFO: renamed from: l1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2172a extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: l1.a$a, reason: collision with other inner class name */
    public static final class C0371a extends FutureTask implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RunnableC2531d f43863a;

        public C0371a(RunnableC2531d runnableC2531d) {
            super(runnableC2531d, null);
            this.f43863a = runnableC2531d;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0371a c0371a) {
            k1.e eVarE = this.f43863a.e();
            k1.e eVarE2 = c0371a.f43863a.e();
            return eVarE == eVarE2 ? this.f43863a.f46782c - c0371a.f43863a.f46782c : eVarE2.ordinal() - eVarE.ordinal();
        }
    }

    public C2172a(int i9, ThreadFactory threadFactory) {
        super(i9, i9, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), threadFactory);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        C0371a c0371a = new C0371a((RunnableC2531d) runnable);
        execute(c0371a);
        return c0371a;
    }
}
