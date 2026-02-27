package v3;

import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f51323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f51324g;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i9) {
            return new k[i9];
        }
    }

    public k(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f51320c = i9;
        this.f51321d = i10;
        this.f51322e = i11;
        this.f51323f = iArr;
        this.f51324g = iArr2;
    }

    public k(Parcel parcel) {
        super("MLLT");
        this.f51320c = parcel.readInt();
        this.f51321d = parcel.readInt();
        this.f51322e = parcel.readInt();
        this.f51323f = (int[]) k0.j(parcel.createIntArray());
        this.f51324g = (int[]) k0.j(parcel.createIntArray());
    }

    @Override // v3.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f51320c == kVar.f51320c && this.f51321d == kVar.f51321d && this.f51322e == kVar.f51322e && Arrays.equals(this.f51323f, kVar.f51323f) && Arrays.equals(this.f51324g, kVar.f51324g);
    }

    public int hashCode() {
        return ((((((((527 + this.f51320c) * 31) + this.f51321d) * 31) + this.f51322e) * 31) + Arrays.hashCode(this.f51323f)) * 31) + Arrays.hashCode(this.f51324g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f51320c);
        parcel.writeInt(this.f51321d);
        parcel.writeInt(this.f51322e);
        parcel.writeIntArray(this.f51323f);
        parcel.writeIntArray(this.f51324g);
    }
}
