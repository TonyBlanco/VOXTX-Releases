package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        C1420t c1420t = null;
        int[] iArrC = null;
        int[] iArrC2 = null;
        boolean zM = false;
        boolean zM2 = false;
        int iU = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 1:
                    c1420t = (C1420t) y4.b.e(parcel, iS, C1420t.CREATOR);
                    break;
                case 2:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 3:
                    zM2 = y4.b.m(parcel, iS);
                    break;
                case 4:
                    iArrC = y4.b.c(parcel, iS);
                    break;
                case 5:
                    iU = y4.b.u(parcel, iS);
                    break;
                case 6:
                    iArrC2 = y4.b.c(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new C1407f(c1420t, zM, zM2, iArrC, iU, iArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C1407f[i9];
    }
}
