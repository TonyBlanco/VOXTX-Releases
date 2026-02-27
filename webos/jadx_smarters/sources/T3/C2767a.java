package t3;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;
import q3.AbstractC2541b;
import q3.C2540a;

/* JADX INFO: renamed from: t3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2767a implements C2540a.b {
    public static final Parcelable.Creator<C2767a> CREATOR = new C0456a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50640a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50641c;

    /* JADX INFO: renamed from: t3.a$a, reason: collision with other inner class name */
    public class C0456a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2767a createFromParcel(Parcel parcel) {
            return new C2767a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2767a[] newArray(int i9) {
            return new C2767a[i9];
        }
    }

    public C2767a(Parcel parcel) {
        this.f50640a = (String) k0.j(parcel.readString());
        this.f50641c = (String) k0.j(parcel.readString());
    }

    public C2767a(String str, String str2) {
        this.f50640a = str;
        this.f50641c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2767a c2767a = (C2767a) obj;
        return this.f50640a.equals(c2767a.f50640a) && this.f50641c.equals(c2767a.f50641c);
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
        return ((527 + this.f50640a.hashCode()) * 31) + this.f50641c.hashCode();
    }

    @Override // q3.C2540a.b
    public void populateMediaMetadata(R0.b bVar) {
        String str = this.f50640a;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                bVar.N(this.f50641c);
                break;
            case "TITLE":
                bVar.m0(this.f50641c);
                break;
            case "DESCRIPTION":
                bVar.U(this.f50641c);
                break;
            case "ALBUMARTIST":
                bVar.M(this.f50641c);
                break;
            case "ARTIST":
                bVar.O(this.f50641c);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.f50640a + "=" + this.f50641c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f50640a);
        parcel.writeString(this.f50641c);
    }
}
