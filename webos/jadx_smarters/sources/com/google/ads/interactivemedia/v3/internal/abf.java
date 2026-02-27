package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class abf extends aba {
    public static final Parcelable.Creator<abf> CREATOR = new aaq(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18725b;

    /* JADX WARN: Illegal instructions before constructor call */
    public abf(Parcel parcel) {
        String string = parcel.readString();
        int i9 = cq.f22640a;
        super(string);
        this.f18724a = parcel.readString();
        this.f18725b = parcel.readString();
    }

    public abf(String str, String str2, String str3) {
        super(str);
        this.f18724a = str2;
        this.f18725b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && abf.class == obj.getClass()) {
            abf abfVar = (abf) obj;
            if (this.f18711f.equals(abfVar.f18711f) && cq.V(this.f18724a, abfVar.f18724a) && cq.V(this.f18725b, abfVar.f18725b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f18711f.hashCode() + 527) * 31;
        String str = this.f18724a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18725b;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aba
    public final String toString() {
        return this.f18711f + ": url=" + this.f18725b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18711f);
        parcel.writeString(this.f18724a);
        parcel.writeString(this.f18725b);
    }
}
