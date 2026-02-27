package com.google.android.gms.cast;

import C4.l;
import C4.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1418q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;
import java.util.Locale;
import n4.t0;
import org.json.JSONObject;
import t4.AbstractC2774a;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaTrack extends AbstractC2985a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new t0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f26297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f26299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f26300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f26301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f26302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f26303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final JSONObject f26304o;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f26305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f26307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f26308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f26309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f26310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f26311g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f26312h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public JSONObject f26313i;

        public a(long j9, int i9) {
            this.f26305a = j9;
            this.f26306b = i9;
        }

        public MediaTrack a() {
            return new MediaTrack(this.f26305a, this.f26306b, this.f26307c, this.f26308d, this.f26309e, this.f26310f, this.f26311g, this.f26312h, this.f26313i);
        }

        public a b(String str) {
            this.f26307c = str;
            return this;
        }

        public a c(String str) {
            this.f26309e = str;
            return this;
        }

        public a d(int i9) {
            if (i9 < -1 || i9 > 5) {
                throw new IllegalArgumentException("invalid subtype " + i9);
            }
            if (i9 != 0 && this.f26306b != 1) {
                throw new IllegalArgumentException("subtypes are only valid for text tracks");
            }
            this.f26311g = i9;
            return this;
        }
    }

    public MediaTrack(long j9, int i9, String str, String str2, String str3, String str4, int i10, List list, JSONObject jSONObject) {
        this.f26295f = j9;
        this.f26296g = i9;
        this.f26297h = str;
        this.f26298i = str2;
        this.f26299j = str3;
        this.f26300k = str4;
        this.f26301l = i10;
        this.f26302m = list;
        this.f26304o = jSONObject;
    }

    public String H() {
        return this.f26297h;
    }

    public String I() {
        return this.f26298i;
    }

    public long J() {
        return this.f26295f;
    }

    public String K() {
        return this.f26300k;
    }

    public Locale L() {
        if (TextUtils.isEmpty(this.f26300k)) {
            return null;
        }
        if (m.f()) {
            return Locale.forLanguageTag(this.f26300k);
        }
        String[] strArrSplit = this.f26300k.split("-", -1);
        return strArrSplit.length == 1 ? new Locale(strArrSplit[0]) : new Locale(strArrSplit[0], strArrSplit[1]);
    }

    public List M() {
        return this.f26302m;
    }

    public int N() {
        return this.f26301l;
    }

    public int O() {
        return this.f26296g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:10:0x001c, B:13:0x0026, B:15:0x002a, B:16:0x002f, B:18:0x0033, B:19:0x0038, B:21:0x003c, B:22:0x0041, B:24:0x0049, B:25:0x0050, B:36:0x0063, B:41:0x0073, B:43:0x0077, B:44:0x0083, B:46:0x0087), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033 A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:10:0x001c, B:13:0x0026, B:15:0x002a, B:16:0x002f, B:18:0x0033, B:19:0x0038, B:21:0x003c, B:22:0x0041, B:24:0x0049, B:25:0x0050, B:36:0x0063, B:41:0x0073, B:43:0x0077, B:44:0x0083, B:46:0x0087), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:10:0x001c, B:13:0x0026, B:15:0x002a, B:16:0x002f, B:18:0x0033, B:19:0x0038, B:21:0x003c, B:22:0x0041, B:24:0x0049, B:25:0x0050, B:36:0x0063, B:41:0x0073, B:43:0x0077, B:44:0x0083, B:46:0x0087), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:10:0x001c, B:13:0x0026, B:15:0x002a, B:16:0x002f, B:18:0x0033, B:19:0x0038, B:21:0x003c, B:22:0x0041, B:24:0x0049, B:25:0x0050, B:36:0x0063, B:41:0x0073, B:43:0x0077, B:44:0x0083, B:46:0x0087), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077 A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:10:0x001c, B:13:0x0026, B:15:0x002a, B:16:0x002f, B:18:0x0033, B:19:0x0038, B:21:0x003c, B:22:0x0041, B:24:0x0049, B:25:0x0050, B:36:0x0063, B:41:0x0073, B:43:0x0077, B:44:0x0083, B:46:0x0087), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087 A[Catch: JSONException -> 0x008c, TRY_LEAVE, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:10:0x001c, B:13:0x0026, B:15:0x002a, B:16:0x002f, B:18:0x0033, B:19:0x0038, B:21:0x003c, B:22:0x0041, B:24:0x0049, B:25:0x0050, B:36:0x0063, B:41:0x0073, B:43:0x0077, B:44:0x0083, B:46:0x0087), top: B:49:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject P() {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "trackId"
            long r2 = r6.f26295f     // Catch: org.json.JSONException -> L8c
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8c
            int r1 = r6.f26296g     // Catch: org.json.JSONException -> L8c
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = "type"
            if (r1 == r4) goto L23
            if (r1 == r3) goto L20
            if (r1 == r2) goto L1a
            goto L26
        L1a:
            java.lang.String r1 = "VIDEO"
        L1c:
            r0.put(r5, r1)     // Catch: org.json.JSONException -> L8c
            goto L26
        L20:
            java.lang.String r1 = "AUDIO"
            goto L1c
        L23:
            java.lang.String r1 = "TEXT"
            goto L1c
        L26:
            java.lang.String r1 = r6.f26297h     // Catch: org.json.JSONException -> L8c
            if (r1 == 0) goto L2f
            java.lang.String r5 = "trackContentId"
            r0.put(r5, r1)     // Catch: org.json.JSONException -> L8c
        L2f:
            java.lang.String r1 = r6.f26298i     // Catch: org.json.JSONException -> L8c
            if (r1 == 0) goto L38
            java.lang.String r5 = "trackContentType"
            r0.put(r5, r1)     // Catch: org.json.JSONException -> L8c
        L38:
            java.lang.String r1 = r6.f26299j     // Catch: org.json.JSONException -> L8c
            if (r1 == 0) goto L41
            java.lang.String r5 = "name"
            r0.put(r5, r1)     // Catch: org.json.JSONException -> L8c
        L41:
            java.lang.String r1 = r6.f26300k     // Catch: org.json.JSONException -> L8c
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L8c
            if (r1 != 0) goto L50
            java.lang.String r1 = "language"
            java.lang.String r5 = r6.f26300k     // Catch: org.json.JSONException -> L8c
            r0.put(r1, r5)     // Catch: org.json.JSONException -> L8c
        L50:
            int r1 = r6.f26301l     // Catch: org.json.JSONException -> L8c
            java.lang.String r5 = "subtype"
            if (r1 == r4) goto L70
            if (r1 == r3) goto L6d
            if (r1 == r2) goto L6a
            r2 = 4
            if (r1 == r2) goto L67
            r2 = 5
            if (r1 == r2) goto L61
            goto L73
        L61:
            java.lang.String r1 = "METADATA"
        L63:
            r0.put(r5, r1)     // Catch: org.json.JSONException -> L8c
            goto L73
        L67:
            java.lang.String r1 = "CHAPTERS"
            goto L63
        L6a:
            java.lang.String r1 = "DESCRIPTIONS"
            goto L63
        L6d:
            java.lang.String r1 = "CAPTIONS"
            goto L63
        L70:
            java.lang.String r1 = "SUBTITLES"
            goto L63
        L73:
            java.util.List r1 = r6.f26302m     // Catch: org.json.JSONException -> L8c
            if (r1 == 0) goto L83
            java.lang.String r1 = "roles"
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L8c
            java.util.List r3 = r6.f26302m     // Catch: org.json.JSONException -> L8c
            r2.<init>(r3)     // Catch: org.json.JSONException -> L8c
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8c
        L83:
            org.json.JSONObject r1 = r6.f26304o     // Catch: org.json.JSONException -> L8c
            if (r1 == 0) goto L8c
            java.lang.String r2 = "customData"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L8c
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaTrack.P():org.json.JSONObject");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.f26304o;
        boolean z9 = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.f26304o;
        if (z9 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || l.a(jSONObject, jSONObject2)) && this.f26295f == mediaTrack.f26295f && this.f26296g == mediaTrack.f26296g && AbstractC2774a.k(this.f26297h, mediaTrack.f26297h) && AbstractC2774a.k(this.f26298i, mediaTrack.f26298i) && AbstractC2774a.k(this.f26299j, mediaTrack.f26299j) && AbstractC2774a.k(this.f26300k, mediaTrack.f26300k) && this.f26301l == mediaTrack.f26301l && AbstractC2774a.k(this.f26302m, mediaTrack.f26302m);
    }

    public String getName() {
        return this.f26299j;
    }

    public int hashCode() {
        return AbstractC1418q.c(Long.valueOf(this.f26295f), Integer.valueOf(this.f26296g), this.f26297h, this.f26298i, this.f26299j, this.f26300k, Integer.valueOf(this.f26301l), this.f26302m, String.valueOf(this.f26304o));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        JSONObject jSONObject = this.f26304o;
        this.f26303n = jSONObject == null ? null : jSONObject.toString();
        int iA = c.a(parcel);
        c.o(parcel, 2, J());
        c.l(parcel, 3, O());
        c.t(parcel, 4, H(), false);
        c.t(parcel, 5, I(), false);
        c.t(parcel, 6, getName(), false);
        c.t(parcel, 7, K(), false);
        c.l(parcel, 8, N());
        c.v(parcel, 9, M(), false);
        c.t(parcel, 10, this.f26303n, false);
        c.b(parcel, iA);
    }
}
