package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzm implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl createFromParcel(Parcel parcel) {
        int iB = b.B(parcel);
        zzj zzjVar = null;
        IBinder iBinderT = null;
        IBinder iBinderT2 = null;
        int iU = 1;
        while (parcel.dataPosition() < iB) {
            int iS = b.s(parcel);
            int iL = b.l(iS);
            if (iL == 1) {
                iU = b.u(parcel, iS);
            } else if (iL == 2) {
                zzjVar = (zzj) b.e(parcel, iS, zzj.CREATOR);
            } else if (iL == 3) {
                iBinderT = b.t(parcel, iS);
            } else if (iL != 4) {
                b.A(parcel, iS);
            } else {
                iBinderT2 = b.t(parcel, iS);
            }
        }
        b.k(parcel, iB);
        return new zzl(iU, zzjVar, iBinderT, iBinderT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl[] newArray(int i9) {
        return new zzl[i9];
    }
}
