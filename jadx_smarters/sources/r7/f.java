package R7;

import com.onesignal.G1;
import com.onesignal.I1;
import kotlin.jvm.internal.l;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(G1 client) {
        super(client);
        l.e(client, "client");
    }

    @Override // R7.j
    public void a(JSONObject jsonObject, I1 responseHandler) {
        l.e(jsonObject, "jsonObject");
        l.e(responseHandler, "responseHandler");
        b().a("outcomes/measure", jsonObject, responseHandler);
    }
}
