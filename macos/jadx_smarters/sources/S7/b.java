package S7;

import kotlin.jvm.internal.l;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f9446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9448d;

    public b(String outcomeId, d dVar, float f9, long j9) {
        l.e(outcomeId, "outcomeId");
        this.f9445a = outcomeId;
        this.f9446b = dVar;
        this.f9447c = f9;
        this.f9448d = j9;
    }

    public final String a() {
        return this.f9445a;
    }

    public final d b() {
        return this.f9446b;
    }

    public final long c() {
        return this.f9448d;
    }

    public final float d() {
        return this.f9447c;
    }

    public final boolean e() {
        d dVar = this.f9446b;
        return dVar == null || (dVar.a() == null && this.f9446b.b() == null);
    }

    public final void f(long j9) {
        this.f9448d = j9;
    }

    public final JSONObject g() throws JSONException {
        JSONObject json = new JSONObject().put(Name.MARK, this.f9445a);
        d dVar = this.f9446b;
        if (dVar != null) {
            json.put("sources", dVar.g());
        }
        float f9 = this.f9447c;
        if (f9 > 0.0f) {
            json.put("weight", Float.valueOf(f9));
        }
        long j9 = this.f9448d;
        if (j9 > 0) {
            json.put("timestamp", j9);
        }
        l.d(json, "json");
        return json;
    }

    public String toString() {
        return "OSOutcomeEventParams{outcomeId='" + this.f9445a + "', outcomeSource=" + this.f9446b + ", weight=" + this.f9447c + ", timestamp=" + this.f9448d + '}';
    }
}
