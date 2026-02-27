package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import org.json.JSONObject;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2286s extends AbstractC2985a {
    public static final Parcelable.Creator<C2286s> CREATOR = new v0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2280l f45517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f45519h;

    /* JADX INFO: renamed from: n4.s$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C2280l f45520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f45521b;

        public C2286s a() {
            return new C2286s(this.f45520a, this.f45521b);
        }

        public a b(C2280l c2280l) {
            this.f45520a = c2280l;
            return this;
        }
    }

    public C2286s(C2280l c2280l, JSONObject jSONObject) {
        this.f45517f = c2280l;
        this.f45519h = jSONObject;
    }

    public C2280l H() {
        return this.f45517f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2286s)) {
            return false;
        }
        C2286s c2286s = (C2286s) obj;
        if (C4.l.a(this.f45519h, c2286s.f45519h)) {
            return AbstractC1418q.b(this.f45517f, c2286s.f45517f);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f45517f, String.valueOf(this.f45519h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        JSONObject jSONObject = this.f45519h;
        this.f45518g = jSONObject == null ? null : jSONObject.toString();
        int iA = y4.c.a(parcel);
        y4.c.r(parcel, 2, H(), i9, false);
        y4.c.t(parcel, 3, this.f45518g, false);
        y4.c.b(parcel, iA);
    }
}
