package com.onesignal;

import com.onesignal.F1;

/* JADX INFO: loaded from: classes4.dex */
public class Z0 implements F1.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThreadC1594v1 f38629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f38630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Q0 f38631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public R0 f38632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38633e = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            F1.a(F1.v.DEBUG, "Running complete from OSNotificationOpenedResult timeout runnable!");
            Z0.this.c(false);
        }
    }

    public Z0(Q0 q02, R0 r02) {
        this.f38631c = q02;
        this.f38632d = r02;
        HandlerThreadC1594v1 handlerThreadC1594v1B = HandlerThreadC1594v1.b();
        this.f38629a = handlerThreadC1594v1B;
        a aVar = new a();
        this.f38630b = aVar;
        handlerThreadC1594v1B.c(5000L, aVar);
    }

    @Override // com.onesignal.F1.t
    public void a(F1.r rVar) {
        F1.c1(F1.v.DEBUG, "OSNotificationOpenedResult onEntryStateChange called with appEntryState: " + rVar);
        c(F1.r.APP_CLOSE.equals(rVar));
    }

    public final void c(boolean z9) {
        F1.v vVar = F1.v.DEBUG;
        F1.c1(vVar, "OSNotificationOpenedResult complete called with opened: " + z9);
        this.f38629a.a(this.f38630b);
        if (this.f38633e) {
            F1.c1(vVar, "OSNotificationOpenedResult already completed");
            return;
        }
        this.f38633e = true;
        if (z9) {
            F1.y(this.f38631c.g());
        }
        F1.m1(this);
    }

    public Q0 d() {
        return this.f38631c;
    }

    public String toString() {
        return "OSNotificationOpenedResult{notification=" + this.f38631c + ", action=" + this.f38632d + ", isComplete=" + this.f38633e + '}';
    }
}
