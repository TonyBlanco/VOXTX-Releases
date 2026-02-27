package androidx.work.impl.background.systemalarm;

import Q0.k;
import Z0.p;
import a1.n;
import a1.r;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c implements V0.c, R0.b, r.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f17343k = k.f("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17344a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f17347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V0.d f17348f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PowerManager.WakeLock f17351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17352j = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17350h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f17349g = new Object();

    public c(Context context, int i9, String str, d dVar) {
        this.f17344a = context;
        this.f17345c = i9;
        this.f17347e = dVar;
        this.f17346d = str;
        this.f17348f = new V0.d(context, dVar.f(), this);
    }

    @Override // a1.r.b
    public void a(String str) {
        k.c().a(f17343k, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // V0.c
    public void b(List list) {
        g();
    }

    public final void c() {
        synchronized (this.f17349g) {
            try {
                this.f17348f.e();
                this.f17347e.h().c(this.f17346d);
                PowerManager.WakeLock wakeLock = this.f17351i;
                if (wakeLock != null && wakeLock.isHeld()) {
                    k.c().a(f17343k, String.format("Releasing wakelock %s for WorkSpec %s", this.f17351i, this.f17346d), new Throwable[0]);
                    this.f17351i.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // R0.b
    public void d(String str, boolean z9) {
        k.c().a(f17343k, String.format("onExecuted %s, %s", str, Boolean.valueOf(z9)), new Throwable[0]);
        c();
        if (z9) {
            Intent intentF = a.f(this.f17344a, this.f17346d);
            d dVar = this.f17347e;
            dVar.k(new d.b(dVar, intentF, this.f17345c));
        }
        if (this.f17352j) {
            Intent intentA = a.a(this.f17344a);
            d dVar2 = this.f17347e;
            dVar2.k(new d.b(dVar2, intentA, this.f17345c));
        }
    }

    public void e() {
        this.f17351i = n.b(this.f17344a, String.format("%s (%s)", this.f17346d, Integer.valueOf(this.f17345c)));
        k kVarC = k.c();
        String str = f17343k;
        kVarC.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f17351i, this.f17346d), new Throwable[0]);
        this.f17351i.acquire();
        p pVarH = this.f17347e.g().q().B().h(this.f17346d);
        if (pVarH == null) {
            g();
            return;
        }
        boolean zB = pVarH.b();
        this.f17352j = zB;
        if (zB) {
            this.f17348f.d(Collections.singletonList(pVarH));
        } else {
            k.c().a(str, String.format("No constraints for %s", this.f17346d), new Throwable[0]);
            f(Collections.singletonList(this.f17346d));
        }
    }

    @Override // V0.c
    public void f(List list) {
        if (list.contains(this.f17346d)) {
            synchronized (this.f17349g) {
                try {
                    if (this.f17350h == 0) {
                        this.f17350h = 1;
                        k.c().a(f17343k, String.format("onAllConstraintsMet for %s", this.f17346d), new Throwable[0]);
                        if (this.f17347e.e().j(this.f17346d)) {
                            this.f17347e.h().b(this.f17346d, 600000L, this);
                        } else {
                            c();
                        }
                    } else {
                        k.c().a(f17343k, String.format("Already started work for %s", this.f17346d), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f17349g) {
            try {
                if (this.f17350h < 2) {
                    this.f17350h = 2;
                    k kVarC = k.c();
                    String str = f17343k;
                    kVarC.a(str, String.format("Stopping work for WorkSpec %s", this.f17346d), new Throwable[0]);
                    Intent intentG = a.g(this.f17344a, this.f17346d);
                    d dVar = this.f17347e;
                    dVar.k(new d.b(dVar, intentG, this.f17345c));
                    if (this.f17347e.e().g(this.f17346d)) {
                        k.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f17346d), new Throwable[0]);
                        Intent intentF = a.f(this.f17344a, this.f17346d);
                        d dVar2 = this.f17347e;
                        dVar2.k(new d.b(dVar2, intentF, this.f17345c));
                    } else {
                        k.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f17346d), new Throwable[0]);
                    }
                } else {
                    k.c().a(f17343k, String.format("Already stopped work for %s", this.f17346d), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
