package w3;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import q3.AbstractC2541b;
import q3.C2540a;
import w5.AbstractC2932d;

/* JADX INFO: renamed from: w3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2911e implements C2540a.b {
    public static final Parcelable.Creator<C2911e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f51610a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51611c;

    /* JADX INFO: renamed from: w3.e$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2911e createFromParcel(Parcel parcel) {
            return new C2911e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2911e[] newArray(int i9) {
            return new C2911e[i9];
        }
    }

    public C2911e(float f9, int i9) {
        this.f51610a = f9;
        this.f51611c = i9;
    }

    public C2911e(Parcel parcel) {
        this.f51610a = parcel.readFloat();
        this.f51611c = parcel.readInt();
    }

    public /* synthetic */ C2911e(Parcel parcel, a aVar) {
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
        if (obj == null || C2911e.class != obj.getClass()) {
            return false;
        }
        C2911e c2911e = (C2911e) obj;
        return this.f51610a == c2911e.f51610a && this.f51611c == c2911e.f51611c;
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
        return ((527 + AbstractC2932d.a(this.f51610a)) * 31) + this.f51611c;
    }

    @Override // q3.C2540a.b
    public /* synthetic */ void populateMediaMetadata(R0.b bVar) {
        AbstractC2541b.c(this, bVar);
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f51610a + ", svcTemporalLayerCount=" + this.f51611c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeFloat(this.f51610a);
        parcel.writeInt(this.f51611c);
    }
}
