package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import org.json.JSONException;
import org.json.JSONObject;
import t4.AbstractC2774a;
import t4.C2775b;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2278j extends AbstractC2985a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f45399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f45400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f45401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f45402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C2775b f45398j = new C2775b("MediaLiveSeekableRange");
    public static final Parcelable.Creator<C2278j> CREATOR = new C2269e0();

    public C2278j(long j9, long j10, boolean z9, boolean z10) {
        this.f45399f = Math.max(j9, 0L);
        this.f45400g = Math.max(j10, 0L);
        this.f45401h = z9;
        this.f45402i = z10;
    }

    public static C2278j L(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("start") && jSONObject.has("end")) {
            try {
                return new C2278j(AbstractC2774a.d(jSONObject.getDouble("start")), AbstractC2774a.d(jSONObject.getDouble("end")), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
            } catch (JSONException unused) {
                f45398j.c("Ignoring Malformed MediaLiveSeekableRange: ".concat(jSONObject.toString()), new Object[0]);
            }
        }
        return null;
    }

    public long H() {
        return this.f45400g;
    }

    public long I() {
        return this.f45399f;
    }

    public boolean J() {
        return this.f45402i;
    }

    public boolean K() {
        return this.f45401h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2278j)) {
            return false;
        }
        C2278j c2278j = (C2278j) obj;
        return this.f45399f == c2278j.f45399f && this.f45400g == c2278j.f45400g && this.f45401h == c2278j.f45401h && this.f45402i == c2278j.f45402i;
    }

    public int hashCode() {
        return AbstractC1418q.c(Long.valueOf(this.f45399f), Long.valueOf(this.f45400g), Boolean.valueOf(this.f45401h), Boolean.valueOf(this.f45402i));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.o(parcel, 2, I());
        y4.c.o(parcel, 3, H());
        y4.c.c(parcel, 4, K());
        y4.c.c(parcel, 5, J());
        y4.c.b(parcel, iA);
    }
}
