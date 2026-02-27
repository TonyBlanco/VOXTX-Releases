package H5;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.p001firebaseauthapi.zzg;

/* JADX INFO: renamed from: H5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0624o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static A4.a f2703h = new A4.a("TokenRefresher", "FirebaseAuth:");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A5.f f2704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f2705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f2706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HandlerThread f2708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f2709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f2710g;

    public C0624o(A5.f fVar) {
        f2703h.f("Initializing TokenRefresher", new Object[0]);
        A5.f fVar2 = (A5.f) com.google.android.gms.common.internal.r.m(fVar);
        this.f2704a = fVar2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f2708e = handlerThread;
        handlerThread.start();
        this.f2709f = new zzg(this.f2708e.getLooper());
        this.f2710g = new RunnableC0623n(this, fVar2.o());
        this.f2707d = 300000L;
    }

    public final void b() {
        this.f2709f.removeCallbacks(this.f2710g);
    }

    public final void c() {
        f2703h.f("Scheduling refresh for " + (this.f2705b - this.f2707d), new Object[0]);
        b();
        this.f2706c = Math.max((this.f2705b - C4.h.c().a()) - this.f2707d, 0L) / 1000;
        this.f2709f.postDelayed(this.f2710g, this.f2706c * 1000);
    }

    public final void d() {
        int i9 = (int) this.f2706c;
        this.f2706c = (i9 == 30 || i9 == 60 || i9 == 120 || i9 == 240 || i9 == 480) ? 2 * this.f2706c : i9 != 960 ? 30L : 960L;
        this.f2705b = C4.h.c().a() + (this.f2706c * 1000);
        f2703h.f("Scheduling refresh for " + this.f2705b, new Object[0]);
        this.f2709f.postDelayed(this.f2710g, this.f2706c * 1000);
    }
}
