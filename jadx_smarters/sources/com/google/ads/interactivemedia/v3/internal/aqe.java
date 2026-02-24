package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class aqe extends aqj {
    public aqe(int i9, String str, Boolean bool) {
        super(i9, str, bool);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(h(), ((Boolean) g()).booleanValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(h())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(h()))) : (Boolean) g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(h(), ((Boolean) g()).booleanValue()));
    }
}
