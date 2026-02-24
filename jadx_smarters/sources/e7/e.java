package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class e extends C1748b implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f40463j;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            e eVar = new e();
            eVar.J(parcel.readLong());
            eVar.K(parcel.readString());
            eVar.L(parcel.readString());
            eVar.N(parcel.readLong());
            eVar.G(parcel.readString());
            eVar.H(parcel.readString());
            eVar.I(parcel.readLong());
            eVar.M(parcel.readByte() != 0);
            eVar.P(parcel.readString());
            return eVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i9) {
            return new e[i9];
        }
    }

    public String O() {
        return this.f40463j;
    }

    public void P(String str) {
        this.f40463j = str;
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
        parcel.writeString(O());
    }
}
