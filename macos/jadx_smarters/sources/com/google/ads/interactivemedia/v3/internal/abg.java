package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class abg implements an {
    public static final Parcelable.Creator<abg> CREATOR = new abh(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18729d;

    public /* synthetic */ abg(Parcel parcel) {
        String string = parcel.readString();
        int i9 = cq.f22640a;
        this.f18726a = string;
        this.f18727b = (byte[]) cq.G(parcel.createByteArray());
        this.f18728c = parcel.readInt();
        this.f18729d = parcel.readInt();
    }

    public abg(String str, byte[] bArr, int i9, int i10) {
        this.f18726a = str;
        this.f18727b = bArr;
        this.f18728c = i9;
        this.f18729d = i10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.an
    public final /* synthetic */ void a(ak akVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && abg.class == obj.getClass()) {
            abg abgVar = (abg) obj;
            if (this.f18726a.equals(abgVar.f18726a) && Arrays.equals(this.f18727b, abgVar.f18727b) && this.f18728c == abgVar.f18728c && this.f18729d == abgVar.f18729d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f18726a.hashCode() + 527) * 31) + Arrays.hashCode(this.f18727b)) * 31) + this.f18728c) * 31) + this.f18729d;
    }

    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.f18726a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18726a);
        parcel.writeByteArray(this.f18727b);
        parcel.writeInt(this.f18728c);
        parcel.writeInt(this.f18729d);
    }
}
