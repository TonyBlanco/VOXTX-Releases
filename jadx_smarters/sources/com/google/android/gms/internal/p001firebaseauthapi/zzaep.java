package com.google.android.gms.internal.p001firebaseauthapi;

import A4.a;
import G5.C0538e;
import G5.C0541h;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.common.internal.r;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zzaep implements zzacp {
    private static final String zza = "zzaep";
    private static final a zzb = new a(zzaep.class.getSimpleName(), new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzaep(C0541h c0541h, String str, String str2) {
        this.zzc = r.g(c0541h.zzc());
        this.zzd = r.g(c0541h.zze());
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacp
    public final String zza() throws JSONException {
        C0538e c0538eB = C0538e.b(this.zzd);
        String strA = c0538eB != null ? c0538eB.a() : null;
        String strC = c0538eB != null ? c0538eB.c() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzc);
        if (strA != null) {
            jSONObject.put("oobCode", strA);
        }
        if (strC != null) {
            jSONObject.put("tenantId", strC);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put(ClientConstants.TOKEN_TYPE_ID, str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            zzahc.zza(jSONObject, "captchaResp", str2);
        } else {
            zzahc.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
