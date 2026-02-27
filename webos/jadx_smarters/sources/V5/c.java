package V5;

import O5.C0951o;
import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S5.b f10067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L5.f f10068c;

    public c(String str, S5.b bVar) {
        this(str, bVar, L5.f.f());
    }

    public c(String str, S5.b bVar, L5.f fVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f10068c = fVar;
        this.f10067b = bVar;
        this.f10066a = str;
    }

    @Override // V5.k
    public JSONObject a(j jVar, boolean z9) {
        if (!z9) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map mapF = f(jVar);
            S5.a aVarB = b(d(mapF), jVar);
            this.f10068c.b("Requesting settings from " + this.f10066a);
            this.f10068c.i("Settings query params were: " + mapF);
            return g(aVarB.c());
        } catch (IOException e9) {
            this.f10068c.e("Settings request failed.", e9);
            return null;
        }
    }

    public final S5.a b(S5.a aVar, j jVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.f10093a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", C0951o.i());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.f10094b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.f10095c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f10096d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.f10097e.a().c());
        return aVar;
    }

    public final void c(S5.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    public S5.a d(Map map) {
        return this.f10067b.a(this.f10066a, map).d("User-Agent", "Crashlytics Android SDK/" + C0951o.i()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public final JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e9) {
            this.f10068c.l("Failed to parse settings JSON from " + this.f10066a, e9);
            this.f10068c.k("Settings response " + str);
            return null;
        }
    }

    public final Map f(j jVar) {
        HashMap map = new HashMap();
        map.put("build_version", jVar.f10100h);
        map.put("display_version", jVar.f10099g);
        map.put("source", Integer.toString(jVar.f10101i));
        String str = jVar.f10098f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject g(S5.c cVar) {
        int iB = cVar.b();
        this.f10068c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(cVar.a());
        }
        this.f10068c.d("Settings request failed; (status: " + iB + ") from " + this.f10066a);
        return null;
    }

    public boolean h(int i9) {
        return i9 == 200 || i9 == 201 || i9 == 202 || i9 == 203;
    }
}
