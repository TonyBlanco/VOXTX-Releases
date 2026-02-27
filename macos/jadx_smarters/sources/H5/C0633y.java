package H5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: H5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0633y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        ArrayList arrayListJ = null;
        ArrayList arrayListJ2 = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                arrayListJ = y4.b.j(parcel, iS, G5.J.CREATOR);
            } else if (iL != 2) {
                y4.b.A(parcel, iS);
            } else {
                arrayListJ2 = y4.b.j(parcel, iS, G5.M.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new C0634z(arrayListJ, arrayListJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C0634z[i9];
    }
}
