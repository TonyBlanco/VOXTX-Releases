package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafm implements Parcelable.Creator<zzafn> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafn createFromParcel(Parcel parcel) {
        int iB = b.B(parcel);
        String strF = null;
        String strF2 = null;
        Long lX = null;
        String strF3 = null;
        Long lX2 = null;
        while (parcel.dataPosition() < iB) {
            int iS = b.s(parcel);
            int iL = b.l(iS);
            if (iL == 2) {
                strF = b.f(parcel, iS);
            } else if (iL == 3) {
                strF2 = b.f(parcel, iS);
            } else if (iL == 4) {
                lX = b.x(parcel, iS);
            } else if (iL == 5) {
                strF3 = b.f(parcel, iS);
            } else if (iL != 6) {
                b.A(parcel, iS);
            } else {
                lX2 = b.x(parcel, iS);
            }
        }
        b.k(parcel, iB);
        return new zzafn(strF, strF2, lX, strF3, lX2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafn[] newArray(int i9) {
        return new zzafn[i9];
    }
}
