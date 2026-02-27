package com.google.android.gms.internal.p001firebaseauthapi;

import C4.h;
import C4.o;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.common.internal.r;
import org.json.JSONException;
import org.json.JSONObject;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
public class zzafn extends AbstractC2985a implements zzacs<zzafn> {
    public static final Parcelable.Creator<zzafn> CREATOR = new zzafm();
    private static final String zza = "zzafn";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzafn() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    public zzafn(String str, String str2, Long l9, String str3) {
        this(str, str2, l9, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public zzafn(String str, String str2, Long l9, String str3, Long l10) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l9;
        this.zze = str3;
        this.zzf = l10;
    }

    public static zzafn zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzafn zzafnVar = new zzafn();
            zzafnVar.zzb = jSONObject.optString("refresh_token", null);
            zzafnVar.zzc = jSONObject.optString(ClientConstants.HTTP_RESPONSE_ACCESS_TOKEN, null);
            zzafnVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzafnVar.zze = jSONObject.optString("token_type", null);
            zzafnVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzafnVar;
        } catch (JSONException e9) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzxw(e9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacs
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzafn zza(String str) throws zzaaf {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = o.a(jSONObject.optString("refresh_token"));
            this.zzc = o.a(jSONObject.optString(ClientConstants.HTTP_RESPONSE_ACCESS_TOKEN));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = o.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e9) {
            throw zzahc.zza(e9, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = c.a(parcel);
        c.t(parcel, 2, this.zzb, false);
        c.t(parcel, 3, this.zzc, false);
        c.q(parcel, 4, Long.valueOf(zza()), false);
        c.t(parcel, 5, this.zze, false);
        Long l9 = this.zzf;
        l9.longValue();
        c.q(parcel, 6, l9, false);
        c.b(parcel, iA);
    }

    public final long zza() {
        Long l9 = this.zzd;
        if (l9 == null) {
            return 0L;
        }
        return l9.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final void zzc(String str) {
        this.zzb = r.g(str);
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put(ClientConstants.HTTP_RESPONSE_ACCESS_TOKEN, this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e9) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzxw(e9);
        }
    }

    public final boolean zzg() {
        return h.c().a() + 300000 < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }
}
