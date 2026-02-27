package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        int iU = 0;
        boolean zM = false;
        boolean zM2 = false;
        int iU2 = 0;
        int iU3 = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                iU = y4.b.u(parcel, iS);
            } else if (iL == 2) {
                zM = y4.b.m(parcel, iS);
            } else if (iL == 3) {
                zM2 = y4.b.m(parcel, iS);
            } else if (iL == 4) {
                iU2 = y4.b.u(parcel, iS);
            } else if (iL != 5) {
                y4.b.A(parcel, iS);
            } else {
                iU3 = y4.b.u(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new C1420t(iU, zM, zM2, iU2, iU3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new C1420t[i9];
    }
}
