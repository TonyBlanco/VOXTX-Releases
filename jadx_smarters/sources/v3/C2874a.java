package v3;

import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;
import java.util.Arrays;

/* JADX INFO: renamed from: v3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2874a extends i {
    public static final Parcelable.Creator<C2874a> CREATOR = new C0473a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f51291f;

    /* JADX INFO: renamed from: v3.a$a, reason: collision with other inner class name */
    public class C0473a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2874a createFromParcel(Parcel parcel) {
            return new C2874a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2874a[] newArray(int i9) {
            return new C2874a[i9];
        }
    }

    public C2874a(Parcel parcel) {
        super("APIC");
        this.f51288c = (String) k0.j(parcel.readString());
        this.f51289d = parcel.readString();
        this.f51290e = parcel.readInt();
        this.f51291f = (byte[]) k0.j(parcel.createByteArray());
    }

    public C2874a(String str, String str2, int i9, byte[] bArr) {
        super("APIC");
        this.f51288c = str;
        this.f51289d = str2;
        this.f51290e = i9;
        this.f51291f = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2874a.class != obj.getClass()) {
            return false;
        }
        C2874a c2874a = (C2874a) obj;
        return this.f51290e == c2874a.f51290e && k0.c(this.f51288c, c2874a.f51288c) && k0.c(this.f51289d, c2874a.f51289d) && Arrays.equals(this.f51291f, c2874a.f51291f);
    }

    public int hashCode() {
        int i9 = (527 + this.f51290e) * 31;
        String str = this.f51288c;
        int iHashCode = (i9 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f51289d;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f51291f);
    }

    @Override // v3.i, q3.C2540a.b
    public void populateMediaMetadata(R0.b bVar) {
        bVar.I(this.f51291f, this.f51290e);
    }

    @Override // v3.i
    public String toString() {
        return this.f51316a + ": mimeType=" + this.f51288c + ", description=" + this.f51289d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f51288c);
        parcel.writeString(this.f51289d);
        parcel.writeInt(this.f51290e);
        parcel.writeByteArray(this.f51291f);
    }
}
