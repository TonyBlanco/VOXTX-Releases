package t6;

import G8.H;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import j6.InterfaceC2102b;
import o8.InterfaceC2372d;
import p8.AbstractC2512c;
import q8.AbstractC2645d;
import u6.C2856a;
import u6.InterfaceC2857b;
import v6.C2892f;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f50814h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A5.f f50815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2796b f50816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2892f f50817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f50818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f50819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f50820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f50821g;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f50822a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f50823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f50824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f50825e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f50827g;

        public b(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f50825e = obj;
            this.f50827g |= Integer.MIN_VALUE;
            return l.this.b(null, this);
        }
    }

    public static final class c implements v {
        public c() {
        }

        @Override // t6.v
        public Object a(q qVar, InterfaceC2372d interfaceC2372d) throws Throwable {
            Object objB = l.this.b(qVar, interfaceC2372d);
            return objB == AbstractC2512c.d() ? objB : k8.q.f43674a;
        }
    }

    public l(A5.f firebaseApp, k6.h firebaseInstallations, H backgroundDispatcher, H blockingDispatcher, InterfaceC2102b transportFactoryProvider) throws PackageManager.NameNotFoundException {
        kotlin.jvm.internal.l.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.l.e(firebaseInstallations, "firebaseInstallations");
        kotlin.jvm.internal.l.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.l.e(blockingDispatcher, "blockingDispatcher");
        kotlin.jvm.internal.l.e(transportFactoryProvider, "transportFactoryProvider");
        this.f50815a = firebaseApp;
        C2796b c2796bA = s.f50846a.a(firebaseApp);
        this.f50816b = c2796bA;
        Context contextL = firebaseApp.l();
        kotlin.jvm.internal.l.d(contextL, "firebaseApp.applicationContext");
        C2892f c2892f = new C2892f(contextL, blockingDispatcher, backgroundDispatcher, firebaseInstallations, c2796bA);
        this.f50817c = c2892f;
        x xVar = new x();
        this.f50818d = xVar;
        h hVar = new h(transportFactoryProvider);
        this.f50820f = hVar;
        this.f50821g = new o(firebaseInstallations, hVar);
        t tVar = new t(d(), xVar, null, 4, null);
        this.f50819e = tVar;
        final w wVar = new w(xVar, backgroundDispatcher, new c(), c2892f, tVar);
        final Context applicationContext = firebaseApp.l().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(wVar.d());
            firebaseApp.h(new A5.g() { // from class: t6.k
            });
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(t6.q r11, o8.InterfaceC2372d r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.l.b(t6.q, o8.d):java.lang.Object");
    }

    public final void c(InterfaceC2857b subscriber) {
        kotlin.jvm.internal.l.e(subscriber, "subscriber");
        C2856a.f51213a.e(subscriber);
        Log.d("FirebaseSessions", "Registering Sessions SDK subscriber with name: " + subscriber.c() + ", data collection enabled: " + subscriber.b());
        if (this.f50819e.e()) {
            subscriber.a(new InterfaceC2857b.C0469b(this.f50819e.d().b()));
        }
    }

    public final boolean d() {
        return Math.random() <= this.f50817c.b();
    }
}
