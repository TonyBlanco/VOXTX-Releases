package t4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: t4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2777d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        int iU = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 2) {
                iU = y4.b.u(parcel, iS);
            } else if (iL == 3) {
                zM = y4.b.m(parcel, iS);
            } else if (iL != 4) {
                y4.b.A(parcel, iS);
            } else {
                zM2 = y4.b.m(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new U(iU, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new U[i9];
    }
}
