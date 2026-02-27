package G5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;

/* JADX INFO: renamed from: G5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0557y extends AbstractC0540g {
    public static final Parcelable.Creator<C0557y> CREATOR = new V();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2251g;

    public C0557y(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f2250f = str;
        this.f2251g = str2;
    }

    public static zzagt K(C0557y c0557y, String str) {
        com.google.android.gms.common.internal.r.m(c0557y);
        return new zzagt(c0557y.f2250f, c0557y.f2251g, c0557y.H(), null, null, null, str, null, null);
    }

    @Override // G5.AbstractC0540g
    public String H() {
        return "google.com";
    }

    @Override // G5.AbstractC0540g
    public String I() {
        return "google.com";
    }

    @Override // G5.AbstractC0540g
    public final AbstractC0540g J() {
        return new C0557y(this.f2250f, this.f2251g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, this.f2250f, false);
        y4.c.t(parcel, 2, this.f2251g, false);
        y4.c.b(parcel, iA);
    }
}
