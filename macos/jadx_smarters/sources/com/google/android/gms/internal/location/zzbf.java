package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe createFromParcel(Parcel parcel) {
        int iB = b.B(parcel);
        String strF = null;
        double dO = 0.0d;
        double dO2 = 0.0d;
        long jW = 0;
        int iU = 0;
        short sY = 0;
        float fQ = 0.0f;
        int iU2 = 0;
        int iU3 = -1;
        while (parcel.dataPosition() < iB) {
            int iS = b.s(parcel);
            switch (b.l(iS)) {
                case 1:
                    strF = b.f(parcel, iS);
                    break;
                case 2:
                    jW = b.w(parcel, iS);
                    break;
                case 3:
                    sY = b.y(parcel, iS);
                    break;
                case 4:
                    dO = b.o(parcel, iS);
                    break;
                case 5:
                    dO2 = b.o(parcel, iS);
                    break;
                case 6:
                    fQ = b.q(parcel, iS);
                    break;
                case 7:
                    iU = b.u(parcel, iS);
                    break;
                case 8:
                    iU2 = b.u(parcel, iS);
                    break;
                case 9:
                    iU3 = b.u(parcel, iS);
                    break;
                default:
                    b.A(parcel, iS);
                    break;
            }
        }
        b.k(parcel, iB);
        return new zzbe(strF, iU, sY, dO, dO2, fQ, jW, iU2, iU3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i9) {
        return new zzbe[i9];
    }
}
