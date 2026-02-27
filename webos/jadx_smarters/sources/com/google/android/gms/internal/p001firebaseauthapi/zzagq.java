package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagq implements Parcelable.Creator<zzagr> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagr createFromParcel(Parcel parcel) {
        int iB = b.B(parcel);
        while (parcel.dataPosition() < iB) {
            int iS = b.s(parcel);
            b.l(iS);
            b.A(parcel, iS);
        }
        b.k(parcel, iB);
        return new zzagr();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagr[] newArray(int i9) {
        return new zzagr[i9];
    }
}
