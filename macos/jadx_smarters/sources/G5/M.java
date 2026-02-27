package G5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzagr;
import com.google.android.gms.internal.p001firebaseauthapi.zzxw;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class M extends B {
    public static final Parcelable.Creator<M> CREATOR = new Z();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzagr f2193i;

    public M(String str, String str2, long j9, zzagr zzagrVar) {
        this.f2190f = com.google.android.gms.common.internal.r.g(str);
        this.f2191g = str2;
        this.f2192h = j9;
        this.f2193i = (zzagr) com.google.android.gms.common.internal.r.n(zzagrVar, "totpInfo cannot be null.");
    }

    public static M M(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new M(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzagr());
    }

    @Override // G5.B
    public String H() {
        return this.f2191g;
    }

    @Override // G5.B
    public long I() {
        return this.f2192h;
    }

    @Override // G5.B
    public String J() {
        return "totp";
    }

    @Override // G5.B
    public String K() {
        return this.f2190f;
    }

    @Override // G5.B
    public JSONObject L() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f2190f);
            jSONObject.putOpt("displayName", this.f2191g);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f2192h));
            jSONObject.putOpt("totpInfo", this.f2193i);
            return jSONObject;
        } catch (JSONException e9) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxw(e9);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, K(), false);
        y4.c.t(parcel, 2, H(), false);
        y4.c.o(parcel, 3, I());
        y4.c.r(parcel, 4, this.f2193i, i9, false);
        y4.c.b(parcel, iA);
    }
}
