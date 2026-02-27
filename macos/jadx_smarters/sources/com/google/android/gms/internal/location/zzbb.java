package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1405d;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import org.chromium.net.UrlRequest;
import y4.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbb implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba createFromParcel(Parcel parcel) {
        int iB = b.B(parcel);
        List<C1405d> listJ = zzba.zza;
        LocationRequest locationRequest = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        long jW = Long.MAX_VALUE;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        while (parcel.dataPosition() < iB) {
            int iS = b.s(parcel);
            int iL = b.l(iS);
            if (iL != 1) {
                switch (iL) {
                    case 5:
                        listJ = b.j(parcel, iS, C1405d.CREATOR);
                        break;
                    case 6:
                        strF = b.f(parcel, iS);
                        break;
                    case 7:
                        zM = b.m(parcel, iS);
                        break;
                    case 8:
                        zM2 = b.m(parcel, iS);
                        break;
                    case 9:
                        zM3 = b.m(parcel, iS);
                        break;
                    case 10:
                        strF2 = b.f(parcel, iS);
                        break;
                    case 11:
                        zM4 = b.m(parcel, iS);
                        break;
                    case 12:
                        zM5 = b.m(parcel, iS);
                        break;
                    case 13:
                        strF3 = b.f(parcel, iS);
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        jW = b.w(parcel, iS);
                        break;
                    default:
                        b.A(parcel, iS);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) b.e(parcel, iS, LocationRequest.CREATOR);
            }
        }
        b.k(parcel, iB);
        return new zzba(locationRequest, listJ, strF, zM, zM2, zM3, strF2, zM4, zM5, strF3, jW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i9) {
        return new zzba[i9];
    }
}
