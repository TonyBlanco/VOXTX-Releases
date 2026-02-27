package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;

/* JADX INFO: renamed from: n4.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2277i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        long jW = 0;
        long jW2 = 0;
        MediaInfo mediaInfo = null;
        C2283o c2283o = null;
        Boolean boolN = null;
        long[] jArrD = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        double dO = 0.0d;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 2:
                    mediaInfo = (MediaInfo) y4.b.e(parcel, iS, MediaInfo.CREATOR);
                    break;
                case 3:
                    c2283o = (C2283o) y4.b.e(parcel, iS, C2283o.CREATOR);
                    break;
                case 4:
                    boolN = y4.b.n(parcel, iS);
                    break;
                case 5:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 6:
                    dO = y4.b.o(parcel, iS);
                    break;
                case 7:
                    jArrD = y4.b.d(parcel, iS);
                    break;
                case 8:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 9:
                    strF2 = y4.b.f(parcel, iS);
                    break;
                case 10:
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 11:
                    strF4 = y4.b.f(parcel, iS);
                    break;
                case 12:
                    strF5 = y4.b.f(parcel, iS);
                    break;
                case 13:
                    jW2 = y4.b.w(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C2280l(mediaInfo, c2283o, boolN, jW, dO, jArrD, strF, strF2, strF3, strF4, strF5, jW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2280l[i9];
    }
}
