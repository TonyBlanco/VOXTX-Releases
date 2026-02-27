package H5;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1355c;
import com.google.android.gms.internal.p001firebaseauthapi.zzafn;

/* JADX INFO: loaded from: classes3.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f2628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0624o f2629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f2630c;

    public M(A5.f fVar) {
        this(fVar.l(), new C0624o(fVar));
    }

    public M(Context context, C0624o c0624o) {
        this.f2630c = false;
        this.f2628a = 0;
        this.f2629b = c0624o;
        ComponentCallbacks2C1355c.c((Application) context.getApplicationContext());
        ComponentCallbacks2C1355c.b().a(new O(this));
    }

    public final void b() {
        this.f2629b.b();
    }

    public final void d(zzafn zzafnVar) {
        if (zzafnVar == null) {
            return;
        }
        long jZza = zzafnVar.zza();
        if (jZza <= 0) {
            jZza = 3600;
        }
        long jZzb = zzafnVar.zzb() + (jZza * 1000);
        C0624o c0624o = this.f2629b;
        c0624o.f2705b = jZzb;
        c0624o.f2706c = -1L;
        if (e()) {
            this.f2629b.c();
        }
    }

    public final boolean e() {
        return this.f2628a > 0 && !this.f2630c;
    }
}
