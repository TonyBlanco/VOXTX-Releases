package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import t4.AbstractC2774a;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        ArrayList arrayListH = null;
        long jW = 0;
        int iU = 0;
        int iU2 = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 2:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 3:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 4:
                    strF2 = y4.b.f(parcel, iS);
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
                    iU2 = y4.b.u(parcel, iS);
                    break;
                case 9:
                    arrayListH = y4.b.h(parcel, iS);
                    break;
                case 10:
                    strF = y4.b.f(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new MediaTrack(jW, iU, strF2, strF3, strF4, strF5, iU2, arrayListH, AbstractC2774a.a(strF));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new MediaTrack[i9];
    }
}
