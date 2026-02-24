package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: e7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1747a extends C1748b implements Parcelable {
    public static final Parcelable.Creator<C1747a> CREATOR = new C0322a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f40449j;

    /* JADX INFO: renamed from: e7.a$a, reason: collision with other inner class name */
    public class C0322a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1747a createFromParcel(Parcel parcel) {
            C1747a c1747a = new C1747a();
            c1747a.J(parcel.readLong());
            c1747a.K(parcel.readString());
            c1747a.L(parcel.readString());
            c1747a.N(parcel.readLong());
            c1747a.G(parcel.readString());
            c1747a.H(parcel.readString());
            c1747a.I(parcel.readLong());
            c1747a.M(parcel.readByte() != 0);
            c1747a.P(parcel.readLong());
            return c1747a;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1747a[] newArray(int i9) {
            return new C1747a[i9];
        }
    }

    public long O() {
        return this.f40449j;
    }

    public void P(long j9) {
        this.f40449j = j9;
    }

    @Override // e7.C1748b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // e7.C1748b, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(v());
        parcel.writeString(w());
        parcel.writeString(x());
        parcel.writeLong(A());
        parcel.writeString(m());
        parcel.writeString(r());
        parcel.writeLong(t());
        parcel.writeByte(C() ? (byte) 1 : (byte) 0);
        parcel.writeLong(O());
    }
}
