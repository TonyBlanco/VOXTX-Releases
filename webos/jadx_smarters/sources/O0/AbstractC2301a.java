package o0;

import L.s;
import O.i;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2301a extends AbstractC2303c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f45703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile RunnableC0400a f45704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile RunnableC0400a f45705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f45706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f45707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f45708n;

    /* JADX INFO: renamed from: o0.a$a, reason: collision with other inner class name */
    public final class RunnableC0400a extends AbstractC2304d implements Runnable {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final CountDownLatch f45709l = new CountDownLatch(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f45710m;

        public RunnableC0400a() {
        }

        @Override // o0.AbstractC2304d
        public void g(Object obj) {
            try {
                AbstractC2301a.this.B(this, obj);
            } finally {
                this.f45709l.countDown();
            }
        }

        @Override // o0.AbstractC2304d
        public void h(Object obj) {
            try {
                AbstractC2301a.this.C(this, obj);
            } finally {
                this.f45709l.countDown();
            }
        }

        @Override // o0.AbstractC2304d
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Object b(Void... voidArr) {
            try {
                return AbstractC2301a.this.H();
            } catch (s e9) {
                if (f()) {
                    return null;
                }
                throw e9;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45710m = false;
            AbstractC2301a.this.D();
        }
    }

    public AbstractC2301a(Context context) {
        this(context, AbstractC2304d.f45731i);
    }

    public AbstractC2301a(Context context, Executor executor) {
        super(context);
        this.f45707m = -10000L;
        this.f45703i = executor;
    }

    public void A() {
    }

    public void B(RunnableC0400a runnableC0400a, Object obj) {
        G(obj);
        if (this.f45705k == runnableC0400a) {
            v();
            this.f45707m = SystemClock.uptimeMillis();
            this.f45705k = null;
            e();
            D();
        }
    }

    public void C(RunnableC0400a runnableC0400a, Object obj) {
        if (this.f45704j != runnableC0400a) {
            B(runnableC0400a, obj);
            return;
        }
        if (j()) {
            G(obj);
            return;
        }
        c();
        this.f45707m = SystemClock.uptimeMillis();
        this.f45704j = null;
        f(obj);
    }

    public void D() {
        if (this.f45705k != null || this.f45704j == null) {
            return;
        }
        if (this.f45704j.f45710m) {
            this.f45704j.f45710m = false;
            this.f45708n.removeCallbacks(this.f45704j);
        }
        if (this.f45706l <= 0 || SystemClock.uptimeMillis() >= this.f45707m + this.f45706l) {
            this.f45704j.c(this.f45703i, null);
        } else {
            this.f45704j.f45710m = true;
            this.f45708n.postAtTime(this.f45704j, this.f45707m + this.f45706l);
        }
    }

    public boolean E() {
        return this.f45705k != null;
    }

    public abstract Object F();

    public abstract void G(Object obj);

    public Object H() {
        return F();
    }

    @Override // o0.AbstractC2303c
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f45704j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f45704j);
            printWriter.print(" waiting=");
            printWriter.println(this.f45704j.f45710m);
        }
        if (this.f45705k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f45705k);
            printWriter.print(" waiting=");
            printWriter.println(this.f45705k.f45710m);
        }
        if (this.f45706l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            i.c(this.f45706l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            i.b(this.f45707m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // o0.AbstractC2303c
    public boolean n() {
        if (this.f45704j == null) {
            return false;
        }
        if (!this.f45723d) {
            this.f45726g = true;
        }
        if (this.f45705k != null) {
            if (this.f45704j.f45710m) {
                this.f45704j.f45710m = false;
                this.f45708n.removeCallbacks(this.f45704j);
            }
            this.f45704j = null;
            return false;
        }
        if (this.f45704j.f45710m) {
            this.f45704j.f45710m = false;
            this.f45708n.removeCallbacks(this.f45704j);
            this.f45704j = null;
            return false;
        }
        boolean zA = this.f45704j.a(false);
        if (zA) {
            this.f45705k = this.f45704j;
            A();
        }
        this.f45704j = null;
        return zA;
    }

    @Override // o0.AbstractC2303c
    public void p() {
        super.p();
        b();
        this.f45704j = new RunnableC0400a();
        D();
    }
}
