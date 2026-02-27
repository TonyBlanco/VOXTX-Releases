package n4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: n4.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2263b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        C2274h c2274h = null;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 2) {
                zM = y4.b.m(parcel, iS);
            } else if (iL == 3) {
                strF = y4.b.f(parcel, iS);
            } else if (iL == 4) {
                zM2 = y4.b.m(parcel, iS);
            } else if (iL != 5) {
                y4.b.A(parcel, iS);
            } else {
                c2274h = (C2274h) y4.b.e(parcel, iS, C2274h.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new C2276i(zM, strF, zM2, c2274h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2276i[i9];
    }
}
