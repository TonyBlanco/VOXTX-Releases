package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iB = y4.b.B(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleA = null;
        String strF4 = null;
        long jW = 0;
        long jW2 = 0;
        boolean zM = false;
        while (parcel.dataPosition() < iB) {
            int iS = y4.b.s(parcel);
            switch (y4.b.l(iS)) {
                case 1:
                    jW = y4.b.w(parcel, iS);
                    break;
                case 2:
                    jW2 = y4.b.w(parcel, iS);
                    break;
                case 3:
                    zM = y4.b.m(parcel, iS);
                    break;
                case 4:
                    strF = y4.b.f(parcel, iS);
                    break;
                case 5:
                    strF2 = y4.b.f(parcel, iS);
                    break;
                case 6:
                    strF3 = y4.b.f(parcel, iS);
                    break;
                case 7:
                    bundleA = y4.b.a(parcel, iS);
                    break;
                case 8:
                    strF4 = y4.b.f(parcel, iS);
                    break;
                default:
                    y4.b.A(parcel, iS);
                    break;
            }
        }
        y4.b.k(parcel, iB);
        return new zzcl(jW, jW2, zM, strF, strF2, strF3, bundleA, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new zzcl[i9];
    }
}
