package w4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        IBinder iBinderT = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 1:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 2:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 3:
                    zM2 = y4.b.m(parcel, iS);
                    break;
                case 4:
                    iBinderT = y4.b.t(parcel, iS);
                    break;
                case 5:
                    zM3 = y4.b.m(parcel, iS);
                    break;
                case 6:
                    zM4 = y4.b.m(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new F(strF, zM, zM2, iBinderT, zM3, zM4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new F[i9];
    }
}
