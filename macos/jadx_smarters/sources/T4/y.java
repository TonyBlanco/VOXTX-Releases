package t4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            if (y4.b.l(iS) != 2) {
                y4.b.A(parcel, iS);
            } else {
                strF = y4.b.f(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C2776c(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2776c[i9];
    }
}
