package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1407f extends AbstractC2985a {
    public static final Parcelable.Creator<C1407f> CREATOR = new m0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1420t f26810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f26812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f26813i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f26814j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f26815k;

    public C1407f(C1420t c1420t, boolean z9, boolean z10, int[] iArr, int i9, int[] iArr2) {
        this.f26810f = c1420t;
        this.f26811g = z9;
        this.f26812h = z10;
        this.f26813i = iArr;
        this.f26814j = i9;
        this.f26815k = iArr2;
    }

    public int H() {
        return this.f26814j;
    }

    public int[] I() {
        return this.f26813i;
    }

    public int[] J() {
        return this.f26815k;
    }

    public boolean K() {
        return this.f26811g;
    }

    public boolean L() {
        return this.f26812h;
    }

    public final C1420t M() {
        return this.f26810f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.r(parcel, 1, this.f26810f, i9, false);
        y4.c.c(parcel, 2, K());
        y4.c.c(parcel, 3, L());
        y4.c.m(parcel, 4, I(), false);
        y4.c.l(parcel, 5, H());
        y4.c.m(parcel, 6, J(), false);
        y4.c.b(parcel, iA);
    }
}
