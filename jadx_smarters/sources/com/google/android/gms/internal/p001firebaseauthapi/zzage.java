package com.google.android.gms.internal.p001firebaseauthapi;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.common.internal.r;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzage implements zzacp {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;

    public zzage(String str) {
        this.zzd = str;
    }

    public zzage(String str, String str2, String str3, String str4, String str5, String str6) {
        this.zza = r.g(str);
        this.zzb = r.g(str2);
        this.zzc = null;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacp
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, str2);
        }
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            zzahc.zza(jSONObject, "captchaResponse", str4);
        } else {
            zzahc.zza(jSONObject);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put(ClientConstants.TOKEN_TYPE_ID, str5);
        }
        return jSONObject.toString();
    }
}
