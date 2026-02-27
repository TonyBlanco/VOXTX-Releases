package r3;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import d4.AbstractC1684a;
import q3.AbstractC2541b;
import q3.C2540a;

/* JADX INFO: renamed from: r3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2658a implements C2540a.b {
    public static final Parcelable.Creator<C2658a> CREATOR = new C0431a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49694a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49695c;

    /* JADX INFO: renamed from: r3.a$a, reason: collision with other inner class name */
    public class C0431a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2658a createFromParcel(Parcel parcel) {
            return new C2658a(parcel.readInt(), (String) AbstractC1684a.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2658a[] newArray(int i9) {
            return new C2658a[i9];
        }
    }

    public C2658a(int i9, String str) {
        this.f49694a = i9;
        this.f49695c = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // q3.C2540a.b
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return AbstractC2541b.a(this);
    }

    @Override // q3.C2540a.b
    public /* synthetic */ C0936z0 getWrappedMetadataFormat() {
        return AbstractC2541b.b(this);
    }

    @Override // q3.C2540a.b
    public /* synthetic */ void populateMediaMetadata(R0.b bVar) {
        AbstractC2541b.c(this, bVar);
    }

    public String toString() {
        return "Ait(controlCode=" + this.f49694a + ",url=" + this.f49695c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f49695c);
        parcel.writeInt(this.f49694a);
    }
}
