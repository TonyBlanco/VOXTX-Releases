package t1;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: t1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2764e implements Parcelable {
    public static final Parcelable.Creator<C2764e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50632a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2763d f50634d = a();

    /* JADX INFO: renamed from: t1.e$a */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2764e createFromParcel(Parcel parcel) {
            return new C2764e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2764e[] newArray(int i9) {
            return new C2764e[i9];
        }
    }

    public C2764e(Parcel parcel) {
        this.f50632a = parcel.readString();
        this.f50633c = parcel.readString();
    }

    public C2764e(String str, String str2) {
        this.f50632a = str;
        this.f50633c = str2;
    }

    public C2763d a() {
        try {
            JSONObject jSONObject = new JSONObject(this.f50632a);
            C2763d c2763d = new C2763d();
            c2763d.f50624a = jSONObject.optString("orderId");
            c2763d.f50625c = jSONObject.optString("packageName");
            c2763d.f50626d = jSONObject.optString("productId");
            long jOptLong = jSONObject.optLong("purchaseTime", 0L);
            c2763d.f50627e = jOptLong != 0 ? new Date(jOptLong) : null;
            c2763d.f50628f = EnumC2765f.values()[jSONObject.optInt("purchaseState", 1)];
            c2763d.f50629g = jSONObject.optString("developerPayload");
            c2763d.f50630h = jSONObject.getString("purchaseToken");
            c2763d.f50631i = jSONObject.optBoolean("autoRenewing");
            return c2763d;
        } catch (JSONException e9) {
            Log.e("iabv3.purchaseInfo", "Failed to parse response data", e9);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2764e)) {
            return false;
        }
        C2764e c2764e = (C2764e) obj;
        return this.f50632a.equals(c2764e.f50632a) && this.f50633c.equals(c2764e.f50633c) && this.f50634d.f50630h.equals(c2764e.f50634d.f50630h) && this.f50634d.f50627e.equals(c2764e.f50634d.f50627e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f50632a);
        parcel.writeString(this.f50633c);
    }
}
