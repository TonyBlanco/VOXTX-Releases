package u3;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import d4.AbstractC1684a;
import java.util.Arrays;
import q3.AbstractC2541b;
import q3.C2540a;

/* JADX INFO: renamed from: u3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2852c implements C2540a.b {
    public static final Parcelable.Creator<C2852c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f51206a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51208d;

    /* JADX INFO: renamed from: u3.c$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2852c createFromParcel(Parcel parcel) {
            return new C2852c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2852c[] newArray(int i9) {
            return new C2852c[i9];
        }
    }

    public C2852c(Parcel parcel) {
        this.f51206a = (byte[]) AbstractC1684a.e(parcel.createByteArray());
        this.f51207c = parcel.readString();
        this.f51208d = parcel.readString();
    }

    public C2852c(byte[] bArr, String str, String str2) {
        this.f51206a = bArr;
        this.f51207c = str;
        this.f51208d = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2852c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f51206a, ((C2852c) obj).f51206a);
    }

    @Override // q3.C2540a.b
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return AbstractC2541b.a(this);
    }

    @Override // q3.C2540a.b
    public /* synthetic */ C0936z0 getWrappedMetadataFormat() {
        return AbstractC2541b.b(this);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f51206a);
    }

    @Override // q3.C2540a.b
    public void populateMediaMetadata(R0.b bVar) {
        String str = this.f51207c;
        if (str != null) {
            bVar.m0(str);
        }
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f51207c, this.f51208d, Integer.valueOf(this.f51206a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeByteArray(this.f51206a);
        parcel.writeString(this.f51207c);
        parcel.writeString(this.f51208d);
    }
}
