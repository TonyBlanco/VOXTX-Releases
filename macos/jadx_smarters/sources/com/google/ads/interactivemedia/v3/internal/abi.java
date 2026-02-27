package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class abi implements an {
    public static final Parcelable.Creator<abi> CREATOR = new abh(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18735e;

    public /* synthetic */ abi(Parcel parcel) {
        this.f18731a = parcel.readLong();
        this.f18732b = parcel.readLong();
        this.f18733c = parcel.readLong();
        this.f18734d = parcel.readLong();
        this.f18735e = parcel.readLong();
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
        if (obj != null && abi.class == obj.getClass()) {
            abi abiVar = (abi) obj;
            if (this.f18731a == abiVar.f18731a && this.f18732b == abiVar.f18732b && this.f18733c == abiVar.f18733c && this.f18734d == abiVar.f18734d && this.f18735e == abiVar.f18735e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((azh.f(this.f18731a) + 527) * 31) + azh.f(this.f18732b)) * 31) + azh.f(this.f18733c)) * 31) + azh.f(this.f18734d)) * 31) + azh.f(this.f18735e);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f18731a + ", photoSize=" + this.f18732b + ", photoPresentationTimestampUs=" + this.f18733c + ", videoStartPosition=" + this.f18734d + ", videoSize=" + this.f18735e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f18731a);
        parcel.writeLong(this.f18732b);
        parcel.writeLong(this.f18733c);
        parcel.writeLong(this.f18734d);
        parcel.writeLong(this.f18735e);
    }
}
