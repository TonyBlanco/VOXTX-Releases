package M4;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzqu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s.C2695a;

/* JADX INFO: renamed from: M4.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0824t3 extends G1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0818s3 f5065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public O2 f5066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f5067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f5069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f5070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public K2 f5071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicLong f5072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h5 f5074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z4 f5076n;

    public C0824t3(C0776l2 c0776l2) {
        super(c0776l2);
        this.f5067e = new CopyOnWriteArraySet();
        this.f5070h = new Object();
        this.f5075m = true;
        this.f5076n = new C0753h3(this);
        this.f5069g = new AtomicReference();
        this.f5071i = K2.f4337c;
        this.f5073k = -1L;
        this.f5072j = new AtomicLong(0L);
        this.f5074l = new h5(c0776l2);
    }

    public static /* bridge */ /* synthetic */ void b0(C0824t3 c0824t3, K2 k22, K2 k23) {
        boolean z9;
        J2[] j2Arr = {J2.ANALYTICS_STORAGE, J2.AD_STORAGE};
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                z9 = false;
                break;
            }
            J2 j22 = j2Arr[i9];
            if (!k23.j(j22) && k22.j(j22)) {
                z9 = true;
                break;
            }
            i9++;
        }
        boolean zN = k22.n(k23, J2.ANALYTICS_STORAGE, J2.AD_STORAGE);
        if (z9 || zN) {
            c0824t3.f4245a.B().v();
        }
    }

    public static /* synthetic */ void c0(C0824t3 c0824t3, K2 k22, long j9, boolean z9, boolean z10) {
        c0824t3.h();
        c0824t3.i();
        K2 k2Q = c0824t3.f4245a.F().q();
        if (j9 <= c0824t3.f5073k && K2.k(k2Q.a(), k22.a())) {
            c0824t3.f4245a.d().u().b("Dropped out-of-date consent setting, proposed settings", k22);
            return;
        }
        P1 p1F = c0824t3.f4245a.F();
        C0776l2 c0776l2 = p1F.f4245a;
        p1F.h();
        int iA = k22.a();
        if (!p1F.w(iA)) {
            c0824t3.f4245a.d().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(k22.a()));
            return;
        }
        SharedPreferences.Editor editorEdit = p1F.o().edit();
        editorEdit.putString("consent_settings", k22.i());
        editorEdit.putInt("consent_source", iA);
        editorEdit.apply();
        c0824t3.f5073k = j9;
        c0824t3.f4245a.L().t(z9);
        if (z10) {
            c0824t3.f4245a.L().S(new AtomicReference());
        }
    }

    public final void A(String str, String str2, long j9, Bundle bundle, boolean z9, boolean z10, boolean z11, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i9 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i9 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i9];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i9] = new Bundle((Bundle) parcelable);
                        }
                        i9++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i9 < list.size()) {
                        Object obj2 = list.get(i9);
                        if (obj2 instanceof Bundle) {
                            list.set(i9, new Bundle((Bundle) obj2));
                        }
                        i9++;
                    }
                }
            }
        }
        this.f4245a.f().z(new Y2(this, str, str2, j9, bundle2, z9, z10, z11, str3));
    }

    public final void B(String str, String str2, long j9, Object obj) {
        this.f4245a.f().z(new Z2(this, str, str2, obj, j9));
    }

    public final void C(String str) {
        this.f5069g.set(str);
    }

    public final void D(Bundle bundle) {
        E(bundle, this.f4245a.a().a());
    }

    public final void E(Bundle bundle, long j9) {
        com.google.android.gms.common.internal.r.m(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f4245a.d().w().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        com.google.android.gms.common.internal.r.m(bundle2);
        H2.a(bundle2, "app_id", String.class, null);
        H2.a(bundle2, "origin", String.class, null);
        H2.a(bundle2, "name", String.class, null);
        H2.a(bundle2, "value", Object.class, null);
        H2.a(bundle2, "trigger_event_name", String.class, null);
        H2.a(bundle2, "trigger_timeout", Long.class, 0L);
        H2.a(bundle2, "timed_out_event_name", String.class, null);
        H2.a(bundle2, "timed_out_event_params", Bundle.class, null);
        H2.a(bundle2, "triggered_event_name", String.class, null);
        H2.a(bundle2, "triggered_event_params", Bundle.class, null);
        H2.a(bundle2, "time_to_live", Long.class, 0L);
        H2.a(bundle2, "expired_event_name", String.class, null);
        H2.a(bundle2, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.r.g(bundle2.getString("name"));
        com.google.android.gms.common.internal.r.g(bundle2.getString("origin"));
        com.google.android.gms.common.internal.r.m(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j9);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f4245a.N().p0(string) != 0) {
            this.f4245a.d().r().b("Invalid conditional user property name", this.f4245a.D().f(string));
            return;
        }
        if (this.f4245a.N().l0(string, obj) != 0) {
            this.f4245a.d().r().c("Invalid conditional user property value", this.f4245a.D().f(string), obj);
            return;
        }
        Object objP = this.f4245a.N().p(string, obj);
        if (objP == null) {
            this.f4245a.d().r().c("Unable to normalize conditional user property value", this.f4245a.D().f(string), obj);
            return;
        }
        H2.b(bundle2, objP);
        long j10 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            this.f4245a.z();
            if (j10 > 15552000000L || j10 < 1) {
                this.f4245a.d().r().c("Invalid conditional user property timeout", this.f4245a.D().f(string), Long.valueOf(j10));
                return;
            }
        }
        long j11 = bundle2.getLong("time_to_live");
        this.f4245a.z();
        if (j11 > 15552000000L || j11 < 1) {
            this.f4245a.d().r().c("Invalid conditional user property time to live", this.f4245a.D().f(string), Long.valueOf(j11));
        } else {
            this.f4245a.f().z(new RunnableC0717b3(this, bundle2));
        }
    }

    public final void F(K2 k22, long j9) {
        K2 k23;
        boolean z9;
        K2 k24;
        boolean z10;
        boolean zM;
        i();
        int iA = k22.a();
        if (iA != -10 && k22.f() == null && k22.g() == null) {
            this.f4245a.d().x().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f5070h) {
            try {
                k23 = this.f5071i;
                z9 = false;
                if (K2.k(iA, k23.a())) {
                    zM = k22.m(this.f5071i);
                    J2 j22 = J2.ANALYTICS_STORAGE;
                    if (k22.j(j22) && !this.f5071i.j(j22)) {
                        z9 = true;
                    }
                    K2 k2E = k22.e(this.f5071i);
                    this.f5071i = k2E;
                    k24 = k2E;
                    z10 = z9;
                    z9 = true;
                } else {
                    k24 = k22;
                    z10 = false;
                    zM = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z9) {
            this.f4245a.d().u().b("Ignoring lower-priority consent settings, proposed settings", k24);
            return;
        }
        long andIncrement = this.f5072j.getAndIncrement();
        if (zM) {
            this.f5069g.set(null);
            this.f4245a.f().A(new RunnableC0795o3(this, k24, j9, andIncrement, z10, k23));
            return;
        }
        RunnableC0801p3 runnableC0801p3 = new RunnableC0801p3(this, k24, andIncrement, z10, k23);
        if (iA == 30 || iA == -10) {
            this.f4245a.f().A(runnableC0801p3);
        } else {
            this.f4245a.f().z(runnableC0801p3);
        }
    }

    public final void G(Bundle bundle, int i9, long j9) {
        i();
        String strH = K2.h(bundle);
        if (strH != null) {
            this.f4245a.d().x().b("Ignoring invalid consent setting", strH);
            this.f4245a.d().x().a("Valid consent values are 'granted', 'denied'");
        }
        F(K2.b(bundle, i9), j9);
    }

    public final void H(O2 o22) {
        O2 o23;
        h();
        i();
        if (o22 != null && o22 != (o23 = this.f5066d)) {
            com.google.android.gms.common.internal.r.q(o23 == null, "EventInterceptor already set.");
        }
        this.f5066d = o22;
    }

    public final void I(Boolean bool) {
        i();
        this.f4245a.f().z(new RunnableC0789n3(this, bool));
    }

    public final void J(K2 k22) {
        h();
        boolean z9 = (k22.j(J2.ANALYTICS_STORAGE) && k22.j(J2.AD_STORAGE)) || this.f4245a.L().A();
        if (z9 != this.f4245a.p()) {
            this.f4245a.l(z9);
            P1 p1F = this.f4245a.F();
            C0776l2 c0776l2 = p1F.f4245a;
            p1F.h();
            Boolean boolValueOf = p1F.o().contains("measurement_enabled_from_api") ? Boolean.valueOf(p1F.o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z9 || boolValueOf == null || boolValueOf.booleanValue()) {
                O(Boolean.valueOf(z9), false);
            }
        }
    }

    public final void K(String str, String str2, Object obj, boolean z9) {
        L("auto", "_ldl", obj, true, this.f4245a.a().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0824t3.L(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.r.g(r9)
            com.google.android.gms.common.internal.r.g(r10)
            r8.h()
            r8.i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L62
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L50
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L50
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            r11 = 1
            java.lang.String r0 = "false"
            boolean r10 = r0.equals(r10)
            r2 = 1
            if (r11 == r10) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            M4.l2 r5 = r8.f4245a
            M4.P1 r5 = r5.F()
            M4.O1 r5 = r5.f4412m
            int r6 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r6 != 0) goto L4a
            java.lang.String r0 = "true"
        L4a:
            r5.b(r0)
            r3 = r1
            r6 = r4
            goto L64
        L50:
            if (r11 != 0) goto L62
            M4.l2 r10 = r8.f4245a
            M4.P1 r10 = r10.F()
            M4.O1 r10 = r10.f4412m
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
            r3 = r1
            goto L64
        L62:
            r3 = r10
            r6 = r11
        L64:
            M4.l2 r10 = r8.f4245a
            boolean r10 = r10.o()
            if (r10 != 0) goto L7c
            M4.l2 r9 = r8.f4245a
            M4.z1 r9 = r9.d()
            M4.x1 r9 = r9.v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L7c:
            M4.l2 r10 = r8.f4245a
            boolean r10 = r10.r()
            if (r10 != 0) goto L85
            return
        L85:
            M4.V4 r10 = new M4.V4
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            M4.l2 r9 = r8.f4245a
            M4.i4 r9 = r9.L()
            r9.y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0824t3.M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void N(P2 p22) {
        i();
        com.google.android.gms.common.internal.r.m(p22);
        if (this.f5067e.remove(p22)) {
            return;
        }
        this.f4245a.d().w().a("OnEventListener had not been registered");
    }

    public final void O(Boolean bool, boolean z9) {
        h();
        i();
        this.f4245a.d().q().b("Setting app measurement enabled (FE)", bool);
        this.f4245a.F().s(bool);
        if (z9) {
            P1 p1F = this.f4245a.F();
            C0776l2 c0776l2 = p1F.f4245a;
            p1F.h();
            SharedPreferences.Editor editorEdit = p1F.o().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.f4245a.p() || !(bool == null || bool.booleanValue())) {
            P();
        }
    }

    public final void P() {
        h();
        String strA = this.f4245a.F().f4412m.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                M("app", "_npa", null, this.f4245a.a().a());
            } else {
                M("app", "_npa", Long.valueOf(true != "true".equals(strA) ? 0L : 1L), this.f4245a.a().a());
            }
        }
        if (!this.f4245a.o() || !this.f5075m) {
            this.f4245a.d().q().a("Updating Scion state (FE)");
            this.f4245a.L().w();
            return;
        }
        this.f4245a.d().q().a("Recording app launch after enabling measurement for the first time (FE)");
        f0();
        zzph.zzc();
        if (this.f4245a.z().B(null, AbstractC0781m1.f4899h0)) {
            this.f4245a.M().f5156e.a();
        }
        this.f4245a.f().z(new W2(this));
    }

    public final int Q(String str) {
        com.google.android.gms.common.internal.r.g(str);
        this.f4245a.z();
        return 25;
    }

    public final Boolean R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f4245a.f().r(atomicReference, 15000L, "boolean test flag value", new RunnableC0735e3(this, atomicReference));
    }

    public final Double S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f4245a.f().r(atomicReference, 15000L, "double test flag value", new RunnableC0783m3(this, atomicReference));
    }

    public final Integer T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f4245a.f().r(atomicReference, 15000L, "int test flag value", new RunnableC0777l3(this, atomicReference));
    }

    public final Long U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f4245a.f().r(atomicReference, 15000L, "long test flag value", new RunnableC0771k3(this, atomicReference));
    }

    public final String V() {
        return (String) this.f5069g.get();
    }

    public final String W() {
        A3 a3R = this.f4245a.K().r();
        if (a3R != null) {
            return a3R.f4189b;
        }
        return null;
    }

    public final String X() {
        A3 a3R = this.f4245a.K().r();
        if (a3R != null) {
            return a3R.f4188a;
        }
        return null;
    }

    public final String Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f4245a.f().r(atomicReference, 15000L, "String test flag value", new RunnableC0765j3(this, atomicReference));
    }

    public final ArrayList Z(String str, String str2) {
        if (this.f4245a.f().C()) {
            this.f4245a.d().r().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f4245a.b();
        if (C0719c.a()) {
            this.f4245a.d().r().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f4245a.f().r(atomicReference, 5000L, "get conditional user properties", new RunnableC0729d3(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return a5.v(list);
        }
        this.f4245a.d().r().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final Map a0(String str, String str2, boolean z9) {
        C0846x1 c0846x1R;
        String str3;
        if (this.f4245a.f().C()) {
            c0846x1R = this.f4245a.d().r();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            this.f4245a.b();
            if (!C0719c.a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f4245a.f().r(atomicReference, 5000L, "get user properties", new RunnableC0741f3(this, atomicReference, null, str, str2, z9));
                List<V4> list = (List) atomicReference.get();
                if (list == null) {
                    this.f4245a.d().r().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z9));
                    return Collections.emptyMap();
                }
                C2695a c2695a = new C2695a(list.size());
                for (V4 v42 : list) {
                    Object objH = v42.H();
                    if (objH != null) {
                        c2695a.put(v42.f4519g, objH);
                    }
                }
                return c2695a;
            }
            c0846x1R = this.f4245a.d().r();
            str3 = "Cannot get user properties from main thread";
        }
        c0846x1R.a(str3);
        return Collections.emptyMap();
    }

    public final void f0() {
        h();
        i();
        if (this.f4245a.r()) {
            if (this.f4245a.z().B(null, AbstractC0781m1.f4887b0)) {
                C0749h c0749hZ = this.f4245a.z();
                c0749hZ.f4245a.b();
                Boolean boolT = c0749hZ.t("google_analytics_deferred_deep_link_enabled");
                if (boolT != null && boolT.booleanValue()) {
                    this.f4245a.d().q().a("Deferred Deep Link feature enabled.");
                    this.f4245a.f().z(new Runnable() { // from class: M4.V2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0824t3 c0824t3 = this.f4515a;
                            c0824t3.h();
                            if (c0824t3.f4245a.F().f4418s.b()) {
                                c0824t3.f4245a.d().q().a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jA = c0824t3.f4245a.F().f4419t.a();
                            c0824t3.f4245a.F().f4419t.b(1 + jA);
                            c0824t3.f4245a.z();
                            if (jA < 5) {
                                c0824t3.f4245a.j();
                            } else {
                                c0824t3.f4245a.d().w().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                c0824t3.f4245a.F().f4418s.a(true);
                            }
                        }
                    });
                }
            }
            this.f4245a.L().O();
            this.f5075m = false;
            P1 p1F = this.f4245a.F();
            p1F.h();
            String string = p1F.o().getString("previous_os_version", null);
            p1F.f4245a.A().k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = p1F.o().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f4245a.A().k();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            u("auto", "_ou", bundle);
        }
    }

    @Override // M4.G1
    public final boolean n() {
        return false;
    }

    public final void o(String str, String str2, Bundle bundle) {
        long jA = this.f4245a.a().a();
        com.google.android.gms.common.internal.r.g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f4245a.f().z(new RunnableC0723c3(this, bundle2));
    }

    public final void p() {
        if (!(this.f4245a.c().getApplicationContext() instanceof Application) || this.f5065c == null) {
            return;
        }
        ((Application) this.f4245a.c().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f5065c);
    }

    public final /* synthetic */ void q(Bundle bundle) {
        if (bundle == null) {
            this.f4245a.F().f4423x.b(new Bundle());
            return;
        }
        Bundle bundleA = this.f4245a.F().f4423x.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f4245a.N().V(obj)) {
                    this.f4245a.N().C(this.f5076n, null, 27, null, null, 0);
                }
                this.f4245a.d().x().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (a5.Y(str)) {
                this.f4245a.d().x().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                bundleA.remove(str);
            } else {
                a5 a5VarN = this.f4245a.N();
                this.f4245a.z();
                if (a5VarN.Q("param", str, 100, obj)) {
                    this.f4245a.N().D(bundleA, str, obj);
                }
            }
        }
        this.f4245a.N();
        int iM = this.f4245a.z().m();
        if (bundleA.size() > iM) {
            int i9 = 0;
            for (String str2 : new TreeSet(bundleA.keySet())) {
                i9++;
                if (i9 > iM) {
                    bundleA.remove(str2);
                }
            }
            this.f4245a.N().C(this.f5076n, null, 26, null, null, 0);
            this.f4245a.d().x().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f4245a.F().f4423x.b(bundleA);
        this.f4245a.L().v(bundleA);
    }

    public final void r(String str, String str2, Bundle bundle) {
        s(str, str2, bundle, true, true, this.f4245a.a().a());
    }

    public final void s(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j9) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            this.f4245a.K().E(bundle2, j9);
        } else {
            A(str == null ? "app" : str, str2, j9, bundle2, z10, !z10 || this.f5066d == null || a5.Y(str2), z9, null);
        }
    }

    public final void t(String str, String str2, Bundle bundle, String str3) {
        C0776l2.t();
        A("auto", str2, this.f4245a.a().a(), bundle, false, true, true, str3);
    }

    public final void u(String str, String str2, Bundle bundle) {
        h();
        v(str, str2, this.f4245a.a().a(), bundle);
    }

    public final void v(String str, String str2, long j9, Bundle bundle) {
        h();
        w(str, str2, j9, bundle, true, this.f5066d == null || a5.Y(str2), true, null);
    }

    public final void w(String str, String str2, long j9, Bundle bundle, boolean z9, boolean z10, boolean z11, String str3) {
        boolean z12;
        String str4;
        long j10;
        Bundle[] bundleArr;
        Object[] array;
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.m(bundle);
        h();
        i();
        if (!this.f4245a.o()) {
            this.f4245a.d().q().a("Event not sent since app measurement is disabled");
            return;
        }
        List listU = this.f4245a.B().u();
        if (listU != null && !listU.contains(str2)) {
            this.f4245a.d().q().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f5068f) {
            this.f5068f = true;
            try {
                try {
                    (!this.f4245a.s() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f4245a.c().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f4245a.c());
                } catch (Exception e9) {
                    this.f4245a.d().w().b("Failed to invoke Tag Manager's initialize() method", e9);
                }
            } catch (ClassNotFoundException unused) {
                this.f4245a.d().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.f4245a.b();
            M("auto", "_lgclid", bundle.getString("gclid"), this.f4245a.a().a());
        }
        this.f4245a.b();
        if (z9 && a5.c0(str2)) {
            this.f4245a.N().z(bundle, this.f4245a.F().f4423x.a());
        }
        if (!z11) {
            this.f4245a.b();
            if (!"_iap".equals(str2)) {
                a5 a5VarN = this.f4245a.N();
                int i9 = 2;
                if (a5VarN.S("event", str2)) {
                    if (a5VarN.P("event", L2.f4355a, L2.f4356b, str2)) {
                        a5VarN.f4245a.z();
                        if (a5VarN.N("event", 40, str2)) {
                            i9 = 0;
                        }
                    } else {
                        i9 = 13;
                    }
                }
                if (i9 != 0) {
                    this.f4245a.d().s().b("Invalid public event name. Event will not be logged (FE)", this.f4245a.D().d(str2));
                    a5 a5VarN2 = this.f4245a.N();
                    this.f4245a.z();
                    this.f4245a.N().C(this.f5076n, null, i9, "_ev", a5VarN2.r(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        this.f4245a.b();
        A3 a3S = this.f4245a.K().s(false);
        if (a3S != null && !bundle.containsKey("_sc")) {
            a3S.f4191d = true;
        }
        a5.y(a3S, bundle, z9 && !z11);
        boolean zEquals = "am".equals(str);
        boolean zY = a5.Y(str2);
        if (!z9 || this.f5066d == null || zY) {
            z12 = zEquals;
        } else {
            if (!zEquals) {
                this.f4245a.d().q().c("Passing event to registered event handler (FE)", this.f4245a.D().d(str2), this.f4245a.D().b(bundle));
                com.google.android.gms.common.internal.r.m(this.f5066d);
                this.f5066d.a(str, str2, bundle, j9);
                return;
            }
            z12 = true;
        }
        if (this.f4245a.r()) {
            int iM0 = this.f4245a.N().m0(str2);
            if (iM0 != 0) {
                this.f4245a.d().s().b("Invalid event name. Event will not be logged (FE)", this.f4245a.D().d(str2));
                a5 a5VarN3 = this.f4245a.N();
                this.f4245a.z();
                this.f4245a.N().C(this.f5076n, str3, iM0, "_ev", a5VarN3.r(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleX0 = this.f4245a.N().x0(str3, str2, bundle, C4.f.b("_o", "_sn", "_sc", "_si"), z11);
            com.google.android.gms.common.internal.r.m(bundleX0);
            this.f4245a.b();
            if (this.f4245a.K().s(false) != null && "_ae".equals(str2)) {
                C0849x4 c0849x4 = this.f4245a.M().f5157f;
                long jB = c0849x4.f5129d.f4245a.a().b();
                long j11 = jB - c0849x4.f5127b;
                c0849x4.f5127b = jB;
                if (j11 > 0) {
                    this.f4245a.N().w(bundleX0, j11);
                }
            }
            zzos.zzc();
            if (this.f4245a.z().B(null, AbstractC0781m1.f4897g0)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    a5 a5VarN4 = this.f4245a.N();
                    String string = bundleX0.getString("_ffr");
                    if (C4.o.b(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (Y4.a(string, a5VarN4.f4245a.F().f4420u.a())) {
                        a5VarN4.f4245a.d().q().a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    a5VarN4.f4245a.F().f4420u.b(string);
                } else if ("_ae".equals(str2)) {
                    String strA = this.f4245a.N().f4245a.F().f4420u.a();
                    if (!TextUtils.isEmpty(strA)) {
                        bundleX0.putString("_ffr", strA);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleX0);
            boolean zT = this.f4245a.z().B(null, AbstractC0781m1.f4864I0) ? this.f4245a.M().t() : this.f4245a.F().f4417r.b();
            if (this.f4245a.F().f4414o.a() > 0 && this.f4245a.F().v(j9) && zT) {
                this.f4245a.d().v().a("Current session is expired, remove the session number, ID, and engagement time");
                j10 = 0;
                str4 = "_ae";
                M("auto", "_sid", null, this.f4245a.a().a());
                M("auto", "_sno", null, this.f4245a.a().a());
                M("auto", "_se", null, this.f4245a.a().a());
                this.f4245a.F().f4415p.b(0L);
            } else {
                str4 = "_ae";
                j10 = 0;
            }
            if (bundleX0.getLong("extend_session", j10) == 1) {
                this.f4245a.d().v().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.f4245a.M().f5156e.b(j9, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleX0.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str5 = (String) arrayList2.get(i10);
                if (str5 != null) {
                    this.f4245a.N();
                    Object obj = bundleX0.get(str5);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else {
                        if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            array = arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        bundleArr = (Bundle[]) array;
                    }
                    if (bundleArr != null) {
                        bundleX0.putParcelableArray(str5, bundleArr);
                    }
                }
            }
            int i11 = 0;
            while (i11 < arrayList.size()) {
                Bundle bundleW0 = (Bundle) arrayList.get(i11);
                String str6 = i11 != 0 ? "_ep" : str2;
                bundleW0.putString("_o", str);
                if (z10) {
                    bundleW0 = this.f4245a.N().w0(bundleW0);
                }
                Bundle bundle2 = bundleW0;
                this.f4245a.L().o(new C0832v(str6, new C0820t(bundle2), str, j9), str3);
                if (!z12) {
                    Iterator it = this.f5067e.iterator();
                    while (it.hasNext()) {
                        ((P2) it.next()).a(str, str2, new Bundle(bundle2), j9);
                    }
                }
                i11++;
            }
            this.f4245a.b();
            if (this.f4245a.K().s(false) == null || !str4.equals(str2)) {
                return;
            }
            this.f4245a.M().f5157f.d(true, true, this.f4245a.a().b());
        }
    }

    public final void x(P2 p22) {
        i();
        com.google.android.gms.common.internal.r.m(p22);
        if (this.f5067e.add(p22)) {
            return;
        }
        this.f4245a.d().w().a("OnEventListener already registered");
    }

    public final void y(long j9) {
        this.f5069g.set(null);
        this.f4245a.f().z(new RunnableC0711a3(this, j9));
    }

    public final void z(long j9, boolean z9) {
        h();
        i();
        this.f4245a.d().q().a("Resetting analytics data (FE)");
        C0861z4 c0861z4M = this.f4245a.M();
        c0861z4M.h();
        c0861z4M.f5157f.a();
        zzqu.zzc();
        if (this.f4245a.z().B(null, AbstractC0781m1.f4915p0)) {
            this.f4245a.B().v();
        }
        boolean zO = this.f4245a.o();
        P1 p1F = this.f4245a.F();
        p1F.f4404e.b(j9);
        if (!TextUtils.isEmpty(p1F.f4245a.F().f4420u.a())) {
            p1F.f4420u.b(null);
        }
        zzph.zzc();
        C0749h c0749hZ = p1F.f4245a.z();
        C0775l1 c0775l1 = AbstractC0781m1.f4899h0;
        if (c0749hZ.B(null, c0775l1)) {
            p1F.f4414o.b(0L);
        }
        p1F.f4415p.b(0L);
        if (!p1F.f4245a.z().E()) {
            p1F.t(!zO);
        }
        p1F.f4421v.b(null);
        p1F.f4422w.b(0L);
        p1F.f4423x.b(null);
        if (z9) {
            this.f4245a.L().q();
        }
        zzph.zzc();
        if (this.f4245a.z().B(null, c0775l1)) {
            this.f4245a.M().f5156e.a();
        }
        this.f5075m = !zO;
    }
}
