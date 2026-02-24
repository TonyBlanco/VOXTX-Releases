package H5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        boolean zM = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 1:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 2:
                    strF2 = y4.b.f(parcel, iS);
                    break;
                case 3:
                    strF5 = y4.b.f(parcel, iS);
                    break;
                case 4:
                    strF4 = y4.b.f(parcel, iS);
                    break;
                case 5:
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 6:
                    strF6 = y4.b.f(parcel, iS);
                    break;
                case 7:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 8:
                    strF7 = y4.b.f(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new f0(strF, strF2, strF3, strF4, strF5, strF6, zM, strF7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new f0[i9];
    }
}
