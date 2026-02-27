package x4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: renamed from: x4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2957a extends AbstractC2985a {
    public static final Parcelable.Creator<C2957a> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f51952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f51953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f51954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f51955i;

    public C2957a(int i9, Uri uri, int i10, int i11) {
        this.f51952f = i9;
        this.f51953g = uri;
        this.f51954h = i10;
        this.f51955i = i11;
    }

    public C2957a(Uri uri) {
        this(uri, 0, 0);
    }

    public C2957a(Uri uri, int i9, int i10) {
        this(1, uri, i9, i10);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i9 < 0 || i10 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2957a(JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        this(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    public Uri H() {
        return this.f51953g;
    }

    public JSONObject I() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f51953g.toString());
            jSONObject.put("width", this.f51954h);
            jSONObject.put("height", this.f51955i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C2957a)) {
            C2957a c2957a = (C2957a) obj;
            if (AbstractC1418q.b(this.f51953g, c2957a.f51953g) && this.f51954h == c2957a.f51954h && this.f51955i == c2957a.f51955i) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f51955i;
    }

    public int getWidth() {
        return this.f51954h;
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f51953g, Integer.valueOf(this.f51954h), Integer.valueOf(this.f51955i));
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f51954h), Integer.valueOf(this.f51955i), this.f51953g.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int i10 = this.f51952f;
        int iA = c.a(parcel);
        c.l(parcel, 1, i10);
        c.r(parcel, 2, H(), i9, false);
        c.l(parcel, 3, getWidth());
        c.l(parcel, 4, getHeight());
        c.b(parcel, iA);
    }
}
