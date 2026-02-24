package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
final class aaq implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f18680a;

    public aaq(int i9) {
        this.f18680a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.f18680a) {
            case 0:
                return new aar(parcel);
            case 1:
                return new aap(parcel);
            case 2:
                return new aas(parcel);
            case 3:
                return new aat(parcel);
            case 4:
                return new aau(parcel);
            case 5:
                return new aav(parcel);
            case 6:
                return new abb(parcel);
            case 7:
                return new abc(parcel);
            case 8:
                return new abd(parcel);
            case 9:
                return new abe(parcel);
            default:
                return new abf(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        switch (this.f18680a) {
            case 0:
                return new aar[i9];
            case 1:
                return new aap[i9];
            case 2:
                return new aas[i9];
            case 3:
                return new aat[i9];
            case 4:
                return new aau[i9];
            case 5:
                return new aav[i9];
            case 6:
                return new abb[i9];
            case 7:
                return new abc[i9];
            case 8:
                return new abd[i9];
            case 9:
                return new abe[i9];
            default:
                return new abf[i9];
        }
    }
}
