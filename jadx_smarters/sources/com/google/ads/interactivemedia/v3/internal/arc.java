package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class arc extends AbstractC2985a {
    public static final Parcelable.Creator<arc> CREATOR = new ard(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20564a;

    @Hide
    public arc(String str) {
        this.f20564a = str;
    }

    public final String a() {
        return this.f20564a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, a(), false);
        y4.c.b(parcel, iA);
    }
}
