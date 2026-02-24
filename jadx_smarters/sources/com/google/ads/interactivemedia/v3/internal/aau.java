package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class aau extends aba {
    public static final Parcelable.Creator<aau> CREATOR = new aaq(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18695c;

    public aau(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i9 = cq.f22640a;
        this.f18693a = string;
        this.f18694b = parcel.readString();
        this.f18695c = parcel.readString();
    }

    public aau(String str, String str2, String str3) {
        super("COMM");
        this.f18693a = str;
        this.f18694b = str2;
        this.f18695c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aau.class == obj.getClass()) {
            aau aauVar = (aau) obj;
            if (cq.V(this.f18694b, aauVar.f18694b) && cq.V(this.f18693a, aauVar.f18693a) && cq.V(this.f18695c, aauVar.f18695c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18693a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f18694b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18695c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aba
    public final String toString() {
        return this.f18711f + ": language=" + this.f18693a + ", description=" + this.f18694b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18711f);
        parcel.writeString(this.f18693a);
        parcel.writeString(this.f18695c);
    }
}
