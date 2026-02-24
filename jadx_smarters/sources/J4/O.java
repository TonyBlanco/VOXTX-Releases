package J4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class O implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        long jW = -1;
        long jW2 = -1;
        int iU = 1;
        int iU2 = 1;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                iU = y4.b.u(parcel, iS);
            } else if (iL == 2) {
                iU2 = y4.b.u(parcel, iS);
            } else if (iL == 3) {
                jW = y4.b.w(parcel, iS);
            } else if (iL != 4) {
                y4.b.A(parcel, iS);
            } else {
                jW2 = y4.b.w(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new N(iU, iU2, jW, jW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new N[i9];
    }
}
