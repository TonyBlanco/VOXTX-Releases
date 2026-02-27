package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class aav extends aba {
    public static final Parcelable.Creator<aav> CREATOR = new aaq(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18699d;

    public aav(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i9 = cq.f22640a;
        this.f18696a = string;
        this.f18697b = parcel.readString();
        this.f18698c = parcel.readString();
        this.f18699d = (byte[]) cq.G(parcel.createByteArray());
    }

    public aav(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f18696a = str;
        this.f18697b = str2;
        this.f18698c = str3;
        this.f18699d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aav.class == obj.getClass()) {
            aav aavVar = (aav) obj;
            if (cq.V(this.f18696a, aavVar.f18696a) && cq.V(this.f18697b, aavVar.f18697b) && cq.V(this.f18698c, aavVar.f18698c) && Arrays.equals(this.f18699d, aavVar.f18699d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18696a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f18697b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18698c;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f18699d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aba
    public final String toString() {
        return this.f18711f + ": mimeType=" + this.f18696a + ", filename=" + this.f18697b + ", description=" + this.f18698c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18696a);
        parcel.writeString(this.f18697b);
        parcel.writeString(this.f18698c);
        parcel.writeByteArray(this.f18699d);
    }
}
