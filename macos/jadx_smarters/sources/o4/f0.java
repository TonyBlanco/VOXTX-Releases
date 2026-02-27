package o4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import n4.C2276i;
import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.net.UrlRequest;
import p4.C2426a;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        ArrayList arrayListH = null;
        C2276i c2276i = null;
        C2426a c2426a = null;
        ArrayList arrayListH2 = null;
        double dO = 0.0d;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        boolean zM7 = false;
        int iU = 0;
        boolean zM8 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 2:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 3:
                    arrayListH = y4.b.h(parcel, iS);
                    break;
                case 4:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 5:
                    c2276i = (C2276i) y4.b.e(parcel, iS, C2276i.CREATOR);
                    break;
                case 6:
                    zM2 = y4.b.m(parcel, iS);
                    break;
                case 7:
                    c2426a = (C2426a) y4.b.e(parcel, iS, C2426a.CREATOR);
                    break;
                case 8:
                    zM3 = y4.b.m(parcel, iS);
                    break;
                case 9:
                    dO = y4.b.o(parcel, iS);
                    break;
                case 10:
                    zM4 = y4.b.m(parcel, iS);
                    break;
                case 11:
                    zM5 = y4.b.m(parcel, iS);
                    break;
                case 12:
                    zM6 = y4.b.m(parcel, iS);
                    break;
                case 13:
                    arrayListH2 = y4.b.h(parcel, iS);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    zM7 = y4.b.m(parcel, iS);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 16:
                    zM8 = y4.b.m(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C2326c(strF, arrayListH, zM, c2276i, zM2, c2426a, zM3, dO, zM4, zM5, zM6, arrayListH2, zM7, iU, zM8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C2326c[i9];
    }
}
