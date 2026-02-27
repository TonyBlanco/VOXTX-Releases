package P4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.P;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        C2914b c2914b = null;
        P p9 = null;
        int iU = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                iU = y4.b.u(parcel, iS);
            } else if (iL == 2) {
                c2914b = (C2914b) y4.b.e(parcel, iS, C2914b.CREATOR);
            } else if (iL != 3) {
                y4.b.A(parcel, iS);
            } else {
                p9 = (P) y4.b.e(parcel, iS, P.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new l(iU, c2914b, p9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new l[i9];
    }
}
