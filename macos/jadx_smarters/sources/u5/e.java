package U5;

import C2.l;
import L5.f;
import O5.D;
import O5.W;
import O5.r;
import android.database.SQLException;
import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z2.AbstractC3015c;
import z2.EnumC3016d;
import z2.InterfaceC3018f;
import z2.InterfaceC3020h;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f9820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f9821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BlockingQueue f9825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f9826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC3018f f9827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D f9828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f9830k;

    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f9831a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TaskCompletionSource f9832c;

        public b(r rVar, TaskCompletionSource taskCompletionSource) {
            this.f9831a = rVar;
            this.f9832c = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.p(this.f9831a, this.f9832c);
            e.this.f9828i.c();
            double dG = e.this.g();
            f.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f9831a.d());
            e.q(dG);
        }
    }

    public e(double d9, double d10, long j9, InterfaceC3018f interfaceC3018f, D d11) {
        this.f9820a = d9;
        this.f9821b = d10;
        this.f9822c = j9;
        this.f9827h = interfaceC3018f;
        this.f9828i = d11;
        this.f9823d = SystemClock.elapsedRealtime();
        int i9 = (int) d9;
        this.f9824e = i9;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i9);
        this.f9825f = arrayBlockingQueue;
        this.f9826g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f9829j = 0;
        this.f9830k = 0L;
    }

    public e(InterfaceC3018f interfaceC3018f, V5.d dVar, D d9) {
        this(dVar.f10074f, dVar.f10075g, ((long) dVar.f10076h) * 1000, interfaceC3018f, d9);
    }

    public static void q(double d9) {
        try {
            Thread.sleep((long) d9);
        } catch (InterruptedException unused) {
        }
    }

    public final double g() {
        return Math.min(3600000.0d, (60000.0d / this.f9820a) * Math.pow(this.f9821b, h()));
    }

    public final int h() {
        if (this.f9830k == 0) {
            this.f9830k = o();
        }
        int iO = (int) ((o() - this.f9830k) / this.f9822c);
        int iMin = l() ? Math.min(100, this.f9829j + iO) : Math.max(0, this.f9829j - iO);
        if (this.f9829j != iMin) {
            this.f9829j = iMin;
            this.f9830k = o();
        }
        return iMin;
    }

    public TaskCompletionSource i(r rVar, boolean z9) {
        synchronized (this.f9825f) {
            try {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                if (!z9) {
                    p(rVar, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.f9828i.b();
                if (!k()) {
                    h();
                    f.f().b("Dropping report due to queue being full: " + rVar.d());
                    this.f9828i.a();
                    taskCompletionSource.trySetResult(rVar);
                    return taskCompletionSource;
                }
                f.f().b("Enqueueing report: " + rVar.d());
                f.f().b("Queue size: " + this.f9825f.size());
                this.f9826g.execute(new b(rVar, taskCompletionSource));
                f.f().b("Closing task for report: " + rVar.d());
                taskCompletionSource.trySetResult(rVar);
                return taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: U5.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f9818a.m(countDownLatch);
            }
        }).start();
        W.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public final boolean k() {
        return this.f9825f.size() < this.f9824e;
    }

    public final boolean l() {
        return this.f9825f.size() == this.f9824e;
    }

    public final /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.f9827h, EnumC3016d.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    public final /* synthetic */ void n(TaskCompletionSource taskCompletionSource, boolean z9, r rVar, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z9) {
            j();
        }
        taskCompletionSource.trySetResult(rVar);
    }

    public final long o() {
        return System.currentTimeMillis();
    }

    public final void p(final r rVar, final TaskCompletionSource taskCompletionSource) {
        f.f().b("Sending report through Google DataTransport: " + rVar.d());
        final boolean z9 = SystemClock.elapsedRealtime() - this.f9823d < 2000;
        this.f9827h.b(AbstractC3015c.h(rVar.b()), new InterfaceC3020h() { // from class: U5.c
            @Override // z2.InterfaceC3020h
            public final void a(Exception exc) {
                this.f9814a.n(taskCompletionSource, z9, rVar, exc);
            }
        });
    }
}
