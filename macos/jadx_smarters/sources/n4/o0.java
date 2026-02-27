package n4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        long jW = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        C2282n c2282n = null;
        ArrayList arrayListJ = null;
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        boolean zM = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 2:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 3:
                    strF2 = y4.b.f(parcel, iS);
                    break;
                case 4:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 5:
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 6:
                    c2282n = (C2282n) y4.b.e(parcel, iS, C2282n.CREATOR);
                    break;
                case 7:
                    iU2 = y4.b.u(parcel, iS);
                    break;
                case 8:
                    arrayListJ = y4.b.j(parcel, iS, C2284p.CREATOR);
                    break;
                case 9:
                    iU3 = y4.b.u(parcel, iS);
                    break;
                case 10:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 11:
                    zM = y4.b.m(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C2283o(strF, strF2, iU, strF3, c2282n, iU2, arrayListJ, iU3, jW, zM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2283o[i9];
    }
}
