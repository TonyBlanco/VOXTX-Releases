package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1319n implements Parcelable {
    public static final Parcelable.Creator<C1319n> CREATOR = new C1316m(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f23852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f23855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23856e;

    public C1319n(Parcel parcel) {
        this.f23852a = new UUID(parcel.readLong(), parcel.readLong());
        this.f23853b = parcel.readString();
        String string = parcel.readString();
        int i9 = cq.f22640a;
        this.f23854c = string;
        this.f23855d = parcel.createByteArray();
    }

    public C1319n(UUID uuid, String str, String str2, byte[] bArr) {
        af.s(uuid);
        this.f23852a = uuid;
        this.f23853b = str;
        af.s(str2);
        this.f23854c = str2;
        this.f23855d = bArr;
    }

    public C1319n(UUID uuid, String str, byte[] bArr) {
        this(uuid, null, str, bArr);
    }

    public final C1319n a(byte[] bArr) {
        return new C1319n(this.f23852a, this.f23853b, this.f23854c, bArr);
    }

    public final boolean b() {
        return this.f23855d != null;
    }

    public final boolean c(UUID uuid) {
        return C1304i.f23212a.equals(this.f23852a) || uuid.equals(this.f23852a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1319n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1319n c1319n = (C1319n) obj;
        return cq.V(this.f23853b, c1319n.f23853b) && cq.V(this.f23854c, c1319n.f23854c) && cq.V(this.f23852a, c1319n.f23852a) && Arrays.equals(this.f23855d, c1319n.f23855d);
    }

    public final int hashCode() {
        int i9 = this.f23856e;
        if (i9 != 0) {
            return i9;
        }
        int iHashCode = this.f23852a.hashCode() * 31;
        String str = this.f23853b;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f23854c.hashCode()) * 31) + Arrays.hashCode(this.f23855d);
        this.f23856e = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f23852a.getMostSignificantBits());
        parcel.writeLong(this.f23852a.getLeastSignificantBits());
        parcel.writeString(this.f23853b);
        parcel.writeString(this.f23854c);
        parcel.writeByteArray(this.f23855d);
    }
}
