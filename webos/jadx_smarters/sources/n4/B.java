package n4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        C2292y c2292y = null;
        C2292y c2292y2 = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 2) {
                c2292y = (C2292y) y4.b.e(parcel, iS, C2292y.CREATOR);
            } else if (iL != 3) {
                y4.b.A(parcel, iS);
            } else {
                c2292y2 = (C2292y) y4.b.e(parcel, iS, C2292y.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new C2259A(c2292y, c2292y2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2259A[i9];
    }
}
