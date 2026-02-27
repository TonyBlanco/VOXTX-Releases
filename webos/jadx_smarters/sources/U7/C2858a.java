package u7;

import a7.j;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import m7.AbstractC2237a;

/* JADX INFO: renamed from: u7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2858a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f51227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f51228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f51229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f51230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f51231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f51232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f51233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences f51234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences f51235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SharedPreferences f51236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SharedPreferences f51237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences.Editor f51238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SharedPreferences.Editor f51239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences.Editor f51240n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f51241o;

    public C2858a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f51227a = applicationContext;
        this.f51228b = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        this.f51229c = this.f51227a.getSharedPreferences("pref.using_opensl_es", 0);
        this.f51236j = this.f51227a.getSharedPreferences("pref.using_opengl", 0);
        SharedPreferences sharedPreferences = this.f51227a.getSharedPreferences("pref.using_media_codec", 0);
        this.f51237k = sharedPreferences;
        this.f51238l = sharedPreferences.edit();
        SharedPreferences sharedPreferences2 = this.f51227a.getSharedPreferences("auto_start", 0);
        this.f51232f = sharedPreferences2;
        this.f51239m = sharedPreferences2.edit();
        SharedPreferences sharedPreferences3 = this.f51227a.getSharedPreferences("pref.billing_p", 0);
        this.f51235i = sharedPreferences3;
        this.f51240n = sharedPreferences3.edit();
        this.f51230d = this.f51227a.getSharedPreferences("pref.using_infbuf", 0);
        this.f51231e = this.f51227a.getSharedPreferences("pref.using_sub_font_size", 0);
        this.f51232f = this.f51227a.getSharedPreferences("auto_start", 0);
        this.f51233g = this.f51227a.getSharedPreferences("automation_channels", 0);
        this.f51234h = this.f51227a.getSharedPreferences("automation_epg", 0);
        this.f51241o = this.f51227a.getSharedPreferences("loginPrefs", 0);
    }

    public String A() {
        try {
            return this.f51232f.getString("pref.screen_type", "");
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean B() {
        return this.f51232f.getBoolean("show_epg_in_channels_list", AbstractC2237a.f44433A0);
    }

    public String C() {
        return this.f51241o.getString("serverTimeZone", AbstractC2237a.f44549y0);
    }

    public boolean D() {
        return this.f51237k.getString("pref.using_media_codec", AbstractC2237a.f44543v0).equals(this.f51227a.getResources().getString(j.f13349p2));
    }

    public boolean E() {
        return this.f51228b.getBoolean(this.f51227a.getString(j.f12979D5), false);
    }

    public boolean F() {
        return this.f51228b.getBoolean(this.f51227a.getString(j.f12989E5), false);
    }

    public boolean G() {
        return this.f51229c.getString("pref.using_opensl_es", "").equals("checked");
    }

    public Boolean H() {
        return Boolean.valueOf(this.f51232f.getBoolean("full_epg", true));
    }

    public void I(Boolean bool) {
        SharedPreferences.Editor editor = this.f51239m;
        if (editor != null) {
            editor.putBoolean("subtitle_active", bool.booleanValue());
            this.f51239m.apply();
        }
    }

    public void J(boolean z9) {
        try {
            SharedPreferences.Editor editor = this.f51239m;
            if (editor != null) {
                editor.putBoolean("auto_clear_cache", z9);
            }
        } catch (Exception unused) {
        }
    }

    public void K(String str) {
        SharedPreferences.Editor editor = this.f51239m;
        if (editor != null) {
            editor.putString("autoplay_seconds", str);
            this.f51239m.apply();
        }
    }

    public void L(Boolean bool) {
        SharedPreferences.Editor editor = this.f51239m;
        if (editor != null) {
            editor.putBoolean("autoplay", bool.booleanValue());
            this.f51239m.apply();
        }
    }

    public void M(Boolean bool) {
        SharedPreferences.Editor editor = this.f51239m;
        if (editor != null) {
            editor.putBoolean("auto_start", bool.booleanValue());
            this.f51239m.apply();
        }
    }

    public void N(boolean z9) {
        try {
            SharedPreferences.Editor editor = this.f51239m;
            if (editor != null) {
                editor.putBoolean("auto_play_channel_in_live", z9);
            }
        } catch (Exception unused) {
        }
    }

    public void O(String str, String str2, int i9) {
        try {
            this.f51240n.putString("pref_billing_p_email", str);
            this.f51240n.putString("pref_billing_p_pass", str2);
            this.f51240n.putInt("pref_billing_p_id", i9);
            this.f51240n.apply();
        } catch (Exception unused) {
        }
    }

    public void P() {
        try {
            this.f51240n.putString("pref_billing_p_date", String.valueOf(System.currentTimeMillis()));
            this.f51240n.apply();
        } catch (Exception unused) {
        }
    }

    public void Q(Boolean bool) {
        try {
            SharedPreferences.Editor editor = this.f51240n;
            bool.booleanValue();
            editor.putBoolean("pref_billing_p_is_p", true);
            this.f51240n.apply();
        } catch (Exception unused) {
        }
    }

    public void R(int i9) {
        try {
            this.f51239m.putInt("pref.brightness", i9);
            this.f51239m.apply();
        } catch (Exception unused) {
        }
    }

    public void S(boolean z9) {
        try {
            SharedPreferences.Editor editor = this.f51239m;
            if (editor != null) {
                editor.putBoolean("show_epg_in_channels_list", z9);
            }
        } catch (Exception unused) {
        }
    }

    public void T(Boolean bool) {
        try {
            this.f51240n.putBoolean("pref_billing_p_max_conn", bool.booleanValue());
            this.f51240n.apply();
        } catch (Exception unused) {
        }
    }

    public void U(String str) {
        this.f51238l.putString("pref.using_media_codec", str);
        this.f51238l.apply();
    }

    public void V(int i9) {
        try {
            this.f51239m.putInt("recently_added_limit", i9);
            this.f51239m.apply();
        } catch (Exception unused) {
        }
    }

    public void W(int i9) {
        SharedPreferences.Editor editor = this.f51239m;
        if (editor != null) {
            editor.putInt("recently_watched_limit_live", i9);
            this.f51239m.apply();
        }
    }

    public void X(String str) {
        try {
            this.f51239m.putString("pref.screen_type", str);
            this.f51239m.apply();
        } catch (Exception unused) {
        }
    }

    public void Y(Boolean bool) {
        SharedPreferences.Editor editor = this.f51239m;
        if (editor != null) {
            editor.putBoolean("full_epg", bool.booleanValue());
            this.f51239m.apply();
        }
    }

    public void a() {
        try {
            this.f51240n.clear().commit();
        } catch (Exception unused) {
        }
    }

    public Boolean b() {
        return Boolean.valueOf(this.f51232f.getBoolean("subtitle_active", true));
    }

    public boolean c() {
        return this.f51232f.getBoolean("auto_clear_cache", AbstractC2237a.f44551z0);
    }

    public String d() {
        return this.f51232f.getString("autoplay_seconds", AbstractC2237a.f44539t0);
    }

    public Boolean e() {
        return Boolean.valueOf(this.f51232f.getBoolean("autoplay", true));
    }

    public Boolean f() {
        return Boolean.valueOf(this.f51232f.getBoolean("auto_start", true));
    }

    public int g() {
        return this.f51233g.getInt("automation_channels_days", AbstractC2237a.f44439D0);
    }

    public int h() {
        return this.f51234h.getInt("automation_epg_days", AbstractC2237a.f44447H0);
    }

    public boolean i() {
        return this.f51232f.getBoolean("auto_play_channel_in_live", AbstractC2237a.f44435B0);
    }

    public String j() {
        try {
            return this.f51235i.getString("pref_billing_p_date", "");
        } catch (Exception unused) {
            return "";
        }
    }

    public String k() {
        try {
            return this.f51235i.getString("pref_billing_p_email", "Premium");
        } catch (Exception unused) {
            return "Premium";
        }
    }

    public int l() {
        try {
            return this.f51235i.getInt("pref_billing_p_id", 1234567);
        } catch (Exception unused) {
            return 1234567;
        }
    }

    public Boolean m() {
        try {
            this.f51235i.getBoolean("pref_billing_p_is_p", false);
            return true;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public String n() {
        try {
            return this.f51235i.getString("pref_billing_p_pass", "123456");
        } catch (Exception unused) {
            return "123456";
        }
    }

    public int o() {
        try {
            return this.f51232f.getInt("pref.brightness", AbstractC2237a.f44451J0);
        } catch (Exception unused) {
            return AbstractC2237a.f44451J0;
        }
    }

    public boolean p() {
        return this.f51228b.getBoolean(this.f51227a.getString(j.f13432x5), false);
    }

    public boolean q() {
        return this.f51228b.getBoolean(this.f51227a.getString(j.f13442y5), false);
    }

    public boolean r() {
        return this.f51228b.getBoolean(this.f51227a.getString(j.f13452z5), false);
    }

    public boolean s() {
        return this.f51228b.getBoolean(this.f51227a.getString(j.f12949A5), false);
    }

    public boolean t() {
        return this.f51228b.getBoolean(this.f51227a.getString(j.f12959B5), false);
    }

    public Boolean u() {
        try {
            return Boolean.valueOf(this.f51235i.getBoolean("pref_billing_p_max_conn", false));
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public boolean v() {
        return this.f51228b.getBoolean(this.f51227a.getString(j.f12969C5), false);
    }

    public String w() {
        return this.f51236j.getString("pref.using_opengl", "");
    }

    public int x() {
        String string = this.f51237k.getString("pref.using_media_codec", AbstractC2237a.f44543v0);
        if (string.equals(this.f51227a.getResources().getString(j.f13146U3))) {
            return 3;
        }
        if (string.equals(this.f51227a.getResources().getString(j.f13349p2))) {
            return 2;
        }
        string.equals(this.f51227a.getResources().getString(j.f13234d7));
        return 2;
    }

    public int y() {
        return this.f51232f.getInt("recently_added_limit", AbstractC2237a.f44535r0);
    }

    public int z() {
        return this.f51232f.getInt("recently_watched_limit_live", AbstractC2237a.f44537s0);
    }
}
