package com.google.android.gms.internal.p001firebaseauthapi;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.common.internal.r;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaha implements zzacp {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzaha(String str, String str2, String str3) {
        this.zza = r.g(str);
        this.zzb = r.g(str2);
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacp
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ClientConstants.TOKEN_TYPE_ID, this.zza);
        jSONObject.put("mfaEnrollmentId", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
