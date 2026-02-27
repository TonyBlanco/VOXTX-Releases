package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        long jW = 0;
        N[] nArr = null;
        int iU = 1000;
        int iU2 = 1;
        int iU3 = 1;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                iU2 = y4.b.u(parcel, iS);
            } else if (iL == 2) {
                iU3 = y4.b.u(parcel, iS);
            } else if (iL == 3) {
                jW = y4.b.w(parcel, iS);
            } else if (iL == 4) {
                iU = y4.b.u(parcel, iS);
            } else if (iL != 5) {
                y4.b.A(parcel, iS);
            } else {
                nArr = (N[]) y4.b.i(parcel, iS, N.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new LocationAvailability(iU, iU2, iU3, jW, nArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new LocationAvailability[i9];
    }
}
