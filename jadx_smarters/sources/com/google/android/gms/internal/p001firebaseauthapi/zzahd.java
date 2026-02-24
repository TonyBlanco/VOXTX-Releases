package com.google.android.gms.internal.p001firebaseauthapi;

import C4.o;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zzahd implements zzacs<zzahd> {
    private static final String zza = "zzahd";
    private String zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacs
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahd zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = o.a(jSONObject.optString(ClientConstants.TOKEN_TYPE_ID, null));
            this.zzc = o.a(jSONObject.optString(ClientConstants.TOKEN_TYPE_REFRESH, null));
            return this;
        } catch (NullPointerException | JSONException e9) {
            throw zzahc.zza(e9, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}
