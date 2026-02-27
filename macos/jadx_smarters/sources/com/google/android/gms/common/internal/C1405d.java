package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1405d extends AbstractC2985a {
    public static final Parcelable.Creator<C1405d> CREATOR = new C1426z();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f26789g;

    public C1405d(int i9, String str) {
        this.f26788f = i9;
        this.f26789g = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1405d)) {
            return false;
        }
        C1405d c1405d = (C1405d) obj;
        return c1405d.f26788f == this.f26788f && AbstractC1418q.b(c1405d.f26789g, this.f26789g);
    }

    public final int hashCode() {
        return this.f26788f;
    }

    public final String toString() {
        return this.f26788f + ":" + this.f26789g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10 = this.f26788f;
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, i10);
        y4.c.t(parcel, 2, this.f26789g, false);
        y4.c.b(parcel, iA);
    }
}
