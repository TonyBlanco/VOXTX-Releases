package H5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: H5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0616g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        long jW = 0;
        long jW2 = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                jW = y4.b.w(parcel, iS);
            } else if (iL != 2) {
                y4.b.A(parcel, iS);
            } else {
                jW2 = y4.b.w(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C0613d(jW, jW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C0613d[i9];
    }
}
