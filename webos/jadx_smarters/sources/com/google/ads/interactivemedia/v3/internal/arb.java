package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class arb extends AbstractC2985a {
    public static final Parcelable.Creator<arb> CREATOR = new ard(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20563c;

    @Hide
    public arb(String str, int i9, String str2) {
        this.f20561a = str;
        this.f20562b = i9;
        this.f20563c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, this.f20561a, false);
        y4.c.l(parcel, 2, this.f20562b);
        y4.c.t(parcel, 3, this.f20563c, false);
        y4.c.b(parcel, iA);
    }
}
