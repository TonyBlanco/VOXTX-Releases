package com.onesignal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: com.onesignal.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1538c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P7.c f38682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f38683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f38685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Float f38686e;

    public C1538c1(P7.c cVar, JSONArray jSONArray, String str, long j9, float f9) {
        this.f38682a = cVar;
        this.f38683b = jSONArray;
        this.f38684c = str;
        this.f38685d = j9;
        this.f38686e = Float.valueOf(f9);
    }

    public static C1538c1 a(S7.b bVar) {
        JSONArray jSONArrayB;
        S7.e eVarB;
        P7.c cVar = P7.c.UNATTRIBUTED;
        if (bVar.b() != null) {
            S7.d dVarB = bVar.b();
            if (dVarB.a() == null || dVarB.a().b() == null || dVarB.a().b().length() <= 0) {
                if (dVarB.b() != null && dVarB.b().b() != null && dVarB.b().b().length() > 0) {
                    cVar = P7.c.INDIRECT;
                    eVarB = dVarB.b();
                }
                jSONArrayB = null;
            } else {
                cVar = P7.c.DIRECT;
                eVarB = dVarB.a();
            }
            jSONArrayB = eVarB.b();
        } else {
            jSONArrayB = null;
        }
        return new C1538c1(cVar, jSONArrayB, bVar.a(), bVar.c(), bVar.d());
    }

    public P7.c b() {
        return this.f38682a;
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.f38683b;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put("notification_ids", this.f38683b);
        }
        jSONObject.put(Name.MARK, this.f38684c);
        if (this.f38686e.floatValue() > 0.0f) {
            jSONObject.put("weight", this.f38686e);
        }
        long j9 = this.f38685d;
        if (j9 > 0) {
            jSONObject.put("timestamp", j9);
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1538c1 c1538c1 = (C1538c1) obj;
        return this.f38682a.equals(c1538c1.f38682a) && this.f38683b.equals(c1538c1.f38683b) && this.f38684c.equals(c1538c1.f38684c) && this.f38685d == c1538c1.f38685d && this.f38686e.equals(c1538c1.f38686e);
    }

    public int hashCode() {
        Object[] objArr = {this.f38682a, this.f38683b, this.f38684c, Long.valueOf(this.f38685d), this.f38686e};
        int iHashCode = 1;
        for (int i9 = 0; i9 < 5; i9++) {
            Object obj = objArr[i9];
            iHashCode = (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }

    public String toString() {
        return "OutcomeEvent{session=" + this.f38682a + ", notificationIds=" + this.f38683b + ", name='" + this.f38684c + "', timestamp=" + this.f38685d + ", weight=" + this.f38686e + '}';
    }
}
