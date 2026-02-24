package G5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;

/* JADX INFO: loaded from: classes3.dex */
public class K extends AbstractC0540g {
    public static final Parcelable.Creator<K> CREATOR = new Y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2189f;

    public K(String str) {
        this.f2189f = com.google.android.gms.common.internal.r.g(str);
    }

    public static zzagt K(K k9, String str) {
        com.google.android.gms.common.internal.r.m(k9);
        return new zzagt(null, null, k9.H(), null, null, k9.f2189f, str, null, null);
    }

    @Override // G5.AbstractC0540g
    public String H() {
        return "playgames.google.com";
    }

    @Override // G5.AbstractC0540g
    public String I() {
        return "playgames.google.com";
    }

    @Override // G5.AbstractC0540g
    public final AbstractC0540g J() {
        return new K(this.f2189f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, this.f2189f, false);
        y4.c.b(parcel, iA);
    }
}
