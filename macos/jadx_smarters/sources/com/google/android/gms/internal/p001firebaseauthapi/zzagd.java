package com.google.android.gms.internal.p001firebaseauthapi;

import C4.o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zzagd implements zzacs<zzagd> {
    private static final String zza = "zzagd";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacs
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagd zza(String str) throws zzaaf {
        try {
            this.zzb = o.a(new JSONObject(str).optString("sessionInfo", null));
            return this;
        } catch (NullPointerException | JSONException e9) {
            throw zzahc.zza(e9, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
