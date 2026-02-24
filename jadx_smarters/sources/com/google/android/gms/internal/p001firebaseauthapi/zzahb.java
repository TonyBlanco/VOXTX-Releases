package com.google.android.gms.internal.p001firebaseauthapi;

import C4.o;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zzahb implements zzacs<zzahb> {
    private static final String zza = "zzahb";
    private String zzb;
    private String zzc;
    private long zzd;
    private String zze;
    private boolean zzf;
    private String zzg;
    private String zzh;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacs
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahb zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = o.a(jSONObject.optString(ClientConstants.TOKEN_TYPE_ID, null));
            this.zzc = o.a(jSONObject.optString(ClientConstants.TOKEN_TYPE_REFRESH, null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = o.a(jSONObject.optString("localId", null));
            this.zzf = jSONObject.optBoolean("isNewUser", false);
            this.zzg = o.a(jSONObject.optString("temporaryProof", null));
            this.zzh = o.a(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e9) {
            throw zzahc.zza(e9, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzf;
    }
}
