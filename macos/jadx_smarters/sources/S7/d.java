package S7;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f9449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f9450b;

    public d(e eVar, e eVar2) {
        this.f9449a = eVar;
        this.f9450b = eVar2;
    }

    public final e a() {
        return this.f9449a;
    }

    public final e b() {
        return this.f9450b;
    }

    public final d c(e eVar) {
        d(eVar);
        return this;
    }

    public final void d(e eVar) {
        this.f9449a = eVar;
    }

    public final d e(e eVar) {
        f(eVar);
        return this;
    }

    public final void f(e eVar) {
        this.f9450b = eVar;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        e eVar = this.f9449a;
        if (eVar != null) {
            jSONObject.put("direct", eVar.e());
        }
        e eVar2 = this.f9450b;
        if (eVar2 != null) {
            jSONObject.put("indirect", eVar2.e());
        }
        return jSONObject;
    }

    public String toString() {
        return "OSOutcomeSource{directBody=" + this.f9449a + ", indirectBody=" + this.f9450b + '}';
    }
}
