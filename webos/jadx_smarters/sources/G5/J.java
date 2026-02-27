package G5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzxw;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class J extends B {
    public static final Parcelable.Creator<J> CREATOR = new X();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f2188i;

    public J(String str, String str2, long j9, String str3) {
        this.f2185f = com.google.android.gms.common.internal.r.g(str);
        this.f2186g = str2;
        this.f2187h = j9;
        this.f2188i = com.google.android.gms.common.internal.r.g(str3);
    }

    public static J N(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new J(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // G5.B
    public String H() {
        return this.f2186g;
    }

    @Override // G5.B
    public long I() {
        return this.f2187h;
    }

    @Override // G5.B
    public String J() {
        return "phone";
    }

    @Override // G5.B
    public String K() {
        return this.f2185f;
    }

    @Override // G5.B
    public JSONObject L() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f2185f);
            jSONObject.putOpt("displayName", this.f2186g);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f2187h));
            jSONObject.putOpt("phoneNumber", this.f2188i);
            return jSONObject;
        } catch (JSONException e9) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxw(e9);
        }
    }

    public String M() {
        return this.f2188i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, K(), false);
        y4.c.t(parcel, 2, H(), false);
        y4.c.o(parcel, 3, I());
        y4.c.t(parcel, 4, M(), false);
        y4.c.b(parcel, iA);
    }
}
