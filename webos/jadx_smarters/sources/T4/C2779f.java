package t4;

import android.os.Parcel;
import android.os.Parcelable;
import n4.C2259A;
import n4.C2266d;

/* JADX INFO: renamed from: t4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2779f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        double dO = 0.0d;
        double dO2 = 0.0d;
        C2266d c2266d = null;
        C2259A c2259a = null;
        boolean zM = false;
        int iU = 0;
        int iU2 = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 2:
                    dO = y4.b.o(parcel, iS);
                    break;
                case 3:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 4:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 5:
                    c2266d = (C2266d) y4.b.e(parcel, iS, C2266d.CREATOR);
                    break;
                case 6:
                    iU2 = y4.b.u(parcel, iS);
                    break;
                case 7:
                    c2259a = (C2259A) y4.b.e(parcel, iS, C2259A.CREATOR);
                    break;
                case 8:
                    dO2 = y4.b.o(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C2778e(dO, zM, iU, c2266d, iU2, c2259a, dO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2778e[i9];
    }
}
