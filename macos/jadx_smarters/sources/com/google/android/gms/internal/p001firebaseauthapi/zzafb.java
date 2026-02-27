package com.google.android.gms.internal.p001firebaseauthapi;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.common.internal.r;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafb implements zzacp {
    private String zza = zzaez.REFRESH_TOKEN.toString();
    private String zzb;

    public zzafb(String str) {
        this.zzb = r.g(str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacp
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put(ClientConstants.TOKEN_TYPE_REFRESH, this.zzb);
        return jSONObject.toString();
    }
}
