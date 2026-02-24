package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import y4.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzab implements Parcelable.Creator<zzaa> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaa createFromParcel(Parcel parcel) {
        int iB = b.B(parcel);
        Status status = null;
        while (parcel.dataPosition() < iB) {
            int iS = b.s(parcel);
            if (b.l(iS) != 1) {
                b.A(parcel, iS);
            } else {
                status = (Status) b.e(parcel, iS, Status.CREATOR);
            }
        }
        b.k(parcel, iB);
        return new zzaa(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaa[] newArray(int i9) {
        return new zzaa[i9];
    }
}
