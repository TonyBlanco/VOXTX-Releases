package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.android.gms.common.internal.r;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafr {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzagr zze;
    private String zzf;

    private zzafr(String str, String str2, String str3, long j9, zzagr zzagrVar) {
        if (!TextUtils.isEmpty(str) && zzagrVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.zza = str;
        this.zzb = r.g(str2);
        this.zzc = str3;
        this.zzd = j9;
        this.zze = zzagrVar;
    }

    private static long zza(String str) {
        try {
            return zzanc.zza(zzanc.zza(str));
        } catch (ParseException e9) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, e9);
            return 0L;
        }
    }

    public static zzafr zza(JSONObject jSONObject) {
        zzafr zzafrVar = new zzafr(jSONObject.optString("phoneInfo", null), jSONObject.optString("mfaEnrollmentId", null), jSONObject.optString("displayName", null), zza(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new zzagr() : null);
        zzafrVar.zzf = jSONObject.optString("unobfuscatedPhoneInfo");
        return zzafrVar;
    }

    public static List<zzafr> zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            arrayList.add(zza(jSONArray.getJSONObject(i9)));
        }
        return arrayList;
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzagr zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }
}
