package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class ass extends AbstractC2985a {
    public static final Parcelable.Creator<ass> CREATOR = new asm(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20651e;

    public ass(int i9, int i10, int i11, String str, String str2) {
        this.f20647a = i9;
        this.f20648b = i10;
        this.f20649c = str;
        this.f20650d = str2;
        this.f20651e = i11;
    }

    public ass(int i9, String str, String str2) {
        this(1, 1, apl.b(i9), str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, this.f20647a);
        y4.c.l(parcel, 2, this.f20648b);
        y4.c.t(parcel, 3, this.f20649c, false);
        y4.c.t(parcel, 4, this.f20650d, false);
        y4.c.l(parcel, 5, this.f20651e);
        y4.c.b(parcel, iA);
    }
}
