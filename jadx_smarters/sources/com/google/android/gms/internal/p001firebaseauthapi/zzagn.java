package com.google.android.gms.internal.p001firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagn extends zzagj {
    private static final String zza = "zzagn";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzagj
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzagn zza(String str) throws zzaaf {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (jSONObjectOptJSONObject != null) {
                this.zzb = zzag.zza(jSONObjectOptJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e9) {
            throw zzahc.zza(e9, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzagj, com.google.android.gms.internal.p001firebaseauthapi.zzacs
    public final /* synthetic */ zzacs zza(String str) throws zzaaf {
        return (zzagn) zza(str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzagj
    public final String zza() {
        return this.zzb;
    }
}
