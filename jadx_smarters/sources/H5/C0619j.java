package H5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: H5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0619j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        ArrayList arrayListJ = null;
        ArrayList arrayListJ2 = null;
        C0611b c0611b = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                strF = y4.b.f(parcel, iS);
            } else if (iL == 2) {
                strF2 = y4.b.f(parcel, iS);
            } else if (iL == 3) {
                arrayListJ = y4.b.j(parcel, iS, G5.J.CREATOR);
            } else if (iL == 4) {
                arrayListJ2 = y4.b.j(parcel, iS, G5.M.CREATOR);
            } else if (iL != 5) {
                y4.b.A(parcel, iS);
            } else {
                c0611b = (C0611b) y4.b.e(parcel, iS, C0611b.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new C0620k(strF, strF2, arrayListJ, arrayListJ2, c0611b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C0620k[i9];
    }
}
