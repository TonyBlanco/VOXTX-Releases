package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class abc extends aba {
    public static final Parcelable.Creator<abc> CREATOR = new aaq(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f18718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f18719e;

    public abc(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f18715a = i9;
        this.f18716b = i10;
        this.f18717c = i11;
        this.f18718d = iArr;
        this.f18719e = iArr2;
    }

    public abc(Parcel parcel) {
        super("MLLT");
        this.f18715a = parcel.readInt();
        this.f18716b = parcel.readInt();
        this.f18717c = parcel.readInt();
        this.f18718d = (int[]) cq.G(parcel.createIntArray());
        this.f18719e = (int[]) cq.G(parcel.createIntArray());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aba, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && abc.class == obj.getClass()) {
            abc abcVar = (abc) obj;
            if (this.f18715a == abcVar.f18715a && this.f18716b == abcVar.f18716b && this.f18717c == abcVar.f18717c && Arrays.equals(this.f18718d, abcVar.f18718d) && Arrays.equals(this.f18719e, abcVar.f18719e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f18715a + 527) * 31) + this.f18716b) * 31) + this.f18717c) * 31) + Arrays.hashCode(this.f18718d)) * 31) + Arrays.hashCode(this.f18719e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f18715a);
        parcel.writeInt(this.f18716b);
        parcel.writeInt(this.f18717c);
        parcel.writeIntArray(this.f18718d);
        parcel.writeIntArray(this.f18719e);
    }
}
