package n4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: n4.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2261a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        int iU = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            if (y4.b.l(iS) != 2) {
                y4.b.A(parcel, iS);
            } else {
                iU = y4.b.u(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new Z(iU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new Z[i9];
    }
}
