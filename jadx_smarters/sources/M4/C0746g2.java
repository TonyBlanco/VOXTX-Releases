package M4;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: M4.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0746g2 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4709a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlockingQueue f4710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4711d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0758i2 f4712e;

    public C0746g2(C0758i2 c0758i2, String str, BlockingQueue blockingQueue) {
        this.f4712e = c0758i2;
        com.google.android.gms.common.internal.r.m(str);
        com.google.android.gms.common.internal.r.m(blockingQueue);
        this.f4709a = new Object();
        this.f4710c = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f4709a) {
            this.f4709a.notifyAll();
        }
    }

    public final void b() {
        synchronized (this.f4712e.f4737i) {
            try {
                if (!this.f4711d) {
                    this.f4712e.f4738j.release();
                    this.f4712e.f4737i.notifyAll();
                    C0758i2 c0758i2 = this.f4712e;
                    if (this == c0758i2.f4731c) {
                        c0758i2.f4731c = null;
                    } else if (this == c0758i2.f4732d) {
                        c0758i2.f4732d = null;
                    } else {
                        c0758i2.f4245a.d().r().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f4711d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(InterruptedException interruptedException) {
        this.f4712e.f4245a.d().w().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z9 = false;
        while (!z9) {
            try {
                this.f4712e.f4738j.acquire();
                z9 = true;
            } catch (InterruptedException e9) {
                c(e9);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C0740f2 c0740f2 = (C0740f2) this.f4710c.poll();
                if (c0740f2 != null) {
                    Process.setThreadPriority(true != c0740f2.f4672c ? 10 : threadPriority);
                    c0740f2.run();
                } else {
                    synchronized (this.f4709a) {
                        if (this.f4710c.peek() == null) {
                            C0758i2.B(this.f4712e);
                            try {
                                this.f4709a.wait(30000L);
                            } catch (InterruptedException e10) {
                                c(e10);
                            }
                        }
                    }
                    synchronized (this.f4712e.f4737i) {
                        if (this.f4710c.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
