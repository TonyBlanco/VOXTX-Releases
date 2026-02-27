package H5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        C0611b c0611b = null;
        b0 b0Var = null;
        G5.f0 f0Var = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                c0611b = (C0611b) y4.b.e(parcel, iS, C0611b.CREATOR);
            } else if (iL == 2) {
                b0Var = (b0) y4.b.e(parcel, iS, b0.CREATOR);
            } else if (iL != 3) {
                y4.b.A(parcel, iS);
            } else {
                f0Var = (G5.f0) y4.b.e(parcel, iS, G5.f0.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new d0(c0611b, b0Var, f0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new d0[i9];
    }
}
