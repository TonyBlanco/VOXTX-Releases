package G5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class W implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        boolean zM = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                strF = y4.b.f(parcel, iS);
            } else if (iL == 2) {
                strF2 = y4.b.f(parcel, iS);
            } else if (iL == 4) {
                strF3 = y4.b.f(parcel, iS);
            } else if (iL == 5) {
                zM = y4.b.m(parcel, iS);
            } else if (iL != 6) {
                y4.b.A(parcel, iS);
            } else {
                strF4 = y4.b.f(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new F(strF, strF2, strF3, zM, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new F[i9];
    }
}
