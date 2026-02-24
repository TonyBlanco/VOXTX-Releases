package G5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 2) {
                strF = y4.b.f(parcel, iS);
            } else if (iL == 3) {
                strF2 = y4.b.f(parcel, iS);
            } else if (iL == 4) {
                zM = y4.b.m(parcel, iS);
            } else if (iL != 5) {
                y4.b.A(parcel, iS);
            } else {
                zM2 = y4.b.m(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new P(strF, strF2, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new P[i9];
    }
}
