package com.google.android.gms.internal.location;

import J4.Y;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1405d;
import java.util.List;
import y4.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzk implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int iB = b.B(parcel);
        Y y9 = zzj.zzb;
        List<C1405d> listJ = zzj.zza;
        String strF = null;
        while (parcel.dataPosition() < iB) {
            int iS = b.s(parcel);
            int iL = b.l(iS);
            if (iL == 1) {
                y9 = (Y) b.e(parcel, iS, Y.CREATOR);
            } else if (iL == 2) {
                listJ = b.j(parcel, iS, C1405d.CREATOR);
            } else if (iL != 3) {
                b.A(parcel, iS);
            } else {
                strF = b.f(parcel, iS);
            }
        }
        b.k(parcel, iB);
        return new zzj(y9, listJ, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i9) {
        return new zzj[i9];
    }
}
