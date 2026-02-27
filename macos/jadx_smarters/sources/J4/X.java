package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1405d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        ArrayList arrayListJ = null;
        String strF = null;
        ArrayList arrayListJ2 = null;
        String strF2 = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                arrayListJ = y4.b.j(parcel, iS, C0644c.CREATOR);
            } else if (iL == 2) {
                strF = y4.b.f(parcel, iS);
            } else if (iL == 3) {
                arrayListJ2 = y4.b.j(parcel, iS, C1405d.CREATOR);
            } else if (iL != 4) {
                y4.b.A(parcel, iS);
            } else {
                strF2 = y4.b.f(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C0645d(arrayListJ, strF, arrayListJ2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new C0645d[i9];
    }
}
