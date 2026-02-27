package n4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: n4.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2291x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                strF = y4.b.f(parcel, iS);
            } else if (iL != 2) {
                y4.b.A(parcel, iS);
            } else {
                strF2 = y4.b.f(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C2274h(strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2274h[i9];
    }
}
