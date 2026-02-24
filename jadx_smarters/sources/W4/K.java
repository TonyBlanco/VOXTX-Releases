package w4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        boolean zM = false;
        String strF = null;
        IBinder iBinderT = null;
        boolean zM2 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                strF = y4.b.f(parcel, iS);
            } else if (iL == 2) {
                iBinderT = y4.b.t(parcel, iS);
            } else if (iL == 3) {
                zM = y4.b.m(parcel, iS);
            } else if (iL != 4) {
                y4.b.A(parcel, iS);
            } else {
                zM2 = y4.b.m(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new J(strF, iBinderT, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new J[i9];
    }
}
