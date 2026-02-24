package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1420t extends AbstractC2985a {
    public static final Parcelable.Creator<C1420t> CREATOR = new b0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f26881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f26882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f26883j;

    public C1420t(int i9, boolean z9, boolean z10, int i10, int i11) {
        this.f26879f = i9;
        this.f26880g = z9;
        this.f26881h = z10;
        this.f26882i = i10;
        this.f26883j = i11;
    }

    public int H() {
        return this.f26882i;
    }

    public int I() {
        return this.f26883j;
    }

    public boolean J() {
        return this.f26880g;
    }

    public boolean K() {
        return this.f26881h;
    }

    public int L() {
        return this.f26879f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, L());
        y4.c.c(parcel, 2, J());
        y4.c.c(parcel, 3, K());
        y4.c.l(parcel, 4, H());
        y4.c.l(parcel, 5, I());
        y4.c.b(parcel, iA);
    }
}
