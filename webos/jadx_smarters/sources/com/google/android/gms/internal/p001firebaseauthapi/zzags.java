package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import y4.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzags implements Parcelable.Creator<zzagt> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagt createFromParcel(Parcel parcel) {
        int iB = b.B(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        String strF11 = null;
        String strF12 = null;
        String strF13 = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iB) {
            int iS = b.s(parcel);
            switch (b.l(iS)) {
                case 2:
                    strF = b.f(parcel, iS);
                    break;
                case 3:
                    strF2 = b.f(parcel, iS);
                    break;
                case 4:
                    strF3 = b.f(parcel, iS);
                    break;
                case 5:
                    strF4 = b.f(parcel, iS);
                    break;
                case 6:
                    strF5 = b.f(parcel, iS);
                    break;
                case 7:
                    strF6 = b.f(parcel, iS);
                    break;
                case 8:
                    strF7 = b.f(parcel, iS);
                    break;
                case 9:
                    strF8 = b.f(parcel, iS);
                    break;
                case 10:
                    zM = b.m(parcel, iS);
                    break;
                case 11:
                    zM2 = b.m(parcel, iS);
                    break;
                case 12:
                    strF9 = b.f(parcel, iS);
                    break;
                case 13:
                    strF10 = b.f(parcel, iS);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    strF11 = b.f(parcel, iS);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    strF12 = b.f(parcel, iS);
                    break;
                case 16:
                    zM3 = b.m(parcel, iS);
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    strF13 = b.f(parcel, iS);
                    break;
                default:
                    b.A(parcel, iS);
                    break;
            }
        }
        b.k(parcel, iB);
        return new zzagt(strF, strF2, strF3, strF4, strF5, strF6, strF7, strF8, zM, zM2, strF9, strF10, strF11, strF12, zM3, strF13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagt[] newArray(int i9) {
        return new zzagt[i9];
    }
}
