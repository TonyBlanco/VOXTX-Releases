package O7;

import com.onesignal.InterfaceC1565l1;
import com.onesignal.S1;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1565l1 f6714a;

    public c(InterfaceC1565l1 preferences) {
        l.e(preferences, "preferences");
        this.f6714a = preferences;
    }

    public final void a(P7.c influenceType) {
        l.e(influenceType, "influenceType");
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        interfaceC1565l1.f(interfaceC1565l1.i(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", influenceType.toString());
    }

    public final void b(P7.c influenceType) {
        l.e(influenceType, "influenceType");
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        interfaceC1565l1.f(interfaceC1565l1.i(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", influenceType.toString());
    }

    public final void c(String str) {
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        interfaceC1565l1.f(interfaceC1565l1.i(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", str);
    }

    public final String d() {
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        return interfaceC1565l1.d(interfaceC1565l1.i(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", null);
    }

    public final P7.c e() {
        String string = P7.c.UNATTRIBUTED.toString();
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        return P7.c.Companion.a(interfaceC1565l1.d(interfaceC1565l1.i(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", string));
    }

    public final int f() {
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        return interfaceC1565l1.h(interfaceC1565l1.i(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", DateTimeConstants.MINUTES_PER_DAY);
    }

    public final int g() {
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        return interfaceC1565l1.h(interfaceC1565l1.i(), "PREFS_OS_IAM_LIMIT", 10);
    }

    public final JSONArray h() {
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        String strD = interfaceC1565l1.d(interfaceC1565l1.i(), "PREFS_OS_LAST_IAMS_RECEIVED", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        JSONArray jSONArray = strD == null ? null : new JSONArray(strD);
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    public final JSONArray i() {
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        String strD = interfaceC1565l1.d(interfaceC1565l1.i(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        JSONArray jSONArray = strD == null ? null : new JSONArray(strD);
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    public final P7.c j() {
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        return P7.c.Companion.a(interfaceC1565l1.d(interfaceC1565l1.i(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", P7.c.UNATTRIBUTED.toString()));
    }

    public final int k() {
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        return interfaceC1565l1.h(interfaceC1565l1.i(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", DateTimeConstants.MINUTES_PER_DAY);
    }

    public final int l() {
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        return interfaceC1565l1.h(interfaceC1565l1.i(), "PREFS_OS_NOTIFICATION_LIMIT", 10);
    }

    public final boolean m() {
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        return interfaceC1565l1.g(interfaceC1565l1.i(), "PREFS_OS_DIRECT_ENABLED", false);
    }

    public final boolean n() {
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        return interfaceC1565l1.g(interfaceC1565l1.i(), "PREFS_OS_INDIRECT_ENABLED", false);
    }

    public final boolean o() {
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        return interfaceC1565l1.g(interfaceC1565l1.i(), "PREFS_OS_UNATTRIBUTED_ENABLED", false);
    }

    public final void p(JSONArray iams) {
        l.e(iams, "iams");
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        interfaceC1565l1.f(interfaceC1565l1.i(), "PREFS_OS_LAST_IAMS_RECEIVED", iams.toString());
    }

    public final void q(S1.e influenceParams) {
        l.e(influenceParams, "influenceParams");
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        interfaceC1565l1.b(interfaceC1565l1.i(), "PREFS_OS_DIRECT_ENABLED", influenceParams.e());
        InterfaceC1565l1 interfaceC1565l12 = this.f6714a;
        interfaceC1565l12.b(interfaceC1565l12.i(), "PREFS_OS_INDIRECT_ENABLED", influenceParams.f());
        InterfaceC1565l1 interfaceC1565l13 = this.f6714a;
        interfaceC1565l13.b(interfaceC1565l13.i(), "PREFS_OS_UNATTRIBUTED_ENABLED", influenceParams.g());
        InterfaceC1565l1 interfaceC1565l14 = this.f6714a;
        interfaceC1565l14.a(interfaceC1565l14.i(), "PREFS_OS_NOTIFICATION_LIMIT", influenceParams.d());
        InterfaceC1565l1 interfaceC1565l15 = this.f6714a;
        interfaceC1565l15.a(interfaceC1565l15.i(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", influenceParams.c());
        InterfaceC1565l1 interfaceC1565l16 = this.f6714a;
        interfaceC1565l16.a(interfaceC1565l16.i(), "PREFS_OS_IAM_LIMIT", influenceParams.a());
        InterfaceC1565l1 interfaceC1565l17 = this.f6714a;
        interfaceC1565l17.a(interfaceC1565l17.i(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", influenceParams.b());
    }

    public final void r(JSONArray notifications) {
        l.e(notifications, "notifications");
        InterfaceC1565l1 interfaceC1565l1 = this.f6714a;
        interfaceC1565l1.f(interfaceC1565l1.i(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", notifications.toString());
    }
}
