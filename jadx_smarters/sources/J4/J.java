package J4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = "";
        String strF2 = "";
        String strF3 = strF2;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                strF2 = y4.b.f(parcel, iS);
            } else if (iL == 2) {
                strF3 = y4.b.f(parcel, iS);
            } else if (iL != 5) {
                y4.b.A(parcel, iS);
            } else {
                strF = y4.b.f(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new I(strF, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new I[i9];
    }
}
