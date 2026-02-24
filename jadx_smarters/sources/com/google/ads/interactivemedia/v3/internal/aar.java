package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class aar extends aba {
    public static final Parcelable.Creator<aar> CREATOR = new aaq(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18681a;

    /* JADX WARN: Illegal instructions before constructor call */
    public aar(Parcel parcel) {
        String string = parcel.readString();
        int i9 = cq.f22640a;
        super(string);
        this.f18681a = (byte[]) cq.G(parcel.createByteArray());
    }

    public aar(String str, byte[] bArr) {
        super(str);
        this.f18681a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aar.class == obj.getClass()) {
            aar aarVar = (aar) obj;
            if (this.f18711f.equals(aarVar.f18711f) && Arrays.equals(this.f18681a, aarVar.f18681a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18711f.hashCode() + 527) * 31) + Arrays.hashCode(this.f18681a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18711f);
        parcel.writeByteArray(this.f18681a);
    }
}
