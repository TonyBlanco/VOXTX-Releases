package G5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;

/* JADX INFO: renamed from: G5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0556x extends AbstractC0540g {
    public static final Parcelable.Creator<C0556x> CREATOR = new U();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2249f;

    public C0556x(String str) {
        this.f2249f = com.google.android.gms.common.internal.r.g(str);
    }

    public static zzagt K(C0556x c0556x, String str) {
        com.google.android.gms.common.internal.r.m(c0556x);
        return new zzagt(null, c0556x.f2249f, c0556x.H(), null, null, null, str, null, null);
    }

    @Override // G5.AbstractC0540g
    public String H() {
        return "github.com";
    }

    @Override // G5.AbstractC0540g
    public String I() {
        return "github.com";
    }

    @Override // G5.AbstractC0540g
    public final AbstractC0540g J() {
        return new C0556x(this.f2249f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, this.f2249f, false);
        y4.c.b(parcel, iA);
    }
}
