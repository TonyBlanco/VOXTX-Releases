package M4;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzqu;

/* JADX INFO: renamed from: M4.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0855y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0861z4 f5136a;

    public C0855y4(C0861z4 c0861z4) {
        this.f5136a = c0861z4;
    }

    public final void a() {
        this.f5136a.h();
        if (this.f5136a.f4245a.F().v(this.f5136a.f4245a.a().a())) {
            this.f5136a.f4245a.F().f4411l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f5136a.f4245a.d().v().a("Detected application was in foreground");
                c(this.f5136a.f4245a.a().a(), false);
            }
        }
    }

    public final void b(long j9, boolean z9) {
        this.f5136a.h();
        this.f5136a.u();
        if (this.f5136a.f4245a.F().v(j9)) {
            this.f5136a.f4245a.F().f4411l.a(true);
            zzqu.zzc();
            if (this.f5136a.f4245a.z().B(null, AbstractC0781m1.f4915p0)) {
                this.f5136a.f4245a.B().v();
            }
        }
        this.f5136a.f4245a.F().f4414o.b(j9);
        if (this.f5136a.f4245a.F().f4411l.b()) {
            c(j9, z9);
        }
    }

    public final void c(long j9, boolean z9) {
        this.f5136a.h();
        if (this.f5136a.f4245a.o()) {
            this.f5136a.f4245a.F().f4414o.b(j9);
            this.f5136a.f4245a.d().v().b("Session started, time", Long.valueOf(this.f5136a.f4245a.a().b()));
            long j10 = j9 / 1000;
            this.f5136a.f4245a.I().M("auto", "_sid", Long.valueOf(j10), j9);
            this.f5136a.f4245a.F().f4415p.b(j10);
            this.f5136a.f4245a.F().f4411l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j10);
            if (this.f5136a.f4245a.z().B(null, AbstractC0781m1.f4891d0) && z9) {
                bundle.putLong("_aib", 1L);
            }
            this.f5136a.f4245a.I().v("auto", "_s", j9, bundle);
            zzos.zzc();
            if (this.f5136a.f4245a.z().B(null, AbstractC0781m1.f4897g0)) {
                String strA = this.f5136a.f4245a.F().f4420u.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strA);
                this.f5136a.f4245a.I().v("auto", "_ssr", j9, bundle2);
            }
        }
    }
}
