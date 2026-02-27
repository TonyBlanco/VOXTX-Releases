package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.onesignal.F1;
import com.onesignal.T0;
import org.achartengine.ChartFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes4.dex */
public abstract class T {

    public class a implements T0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f38554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f38556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f38557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f38558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f38559f;

        public a(boolean z9, JSONObject jSONObject, Context context, int i9, String str, long j9) {
            this.f38554a = z9;
            this.f38555b = jSONObject;
            this.f38556c = context;
            this.f38557d = i9;
            this.f38558e = str;
            this.f38559f = j9;
        }

        @Override // com.onesignal.T0.d
        public void a(boolean z9) {
            if (this.f38554a || !z9) {
                OSNotificationWorkManager.b(this.f38556c, U0.b(this.f38555b), this.f38557d, this.f38558e, this.f38559f, this.f38554a, false);
                if (this.f38554a) {
                    OSUtils.V(100);
                }
            }
        }
    }

    public class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f38560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f38561b;

        public b(f fVar, e eVar) {
            this.f38560a = fVar;
            this.f38561b = eVar;
        }

        @Override // com.onesignal.T.d
        public void a(boolean z9) {
            if (!z9) {
                this.f38560a.d(true);
            }
            this.f38561b.a(this.f38560a);
        }
    }

    public class c implements T0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f38562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f38563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f38564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f38565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f38567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f38568g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ f f38569h;

        public c(boolean z9, Context context, Bundle bundle, d dVar, JSONObject jSONObject, long j9, boolean z10, f fVar) {
            this.f38562a = z9;
            this.f38563b = context;
            this.f38564c = bundle;
            this.f38565d = dVar;
            this.f38566e = jSONObject;
            this.f38567f = j9;
            this.f38568g = z10;
            this.f38569h = fVar;
        }

        @Override // com.onesignal.T0.d
        public void a(boolean z9) {
            if (this.f38562a || !z9) {
                OSNotificationWorkManager.b(this.f38563b, U0.b(this.f38566e), this.f38564c.containsKey("android_notif_id") ? this.f38564c.getInt("android_notif_id") : 0, this.f38566e.toString(), this.f38567f, this.f38562a, this.f38568g);
                this.f38569h.g(true);
                this.f38565d.a(true);
                return;
            }
            F1.a(F1.v.DEBUG, "startNotificationProcessing returning, with context: " + this.f38563b + " and bundle: " + this.f38564c);
            this.f38565d.a(false);
        }
    }

    public interface d {
        void a(boolean z9);
    }

    public interface e {
        void a(f fVar);
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f38570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f38571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f38572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f38573d;

        public boolean a() {
            return this.f38571b;
        }

        public boolean b() {
            return this.f38573d;
        }

        public boolean c() {
            return !this.f38570a || this.f38571b || this.f38572c || this.f38573d;
        }

        public void d(boolean z9) {
            this.f38571b = z9;
        }

        public void e(boolean z9) {
            this.f38572c = z9;
        }

        public void f(boolean z9) {
            this.f38570a = z9;
        }

        public void g(boolean z9) {
            this.f38573d = z9;
        }
    }

    public static JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e9) {
                F1.b(F1.v.ERROR, "bundleAsJSONObject error for key: " + str, e9);
            }
        }
        return jSONObject;
    }

    public static JSONObject b(JSONObject jSONObject) {
        return new JSONObject(jSONObject.optString("custom"));
    }

    public static boolean c(Bundle bundle) {
        return d(bundle, "licon") || d(bundle, "bicon") || bundle.getString("bg_img", null) != null;
    }

    public static boolean d(Bundle bundle, String str) {
        String strTrim = bundle.getString(str, "").trim();
        return strTrim.startsWith("http://") || strTrim.startsWith("https://");
    }

    public static void e(V0 v02) {
        if (v02.m()) {
            F1.a(F1.v.DEBUG, "Marking restored or disabled notifications as dismissed: " + v02.toString());
            String str = "android_notification_id = " + v02.a();
            M1 m1I = M1.i(v02.d());
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", (Integer) 1);
            m1I.a(TransferService.INTENT_KEY_NOTIFICATION, contentValues, str, null);
            AbstractC1563l.c(m1I, v02.d());
        }
    }

    public static void f(Bundle bundle) {
        String string;
        if (bundle.containsKey("o")) {
            try {
                JSONObject jSONObject = new JSONObject(bundle.getString("custom"));
                JSONObject jSONObject2 = jSONObject.has("a") ? jSONObject.getJSONObject("a") : new JSONObject();
                JSONArray jSONArray = new JSONArray(bundle.getString("o"));
                bundle.remove("o");
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i9);
                    String string2 = jSONObject3.getString("n");
                    jSONObject3.remove("n");
                    if (jSONObject3.has("i")) {
                        string = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        string = string2;
                    }
                    jSONObject3.put(Name.MARK, string);
                    jSONObject3.put("text", string2);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                }
                jSONObject2.put("actionButtons", jSONArray);
                jSONObject2.put("actionId", "__DEFAULT__");
                if (!jSONObject.has("a")) {
                    jSONObject.put("a", jSONObject2);
                }
                bundle.putString("custom", jSONObject.toString());
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
    }

    public static JSONArray g(JSONObject jSONObject) {
        return new JSONArray().put(jSONObject);
    }

    public static void h(Context context, Bundle bundle, e eVar) {
        f fVar = new f();
        if (!U0.d(bundle)) {
            eVar.a(fVar);
            return;
        }
        fVar.f(true);
        f(bundle);
        if (!H0.c(context, bundle)) {
            q(context, bundle, fVar, new b(fVar, eVar));
        } else {
            fVar.e(true);
            eVar.a(fVar);
        }
    }

    public static void i(V0 v02) {
        if (v02.n() || !v02.e().has("collapse_key") || "do_not_collapse".equals(v02.e().optString("collapse_key"))) {
            return;
        }
        Cursor cursorD = M1.i(v02.d()).d(TransferService.INTENT_KEY_NOTIFICATION, new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{v02.e().optString("collapse_key")}, null, null, null);
        if (cursorD.moveToFirst()) {
            v02.f().r(cursorD.getInt(cursorD.getColumnIndex("android_notification_id")));
        }
        cursorD.close();
    }

    public static void j(Context context, InterfaceC1566m interfaceC1566m) {
        F1.K0(context);
        try {
            String string = interfaceC1566m.getString("json_payload");
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                F1.V0(context, jSONObject, new a(interfaceC1566m.b("is_restoring", false), jSONObject, context, interfaceC1566m.g("android_notif_id") ? interfaceC1566m.d("android_notif_id").intValue() : 0, string, interfaceC1566m.c("timestamp").longValue()));
                return;
            }
            F1.a(F1.v.ERROR, "json_payload key is nonexistent from mBundle passed to ProcessFromFCMIntentService: " + interfaceC1566m);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    public static int k(S0 s02, boolean z9) {
        return l(s02, false, z9);
    }

    public static int l(S0 s02, boolean z9, boolean z10) {
        F1.a(F1.v.DEBUG, "Starting processJobForDisplay opened: " + z9 + " fromBackgroundLogic: " + z10);
        V0 v0B = s02.b();
        i(v0B);
        int iIntValue = v0B.a().intValue();
        boolean zN = false;
        if (p(v0B)) {
            v0B.p(true);
            if (z10 && F1.G1(v0B)) {
                s02.g(false);
                F1.I(s02);
                return iIntValue;
            }
            zN = AbstractC1598x.n(v0B);
        }
        if (!v0B.n()) {
            n(v0B, z9, zN);
            OSNotificationWorkManager.c(U0.b(s02.b().e()));
            F1.E0(v0B);
        }
        return iIntValue;
    }

    public static int m(V0 v02, boolean z9) {
        return l(new S0(v02, v02.n(), true), false, z9);
    }

    public static void n(V0 v02, boolean z9, boolean z10) {
        o(v02, z9);
        if (!z10) {
            e(v02);
            return;
        }
        String strB = v02.b();
        OSReceiveReceiptController.c().a(v02.d(), strB);
        F1.r0().l(strB);
    }

    public static void o(V0 v02, boolean z9) {
        F1.v vVar = F1.v.DEBUG;
        F1.a(vVar, "Saving Notification job: " + v02.toString());
        Context contextD = v02.d();
        JSONObject jSONObjectE = v02.e();
        try {
            JSONObject jSONObjectB = b(v02.e());
            M1 m1I = M1.i(v02.d());
            if (v02.m()) {
                String str = "android_notification_id = " + v02.a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", (Integer) 1);
                m1I.a(TransferService.INTENT_KEY_NOTIFICATION, contentValues, str, null);
                AbstractC1563l.c(m1I, contextD);
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notification_id", jSONObjectB.optString("i"));
            if (jSONObjectE.has("grp")) {
                contentValues2.put("group_id", jSONObjectE.optString("grp"));
            }
            if (jSONObjectE.has("collapse_key") && !"do_not_collapse".equals(jSONObjectE.optString("collapse_key"))) {
                contentValues2.put("collapse_id", jSONObjectE.optString("collapse_key"));
            }
            contentValues2.put("opened", Integer.valueOf(z9 ? 1 : 0));
            if (!z9) {
                contentValues2.put("android_notification_id", v02.a());
            }
            if (v02.k() != null) {
                contentValues2.put(ChartFactory.TITLE, v02.k().toString());
            }
            if (v02.c() != null) {
                contentValues2.put("message", v02.c().toString());
            }
            contentValues2.put("expire_time", Long.valueOf((jSONObjectE.optLong("google.sent_time", F1.v0().a()) / 1000) + ((long) jSONObjectE.optInt("google.ttl", 259200))));
            contentValues2.put("full_data", jSONObjectE.toString());
            m1I.l(TransferService.INTENT_KEY_NOTIFICATION, null, contentValues2);
            F1.a(vVar, "Notification saved values: " + contentValues2.toString());
            if (z9) {
                return;
            }
            AbstractC1563l.c(m1I, contextD);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    public static boolean p(V0 v02) {
        return v02.l() || OSUtils.I(v02.e().optString("alert"));
    }

    public static void q(Context context, Bundle bundle, f fVar, d dVar) {
        JSONObject jSONObjectA = a(bundle);
        F1.V0(context, jSONObjectA, new c(bundle.getBoolean("is_restoring", false), context, bundle, dVar, jSONObjectA, F1.v0().a() / 1000, Integer.parseInt(bundle.getString("pri", "0")) > 9, fVar));
    }
}
