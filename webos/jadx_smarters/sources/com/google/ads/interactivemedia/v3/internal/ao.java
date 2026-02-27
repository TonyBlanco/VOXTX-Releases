package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ao implements Parcelable {
    public static final Parcelable.Creator<ao> CREATOR = new C1316m(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final an[] f20399b;

    public ao(long j9, an... anVarArr) {
        this.f20398a = j9;
        this.f20399b = anVarArr;
    }

    public ao(Parcel parcel) {
        this.f20399b = new an[parcel.readInt()];
        int i9 = 0;
        while (true) {
            an[] anVarArr = this.f20399b;
            if (i9 >= anVarArr.length) {
                this.f20398a = parcel.readLong();
                return;
            } else {
                anVarArr[i9] = (an) parcel.readParcelable(an.class.getClassLoader());
                i9++;
            }
        }
    }

    public ao(List list) {
        this((an[]) list.toArray(new an[0]));
    }

    public ao(an... anVarArr) {
        this(-9223372036854775807L, anVarArr);
    }

    public final int a() {
        return this.f20399b.length;
    }

    public final an b(int i9) {
        return this.f20399b[i9];
    }

    public final ao c(an... anVarArr) {
        return anVarArr.length == 0 ? this : new ao(this.f20398a, (an[]) cq.ah(this.f20399b, anVarArr));
    }

    public final ao d(ao aoVar) {
        return aoVar == null ? this : c(aoVar.f20399b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ao.class == obj.getClass()) {
            ao aoVar = (ao) obj;
            if (Arrays.equals(this.f20399b, aoVar.f20399b) && this.f20398a == aoVar.f20398a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f20399b) * 31) + azh.f(this.f20398a);
    }

    public final String toString() {
        String str;
        String string = Arrays.toString(this.f20399b);
        long j9 = this.f20398a;
        if (j9 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j9;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f20399b.length);
        for (an anVar : this.f20399b) {
            parcel.writeParcelable(anVar, 0);
        }
        parcel.writeLong(this.f20398a);
    }
}
