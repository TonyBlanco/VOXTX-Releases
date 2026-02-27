package h8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: h8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1868a implements Parcelable {
    public static final Parcelable.Creator<C1868a> CREATOR = new C0342a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41704a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f41706d;

    /* JADX INFO: renamed from: h8.a$a, reason: collision with other inner class name */
    public class C0342a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1868a createFromParcel(Parcel parcel) {
            return new C1868a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1868a[] newArray(int i9) {
            return new C1868a[i9];
        }
    }

    public C1868a(Parcel parcel) {
        this.f41704a = parcel.readString();
        this.f41705c = parcel.readString();
        this.f41706d = parcel.readInt() != 0;
    }

    public C1868a(String str, String str2, boolean z9, String str3) {
        this.f41704a = str;
        this.f41705c = str2;
        this.f41706d = z9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f41704a);
        parcel.writeString(this.f41705c);
        parcel.writeInt(this.f41706d ? 0 : 1);
    }
}
