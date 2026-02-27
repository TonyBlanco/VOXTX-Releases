package P4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        Intent intent = null;
        int iU = 0;
        int iU2 = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                iU = y4.b.u(parcel, iS);
            } else if (iL == 2) {
                iU2 = y4.b.u(parcel, iS);
            } else if (iL != 3) {
                y4.b.A(parcel, iS);
            } else {
                intent = (Intent) y4.b.e(parcel, iS, Intent.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new b(iU, iU2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new b[i9];
    }
}
