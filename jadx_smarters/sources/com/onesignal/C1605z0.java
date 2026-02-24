package com.onesignal;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: com.onesignal.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1605z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f38967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f38969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f38970f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f38971g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public N0 f38972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f38974j;

    /* JADX INFO: renamed from: com.onesignal.z0$a */
    public enum a {
        IN_APP_WEBVIEW("webview"),
        BROWSER("browser"),
        REPLACE_CONTENT("replacement");

        private String text;

        a(String str) {
            this.text = str;
        }

        public static a fromString(String str) {
            for (a aVar : values()) {
                if (aVar.text.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return null;
        }

        public JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url_type", this.text);
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
            return jSONObject;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }
    }

    public C1605z0(JSONObject jSONObject) throws JSONException {
        this.f38965a = jSONObject.optString(Name.MARK, null);
        this.f38966b = jSONObject.optString("name", null);
        this.f38968d = jSONObject.optString("url", null);
        this.f38969e = jSONObject.optString("pageId", null);
        a aVarFromString = a.fromString(jSONObject.optString("url_target", null));
        this.f38967c = aVarFromString;
        if (aVarFromString == null) {
            this.f38967c = a.IN_APP_WEBVIEW;
        }
        this.f38974j = jSONObject.optBoolean("close", true);
        if (jSONObject.has("outcomes")) {
            h(jSONObject);
        }
        if (jSONObject.has("tags")) {
            this.f38972h = new N0(jSONObject.getJSONObject("tags"));
        }
        if (jSONObject.has("prompts")) {
            i(jSONObject);
        }
    }

    public String a() {
        return this.f38965a;
    }

    public String b() {
        return this.f38968d;
    }

    public List c() {
        return this.f38970f;
    }

    public List d() {
        return this.f38971g;
    }

    public N0 e() {
        return this.f38972h;
    }

    public a f() {
        return this.f38967c;
    }

    public boolean g() {
        return this.f38973i;
    }

    public final void h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("outcomes");
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            this.f38970f.add(new F0((JSONObject) jSONArray.get(i9)));
        }
    }

    public final void i(JSONObject jSONObject) throws JSONException {
        List list;
        I0 k02;
        JSONArray jSONArray = jSONObject.getJSONArray("prompts");
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            String string = jSONArray.getString(i9);
            string.hashCode();
            if (string.equals("push")) {
                list = this.f38971g;
                k02 = new K0();
            } else if (string.equals("location")) {
                list = this.f38971g;
                k02 = new E0();
            }
            list.add(k02);
        }
    }

    public void j(boolean z9) {
        this.f38973i = z9;
    }
}
