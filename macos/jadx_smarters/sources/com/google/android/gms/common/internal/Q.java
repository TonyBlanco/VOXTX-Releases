package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        IBinder iBinderT = null;
        C2914b c2914b = null;
        int iU = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                iU = y4.b.u(parcel, iS);
            } else if (iL == 2) {
                iBinderT = y4.b.t(parcel, iS);
            } else if (iL == 3) {
                c2914b = (C2914b) y4.b.e(parcel, iS, C2914b.CREATOR);
            } else if (iL == 4) {
                zM = y4.b.m(parcel, iS);
            } else if (iL != 5) {
                y4.b.A(parcel, iS);
            } else {
                zM2 = y4.b.m(parcel, iS);
            }
        }
        y4.b.k(parcel, iB);
        return new P(iU, iBinderT, c2914b, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new P[i9];
    }
}
