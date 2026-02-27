package com.google.android.gms.cast;

import C4.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.zzfe;
import com.google.android.gms.internal.cast.zzfh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n4.C2260a;
import n4.C2262b;
import n4.C2267d0;
import n4.C2281m;
import n4.C2287t;
import n4.C2288u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t4.AbstractC2774a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
public class MediaInfo extends AbstractC2985a implements ReflectedParcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f26261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2281m f26262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f26263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f26264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2287t f26265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f26266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f26267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f26268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f26269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C2288u f26270q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f26271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f26272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f26273t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f26274u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f26275v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public JSONObject f26276w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f26277x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f26258y = AbstractC2774a.e(-1);
    public static final Parcelable.Creator<MediaInfo> CREATOR = new C2267d0();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f26278a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f26280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C2281m f26281d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f26283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C2287t f26284g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f26285h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List f26286i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List f26287j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f26288k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public C2288u f26289l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f26290m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f26291n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f26292o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f26293p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26279b = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f26282e = -1;

        public a(String str) {
            this.f26278a = str;
        }

        public MediaInfo a() {
            return new MediaInfo(this.f26278a, this.f26279b, this.f26280c, this.f26281d, this.f26282e, this.f26283f, this.f26284g, this.f26285h, this.f26286i, this.f26287j, this.f26288k, this.f26289l, -1L, this.f26290m, this.f26291n, this.f26292o, this.f26293p);
        }

        public a b(String str) {
            this.f26280c = str;
            return this;
        }

        public a c(JSONObject jSONObject) {
            this.f26285h = jSONObject == null ? null : jSONObject.toString();
            return this;
        }

        public a d(C2281m c2281m) {
            this.f26281d = c2281m;
            return this;
        }

        public a e(int i9) {
            if (i9 < -1 || i9 > 2) {
                throw new IllegalArgumentException("invalid stream type");
            }
            this.f26279b = i9;
            return this;
        }
    }

    public class b {
        public b() {
        }
    }

    public MediaInfo(String str, int i9, String str2, C2281m c2281m, long j9, List list, C2287t c2287t, String str3, List list2, List list3, String str4, C2288u c2288u, long j10, String str5, String str6, String str7, String str8) {
        this.f26277x = new b();
        this.f26259f = str;
        this.f26260g = i9;
        this.f26261h = str2;
        this.f26262i = c2281m;
        this.f26263j = j9;
        this.f26264k = list;
        this.f26265l = c2287t;
        this.f26266m = str3;
        if (str3 != null) {
            try {
                this.f26276w = new JSONObject(this.f26266m);
            } catch (JSONException unused) {
                this.f26276w = null;
                this.f26266m = null;
            }
        } else {
            this.f26276w = null;
        }
        this.f26267n = list2;
        this.f26268o = list3;
        this.f26269p = str4;
        this.f26270q = c2288u;
        this.f26271r = j10;
        this.f26272s = str5;
        this.f26273t = str6;
        this.f26274u = str7;
        this.f26275v = str8;
        if (this.f26259f == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    public MediaInfo(JSONObject jSONObject) throws JSONException {
        MediaInfo mediaInfo;
        int i9;
        zzfh zzfhVarZzc;
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        String strOptString = jSONObject.optString("streamType", "NONE");
        if ("NONE".equals(strOptString)) {
            mediaInfo = this;
            mediaInfo.f26260g = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(strOptString)) {
                mediaInfo.f26260g = 1;
            } else if ("LIVE".equals(strOptString)) {
                mediaInfo.f26260g = 2;
            } else {
                mediaInfo.f26260g = -1;
            }
        }
        mediaInfo.f26261h = AbstractC2774a.c(jSONObject, "contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            C2281m c2281m = new C2281m(jSONObject2.getInt("metadataType"));
            mediaInfo.f26262i = c2281m;
            c2281m.P(jSONObject2);
        }
        mediaInfo.f26263j = -1L;
        if (mediaInfo.f26260g != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double dOptDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(dOptDouble) && !Double.isInfinite(dOptDouble) && dOptDouble >= 0.0d) {
                mediaInfo.f26263j = AbstractC2774a.d(dOptDouble);
            }
        }
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                Parcelable.Creator<MediaTrack> creator = MediaTrack.CREATOR;
                long j9 = jSONObject3.getLong("trackId");
                String strOptString2 = jSONObject3.optString("type");
                int i11 = "TEXT".equals(strOptString2) ? 1 : "AUDIO".equals(strOptString2) ? 2 : "VIDEO".equals(strOptString2) ? 3 : 0;
                String strC = AbstractC2774a.c(jSONObject3, "trackContentId");
                String strC2 = AbstractC2774a.c(jSONObject3, "trackContentType");
                String strC3 = AbstractC2774a.c(jSONObject3, "name");
                String strC4 = AbstractC2774a.c(jSONObject3, IjkMediaMeta.IJKM_KEY_LANGUAGE);
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    i9 = "SUBTITLES".equals(string) ? 1 : "CAPTIONS".equals(string) ? 2 : "DESCRIPTIONS".equals(string) ? 3 : "CHAPTERS".equals(string) ? 4 : "METADATA".equals(string) ? 5 : -1;
                } else {
                    i9 = 0;
                }
                if (jSONObject3.has("roles")) {
                    zzfe zzfeVar = new zzfe();
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                        zzfeVar.zzb(jSONArray2.optString(i12));
                    }
                    zzfhVarZzc = zzfeVar.zzc();
                } else {
                    zzfhVarZzc = null;
                }
                arrayList.add(new MediaTrack(j9, i11, strC, strC2, strC3, strC4, i9, zzfhVarZzc, jSONObject3.optJSONObject("customData")));
            }
            mediaInfo.f26264k = new ArrayList(arrayList);
        } else {
            mediaInfo.f26264k = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            C2287t c2287t = new C2287t();
            c2287t.c(jSONObject4);
            mediaInfo.f26265l = c2287t;
        } else {
            mediaInfo.f26265l = null;
        }
        X(jSONObject);
        mediaInfo.f26276w = jSONObject.optJSONObject("customData");
        mediaInfo.f26269p = AbstractC2774a.c(jSONObject, "entity");
        mediaInfo.f26272s = AbstractC2774a.c(jSONObject, "atvEntity");
        mediaInfo.f26270q = C2288u.c(jSONObject.optJSONObject("vmapAdsRequest"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double dOptDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(dOptDouble2) && !Double.isInfinite(dOptDouble2) && dOptDouble2 >= 0.0d) {
                mediaInfo.f26271r = AbstractC2774a.d(dOptDouble2);
            }
        }
        if (jSONObject.has("contentUrl")) {
            mediaInfo.f26273t = jSONObject.optString("contentUrl");
        }
        mediaInfo.f26274u = AbstractC2774a.c(jSONObject, "hlsSegmentFormat");
        mediaInfo.f26275v = AbstractC2774a.c(jSONObject, "hlsVideoSegmentFormat");
    }

    public List H() {
        List list = this.f26268o;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public List I() {
        List list = this.f26267n;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String J() {
        String str = this.f26259f;
        return str == null ? "" : str;
    }

    public String K() {
        return this.f26261h;
    }

    public String L() {
        return this.f26273t;
    }

    public String M() {
        return this.f26269p;
    }

    public String N() {
        return this.f26274u;
    }

    public String O() {
        return this.f26275v;
    }

    public List P() {
        return this.f26264k;
    }

    public C2281m Q() {
        return this.f26262i;
    }

    public long R() {
        return this.f26271r;
    }

    public long S() {
        return this.f26263j;
    }

    public int T() {
        return this.f26260g;
    }

    public C2287t U() {
        return this.f26265l;
    }

    public C2288u V() {
        return this.f26270q;
    }

    public final JSONObject W() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.f26259f);
            jSONObject.putOpt("contentUrl", this.f26273t);
            int i9 = this.f26260g;
            jSONObject.put("streamType", i9 != 1 ? i9 != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.f26261h;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            C2281m c2281m = this.f26262i;
            if (c2281m != null) {
                jSONObject.put("metadata", c2281m.O());
            }
            long j9 = this.f26263j;
            if (j9 <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", AbstractC2774a.b(j9));
            }
            if (this.f26264k != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f26264k.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaTrack) it.next()).P());
                }
                jSONObject.put("tracks", jSONArray);
            }
            C2287t c2287t = this.f26265l;
            if (c2287t != null) {
                jSONObject.put("textTrackStyle", c2287t.S());
            }
            JSONObject jSONObject2 = this.f26276w;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str2 = this.f26269p;
            if (str2 != null) {
                jSONObject.put("entity", str2);
            }
            if (this.f26267n != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.f26267n.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((C2262b) it2.next()).O());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.f26268o != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = this.f26268o.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((C2260a) it3.next()).S());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            C2288u c2288u = this.f26270q;
            if (c2288u != null) {
                jSONObject.put("vmapAdsRequest", c2288u.J());
            }
            long j10 = this.f26271r;
            if (j10 != -1) {
                jSONObject.put("startAbsoluteTime", AbstractC2774a.b(j10));
            }
            jSONObject.putOpt("atvEntity", this.f26272s);
            String str3 = this.f26274u;
            if (str3 != null) {
                jSONObject.put("hlsSegmentFormat", str3);
            }
            String str4 = this.f26275v;
            if (str4 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa A[LOOP:0: B:5:0x0022->B:27:0x00aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188 A[LOOP:2: B:33:0x00d0->B:62:0x0188, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(org.json.JSONObject r40) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.X(org.json.JSONObject):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.f26276w;
        boolean z9 = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.f26276w;
        if (z9 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || l.a(jSONObject, jSONObject2)) && AbstractC2774a.k(this.f26259f, mediaInfo.f26259f) && this.f26260g == mediaInfo.f26260g && AbstractC2774a.k(this.f26261h, mediaInfo.f26261h) && AbstractC2774a.k(this.f26262i, mediaInfo.f26262i) && this.f26263j == mediaInfo.f26263j && AbstractC2774a.k(this.f26264k, mediaInfo.f26264k) && AbstractC2774a.k(this.f26265l, mediaInfo.f26265l) && AbstractC2774a.k(this.f26267n, mediaInfo.f26267n) && AbstractC2774a.k(this.f26268o, mediaInfo.f26268o) && AbstractC2774a.k(this.f26269p, mediaInfo.f26269p) && AbstractC2774a.k(this.f26270q, mediaInfo.f26270q) && this.f26271r == mediaInfo.f26271r && AbstractC2774a.k(this.f26272s, mediaInfo.f26272s) && AbstractC2774a.k(this.f26273t, mediaInfo.f26273t) && AbstractC2774a.k(this.f26274u, mediaInfo.f26274u) && AbstractC2774a.k(this.f26275v, mediaInfo.f26275v);
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f26259f, Integer.valueOf(this.f26260g), this.f26261h, this.f26262i, Long.valueOf(this.f26263j), String.valueOf(this.f26276w), this.f26264k, this.f26265l, this.f26267n, this.f26268o, this.f26269p, this.f26270q, Long.valueOf(this.f26271r), this.f26272s, this.f26274u, this.f26275v);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        JSONObject jSONObject = this.f26276w;
        this.f26266m = jSONObject == null ? null : jSONObject.toString();
        int iA = c.a(parcel);
        c.t(parcel, 2, J(), false);
        c.l(parcel, 3, T());
        c.t(parcel, 4, K(), false);
        c.r(parcel, 5, Q(), i9, false);
        c.o(parcel, 6, S());
        c.x(parcel, 7, P(), false);
        c.r(parcel, 8, U(), i9, false);
        c.t(parcel, 9, this.f26266m, false);
        c.x(parcel, 10, I(), false);
        c.x(parcel, 11, H(), false);
        c.t(parcel, 12, M(), false);
        c.r(parcel, 13, V(), i9, false);
        c.o(parcel, 14, R());
        c.t(parcel, 15, this.f26272s, false);
        c.t(parcel, 16, L(), false);
        c.t(parcel, 17, N(), false);
        c.t(parcel, 18, O(), false);
        c.b(parcel, iA);
    }
}
