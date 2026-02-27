package com.google.android.gms.internal.p001firebaseauthapi;

import C4.o;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zzagz implements zzacs<zzagz> {
    private static final String zza = "zzagz";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private List<zzafr> zzi;
    private String zzj;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacs
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagz zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = o.a(jSONObject.optString("localId", null));
            this.zzc = o.a(jSONObject.optString("email", null));
            this.zzd = o.a(jSONObject.optString("displayName", null));
            this.zze = o.a(jSONObject.optString(ClientConstants.TOKEN_TYPE_ID, null));
            this.zzf = o.a(jSONObject.optString("photoUrl", null));
            this.zzg = o.a(jSONObject.optString(ClientConstants.TOKEN_TYPE_REFRESH, null));
            this.zzh = jSONObject.optLong("expiresIn", 0L);
            this.zzi = zzafr.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzj = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e9) {
            throw zzahc.zza(e9, zza, str);
        }
    }

    public final long zza() {
        return this.zzh;
    }

    public final String zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzj;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final List<zzafr> zze() {
        return this.zzi;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzj);
    }
}
