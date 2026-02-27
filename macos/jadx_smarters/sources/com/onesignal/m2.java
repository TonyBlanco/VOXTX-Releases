package com.onesignal;

import com.onesignal.O;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f38777d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f38778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f38779f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f38781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f38782c;

    static {
        String[] strArr = {"lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp"};
        f38778e = strArr;
        f38779f = new HashSet(Arrays.asList(strArr));
    }

    public m2(String str, boolean z9) {
        this.f38780a = str;
        if (z9) {
            n();
        } else {
            this.f38781b = new JSONObject();
            this.f38782c = new JSONObject();
        }
    }

    public static JSONObject e(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set set) {
        JSONObject jSONObjectB;
        synchronized (f38777d) {
            jSONObjectB = H.b(jSONObject, jSONObject2, jSONObject3, set);
        }
        return jSONObjectB;
    }

    public abstract void a();

    public void b() {
        try {
            HashMap map = new HashMap();
            map.put("lat", null);
            map.put("long", null);
            map.put("loc_acc", null);
            map.put("loc_type", null);
            map.put("loc_bg", null);
            map.put("loc_time_stamp", null);
            u(this.f38782c, map);
            HashMap map2 = new HashMap();
            map2.put("loc_bg", null);
            map2.put("loc_time_stamp", null);
            u(this.f38781b, map2);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    public m2 c(String str) {
        m2 m2VarP = p(str);
        try {
            m2VarP.f38781b = j();
            m2VarP.f38782c = m();
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        return m2VarP;
    }

    public JSONObject d(m2 m2Var, boolean z9) {
        a();
        m2Var.a();
        JSONObject jSONObjectE = e(this.f38782c, m2Var.f38782c, null, k(m2Var));
        if (!z9 && jSONObjectE.toString().equals("{}")) {
            return null;
        }
        try {
            if (!jSONObjectE.has("app_id")) {
                jSONObjectE.put("app_id", this.f38782c.optString("app_id"));
            }
            if (this.f38782c.has("email_auth_hash")) {
                jSONObjectE.put("email_auth_hash", this.f38782c.optString("email_auth_hash"));
            }
            if (this.f38782c.has("sms_auth_hash")) {
                jSONObjectE.put("sms_auth_hash", this.f38782c.optString("sms_auth_hash"));
            }
            if (this.f38782c.has("external_user_id_auth_hash") && !jSONObjectE.has("external_user_id_auth_hash")) {
                jSONObjectE.put("external_user_id_auth_hash", this.f38782c.optString("external_user_id_auth_hash"));
            }
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        return jSONObjectE;
    }

    public JSONObject f(m2 m2Var, Set set) {
        JSONObject jSONObjectB;
        synchronized (f38777d) {
            jSONObjectB = H.b(this.f38781b, m2Var.f38781b, null, set);
        }
        return jSONObjectB;
    }

    public JSONObject g(JSONObject jSONObject, Set set) {
        JSONObject jSONObjectB;
        synchronized (f38777d) {
            JSONObject jSONObject2 = this.f38781b;
            jSONObjectB = H.b(jSONObject2, jSONObject, jSONObject2, set);
        }
        return jSONObjectB;
    }

    public JSONObject h(JSONObject jSONObject, Set set) {
        JSONObject jSONObjectB;
        synchronized (f38777d) {
            JSONObject jSONObject2 = this.f38782c;
            jSONObjectB = H.b(jSONObject2, jSONObject, jSONObject2, set);
        }
        return jSONObjectB;
    }

    public E i() {
        try {
            return new E(j());
        } catch (JSONException e9) {
            e9.printStackTrace();
            return new E();
        }
    }

    public JSONObject j() {
        JSONObject jSONObject;
        synchronized (f38777d) {
            jSONObject = new JSONObject(this.f38781b.toString());
        }
        return jSONObject;
    }

    public final Set k(m2 m2Var) {
        try {
            if (this.f38781b.optLong("loc_time_stamp") == m2Var.f38781b.getLong("loc_time_stamp")) {
                return null;
            }
            HashMap map = new HashMap();
            map.put("loc_bg", m2Var.f38781b.opt("loc_bg"));
            map.put("loc_time_stamp", m2Var.f38781b.opt("loc_time_stamp"));
            u(m2Var.f38782c, map);
            return f38779f;
        } catch (Throwable unused) {
            return null;
        }
    }

    public E l() {
        try {
            return new E(m());
        } catch (JSONException e9) {
            e9.printStackTrace();
            return new E();
        }
    }

    public JSONObject m() {
        JSONObject jSONObject;
        synchronized (f38777d) {
            jSONObject = new JSONObject(this.f38782c.toString());
        }
        return jSONObject;
    }

    public final void n() {
        boolean z9;
        String str = R1.f38511a;
        String strF = R1.f(str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f38780a, null);
        if (strF == null) {
            x(new JSONObject());
            try {
                int i9 = 1;
                int iC = R1.c(str, this.f38780a.equals("CURRENT_STATE") ? "ONESIGNAL_SUBSCRIPTION" : "ONESIGNAL_SYNCED_SUBSCRIPTION", 1);
                if (iC == -2) {
                    z9 = false;
                } else {
                    i9 = iC;
                    z9 = true;
                }
                HashMap map = new HashMap();
                map.put("subscribableStatus", Integer.valueOf(i9));
                map.put("userSubscribePref", Boolean.valueOf(z9));
                u(this.f38781b, map);
            } catch (JSONException unused) {
            }
        } else {
            try {
                x(new JSONObject(strF));
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
        String str2 = R1.f38511a;
        String strF2 = R1.f(str2, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f38780a, null);
        JSONObject jSONObject = new JSONObject();
        try {
            if (strF2 == null) {
                jSONObject.put("identifier", R1.f(str2, "GT_REGISTRATION_ID", null));
            } else {
                jSONObject = new JSONObject(strF2);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        z(jSONObject);
    }

    public void o(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        if (jSONObject.has("tags")) {
            try {
                JSONObject jSONObjectM = m();
                if (jSONObjectM.has("tags")) {
                    try {
                        jSONObject3 = new JSONObject(jSONObjectM.optString("tags"));
                    } catch (JSONException unused) {
                        jSONObject3 = new JSONObject();
                    }
                } else {
                    jSONObject3 = new JSONObject();
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tags");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if ("".equals(jSONObjectOptJSONObject.optString(next))) {
                        jSONObject3.remove(next);
                    } else if (jSONObject2 == null || !jSONObject2.has(next)) {
                        jSONObject3.put(next, jSONObjectOptJSONObject.optString(next));
                    }
                }
                synchronized (f38777d) {
                    try {
                        if (jSONObject3.toString().equals("{}")) {
                            this.f38782c.remove("tags");
                        } else {
                            this.f38782c.put("tags", jSONObject3);
                        }
                    } finally {
                    }
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
    }

    public abstract m2 p(String str);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[Catch: all -> 0x0028, JSONException -> 0x002a, TRY_LEAVE, TryCatch #1 {JSONException -> 0x002a, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0017, B:17:0x0036, B:15:0x002c), top: B:25:0x0003, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q() {
        /*
            r4 = this;
            java.lang.Object r0 = com.onesignal.m2.f38777d
            monitor-enter(r0)
            org.json.JSONObject r1 = r4.f38782c     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L2a
            java.lang.String r2 = "external_user_id_auth_hash"
            boolean r1 = r1.has(r2)     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L2a
            if (r1 == 0) goto L41
            org.json.JSONObject r1 = r4.f38782c     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L2a
            java.lang.String r2 = "external_user_id"
            boolean r1 = r1.has(r2)     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L2a
            if (r1 == 0) goto L2c
            org.json.JSONObject r1 = r4.f38782c     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L2a
            java.lang.String r2 = "external_user_id"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L2a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L2a
            java.lang.String r2 = ""
            if (r1 == r2) goto L36
            goto L2c
        L28:
            r1 = move-exception
            goto L7d
        L2a:
            r1 = move-exception
            goto L3e
        L2c:
            org.json.JSONObject r1 = r4.f38782c     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L2a
            java.lang.String r2 = "external_user_id"
            boolean r1 = r1.has(r2)     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L2a
            if (r1 != 0) goto L41
        L36:
            org.json.JSONObject r1 = r4.f38782c     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L2a
            java.lang.String r2 = "external_user_id_auth_hash"
            r1.remove(r2)     // Catch: java.lang.Throwable -> L28 org.json.JSONException -> L2a
            goto L41
        L3e:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L28
        L41:
            java.lang.String r1 = com.onesignal.R1.f38511a     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "ONESIGNAL_USERSTATE_SYNCVALYES_"
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r4.f38780a     // Catch: java.lang.Throwable -> L28
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L28
            org.json.JSONObject r3 = r4.f38782c     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L28
            com.onesignal.R1.m(r1, r2, r3)     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "ONESIGNAL_USERSTATE_DEPENDVALYES_"
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r4.f38780a     // Catch: java.lang.Throwable -> L28
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L28
            org.json.JSONObject r3 = r4.f38781b     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L28
            com.onesignal.R1.m(r1, r2, r3)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.m2.q():void");
    }

    public void r(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.f38781b;
            e(jSONObject3, jSONObject, jSONObject3, null);
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.f38782c;
            e(jSONObject4, jSONObject2, jSONObject4, null);
            o(jSONObject2, null);
        }
        if (jSONObject == null && jSONObject2 == null) {
            return;
        }
        q();
    }

    public void s(String str, Object obj) {
        synchronized (f38777d) {
            this.f38781b.put(str, obj);
        }
    }

    public void t(String str, Object obj) {
        synchronized (f38777d) {
            this.f38782c.put(str, obj);
        }
    }

    public String toString() {
        return "UserState{persistKey='" + this.f38780a + "', dependValues=" + this.f38781b + ", syncValues=" + this.f38782c + '}';
    }

    public final void u(JSONObject jSONObject, HashMap map) {
        synchronized (f38777d) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v(String str) {
        synchronized (f38777d) {
            this.f38781b.remove(str);
        }
    }

    public void w(String str) {
        synchronized (f38777d) {
            this.f38782c.remove(str);
        }
    }

    public void x(JSONObject jSONObject) {
        synchronized (f38777d) {
            this.f38781b = jSONObject;
        }
    }

    public void y(O.d dVar) {
        try {
            HashMap map = new HashMap();
            map.put("lat", dVar.f38406a);
            map.put("long", dVar.f38407b);
            map.put("loc_acc", dVar.f38408c);
            map.put("loc_type", dVar.f38409d);
            u(this.f38782c, map);
            HashMap map2 = new HashMap();
            map2.put("loc_bg", dVar.f38410e);
            map2.put("loc_time_stamp", dVar.f38411f);
            u(this.f38781b, map2);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    public void z(JSONObject jSONObject) {
        synchronized (f38777d) {
            this.f38782c = jSONObject;
        }
    }
}
