package J4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class S implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        ArrayList arrayListJ = null;
        int iU = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                arrayListJ = y4.b.j(parcel, iS, T.CREATOR);
            } else if (iL != 2) {
                y4.b.A(parcel, iS);
            } else {
                iU = y4.b.u(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C0658q(arrayListJ, iU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new C0658q[i9];
    }
}
