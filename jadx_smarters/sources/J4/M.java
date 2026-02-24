package J4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class M implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 1:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 2:
                    zM2 = y4.b.m(parcel, iS);
                    break;
                case 3:
                    zM3 = y4.b.m(parcel, iS);
                    break;
                case 4:
                    zM4 = y4.b.m(parcel, iS);
                    break;
                case 5:
                    zM5 = y4.b.m(parcel, iS);
                    break;
                case 6:
                    zM6 = y4.b.m(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C0655n(zM, zM2, zM3, zM4, zM5, zM6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new C0655n[i9];
    }
}
