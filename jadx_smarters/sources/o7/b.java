package O7;

import com.onesignal.InterfaceC1588t1;
import com.onesignal.P0;
import k8.q;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c dataRepository, P0 logger, InterfaceC1588t1 timeProvider) {
        super(dataRepository, logger, timeProvider);
        l.e(dataRepository, "dataRepository");
        l.e(logger, "logger");
        l.e(timeProvider, "timeProvider");
    }

    @Override // O7.a
    public void a(JSONObject jsonObject, P7.a influence) {
        l.e(jsonObject, "jsonObject");
        l.e(influence, "influence");
    }

    @Override // O7.a
    public void b() {
        P7.c cVarK = k();
        if (cVarK == null) {
            cVarK = P7.c.UNATTRIBUTED;
        }
        c cVarF = f();
        if (cVarK == P7.c.DIRECT) {
            cVarK = P7.c.INDIRECT;
        }
        cVarF.a(cVarK);
    }

    @Override // O7.a
    public int c() {
        return f().g();
    }

    @Override // O7.a
    public P7.b d() {
        return P7.b.IAM;
    }

    @Override // O7.a
    public String h() {
        return "iam_id";
    }

    @Override // O7.a
    public int i() {
        return f().f();
    }

    @Override // O7.a
    public JSONArray l() {
        return f().h();
    }

    @Override // O7.a
    public JSONArray m(String str) {
        try {
            JSONArray jSONArrayL = l();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = jSONArrayL.length();
                if (length > 0) {
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        if (!l.a(str, jSONArrayL.getJSONObject(i9).getString(h()))) {
                            jSONArray.put(jSONArrayL.getJSONObject(i9));
                        }
                        if (i10 >= length) {
                            break;
                        }
                        i9 = i10;
                    }
                }
                return jSONArray;
            } catch (JSONException e9) {
                o().error("Generating tracker lastChannelObjectReceived get JSONObject ", e9);
                return jSONArrayL;
            }
        } catch (JSONException e10) {
            o().error("Generating IAM tracker getLastChannelObjects JSONObject ", e10);
            return new JSONArray();
        }
    }

    @Override // O7.a
    public void p() {
        P7.c cVarE = f().e();
        if (cVarE.isIndirect()) {
            x(n());
        }
        q qVar = q.f43674a;
        y(cVarE);
        o().debug(l.l("OneSignal InAppMessageTracker initInfluencedTypeFromCache: ", this));
    }

    @Override // O7.a
    public void u(JSONArray channelObjects) {
        l.e(channelObjects, "channelObjects");
        f().p(channelObjects);
    }
}
