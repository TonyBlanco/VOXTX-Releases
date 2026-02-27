package R2;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import d4.AbstractC1684a;
import q3.AbstractC2541b;
import q3.C2540a;
import w5.AbstractC2932d;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements C2540a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8591a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8592c;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i9) {
            return new b[i9];
        }
    }

    public b(float f9, float f10) {
        AbstractC1684a.b(f9 >= -90.0f && f9 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f, "Invalid latitude or longitude");
        this.f8591a = f9;
        this.f8592c = f10;
    }

    public b(Parcel parcel) {
        this.f8591a = parcel.readFloat();
        this.f8592c = parcel.readFloat();
    }

    public /* synthetic */ b(Parcel parcel, a aVar) {
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8591a == bVar.f8591a && this.f8592c == bVar.f8592c;
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
        return ((527 + AbstractC2932d.a(this.f8591a)) * 31) + AbstractC2932d.a(this.f8592c);
    }

    @Override // q3.C2540a.b
    public /* synthetic */ void populateMediaMetadata(R0.b bVar) {
        AbstractC2541b.c(this, bVar);
    }

    public String toString() {
        return "xyz: latitude=" + this.f8591a + ", longitude=" + this.f8592c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeFloat(this.f8591a);
        parcel.writeFloat(this.f8592c);
    }
}
