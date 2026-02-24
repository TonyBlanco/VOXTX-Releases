package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes3.dex */
public final class Z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        long jW = 50;
        long jW2 = Long.MAX_VALUE;
        boolean zM = true;
        float fQ = 0.0f;
        int iU = a.e.API_PRIORITY_OTHER;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                zM = y4.b.m(parcel, iS);
            } else if (iL == 2) {
                jW = y4.b.w(parcel, iS);
            } else if (iL == 3) {
                fQ = y4.b.q(parcel, iS);
            } else if (iL == 4) {
                jW2 = y4.b.w(parcel, iS);
            } else if (iL != 5) {
                y4.b.A(parcel, iS);
            } else {
                iU = y4.b.u(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new Y(zM, jW, fQ, jW2, iU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new Y[i9];
    }
}
