package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class abb extends aba {
    public static final Parcelable.Creator<abb> CREATOR = new aaq(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18714c;

    public abb(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i9 = cq.f22640a;
        this.f18712a = string;
        this.f18713b = parcel.readString();
        this.f18714c = parcel.readString();
    }

    public abb(String str, String str2, String str3) {
        super("----");
        this.f18712a = str;
        this.f18713b = str2;
        this.f18714c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && abb.class == obj.getClass()) {
            abb abbVar = (abb) obj;
            if (cq.V(this.f18713b, abbVar.f18713b) && cq.V(this.f18712a, abbVar.f18712a) && cq.V(this.f18714c, abbVar.f18714c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18712a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f18713b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18714c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aba
    public final String toString() {
        return this.f18711f + ": domain=" + this.f18712a + ", description=" + this.f18713b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18711f);
        parcel.writeString(this.f18712a);
        parcel.writeString(this.f18714c);
    }
}
