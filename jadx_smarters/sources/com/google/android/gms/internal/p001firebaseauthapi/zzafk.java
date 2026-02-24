package com.google.android.gms.internal.p001firebaseauthapi;

import C4.o;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zzafk implements zzacs<zzafk> {
    private static final String zza = "zzafk";
    private String zzb;
    private zzap<zzafu> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacs
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzafk zza(String str) throws zzaaf {
        zzap<zzafu> zzapVarZza;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = o.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzapVarZza = zzap.zza(new ArrayList());
                } else {
                    zzao zzaoVarZzg = zzap.zzg();
                    for (int i9 = 0; i9 < jSONArrayOptJSONArray.length(); i9++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i9);
                        zzaoVarZzg.zza(jSONObject2 == null ? zzafu.zza(null, null) : zzafu.zza(o.a(jSONObject2.optString("provider")), o.a(jSONObject2.optString("enforcementState"))));
                    }
                    zzapVarZza = zzaoVarZzg.zza();
                }
                this.zzc = zzapVarZza;
            }
            return this;
        } catch (NullPointerException e9) {
            e = e9;
            throw zzahc.zza(e, zza, str);
        } catch (JSONException e10) {
            e = e10;
            throw zzahc.zza(e, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb(String str) {
        zzap<zzafu> zzapVar = this.zzc;
        if (zzapVar != null && !zzapVar.isEmpty()) {
            zzap<zzafu> zzapVar2 = this.zzc;
            int size = zzapVar2.size();
            int i9 = 0;
            while (i9 < size) {
                zzafu zzafuVar = zzapVar2.get(i9);
                i9++;
                zzafu zzafuVar2 = zzafuVar;
                String strZza = zzafuVar2.zza();
                String strZzb = zzafuVar2.zzb();
                if (strZza != null && strZzb != null && (strZza.equals("ENFORCE") || strZza.equals("AUDIT"))) {
                    if (strZzb.equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
