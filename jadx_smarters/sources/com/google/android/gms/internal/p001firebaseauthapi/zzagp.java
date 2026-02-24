package com.google.android.gms.internal.p001firebaseauthapi;

import android.util.Log;
import java.text.ParseException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagp extends zzagj {
    private static final String zza = "zzagp";
    private String zzb;
    private String zzc;
    private int zzd;
    private String zze;
    private int zzf;
    private long zzg;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzagj
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzagp zza(String str) throws zzaaf {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("totpSessionInfo");
            if (jSONObjectOptJSONObject != null) {
                this.zzc = zzag.zza(jSONObjectOptJSONObject.optString("sharedSecretKey"));
                this.zzd = jSONObjectOptJSONObject.optInt("verificationCodeLength");
                this.zze = zzag.zza(jSONObjectOptJSONObject.optString("hashingAlgorithm"));
                this.zzf = jSONObjectOptJSONObject.optInt("periodSec");
                this.zzb = zzag.zza(jSONObjectOptJSONObject.optString("sessionInfo"));
                String strOptString = jSONObjectOptJSONObject.optString("finalizeEnrollmentTime");
                try {
                    this.zzg = zzanc.zza(zzanc.zza(strOptString));
                } catch (ParseException unused) {
                    Log.e(zza, "Failed to parse timestamp: " + strOptString);
                }
            }
            return this;
        } catch (NullPointerException | JSONException e9) {
            throw zzahc.zza(e9, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzagj, com.google.android.gms.internal.p001firebaseauthapi.zzacs
    public final /* synthetic */ zzacs zza(String str) throws zzaaf {
        return (zzagp) zza(str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzagj
    public final String zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }
}
