package M4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class g5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        long jW = 0;
        long jW2 = 0;
        long jW3 = 0;
        long jW4 = 0;
        long jW5 = 0;
        long jW6 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        Boolean boolN = null;
        ArrayList arrayListH = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = "";
        String strF11 = strF10;
        long jW7 = -2147483648L;
        boolean zM = true;
        boolean zM2 = false;
        int iU = 0;
        boolean zM3 = true;
        boolean zM4 = false;
        boolean zM5 = false;
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
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 5:
                    strF4 = y4.b.f(parcel, iS);
                    break;
                case 6:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 7:
                    jW2 = y4.b.w(parcel, iS);
                    break;
                case 8:
                    strF5 = y4.b.f(parcel, iS);
                    break;
                case 9:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 10:
                    zM2 = y4.b.m(parcel, iS);
                    break;
                case 11:
                    jW7 = y4.b.w(parcel, iS);
                    break;
                case 12:
                    strF6 = y4.b.f(parcel, iS);
                    break;
                case 13:
                    jW3 = y4.b.w(parcel, iS);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    jW4 = y4.b.w(parcel, iS);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 16:
                    zM3 = y4.b.m(parcel, iS);
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                case 20:
                default:
                    y4.b.A(parcel, iS);
                    break;
                case 18:
                    zM4 = y4.b.m(parcel, iS);
                    break;
                case 19:
                    strF7 = y4.b.f(parcel, iS);
                    break;
                case 21:
                    boolN = y4.b.n(parcel, iS);
                    break;
                case 22:
                    jW5 = y4.b.w(parcel, iS);
                    break;
                case 23:
                    arrayListH = y4.b.h(parcel, iS);
                    break;
                case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                    strF8 = y4.b.f(parcel, iS);
                    break;
                case 25:
                    strF10 = y4.b.f(parcel, iS);
                    break;
                case 26:
                    strF11 = y4.b.f(parcel, iS);
                    break;
                case 27:
                    strF9 = y4.b.f(parcel, iS);
                    break;
                case 28:
                    zM5 = y4.b.m(parcel, iS);
                    break;
                case 29:
                    jW6 = y4.b.w(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new f5(strF, strF2, strF3, strF4, jW, jW2, strF5, zM, zM2, jW7, strF6, jW3, jW4, iU, zM3, zM4, strF7, boolN, jW5, arrayListH, strF8, strF10, strF11, strF9, zM5, jW6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new f5[i9];
    }
}
