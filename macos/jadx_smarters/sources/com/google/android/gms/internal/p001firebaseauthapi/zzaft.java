package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaft implements Parcelable.Creator<zzafq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafq createFromParcel(Parcel parcel) {
        int iB = b.B(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iB) {
            int iS = b.s(parcel);
            int iL = b.l(iS);
            if (iL == 1) {
                strF = b.f(parcel, iS);
            } else if (iL == 2) {
                strF2 = b.f(parcel, iS);
            } else if (iL != 3) {
                b.A(parcel, iS);
            } else {
                strF3 = b.f(parcel, iS);
            }
        }
        b.k(parcel, iB);
        return new zzafq(strF, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafq[] newArray(int i9) {
        return new zzafq[i9];
    }
}
