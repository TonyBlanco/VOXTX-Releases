package androidx.work;

import Q0.w;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import b1.C1199c;
import c1.InterfaceC1247a;
import java.util.UUID;
import java.util.concurrent.Executor;
import y5.InterfaceFutureC2987b;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17254a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WorkerParameters f17255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f17256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17258f;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        public static final class C0201a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.b f17259a;

            public C0201a() {
                this(androidx.work.b.f17302c);
            }

            public C0201a(androidx.work.b bVar) {
                this.f17259a = bVar;
            }

            public androidx.work.b e() {
                return this.f17259a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0201a.class != obj.getClass()) {
                    return false;
                }
                return this.f17259a.equals(((C0201a) obj).f17259a);
            }

            public int hashCode() {
                return (C0201a.class.getName().hashCode() * 31) + this.f17259a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f17259a + '}';
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.b f17260a;

            public c() {
                this(androidx.work.b.f17302c);
            }

            public c(androidx.work.b bVar) {
                this.f17260a = bVar;
            }

            public androidx.work.b e() {
                return this.f17260a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f17260a.equals(((c) obj).f17260a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f17260a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f17260a + '}';
            }
        }

        public static a a() {
            return new C0201a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(androidx.work.b bVar) {
            return new c(bVar);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f17254a = context;
        this.f17255c = workerParameters;
    }

    public final Context a() {
        return this.f17254a;
    }

    public Executor c() {
        return this.f17255c.a();
    }

    public InterfaceFutureC2987b d() {
        C1199c c1199cT = C1199c.t();
        c1199cT.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c1199cT;
    }

    public final UUID e() {
        return this.f17255c.c();
    }

    public final b g() {
        return this.f17255c.d();
    }

    public InterfaceC1247a h() {
        return this.f17255c.e();
    }

    public w i() {
        return this.f17255c.f();
    }

    public boolean j() {
        return this.f17258f;
    }

    public final boolean k() {
        return this.f17256d;
    }

    public final boolean l() {
        return this.f17257e;
    }

    public void m() {
    }

    public void n(boolean z9) {
        this.f17258f = z9;
    }

    public final void o() {
        this.f17257e = true;
    }

    public abstract InterfaceFutureC2987b p();

    public final void q() {
        this.f17256d = true;
        m();
    }
}
