package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        Bundle bundleA = null;
        C2916d[] c2916dArr = null;
        C1407f c1407f = null;
        int iU = 0;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            int iL = y4.b.l(iS);
            if (iL == 1) {
                bundleA = y4.b.a(parcel, iS);
            } else if (iL == 2) {
                c2916dArr = (C2916d[]) y4.b.i(parcel, iS, C2916d.CREATOR);
            } else if (iL == 3) {
                iU = y4.b.u(parcel, iS);
            } else if (iL != 4) {
                y4.b.A(parcel, iS);
            } else {
                c1407f = (C1407f) y4.b.e(parcel, iS, C1407f.CREATOR);
            }
        }
        y4.b.k(parcel, iB);
        return new k0(bundleA, c2916dArr, iU, c1407f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new k0[i9];
    }
}
