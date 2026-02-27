package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t4.AbstractC2774a;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2284p extends AbstractC2985a {
    public static final Parcelable.Creator<C2284p> CREATOR = new q0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediaInfo f45470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f45473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f45474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f45475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long[] f45476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f45477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public JSONObject f45478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f45479o;

    /* JADX INFO: renamed from: n4.p$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2284p f45480a;

        public a(MediaInfo mediaInfo) {
            this.f45480a = new C2284p(mediaInfo, (p0) null);
        }

        public a(C2284p c2284p) {
            this.f45480a = new C2284p(c2284p, (p0) null);
        }

        public a(JSONObject jSONObject) {
            this.f45480a = new C2284p(jSONObject);
        }

        public C2284p a() {
            this.f45480a.S();
            return this.f45480a;
        }

        public a b() {
            this.f45480a.P().a(0);
            return this;
        }
    }

    /* JADX INFO: renamed from: n4.p$b */
    public class b {
        public b() {
        }

        public void a(int i9) {
            C2284p.this.f45471g = i9;
        }
    }

    public C2284p(MediaInfo mediaInfo, int i9, boolean z9, double d9, double d10, double d11, long[] jArr, String str) {
        this.f45473i = Double.NaN;
        this.f45479o = new b();
        this.f45470f = mediaInfo;
        this.f45471g = i9;
        this.f45472h = z9;
        this.f45473i = d9;
        this.f45474j = d10;
        this.f45475k = d11;
        this.f45476l = jArr;
        this.f45477m = str;
        if (str == null) {
            this.f45478n = null;
            return;
        }
        try {
            this.f45478n = new JSONObject(this.f45477m);
        } catch (JSONException unused) {
            this.f45478n = null;
            this.f45477m = null;
        }
    }

    public /* synthetic */ C2284p(MediaInfo mediaInfo, p0 p0Var) {
        this(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    public /* synthetic */ C2284p(C2284p c2284p, p0 p0Var) {
        this(c2284p.L(), c2284p.K(), c2284p.I(), c2284p.O(), c2284p.M(), c2284p.N(), c2284p.H(), null);
        if (this.f45470f == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        this.f45478n = c2284p.J();
    }

    public C2284p(JSONObject jSONObject) throws JSONException {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        c(jSONObject);
    }

    public long[] H() {
        return this.f45476l;
    }

    public boolean I() {
        return this.f45472h;
    }

    public JSONObject J() {
        return this.f45478n;
    }

    public int K() {
        return this.f45471g;
    }

    public MediaInfo L() {
        return this.f45470f;
    }

    public double M() {
        return this.f45474j;
    }

    public double N() {
        return this.f45475k;
    }

    public double O() {
        return this.f45473i;
    }

    public b P() {
        return this.f45479o;
    }

    public JSONObject Q() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f45470f;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.W());
            }
            int i9 = this.f45471g;
            if (i9 != 0) {
                jSONObject.put("itemId", i9);
            }
            jSONObject.put("autoplay", this.f45472h);
            if (!Double.isNaN(this.f45473i)) {
                jSONObject.put("startTime", this.f45473i);
            }
            double d9 = this.f45474j;
            if (d9 != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d9);
            }
            jSONObject.put("preloadTime", this.f45475k);
            if (this.f45476l != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j9 : this.f45476l) {
                    jSONArray.put(j9);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f45478n;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void S() {
        if (this.f45470f == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(this.f45473i) && this.f45473i < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(this.f45474j)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(this.f45475k) || this.f45475k < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    public boolean c(JSONObject jSONObject) throws JSONException {
        boolean z9;
        long[] jArr;
        boolean z10;
        int i9;
        boolean z11 = false;
        if (jSONObject.has("media")) {
            this.f45470f = new MediaInfo(jSONObject.getJSONObject("media"));
            z9 = true;
        } else {
            z9 = false;
        }
        if (jSONObject.has("itemId") && this.f45471g != (i9 = jSONObject.getInt("itemId"))) {
            this.f45471g = i9;
            z9 = true;
        }
        if (jSONObject.has("autoplay") && this.f45472h != (z10 = jSONObject.getBoolean("autoplay"))) {
            this.f45472h = z10;
            z9 = true;
        }
        double dOptDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(dOptDouble) != Double.isNaN(this.f45473i) || (!Double.isNaN(dOptDouble) && Math.abs(dOptDouble - this.f45473i) > 1.0E-7d)) {
            this.f45473i = dOptDouble;
            z9 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d9 = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d9 - this.f45474j) > 1.0E-7d) {
                this.f45474j = d9;
                z9 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d10 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d10 - this.f45475k) > 1.0E-7d) {
                this.f45475k = d10;
                z9 = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArray.getLong(i10);
            }
            long[] jArr2 = this.f45476l;
            if (jArr2 == null || jArr2.length != length) {
                z11 = true;
                break;
            }
            for (int i11 = 0; i11 < length; i11++) {
                if (this.f45476l[i11] != jArr[i11]) {
                    z11 = true;
                    break;
                }
            }
        } else {
            jArr = null;
        }
        if (z11) {
            this.f45476l = jArr;
            z9 = true;
        }
        if (!jSONObject.has("customData")) {
            return z9;
        }
        this.f45478n = jSONObject.getJSONObject("customData");
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2284p)) {
            return false;
        }
        C2284p c2284p = (C2284p) obj;
        JSONObject jSONObject = this.f45478n;
        boolean z9 = jSONObject == null;
        JSONObject jSONObject2 = c2284p.f45478n;
        if (z9 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C4.l.a(jSONObject, jSONObject2)) && AbstractC2774a.k(this.f45470f, c2284p.f45470f) && this.f45471g == c2284p.f45471g && this.f45472h == c2284p.f45472h && ((Double.isNaN(this.f45473i) && Double.isNaN(c2284p.f45473i)) || this.f45473i == c2284p.f45473i) && this.f45474j == c2284p.f45474j && this.f45475k == c2284p.f45475k && Arrays.equals(this.f45476l, c2284p.f45476l);
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f45470f, Integer.valueOf(this.f45471g), Boolean.valueOf(this.f45472h), Double.valueOf(this.f45473i), Double.valueOf(this.f45474j), Double.valueOf(this.f45475k), Integer.valueOf(Arrays.hashCode(this.f45476l)), String.valueOf(this.f45478n));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        JSONObject jSONObject = this.f45478n;
        this.f45477m = jSONObject == null ? null : jSONObject.toString();
        int iA = y4.c.a(parcel);
        y4.c.r(parcel, 2, L(), i9, false);
        y4.c.l(parcel, 3, K());
        y4.c.c(parcel, 4, I());
        y4.c.g(parcel, 5, O());
        y4.c.g(parcel, 6, M());
        y4.c.g(parcel, 7, N());
        y4.c.p(parcel, 8, H(), false);
        y4.c.t(parcel, 9, this.f45477m, false);
        y4.c.b(parcel, iA);
    }
}
