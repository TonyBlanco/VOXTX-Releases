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
import t4.C2775b;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2280l extends AbstractC2985a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MediaInfo f45421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2283o f45422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f45423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f45424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double f45425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long[] f45426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f45427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final JSONObject f45428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f45429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f45430o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f45431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f45432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f45433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C2775b f45420s = new C2775b("MediaLoadRequestData");
    public static final Parcelable.Creator<C2280l> CREATOR = new C2277i0();

    /* JADX INFO: renamed from: n4.l$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MediaInfo f45434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C2283o f45435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f45436c = Boolean.TRUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f45437d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f45438e = 1.0d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long[] f45439f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public JSONObject f45440g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f45441h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f45442i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f45443j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f45444k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f45445l;

        public C2280l a() {
            return new C2280l(this.f45434a, this.f45435b, this.f45436c, this.f45437d, this.f45438e, this.f45439f, this.f45440g, this.f45441h, this.f45442i, this.f45443j, this.f45444k, this.f45445l);
        }

        public a b(long[] jArr) {
            this.f45439f = jArr;
            return this;
        }

        public a c(Boolean bool) {
            this.f45436c = bool;
            return this;
        }

        public a d(String str) {
            this.f45441h = str;
            return this;
        }

        public a e(String str) {
            this.f45442i = str;
            return this;
        }

        public a f(long j9) {
            this.f45437d = j9;
            return this;
        }

        public a g(JSONObject jSONObject) {
            this.f45440g = jSONObject;
            return this;
        }

        public a h(MediaInfo mediaInfo) {
            this.f45434a = mediaInfo;
            return this;
        }

        public a i(double d9) {
            if (Double.compare(d9, 2.0d) > 0 || Double.compare(d9, 0.5d) < 0) {
                throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            }
            this.f45438e = d9;
            return this;
        }

        public a j(C2283o c2283o) {
            this.f45435b = c2283o;
            return this;
        }
    }

    public C2280l(MediaInfo mediaInfo, C2283o c2283o, Boolean bool, long j9, double d9, long[] jArr, String str, String str2, String str3, String str4, String str5, long j10) {
        this(mediaInfo, c2283o, bool, j9, d9, jArr, AbstractC2774a.a(str), str2, str3, str4, str5, j10);
    }

    public C2280l(MediaInfo mediaInfo, C2283o c2283o, Boolean bool, long j9, double d9, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.f45421f = mediaInfo;
        this.f45422g = c2283o;
        this.f45423h = bool;
        this.f45424i = j9;
        this.f45425j = d9;
        this.f45426k = jArr;
        this.f45428m = jSONObject;
        this.f45429n = str;
        this.f45430o = str2;
        this.f45431p = str3;
        this.f45432q = str4;
        this.f45433r = j10;
    }

    public long[] H() {
        return this.f45426k;
    }

    public Boolean I() {
        return this.f45423h;
    }

    public String J() {
        return this.f45429n;
    }

    public String K() {
        return this.f45430o;
    }

    public long L() {
        return this.f45424i;
    }

    public MediaInfo M() {
        return this.f45421f;
    }

    public double N() {
        return this.f45425j;
    }

    public C2283o O() {
        return this.f45422g;
    }

    public long P() {
        return this.f45433r;
    }

    public JSONObject Q() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f45421f;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.W());
            }
            C2283o c2283o = this.f45422g;
            if (c2283o != null) {
                jSONObject.put("queueData", c2283o.P());
            }
            jSONObject.putOpt("autoplay", this.f45423h);
            long j9 = this.f45424i;
            if (j9 != -1) {
                jSONObject.put("currentTime", AbstractC2774a.b(j9));
            }
            jSONObject.put("playbackRate", this.f45425j);
            jSONObject.putOpt("credentials", this.f45429n);
            jSONObject.putOpt("credentialsType", this.f45430o);
            jSONObject.putOpt("atvCredentials", this.f45431p);
            jSONObject.putOpt("atvCredentialsType", this.f45432q);
            if (this.f45426k != null) {
                JSONArray jSONArray = new JSONArray();
                int i9 = 0;
                while (true) {
                    long[] jArr = this.f45426k;
                    if (i9 >= jArr.length) {
                        break;
                    }
                    jSONArray.put(i9, jArr[i9]);
                    i9++;
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            jSONObject.putOpt("customData", this.f45428m);
            jSONObject.put("requestId", this.f45433r);
            return jSONObject;
        } catch (JSONException e9) {
            f45420s.c("Error transforming MediaLoadRequestData into JSONObject", e9);
            return new JSONObject();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2280l)) {
            return false;
        }
        C2280l c2280l = (C2280l) obj;
        return C4.l.a(this.f45428m, c2280l.f45428m) && AbstractC1418q.b(this.f45421f, c2280l.f45421f) && AbstractC1418q.b(this.f45422g, c2280l.f45422g) && AbstractC1418q.b(this.f45423h, c2280l.f45423h) && this.f45424i == c2280l.f45424i && this.f45425j == c2280l.f45425j && Arrays.equals(this.f45426k, c2280l.f45426k) && AbstractC1418q.b(this.f45429n, c2280l.f45429n) && AbstractC1418q.b(this.f45430o, c2280l.f45430o) && AbstractC1418q.b(this.f45431p, c2280l.f45431p) && AbstractC1418q.b(this.f45432q, c2280l.f45432q) && this.f45433r == c2280l.f45433r;
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f45421f, this.f45422g, this.f45423h, Long.valueOf(this.f45424i), Double.valueOf(this.f45425j), this.f45426k, String.valueOf(this.f45428m), this.f45429n, this.f45430o, this.f45431p, this.f45432q, Long.valueOf(this.f45433r));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        JSONObject jSONObject = this.f45428m;
        this.f45427l = jSONObject == null ? null : jSONObject.toString();
        int iA = y4.c.a(parcel);
        y4.c.r(parcel, 2, M(), i9, false);
        y4.c.r(parcel, 3, O(), i9, false);
        y4.c.d(parcel, 4, I(), false);
        y4.c.o(parcel, 5, L());
        y4.c.g(parcel, 6, N());
        y4.c.p(parcel, 7, H(), false);
        y4.c.t(parcel, 8, this.f45427l, false);
        y4.c.t(parcel, 9, J(), false);
        y4.c.t(parcel, 10, K(), false);
        y4.c.t(parcel, 11, this.f45431p, false);
        y4.c.t(parcel, 12, this.f45432q, false);
        y4.c.o(parcel, 13, P());
        y4.c.b(parcel, iA);
    }
}
