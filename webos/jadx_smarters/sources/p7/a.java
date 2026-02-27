package P7;

import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f7356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f7357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONArray f7358c;

    public a(b influenceChannel, c influenceType, JSONArray jSONArray) {
        l.e(influenceChannel, "influenceChannel");
        l.e(influenceType, "influenceType");
        this.f7357b = influenceChannel;
        this.f7356a = influenceType;
        this.f7358c = jSONArray;
    }

    public a(String jsonString) throws JSONException {
        l.e(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        String string = jSONObject.getString("influence_channel");
        String string2 = jSONObject.getString("influence_type");
        String ids = jSONObject.getString("influence_ids");
        this.f7357b = b.Companion.a(string);
        this.f7356a = c.Companion.a(string2);
        l.d(ids, "ids");
        this.f7358c = ids.length() == 0 ? null : new JSONArray(ids);
    }

    public final a a() {
        return new a(this.f7357b, this.f7356a, this.f7358c);
    }

    public final JSONArray b() {
        return this.f7358c;
    }

    public final b c() {
        return this.f7357b;
    }

    public final c d() {
        return this.f7356a;
    }

    public final void e(JSONArray jSONArray) {
        this.f7358c = jSONArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.a(a.class, obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7357b == aVar.f7357b && this.f7356a == aVar.f7356a;
    }

    public final void f(c cVar) {
        l.e(cVar, "<set-?>");
        this.f7356a = cVar;
    }

    public final String g() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("influence_channel", this.f7357b.toString()).put("influence_type", this.f7356a.toString());
        JSONArray jSONArray = this.f7358c;
        String string = jSONObjectPut.put("influence_ids", jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        l.d(string, "JSONObject()\n        .pu…e \"\")\n        .toString()");
        return string;
    }

    public int hashCode() {
        return (this.f7357b.hashCode() * 31) + this.f7356a.hashCode();
    }

    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.f7357b + ", influenceType=" + this.f7356a + ", ids=" + this.f7358c + '}';
    }
}
