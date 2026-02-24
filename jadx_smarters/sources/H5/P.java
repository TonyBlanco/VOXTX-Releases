package H5;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f2636a;

    static {
        HashMap map = new HashMap();
        f2636a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map map = f2636a;
                if (map.containsKey(string)) {
                    return AbstractC0622m.a(((String) map.get(string)) + ":" + string2);
                }
            }
            return AbstractC0622m.a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e9) {
            return AbstractC0622m.a("WEB_INTERNAL_ERROR:" + str + "[ " + e9.getLocalizedMessage() + " ]");
        }
    }

    public static void b(Intent intent, Status status) {
        y4.e.d(status, intent, "com.google.firebase.auth.internal.STATUS");
    }
}
