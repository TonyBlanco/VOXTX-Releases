package G5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            y4.b.l(iS);
            y4.b.A(parcel, iS);
        }
        y4.b.k(parcel, iB);
        return new G();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new G[i9];
    }
}
