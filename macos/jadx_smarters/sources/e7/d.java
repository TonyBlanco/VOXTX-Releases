package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class d extends C1748b implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40462j;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            d dVar = new d();
            dVar.J(parcel.readLong());
            dVar.K(parcel.readString());
            dVar.L(parcel.readString());
            dVar.N(parcel.readLong());
            dVar.G(parcel.readString());
            dVar.H(parcel.readString());
            dVar.I(parcel.readLong());
            dVar.M(parcel.readByte() != 0);
            dVar.O(parcel.readInt());
            return dVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i9) {
            return new d[i9];
        }
    }

    public void O(int i9) {
        this.f40462j = i9;
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
        parcel.writeInt(this.f40462j);
    }
}
