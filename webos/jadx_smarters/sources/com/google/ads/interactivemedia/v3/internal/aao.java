package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class aao implements an {
    public static final Parcelable.Creator<aao> CREATOR = new aan();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18675f;

    public aao(int i9, String str, String str2, String str3, boolean z9, int i10) {
        boolean z10 = true;
        if (i10 != -1 && i10 <= 0) {
            z10 = false;
        }
        af.u(z10);
        this.f18670a = i9;
        this.f18671b = str;
        this.f18672c = str2;
        this.f18673d = str3;
        this.f18674e = z9;
        this.f18675f = i10;
    }

    public aao(Parcel parcel) {
        this.f18670a = parcel.readInt();
        this.f18671b = parcel.readString();
        this.f18672c = parcel.readString();
        this.f18673d = parcel.readString();
        this.f18674e = cq.ac(parcel);
        this.f18675f = parcel.readInt();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.an
    public final void a(ak akVar) {
        String str = this.f18672c;
        if (str != null) {
            akVar.K(str);
        }
        String str2 = this.f18671b;
        if (str2 != null) {
            akVar.D(str2);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aao.class == obj.getClass()) {
            aao aaoVar = (aao) obj;
            if (this.f18670a == aaoVar.f18670a && cq.V(this.f18671b, aaoVar.f18671b) && cq.V(this.f18672c, aaoVar.f18672c) && cq.V(this.f18673d, aaoVar.f18673d) && this.f18674e == aaoVar.f18674e && this.f18675f == aaoVar.f18675f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = (this.f18670a + 527) * 31;
        String str = this.f18671b;
        int iHashCode = (i9 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18672c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18673d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f18674e ? 1 : 0)) * 31) + this.f18675f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f18672c + "\", genre=\"" + this.f18671b + "\", bitrate=" + this.f18670a + ", metadataInterval=" + this.f18675f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f18670a);
        parcel.writeString(this.f18671b);
        parcel.writeString(this.f18672c);
        parcel.writeString(this.f18673d);
        cq.U(parcel, this.f18674e);
        parcel.writeInt(this.f18675f);
    }
}
