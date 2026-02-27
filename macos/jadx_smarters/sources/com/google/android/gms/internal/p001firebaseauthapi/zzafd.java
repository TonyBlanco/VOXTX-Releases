package com.google.android.gms.internal.p001firebaseauthapi;

import C4.o;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zzafd implements zzacs<zzafd> {
    private static final String zza = "zzafd";
    private zzaff zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacs
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafd zza(String str) throws zzaaf {
        zzaff zzaffVar;
        int i9;
        zzafc zzafcVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzaffVar = new zzaff(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    boolean z9 = false;
                    int i10 = 0;
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                        if (jSONObject2 == null) {
                            zzafcVar = new zzafc();
                            i9 = i10;
                        } else {
                            i9 = i10;
                            zzafcVar = new zzafc(o.a(jSONObject2.optString("localId", null)), o.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z9), o.a(jSONObject2.optString("displayName", null)), o.a(jSONObject2.optString("photoUrl", null)), zzafv.zza(jSONObject2.optJSONArray("providerUserInfo")), o.a(jSONObject2.optString("rawPassword", null)), o.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzafr.zza(jSONObject2.optJSONArray("mfaInfo")), zzafq.zza(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzafcVar);
                        i10 = i9 + 1;
                        z9 = false;
                    }
                    zzaffVar = new zzaff(arrayList);
                }
            } else {
                zzaffVar = new zzaff();
            }
            this.zzb = zzaffVar;
            return this;
        } catch (NullPointerException e9) {
            e = e9;
            throw zzahc.zza(e, zza, str);
        } catch (JSONException e10) {
            e = e10;
            throw zzahc.zza(e, zza, str);
        }
    }

    public final List<zzafc> zza() {
        return this.zzb.zza();
    }
}
