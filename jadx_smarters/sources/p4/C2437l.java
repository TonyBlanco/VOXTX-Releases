package p4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;

/* JADX INFO: renamed from: p4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2437l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        ArrayList arrayListH = null;
        int[] iArrC = null;
        String strF = null;
        IBinder iBinderT = null;
        long jW = 0;
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        int iU4 = 0;
        int iU5 = 0;
        int iU6 = 0;
        int iU7 = 0;
        int iU8 = 0;
        int iU9 = 0;
        int iU10 = 0;
        int iU11 = 0;
        int iU12 = 0;
        int iU13 = 0;
        int iU14 = 0;
        int iU15 = 0;
        int iU16 = 0;
        int iU17 = 0;
        int iU18 = 0;
        int iU19 = 0;
        int iU20 = 0;
        int iU21 = 0;
        int iU22 = 0;
        int iU23 = 0;
        int iU24 = 0;
        int iU25 = 0;
        int iU26 = 0;
        int iU27 = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 2:
                    arrayListH = y4.b.h(parcel, iS);
                    break;
                case 3:
                    iArrC = y4.b.c(parcel, iS);
                    break;
                case 4:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 5:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 6:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 7:
                    iU2 = y4.b.u(parcel, iS);
                    break;
                case 8:
                    iU3 = y4.b.u(parcel, iS);
                    break;
                case 9:
                    iU4 = y4.b.u(parcel, iS);
                    break;
                case 10:
                    iU5 = y4.b.u(parcel, iS);
                    break;
                case 11:
                    iU6 = y4.b.u(parcel, iS);
                    break;
                case 12:
                    iU7 = y4.b.u(parcel, iS);
                    break;
                case 13:
                    iU8 = y4.b.u(parcel, iS);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    iU9 = y4.b.u(parcel, iS);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    iU10 = y4.b.u(parcel, iS);
                    break;
                case 16:
                    iU11 = y4.b.u(parcel, iS);
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    iU12 = y4.b.u(parcel, iS);
                    break;
                case 18:
                    iU13 = y4.b.u(parcel, iS);
                    break;
                case 19:
                    iU14 = y4.b.u(parcel, iS);
                    break;
                case 20:
                    iU15 = y4.b.u(parcel, iS);
                    break;
                case 21:
                    iU16 = y4.b.u(parcel, iS);
                    break;
                case 22:
                    iU17 = y4.b.u(parcel, iS);
                    break;
                case 23:
                    iU18 = y4.b.u(parcel, iS);
                    break;
                case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                    iU19 = y4.b.u(parcel, iS);
                    break;
                case 25:
                    iU20 = y4.b.u(parcel, iS);
                    break;
                case 26:
                    iU21 = y4.b.u(parcel, iS);
                    break;
                case 27:
                    iU22 = y4.b.u(parcel, iS);
                    break;
                case 28:
                    iU23 = y4.b.u(parcel, iS);
                    break;
                case 29:
                    iU24 = y4.b.u(parcel, iS);
                    break;
                case 30:
                    iU25 = y4.b.u(parcel, iS);
                    break;
                case 31:
                    iU26 = y4.b.u(parcel, iS);
                    break;
                case 32:
                    iU27 = y4.b.u(parcel, iS);
                    break;
                case 33:
                    iBinderT = y4.b.t(parcel, iS);
                    break;
                case 34:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 35:
                    zM2 = y4.b.m(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C2433h(arrayListH, iArrC, jW, strF, iU, iU2, iU3, iU4, iU5, iU6, iU7, iU8, iU9, iU10, iU11, iU12, iU13, iU14, iU15, iU16, iU17, iU18, iU19, iU20, iU21, iU22, iU23, iU24, iU25, iU26, iU27, iBinderT, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2433h[i9];
    }
}
