package M4;

import android.os.Handler;
import com.google.android.gms.internal.measurement.zzby;

/* JADX INFO: renamed from: M4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0791o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Handler f4964d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G2 f4965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f4966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f4967c;

    public AbstractC0791o(G2 g22) {
        com.google.android.gms.common.internal.r.m(g22);
        this.f4965a = g22;
        this.f4966b = new RunnableC0785n(this, g22);
    }

    public final void b() {
        this.f4967c = 0L;
        f().removeCallbacks(this.f4966b);
    }

    public abstract void c();

    public final void d(long j9) {
        b();
        if (j9 >= 0) {
            this.f4967c = this.f4965a.a().a();
            if (f().postDelayed(this.f4966b, j9)) {
                return;
            }
            this.f4965a.d().r().b("Failed to schedule delayed post. time", Long.valueOf(j9));
        }
    }

    public final boolean e() {
        return this.f4967c != 0;
    }

    public final Handler f() {
        Handler handler;
        if (f4964d != null) {
            return f4964d;
        }
        synchronized (AbstractC0791o.class) {
            try {
                if (f4964d == null) {
                    f4964d = new zzby(this.f4965a.c().getMainLooper());
                }
                handler = f4964d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
