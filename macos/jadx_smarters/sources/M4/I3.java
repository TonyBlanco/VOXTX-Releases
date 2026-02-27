package M4;

import android.app.Activity;
import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes3.dex */
public final class I3 extends G1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile A3 f4307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile A3 f4308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public A3 f4309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f4310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Activity f4311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f4312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile A3 f4313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public A3 f4314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f4316l;

    public I3(C0776l2 c0776l2) {
        super(c0776l2);
        this.f4316l = new Object();
        this.f4310f = new ConcurrentHashMap();
    }

    public static /* bridge */ /* synthetic */ void w(I3 i32, Bundle bundle, A3 a32, A3 a33, long j9) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        i32.o(a32, a33, j9, true, i32.f4245a.N().x0(null, "screen_view", bundle, null, false));
    }

    public final void A(Activity activity) {
        synchronized (this.f4316l) {
            this.f4315k = false;
            this.f4312h = true;
        }
        long jB = this.f4245a.a().b();
        if (!this.f4245a.z().D()) {
            this.f4307c = null;
            this.f4245a.f().z(new F3(this, jB));
        } else {
            A3 a3F = F(activity);
            this.f4308d = this.f4307c;
            this.f4307c = null;
            this.f4245a.f().z(new G3(this, a3F, jB));
        }
    }

    public final void B(Activity activity) {
        synchronized (this.f4316l) {
            this.f4315k = true;
            if (activity != this.f4311g) {
                synchronized (this.f4316l) {
                    this.f4311g = activity;
                    this.f4312h = false;
                }
                if (this.f4245a.z().D()) {
                    this.f4313i = null;
                    this.f4245a.f().z(new H3(this));
                }
            }
        }
        if (!this.f4245a.z().D()) {
            this.f4307c = this.f4313i;
            this.f4245a.f().z(new E3(this));
        } else {
            G(activity, F(activity), false);
            E0 e0Y = this.f4245a.y();
            e0Y.f4245a.f().z(new RunnableC0726d0(e0Y, e0Y.f4245a.a().b()));
        }
    }

    public final void C(Activity activity, Bundle bundle) {
        A3 a32;
        if (!this.f4245a.z().D() || bundle == null || (a32 = (A3) this.f4310f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(Name.MARK, a32.f4190c);
        bundle2.putString("name", a32.f4188a);
        bundle2.putString("referrer_name", a32.f4189b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r1 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r1 <= 100) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.I3.D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r2 > 100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r4 > 100) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.I3.E(android.os.Bundle, long):void");
    }

    public final A3 F(Activity activity) {
        com.google.android.gms.common.internal.r.m(activity);
        A3 a32 = (A3) this.f4310f.get(activity);
        if (a32 == null) {
            A3 a33 = new A3(null, t(activity.getClass(), "Activity"), this.f4245a.N().t0());
            this.f4310f.put(activity, a33);
            a32 = a33;
        }
        return this.f4313i != null ? this.f4313i : a32;
    }

    public final void G(Activity activity, A3 a32, boolean z9) {
        A3 a33;
        A3 a34 = this.f4307c == null ? this.f4308d : this.f4307c;
        if (a32.f4189b == null) {
            a33 = new A3(a32.f4188a, activity != null ? t(activity.getClass(), "Activity") : null, a32.f4190c, a32.f4192e, a32.f4193f);
        } else {
            a33 = a32;
        }
        this.f4308d = this.f4307c;
        this.f4307c = a33;
        this.f4245a.f().z(new D3(this, a33, a34, this.f4245a.a().b(), z9));
    }

    @Override // M4.G1
    public final boolean n() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(M4.A3 r16, M4.A3 r17, long r18, boolean r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.I3.o(M4.A3, M4.A3, long, boolean, android.os.Bundle):void");
    }

    public final void p(A3 a32, boolean z9, long j9) {
        this.f4245a.y().n(this.f4245a.a().b());
        if (!this.f4245a.M().f5157f.d(a32 != null && a32.f4191d, z9, j9) || a32 == null) {
            return;
        }
        a32.f4191d = false;
    }

    public final A3 r() {
        return this.f4307c;
    }

    public final A3 s(boolean z9) {
        i();
        h();
        if (!z9) {
            return this.f4309e;
        }
        A3 a32 = this.f4309e;
        return a32 != null ? a32 : this.f4314j;
    }

    public final String t(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str2.length();
        this.f4245a.z();
        if (length2 <= 100) {
            return str2;
        }
        this.f4245a.z();
        return str2.substring(0, 100);
    }

    public final void y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f4245a.z().D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f4310f.put(activity, new A3(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(Name.MARK)));
    }

    public final void z(Activity activity) {
        synchronized (this.f4316l) {
            try {
                if (activity == this.f4311g) {
                    this.f4311g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f4245a.z().D()) {
            this.f4310f.remove(activity);
        }
    }
}
