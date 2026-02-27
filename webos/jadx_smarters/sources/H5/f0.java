package H5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzafc;
import com.google.android.gms.internal.p001firebaseauthapi.zzafs;
import com.google.android.gms.internal.p001firebaseauthapi.zzxw;
import org.json.JSONException;
import org.json.JSONObject;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends AbstractC2985a implements G5.O {
    public static final Parcelable.Creator<f0> CREATOR = new i0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Uri f2684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f2686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2688n;

    public f0(zzafc zzafcVar, String str) {
        com.google.android.gms.common.internal.r.m(zzafcVar);
        com.google.android.gms.common.internal.r.g(str);
        this.f2680f = com.google.android.gms.common.internal.r.g(zzafcVar.zzi());
        this.f2681g = str;
        this.f2685k = zzafcVar.zzh();
        this.f2682h = zzafcVar.zzg();
        Uri uriZzc = zzafcVar.zzc();
        if (uriZzc != null) {
            this.f2683i = uriZzc.toString();
            this.f2684j = uriZzc;
        }
        this.f2687m = zzafcVar.zzm();
        this.f2688n = null;
        this.f2686l = zzafcVar.zzj();
    }

    public f0(zzafs zzafsVar) {
        com.google.android.gms.common.internal.r.m(zzafsVar);
        this.f2680f = zzafsVar.zzd();
        this.f2681g = com.google.android.gms.common.internal.r.g(zzafsVar.zzf());
        this.f2682h = zzafsVar.zzb();
        Uri uriZza = zzafsVar.zza();
        if (uriZza != null) {
            this.f2683i = uriZza.toString();
            this.f2684j = uriZza;
        }
        this.f2685k = zzafsVar.zzc();
        this.f2686l = zzafsVar.zze();
        this.f2687m = false;
        this.f2688n = zzafsVar.zzg();
    }

    public f0(String str, String str2, String str3, String str4, String str5, String str6, boolean z9, String str7) {
        this.f2680f = str;
        this.f2681g = str2;
        this.f2685k = str3;
        this.f2686l = str4;
        this.f2682h = str5;
        this.f2683i = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f2684j = Uri.parse(this.f2683i);
        }
        this.f2687m = z9;
        this.f2688n = str7;
    }

    public static f0 M(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new f0(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e9) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzxw(e9);
        }
    }

    public final String H() {
        return this.f2682h;
    }

    public final String I() {
        return this.f2685k;
    }

    public final String J() {
        return this.f2686l;
    }

    public final String K() {
        return this.f2680f;
    }

    public final boolean L() {
        return this.f2687m;
    }

    public final String N() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f2680f);
            jSONObject.putOpt("providerId", this.f2681g);
            jSONObject.putOpt("displayName", this.f2682h);
            jSONObject.putOpt("photoUrl", this.f2683i);
            jSONObject.putOpt("email", this.f2685k);
            jSONObject.putOpt("phoneNumber", this.f2686l);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f2687m));
            jSONObject.putOpt("rawUserInfo", this.f2688n);
            return jSONObject.toString();
        } catch (JSONException e9) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzxw(e9);
        }
    }

    @Override // G5.O
    public final String g() {
        return this.f2681g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, K(), false);
        y4.c.t(parcel, 2, g(), false);
        y4.c.t(parcel, 3, H(), false);
        y4.c.t(parcel, 4, this.f2683i, false);
        y4.c.t(parcel, 5, I(), false);
        y4.c.t(parcel, 6, J(), false);
        y4.c.c(parcel, 7, L());
        y4.c.t(parcel, 8, this.f2688n, false);
        y4.c.b(parcel, iA);
    }

    public final String zza() {
        return this.f2688n;
    }
}
