package M4;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzos;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: M4.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0776l2 implements G2 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static volatile C0776l2 f4800H;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile Boolean f4801A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Boolean f4802B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Boolean f4803C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile boolean f4804D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f4805E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final long f4807G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0719c f4813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0749h f4814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final P1 f4815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0858z1 f4816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0758i2 f4817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0861z4 f4818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a5 f4819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0828u1 f4820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C4.e f4821n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final I3 f4822o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0824t3 f4823p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final E0 f4824q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0848x3 f4825r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f4826s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0816s1 f4827t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0760i4 f4828u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0797p f4829v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0805q1 f4830w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f4832y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f4833z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4831x = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final AtomicInteger f4806F = new AtomicInteger(0);

    public C0776l2(R2 r22) {
        C0846x1 c0846x1W;
        String str;
        Bundle bundle;
        com.google.android.gms.common.internal.r.m(r22);
        Context context = r22.f4442a;
        C0719c c0719c = new C0719c(context);
        this.f4813f = c0719c;
        AbstractC0763j1.f4755a = c0719c;
        this.f4808a = context;
        this.f4809b = r22.f4443b;
        this.f4810c = r22.f4444c;
        this.f4811d = r22.f4445d;
        this.f4812e = r22.f4449h;
        this.f4801A = r22.f4446e;
        this.f4826s = r22.f4451j;
        this.f4804D = true;
        zzcl zzclVar = r22.f4448g;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f4802B = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f4803C = (Boolean) obj2;
            }
        }
        zzib.zzd(context);
        C4.e eVarC = C4.h.c();
        this.f4821n = eVarC;
        Long l9 = r22.f4450i;
        this.f4807G = l9 != null ? l9.longValue() : eVarC.a();
        this.f4814g = new C0749h(this);
        P1 p12 = new P1(this);
        p12.l();
        this.f4815h = p12;
        C0858z1 c0858z1 = new C0858z1(this);
        c0858z1.l();
        this.f4816i = c0858z1;
        a5 a5Var = new a5(this);
        a5Var.l();
        this.f4819l = a5Var;
        this.f4820m = new C0828u1(new Q2(r22, this));
        this.f4824q = new E0(this);
        I3 i32 = new I3(this);
        i32.j();
        this.f4822o = i32;
        C0824t3 c0824t3 = new C0824t3(this);
        c0824t3.j();
        this.f4823p = c0824t3;
        C0861z4 c0861z4 = new C0861z4(this);
        c0861z4.j();
        this.f4818k = c0861z4;
        C0848x3 c0848x3 = new C0848x3(this);
        c0848x3.l();
        this.f4825r = c0848x3;
        C0758i2 c0758i2 = new C0758i2(this);
        c0758i2.l();
        this.f4817j = c0758i2;
        zzcl zzclVar2 = r22.f4448g;
        boolean z9 = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            C0824t3 c0824t3I = I();
            if (c0824t3I.f4245a.f4808a.getApplicationContext() instanceof Application) {
                Application application = (Application) c0824t3I.f4245a.f4808a.getApplicationContext();
                if (c0824t3I.f5065c == null) {
                    c0824t3I.f5065c = new C0818s3(c0824t3I);
                }
                if (z9) {
                    application.unregisterActivityLifecycleCallbacks(c0824t3I.f5065c);
                    application.registerActivityLifecycleCallbacks(c0824t3I.f5065c);
                    c0846x1W = c0824t3I.f4245a.d().v();
                    str = "Registered activity lifecycle callback";
                }
            }
            c0758i2.z(new RunnableC0770k2(this, r22));
        }
        c0846x1W = d().w();
        str = "Application context is not an Application";
        c0846x1W.a(str);
        c0758i2.z(new RunnableC0770k2(this, r22));
    }

    public static C0776l2 H(Context context, zzcl zzclVar, Long l9) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        com.google.android.gms.common.internal.r.m(context);
        com.google.android.gms.common.internal.r.m(context.getApplicationContext());
        if (f4800H == null) {
            synchronized (C0776l2.class) {
                try {
                    if (f4800H == null) {
                        f4800H = new C0776l2(new R2(context, zzclVar, l9));
                    }
                } finally {
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.r.m(f4800H);
            f4800H.f4801A = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.r.m(f4800H);
        return f4800H;
    }

    public static /* bridge */ /* synthetic */ void e(C0776l2 c0776l2, R2 r22) {
        c0776l2.f().h();
        c0776l2.f4814g.w();
        C0797p c0797p = new C0797p(c0776l2);
        c0797p.l();
        c0776l2.f4829v = c0797p;
        C0805q1 c0805q1 = new C0805q1(c0776l2, r22.f4447f);
        c0805q1.j();
        c0776l2.f4830w = c0805q1;
        C0816s1 c0816s1 = new C0816s1(c0776l2);
        c0816s1.j();
        c0776l2.f4827t = c0816s1;
        C0760i4 c0760i4 = new C0760i4(c0776l2);
        c0760i4.j();
        c0776l2.f4828u = c0760i4;
        c0776l2.f4819l.m();
        c0776l2.f4815h.m();
        c0776l2.f4830w.k();
        C0846x1 c0846x1U = c0776l2.d().u();
        c0776l2.f4814g.q();
        c0846x1U.b("App measurement initialized, version", 79000L);
        c0776l2.d().u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strS = c0805q1.s();
        if (TextUtils.isEmpty(c0776l2.f4809b)) {
            if (c0776l2.N().U(strS)) {
                c0776l2.d().u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                c0776l2.d().u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strS)));
            }
        }
        c0776l2.d().q().a("Debug-level message logging enabled");
        if (c0776l2.f4805E != c0776l2.f4806F.get()) {
            c0776l2.d().r().c("Not all components initialized", Integer.valueOf(c0776l2.f4805E), Integer.valueOf(c0776l2.f4806F.get()));
        }
        c0776l2.f4831x = true;
    }

    public static final void t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void u(E2 e22) {
        if (e22 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void v(G1 g12) {
        if (g12 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!g12.m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(g12.getClass())));
        }
    }

    public static final void w(F2 f22) {
        if (f22 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!f22.n()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(f22.getClass())));
        }
    }

    public final C0797p A() {
        w(this.f4829v);
        return this.f4829v;
    }

    public final C0805q1 B() {
        v(this.f4830w);
        return this.f4830w;
    }

    public final C0816s1 C() {
        v(this.f4827t);
        return this.f4827t;
    }

    public final C0828u1 D() {
        return this.f4820m;
    }

    public final C0858z1 E() {
        C0858z1 c0858z1 = this.f4816i;
        if (c0858z1 == null || !c0858z1.n()) {
            return null;
        }
        return c0858z1;
    }

    public final P1 F() {
        u(this.f4815h);
        return this.f4815h;
    }

    public final C0758i2 G() {
        return this.f4817j;
    }

    public final C0824t3 I() {
        v(this.f4823p);
        return this.f4823p;
    }

    public final C0848x3 J() {
        w(this.f4825r);
        return this.f4825r;
    }

    public final I3 K() {
        v(this.f4822o);
        return this.f4822o;
    }

    public final C0760i4 L() {
        v(this.f4828u);
        return this.f4828u;
    }

    public final C0861z4 M() {
        v(this.f4818k);
        return this.f4818k;
    }

    public final a5 N() {
        u(this.f4819l);
        return this.f4819l;
    }

    public final String O() {
        return this.f4809b;
    }

    public final String P() {
        return this.f4810c;
    }

    public final String Q() {
        return this.f4811d;
    }

    public final String R() {
        return this.f4826s;
    }

    @Override // M4.G2
    public final C4.e a() {
        return this.f4821n;
    }

    @Override // M4.G2
    public final C0719c b() {
        return this.f4813f;
    }

    @Override // M4.G2
    public final Context c() {
        return this.f4808a;
    }

    @Override // M4.G2
    public final C0858z1 d() {
        w(this.f4816i);
        return this.f4816i;
    }

    @Override // M4.G2
    public final C0758i2 f() {
        w(this.f4817j);
        return this.f4817j;
    }

    public final void g() {
        this.f4806F.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void h(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0776l2.h(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void i() {
        this.f4805E++;
    }

    public final void j() {
        f().h();
        w(J());
        String strS = B().s();
        Pair pairP = F().p(strS);
        if (!this.f4814g.A() || ((Boolean) pairP.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairP.first)) {
            d().q().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        C0848x3 c0848x3J = J();
        c0848x3J.k();
        ConnectivityManager connectivityManager = (ConnectivityManager) c0848x3J.f4245a.f4808a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            d().w().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        a5 a5VarN = N();
        B().f4245a.f4814g.q();
        URL urlS = a5VarN.s(79000L, strS, (String) pairP.first, (-1) + F().f4419t.a());
        if (urlS != null) {
            C0848x3 c0848x3J2 = J();
            C0764j2 c0764j2 = new C0764j2(this);
            c0848x3J2.h();
            c0848x3J2.k();
            com.google.android.gms.common.internal.r.m(urlS);
            com.google.android.gms.common.internal.r.m(c0764j2);
            c0848x3J2.f4245a.f().y(new RunnableC0842w3(c0848x3J2, strS, urlS, null, null, c0764j2));
        }
    }

    public final void k(boolean z9) {
        this.f4801A = Boolean.valueOf(z9);
    }

    public final void l(boolean z9) {
        f().h();
        this.f4804D = z9;
    }

    public final void m(zzcl zzclVar) {
        K2 k22;
        f().h();
        K2 k2Q = F().q();
        int iA = k2Q.a();
        C0749h c0749h = this.f4814g;
        C0776l2 c0776l2 = c0749h.f4245a;
        Boolean boolT = c0749h.t("google_analytics_default_allow_ad_storage");
        C0749h c0749h2 = this.f4814g;
        C0776l2 c0776l22 = c0749h2.f4245a;
        Boolean boolT2 = c0749h2.t("google_analytics_default_allow_analytics_storage");
        if (!(boolT == null && boolT2 == null) && F().w(-10)) {
            k22 = new K2(boolT, boolT2, -10);
        } else {
            if (!TextUtils.isEmpty(B().t()) && (iA == 0 || iA == 30 || iA == 10 || iA == 30 || iA == 30 || iA == 40)) {
                I().F(new K2(null, null, -10), this.f4807G);
            } else if (TextUtils.isEmpty(B().t()) && zzclVar != null && zzclVar.zzg != null && F().w(30)) {
                k22 = K2.b(zzclVar.zzg, 30);
                if (!k22.l()) {
                }
            }
            k22 = null;
        }
        if (k22 != null) {
            I().F(k22, this.f4807G);
            k2Q = k22;
        }
        I().J(k2Q);
        if (F().f4404e.a() == 0) {
            d().v().b("Persisting first open", Long.valueOf(this.f4807G));
            F().f4404e.b(this.f4807G);
        }
        I().f5074l.c();
        if (r()) {
            if (!TextUtils.isEmpty(B().t()) || !TextUtils.isEmpty(B().r())) {
                a5 a5VarN = N();
                String strT = B().t();
                P1 p1F = F();
                p1F.h();
                String string = p1F.o().getString("gmp_app_id", null);
                String strR = B().r();
                P1 p1F2 = F();
                p1F2.h();
                if (a5VarN.d0(strT, string, strR, p1F2.o().getString("admob_app_id", null))) {
                    d().u().a("Rechecking which service to use due to a GMP App Id change");
                    P1 p1F3 = F();
                    p1F3.h();
                    Boolean boolR = p1F3.r();
                    SharedPreferences.Editor editorEdit = p1F3.o().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolR != null) {
                        p1F3.s(boolR);
                    }
                    C().q();
                    this.f4828u.Q();
                    this.f4828u.P();
                    F().f4404e.b(this.f4807G);
                    F().f4406g.b(null);
                }
                P1 p1F4 = F();
                String strT2 = B().t();
                p1F4.h();
                SharedPreferences.Editor editorEdit2 = p1F4.o().edit();
                editorEdit2.putString("gmp_app_id", strT2);
                editorEdit2.apply();
                P1 p1F5 = F();
                String strR2 = B().r();
                p1F5.h();
                SharedPreferences.Editor editorEdit3 = p1F5.o().edit();
                editorEdit3.putString("admob_app_id", strR2);
                editorEdit3.apply();
            }
            if (!F().q().j(J2.ANALYTICS_STORAGE)) {
                F().f4406g.b(null);
            }
            I().C(F().f4406g.a());
            zzos.zzc();
            if (this.f4814g.B(null, AbstractC0781m1.f4897g0)) {
                try {
                    N().f4245a.f4808a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(F().f4420u.a())) {
                        d().w().a("Remote config removed with active feature rollouts");
                        F().f4420u.b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(B().t()) || !TextUtils.isEmpty(B().r())) {
                boolean zO = o();
                if (!F().u() && !this.f4814g.E()) {
                    F().t(!zO);
                }
                if (zO) {
                    I().f0();
                }
                M().f5156e.a();
                L().S(new AtomicReference());
                L().v(F().f4423x.a());
            }
        } else if (o()) {
            if (!N().T("android.permission.INTERNET")) {
                d().r().a("App is missing INTERNET permission");
            }
            if (!N().T("android.permission.ACCESS_NETWORK_STATE")) {
                d().r().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!E4.e.a(this.f4808a).f() && !this.f4814g.G()) {
                if (!a5.a0(this.f4808a)) {
                    d().r().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!a5.b0(this.f4808a, false)) {
                    d().r().a("AppMeasurementService not registered/enabled");
                }
            }
            d().r().a("Uploading is not possible. App measurement disabled");
        }
        F().f4413n.a(true);
    }

    public final boolean n() {
        return this.f4801A != null && this.f4801A.booleanValue();
    }

    public final boolean o() {
        return x() == 0;
    }

    public final boolean p() {
        f().h();
        return this.f4804D;
    }

    public final boolean q() {
        return TextUtils.isEmpty(this.f4809b);
    }

    public final boolean r() {
        if (!this.f4831x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        f().h();
        Boolean bool = this.f4832y;
        if (bool == null || this.f4833z == 0 || (!bool.booleanValue() && Math.abs(this.f4821n.b() - this.f4833z) > 1000)) {
            this.f4833z = this.f4821n.b();
            boolean z9 = true;
            Boolean boolValueOf = Boolean.valueOf(N().T("android.permission.INTERNET") && N().T("android.permission.ACCESS_NETWORK_STATE") && (E4.e.a(this.f4808a).f() || this.f4814g.G() || (a5.a0(this.f4808a) && a5.b0(this.f4808a, false))));
            this.f4832y = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!N().M(B().t(), B().r()) && TextUtils.isEmpty(B().r())) {
                    z9 = false;
                }
                this.f4832y = Boolean.valueOf(z9);
            }
        }
        return this.f4832y.booleanValue();
    }

    public final boolean s() {
        return this.f4812e;
    }

    public final int x() {
        f().h();
        if (this.f4814g.E()) {
            return 1;
        }
        Boolean bool = this.f4803C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        f().h();
        if (!this.f4804D) {
            return 8;
        }
        Boolean boolR = F().r();
        if (boolR != null) {
            return boolR.booleanValue() ? 0 : 3;
        }
        C0749h c0749h = this.f4814g;
        C0719c c0719c = c0749h.f4245a.f4813f;
        Boolean boolT = c0749h.t("firebase_analytics_collection_enabled");
        if (boolT != null) {
            return boolT.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f4802B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f4801A == null || this.f4801A.booleanValue()) ? 0 : 7;
    }

    public final E0 y() {
        E0 e02 = this.f4824q;
        if (e02 != null) {
            return e02;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C0749h z() {
        return this.f4814g;
    }
}
