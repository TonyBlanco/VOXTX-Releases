package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.common.internal.r;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaex implements zzaer {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzaex(String str, String str2, String str3, String str4, String str5) {
        this.zza = r.g(str);
        this.zzb = r.g(str2);
        this.zzc = r.g(str3);
        this.zzd = r.g(str4);
        this.zze = str5;
    }

    public static zzaex zza(String str, String str2, String str3, String str4, String str5) {
        return new zzaex(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaer
    public final /* synthetic */ zzaer zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacp
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ClientConstants.TOKEN_TYPE_ID, this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("displayName", this.zzb);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(this.zzc)) {
            jSONObject2.put("sessionInfo", this.zzc);
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject2.put("verificationCode", this.zzd);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        if (!TextUtils.isEmpty(this.zze)) {
            jSONObject.put("tenantId", this.zze);
        }
        return jSONObject.toString();
    }
}
