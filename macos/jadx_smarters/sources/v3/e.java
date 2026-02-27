package v3;

import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f51306e;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i9) {
            return new e[i9];
        }
    }

    public e(Parcel parcel) {
        super("COMM");
        this.f51304c = (String) k0.j(parcel.readString());
        this.f51305d = (String) k0.j(parcel.readString());
        this.f51306e = (String) k0.j(parcel.readString());
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f51304c = str;
        this.f51305d = str2;
        this.f51306e = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return k0.c(this.f51305d, eVar.f51305d) && k0.c(this.f51304c, eVar.f51304c) && k0.c(this.f51306e, eVar.f51306e);
    }

    public int hashCode() {
        String str = this.f51304c;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f51305d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f51306e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // v3.i
    public String toString() {
        return this.f51316a + ": language=" + this.f51304c + ", description=" + this.f51305d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f51316a);
        parcel.writeString(this.f51304c);
        parcel.writeString(this.f51306e);
    }
}
