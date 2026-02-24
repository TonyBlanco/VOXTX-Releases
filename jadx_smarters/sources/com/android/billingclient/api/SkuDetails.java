package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class SkuDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f18441b;

    public SkuDetails(String str) {
        this.f18440a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f18441b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public String a() {
        return this.f18441b.optString("price");
    }

    public String b() {
        return this.f18441b.optString("price_currency_code");
    }

    public String c() {
        return this.f18441b.optString("productId");
    }

    public String d() {
        return this.f18441b.optString("type");
    }

    public int e() {
        return this.f18441b.optInt("offer_type");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f18440a, ((SkuDetails) obj).f18440a);
        }
        return false;
    }

    public String f() {
        return this.f18441b.optString("offer_id");
    }

    public String g() {
        String strOptString = this.f18441b.optString("offerIdToken");
        return strOptString.isEmpty() ? this.f18441b.optString("offer_id_token") : strOptString;
    }

    public final String h() {
        return this.f18441b.optString("packageName");
    }

    public int hashCode() {
        return this.f18440a.hashCode();
    }

    public String i() {
        return this.f18441b.optString("serializedDocid");
    }

    public final String j() {
        return this.f18441b.optString("skuDetailsToken");
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f18440a));
    }
}
