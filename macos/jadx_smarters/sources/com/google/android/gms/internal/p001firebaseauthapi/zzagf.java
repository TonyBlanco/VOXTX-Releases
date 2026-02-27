package com.google.android.gms.internal.p001firebaseauthapi;

import C4.o;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zzagf implements zzacs<zzagf> {
    private static final String zza = "zzagf";
    private String zzb;
    private String zzc;
    private Boolean zzd;
    private String zze;
    private String zzf;
    private zzafv zzg;
    private String zzh;
    private String zzi;
    private long zzj;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacs
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagf zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = o.a(jSONObject.optString("email", null));
            this.zzc = o.a(jSONObject.optString("passwordHash", null));
            this.zzd = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.zze = o.a(jSONObject.optString("displayName", null));
            this.zzf = o.a(jSONObject.optString("photoUrl", null));
            this.zzg = zzafv.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzh = o.a(jSONObject.optString(ClientConstants.TOKEN_TYPE_ID, null));
            this.zzi = o.a(jSONObject.optString(ClientConstants.TOKEN_TYPE_REFRESH, null));
            this.zzj = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e9) {
            throw zzahc.zza(e9, zza, str);
        }
    }

    public final long zza() {
        return this.zzj;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final List<zzafs> zze() {
        zzafv zzafvVar = this.zzg;
        if (zzafvVar != null) {
            return zzafvVar.zza();
        }
        return null;
    }
}
