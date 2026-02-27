package S7;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONArray f9451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f9452b;

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public e(JSONArray jSONArray, JSONArray jSONArray2) {
        this.f9451a = jSONArray;
        this.f9452b = jSONArray2;
    }

    public /* synthetic */ e(JSONArray jSONArray, JSONArray jSONArray2, int i9, g gVar) {
        this((i9 & 1) != 0 ? new JSONArray() : jSONArray, (i9 & 2) != 0 ? new JSONArray() : jSONArray2);
    }

    public final JSONArray a() {
        return this.f9452b;
    }

    public final JSONArray b() {
        return this.f9451a;
    }

    public final void c(JSONArray jSONArray) {
        this.f9452b = jSONArray;
    }

    public final void d(JSONArray jSONArray) {
        this.f9451a = jSONArray;
    }

    public final JSONObject e() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("notification_ids", this.f9451a).put("in_app_message_ids", this.f9452b);
        l.d(jSONObjectPut, "JSONObject()\n        .pu…AM_IDS, inAppMessagesIds)");
        return jSONObjectPut;
    }

    public String toString() {
        return "OSOutcomeSourceBody{notificationIds=" + this.f9451a + ", inAppMessagesIds=" + this.f9452b + '}';
    }
}
