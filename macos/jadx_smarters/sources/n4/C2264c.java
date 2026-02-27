package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import org.json.JSONException;
import org.json.JSONObject;
import t4.AbstractC2774a;
import t4.C2775b;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2264c extends AbstractC2985a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f45368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f45369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f45370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f45371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f45372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C2775b f45367k = new C2775b("AdBreakStatus");
    public static final Parcelable.Creator<C2264c> CREATOR = new C2271f0();

    public C2264c(long j9, long j10, String str, String str2, long j11) {
        this.f45368f = j9;
        this.f45369g = j10;
        this.f45370h = str;
        this.f45371i = str2;
        this.f45372j = j11;
    }

    public static C2264c M(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("currentBreakTime") && jSONObject.has("currentBreakClipTime")) {
            try {
                long jE = AbstractC2774a.e(jSONObject.getLong("currentBreakTime"));
                long jE2 = AbstractC2774a.e(jSONObject.getLong("currentBreakClipTime"));
                String strC = AbstractC2774a.c(jSONObject, "breakId");
                String strC2 = AbstractC2774a.c(jSONObject, "breakClipId");
                long jOptLong = jSONObject.optLong("whenSkippable", -1L);
                return new C2264c(jE, jE2, strC, strC2, jOptLong != -1 ? AbstractC2774a.e(jOptLong) : jOptLong);
            } catch (JSONException e9) {
                f45367k.d(e9, "Error while creating an AdBreakClipInfo from JSON", new Object[0]);
            }
        }
        return null;
    }

    public String H() {
        return this.f45371i;
    }

    public String I() {
        return this.f45370h;
    }

    public long J() {
        return this.f45369g;
    }

    public long K() {
        return this.f45368f;
    }

    public long L() {
        return this.f45372j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2264c)) {
            return false;
        }
        C2264c c2264c = (C2264c) obj;
        return this.f45368f == c2264c.f45368f && this.f45369g == c2264c.f45369g && AbstractC2774a.k(this.f45370h, c2264c.f45370h) && AbstractC2774a.k(this.f45371i, c2264c.f45371i) && this.f45372j == c2264c.f45372j;
    }

    public int hashCode() {
        return AbstractC1418q.c(Long.valueOf(this.f45368f), Long.valueOf(this.f45369g), this.f45370h, this.f45371i, Long.valueOf(this.f45372j));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.o(parcel, 2, K());
        y4.c.o(parcel, 3, J());
        y4.c.t(parcel, 4, I(), false);
        y4.c.t(parcel, 5, H(), false);
        y4.c.o(parcel, 6, L());
        y4.c.b(parcel, iA);
    }
}
