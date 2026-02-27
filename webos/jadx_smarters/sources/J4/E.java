package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.a;
import com.google.android.gms.location.LocationRequest;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        long jW = 3600000;
        long jW2 = 600000;
        long jW3 = Long.MAX_VALUE;
        long jW4 = 0;
        int iU = HttpStatus.SC_PROCESSING;
        boolean zM = false;
        int iU2 = a.e.API_PRIORITY_OTHER;
        float fQ = 0.0f;
        boolean zM2 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 1:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 2:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 3:
                    jW2 = y4.b.w(parcel, iS);
                    break;
                case 4:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 5:
                    jW3 = y4.b.w(parcel, iS);
                    break;
                case 6:
                    iU2 = y4.b.u(parcel, iS);
                    break;
                case 7:
                    fQ = y4.b.q(parcel, iS);
                    break;
                case 8:
                    jW4 = y4.b.w(parcel, iS);
                    break;
                case 9:
                    zM2 = y4.b.m(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new LocationRequest(iU, jW, jW2, zM, jW3, iU2, fQ, jW4, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i9) {
        return new LocationRequest[i9];
    }
}
