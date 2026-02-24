package L;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f3855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3857d;

    public static class a {
        public static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    public interface b {
        void a();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f3854a) {
                    return;
                }
                this.f3854a = true;
                this.f3857d = true;
                b bVar = this.f3855b;
                Object obj = this.f3856c;
                if (bVar != null) {
                    try {
                        bVar.a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f3857d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    a.a(obj);
                }
                synchronized (this) {
                    this.f3857d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f3856c == null) {
                    CancellationSignal cancellationSignalB = a.b();
                    this.f3856c = cancellationSignalB;
                    if (this.f3854a) {
                        a.a(cancellationSignalB);
                    }
                }
                obj = this.f3856c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public boolean c() {
        boolean z9;
        synchronized (this) {
            z9 = this.f3854a;
        }
        return z9;
    }

    public void d(b bVar) {
        synchronized (this) {
            try {
                e();
                if (this.f3855b == bVar) {
                    return;
                }
                this.f3855b = bVar;
                if (this.f3854a && bVar != null) {
                    bVar.a();
                }
            } finally {
            }
        }
    }

    public final void e() {
        while (this.f3857d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
