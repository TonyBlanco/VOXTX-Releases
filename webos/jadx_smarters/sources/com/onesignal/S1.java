package com.onesignal;

import com.amazonaws.services.s3.internal.Constants;
import com.onesignal.F1;
import com.onesignal.T1;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f38522a;

    public class a extends T1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f38525c;

        /* JADX INFO: renamed from: com.onesignal.S1$a$a, reason: collision with other inner class name */
        public class RunnableC0301a implements Runnable {
            public RunnableC0301a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                int i9 = (S1.f38522a * Constants.MAXIMUM_UPLOAD_PARTS) + 30000;
                if (i9 > 90000) {
                    i9 = 90000;
                }
                F1.a(F1.v.INFO, "Failed to get Android parameters, trying again in " + (i9 / 1000) + " seconds.");
                try {
                    Thread.sleep(i9);
                    S1.b();
                    a aVar = a.this;
                    S1.e(aVar.f38523a, aVar.f38524b, aVar.f38525c);
                } catch (InterruptedException e9) {
                    e9.printStackTrace();
                }
            }
        }

        public a(String str, String str2, c cVar) {
            this.f38523a = str;
            this.f38524b = str2;
            this.f38525c = cVar;
        }

        @Override // com.onesignal.T1.g
        public void a(int i9, String str, Throwable th) {
            if (i9 == 403) {
                F1.a(F1.v.FATAL, "403 error getting OneSignal params, omitting further retries!");
            } else {
                new Thread(new RunnableC0301a(), "OS_PARAMS_REQUEST").start();
            }
        }

        @Override // com.onesignal.T1.g
        public void b(String str) {
            S1.f(str, this.f38525c);
        }
    }

    public class b extends f {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38527p;

        public b(JSONObject jSONObject) {
            this.f38527p = jSONObject;
            this.f38540b = jSONObject.optBoolean("enterp", false);
            this.f38541c = jSONObject.optBoolean("require_email_auth", false);
            this.f38542d = jSONObject.optBoolean("require_user_id_auth", false);
            this.f38543e = jSONObject.optJSONArray("chnl_lst");
            this.f38544f = jSONObject.optBoolean("fba", false);
            this.f38545g = jSONObject.optBoolean("restore_ttl_filter", true);
            this.f38539a = jSONObject.optString("android_sender_id", null);
            this.f38546h = jSONObject.optBoolean("clear_group_on_summary_click", true);
            this.f38547i = jSONObject.optBoolean("receive_receipts_enable", false);
            this.f38548j = !jSONObject.has("disable_gms_missing_prompt") ? null : Boolean.valueOf(jSONObject.optBoolean("disable_gms_missing_prompt", false));
            this.f38549k = !jSONObject.has("unsubscribe_on_notifications_disabled") ? null : Boolean.valueOf(jSONObject.optBoolean("unsubscribe_on_notifications_disabled", true));
            this.f38550l = !jSONObject.has("location_shared") ? null : Boolean.valueOf(jSONObject.optBoolean("location_shared", true));
            this.f38551m = !jSONObject.has("requires_user_privacy_consent") ? null : Boolean.valueOf(jSONObject.optBoolean("requires_user_privacy_consent", false));
            this.f38552n = new e();
            if (jSONObject.has("outcomes")) {
                S1.g(jSONObject.optJSONObject("outcomes"), this.f38552n);
            }
            this.f38553o = new d();
            if (jSONObject.has("fcm")) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("fcm");
                this.f38553o.f38530c = jSONObjectOptJSONObject.optString("api_key", null);
                this.f38553o.f38529b = jSONObjectOptJSONObject.optString("app_id", null);
                this.f38553o.f38528a = jSONObjectOptJSONObject.optString("project_id", null);
            }
        }
    }

    public interface c {
        void a(f fVar);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f38529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f38530c;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38531a = DateTimeConstants.MINUTES_PER_DAY;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38532b = 10;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f38533c = DateTimeConstants.MINUTES_PER_DAY;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f38534d = 10;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f38535e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f38536f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f38537g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f38538h = false;

        public int a() {
            return this.f38534d;
        }

        public int b() {
            return this.f38533c;
        }

        public int c() {
            return this.f38531a;
        }

        public int d() {
            return this.f38532b;
        }

        public boolean e() {
            return this.f38535e;
        }

        public boolean f() {
            return this.f38536f;
        }

        public boolean g() {
            return this.f38537g;
        }

        public String toString() {
            return "InfluenceParams{indirectNotificationAttributionWindow=" + this.f38531a + ", notificationLimit=" + this.f38532b + ", indirectIAMAttributionWindow=" + this.f38533c + ", iamLimit=" + this.f38534d + ", directEnabled=" + this.f38535e + ", indirectEnabled=" + this.f38536f + ", unattributedEnabled=" + this.f38537g + '}';
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f38540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f38541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f38542d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public JSONArray f38543e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f38544f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f38545g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f38546h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f38547i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Boolean f38548j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Boolean f38549k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Boolean f38550l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Boolean f38551m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public e f38552n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public d f38553o;
    }

    public static /* synthetic */ int b() {
        int i9 = f38522a;
        f38522a = i9 + 1;
        return i9;
    }

    public static void e(String str, String str2, c cVar) {
        a aVar = new a(str, str2, cVar);
        String str3 = "apps/" + str + "/android_params.js";
        if (str2 != null) {
            str3 = str3 + "?player_id=" + str2;
        }
        F1.a(F1.v.DEBUG, "Starting request to get Android parameters.");
        T1.e(str3, aVar, "CACHE_KEY_REMOTE_PARAMS");
    }

    public static void f(String str, c cVar) {
        try {
            cVar.a(new b(new JSONObject(str)));
        } catch (NullPointerException | JSONException e9) {
            F1.v vVar = F1.v.FATAL;
            F1.b(vVar, "Error parsing android_params!: ", e9);
            F1.a(vVar, "Response that errored from android_params!: " + str);
        }
    }

    public static void g(JSONObject jSONObject, e eVar) {
        if (jSONObject.has("v2_enabled")) {
            eVar.f38538h = jSONObject.optBoolean("v2_enabled");
        }
        if (jSONObject.has("direct")) {
            eVar.f38535e = jSONObject.optJSONObject("direct").optBoolean("enabled");
        }
        if (jSONObject.has("indirect")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("indirect");
            eVar.f38536f = jSONObjectOptJSONObject.optBoolean("enabled");
            if (jSONObjectOptJSONObject.has("notification_attribution")) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("notification_attribution");
                eVar.f38531a = jSONObjectOptJSONObject2.optInt("minutes_since_displayed", DateTimeConstants.MINUTES_PER_DAY);
                eVar.f38532b = jSONObjectOptJSONObject2.optInt("limit", 10);
            }
            if (jSONObjectOptJSONObject.has("in_app_message_attribution")) {
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("in_app_message_attribution");
                eVar.f38533c = jSONObjectOptJSONObject3.optInt("minutes_since_displayed", DateTimeConstants.MINUTES_PER_DAY);
                eVar.f38534d = jSONObjectOptJSONObject3.optInt("limit", 10);
            }
        }
        if (jSONObject.has("unattributed")) {
            eVar.f38537g = jSONObject.optJSONObject("unattributed").optBoolean("enabled");
        }
    }
}
