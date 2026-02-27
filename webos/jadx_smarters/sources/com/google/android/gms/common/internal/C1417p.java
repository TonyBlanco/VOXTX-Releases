package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1417p extends AbstractC2985a {
    public static final Parcelable.Creator<C1417p> CREATOR = new M();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f26860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f26861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f26862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f26863l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f26864m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f26865n;

    public C1417p(int i9, int i10, int i11, long j9, long j10, String str, String str2, int i12, int i13) {
        this.f26857f = i9;
        this.f26858g = i10;
        this.f26859h = i11;
        this.f26860i = j9;
        this.f26861j = j10;
        this.f26862k = str;
        this.f26863l = str2;
        this.f26864m = i12;
        this.f26865n = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10 = this.f26857f;
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, i10);
        y4.c.l(parcel, 2, this.f26858g);
        y4.c.l(parcel, 3, this.f26859h);
        y4.c.o(parcel, 4, this.f26860i);
        y4.c.o(parcel, 5, this.f26861j);
        y4.c.t(parcel, 6, this.f26862k, false);
        y4.c.t(parcel, 7, this.f26863l, false);
        y4.c.l(parcel, 8, this.f26864m);
        y4.c.l(parcel, 9, this.f26865n);
        y4.c.b(parcel, iA);
    }
}
