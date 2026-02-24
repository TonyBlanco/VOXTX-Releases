package G5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;

/* JADX INFO: loaded from: classes3.dex */
public class N extends AbstractC0540g {
    public static final Parcelable.Creator<N> CREATOR = new a0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2195g;

    public N(String str, String str2) {
        this.f2194f = com.google.android.gms.common.internal.r.g(str);
        this.f2195g = com.google.android.gms.common.internal.r.g(str2);
    }

    public static zzagt K(N n9, String str) {
        com.google.android.gms.common.internal.r.m(n9);
        return new zzagt(null, n9.f2194f, n9.H(), null, n9.f2195g, null, str, null, null);
    }

    @Override // G5.AbstractC0540g
    public String H() {
        return "twitter.com";
    }

    @Override // G5.AbstractC0540g
    public String I() {
        return "twitter.com";
    }

    @Override // G5.AbstractC0540g
    public final AbstractC0540g J() {
        return new N(this.f2194f, this.f2195g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, this.f2194f, false);
        y4.c.t(parcel, 2, this.f2195g, false);
        y4.c.b(parcel, iA);
    }
}
