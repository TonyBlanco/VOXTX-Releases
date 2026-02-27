package w4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        long jW = -1;
        int iU = 0;
        String strF = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                strF = y4.b.f(parcel, iS);
            } else if (iL == 2) {
                iU = y4.b.u(parcel, iS);
            } else if (iL != 3) {
                y4.b.A(parcel, iS);
            } else {
                jW = y4.b.w(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C2916d(strF, iU, jW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2916d[i9];
    }
}
