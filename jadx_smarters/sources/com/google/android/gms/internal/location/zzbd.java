package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbd implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc createFromParcel(Parcel parcel) {
        int iB = b.B(parcel);
        zzba zzbaVar = null;
        IBinder iBinderT = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderT2 = null;
        IBinder iBinderT3 = null;
        int iU = 1;
        while (parcel.dataPosition() < iB) {
            int iS = b.s(parcel);
            switch (b.l(iS)) {
                case 1:
                    iU = b.u(parcel, iS);
                    break;
                case 2:
                    zzbaVar = (zzba) b.e(parcel, iS, zzba.CREATOR);
                    break;
                case 3:
                    iBinderT = b.t(parcel, iS);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.e(parcel, iS, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderT2 = b.t(parcel, iS);
                    break;
                case 6:
                    iBinderT3 = b.t(parcel, iS);
                    break;
                default:
                    b.A(parcel, iS);
                    break;
            }
        }
        b.k(parcel, iB);
        return new zzbc(iU, zzbaVar, iBinderT, pendingIntent, iBinderT2, iBinderT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i9) {
        return new zzbc[i9];
    }
}
