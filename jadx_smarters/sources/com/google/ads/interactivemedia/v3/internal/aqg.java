package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class aqg extends aqj {
    public aqg(String str, Long l9) {
        super(1, str, l9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(h(), ((Long) g()).longValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(h())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(h()))) : (Long) g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqj
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(h(), ((Long) g()).longValue()));
    }
}
