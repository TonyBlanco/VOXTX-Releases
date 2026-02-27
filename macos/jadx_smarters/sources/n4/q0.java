package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        MediaInfo mediaInfo = null;
        long[] jArrD = null;
        String strF = null;
        double dO = 0.0d;
        double dO2 = 0.0d;
        double dO3 = 0.0d;
        int iU = 0;
        boolean zM = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 2:
                    mediaInfo = (MediaInfo) y4.b.e(parcel, iS, MediaInfo.CREATOR);
                    break;
                case 3:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 4:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 5:
                    dO = y4.b.o(parcel, iS);
                    break;
                case 6:
                    dO2 = y4.b.o(parcel, iS);
                    break;
                case 7:
                    dO3 = y4.b.o(parcel, iS);
                    break;
                case 8:
                    jArrD = y4.b.d(parcel, iS);
                    break;
                case 9:
                    strF = y4.b.f(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C2284p(mediaInfo, iU, zM, dO, dO2, dO3, jArrD, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2284p[i9];
    }
}
