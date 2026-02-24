package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import x4.C2957a;

/* JADX INFO: loaded from: classes3.dex */
public final class E0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        ArrayList arrayListJ = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        byte[] bArrB = null;
        String strF9 = null;
        t4.U u9 = null;
        int iU = 0;
        int iU2 = 0;
        int iU3 = -1;
        int iU4 = 0;
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
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 5:
                    strF4 = y4.b.f(parcel, iS);
                    break;
                case 6:
                    strF5 = y4.b.f(parcel, iS);
                    break;
                case 7:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 8:
                    arrayListJ = y4.b.j(parcel, iS, C2957a.CREATOR);
                    break;
                case 9:
                    iU2 = y4.b.u(parcel, iS);
                    break;
                case 10:
                    iU3 = y4.b.u(parcel, iS);
                    break;
                case 11:
                    strF6 = y4.b.f(parcel, iS);
                    break;
                case 12:
                    strF7 = y4.b.f(parcel, iS);
                    break;
                case 13:
                    iU4 = y4.b.u(parcel, iS);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    strF8 = y4.b.f(parcel, iS);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    bArrB = y4.b.b(parcel, iS);
                    break;
                case 16:
                    strF9 = y4.b.f(parcel, iS);
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 18:
                    u9 = (t4.U) y4.b.e(parcel, iS, t4.U.CREATOR);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new CastDevice(strF, strF2, strF3, strF4, strF5, iU, arrayListJ, iU2, iU3, strF6, strF7, iU4, strF8, bArrB, strF9, zM, u9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new CastDevice[i9];
    }
}
