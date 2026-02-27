package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class M implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        long jW = 0;
        long jW2 = 0;
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        int iU4 = 0;
        int iU5 = -1;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 1:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 2:
                    iU2 = y4.b.u(parcel, iS);
                    break;
                case 3:
                    iU3 = y4.b.u(parcel, iS);
                    break;
                case 4:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 5:
                    jW2 = y4.b.w(parcel, iS);
                    break;
                case 6:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 7:
                    strF2 = y4.b.f(parcel, iS);
                    break;
                case 8:
                    iU4 = y4.b.u(parcel, iS);
                    break;
                case 9:
                    iU5 = y4.b.u(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C1417p(iU, iU2, iU3, jW, jW2, strF, strF2, iU4, iU5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C1417p[i9];
    }
}
