package M4;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzov;
import h4.C1858a;

/* JADX INFO: loaded from: classes3.dex */
public final class P1 extends F2 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pair f4401y = new Pair("", 0L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f4402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public N1 f4403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L1 f4404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L1 f4405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final O1 f4406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final L1 f4410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final J1 f4411l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final O1 f4412m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final J1 f4413n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final L1 f4414o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final L1 f4415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final J1 f4417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final J1 f4418s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final L1 f4419t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final O1 f4420u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final O1 f4421v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final L1 f4422w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final K1 f4423x;

    public P1(C0776l2 c0776l2) {
        super(c0776l2);
        this.f4410k = new L1(this, "session_timeout", 1800000L);
        this.f4411l = new J1(this, "start_new_session", true);
        this.f4414o = new L1(this, "last_pause_time", 0L);
        this.f4415p = new L1(this, "session_id", 0L);
        this.f4412m = new O1(this, "non_personalized_ads", null);
        this.f4413n = new J1(this, "allow_remote_dynamite", false);
        this.f4404e = new L1(this, "first_open_time", 0L);
        this.f4405f = new L1(this, "app_install_time", 0L);
        this.f4406g = new O1(this, "app_instance_id", null);
        this.f4417r = new J1(this, "app_backgrounded", false);
        this.f4418s = new J1(this, "deep_link_retrieval_complete", false);
        this.f4419t = new L1(this, "deep_link_retrieval_attempts", 0L);
        this.f4420u = new O1(this, "firebase_feature_rollouts", null);
        this.f4421v = new O1(this, "deferred_attribution_cache", null);
        this.f4422w = new L1(this, "deferred_attribution_cache_timestamp", 0L);
        this.f4423x = new K1(this, "default_event_parameters", null);
    }

    @Override // M4.F2
    public final void i() {
        SharedPreferences sharedPreferences = this.f4245a.c().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f4402c = sharedPreferences;
        boolean z9 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f4416q = z9;
        if (!z9) {
            SharedPreferences.Editor editorEdit = this.f4402c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f4245a.z();
        this.f4403d = new N1(this, "health_monitor", Math.max(0L, ((Long) AbstractC0781m1.f4892e.a(null)).longValue()), null);
    }

    @Override // M4.F2
    public final boolean j() {
        return true;
    }

    public final SharedPreferences o() {
        h();
        k();
        com.google.android.gms.common.internal.r.m(this.f4402c);
        return this.f4402c;
    }

    public final Pair p(String str) {
        h();
        zzov.zzc();
        if (this.f4245a.z().B(null, AbstractC0781m1.f4868K0) && !q().j(J2.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        long jB = this.f4245a.a().b();
        String str2 = this.f4407h;
        if (str2 != null && jB < this.f4409j) {
            return new Pair(str2, Boolean.valueOf(this.f4408i));
        }
        this.f4409j = jB + this.f4245a.z().r(str, AbstractC0781m1.f4888c);
        C1858a.c(true);
        try {
            C1858a.C0341a c0341aA = C1858a.a(this.f4245a.c());
            this.f4407h = "";
            String strA = c0341aA.a();
            if (strA != null) {
                this.f4407h = strA;
            }
            this.f4408i = c0341aA.b();
        } catch (Exception e9) {
            this.f4245a.d().q().b("Unable to get advertising id", e9);
            this.f4407h = "";
        }
        C1858a.c(false);
        return new Pair(this.f4407h, Boolean.valueOf(this.f4408i));
    }

    public final K2 q() {
        h();
        return K2.c(o().getString("consent_settings", "G1"), o().getInt("consent_source", 100));
    }

    public final Boolean r() {
        h();
        if (o().contains("measurement_enabled")) {
            return Boolean.valueOf(o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final void s(Boolean bool) {
        h();
        SharedPreferences.Editor editorEdit = o().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    public final void t(boolean z9) {
        h();
        this.f4245a.d().v().b("App measurement setting deferred collection", Boolean.valueOf(z9));
        SharedPreferences.Editor editorEdit = o().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z9);
        editorEdit.apply();
    }

    public final boolean u() {
        SharedPreferences sharedPreferences = this.f4402c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final boolean v(long j9) {
        return j9 - this.f4410k.a() > this.f4414o.a();
    }

    public final boolean w(int i9) {
        return K2.k(i9, o().getInt("consent_source", 100));
    }
}
