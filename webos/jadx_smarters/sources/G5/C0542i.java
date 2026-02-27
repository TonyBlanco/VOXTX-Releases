package G5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;

/* JADX INFO: renamed from: G5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0542i extends AbstractC0540g {
    public static final Parcelable.Creator<C0542i> CREATOR = new h0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2236f;

    public C0542i(String str) {
        this.f2236f = com.google.android.gms.common.internal.r.g(str);
    }

    public static zzagt K(C0542i c0542i, String str) {
        com.google.android.gms.common.internal.r.m(c0542i);
        return new zzagt(null, c0542i.f2236f, c0542i.H(), null, null, null, str, null, null);
    }

    @Override // G5.AbstractC0540g
    public String H() {
        return "facebook.com";
    }

    @Override // G5.AbstractC0540g
    public String I() {
        return "facebook.com";
    }

    @Override // G5.AbstractC0540g
    public final AbstractC0540g J() {
        return new C0542i(this.f2236f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, this.f2236f, false);
        y4.c.b(parcel, iA);
    }
}
