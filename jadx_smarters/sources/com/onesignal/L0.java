package com.onesignal;

import com.onesignal.F1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f38349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f38352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38353e;

    public L0() {
        this.f38349a = -1L;
        this.f38350b = 0;
        this.f38351c = 1;
        this.f38352d = 0L;
        this.f38353e = false;
    }

    public L0(int i9, long j9) {
        this.f38351c = 1;
        this.f38352d = 0L;
        this.f38353e = false;
        this.f38350b = i9;
        this.f38349a = j9;
    }

    public L0(JSONObject jSONObject) throws JSONException {
        long jIntValue;
        this.f38349a = -1L;
        this.f38350b = 0;
        this.f38351c = 1;
        this.f38352d = 0L;
        this.f38353e = true;
        Object obj = jSONObject.get("limit");
        Object obj2 = jSONObject.get("delay");
        if (obj instanceof Integer) {
            this.f38351c = ((Integer) obj).intValue();
        }
        if (obj2 instanceof Long) {
            jIntValue = ((Long) obj2).longValue();
        } else if (!(obj2 instanceof Integer)) {
            return;
        } else {
            jIntValue = ((Integer) obj2).intValue();
        }
        this.f38352d = jIntValue;
    }

    public int a() {
        return this.f38350b;
    }

    public long b() {
        return this.f38349a;
    }

    public void c() {
        this.f38350b++;
    }

    public boolean d() {
        if (this.f38349a < 0) {
            return true;
        }
        long jA = F1.v0().a() / 1000;
        long j9 = jA - this.f38349a;
        F1.a(F1.v.DEBUG, "OSInAppMessage lastDisplayTime: " + this.f38349a + " currentTimeInSeconds: " + jA + " diffInSeconds: " + j9 + " displayDelay: " + this.f38352d);
        return j9 >= this.f38352d;
    }

    public boolean e() {
        return this.f38353e;
    }

    public void f(int i9) {
        this.f38350b = i9;
    }

    public void g(L0 l02) {
        h(l02.b());
        f(l02.a());
    }

    public void h(long j9) {
        this.f38349a = j9;
    }

    public boolean i() {
        boolean z9 = this.f38350b < this.f38351c;
        F1.a(F1.v.DEBUG, "OSInAppMessage shouldDisplayAgain: " + z9);
        return z9;
    }

    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.f38349a + ", displayQuantity=" + this.f38350b + ", displayLimit=" + this.f38351c + ", displayDelay=" + this.f38352d + '}';
    }
}
