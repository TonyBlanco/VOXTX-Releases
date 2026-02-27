package n4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import x4.C2957a;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        double dO = 0.0d;
        String strF = null;
        ArrayList arrayListJ = null;
        ArrayList arrayListJ2 = null;
        int iU = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 2) {
                iU = y4.b.u(parcel, iS);
            } else if (iL == 3) {
                strF = y4.b.f(parcel, iS);
            } else if (iL == 4) {
                arrayListJ = y4.b.j(parcel, iS, C2281m.CREATOR);
            } else if (iL == 5) {
                arrayListJ2 = y4.b.j(parcel, iS, C2957a.CREATOR);
            } else if (iL != 6) {
                y4.b.A(parcel, iS);
            } else {
                dO = y4.b.o(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C2282n(iU, strF, arrayListJ, arrayListJ2, dO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2282n[i9];
    }
}
