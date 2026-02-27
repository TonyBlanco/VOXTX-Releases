package M4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: M4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0731e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        V4 v42 = null;
        String strF3 = null;
        C0832v c0832v = null;
        C0832v c0832v2 = null;
        C0832v c0832v3 = null;
        long jW = 0;
        long jW2 = 0;
        long jW3 = 0;
        boolean zM = false;
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
                    v42 = (V4) y4.b.e(parcel, iS, V4.CREATOR);
                    break;
                case 5:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 6:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 7:
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 8:
                    c0832v = (C0832v) y4.b.e(parcel, iS, C0832v.CREATOR);
                    break;
                case 9:
                    jW2 = y4.b.w(parcel, iS);
                    break;
                case 10:
                    c0832v2 = (C0832v) y4.b.e(parcel, iS, C0832v.CREATOR);
                    break;
                case 11:
                    jW3 = y4.b.w(parcel, iS);
                    break;
                case 12:
                    c0832v3 = (C0832v) y4.b.e(parcel, iS, C0832v.CREATOR);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C0725d(strF, strF2, v42, jW, zM, strF3, c0832v, jW2, c0832v2, jW3, c0832v3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C0725d[i9];
    }
}
