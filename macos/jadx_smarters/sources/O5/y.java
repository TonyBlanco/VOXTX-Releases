package O5;

import O5.z;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class y implements z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f6684g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f6685h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f6686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k6.h f6689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0956u f6690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z.a f6691f;

    public y(Context context, String str, k6.h hVar, C0956u c0956u) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f6687b = context;
        this.f6688c = str;
        this.f6689d = hVar;
        this.f6690e = c0956u;
        this.f6686a = new A();
    }

    public static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        return f6684g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    @Override // O5.z
    public synchronized z.a a() {
        z.a aVarB;
        if (!n()) {
            return this.f6691f;
        }
        L5.f.f().i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesS = AbstractC0945i.s(this.f6687b);
        String string = sharedPreferencesS.getString("firebase.installation.id", null);
        L5.f.f().i("Cached Firebase Installation ID: " + string);
        if (this.f6690e.d()) {
            String strD = d();
            L5.f.f().i("Fetched Firebase Installation ID: " + strD);
            if (strD == null) {
                strD = string == null ? c() : string;
            }
            aVarB = strD.equals(string) ? z.a.a(l(sharedPreferencesS), strD) : z.a.a(b(strD, sharedPreferencesS), strD);
        } else {
            aVarB = k(string) ? z.a.b(l(sharedPreferencesS)) : z.a.b(b(c(), sharedPreferencesS));
        }
        this.f6691f = aVarB;
        L5.f.f().i("Install IDs: " + this.f6691f);
        return this.f6691f;
    }

    public final synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        L5.f.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    public String d() {
        try {
            return (String) W.f(this.f6689d.getId());
        } catch (Exception e9) {
            L5.f.f().l("Failed to retrieve Firebase Installation ID.", e9);
            return null;
        }
    }

    public String f() {
        return this.f6688c;
    }

    public String g() {
        return this.f6686a.a(this.f6687b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }

    public final String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public final String m(String str) {
        return str.replaceAll(f6685h, "");
    }

    public final boolean n() {
        z.a aVar = this.f6691f;
        return aVar == null || (aVar.d() == null && this.f6690e.d());
    }
}
