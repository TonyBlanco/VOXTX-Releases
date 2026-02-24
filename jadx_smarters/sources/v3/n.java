package v3;

import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51331d;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i9) {
            return new n[i9];
        }
    }

    public n(Parcel parcel) {
        super((String) k0.j(parcel.readString()));
        this.f51330c = parcel.readString();
        this.f51331d = (String) k0.j(parcel.readString());
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f51330c = str2;
        this.f51331d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f51316a.equals(nVar.f51316a) && k0.c(this.f51330c, nVar.f51330c) && k0.c(this.f51331d, nVar.f51331d);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f51316a.hashCode()) * 31;
        String str = this.f51330c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f51331d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // v3.i
    public String toString() {
        return this.f51316a + ": url=" + this.f51331d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f51316a);
        parcel.writeString(this.f51330c);
        parcel.writeString(this.f51331d);
    }
}
