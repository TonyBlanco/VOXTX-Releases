package androidx.work;

import Q0.g;
import Q0.i;
import Q0.r;
import Q0.w;
import android.os.Build;
import com.google.android.gms.common.api.a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f17277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f17278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f17279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f17280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f17281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f17287k;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0202a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f17288a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f17289b;

        public ThreadFactoryC0202a(boolean z9) {
            this.f17289b = z9;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f17289b ? "WM.task-" : "androidx.work-") + this.f17288a.incrementAndGet());
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Executor f17291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public w f17292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i f17293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Executor f17294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public r f17295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f17296f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f17297g = 4;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f17298h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f17299i = a.e.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17300j = 20;

        public a a() {
            return new a(this);
        }
    }

    public a(b bVar) {
        Executor executor = bVar.f17291a;
        this.f17277a = executor == null ? a(false) : executor;
        Executor executorA = bVar.f17294d;
        if (executorA == null) {
            this.f17287k = true;
            executorA = a(true);
        } else {
            this.f17287k = false;
        }
        this.f17278b = executorA;
        w wVar = bVar.f17292b;
        this.f17279c = wVar == null ? w.c() : wVar;
        i iVar = bVar.f17293c;
        this.f17280d = iVar == null ? i.c() : iVar;
        r rVar = bVar.f17295e;
        this.f17281e = rVar == null ? new R0.a() : rVar;
        this.f17283g = bVar.f17297g;
        this.f17284h = bVar.f17298h;
        this.f17285i = bVar.f17299i;
        this.f17286j = bVar.f17300j;
        this.f17282f = bVar.f17296f;
    }

    public final Executor a(boolean z9) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z9));
    }

    public final ThreadFactory b(boolean z9) {
        return new ThreadFactoryC0202a(z9);
    }

    public String c() {
        return this.f17282f;
    }

    public g d() {
        return null;
    }

    public Executor e() {
        return this.f17277a;
    }

    public i f() {
        return this.f17280d;
    }

    public int g() {
        return this.f17285i;
    }

    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.f17286j / 2 : this.f17286j;
    }

    public int i() {
        return this.f17284h;
    }

    public int j() {
        return this.f17283g;
    }

    public r k() {
        return this.f17281e;
    }

    public Executor l() {
        return this.f17278b;
    }

    public w m() {
        return this.f17279c;
    }
}
