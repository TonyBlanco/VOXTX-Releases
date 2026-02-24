package n4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String[] strArrG = null;
        long jW = 0;
        long jW2 = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 2:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 3:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 4:
                    jW2 = y4.b.w(parcel, iS);
                    break;
                case 5:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 6:
                    strArrG = y4.b.g(parcel, iS);
                    break;
                case 7:
                    zM2 = y4.b.m(parcel, iS);
                    break;
                case 8:
                    zM3 = y4.b.m(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C2262b(jW, strF, jW2, zM, strArrG, zM2, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2262b[i9];
    }
}
