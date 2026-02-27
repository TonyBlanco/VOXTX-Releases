package G5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements Parcelable.Creator {
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
        boolean zM2 = false;
        int iU = 0;
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
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 4:
                    strF4 = y4.b.f(parcel, iS);
                    break;
                case 5:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 6:
                    strF5 = y4.b.f(parcel, iS);
                    break;
                case 7:
                    zM2 = y4.b.m(parcel, iS);
                    break;
                case 8:
                    strF6 = y4.b.f(parcel, iS);
                    break;
                case 9:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 10:
                    strF7 = y4.b.f(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C0537d(strF, strF2, strF3, strF4, zM, strF5, zM2, strF6, iU, strF7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C0537d[i9];
    }
}
