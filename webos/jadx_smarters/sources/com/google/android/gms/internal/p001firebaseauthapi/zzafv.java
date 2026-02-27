package com.google.android.gms.internal.p001firebaseauthapi;

import C4.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafv {
    private List<zzafs> zza;

    public zzafv() {
        this.zza = new ArrayList();
    }

    private zzafv(List<zzafs> list) {
        this.zza = !list.isEmpty() ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public static zzafv zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzafv(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i9);
            arrayList.add(jSONObject == null ? new zzafs() : new zzafs(o.a(jSONObject.optString("federatedId", null)), o.a(jSONObject.optString("displayName", null)), o.a(jSONObject.optString("photoUrl", null)), o.a(jSONObject.optString("providerId", null)), null, o.a(jSONObject.optString("phoneNumber", null)), o.a(jSONObject.optString("email", null))));
        }
        return new zzafv(arrayList);
    }

    public final List<zzafs> zza() {
        return this.zza;
    }
}
