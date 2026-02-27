package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class aqf extends aqj {
    public aqf(String str, Integer num) {
        super(1, str, num);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(h(), ((Integer) g()).intValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(h())) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(h()))) : (Integer) g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(h(), ((Integer) g()).intValue()));
    }
}
