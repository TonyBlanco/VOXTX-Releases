package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: loaded from: classes3.dex */
public final class ba implements Comparable<ba>, Parcelable {
    public static final Parcelable.Creator<ba> CREATOR = new C1316m(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20981c;

    public ba() {
        this.f20979a = -1;
        this.f20980b = -1;
        this.f20981c = -1;
    }

    public ba(Parcel parcel) {
        this.f20979a = parcel.readInt();
        this.f20980b = parcel.readInt();
        this.f20981c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ba baVar) {
        ba baVar2 = baVar;
        int i9 = this.f20979a - baVar2.f20979a;
        if (i9 != 0) {
            return i9;
        }
        int i10 = this.f20980b - baVar2.f20980b;
        return i10 == 0 ? this.f20981c - baVar2.f20981c : i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ba.class == obj.getClass()) {
            ba baVar = (ba) obj;
            if (this.f20979a == baVar.f20979a && this.f20980b == baVar.f20980b && this.f20981c == baVar.f20981c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f20979a * 31) + this.f20980b) * 31) + this.f20981c;
    }

    public final String toString() {
        return this.f20979a + InstructionFileId.DOT + this.f20980b + InstructionFileId.DOT + this.f20981c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f20979a);
        parcel.writeInt(this.f20980b);
        parcel.writeInt(this.f20981c);
    }
}
