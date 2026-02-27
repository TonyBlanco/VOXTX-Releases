package V5;

import O5.InterfaceC0955t;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0955t f10092a;

    public g(InterfaceC0955t interfaceC0955t) {
        this.f10092a = interfaceC0955t;
    }

    public static h a(int i9) {
        if (i9 == 3) {
            return new l();
        }
        L5.f.f().d("Could not determine SettingsJsonTransform for settings version " + i9 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f10092a, jSONObject);
    }
}
