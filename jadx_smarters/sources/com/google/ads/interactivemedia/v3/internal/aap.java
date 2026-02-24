package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class aap extends aba {
    public static final Parcelable.Creator<aap> CREATOR = new aaq(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18679d;

    public aap(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i9 = cq.f22640a;
        this.f18676a = string;
        this.f18677b = parcel.readString();
        this.f18678c = parcel.readInt();
        this.f18679d = (byte[]) cq.G(parcel.createByteArray());
    }

    public aap(String str, String str2, int i9, byte[] bArr) {
        super("APIC");
        this.f18676a = str;
        this.f18677b = str2;
        this.f18678c = i9;
        this.f18679d = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aba, com.google.ads.interactivemedia.v3.internal.an
    public final void a(ak akVar) {
        akVar.v(this.f18679d, this.f18678c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aap.class == obj.getClass()) {
            aap aapVar = (aap) obj;
            if (this.f18678c == aapVar.f18678c && cq.V(this.f18676a, aapVar.f18676a) && cq.V(this.f18677b, aapVar.f18677b) && Arrays.equals(this.f18679d, aapVar.f18679d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = (this.f18678c + 527) * 31;
        String str = this.f18676a;
        int iHashCode = (i9 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18677b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f18679d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aba
    public final String toString() {
        return this.f18711f + ": mimeType=" + this.f18676a + ", description=" + this.f18677b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18676a);
        parcel.writeString(this.f18677b);
        parcel.writeInt(this.f18678c);
        parcel.writeByteArray(this.f18679d);
    }
}
