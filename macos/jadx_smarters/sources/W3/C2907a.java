package w3;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;
import java.util.Arrays;
import q3.AbstractC2541b;
import q3.C2540a;

/* JADX INFO: renamed from: w3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2907a implements C2540a.b {
    public static final Parcelable.Creator<C2907a> CREATOR = new C0476a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51596a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f51597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51599e;

    /* JADX INFO: renamed from: w3.a$a, reason: collision with other inner class name */
    public class C0476a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2907a createFromParcel(Parcel parcel) {
            return new C2907a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2907a[] newArray(int i9) {
            return new C2907a[i9];
        }
    }

    public C2907a(Parcel parcel) {
        this.f51596a = (String) k0.j(parcel.readString());
        this.f51597c = (byte[]) k0.j(parcel.createByteArray());
        this.f51598d = parcel.readInt();
        this.f51599e = parcel.readInt();
    }

    public /* synthetic */ C2907a(Parcel parcel, C0476a c0476a) {
        this(parcel);
    }

    public C2907a(String str, byte[] bArr, int i9, int i10) {
        this.f51596a = str;
        this.f51597c = bArr;
        this.f51598d = i9;
        this.f51599e = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2907a.class != obj.getClass()) {
            return false;
        }
        C2907a c2907a = (C2907a) obj;
        return this.f51596a.equals(c2907a.f51596a) && Arrays.equals(this.f51597c, c2907a.f51597c) && this.f51598d == c2907a.f51598d && this.f51599e == c2907a.f51599e;
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
        return ((((((527 + this.f51596a.hashCode()) * 31) + Arrays.hashCode(this.f51597c)) * 31) + this.f51598d) * 31) + this.f51599e;
    }

    @Override // q3.C2540a.b
    public /* synthetic */ void populateMediaMetadata(R0.b bVar) {
        AbstractC2541b.c(this, bVar);
    }

    public String toString() {
        int i9 = this.f51599e;
        return "mdta: key=" + this.f51596a + ", value=" + (i9 != 1 ? i9 != 23 ? i9 != 67 ? k0.r1(this.f51597c) : String.valueOf(k0.s1(this.f51597c)) : String.valueOf(k0.q1(this.f51597c)) : k0.E(this.f51597c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f51596a);
        parcel.writeByteArray(this.f51597c);
        parcel.writeInt(this.f51598d);
        parcel.writeInt(this.f51599e);
    }
}
