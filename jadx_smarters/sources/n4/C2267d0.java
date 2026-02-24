package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: n4.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2267d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        C2281m c2281m = null;
        ArrayList arrayListJ = null;
        C2287t c2287t = null;
        String strF3 = null;
        ArrayList arrayListJ2 = null;
        ArrayList arrayListJ3 = null;
        String strF4 = null;
        C2288u c2288u = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        long jW = 0;
        long jW2 = 0;
        int iU = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 2:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 3:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 4:
                    strF2 = y4.b.f(parcel, iS);
                    break;
                case 5:
                    c2281m = (C2281m) y4.b.e(parcel, iS, C2281m.CREATOR);
                    break;
                case 6:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 7:
                    arrayListJ = y4.b.j(parcel, iS, MediaTrack.CREATOR);
                    break;
                case 8:
                    c2287t = (C2287t) y4.b.e(parcel, iS, C2287t.CREATOR);
                    break;
                case 9:
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 10:
                    arrayListJ2 = y4.b.j(parcel, iS, C2262b.CREATOR);
                    break;
                case 11:
                    arrayListJ3 = y4.b.j(parcel, iS, C2260a.CREATOR);
                    break;
                case 12:
                    strF4 = y4.b.f(parcel, iS);
                    break;
                case 13:
                    c2288u = (C2288u) y4.b.e(parcel, iS, C2288u.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    jW2 = y4.b.w(parcel, iS);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    strF5 = y4.b.f(parcel, iS);
                    break;
                case 16:
                    strF6 = y4.b.f(parcel, iS);
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    strF7 = y4.b.f(parcel, iS);
                    break;
                case 18:
                    strF8 = y4.b.f(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new MediaInfo(strF, iU, strF2, c2281m, jW, arrayListJ, c2287t, strF3, arrayListJ2, arrayListJ3, strF4, c2288u, jW2, strF5, strF6, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new MediaInfo[i9];
    }
}
