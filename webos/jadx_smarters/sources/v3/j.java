package v3;

import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f51319e;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i9) {
            return new j[i9];
        }
    }

    public j(Parcel parcel) {
        super("----");
        this.f51317c = (String) k0.j(parcel.readString());
        this.f51318d = (String) k0.j(parcel.readString());
        this.f51319e = (String) k0.j(parcel.readString());
    }

    public j(String str, String str2, String str3) {
        super("----");
        this.f51317c = str;
        this.f51318d = str2;
        this.f51319e = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return k0.c(this.f51318d, jVar.f51318d) && k0.c(this.f51317c, jVar.f51317c) && k0.c(this.f51319e, jVar.f51319e);
    }

    public int hashCode() {
        String str = this.f51317c;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f51318d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f51319e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // v3.i
    public String toString() {
        return this.f51316a + ": domain=" + this.f51317c + ", description=" + this.f51318d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f51316a);
        parcel.writeString(this.f51317c);
        parcel.writeString(this.f51319e);
    }
}
