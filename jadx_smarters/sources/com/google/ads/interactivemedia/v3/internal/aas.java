package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class aas extends aba {
    public static final Parcelable.Creator<aas> CREATOR = new aaq(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18686e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final aba[] f18687g;

    public aas(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i9 = cq.f22640a;
        this.f18682a = string;
        this.f18683b = parcel.readInt();
        this.f18684c = parcel.readInt();
        this.f18685d = parcel.readLong();
        this.f18686e = parcel.readLong();
        int i10 = parcel.readInt();
        this.f18687g = new aba[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18687g[i11] = (aba) parcel.readParcelable(aba.class.getClassLoader());
        }
    }

    public aas(String str, int i9, int i10, long j9, long j10, aba[] abaVarArr) {
        super("CHAP");
        this.f18682a = str;
        this.f18683b = i9;
        this.f18684c = i10;
        this.f18685d = j9;
        this.f18686e = j10;
        this.f18687g = abaVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aba, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aas.class == obj.getClass()) {
            aas aasVar = (aas) obj;
            if (this.f18683b == aasVar.f18683b && this.f18684c == aasVar.f18684c && this.f18685d == aasVar.f18685d && this.f18686e == aasVar.f18686e && cq.V(this.f18682a, aasVar.f18682a) && Arrays.equals(this.f18687g, aasVar.f18687g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = (((((((this.f18683b + 527) * 31) + this.f18684c) * 31) + ((int) this.f18685d)) * 31) + ((int) this.f18686e)) * 31;
        String str = this.f18682a;
        return i9 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18682a);
        parcel.writeInt(this.f18683b);
        parcel.writeInt(this.f18684c);
        parcel.writeLong(this.f18685d);
        parcel.writeLong(this.f18686e);
        parcel.writeInt(this.f18687g.length);
        for (aba abaVar : this.f18687g) {
            parcel.writeParcelable(abaVar, 0);
        }
    }
}
