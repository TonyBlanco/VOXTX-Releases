package R2;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import q3.AbstractC2541b;
import q3.C2540a;
import w5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements C2540a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0113a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8590a;

    /* JADX INFO: renamed from: R2.a$a, reason: collision with other inner class name */
    public class C0113a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i9) {
            return new a[i9];
        }
    }

    public a(long j9) {
        this.f8590a = j9;
    }

    public a(Parcel parcel) {
        this.f8590a = parcel.readLong();
    }

    public /* synthetic */ a(Parcel parcel, C0113a c0113a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f8590a == ((a) obj).f8590a;
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
        return h.b(this.f8590a);
    }

    @Override // q3.C2540a.b
    public /* synthetic */ void populateMediaMetadata(R0.b bVar) {
        AbstractC2541b.c(this, bVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Creation time: ");
        long j9 = this.f8590a;
        sb.append(j9 == -2082844800000L ? "unset" : Long.valueOf(j9));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f8590a);
    }
}
