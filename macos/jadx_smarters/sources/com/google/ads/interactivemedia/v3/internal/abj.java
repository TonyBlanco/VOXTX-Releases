package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class abj implements an {
    public static final Parcelable.Creator<abj> CREATOR = new abh(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18737b;

    public abj(float f9, int i9) {
        this.f18736a = f9;
        this.f18737b = i9;
    }

    public /* synthetic */ abj(Parcel parcel) {
        this.f18736a = parcel.readFloat();
        this.f18737b = parcel.readInt();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.an
    public final /* synthetic */ void a(ak akVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && abj.class == obj.getClass()) {
            abj abjVar = (abj) obj;
            if (this.f18736a == abjVar.f18736a && this.f18737b == abjVar.f18737b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f18736a).hashCode() + 527) * 31) + this.f18737b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f18736a + ", svcTemporalLayerCount=" + this.f18737b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeFloat(this.f18736a);
        parcel.writeInt(this.f18737b);
    }
}
