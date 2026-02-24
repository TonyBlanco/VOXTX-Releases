package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        MediaInfo mediaInfo = null;
        long[] jArrD = null;
        String strF = null;
        ArrayList arrayListJ = null;
        C2264c c2264c = null;
        C2289v c2289v = null;
        C2278j c2278j = null;
        C2283o c2283o = null;
        double dO = 0.0d;
        double dO2 = 0.0d;
        long jW = 0;
        long jW2 = 0;
        long jW3 = 0;
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        boolean zM = false;
        int iU4 = 0;
        int iU5 = 0;
        int iU6 = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 2:
                    mediaInfo = (MediaInfo) y4.b.e(parcel, iS, MediaInfo.CREATOR);
                    break;
                case 3:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 4:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 5:
                    dO = y4.b.o(parcel, iS);
                    break;
                case 6:
                    iU2 = y4.b.u(parcel, iS);
                    break;
                case 7:
                    iU3 = y4.b.u(parcel, iS);
                    break;
                case 8:
                    jW2 = y4.b.w(parcel, iS);
                    break;
                case 9:
                    jW3 = y4.b.w(parcel, iS);
                    break;
                case 10:
                    dO2 = y4.b.o(parcel, iS);
                    break;
                case 11:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 12:
                    jArrD = y4.b.d(parcel, iS);
                    break;
                case 13:
                    iU4 = y4.b.u(parcel, iS);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    iU5 = y4.b.u(parcel, iS);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 16:
                    iU6 = y4.b.u(parcel, iS);
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    arrayListJ = y4.b.j(parcel, iS, C2284p.CREATOR);
                    break;
                case 18:
                    zM2 = y4.b.m(parcel, iS);
                    break;
                case 19:
                    c2264c = (C2264c) y4.b.e(parcel, iS, C2264c.CREATOR);
                    break;
                case 20:
                    c2289v = (C2289v) y4.b.e(parcel, iS, C2289v.CREATOR);
                    break;
                case 21:
                    c2278j = (C2278j) y4.b.e(parcel, iS, C2278j.CREATOR);
                    break;
                case 22:
                    c2283o = (C2283o) y4.b.e(parcel, iS, C2283o.CREATOR);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new r(mediaInfo, jW, iU, dO, iU2, iU3, jW2, jW3, dO2, zM, jArrD, iU4, iU5, strF, iU6, arrayListJ, zM2, c2264c, c2289v, c2278j, c2283o);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new r[i9];
    }
}
