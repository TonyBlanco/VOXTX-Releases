package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C1316m implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f23763a;

    public C1316m(int i9) {
        this.f23763a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i9 = this.f23763a;
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? new ba(parcel) : new ao(parcel) : new C1322o(parcel) : new C1319n(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        int i10 = this.f23763a;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? new ba[i9] : new ao[i9] : new C1322o[i9] : new C1319n[i9];
    }
}
