package n4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: n4.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2290w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        String strF9 = null;
        C2288u c2288u = null;
        long jW = 0;
        long jW2 = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 2:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 3:
                    strF2 = y4.b.f(parcel, iS);
                    break;
                case 4:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 5:
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 6:
                    strF4 = y4.b.f(parcel, iS);
                    break;
                case 7:
                    strF5 = y4.b.f(parcel, iS);
                    break;
                case 8:
                    strF6 = y4.b.f(parcel, iS);
                    break;
                case 9:
                    strF7 = y4.b.f(parcel, iS);
                    break;
                case 10:
                    strF8 = y4.b.f(parcel, iS);
                    break;
                case 11:
                    jW2 = y4.b.w(parcel, iS);
                    break;
                case 12:
                    strF9 = y4.b.f(parcel, iS);
                    break;
                case 13:
                    c2288u = (C2288u) y4.b.e(parcel, iS, C2288u.CREATOR);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C2260a(strF, strF2, jW, strF3, strF4, strF5, strF6, strF7, strF8, jW2, strF9, c2288u);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2260a[i9];
    }
}
