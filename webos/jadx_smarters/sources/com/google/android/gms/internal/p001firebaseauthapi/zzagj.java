package com.google.android.gms.internal.p001firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zzagj implements zzacs<zzagj> {
    private static final String zza = "zzagj";

    public String zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacs
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public zzagj zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                return (zzagn) ((zzagj) new zzagn().zza(str));
            }
            if (jSONObject.optJSONObject("totpSessionInfo") != null) {
                return (zzagp) ((zzagj) new zzagp().zza(str));
            }
            throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
        } catch (NullPointerException e9) {
            e = e9;
            throw zzahc.zza(e, zza, str);
        } catch (JSONException e10) {
            e = e10;
            throw zzahc.zza(e, zza, str);
        }
    }
}
