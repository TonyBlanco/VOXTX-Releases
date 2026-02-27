package q3;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: q3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2540a implements Parcelable {
    public static final Parcelable.Creator<C2540a> CREATOR = new C0414a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b[] f46818a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46819c;

    /* JADX INFO: renamed from: q3.a$a, reason: collision with other inner class name */
    public class C0414a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2540a createFromParcel(Parcel parcel) {
            return new C2540a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2540a[] newArray(int i9) {
            return new C2540a[i9];
        }
    }

    /* JADX INFO: renamed from: q3.a$b */
    public interface b extends Parcelable {
        byte[] getWrappedMetadataBytes();

        C0936z0 getWrappedMetadataFormat();

        void populateMediaMetadata(R0.b bVar);
    }

    public C2540a(long j9, List list) {
        this(j9, (b[]) list.toArray(new b[0]));
    }

    public C2540a(long j9, b... bVarArr) {
        this.f46819c = j9;
        this.f46818a = bVarArr;
    }

    public C2540a(Parcel parcel) {
        this.f46818a = new b[parcel.readInt()];
        int i9 = 0;
        while (true) {
            b[] bVarArr = this.f46818a;
            if (i9 >= bVarArr.length) {
                this.f46819c = parcel.readLong();
                return;
            } else {
                bVarArr[i9] = (b) parcel.readParcelable(b.class.getClassLoader());
                i9++;
            }
        }
    }

    public C2540a(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public C2540a(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public C2540a a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new C2540a(this.f46819c, (b[]) k0.T0(this.f46818a, bVarArr));
    }

    public C2540a c(C2540a c2540a) {
        return c2540a == null ? this : a(c2540a.f46818a);
    }

    public C2540a d(long j9) {
        return this.f46819c == j9 ? this : new C2540a(j9, this.f46818a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i9) {
        return this.f46818a[i9];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2540a.class != obj.getClass()) {
            return false;
        }
        C2540a c2540a = (C2540a) obj;
        return Arrays.equals(this.f46818a, c2540a.f46818a) && this.f46819c == c2540a.f46819c;
    }

    public int f() {
        return this.f46818a.length;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f46818a) * 31) + w5.h.b(this.f46819c);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.f46818a));
        if (this.f46819c == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f46819c;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f46818a.length);
        for (b bVar : this.f46818a) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f46819c);
    }
}
