package M4;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzby;

/* JADX INFO: renamed from: M4.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0861z4 extends G1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f5154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0855y4 f5156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0849x4 f5157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0837v4 f5158g;

    public C0861z4(C0776l2 c0776l2) {
        super(c0776l2);
        this.f5155d = true;
        this.f5156e = new C0855y4(this);
        this.f5157f = new C0849x4(this);
        this.f5158g = new C0837v4(this);
    }

    public static /* bridge */ /* synthetic */ void q(C0861z4 c0861z4, long j9) {
        c0861z4.h();
        c0861z4.u();
        c0861z4.f4245a.d().v().b("Activity paused, time", Long.valueOf(j9));
        c0861z4.f5158g.a(j9);
        if (c0861z4.f4245a.z().D()) {
            c0861z4.f5157f.b(j9);
        }
    }

    public static /* bridge */ /* synthetic */ void r(C0861z4 c0861z4, long j9) {
        c0861z4.h();
        c0861z4.u();
        c0861z4.f4245a.d().v().b("Activity resumed, time", Long.valueOf(j9));
        if (!c0861z4.f4245a.z().B(null, AbstractC0781m1.f4864I0) ? c0861z4.f4245a.z().D() || c0861z4.f4245a.F().f4417r.b() : c0861z4.f4245a.z().D() || c0861z4.f5155d) {
            c0861z4.f5157f.c(j9);
        }
        c0861z4.f5158g.b();
        C0855y4 c0855y4 = c0861z4.f5156e;
        c0855y4.f5136a.h();
        if (c0855y4.f5136a.f4245a.o()) {
            c0855y4.b(c0855y4.f5136a.f4245a.a().a(), false);
        }
    }

    @Override // M4.G1
    public final boolean n() {
        return false;
    }

    public final void s(boolean z9) {
        h();
        this.f5155d = z9;
    }

    public final boolean t() {
        h();
        return this.f5155d;
    }

    public final void u() {
        h();
        if (this.f5154c == null) {
            this.f5154c = new zzby(Looper.getMainLooper());
        }
    }
}
