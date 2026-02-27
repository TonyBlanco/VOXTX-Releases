package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class aqi extends aqj {
    public aqi(String str, String str2) {
        super(1, str, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(h(), (String) g());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(h())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(h())) : (String) g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(h(), (String) g());
    }
}
