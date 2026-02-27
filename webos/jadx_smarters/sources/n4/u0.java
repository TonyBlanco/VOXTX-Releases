package n4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import x4.C2957a;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        ArrayList arrayListJ = null;
        ArrayList arrayListH = null;
        String strF3 = null;
        Uri uri = null;
        String strF4 = null;
        String strF5 = null;
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
                    arrayListJ = y4.b.j(parcel, iS, C2957a.CREATOR);
                    break;
                case 5:
                    arrayListH = y4.b.h(parcel, iS);
                    break;
                case 6:
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 7:
                    uri = (Uri) y4.b.e(parcel, iS, Uri.CREATOR);
                    break;
                case 8:
                    strF4 = y4.b.f(parcel, iS);
                    break;
                case 9:
                    strF5 = y4.b.f(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C2266d(strF, strF2, arrayListJ, arrayListH, strF3, uri, strF4, strF5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2266d[i9];
    }
}
