package n4;

import android.os.Parcel;
import android.os.Parcelable;
import t4.AbstractC2774a;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        C2280l c2280l = null;
        String strF = null;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 2) {
                c2280l = (C2280l) y4.b.e(parcel, iS, C2280l.CREATOR);
            } else if (iL != 3) {
                y4.b.A(parcel, iS);
            } else {
                strF = y4.b.f(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C2286s(c2280l, AbstractC2774a.a(strF));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2286s[i9];
    }
}
