package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafq extends AbstractC2985a {
    public static final Parcelable.Creator<zzafq> CREATOR = new zzaft();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzafq(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public static zzap<zzafq> zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzap.zza(new ArrayList());
        }
        zzao zzaoVarZzg = zzap.zzg();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i9);
            zzaoVarZzg.zza(new zzafq(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzaoVarZzg.zza();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = c.a(parcel);
        c.t(parcel, 1, this.zza, false);
        c.t(parcel, 2, this.zzb, false);
        c.t(parcel, 3, this.zzc, false);
        c.b(parcel, iA);
    }
}
