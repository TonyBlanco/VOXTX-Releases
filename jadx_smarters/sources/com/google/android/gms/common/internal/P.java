package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.InterfaceC1412k;
import w4.C2914b;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class P extends AbstractC2985a {
    public static final Parcelable.Creator<P> CREATOR = new Q();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f26774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2914b f26775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f26776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f26777j;

    public P(int i9, IBinder iBinder, C2914b c2914b, boolean z9, boolean z10) {
        this.f26773f = i9;
        this.f26774g = iBinder;
        this.f26775h = c2914b;
        this.f26776i = z9;
        this.f26777j = z10;
    }

    public final C2914b H() {
        return this.f26775h;
    }

    public final InterfaceC1412k I() {
        IBinder iBinder = this.f26774g;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC1412k.a.A(iBinder);
    }

    public final boolean J() {
        return this.f26776i;
    }

    public final boolean K() {
        return this.f26777j;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p9 = (P) obj;
        return this.f26775h.equals(p9.f26775h) && AbstractC1418q.b(I(), p9.I());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, this.f26773f);
        y4.c.k(parcel, 2, this.f26774g, false);
        y4.c.r(parcel, 3, this.f26775h, i9, false);
        y4.c.c(parcel, 4, this.f26776i);
        y4.c.c(parcel, 5, this.f26777j);
        y4.c.b(parcel, iA);
    }
}
