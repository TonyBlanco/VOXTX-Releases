package n4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import t4.AbstractC2774a;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2262b extends AbstractC2985a {
    public static final Parcelable.Creator<C2262b> CREATOR = new F();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f45360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f45362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f45363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String[] f45364j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f45365k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f45366l;

    public C2262b(long j9, String str, long j10, boolean z9, String[] strArr, boolean z10, boolean z11) {
        this.f45360f = j9;
        this.f45361g = str;
        this.f45362h = j10;
        this.f45363i = z9;
        this.f45364j = strArr;
        this.f45365k = z10;
        this.f45366l = z11;
    }

    public String[] H() {
        return this.f45364j;
    }

    public long I() {
        return this.f45362h;
    }

    public String J() {
        return this.f45361g;
    }

    public long K() {
        return this.f45360f;
    }

    public boolean L() {
        return this.f45365k;
    }

    public boolean M() {
        return this.f45366l;
    }

    public boolean N() {
        return this.f45363i;
    }

    public final JSONObject O() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Name.MARK, this.f45361g);
            jSONObject.put("position", AbstractC2774a.b(this.f45360f));
            jSONObject.put("isWatched", this.f45363i);
            jSONObject.put("isEmbedded", this.f45365k);
            jSONObject.put("duration", AbstractC2774a.b(this.f45362h));
            jSONObject.put("expanded", this.f45366l);
            if (this.f45364j != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.f45364j) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2262b)) {
            return false;
        }
        C2262b c2262b = (C2262b) obj;
        return AbstractC2774a.k(this.f45361g, c2262b.f45361g) && this.f45360f == c2262b.f45360f && this.f45362h == c2262b.f45362h && this.f45363i == c2262b.f45363i && Arrays.equals(this.f45364j, c2262b.f45364j) && this.f45365k == c2262b.f45365k && this.f45366l == c2262b.f45366l;
    }

    public int hashCode() {
        return this.f45361g.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.o(parcel, 2, K());
        y4.c.t(parcel, 3, J(), false);
        y4.c.o(parcel, 4, I());
        y4.c.c(parcel, 5, N());
        y4.c.u(parcel, 6, H(), false);
        y4.c.c(parcel, 7, L());
        y4.c.c(parcel, 8, M());
        y4.c.b(parcel, iA);
    }
}
