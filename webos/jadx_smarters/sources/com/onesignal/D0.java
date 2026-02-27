package com.onesignal;

import com.amazonaws.services.s3.internal.Constants;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes4.dex */
public class D0 extends AbstractC1602y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f38184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f38185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f38186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public L0 f38187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f38188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Date f38192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f38193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f38194l;

    public D0(String str, Set set, boolean z9, L0 l02) {
        super(str);
        new L0();
        this.f38190h = false;
        this.f38186d = set;
        this.f38189g = z9;
        this.f38187e = l02;
    }

    public D0(JSONObject jSONObject) {
        super(jSONObject.getString(Name.MARK));
        this.f38187e = new L0();
        this.f38189g = false;
        this.f38190h = false;
        this.f38184b = l(jSONObject.getJSONObject("variants"));
        this.f38185c = k(jSONObject.getJSONArray("triggers"));
        this.f38186d = new HashSet();
        this.f38192j = j(jSONObject);
        if (jSONObject.has("has_liquid")) {
            this.f38194l = jSONObject.getBoolean("has_liquid");
        }
        if (jSONObject.has("redisplay")) {
            this.f38187e = new L0(jSONObject.getJSONObject("redisplay"));
        }
    }

    public D0(boolean z9) {
        super("");
        this.f38187e = new L0();
        this.f38189g = false;
        this.f38190h = false;
        this.f38193k = z9;
    }

    public void a(String str) {
        this.f38186d.add(str);
    }

    public void b() {
        this.f38186d.clear();
    }

    public Set c() {
        return this.f38186d;
    }

    public boolean d() {
        return this.f38194l;
    }

    public L0 e() {
        return this.f38187e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f38963a.equals(((D0) obj).f38963a);
    }

    public boolean f(String str) {
        return !this.f38186d.contains(str);
    }

    public boolean g() {
        return this.f38189g;
    }

    public boolean h() {
        if (this.f38192j == null) {
            return false;
        }
        return this.f38192j.before(new Date());
    }

    public int hashCode() {
        return this.f38963a.hashCode();
    }

    public boolean i() {
        return this.f38190h;
    }

    public final Date j(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("end_time");
            if (string.equals(Constants.NULL_VERSION_ID)) {
                return null;
            }
            try {
                return V1.a().parse(string);
            } catch (ParseException e9) {
                e9.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
        }
    }

    public ArrayList k(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i9);
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                arrayList2.add(new C1597w1(jSONArray2.getJSONObject(i10)));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public final HashMap l(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            HashMap map2 = new HashMap();
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                map2.put(next2, jSONObject2.getString(next2));
            }
            map.put(next, map2);
        }
        return map;
    }

    public void m(String str) {
        this.f38186d.remove(str);
    }

    public void n(double d9) {
        this.f38188f = d9;
    }

    public void o(boolean z9) {
        this.f38189g = z9;
    }

    public void p(boolean z9) {
        this.f38190h = z9;
    }

    public boolean q() {
        if (this.f38191i) {
            return false;
        }
        this.f38191i = true;
        return true;
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + this.f38963a + "', variants=" + this.f38184b + ", triggers=" + this.f38185c + ", clickedClickIds=" + this.f38186d + ", redisplayStats=" + this.f38187e + ", displayDuration=" + this.f38188f + ", displayedInSession=" + this.f38189g + ", triggerChanged=" + this.f38190h + ", actionTaken=" + this.f38191i + ", isPreview=" + this.f38193k + ", endTime=" + this.f38192j + ", hasLiquid=" + this.f38194l + '}';
    }
}
