package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
final class abh implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f18730a;

    public abh(int i9) {
        this.f18730a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i9 = this.f18730a;
        return i9 != 0 ? i9 != 1 ? new abj(parcel) : new abg(parcel) : new abi(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        int i10 = this.f18730a;
        return i10 != 0 ? i10 != 1 ? new abj[i9] : new abg[i9] : new abi[i9];
    }
}
