package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class abd extends aba {
    public static final Parcelable.Creator<abd> CREATOR = new aaq(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18721b;

    public abd(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i9 = cq.f22640a;
        this.f18720a = string;
        this.f18721b = (byte[]) cq.G(parcel.createByteArray());
    }

    public abd(String str, byte[] bArr) {
        super("PRIV");
        this.f18720a = str;
        this.f18721b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && abd.class == obj.getClass()) {
            abd abdVar = (abd) obj;
            if (cq.V(this.f18720a, abdVar.f18720a) && Arrays.equals(this.f18721b, abdVar.f18721b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18720a;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f18721b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aba
    public final String toString() {
        return this.f18711f + ": owner=" + this.f18720a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18720a);
        parcel.writeByteArray(this.f18721b);
    }
}
