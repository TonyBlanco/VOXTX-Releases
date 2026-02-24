package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2167a extends AbstractC2170d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C2167a f43852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Executor f43853d = new ExecutorC0370a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f43854e = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC2170d f43855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC2170d f43856b;

    /* JADX INFO: renamed from: l.a$a, reason: collision with other inner class name */
    public static class ExecutorC0370a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C2167a.e().c(runnable);
        }
    }

    /* JADX INFO: renamed from: l.a$b */
    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C2167a.e().a(runnable);
        }
    }

    public C2167a() {
        C2169c c2169c = new C2169c();
        this.f43856b = c2169c;
        this.f43855a = c2169c;
    }

    public static Executor d() {
        return f43854e;
    }

    public static C2167a e() {
        if (f43852c != null) {
            return f43852c;
        }
        synchronized (C2167a.class) {
            try {
                if (f43852c == null) {
                    f43852c = new C2167a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f43852c;
    }

    @Override // l.AbstractC2170d
    public void a(Runnable runnable) {
        this.f43855a.a(runnable);
    }

    @Override // l.AbstractC2170d
    public boolean b() {
        return this.f43855a.b();
    }

    @Override // l.AbstractC2170d
    public void c(Runnable runnable) {
        this.f43855a.c(runnable);
    }
}
