package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        PendingIntent pendingIntent = null;
        C2914b c2914b = null;
        int iU = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                iU = y4.b.u(parcel, iS);
            } else if (iL == 2) {
                strF = y4.b.f(parcel, iS);
            } else if (iL == 3) {
                pendingIntent = (PendingIntent) y4.b.e(parcel, iS, PendingIntent.CREATOR);
            } else if (iL != 4) {
                y4.b.A(parcel, iS);
            } else {
                c2914b = (C2914b) y4.b.e(parcel, iS, C2914b.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new Status(iU, strF, pendingIntent, c2914b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new Status[i9];
    }
}
