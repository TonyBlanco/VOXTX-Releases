package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class aqh extends aqj {
    public aqh(String str, Float f9) {
        super(1, str, f9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(h(), ((Float) g()).floatValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(h())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(h()))) : (Float) g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(h(), ((Float) g()).floatValue()));
    }
}
