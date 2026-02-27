package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import org.json.JSONException;
import org.json.JSONObject;
import t4.AbstractC2774a;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2288u extends AbstractC2985a {
    public static final Parcelable.Creator<C2288u> CREATOR = new x0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45536g;

    public C2288u(String str, String str2) {
        this.f45535f = str;
        this.f45536g = str2;
    }

    public static C2288u c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C2288u(AbstractC2774a.c(jSONObject, "adTagUrl"), AbstractC2774a.c(jSONObject, "adsResponse"));
    }

    public String H() {
        return this.f45535f;
    }

    public String I() {
        return this.f45536g;
    }

    public final JSONObject J() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f45535f;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f45536g;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2288u)) {
            return false;
        }
        C2288u c2288u = (C2288u) obj;
        return AbstractC2774a.k(this.f45535f, c2288u.f45535f) && AbstractC2774a.k(this.f45536g, c2288u.f45536g);
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f45535f, this.f45536g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 2, H(), false);
        y4.c.t(parcel, 3, I(), false);
        y4.c.b(parcel, iA);
    }
}
