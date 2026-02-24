package com.onesignal;

import Q0.b;
import Q0.m;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.F1;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OSFocusHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38412b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f38413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f38414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f38415e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Runnable f38416a;

    public static final class OnLostFocusWorker extends Worker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLostFocusWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
            super(context, workerParams);
            kotlin.jvm.internal.l.e(context, "context");
            kotlin.jvm.internal.l.e(workerParams, "workerParams");
        }

        @Override // androidx.work.Worker
        public ListenableWorker.a r() {
            OSFocusHandler.f38412b.a();
            ListenableWorker.a aVarC = ListenableWorker.a.c();
            kotlin.jvm.internal.l.d(aVarC, "success()");
            return aVarC;
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a() {
            C1530a c1530aB = C1533b.b();
            if (c1530aB == null || c1530aB.e() == null) {
                F1.B1(false);
            }
            F1.c1(F1.v.DEBUG, "OSFocusHandler running onAppLostFocus");
            OSFocusHandler.f38414d = true;
            F1.Z0();
            OSFocusHandler.f38415e = true;
        }
    }

    public static final void n() {
        f38413c = true;
        F1.c1(F1.v.DEBUG, "OSFocusHandler setting stop state: true");
    }

    public final Q0.b d() {
        Q0.b bVarA = new b.a().b(Q0.l.CONNECTED).a();
        kotlin.jvm.internal.l.d(bVarA, "Builder()\n            .s…TED)\n            .build()");
        return bVarA;
    }

    public final void e(String tag, Context context) {
        kotlin.jvm.internal.l.e(tag, "tag");
        kotlin.jvm.internal.l.e(context, "context");
        E1.a(context).a(tag);
    }

    public final boolean f() {
        return f38414d;
    }

    public final boolean g() {
        return f38415e;
    }

    public final void h() {
        i();
        f38414d = false;
    }

    public final void i() {
        f38413c = false;
        Runnable runnable = this.f38416a;
        if (runnable == null) {
            return;
        }
        HandlerThreadC1594v1.b().a(runnable);
    }

    public final void j() {
        h();
        F1.c1(F1.v.DEBUG, "OSFocusHandler running onAppFocus");
        F1.X0();
    }

    public final void k(String tag, long j9, Context context) {
        kotlin.jvm.internal.l.e(tag, "tag");
        kotlin.jvm.internal.l.e(context, "context");
        Q0.v vVarB = ((m.a) ((m.a) ((m.a) new m.a(OnLostFocusWorker.class).e(d())).f(j9, TimeUnit.MILLISECONDS)).a(tag)).b();
        kotlin.jvm.internal.l.d(vVarB, "Builder(OnLostFocusWorke…tag)\n            .build()");
        E1.a(context).d(tag, Q0.d.KEEP, (Q0.m) vVarB);
    }

    public final void l() {
        if (!f38413c) {
            i();
            return;
        }
        f38413c = false;
        this.f38416a = null;
        F1.c1(F1.v.DEBUG, "OSFocusHandler running onAppStartFocusLogic");
        F1.a1();
    }

    public final void m() {
        Runnable runnable = new Runnable() { // from class: com.onesignal.w0
            @Override // java.lang.Runnable
            public final void run() {
                OSFocusHandler.n();
            }
        };
        HandlerThreadC1594v1.b().c(1500L, runnable);
        k8.q qVar = k8.q.f43674a;
        this.f38416a = runnable;
    }
}
