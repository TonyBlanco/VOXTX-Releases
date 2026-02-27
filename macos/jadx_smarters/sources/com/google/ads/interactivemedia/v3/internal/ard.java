package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class ard implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f20565a;

    public ard(int i9) {
        this.f20565a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String strF = null;
        if (this.f20565a == 0) {
            int iB = y4.b.B(parcel);
            while (parcel.dataPosition() < iB) {
                int iS = y4.b.s(parcel);
                if (y4.b.l(iS) != 1) {
                    y4.b.A(parcel, iS);
                } else {
                    strF = y4.b.f(parcel, iS);
                }
            }
            y4.b.k(parcel, iB);
            return new arc(strF);
        }
        int iB2 = y4.b.B(parcel);
        String strF2 = "";
        int iU = 0;
        while (parcel.dataPosition() < iB2) {
            int iS2 = y4.b.s(parcel);
            int iL = y4.b.l(iS2);
            if (iL == 1) {
                strF = y4.b.f(parcel, iS2);
            } else if (iL == 2) {
                iU = y4.b.u(parcel, iS2);
            } else if (iL != 3) {
                y4.b.A(parcel, iS2);
            } else {
                strF2 = y4.b.f(parcel, iS2);
            }
        }
        y4.b.k(parcel, iB2);
        return new arb(strF, iU, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return this.f20565a != 0 ? new arb[i9] : new arc[i9];
    }
}
