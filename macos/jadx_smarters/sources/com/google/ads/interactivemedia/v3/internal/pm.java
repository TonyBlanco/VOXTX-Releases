package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class pm implements Parcelable {
    public static final Parcelable.Creator<pm> CREATOR = new pl(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24113f;

    public pm(int i9, int i10, String str, String str2, String str3, String str4) {
        this.f24108a = i9;
        this.f24109b = i10;
        this.f24110c = str;
        this.f24111d = str2;
        this.f24112e = str3;
        this.f24113f = str4;
    }

    public pm(Parcel parcel) {
        this.f24108a = parcel.readInt();
        this.f24109b = parcel.readInt();
        this.f24110c = parcel.readString();
        this.f24111d = parcel.readString();
        this.f24112e = parcel.readString();
        this.f24113f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pm.class == obj.getClass()) {
            pm pmVar = (pm) obj;
            if (this.f24108a == pmVar.f24108a && this.f24109b == pmVar.f24109b && TextUtils.equals(this.f24110c, pmVar.f24110c) && TextUtils.equals(this.f24111d, pmVar.f24111d) && TextUtils.equals(this.f24112e, pmVar.f24112e) && TextUtils.equals(this.f24113f, pmVar.f24113f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = ((this.f24108a * 31) + this.f24109b) * 31;
        String str = this.f24110c;
        int iHashCode = (i9 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24111d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24112e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f24113f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f24108a);
        parcel.writeInt(this.f24109b);
        parcel.writeString(this.f24110c);
        parcel.writeString(this.f24111d);
        parcel.writeString(this.f24112e);
        parcel.writeString(this.f24113f);
    }
}
