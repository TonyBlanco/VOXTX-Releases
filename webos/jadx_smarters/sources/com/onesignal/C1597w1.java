package com.onesignal;

import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: com.onesignal.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1597w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f38944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f38946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f38947e;

    /* JADX INFO: renamed from: com.onesignal.w1$a */
    public enum a {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM("custom"),
        UNKNOWN("unknown");

        private String value;

        a(String str) {
            this.value = str;
        }

        public static a fromString(String str) {
            for (a aVar : values()) {
                if (aVar.value.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return UNKNOWN;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.onesignal.w1$b */
    public enum b {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS("in");

        private String text;

        b(String str) {
            this.text = str;
        }

        public static b fromString(String str) {
            for (b bVar : values()) {
                if (bVar.text.equalsIgnoreCase(str)) {
                    return bVar;
                }
            }
            return EQUAL_TO;
        }

        public boolean checksEquality() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }
    }

    public C1597w1(JSONObject jSONObject) {
        this.f38943a = jSONObject.getString(Name.MARK);
        this.f38944b = a.fromString(jSONObject.getString("kind"));
        this.f38945c = jSONObject.optString("property", null);
        this.f38946d = b.fromString(jSONObject.getString("operator"));
        this.f38947e = jSONObject.opt("value");
    }

    public String toString() {
        return "OSTrigger{triggerId='" + this.f38943a + "', kind=" + this.f38944b + ", property='" + this.f38945c + "', operatorType=" + this.f38946d + ", value=" + this.f38947e + '}';
    }
}
