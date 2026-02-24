package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class f extends C1748b implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f40464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f40465k;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            f fVar = new f();
            fVar.J(parcel.readLong());
            fVar.K(parcel.readString());
            fVar.L(parcel.readString());
            fVar.N(parcel.readLong());
            fVar.G(parcel.readString());
            fVar.H(parcel.readString());
            fVar.I(parcel.readLong());
            fVar.M(parcel.readByte() != 0);
            fVar.Q(parcel.readLong());
            fVar.R(parcel.readString());
            return fVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i9) {
            return new f[i9];
        }
    }

    public long O() {
        return this.f40464j;
    }

    public String P() {
        return this.f40465k;
    }

    public void Q(long j9) {
        this.f40464j = j9;
    }

    public void R(String str) {
        this.f40465k = str;
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
        parcel.writeString(P());
    }
}
