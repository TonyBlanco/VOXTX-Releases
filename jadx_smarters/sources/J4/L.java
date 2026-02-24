package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        Status status = null;
        C0655n c0655n = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                status = (Status) y4.b.e(parcel, iS, Status.CREATOR);
            } else if (iL != 2) {
                y4.b.A(parcel, iS);
            } else {
                c0655n = (C0655n) y4.b.e(parcel, iS, C0655n.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new C0654m(status, c0655n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new C0654m[i9];
    }
}
