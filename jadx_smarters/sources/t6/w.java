package t6;

import G8.AbstractC0579k;
import G8.L;
import G8.M;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import o8.InterfaceC2372d;
import p8.AbstractC2512c;
import v6.C2892f;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f50861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o8.g f50862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f50863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2892f f50864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f50865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f50866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f50867g;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
            w.this.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
            w.this.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            kotlin.jvm.internal.l.e(activity, "activity");
            kotlin.jvm.internal.l.e(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
        }
    }

    public static final class b extends q8.l implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50869a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q f50871d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
            this.f50871d = qVar;
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L l9, InterfaceC2372d interfaceC2372d) {
            return ((b) create(l9, interfaceC2372d)).invokeSuspend(k8.q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            return w.this.new b(this.f50871d, interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objD = AbstractC2512c.d();
            int i9 = this.f50869a;
            if (i9 == 0) {
                k8.k.b(obj);
                v vVar = w.this.f50863c;
                q qVar = this.f50871d;
                this.f50869a = 1;
                if (vVar.a(qVar, this) == objD) {
                    return objD;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k8.k.b(obj);
            }
            return k8.q.f43674a;
        }
    }

    public w(y timeProvider, o8.g backgroundDispatcher, v sessionInitiateListener, C2892f sessionsSettings, t sessionGenerator) {
        kotlin.jvm.internal.l.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.l.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.l.e(sessionInitiateListener, "sessionInitiateListener");
        kotlin.jvm.internal.l.e(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.l.e(sessionGenerator, "sessionGenerator");
        this.f50861a = timeProvider;
        this.f50862b = backgroundDispatcher;
        this.f50863c = sessionInitiateListener;
        this.f50864d = sessionsSettings;
        this.f50865e = sessionGenerator;
        this.f50866f = timeProvider.a();
        e();
        this.f50867g = new a();
    }

    public final void b() {
        this.f50866f = this.f50861a.a();
    }

    public final void c() {
        if (F8.a.e(F8.a.B(this.f50861a.a(), this.f50866f), this.f50864d.c()) > 0) {
            e();
        }
    }

    public final Application.ActivityLifecycleCallbacks d() {
        return this.f50867g;
    }

    public final void e() {
        AbstractC0579k.d(M.a(this.f50862b), null, null, new b(this.f50865e.a(), null), 3, null);
    }
}
