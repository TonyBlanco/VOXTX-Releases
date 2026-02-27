package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class Scope extends AbstractC2985a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new p();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f26435g;

    public Scope(int i9, String str) {
        r.h(str, "scopeUri must not be null or empty");
        this.f26434f = i9;
        this.f26435g = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public String H() {
        return this.f26435g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f26435g.equals(((Scope) obj).f26435g);
        }
        return false;
    }

    public int hashCode() {
        return this.f26435g.hashCode();
    }

    public String toString() {
        return this.f26435g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int i10 = this.f26434f;
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, i10);
        y4.c.t(parcel, 2, H(), false);
        y4.c.b(parcel, iA);
    }
}
