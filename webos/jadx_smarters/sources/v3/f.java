package v3;

import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f51309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f51310f;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i9) {
            return new f[i9];
        }
    }

    public f(Parcel parcel) {
        super("GEOB");
        this.f51307c = (String) k0.j(parcel.readString());
        this.f51308d = (String) k0.j(parcel.readString());
        this.f51309e = (String) k0.j(parcel.readString());
        this.f51310f = (byte[]) k0.j(parcel.createByteArray());
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f51307c = str;
        this.f51308d = str2;
        this.f51309e = str3;
        this.f51310f = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return k0.c(this.f51307c, fVar.f51307c) && k0.c(this.f51308d, fVar.f51308d) && k0.c(this.f51309e, fVar.f51309e) && Arrays.equals(this.f51310f, fVar.f51310f);
    }

    public int hashCode() {
        String str = this.f51307c;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f51308d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f51309e;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f51310f);
    }

    @Override // v3.i
    public String toString() {
        return this.f51316a + ": mimeType=" + this.f51307c + ", filename=" + this.f51308d + ", description=" + this.f51309e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f51307c);
        parcel.writeString(this.f51308d);
        parcel.writeString(this.f51309e);
        parcel.writeByteArray(this.f51310f);
    }
}
