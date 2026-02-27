package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class asm implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f20633a;

    public asm(int i9) {
        this.f20633a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i9 = this.f20633a;
        byte[] bArrB = null;
        byte[] bArrB2 = null;
        String strF = null;
        int iU = 0;
        if (i9 == 0) {
            int iB = y4.b.B(parcel);
            while (parcel.dataPosition() < iB) {
                int iS = y4.b.s(parcel);
                int iL = y4.b.l(iS);
                if (iL == 1) {
                    iU = y4.b.u(parcel, iS);
                } else if (iL != 2) {
                    y4.b.A(parcel, iS);
                } else {
                    bArrB = y4.b.b(parcel, iS);
                }
            }
            y4.b.k(parcel, iB);
            return new asl(iU, bArrB);
        }
        if (i9 == 1) {
            int iB2 = y4.b.B(parcel);
            String strF2 = null;
            int iU2 = 0;
            while (parcel.dataPosition() < iB2) {
                int iS2 = y4.b.s(parcel);
                int iL2 = y4.b.l(iS2);
                if (iL2 == 1) {
                    iU2 = y4.b.u(parcel, iS2);
                } else if (iL2 == 2) {
                    strF = y4.b.f(parcel, iS2);
                } else if (iL2 != 3) {
                    y4.b.A(parcel, iS2);
                } else {
                    strF2 = y4.b.f(parcel, iS2);
                }
            }
            y4.b.k(parcel, iB2);
            return new ask(iU2, strF, strF2);
        }
        if (i9 != 2) {
            int iB3 = y4.b.B(parcel);
            int iU3 = 0;
            while (parcel.dataPosition() < iB3) {
                int iS3 = y4.b.s(parcel);
                int iL3 = y4.b.l(iS3);
                if (iL3 == 1) {
                    iU = y4.b.u(parcel, iS3);
                } else if (iL3 == 2) {
                    bArrB2 = y4.b.b(parcel, iS3);
                } else if (iL3 != 3) {
                    y4.b.A(parcel, iS3);
                } else {
                    iU3 = y4.b.u(parcel, iS3);
                }
            }
            y4.b.k(parcel, iB3);
            return new ast(iU, bArrB2, iU3);
        }
        int iB4 = y4.b.B(parcel);
        String strF3 = null;
        String strF4 = null;
        int iU4 = 0;
        int iU5 = 0;
        int iU6 = 0;
        while (parcel.dataPosition() < iB4) {
            int iS4 = y4.b.s(parcel);
            int iL4 = y4.b.l(iS4);
            if (iL4 == 1) {
                iU4 = y4.b.u(parcel, iS4);
            } else if (iL4 == 2) {
                iU5 = y4.b.u(parcel, iS4);
            } else if (iL4 == 3) {
                strF3 = y4.b.f(parcel, iS4);
            } else if (iL4 == 4) {
                strF4 = y4.b.f(parcel, iS4);
            } else if (iL4 != 5) {
                y4.b.A(parcel, iS4);
            } else {
                iU6 = y4.b.u(parcel, iS4);
            }
        }
        y4.b.k(parcel, iB4);
        return new ass(iU4, iU5, iU6, strF3, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        int i10 = this.f20633a;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? new ast[i9] : new ass[i9] : new ask[i9] : new asl[i9];
    }
}
