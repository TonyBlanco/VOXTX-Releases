package n4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.Collections;
import java.util.List;
import t4.AbstractC2774a;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2266d extends AbstractC2985a {
    public static final Parcelable.Creator<C2266d> CREATOR = new u0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f45375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f45376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Uri f45377j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f45378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f45379l;

    public C2266d(String str, String str2, List list, List list2, String str3, Uri uri, String str4, String str5) {
        this.f45373f = str;
        this.f45374g = str2;
        this.f45375h = list2;
        this.f45376i = str3;
        this.f45377j = uri;
        this.f45378k = str4;
        this.f45379l = str5;
    }

    public String H() {
        return this.f45373f;
    }

    public String I() {
        return this.f45378k;
    }

    public List J() {
        return null;
    }

    public String K() {
        return this.f45376i;
    }

    public List L() {
        return Collections.unmodifiableList(this.f45375h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2266d)) {
            return false;
        }
        C2266d c2266d = (C2266d) obj;
        return AbstractC2774a.k(this.f45373f, c2266d.f45373f) && AbstractC2774a.k(this.f45374g, c2266d.f45374g) && AbstractC2774a.k(this.f45375h, c2266d.f45375h) && AbstractC2774a.k(this.f45376i, c2266d.f45376i) && AbstractC2774a.k(this.f45377j, c2266d.f45377j) && AbstractC2774a.k(this.f45378k, c2266d.f45378k) && AbstractC2774a.k(this.f45379l, c2266d.f45379l);
    }

    public String getName() {
        return this.f45374g;
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f45373f, this.f45374g, this.f45375h, this.f45376i, this.f45377j, this.f45378k);
    }

    public String toString() {
        String str = this.f45373f;
        String str2 = this.f45374g;
        List list = this.f45375h;
        return "applicationId: " + str + ", name: " + str2 + ", namespaces.count: " + (list == null ? 0 : list.size()) + ", senderAppIdentifier: " + this.f45376i + ", senderAppLaunchUrl: " + String.valueOf(this.f45377j) + ", iconUrl: " + this.f45378k + ", type: " + this.f45379l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 2, H(), false);
        y4.c.t(parcel, 3, getName(), false);
        y4.c.x(parcel, 4, J(), false);
        y4.c.v(parcel, 5, L(), false);
        y4.c.t(parcel, 6, K(), false);
        y4.c.r(parcel, 7, this.f45377j, i9, false);
        y4.c.t(parcel, 8, I(), false);
        y4.c.t(parcel, 9, this.f45379l, false);
        y4.c.b(parcel, iA);
    }
}
