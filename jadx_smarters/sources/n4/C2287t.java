package n4;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.gms.common.internal.AbstractC1418q;
import org.json.JSONException;
import org.json.JSONObject;
import t4.AbstractC2774a;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2287t extends AbstractC2985a {
    public static final Parcelable.Creator<C2287t> CREATOR = new w0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f45522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f45530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f45531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f45532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f45533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public JSONObject f45534r;

    public C2287t() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    public C2287t(float f9, int i9, int i10, int i11, int i12, int i13, int i14, int i15, String str, int i16, int i17, String str2) {
        this.f45522f = f9;
        this.f45523g = i9;
        this.f45524h = i10;
        this.f45525i = i11;
        this.f45526j = i12;
        this.f45527k = i13;
        this.f45528l = i14;
        this.f45529m = i15;
        this.f45530n = str;
        this.f45531o = i16;
        this.f45532p = i17;
        this.f45533q = str2;
        if (str2 == null) {
            this.f45534r = null;
            return;
        }
        try {
            this.f45534r = new JSONObject(this.f45533q);
        } catch (JSONException unused) {
            this.f45534r = null;
            this.f45533q = null;
        }
    }

    public static final int T(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final String U(int i9) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i9)), Integer.valueOf(Color.green(i9)), Integer.valueOf(Color.blue(i9)), Integer.valueOf(Color.alpha(i9)));
    }

    public int H() {
        return this.f45524h;
    }

    public int I() {
        return this.f45526j;
    }

    public int J() {
        return this.f45525i;
    }

    public String K() {
        return this.f45530n;
    }

    public int L() {
        return this.f45531o;
    }

    public float M() {
        return this.f45522f;
    }

    public int N() {
        return this.f45532p;
    }

    public int O() {
        return this.f45523g;
    }

    public int P() {
        return this.f45528l;
    }

    public int Q() {
        return this.f45529m;
    }

    public int R() {
        return this.f45527k;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf A[Catch: JSONException -> 0x00db, TryCatch #0 {JSONException -> 0x00db, blocks: (B:3:0x0005, B:5:0x0011, B:6:0x001a, B:8:0x001e, B:9:0x0027, B:19:0x003e, B:24:0x004e, B:26:0x0052, B:27:0x005b, B:33:0x0068, B:36:0x0075, B:38:0x0079, B:39:0x0082, B:41:0x0086, B:42:0x008d, B:44:0x0091, B:45:0x0096, B:50:0x00a0, B:57:0x00b6, B:65:0x00c5, B:69:0x00d2, B:71:0x00d6, B:68:0x00cf, B:34:0x006e, B:35:0x0072, B:23:0x004b), top: B:74:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6 A[Catch: JSONException -> 0x00db, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00db, blocks: (B:3:0x0005, B:5:0x0011, B:6:0x001a, B:8:0x001e, B:9:0x0027, B:19:0x003e, B:24:0x004e, B:26:0x0052, B:27:0x005b, B:33:0x0068, B:36:0x0075, B:38:0x0079, B:39:0x0082, B:41:0x0086, B:42:0x008d, B:44:0x0091, B:45:0x0096, B:50:0x00a0, B:57:0x00b6, B:65:0x00c5, B:69:0x00d2, B:71:0x00d6, B:68:0x00cf, B:34:0x006e, B:35:0x0072, B:23:0x004b), top: B:74:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject S() {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.C2287t.S():org.json.JSONObject");
    }

    public void c(JSONObject jSONObject) throws JSONException {
        int i9;
        this.f45522f = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.f45523g = T(jSONObject.optString("foregroundColor"));
        this.f45524h = T(jSONObject.optString("backgroundColor"));
        if (jSONObject.has("edgeType")) {
            String string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.f45525i = 0;
            } else if ("OUTLINE".equals(string)) {
                this.f45525i = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.f45525i = 2;
            } else if ("RAISED".equals(string)) {
                this.f45525i = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.f45525i = 4;
            }
        }
        this.f45526j = T(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            String string2 = jSONObject.getString("windowType");
            if ("NONE".equals(string2)) {
                this.f45527k = 0;
            } else if ("NORMAL".equals(string2)) {
                this.f45527k = 1;
            } else if ("ROUNDED_CORNERS".equals(string2)) {
                this.f45527k = 2;
            }
        }
        this.f45528l = T(jSONObject.optString("windowColor"));
        if (this.f45527k == 2) {
            this.f45529m = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.f45530n = AbstractC2774a.c(jSONObject, CognitoUserPoolsSignInProvider.AttributeKeys.FONT_FAMILY);
        if (jSONObject.has("fontGenericFamily")) {
            String string3 = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string3)) {
                this.f45531o = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                this.f45531o = 1;
            } else if ("SERIF".equals(string3)) {
                this.f45531o = 2;
            } else if ("MONOSPACED_SERIF".equals(string3)) {
                this.f45531o = 3;
            } else if ("CASUAL".equals(string3)) {
                this.f45531o = 4;
            } else {
                if (!"CURSIVE".equals(string3)) {
                    i9 = "SMALL_CAPITALS".equals(string3) ? 6 : 5;
                }
                this.f45531o = i9;
            }
        }
        if (jSONObject.has("fontStyle")) {
            String string4 = jSONObject.getString("fontStyle");
            if ("NORMAL".equals(string4)) {
                this.f45532p = 0;
            } else if ("BOLD".equals(string4)) {
                this.f45532p = 1;
            } else if ("ITALIC".equals(string4)) {
                this.f45532p = 2;
            } else if ("BOLD_ITALIC".equals(string4)) {
                this.f45532p = 3;
            }
        }
        this.f45534r = jSONObject.optJSONObject("customData");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2287t)) {
            return false;
        }
        C2287t c2287t = (C2287t) obj;
        JSONObject jSONObject = this.f45534r;
        boolean z9 = jSONObject == null;
        JSONObject jSONObject2 = c2287t.f45534r;
        if (z9 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C4.l.a(jSONObject, jSONObject2)) && this.f45522f == c2287t.f45522f && this.f45523g == c2287t.f45523g && this.f45524h == c2287t.f45524h && this.f45525i == c2287t.f45525i && this.f45526j == c2287t.f45526j && this.f45527k == c2287t.f45527k && this.f45528l == c2287t.f45528l && this.f45529m == c2287t.f45529m && AbstractC2774a.k(this.f45530n, c2287t.f45530n) && this.f45531o == c2287t.f45531o && this.f45532p == c2287t.f45532p;
    }

    public int hashCode() {
        return AbstractC1418q.c(Float.valueOf(this.f45522f), Integer.valueOf(this.f45523g), Integer.valueOf(this.f45524h), Integer.valueOf(this.f45525i), Integer.valueOf(this.f45526j), Integer.valueOf(this.f45527k), Integer.valueOf(this.f45528l), Integer.valueOf(this.f45529m), this.f45530n, Integer.valueOf(this.f45531o), Integer.valueOf(this.f45532p), String.valueOf(this.f45534r));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        JSONObject jSONObject = this.f45534r;
        this.f45533q = jSONObject == null ? null : jSONObject.toString();
        int iA = y4.c.a(parcel);
        y4.c.i(parcel, 2, M());
        y4.c.l(parcel, 3, O());
        y4.c.l(parcel, 4, H());
        y4.c.l(parcel, 5, J());
        y4.c.l(parcel, 6, I());
        y4.c.l(parcel, 7, R());
        y4.c.l(parcel, 8, P());
        y4.c.l(parcel, 9, Q());
        y4.c.t(parcel, 10, K(), false);
        y4.c.l(parcel, 11, L());
        y4.c.l(parcel, 12, N());
        y4.c.t(parcel, 13, this.f45533q, false);
        y4.c.b(parcel, iA);
    }
}
