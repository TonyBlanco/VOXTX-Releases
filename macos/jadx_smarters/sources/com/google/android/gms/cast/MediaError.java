package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import n4.C2265c0;
import org.json.JSONObject;
import t4.AbstractC2774a;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
public class MediaError extends AbstractC2985a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new C2265c0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f26254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f26255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final JSONObject f26257k;

    public MediaError(String str, long j9, Integer num, String str2, JSONObject jSONObject) {
        this.f26252f = str;
        this.f26253g = j9;
        this.f26254h = num;
        this.f26255i = str2;
        this.f26257k = jSONObject;
    }

    public static MediaError L(JSONObject jSONObject) {
        return new MediaError(jSONObject.optString("type", "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, AbstractC2774a.c(jSONObject, "reason"), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    public Integer H() {
        return this.f26254h;
    }

    public String I() {
        return this.f26255i;
    }

    public long J() {
        return this.f26253g;
    }

    public String K() {
        return this.f26252f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        JSONObject jSONObject = this.f26257k;
        this.f26256j = jSONObject == null ? null : jSONObject.toString();
        int iA = c.a(parcel);
        c.t(parcel, 2, K(), false);
        c.o(parcel, 3, J());
        c.n(parcel, 4, H(), false);
        c.t(parcel, 5, I(), false);
        c.t(parcel, 6, this.f26256j, false);
        c.b(parcel, iA);
    }
}
