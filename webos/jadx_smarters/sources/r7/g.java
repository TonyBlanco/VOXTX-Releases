package R7;

import com.onesignal.I1;
import com.onesignal.P0;
import kotlin.jvm.internal.l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(P0 logger, a outcomeEventsCache, j outcomeEventsService) {
        super(logger, outcomeEventsCache, outcomeEventsService);
        l.e(logger, "logger");
        l.e(outcomeEventsCache, "outcomeEventsCache");
        l.e(outcomeEventsService, "outcomeEventsService");
    }

    @Override // S7.c
    public void i(String appId, int i9, S7.b event, I1 responseHandler) {
        l.e(appId, "appId");
        l.e(event, "event");
        l.e(responseHandler, "responseHandler");
        try {
            JSONObject jsonObject = event.g().put("app_id", appId).put("device_type", i9);
            j jVarK = k();
            l.d(jsonObject, "jsonObject");
            jVarK.a(jsonObject, responseHandler);
        } catch (JSONException e9) {
            j().error("Generating indirect outcome:JSON Failed.", e9);
        }
    }
}
