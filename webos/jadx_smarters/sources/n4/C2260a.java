package n4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.Locale;
import org.achartengine.ChartFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import t4.AbstractC2774a;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2260a extends AbstractC2985a {
    public static final Parcelable.Creator<C2260a> CREATOR = new C2290w();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f45349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f45350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f45351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f45352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f45353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f45354m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f45355n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f45356o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f45357p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2288u f45358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public JSONObject f45359r;

    public C2260a(String str, String str2, long j9, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, C2288u c2288u) {
        JSONObject jSONObject;
        this.f45347f = str;
        this.f45348g = str2;
        this.f45349h = j9;
        this.f45350i = str3;
        this.f45351j = str4;
        this.f45352k = str5;
        this.f45353l = str6;
        this.f45354m = str7;
        this.f45355n = str8;
        this.f45356o = j10;
        this.f45357p = str9;
        this.f45358q = c2288u;
        if (TextUtils.isEmpty(str6)) {
            jSONObject = new JSONObject();
        } else {
            try {
                this.f45359r = new JSONObject(this.f45353l);
                return;
            } catch (JSONException e9) {
                Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e9.getMessage()));
                this.f45353l = null;
                jSONObject = new JSONObject();
            }
        }
        this.f45359r = jSONObject;
    }

    public String H() {
        return this.f45352k;
    }

    public String I() {
        return this.f45354m;
    }

    public String J() {
        return this.f45350i;
    }

    public long K() {
        return this.f45349h;
    }

    public String L() {
        return this.f45357p;
    }

    public String M() {
        return this.f45347f;
    }

    public String N() {
        return this.f45355n;
    }

    public String O() {
        return this.f45351j;
    }

    public String P() {
        return this.f45348g;
    }

    public C2288u Q() {
        return this.f45358q;
    }

    public long R() {
        return this.f45356o;
    }

    public final JSONObject S() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Name.MARK, this.f45347f);
            jSONObject.put("duration", AbstractC2774a.b(this.f45349h));
            long j9 = this.f45356o;
            if (j9 != -1) {
                jSONObject.put("whenSkippable", AbstractC2774a.b(j9));
            }
            String str = this.f45354m;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f45351j;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f45348g;
            if (str3 != null) {
                jSONObject.put(ChartFactory.TITLE, str3);
            }
            String str4 = this.f45350i;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f45352k;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f45359r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f45355n;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f45357p;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            C2288u c2288u = this.f45358q;
            if (c2288u != null) {
                jSONObject.put("vastAdsRequest", c2288u.J());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2260a)) {
            return false;
        }
        C2260a c2260a = (C2260a) obj;
        return AbstractC2774a.k(this.f45347f, c2260a.f45347f) && AbstractC2774a.k(this.f45348g, c2260a.f45348g) && this.f45349h == c2260a.f45349h && AbstractC2774a.k(this.f45350i, c2260a.f45350i) && AbstractC2774a.k(this.f45351j, c2260a.f45351j) && AbstractC2774a.k(this.f45352k, c2260a.f45352k) && AbstractC2774a.k(this.f45353l, c2260a.f45353l) && AbstractC2774a.k(this.f45354m, c2260a.f45354m) && AbstractC2774a.k(this.f45355n, c2260a.f45355n) && this.f45356o == c2260a.f45356o && AbstractC2774a.k(this.f45357p, c2260a.f45357p) && AbstractC2774a.k(this.f45358q, c2260a.f45358q);
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f45347f, this.f45348g, Long.valueOf(this.f45349h), this.f45350i, this.f45351j, this.f45352k, this.f45353l, this.f45354m, this.f45355n, Long.valueOf(this.f45356o), this.f45357p, this.f45358q);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 2, M(), false);
        y4.c.t(parcel, 3, P(), false);
        y4.c.o(parcel, 4, K());
        y4.c.t(parcel, 5, J(), false);
        y4.c.t(parcel, 6, O(), false);
        y4.c.t(parcel, 7, H(), false);
        y4.c.t(parcel, 8, this.f45353l, false);
        y4.c.t(parcel, 9, I(), false);
        y4.c.t(parcel, 10, N(), false);
        y4.c.o(parcel, 11, R());
        y4.c.t(parcel, 12, L(), false);
        y4.c.r(parcel, 13, Q(), i9, false);
        y4.c.b(parcel, iA);
    }
}
