package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
final class pl implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f24107a;

    public pl(int i9) {
        this.f24107a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.f24107a != 0 ? new pn(parcel) : new pm(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return this.f24107a != 0 ? new pn[i9] : new pm[i9];
    }
}
