package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: e7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1748b implements Parcelable {
    public static final Parcelable.Creator<C1748b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f40450a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f40451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f40452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f40454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f40455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f40457i;

    /* JADX INFO: renamed from: e7.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1748b createFromParcel(Parcel parcel) {
            C1748b c1748b = new C1748b();
            c1748b.f40450a = parcel.readLong();
            c1748b.f40451c = parcel.readString();
            c1748b.f40452d = parcel.readString();
            c1748b.f40453e = parcel.readLong();
            c1748b.f40454f = parcel.readString();
            c1748b.f40455g = parcel.readString();
            c1748b.f40456h = parcel.readLong();
            c1748b.f40457i = parcel.readByte() != 0;
            return c1748b;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1748b[] newArray(int i9) {
            return new C1748b[i9];
        }
    }

    public long A() {
        return this.f40453e;
    }

    public boolean C() {
        return this.f40457i;
    }

    public void G(String str) {
        this.f40454f = str;
    }

    public void H(String str) {
        this.f40455g = str;
    }

    public void I(long j9) {
        this.f40456h = j9;
    }

    public void J(long j9) {
        this.f40450a = j9;
    }

    public void K(String str) {
        this.f40451c = str;
    }

    public void L(String str) {
        this.f40452d = str;
    }

    public void M(boolean z9) {
        this.f40457i = z9;
    }

    public void N(long j9) {
        this.f40453e = j9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1748b) {
            return this.f40452d.equals(((C1748b) obj).f40452d);
        }
        return false;
    }

    public int hashCode() {
        return this.f40452d.hashCode();
    }

    public String m() {
        return this.f40454f;
    }

    public String r() {
        return this.f40455g;
    }

    public long t() {
        return this.f40456h;
    }

    public long v() {
        return this.f40450a;
    }

    public String w() {
        return this.f40451c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f40450a);
        parcel.writeString(this.f40451c);
        parcel.writeString(this.f40452d);
        parcel.writeLong(this.f40453e);
        parcel.writeString(this.f40454f);
        parcel.writeString(this.f40455g);
        parcel.writeLong(this.f40456h);
        parcel.writeByte(this.f40457i ? (byte) 1 : (byte) 0);
    }

    public String x() {
        return this.f40452d;
    }
}
