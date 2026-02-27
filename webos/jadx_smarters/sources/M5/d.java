package M5;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class d implements b, N5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public N5.a f5165a;

    public static String b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // N5.b
    public void a(N5.a aVar) {
        this.f5165a = aVar;
        L5.f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // M5.b
    public void onEvent(String str, Bundle bundle) {
        N5.a aVar = this.f5165a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                L5.f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
