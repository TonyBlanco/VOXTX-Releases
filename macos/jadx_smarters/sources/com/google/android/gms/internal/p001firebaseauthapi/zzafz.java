package com.google.android.gms.internal.p001firebaseauthapi;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzafz implements zzacp {
    public static zzafy zzg() {
        return new zzaej();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacp
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ClientConstants.TOKEN_TYPE_ID, zzc());
        jSONObject.put(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT, zzf());
        jSONObject.put("providerId", zzd());
        jSONObject.put(ClientConstants.TOKEN_KEY_TYPE, zzb().toString());
        jSONObject.put("tenantId", zze());
        return jSONObject.toString();
    }

    public abstract zzaey zzb();

    public abstract String zzc();

    public abstract String zzd();

    public abstract String zze();

    public abstract String zzf();
}
