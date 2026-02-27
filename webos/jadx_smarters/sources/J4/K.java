package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        ArrayList arrayListJ = null;
        I i9 = null;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                arrayListJ = y4.b.j(parcel, iS, LocationRequest.CREATOR);
            } else if (iL == 2) {
                zM = y4.b.m(parcel, iS);
            } else if (iL == 3) {
                zM2 = y4.b.m(parcel, iS);
            } else if (iL != 5) {
                y4.b.A(parcel, iS);
            } else {
                i9 = (I) y4.b.e(parcel, iS, I.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new C0653l(arrayListJ, zM, zM2, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new C0653l[i9];
    }
}
