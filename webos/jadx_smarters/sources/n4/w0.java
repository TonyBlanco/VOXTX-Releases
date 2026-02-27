package n4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        float fQ = 0.0f;
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        int iU4 = 0;
        int iU5 = 0;
        int iU6 = 0;
        int iU7 = 0;
        int iU8 = 0;
        int iU9 = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 2:
                    fQ = y4.b.q(parcel, iS);
                    break;
                case 3:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 4:
                    iU2 = y4.b.u(parcel, iS);
                    break;
                case 5:
                    iU3 = y4.b.u(parcel, iS);
                    break;
                case 6:
                    iU4 = y4.b.u(parcel, iS);
                    break;
                case 7:
                    iU5 = y4.b.u(parcel, iS);
                    break;
                case 8:
                    iU6 = y4.b.u(parcel, iS);
                    break;
                case 9:
                    iU7 = y4.b.u(parcel, iS);
                    break;
                case 10:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 11:
                    iU8 = y4.b.u(parcel, iS);
                    break;
                case 12:
                    iU9 = y4.b.u(parcel, iS);
                    break;
                case 13:
                    strF2 = y4.b.f(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C2287t(fQ, iU, iU2, iU3, iU4, iU5, iU6, iU7, strF, iU8, iU9, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2287t[i9];
    }
}
