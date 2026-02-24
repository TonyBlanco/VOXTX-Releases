package P4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.N;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        N n9 = null;
        int iU = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                iU = y4.b.u(parcel, iS);
            } else if (iL != 2) {
                y4.b.A(parcel, iS);
            } else {
                n9 = (N) y4.b.e(parcel, iS, N.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new j(iU, n9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new j[i9];
    }
}
