package V5;

import O5.InterfaceC0955t;
import V5.d;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements h {
    public static d b(InterfaceC0955t interfaceC0955t) {
        return new d(interfaceC0955t.a() + ((long) DateTimeConstants.MILLIS_PER_HOUR), new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // V5.h
    public d a(InterfaceC0955t interfaceC0955t, JSONObject jSONObject) {
        return b(interfaceC0955t);
    }
}
