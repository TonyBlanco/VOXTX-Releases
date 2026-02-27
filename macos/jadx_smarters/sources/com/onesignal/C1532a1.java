package com.onesignal;

import com.onesignal.F1;

/* JADX INFO: renamed from: com.onesignal.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1532a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S0 f38650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThreadC1594v1 f38651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f38652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q0 f38653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38654e = false;

    /* JADX INFO: renamed from: com.onesignal.a1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            F1.a(F1.v.DEBUG, "Running complete from OSNotificationReceivedEvent timeout runnable!");
            C1532a1 c1532a1 = C1532a1.this;
            c1532a1.b(c1532a1.c());
        }
    }

    /* JADX INFO: renamed from: com.onesignal.a1$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q0 f38656a;

        public b(Q0 q02) {
            this.f38656a = q02;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1532a1.this.e(this.f38656a);
        }
    }

    public C1532a1(S0 s02, Q0 q02) {
        this.f38653d = q02;
        this.f38650a = s02;
        HandlerThreadC1594v1 handlerThreadC1594v1B = HandlerThreadC1594v1.b();
        this.f38651b = handlerThreadC1594v1B;
        a aVar = new a();
        this.f38652c = aVar;
        handlerThreadC1594v1B.c(25000L, aVar);
    }

    public static boolean d() {
        return OSUtils.H();
    }

    public synchronized void b(Q0 q02) {
        this.f38651b.a(this.f38652c);
        if (this.f38654e) {
            F1.c1(F1.v.DEBUG, "OSNotificationReceivedEvent already completed");
            return;
        }
        this.f38654e = true;
        if (d()) {
            new Thread(new b(q02), "OS_COMPLETE_NOTIFICATION").start();
        } else {
            e(q02);
        }
    }

    public Q0 c() {
        return this.f38653d;
    }

    public final void e(Q0 q02) {
        this.f38650a.f(this.f38653d.c(), q02 != null ? q02.c() : null);
    }

    public String toString() {
        return "OSNotificationReceivedEvent{isComplete=" + this.f38654e + ", notification=" + this.f38653d + '}';
    }
}
