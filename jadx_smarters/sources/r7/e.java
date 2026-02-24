package R7;

import com.onesignal.C1538c1;
import com.onesignal.I1;
import com.onesignal.P0;
import kotlin.jvm.internal.l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends d {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9359a;

        static {
            int[] iArr = new int[P7.c.values().length];
            iArr[P7.c.DIRECT.ordinal()] = 1;
            iArr[P7.c.INDIRECT.ordinal()] = 2;
            iArr[P7.c.UNATTRIBUTED.ordinal()] = 3;
            f9359a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(P0 logger, R7.a outcomeEventsCache, j outcomeEventsService) {
        super(logger, outcomeEventsCache, outcomeEventsService);
        l.e(logger, "logger");
        l.e(outcomeEventsCache, "outcomeEventsCache");
        l.e(outcomeEventsService, "outcomeEventsService");
    }

    @Override // S7.c
    public void i(String appId, int i9, S7.b eventParams, I1 responseHandler) {
        l.e(appId, "appId");
        l.e(eventParams, "eventParams");
        l.e(responseHandler, "responseHandler");
        C1538c1 event = C1538c1.a(eventParams);
        P7.c cVarB = event.b();
        int i10 = cVarB == null ? -1 : a.f9359a[cVarB.ordinal()];
        if (i10 == 1) {
            l.d(event, "event");
            l(appId, i9, event, responseHandler);
        } else if (i10 == 2) {
            l.d(event, "event");
            m(appId, i9, event, responseHandler);
        } else {
            if (i10 != 3) {
                return;
            }
            l.d(event, "event");
            n(appId, i9, event, responseHandler);
        }
    }

    public final void l(String str, int i9, C1538c1 c1538c1, I1 i12) {
        try {
            JSONObject jsonObject = c1538c1.c().put("app_id", str).put("device_type", i9).put("direct", true);
            j jVarK = k();
            l.d(jsonObject, "jsonObject");
            jVarK.a(jsonObject, i12);
        } catch (JSONException e9) {
            j().error("Generating direct outcome:JSON Failed.", e9);
        }
    }

    public final void m(String str, int i9, C1538c1 c1538c1, I1 i12) {
        try {
            JSONObject jsonObject = c1538c1.c().put("app_id", str).put("device_type", i9).put("direct", false);
            j jVarK = k();
            l.d(jsonObject, "jsonObject");
            jVarK.a(jsonObject, i12);
        } catch (JSONException e9) {
            j().error("Generating indirect outcome:JSON Failed.", e9);
        }
    }

    public final void n(String str, int i9, C1538c1 c1538c1, I1 i12) {
        try {
            JSONObject jsonObject = c1538c1.c().put("app_id", str).put("device_type", i9);
            j jVarK = k();
            l.d(jsonObject, "jsonObject");
            jVarK.a(jsonObject, i12);
        } catch (JSONException e9) {
            j().error("Generating unattributed outcome:JSON Failed.", e9);
        }
    }
}
