package O7;

import com.onesignal.InterfaceC1588t1;
import com.onesignal.P0;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f6708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public P0 f6709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1588t1 f6710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P7.c f6711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JSONArray f6712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6713f;

    public a(c dataRepository, P0 logger, InterfaceC1588t1 timeProvider) {
        l.e(dataRepository, "dataRepository");
        l.e(logger, "logger");
        l.e(timeProvider, "timeProvider");
        this.f6708a = dataRepository;
        this.f6709b = logger;
        this.f6710c = timeProvider;
    }

    public abstract void a(JSONObject jSONObject, P7.a aVar);

    public abstract void b();

    public abstract int c();

    public abstract P7.b d();

    public final P7.a e() {
        P7.c cVar;
        P7.b bVarD = d();
        P7.c cVar2 = P7.c.DISABLED;
        P7.a aVar = new P7.a(bVarD, cVar2, null);
        if (this.f6711d == null) {
            p();
        }
        P7.c cVar3 = this.f6711d;
        if (cVar3 != null) {
            cVar2 = cVar3;
        }
        if (cVar2.isDirect()) {
            if (q()) {
                aVar.e(new JSONArray().put(g()));
                cVar = P7.c.DIRECT;
                aVar.f(cVar);
            }
        } else if (cVar2.isIndirect()) {
            if (r()) {
                aVar.e(j());
                cVar = P7.c.INDIRECT;
                aVar.f(cVar);
            }
        } else if (s()) {
            cVar = P7.c.UNATTRIBUTED;
            aVar.f(cVar);
        }
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.a(getClass(), obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6711d == aVar.f6711d && l.a(aVar.h(), h());
    }

    public final c f() {
        return this.f6708a;
    }

    public final String g() {
        return this.f6713f;
    }

    public abstract String h();

    public int hashCode() {
        P7.c cVar = this.f6711d;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + h().hashCode();
    }

    public abstract int i();

    public final JSONArray j() {
        return this.f6712e;
    }

    public final P7.c k() {
        return this.f6711d;
    }

    public abstract JSONArray l();

    public abstract JSONArray m(String str);

    public final JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArrayL = l();
            this.f6709b.debug(l.l("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: ", jSONArrayL));
            long jI = ((long) (i() * 60)) * 1000;
            long jA = this.f6710c.a();
            int length = jSONArrayL.length();
            if (length > 0) {
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    JSONObject jSONObject = jSONArrayL.getJSONObject(i9);
                    if (jA - jSONObject.getLong("time") <= jI) {
                        jSONArray.put(jSONObject.getString(h()));
                    }
                    if (i10 >= length) {
                        break;
                    }
                    i9 = i10;
                }
            }
        } catch (JSONException e9) {
            this.f6709b.error("Generating tracker getLastReceivedIds JSONObject ", e9);
        }
        return jSONArray;
    }

    public final P0 o() {
        return this.f6709b;
    }

    public abstract void p();

    public final boolean q() {
        return this.f6708a.m();
    }

    public final boolean r() {
        return this.f6708a.n();
    }

    public final boolean s() {
        return this.f6708a.o();
    }

    public final void t() {
        this.f6713f = null;
        JSONArray jSONArrayN = n();
        this.f6712e = jSONArrayN;
        this.f6711d = (jSONArrayN == null ? 0 : jSONArrayN.length()) > 0 ? P7.c.INDIRECT : P7.c.UNATTRIBUTED;
        b();
        this.f6709b.debug("OneSignal OSChannelTracker resetAndInitInfluence: " + h() + " finish with influenceType: " + this.f6711d);
    }

    public String toString() {
        return "OSChannelTracker{tag=" + h() + ", influenceType=" + this.f6711d + ", indirectIds=" + this.f6712e + ", directId=" + ((Object) this.f6713f) + '}';
    }

    public abstract void u(JSONArray jSONArray);

    public final void v(String str) {
        this.f6709b.debug("OneSignal OSChannelTracker for: " + h() + " saveLastId: " + ((Object) str));
        if (str == null || str.length() == 0) {
            return;
        }
        JSONArray jSONArrayM = m(str);
        this.f6709b.debug("OneSignal OSChannelTracker for: " + h() + " saveLastId with lastChannelObjectsReceived: " + jSONArrayM);
        try {
            jSONArrayM.put(new JSONObject().put(h(), str).put("time", this.f6710c.a()));
            if (jSONArrayM.length() > c()) {
                int length = jSONArrayM.length() - c();
                JSONArray jSONArray = new JSONArray();
                int length2 = jSONArrayM.length();
                if (length < length2) {
                    while (true) {
                        int i9 = length + 1;
                        try {
                            jSONArray.put(jSONArrayM.get(length));
                        } catch (JSONException e9) {
                            this.f6709b.error("Generating tracker lastChannelObjectsReceived get JSONObject ", e9);
                        }
                        if (i9 >= length2) {
                            break;
                        } else {
                            length = i9;
                        }
                    }
                }
                jSONArrayM = jSONArray;
            }
            this.f6709b.debug("OneSignal OSChannelTracker for: " + h() + " with channelObjectToSave: " + jSONArrayM);
            u(jSONArrayM);
        } catch (JSONException e10) {
            this.f6709b.error("Generating tracker newInfluenceId JSONObject ", e10);
        }
    }

    public final void w(String str) {
        this.f6713f = str;
    }

    public final void x(JSONArray jSONArray) {
        this.f6712e = jSONArray;
    }

    public final void y(P7.c cVar) {
        this.f6711d = cVar;
    }
}
