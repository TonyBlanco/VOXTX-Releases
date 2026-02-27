package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w4.C2916d;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends AbstractC2985a {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f26844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2916d[] f26845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1407f f26847i;

    public k0(Bundle bundle, C2916d[] c2916dArr, int i9, C1407f c1407f) {
        this.f26844f = bundle;
        this.f26845g = c2916dArr;
        this.f26846h = i9;
        this.f26847i = c1407f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.e(parcel, 1, this.f26844f, false);
        y4.c.w(parcel, 2, this.f26845g, i9, false);
        y4.c.l(parcel, 3, this.f26846h);
        y4.c.r(parcel, 4, this.f26847i, i9, false);
        y4.c.b(parcel, iA);
    }
}
