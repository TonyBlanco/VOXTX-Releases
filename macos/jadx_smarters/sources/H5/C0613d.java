package H5;

import G5.InterfaceC0554v;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: H5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0613d implements InterfaceC0554v {
    public static final Parcelable.Creator<C0613d> CREATOR = new C0616g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2674a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2675c;

    public C0613d(long j9, long j10) {
        this.f2674a = j9;
        this.f2675c = j10;
    }

    public static C0613d d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C0613d(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final long a() {
        return this.f2675c;
    }

    public final long c() {
        return this.f2674a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f2674a);
            jSONObject.put("creationTimestamp", this.f2675c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.o(parcel, 1, c());
        y4.c.o(parcel, 2, a());
        y4.c.b(parcel, iA);
    }
}
