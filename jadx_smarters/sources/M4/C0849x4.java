package M4;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzph;

/* JADX INFO: renamed from: M4.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0849x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC0791o f5128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0861z4 f5129d;

    public C0849x4(C0861z4 c0861z4) {
        this.f5129d = c0861z4;
        this.f5128c = new C0843w4(this, c0861z4.f4245a);
        long jB = c0861z4.f4245a.a().b();
        this.f5126a = jB;
        this.f5127b = jB;
    }

    public final void a() {
        this.f5128c.b();
        this.f5126a = 0L;
        this.f5127b = 0L;
    }

    public final void b(long j9) {
        this.f5128c.b();
    }

    public final void c(long j9) {
        this.f5129d.h();
        this.f5128c.b();
        this.f5126a = j9;
        this.f5127b = j9;
    }

    public final boolean d(boolean z9, boolean z10, long j9) {
        this.f5129d.h();
        this.f5129d.i();
        zzph.zzc();
        if (!this.f5129d.f4245a.z().B(null, AbstractC0781m1.f4899h0) || this.f5129d.f4245a.o()) {
            this.f5129d.f4245a.F().f4414o.b(this.f5129d.f4245a.a().a());
        }
        long j10 = j9 - this.f5126a;
        if (!z9 && j10 < 1000) {
            this.f5129d.f4245a.d().v().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j10));
            return false;
        }
        if (!z10) {
            j10 = j9 - this.f5127b;
            this.f5127b = j9;
        }
        this.f5129d.f4245a.d().v().b("Recording user engagement, ms", Long.valueOf(j10));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        a5.y(this.f5129d.f4245a.K().s(!this.f5129d.f4245a.z().D()), bundle, true);
        if (!z10) {
            this.f5129d.f4245a.I().u("auto", "_e", bundle);
        }
        this.f5126a = j9;
        this.f5128c.b();
        this.f5128c.d(3600000L);
        return true;
    }
}
