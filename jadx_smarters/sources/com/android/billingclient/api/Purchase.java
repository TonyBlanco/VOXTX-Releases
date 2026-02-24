package com.android.billingclient.api;

import android.text.TextUtils;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f18439c;

    public Purchase(String str, String str2) {
        this.f18437a = str;
        this.f18438b = str2;
        this.f18439c = new JSONObject(str);
    }

    public String a() {
        String strOptString = this.f18439c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String b() {
        return this.f18437a;
    }

    public int c() {
        return this.f18439c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public String d() {
        JSONObject jSONObject = this.f18439c;
        return jSONObject.optString(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT, jSONObject.optString("purchaseToken"));
    }

    public String e() {
        return this.f18438b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f18437a, purchase.b()) && TextUtils.equals(this.f18438b, purchase.e());
    }

    public ArrayList f() {
        return h();
    }

    public boolean g() {
        return this.f18439c.optBoolean("acknowledged", true);
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        if (this.f18439c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f18439c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i9 = 0; i9 < jSONArrayOptJSONArray.length(); i9++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i9));
                }
            }
        } else if (this.f18439c.has("productId")) {
            arrayList.add(this.f18439c.optString("productId"));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f18437a.hashCode();
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f18437a));
    }
}
