package J4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        int iU4 = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                iU = y4.b.u(parcel, iS);
            } else if (iL == 2) {
                iU2 = y4.b.u(parcel, iS);
            } else if (iL == 3) {
                iU3 = y4.b.u(parcel, iS);
            } else if (iL != 4) {
                y4.b.A(parcel, iS);
            } else {
                iU4 = y4.b.u(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new T(iU, iU2, iU3, iU4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new T[i9];
    }
}
