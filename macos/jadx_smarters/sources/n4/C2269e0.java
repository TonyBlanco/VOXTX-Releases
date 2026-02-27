package n4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: n4.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2269e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        long jW = 0;
        long jW2 = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 2) {
                jW = y4.b.w(parcel, iS);
            } else if (iL == 3) {
                jW2 = y4.b.w(parcel, iS);
            } else if (iL == 4) {
                zM = y4.b.m(parcel, iS);
            } else if (iL != 5) {
                y4.b.A(parcel, iS);
            } else {
                zM2 = y4.b.m(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C2278j(jW, jW2, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2278j[i9];
    }
}
