package O7;

import com.onesignal.InterfaceC1588t1;
import com.onesignal.P0;
import k8.q;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c dataRepository, P0 logger, InterfaceC1588t1 timeProvider) {
        super(dataRepository, logger, timeProvider);
        l.e(dataRepository, "dataRepository");
        l.e(logger, "logger");
        l.e(timeProvider, "timeProvider");
    }

    @Override // O7.a
    public void a(JSONObject jsonObject, P7.a influence) {
        l.e(jsonObject, "jsonObject");
        l.e(influence, "influence");
        if (influence.d().isAttributed()) {
            try {
                jsonObject.put("direct", influence.d().isDirect());
                jsonObject.put("notification_ids", influence.b());
            } catch (JSONException e9) {
                o().error("Generating notification tracker addSessionData JSONObject ", e9);
            }
        }
    }

    @Override // O7.a
    public void b() {
        c cVarF = f();
        P7.c cVarK = k();
        if (cVarK == null) {
            cVarK = P7.c.UNATTRIBUTED;
        }
        cVarF.b(cVarK);
        f().c(g());
    }

    @Override // O7.a
    public int c() {
        return f().l();
    }

    @Override // O7.a
    public P7.b d() {
        return P7.b.NOTIFICATION;
    }

    @Override // O7.a
    public String h() {
        return "notification_id";
    }

    @Override // O7.a
    public int i() {
        return f().k();
    }

    @Override // O7.a
    public JSONArray l() {
        return f().i();
    }

    @Override // O7.a
    public JSONArray m(String str) {
        try {
            return l();
        } catch (JSONException e9) {
            o().error("Generating Notification tracker getLastChannelObjects JSONObject ", e9);
            return new JSONArray();
        }
    }

    @Override // O7.a
    public void p() {
        P7.c cVarJ = f().j();
        if (cVarJ.isIndirect()) {
            x(n());
        } else if (cVarJ.isDirect()) {
            w(f().d());
        }
        q qVar = q.f43674a;
        y(cVarJ);
        o().debug(l.l("OneSignal NotificationTracker initInfluencedTypeFromCache: ", this));
    }

    @Override // O7.a
    public void u(JSONArray channelObjects) {
        l.e(channelObjects, "channelObjects");
        f().r(channelObjects);
    }
}
