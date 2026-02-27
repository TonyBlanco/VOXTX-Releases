package z3;

import O2.InterfaceC0901n;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.services.s3.model.InstructionFileId;
import d4.k0;

/* JADX INFO: renamed from: z3.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3028H implements Comparable, Parcelable, InterfaceC0901n {
    public static final Parcelable.Creator<C3028H> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52697e = k0.A0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52698f = k0.A0(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52699g = k0.A0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52700a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52702d;

    /* JADX INFO: renamed from: z3.H$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3028H createFromParcel(Parcel parcel) {
            return new C3028H(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3028H[] newArray(int i9) {
            return new C3028H[i9];
        }
    }

    public C3028H(int i9, int i10) {
        this(0, i9, i10);
    }

    public C3028H(int i9, int i10, int i11) {
        this.f52700a = i9;
        this.f52701c = i10;
        this.f52702d = i11;
    }

    public C3028H(Parcel parcel) {
        this.f52700a = parcel.readInt();
        this.f52701c = parcel.readInt();
        this.f52702d = parcel.readInt();
    }

    public static C3028H c(Bundle bundle) {
        return new C3028H(bundle.getInt(f52697e, 0), bundle.getInt(f52698f, 0), bundle.getInt(f52699g, 0));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C3028H c3028h) {
        int i9 = this.f52700a - c3028h.f52700a;
        if (i9 != 0) {
            return i9;
        }
        int i10 = this.f52701c - c3028h.f52701c;
        return i10 == 0 ? this.f52702d - c3028h.f52702d : i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3028H.class != obj.getClass()) {
            return false;
        }
        C3028H c3028h = (C3028H) obj;
        return this.f52700a == c3028h.f52700a && this.f52701c == c3028h.f52701c && this.f52702d == c3028h.f52702d;
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        int i9 = this.f52700a;
        if (i9 != 0) {
            bundle.putInt(f52697e, i9);
        }
        int i10 = this.f52701c;
        if (i10 != 0) {
            bundle.putInt(f52698f, i10);
        }
        int i11 = this.f52702d;
        if (i11 != 0) {
            bundle.putInt(f52699g, i11);
        }
        return bundle;
    }

    public int hashCode() {
        return (((this.f52700a * 31) + this.f52701c) * 31) + this.f52702d;
    }

    public String toString() {
        return this.f52700a + InstructionFileId.DOT + this.f52701c + InstructionFileId.DOT + this.f52702d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f52700a);
        parcel.writeInt(this.f52701c);
        parcel.writeInt(this.f52702d);
    }
}
