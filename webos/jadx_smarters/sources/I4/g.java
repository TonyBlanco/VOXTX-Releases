package i4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        int iU = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                strF = y4.b.f(parcel, iS);
            } else if (iL != 2) {
                y4.b.A(parcel, iS);
            } else {
                iU = y4.b.u(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C1890f(strF, iU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C1890f[i9];
    }
}
